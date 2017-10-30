<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.rig.right.common.valueobj.OperateRightVO"%>
<%@page import="com.regaltec.baf.rig.group.common.valueobj.OperateGroupVO"%>
<%@page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@ page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%@page import="com.regaltec.baf.rig.authorize.common.valueobj.OperateAuthorizeVO"%>
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
	String postId = "";
	if(request.getParameter("postId")!=null){
		postId = request.getParameter("postId");
	}
	
	PrintWriter printOut = response.getWriter();
	StringBuilder builder = new StringBuilder();
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
		
		//从session中获取当前登录用户对象
		UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
		UserVO userVO = null;
		if(loginBean!=null){
			userVO = loginBean.getCurrentUser();
		}
		Hashtable hashtable = new Hashtable();
		String groupId = "";   //权限组ID
		if(!objectId.equals("") && objectId.indexOf("#")==-1){
			groupId = objectId;
		}else{
			if(!objectId.equals("")){
				String[] temp = objectId.split("#");
				hashtable.put("parentRightId", temp[0]);
				groupId = temp[1];
			}			
		}
		hashtable.put("groupId", groupId);		
		if(userVO!=null){
			hashtable.put("currentUser",userVO);
		}	
		OperateAuthorizeVO operateAuthorize = new OperateAuthorizeVO();
		if( postId != null) {
			operateAuthorize.setObjectId(postId);
	    }
		operateAuthorize.setObjectCategory(Constant.CATEGORY_P);
		hashtable.put("currentThread", Thread.currentThread().getName());
		hashtable.put("operateAuthorize", operateAuthorize);
		hashtable.put("ServletContext", sc);
		String beanMethod = "";
		String beanId = "";
		if(request.getParameter("groupId")==null){
			beanId = "baf_operateGroupBI";
			beanMethod = "getAllOperateGroupByUser";
		}else{
			beanId = "baf_operateRightBI";
			beanMethod = "getChildrenByGroupId";
			hashtable.put("isLeaf","Y");
		}
		Hashtable retHashtable = (Hashtable) business.invoke(beanId, beanMethod, hashtable);
		List rightList = null;
		List groupList = null;
		Hashtable selectIds = new Hashtable();
		if(request.getParameter("groupId")==null){
			Hashtable table = (Hashtable) business.invoke("baf_operateGroupBI", "getObjAuthOperateGroup", hashtable);
			List listY = null;
			if(table!=null){
				listY = (List)table.get("getObjAuthOperateGroup");
			}
			if(listY!=null && listY.size()>0){
				for(int i=0;i<listY.size();i++){
					OperateGroupVO vo = (OperateGroupVO)listY.get(i);
					selectIds.put(vo.getGroupId(),vo.getGroupId());
				}
			}
		}
			
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id=\"");
		
		//如果rightId为空,则查询树的顶点，tree的id为0,否则为rightId
		if(objectId == null ||  "".equals(objectId)){
		   	builder.append("0");
		}else{
			builder.append(objectId);
		}		
		builder.append("\">\n");		
		if (retHashtable != null){
			//获取系统参数中配置的“本地网权限组管理员”的ID
			String nativenetGroupId = StringHelper.convertStringNull(request.getParameter("nativenetGroupId"));
			if(request.getParameter("groupId")==null){		
				groupList = (List) retHashtable.get(beanMethod);					
				if (groupList != null){
				    for (int i=0;i<groupList.size();i++) {
				    	OperateGroupVO vo = (OperateGroupVO)groupList.get(i);
				    	String groupCode = StringHelper.convertStringNull(vo.getGroupCode());
			    		String id = vo.getGroupId();
				    	if(groupCode.equals(Constant.GROUP_CODE_ADMIN) || nativenetGroupId.equals(id)){
				    		
				    	}else{
						 	builder.append("<item text=\"");
							builder.append(vo.getGroupName());
							builder.append("\" id=\"");
							builder.append(id);
							builder.append("\" ");				
							if(i==0){
								//builder.append(" open=\"1\" call=\"1\" select=\"1\" ");
							}
							if(selectIds.containsKey(id)){
								builder.append(" checked = \"1\" ");		
							}
							builder.append(" im0 =\"box.gif\" im1 =\"box.gif\" im2=\"box.gif\" ");
							String isLeaf = StringHelper.convertStringNull(vo.getIsLeaf());
							if(isLeaf.equals("N") && !vo.getGroupCode().equals(Constant.GROUP_CODE_ADMIN)){
								builder.append(" child = \"1\" ");
							}						
							builder.append(" tooltip=\"");
							builder.append(vo.getGroupName());
							builder.append("\" >\n");						
							builder.append("</item>\n");	
				    	}
					}					
			  	}
			}else{
				rightList = (List) retHashtable.get(beanMethod);			
				if (rightList != null){
				    for (int i=0;i<rightList.size();i++) {
				    	OperateRightVO vo = (OperateRightVO)rightList.get(i);
				    	String id = vo.getRightId();
					 	builder.append("<item text=\"");
						builder.append(vo.getRightName());
						builder.append("\" id=\"");
						builder.append(id);
						builder.append("#"+groupId);		
						builder.append("\" im0 =\"book_titel.gif\" im1 =\"book_titel.gif\" im2=\"book_titel.gif\" ");
						String isLeaf = StringHelper.convertStringNull(vo.getIsLeaf());
						if(isLeaf.equals("N")){
							builder.append(" child = \"1\" ");
						}
						builder.append(" tooltip=\"");
						builder.append(vo.getRightName());
						builder.append("\" nocheckbox = \"1\" ");
						builder.append(">\n");
						builder.append("</item>\n");				
						
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

