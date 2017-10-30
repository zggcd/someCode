<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@page import="com.regaltec.baf.rig.authorize.common.valueobj.OperateAuthPreviewVO"%>
<%@page import="com.regaltec.common.util.StringHelper"%>
<%@page import="com.regaltec.common.util.Constant"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	
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
				
		Hashtable hashtable = new Hashtable();
		
		String userId = "", unitId="", postId="";
		if(request.getParameter("userId")!=null){
			userId = StringHelper.convertStringNull(request.getParameter("userId"));
			unitId = StringHelper.convertStringNull(request.getParameter("unitId"));
			postId = StringHelper.convertStringNull(request.getParameter("postId"));
		}
		hashtable.put("userId", userId);
		hashtable.put("ServletContext", sc);
		if(userId.equals("")){	//�����û�ʱ��������֯Ȩ�������ʾΪ���û�������֯��Ȩ����
			if(!unitId.equals("")){
				hashtable.put("objectId", unitId);
				hashtable.put("objectCategory", Constant.CATEGORY_O);
			}
			if(!postId.equals("")){
				hashtable.put("objectId", postId);
				hashtable.put("objectCategory", Constant.CATEGORY_P);
			}
		}
		
		Hashtable retHashtable = (Hashtable) business.invoke("baf_operateAuthorizeBI", "getUserPreviewOperateAuth", hashtable);
		List rightList = null;
			
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id=\"");
		
		//���rightIdΪ��,���ѯ���Ķ��㣬tree��idΪ0,����ΪrightId
		if(objectId == null ||  "".equals(objectId)){
		   builder.append("0");
		}else{
		   builder.append(objectId);
		}
		
		builder.append("\">\n");
		
		int unit = 0 , unitT = 0;
		int post = 0 , postT = 0;
		int user = 0 , userT = 0;
		
		if (retHashtable != null){
			rightList = (List) retHashtable.get("getUserPreviewOperateAuth");
			
			if (rightList != null){
			    for (int i=0;i<rightList.size();i++) {
			    	OperateAuthPreviewVO vo = (OperateAuthPreviewVO)rightList.get(i);
			    	String id = vo.getRightId();
				 	String rightType = vo.getObjectType();
				 	String isLeaf = StringHelper.convertStringNull(vo.getIsLeaf());
				 	if(rightType.equals("O")){	//�����Լ���Ȩ����
				 		if(unit==0){
				 			if(post>0 || userT>0 || unitT>0 || postT>0){	//��ֹrightList�е����ݲ��ǰ���rightType����ģ������ܱ�֤ÿ��item���н�����ǩ
				 				builder.append("</item>\n");
				 			}
				 			builder.append("<item id=\"unit\" text=\"����Ȩ��\" tooltip=\"����Ȩ��\" open=\"1\" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" child=\"1\">\n");
				 		}
			 			builder.append("<item text=\""+vo.getRightName()+"\" id=\""+id+"\" "+" im0 =\"box.gif\" im1 =\"box.gif\" im2=\"box.gif\" ");
			 			if(isLeaf.equals("N")){
			 				builder.append(" child = \"1\" ");
			 			}
						builder.append(" tooltip=\""+vo.getRightName()+"\" >\n</item>\n");				 		
				 		unit++;
				 		if((unit+post+userT+postT+unitT)==rightList.size()){
				 			builder.append("</item>\n");
				 		}				 		
				 	}else if(rightType.equals("OT")){	//������ʹ��ģ���Ȩ����
				 		if(unitT==0){
				 			if(post>0 || userT>0 || unit>0 || postT>0){
				 				builder.append("</item>\n");
				 			}
				 			builder.append("<item id=\"unitT\" text=\"����ģ��Ȩ��\" tooltip=\"����ģ��Ȩ��\" open=\"1\" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" child=\"1\">\n");
				 		}
			 			builder.append("<item text=\""+vo.getRightName()+"\" id=\""+id+"\" "+" im0 =\"box.gif\" im1 =\"box.gif\" im2=\"box.gif\" ");
			 			if(isLeaf.equals("N")){
			 				builder.append(" child = \"1\" ");
			 			}
						builder.append(" tooltip=\""+vo.getRightName()+"\" >\n</item>\n");				 		
				 		unitT++;
				 		if((unit+post+userT+postT+unitT)==rightList.size()){
				 			builder.append("</item>\n");
				 		}				 		
				 	}else if(rightType.equals("P")){	//��λ�Լ���Ȩ����
				 		if(post==0){
				 			if(unit>0 || userT>0 || unitT>0 || postT>0){
					 			builder.append("</item>\n");
				 			}
				 			builder.append("<item id=\"post\" text=\"��λȨ��\" tooltip=\"��λȨ��\" open=\"1\" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" child=\"1\">\n");
				 		}
			 			builder.append("<item text=\""+vo.getRightName()+"\" id=\""+id+"\" "+" im0 =\"box.gif\" im1 =\"box.gif\" im2=\"box.gif\" ");
			 			if(isLeaf.equals("N")){
			 				builder.append(" child = \"1\" ");
			 			}
						builder.append(" tooltip=\""+vo.getRightName()+"\" >\n</item>\n");
				 		post++;
				 		if((unit+post+userT+postT+unitT)==rightList.size()){
				 			builder.append("</item>\n");
				 		}
				 	}else if(rightType.equals("PT")){	//��λ��ʹ�õ�ģ���Ȩ����
				 		if(postT==0){
				 			if(unit>0 || userT>0 || unitT>0 || post>0){
					 			builder.append("</item>\n");
				 			}
				 			builder.append("<item id=\"postT\" text=\"��λģ��Ȩ��\" tooltip=\"��λģ��Ȩ��\" open=\"1\" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" child=\"1\">\n");
				 		}
			 			builder.append("<item text=\""+vo.getRightName()+"\" id=\""+id+"\" "+" im0 =\"box.gif\" im1 =\"box.gif\" im2=\"box.gif\" ");
			 			if(isLeaf.equals("N")){
			 				builder.append(" child = \"1\" ");
			 			}
						builder.append(" tooltip=\""+vo.getRightName()+"\" >\n</item>\n");
				 		postT++;
				 		if((unit+post+userT+postT+unitT)==rightList.size()){
				 			builder.append("</item>\n");
				 		}
				 	}else if(rightType.equals("E")){	//��Ա��Ȩ���飬������ʹ��ģ��ġ�Ŀǰ��Աֻ��ʾ��ʹ��ģ���Ȩ���飬���Ը���������ִ�С�
				 		String type = request.getParameter("type");
				 		if(type!=null && type.equals("3")){
				 			if(user==0){
					 			if(unit>0 || post>0){
					 				builder.append("</item>\n");
					 			}
					 			builder.append("<item id=\"user\" text=\"����Ȩ��\" tooltip=\"����Ȩ��\" open=\"1\" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" child=\"1\">\n");
					 		}
					 		if(vo.getRightType().equals("G")){
					 			builder.append("<item text=\""+vo.getRightName()+"\" id=\""+id+"\" "+" im0 =\"box.gif\" im1 =\"box.gif\" im2=\"box.gif\" ");
					 		}else{
					 			builder.append("<item text=\""+vo.getRightName()+"\" id=\""+id+"\" "+" im0 =\"book_titel.gif\" im1 =\"book_titel.gif\" im2=\"book_titel.gif\" ");
					 		}
				 			if(isLeaf.equals("N")){
				 				builder.append(" child = \"1\" ");
				 			}
							builder.append(" tooltip=\""+vo.getRightName()+"\" >\n</item>\n");
					 		user++;
					 		if((unit+post+user)==rightList.size()){
					 			builder.append("</item>\n");
					 		}
				 		}else{				 			
			 				if(unit>0 || post>0 || unitT>0 || postT>0){
				 				builder.append("</item>\n");
				 			}
			 				break;
				 		}
				 	}else if(rightType.equals("ET")){	//��Ա��ʹ��ģ���Ȩ����
			 			if(userT==0 && request.getParameter("treeCode")==null){
				 			if(unit>0 || post>0 || unitT>0 || postT>0){
				 				builder.append("</item>\n");
				 			}
				 			builder.append("<item id=\"userT\" text=\"����ģ��Ȩ��\" tooltip=\"����ģ��Ȩ��\" open=\"1\" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" child=\"1\">\n");
				 		}
				 		builder.append("<item text=\""+vo.getRightName()+"\" id=\""+id+"\" "+" im0 =\"box.gif\" im1 =\"box.gif\" im2=\"box.gif\" ");
			 			if(isLeaf.equals("N")){
			 				builder.append(" child = \"1\" ");
			 			}
						builder.append(" tooltip=\""+vo.getRightName()+"\" >\n</item>\n");
				 		userT++;
				 		if((unit+post+userT+postT+unitT)==rightList.size() && request.getParameter("treeCode")==null){
				 			builder.append("</item>\n");
				 		}
				 	}
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

