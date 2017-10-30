<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.org.organization.common.valueobj.OrgTreeVO"%>
<%@ page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%@ page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String businessId = request.getParameter("businessid");
	String objectId = request.getParameter("id");
		//��ȡ�û�����
	UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
	UserVO userVO = null;
	if(loginBean!=null){
		userVO = loginBean.getCurrentUser();
	}
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

		Hashtable hashtable = new Hashtable();
		hashtable.put("parentId", objectId); //������ID		
		hashtable.put("rightFactorCode", "IDR_PUB_BULLETIN_UNIT"); //��֯���������ͣ�����������ȣ�Oֻ�鵥λ��OP�鵥λ�͸�λ��OE�鵥λ����Ա��OPE�����У�
		hashtable.put("currentThread", Thread.currentThread().getName());
		hashtable.put("userId",userVO.getUserId());
		hashtable.put("loginName",userVO.getLoginName());
		hashtable.put("ServletContext", sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_bulletinBI", "getReceiverOrgWithRight", hashtable);
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
			orgTreeList = (List) retHashtable.get("getReceiverOrgWithRight");
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

					builder.append(" >\n");
						
					builder.append("<userdata name=\"objectid\">");
					builder.append("<![CDATA[");
					builder.append(vo.getObjectid());
					builder.append("]]>");
					builder.append("</userdata>\n");
												
					builder.append("<userdata name=\"objectCategory\">");
					builder.append("<![CDATA[");
					builder.append(vo.getObjectcategory());
					builder.append("]]>");
					builder.append("</userdata>\n");
					
					builder.append("<userdata name=\"objName\">");
					builder.append("<![CDATA[");
					builder.append(vo.getObjectname());
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

