<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%@ page import="org.springframework.web.context.*" %>
<%@ page import="com.regaltec.baf.framework.common.IBusiness" %>
<%@ page import="com.regaltec.baf.framework.bp.BusinessDelegateImpl" %>
<%@ page import="com.regaltec.baf.business.common.valueobj.BusinessVO" %>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String businessId = request.getParameter("id");
	if (businessId == null || businessId.equals("0")){
		businessId = "";
	}
	
	PrintWriter outs = null;
	StringBuffer buf = null;
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
		
		outs = response.getWriter();
		buf = new StringBuffer();
		buf.append("<?xml version='1.0' encoding='GBK'?>\n");
		if (!businessId.equalsIgnoreCase("")) {
			buf.append("<tree id=\""+businessId+"\">\n");
		} else {
			buf.append("<tree id=\"0\">\n");
		}
		String child = "";
		String open = " open=\"true\" ";
		int k = 0;
		
		Hashtable hash = new Hashtable();
		hash.put("parentBusinessid", (Object)businessId);
		hash.put("ServletContext", sc);
		hash = (Hashtable) business.invoke("baf_businessBI","selectChildren", hash);
		List list = null;
		if(hash!=null){
			list = (List) hash.get("selectChildren");		
			if(list!=null && list.size()>0){
				for (int i = 0; i < list.size(); i++) {
					BusinessVO vo = (BusinessVO) list.get(i);
					k++;
					String isLeaf = vo.getIsleaf();			
					if("N".equalsIgnoreCase(isLeaf)){
						//不是叶子节点
						child = "1";
					}else{						
						child = "0";							
					}
									
					buf.append("<item text=\""+vo.getBusinessname()+"\" id=\""+vo.getBusinessid()+"\" child=\""+child+"\"");			
					if (k == 1 && businessId.equalsIgnoreCase("")){
						buf.append(open);
					}
					buf.append(" im0 =\"books_close.gif\" im1 =\"books_close.gif\" im2=\"books_close.gif\" ");
					buf.append(" tooltip=\""+vo.getBusinessname()+"\" >\n");					
					
					buf.append("<userdata name=\"isleaf\">"+isLeaf+"</userdata>\n");
					buf.append("<userdata name=\"isvalid\">"+vo.getIsvalid()+"</userdata>\n");
					buf.append("<userdata name=\"parentbusinessid\">"+vo.getParentbusinessid()+"</userdata>\n");
					buf.append("<userdata name=\"sortorder\">"+vo.getSortorder()+"</userdata>\n");
					buf.append("<userdata name=\"businesscode\">"+vo.getBusinesscode()+"</userdata>\n");
					buf.append("<userdata name=\"businessproperty\">"+vo.getBusinessproperty()+"</userdata>\n</item>\n");
				}
			}
		}
		if ((list == null ||  list.size() == 0 ) && businessId.equals("")){
		    buf.append("<item text=\"点击这里添加数据\" id=\"null\" />");	 
		 }
		buf.append("</tree>\n");		
	} catch (Exception e) {
		e.printStackTrace();
	} finally{
		outs.write(buf.toString());
		outs.close();
	}
%>