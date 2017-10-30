<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.orgbus.common.valueobj.OrgBusVO"%>
<%@page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@page import="com.regaltec.common.util.Constant"%>
<%@page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String objectId = request.getParameter("id");
	String businessId=request.getParameter("businessId");
	if (objectId == null || objectId.equals("0"))
		objectId = "";
   
	PrintWriter printOut = response.getWriter();
	StringBuilder builder = new StringBuilder();
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
			
		//��ȡ��ǰ��¼�û�����
		UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
			UserVO userVO = null;
		if(loginBean!=null){
			userVO = loginBean.getCurrentUser();
		}

		
		Hashtable hashtable = new Hashtable();
		String orgid="";
		if(objectId.length()>2){
		  orgid=objectId.substring(2);
		}
		hashtable.put("orgid", orgid);
		hashtable.put("businessId", businessId);
			if(userVO!=null){
			hashtable.put("user", userVO);
		}		
		hashtable.put("rightFactorCode", Constant.RIGHTFACTOR_CODE_ORG);
		hashtable.put("currentThread", Thread.currentThread().getName());;
		hashtable.put("ServletContext",sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_orgBusBI", "selectNextObject", hashtable);
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
			orgTreeList = (List) retHashtable.get("selectNextObject");
			if (orgTreeList != null){
				int k = 0;
			    for (int i=0;i<orgTreeList.size();i++) {
			    	OrgBusVO vo = (OrgBusVO)orgTreeList.get(i);
			    	k++;
				 	builder.append("<item text=\"");
					builder.append(vo.getObjectName());
					builder.append("\" id=\"");
					builder.append("N_"+vo.getObjectId());
					builder.append("\" ");
					builder.append(" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" ");
					
					/*�ж��Ƿ�ΪҶ�ӽڵ�,���Ϊ��Ҷ�ӽ��������Ľڵ���ʾ��"+"�ŵ�ͼ��,������ʾ"-"ͼ��*/
					if( "Y".equalsIgnoreCase(vo.getIsleaf()) )
					{
					    builder.append(" child = \"0\" ");
					}else{
					    builder.append(" child = \"1\" ");
					}
					//if( "2".equalsIgnoreCase(vo.getObjecttypeid())|| "1".equalsIgnoreCase(vo.getObjecttypeid()) ){
					if(k==1 && objectId.equals("")){
					   builder.append(" select = \"1\" ");
					   builder.append(" call = \"1\" ");
					   builder.append(" open = \"1\" "); 
					}
					
					builder.append(" >\n");							
					
					builder.append("<userdata name=\"objectTypeId\">");
					builder.append("<![CDATA[");
					builder.append(vo.getObjectTypeId());
					builder.append("]]>");
					builder.append("</userdata>\n");
					
					builder.append("<userdata name=\"isLeaf\">");
					builder.append("<![CDATA[");
					builder.append(vo.getIsleaf());
					builder.append("]]>");
					builder.append("</userdata>\n");
					
					
					builder.append("</item>\n");
				}	
		  	}
	 	}

	 	if ((orgTreeList == null ||  orgTreeList.size() == 0 ) && (objectId == null || objectId.equalsIgnoreCase("") ) ){
	    	builder.append("<item text=\"��������������\" id=\"null\" />");
	 	}
	 	builder.append("</tree>\n");
	 	System.out.print(builder.toString());
	}catch (Exception e) {
		e.printStackTrace();
	}finally{
	    
		printOut.write(builder.toString());
		printOut.close();
	}
%>

