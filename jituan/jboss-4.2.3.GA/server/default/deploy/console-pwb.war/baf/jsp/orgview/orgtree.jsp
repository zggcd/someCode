<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.framework.bp.BusinessDelegateImpl"%>
<%@ page import="com.regaltec.baf.org.organization.common.valueobj.OrgTreeVO"%>
<%@page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@page import="com.regaltec.common.util.Constant"%>
<%@page import="com.regaltec.baf.ui.UIDataHandler"%>
<%@page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String businessId = request.getParameter("businessid");
	String objectId = request.getParameter("id");
	Hashtable retHashtable  = null;
	
	if (businessId == null)
		businessId = "";
	if (objectId == null || objectId.equals("0"))
		objectId = "";
	
	PrintWriter printOut = response.getWriter();
	StringBuilder builder = new StringBuilder();
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
	    if( businessId != null && !businessId.equals(""))
		{
			//��ȡ��ǰ��¼�û�����
			UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
			UserVO userVO = null;
			if(loginBean!=null){
				userVO = loginBean.getCurrentUser();
			}
			Hashtable hashtable = new Hashtable();
			hashtable.put("orgid", objectId);	
			if(userVO!=null){
				hashtable.put("user", userVO);
			}		
			hashtable.put("rightFactorCode", Constant.RIGHTFACTOR_CODE_ORG);
			hashtable.put("currentThread", Thread.currentThread().getName());
			hashtable.put("ServletContext", sc);
		    retHashtable = (Hashtable) business.invoke("baf_organizationBI", "selectNextChildObject", hashtable);
		}
		List orgTreeList = null;
			
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id=\"");
		/*�����ѯ�ڵ����objectIdΪ��,����Ϊ��ѯ���Ķ���,��ʱxml��tree id����ӦΪ0,����ΪobjectId*/
		if(objectId == null ||  "".equals(objectId)){
		   builder.append("0");
		}
		else{
		   builder.append(objectId);
		}
		builder.append("\">\n");
		if (retHashtable != null){
			orgTreeList = (List) retHashtable.get("selectNextChildObject");
			if (orgTreeList != null){
				int k = 0;
			    for (int i=0;i<orgTreeList.size();i++) {
			    	OrgTreeVO vo = (OrgTreeVO)orgTreeList.get(i);
			    	k++;
				 	builder.append("<item text=\"");
					builder.append(vo.getObjectname());
					builder.append("\" id=\"");
					builder.append(vo.getObjectid());
					builder.append("\" ");
					if(  "O".equalsIgnoreCase(vo.getObjectcategory()))
					{
					   builder.append(" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" ");
					}
					else if(  "P".equalsIgnoreCase(vo.getObjectcategory()))
					{
					   builder.append(" im0 =\"position.gif\" im1 =\"position.gif\" im2=\"position.gif\" ");
					}
					else if( "E".equalsIgnoreCase(vo.getObjectcategory()))
					{
					    builder.append(" im0 =\"person.gif\" im1 =\"person.gif\" im2=\"person.gif\" ");
					}
					
					/*�ж��Ƿ�ΪҶ�ӽڵ�,���Ϊ��Ҷ�ӽ��������Ľڵ���ʾ��"+"�ŵ�ͼ��,������ʾ"-"ͼ��*/
					if( "Y".equalsIgnoreCase(vo.getIsleaf()) )
					{
					    builder.append(" child = \"0\" ");
					}else{
					    builder.append(" child = \"1\" ");
					}
					if(k==1 && objectId.equals("")){
					   //builder.append(" select = \"1\" ");
					  //builder.append(" call = \"1\" ");
					   builder.append(" open = \"1\" "); 
					}
					//�ж��Ƿ��Ѿ�����ѡ
					Hashtable param = new Hashtable();
					param.put("objectid", vo.getObjectid());
					param.put("objecttype", vo.getObjectcategory());
					param.put("businessid", businessId);
					param.put("ServletContext", sc);
					Hashtable retHash = (Hashtable) business.invoke("baf_businessBI", "queryBusinessRel", param);
					if (retHash != null) {
						Object o = retHash.get("queryBusinessRel");
						int count = Integer.parseInt(o.toString());
						if (count > 0) {
							builder.append(" checked = \"1\" ");
						}
					}
					
					builder.append(" >\n");
						
					builder.append("<userdata name=\"objectTypeID\">");
					builder.append("<![CDATA[");
					builder.append(vo.getObjecttypeid());
					builder.append("]]>");
					builder.append("</userdata>\n");
												
					builder.append("<userdata name=\"objectCategory\">");
					builder.append("<![CDATA[");
					builder.append(vo.getObjectcategory());
					builder.append("]]>");
					builder.append("</userdata>\n");
						
					builder.append("</item>\n");
				}	
		  	}
	 	}
	 	builder.append("</tree>\n");
	}catch (Exception e) {
		e.printStackTrace();
	}finally{
		printOut.write(builder.toString());
		printOut.close();
	}
%>

