<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@page import="com.regaltec.common.util.StringHelper"%>
<%@page import="com.regaltec.baf.rig.group.common.valueobj.OperateGroupViewVO"%>
<%@page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%@page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	
	//��ȡչ���Ľڵ�ID
	String objectId = request.getParameter("id");
	if (objectId == null || objectId.equals("0")){
		objectId = "";
	}
	PrintWriter printOut = response.getWriter();
	StringBuilder builder = new StringBuilder();
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
				
		//��ȡȨ����ID
		String groupId = StringHelper.convertStringNull(request.getParameter("groupId"));
		
		Hashtable hashtable = new Hashtable();
		hashtable.put("groupId", groupId);
		if(objectId != null && !"".equals(objectId)){
		   hashtable.put("objectCategory",objectId);
		}

		//��session�л�ȡ��ǰ��¼�û�����
		UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
		UserVO userVO = null;
		if(loginBean!=null){
			userVO = loginBean.getCurrentUser();
		}
		if(userVO!=null){
			hashtable.put("loginUser",userVO);
		}	
		
		hashtable.put("currentThread", Thread.currentThread().getName());
		hashtable.put("ServletContext",sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_operateGroupBI", "getOperateGroupAuthView", hashtable);
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
		String open = " open=\"true\" ";
		if (retHashtable != null){
			orgTreeList = (List) retHashtable.get("getOperateGroupAuthView");
			if (orgTreeList != null){
			    for (int i=0;i<orgTreeList.size();i++) {
			    	OperateGroupViewVO vo = (OperateGroupViewVO)orgTreeList.get(i);
			    	String objID = vo.getObjectId();
				 	builder.append("<item text=\"");
					builder.append(vo.getObjectName());
					builder.append("\" id=\"");
					builder.append(objID);
					builder.append("\" ");
					
					//���ýڵ��Ƿ���Ҷ�ӽڵ�
					if("".equalsIgnoreCase(objectId)){
						builder.append(" child = \"1\" ");
					}else{
						builder.append(" child = \"0\" ");
					}
					
					//Ĭ��չ����һ���ڵ�
					if(i == 0 && objectId.equals("")){
						builder.append(open);
					}
					
					//���ýڵ�����ͼ��
					if("O".equalsIgnoreCase(objectId) || "O".equalsIgnoreCase(objID)){
					   builder.append(" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" ");
					}else if("P".equalsIgnoreCase(objectId) || "P".equalsIgnoreCase(objID)){
					   builder.append(" im0 =\"position.gif\" im1 =\"position.gif\" im2=\"position.gif\" ");
					}else if("E".equalsIgnoreCase(objectId) || "E".equalsIgnoreCase(objID)){
					    builder.append(" im0 =\"person.gif\" im1 =\"person.gif\" im2=\"person.gif\" ");
					}
										
					builder.append(" >\n");						
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

