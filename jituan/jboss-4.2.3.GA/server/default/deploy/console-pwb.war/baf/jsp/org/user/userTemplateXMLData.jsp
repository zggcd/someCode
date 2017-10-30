<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@page import="com.regaltec.baf.template.common.valueobj.UserTemplateVO"%>
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
		UserTemplateVO tvo = new UserTemplateVO();
		tvo.setObjectcategory("E");
		hashtable.put("userTemplate", tvo);
		hashtable.put("ServletContext", sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_userTemplateBI", "selectByMulti", hashtable);
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
			rightList = (List) retHashtable.get("selectByMulti");
			
			if (rightList != null){
			    for (int i=0;i<rightList.size();i++) {
			    	UserTemplateVO vo = (UserTemplateVO)rightList.get(i);
			    	String id = vo.getUsertemplateid();
				 	builder.append("<item text=\"");
					builder.append(vo.getUsertemplatename());
					builder.append("\" id=\"");
					builder.append(id);
					builder.append("\" ");				
					if(i==0){
						//builder.append(" open=\"1\" call=\"1\" select=\"1\" ");
					}
					builder.append(" im0 =\"tombs.gif\" im1 =\"tombs.gif\" im2=\"tombs.gif\" ");
					builder.append(" child = \"0\" ");
					builder.append(" tooltip=\"");
					builder.append(vo.getUsertemplatename());
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

