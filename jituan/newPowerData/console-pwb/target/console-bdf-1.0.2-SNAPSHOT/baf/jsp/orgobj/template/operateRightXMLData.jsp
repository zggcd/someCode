<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.framework.bp.BusinessDelegateImpl"%>
<%@ page import="com.regaltec.baf.org.organization.common.valueobj.OrgTreeVO"%>
<%@page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@ page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%@page import="com.regaltec.baf.rig.right.common.valueobj.OperateRightVO"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String objectId = request.getParameter("id");	
	
	String templateID = "";
	PrintWriter printOut = response.getWriter();
	if(request.getParameter("templateID")!=null){
		templateID = request.getParameter("templateID");
	//	System.out.println("jsp templateID===="+templateID);
		session.removeAttribute("templateID");
	}else{
		templateID = session.getAttribute("templateID").toString();
	}	
	if(!"".equals(templateID)){
		String manyTempIDs="";
		int count=0;
		if(templateID != null&&!"".equals(templateID)){
			 String [] ids = templateID.split("~");
			 for(int i = 0;i < ids.length; i++){
				if(ids[i] != null&&!"".equals(ids[i])){
					manyTempIDs=manyTempIDs+ids[i]+",";
					count++;
				}
			}
	        if(count>1){
	             if(manyTempIDs.length()>1){
	            	 templateID=manyTempIDs.substring(0,manyTempIDs.length()-1); 
	             }
	        }
	    }
		session.setAttribute("templateID",templateID);
		
		StringBuilder builder = null;
		
		
		if (objectId == null || objectId.equals("0"))
			objectId = "";
		try {
			response.setContentType("text/xml; charset=GBK");
			ServletContext sc = session.getServletContext();
			WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
			IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
			//获取当前登录用户对象
			UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
			UserVO userVO = null;
			if(loginBean!=null){
				userVO = loginBean.getCurrentUser();
			} 
			Hashtable hashtable = new Hashtable();
			if(userVO!=null){
				hashtable.put("user", userVO);
			}
			hashtable.put("objectId", templateID);
			hashtable.put("parentRightId", objectId);	
			hashtable.put("objectCategory","T");
			hashtable.put("currentThread", Thread.currentThread().getName());
			hashtable.put("ServletContext", sc);
			Hashtable retHashtable = (Hashtable) business.invoke("baf_operateRightBI", "getChildrenByUser", hashtable);
			List rightTreeList = null;			
			builder = new StringBuilder();
			builder.append("<?xml version='1.0' encoding='GBK'?>\n");
			builder.append("<tree id=\"");
			/*如果查询节点参数objectId为空,则认为查询树的顶点,此时xml的tree id属性应为0,否则为objectId*/
			if(objectId == null ||  "".equals(objectId)){
			   builder.append("0");
			}else{
			   builder.append(objectId);
			}
			builder.append("\">\n");
			if (retHashtable != null){
				rightTreeList = (List) retHashtable.get("getChildrenByUser");
				if (rightTreeList != null){
				    for (int i = 0; i < rightTreeList.size(); i++) {
				    OperateRightVO vo = (OperateRightVO)rightTreeList.get(i);
				    	String rightId = vo.getRightId();
					 	builder.append("<item text=\""+vo.getRightName()+"\" id=\""+rightId+"\" ");					
						
						String rightType = vo.getRightType();
						if("M".equalsIgnoreCase(rightType)){
							builder.append(" im0 =\"book_titel.gif\" im1 =\"book_titel.gif\" im2=\"book_titel.gif\" ");
						}else if("E".equalsIgnoreCase(rightType)){
							builder.append(" im0 =\"book.gif\" im1 =\"book.gif\" im2=\"book.gif\" ");
						}else if("O".equalsIgnoreCase(rightType)){
							builder.append(" im0 =\"magazines_open.gif\" im1 =\"magazines_open.gif\" im2=\"magazines_open.gif\" ");
						}
						
	
						if("Y".equals(vo.getIsSelect())){
							builder.append(" checked = \"1\" ");
						}
						
						/*判断是否为叶子节点,如果为非叶子节则在树的节点显示加"+"号的图标,否则显示"-"图标*/
						if( "Y".equalsIgnoreCase(vo.getIsLeaf()) ){
						    builder.append(" child = \"0\" ");
						}else{
						    builder.append(" child = \"1\" ");
						}					
						builder.append(" >\n");						
						builder.append("<userdata name=\"isLeaf\">"+vo.getIsLeaf()+"</userdata>\n");			
						builder.append("<userdata name=\"isSelect\">"+vo.getIsSelect()+"</userdata>\n");					
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
	}else {
		StringBuilder builder = new StringBuilder();
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id= \"0\">\n");
	    builder.append("</tree>\n");
	    printOut.write(builder.toString());
        printOut.close();
	}
%>

