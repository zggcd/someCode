<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.rig.right.common.valueobj.OperateRightVO"%>
<%@page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@page import="com.regaltec.baf.rig.group.common.valueobj.OperateGroupRightVO"%>
<%@ page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	
	String rightId = request.getParameter("id");
	if (rightId == null || rightId.equals("0")){
		rightId = "";
	}
	
	PrintWriter printOut = response.getWriter();
	StringBuilder builder = new StringBuilder();
	String objectCheckState = request.getParameter("checkstate");   //当前展开节点复选框状态
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");		
		
		//查询操作权限组所拥有的权限项
		String groupid = "";
		if(request.getParameter("groupid")!=null){
			groupid = request.getParameter("groupid");
			session.removeAttribute("groupid");
		}else{
			groupid = session.getAttribute("groupid").toString();
		}	
		session.setAttribute("groupid",groupid);

		Hashtable hashtable = new Hashtable();
		//从session中获取当前登录用户对象
		UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
		UserVO userVO = null;
		if(loginBean!=null){
			userVO = loginBean.getCurrentUser();
		}
		if(userVO!=null){			
			hashtable.put("user",userVO);
		}
		hashtable.put("groupId",groupid);
		hashtable.put("parentRightId", rightId);
		hashtable.put("currentThread", Thread.currentThread().getName());
		hashtable.put("ServletContext", sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_operateRightBI", "getChildren", hashtable);
		List rightList = null;
		
		//查询权限组所拥有的操作权限，用于展开操作权限树节点时来进行对父节点的判断，决定是否让子节点都选中
		Hashtable operHahstable = (Hashtable) business.invoke("baf_groupRightBI", "getGroupRightByGroupId", hashtable);
		List operList = null;
		if(operHahstable!=null){
			operList = (List)operHahstable.get("getGroupRightByGroupId");
		}
		Hashtable operIdHash = new Hashtable();
		if(operList!=null){
			for(int i=0;i<operList.size();i++){
				OperateGroupRightVO vo = (OperateGroupRightVO)operList.get(i);
				operIdHash.put(vo.getRightId(),vo.getRightId());
			}
		}
			
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id=\"");
		
		//如果rightId为空,则查询树的顶点，tree的id为0,否则为rightId
		if(rightId == null ||  "".equals(rightId)){
		   builder.append("0");
		}else{
		   builder.append(rightId);
		}	
		
		List existList = null;
		
		builder.append("\">\n");
		if (retHashtable != null){
			rightList = (List) retHashtable.get("getChildren");
			
			if (rightList != null){
			    for(int i=0;i<rightList.size();i++) {
			    	OperateRightVO vo = (OperateRightVO)rightList.get(i);
			    	String id = vo.getRightId();
				 	builder.append("<item text=\"");
					builder.append(vo.getRightName());
					builder.append("\" id=\"");
					builder.append(id);
					builder.append("\" ");
					
					//判断是否是叶子节点
					if("Y".equalsIgnoreCase(vo.getIsLeaf())){
					    builder.append(" child = \"0\" ");
					}else{
					    builder.append(" child = \"1\" ");
					}
					
					if(rightId.equals("")){
						//判断是否选中复选框
						if("Y".equals(vo.getIsSelect())){
							builder.append(" checked = \"1\" ");						
						}
					}else{
						if(objectCheckState!=null && objectCheckState.equals("1")){
							if(operIdHash.containsKey(rightId)){
								if("Y".equals(vo.getIsSelect())){
									builder.append(" checked = \"1\" ");
								}
							}else{
								builder.append(" checked = \"1\" ");
							}
						}	
					}		
					
					String rightType = vo.getRightType();
					if("M".equalsIgnoreCase(rightType)){
						builder.append(" im0 =\"book_titel.gif\" im1 =\"book_titel.gif\" im2=\"book_titel.gif\" ");
					}else if("E".equalsIgnoreCase(rightType)){
						builder.append(" im0 =\"book.gif\" im1 =\"book.gif\" im2=\"book.gif\" ");
					}else if("O".equalsIgnoreCase(rightType)){
						builder.append(" im0 =\"magazines_open.gif\" im1 =\"magazines_open.gif\" im2=\"magazines_open.gif\" ");
					}
					
					builder.append(" tooltip=\"");
					builder.append(vo.getRightName());
					builder.append("\" >\n");
					
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

