<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@page import="com.regaltec.baf.rig.authorize.common.valueobj.OperateAuthPreviewVO"%>
<%@page import="com.regaltec.common.util.StringHelper"%>
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
		
		String userId = "";
		if(request.getParameter("userId")!=null){
			userId = request.getParameter("userId");
		}
		hashtable.put("userId", userId);
		hashtable.put("treeCode", objectId);
		hashtable.put("ServletContext", sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_operateAuthorizeBI", "getChildrenOperateAuthRight", hashtable);
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
		
		if (retHashtable != null){
			rightList = (List) retHashtable.get("getChildrenOperateAuthRight");			
			if (rightList != null){
			    for (int i=0;i<rightList.size();i++) {
			    	OperateAuthPreviewVO vo = (OperateAuthPreviewVO)rightList.get(i);
			    	String id = vo.getTreeCode();
				 	String rightType = vo.getObjectType();
				 	String isLeaf = StringHelper.convertStringNull(vo.getIsLeaf());		
			 		builder.append("<item text=\""+vo.getRightName()+"\" id=\""+id+"\" "+" im0 =\"book_titel.gif\" im1 =\"book_titel.gif\" im2=\"book_titel.gif\" ");
		 			if(isLeaf.equals("N")){
		 				builder.append(" child = \"1\" ");
		 			}
					builder.append(" tooltip=\""+vo.getRightName()+"\" >\n</item>\n");			 		
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

