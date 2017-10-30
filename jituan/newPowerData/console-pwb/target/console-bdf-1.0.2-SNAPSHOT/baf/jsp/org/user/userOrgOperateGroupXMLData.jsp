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
		if(userId.equals("")){	//新增用户时，所属组织权限组就显示为该用户所在组织的权限组
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
		
		//如果rightId为空,则查询树的顶点，tree的id为0,否则为rightId
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
				 	if(rightType.equals("O")){	//部门自己的权限组
				 		if(unit==0){
				 			if(post>0 || userT>0 || unitT>0 || postT>0){	//防止rightList中的数据不是按照rightType排序的，这样能保证每个item都有结束标签
				 				builder.append("</item>\n");
				 			}
				 			builder.append("<item id=\"unit\" text=\"部门权限\" tooltip=\"部门权限\" open=\"1\" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" child=\"1\">\n");
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
				 	}else if(rightType.equals("OT")){	//部门所使用模板的权限组
				 		if(unitT==0){
				 			if(post>0 || userT>0 || unit>0 || postT>0){
				 				builder.append("</item>\n");
				 			}
				 			builder.append("<item id=\"unitT\" text=\"部门模板权限\" tooltip=\"部门模板权限\" open=\"1\" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" child=\"1\">\n");
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
				 	}else if(rightType.equals("P")){	//岗位自己的权限组
				 		if(post==0){
				 			if(unit>0 || userT>0 || unitT>0 || postT>0){
					 			builder.append("</item>\n");
				 			}
				 			builder.append("<item id=\"post\" text=\"岗位权限\" tooltip=\"岗位权限\" open=\"1\" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" child=\"1\">\n");
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
				 	}else if(rightType.equals("PT")){	//岗位所使用的模板的权限组
				 		if(postT==0){
				 			if(unit>0 || userT>0 || unitT>0 || post>0){
					 			builder.append("</item>\n");
				 			}
				 			builder.append("<item id=\"postT\" text=\"岗位模板权限\" tooltip=\"岗位模板权限\" open=\"1\" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" child=\"1\">\n");
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
				 	}else if(rightType.equals("E")){	//人员的权限组，包括所使用模板的【目前人员只显示所使用模板的权限组，所以该条件不会执行】
				 		String type = request.getParameter("type");
				 		if(type!=null && type.equals("3")){
				 			if(user==0){
					 			if(unit>0 || post>0){
					 				builder.append("</item>\n");
					 			}
					 			builder.append("<item id=\"user\" text=\"个人权限\" tooltip=\"个人权限\" open=\"1\" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" child=\"1\">\n");
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
				 	}else if(rightType.equals("ET")){	//人员所使用模板的权限组
			 			if(userT==0 && request.getParameter("treeCode")==null){
				 			if(unit>0 || post>0 || unitT>0 || postT>0){
				 				builder.append("</item>\n");
				 			}
				 			builder.append("<item id=\"userT\" text=\"个人模板权限\" tooltip=\"个人模板权限\" open=\"1\" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" child=\"1\">\n");
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

