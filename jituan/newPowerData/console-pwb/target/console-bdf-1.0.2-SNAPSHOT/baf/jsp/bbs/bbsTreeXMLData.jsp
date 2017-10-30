<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.bbs.data.common.valueobj.BoardVO"%>
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
		
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		if (!objectId.equalsIgnoreCase("")) {
			builder.append("<tree id=\"" + objectId + "\">\n");
		} else {
			builder.append("<tree id=\"0\">\n");
		}
		String child = "";
		String open = " open=\"true\" ";
		int k = 0;
		
		Hashtable hashtable = new Hashtable();
		hashtable.put("parentId", (Object)objectId);
		hashtable.put("ServletContext", sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_boardBI", "getBoardIncludeLockByParentId", hashtable);
		List rightList = null;
		
		if (retHashtable != null){
			rightList = (List) retHashtable.get("getBoardIncludeLockByParentId");
			if (rightList != null){
			    for (int i=0;i<rightList.size();i++) {
			    	BoardVO vo = (BoardVO)rightList.get(i);
			    	k++;
			    	
			    	//判断是否是叶子节点
					String isLeaf = Constant.YESNO_Y;
					hashtable.put("parentId", (Object)objectId);
					hashtable.put("ServletContext", sc);
					Hashtable hash = (Hashtable) business.invoke("baf_boardBI", "getBoardIncludeLockByParentId", hashtable);
					if (hash != null && ((List)hash.get("getBoardIncludeLockByParentId")).size() > 0) {
						child = "1";	
						isLeaf = Constant.YESNO_N;
					} else {
						child = "0";
						isLeaf = Constant.YESNO_Y;
					}
					
					String isLock = vo.getIsLock(); //状态  'Y' 禁用 'N' 可用
					builder.append("<item text=\"" +vo.getBoardName() + "\" id=\"" + vo.getBoardId() + "\" child=\"" + child + "\"");
					if (k == 1 && objectId.equalsIgnoreCase("")) {
						builder.append(open);
					}
					builder.append(" im0 =\"book.gif\" im1 =\"books_open.gif\" im2=\"books_close.gif\" ");
					if("Y".equalsIgnoreCase(isLock)){
						builder.append(" aCol=\"lightgray\" ");
						builder.append(" tooltip=\"" + vo.getBoardName() + "#{msgs['baf.bbs.hasDisabled']}\" >\n");
					}else{
						builder.append(" tooltip=\"" + vo.getBoardName() + "\" >\n");
					}
					builder.append("<userdata name=\"isLock\">" + isLock + "</userdata>\n");	
					builder.append("<userdata name=\"isLeaf\">" + isLeaf + "</userdata>\n");	
					builder.append("<userdata name=\"parentbusinessid\">" + vo.getParentId() + "</userdata>\n");	
					
					builder.append("</item>\n");						
					
				}					
		  	}
	 	}	
		
		builder.append("</tree>\n");	
	} catch (Exception e) {
		e.printStackTrace();
	} finally{
		printOut.write(builder.toString());
		printOut.close();
	}
%>

