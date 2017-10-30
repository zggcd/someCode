<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.framework.bp.BusinessDelegateImpl"%>
<%@ page import="com.regaltec.baf.business.common.valueobj.BusinessVO"%>
<%@ page import="com.regaltec.baf.business.common.valueobj.BusinessRelVO"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String objectId = request.getParameter("id");
	String requestId = request.getParameter("requestId");
	String objectType=request.getParameter("objectType");
	if (objectId == null || objectId.equals("0")) {
		objectId = "";
	}
	if(requestId==null){
	   requestId="";
	}
	if(objectType==null){
	   objectType="";
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
		if (!objectId.equalsIgnoreCase("")) {
			buf.append("<tree id=\"" + objectId + "\">\n");
		} else {
			buf.append("<tree id=\"0\">\n");
		}
		String child = "";
		String open = " open=\"true\" call=\"1\" select=\"1\" ";
		int k = 0;

		Hashtable hash = new Hashtable();
		hash.put("objectid",requestId);
		hash.put("objecttype",objectType);
		hash.put("parentBusinessid", (Object) objectId);
		hash.put("businessProperty","2"); //businessProperty "1":主专业, "0":非主专业, "2": 业务,默认为"2"(该字段可以为空)
		hash.put("ServletContext", sc);
		hash = (Hashtable) business.invoke("baf_businessBI","selectChildrenEx", hash);
		List list = null;
		if (hash != null) {
			list = (List) hash.get("selectChildrenEx");
			if (list != null && list.size() > 0) {
				for (int i = 0; i < list.size(); i++) {
					BusinessVO bvo=(BusinessVO)list.get(i);
					k++;
			
					String isLeaf = bvo.getIsleaf();
					if ("Y".equals(isLeaf)) {
						child = "0";
					} else {
						child = "1";
					}
 
					buf.append("<item text=\"" + bvo.getBusinessname()
							+ "\" id=\"" + bvo.getBusinessid()
							+ "\" child=\"" + child + "\"");
					if (k == 1 && objectId.equalsIgnoreCase("")) {
						buf.append(open);
					}
					if(bvo!=null&&"Y".equalsIgnoreCase(bvo.getIsSelect())){
					   buf.append(" checked = \"1\" ");
					}
					buf.append(" im0 =\"books_close.gif\" im1 =\"books_close.gif\" im2=\"books_close.gif\" ");
					buf.append(" tooltip=\"" + bvo.getBusinessname()
							+ "\" >\n");

					buf.append("<userdata name=\"isLeaf\">" + isLeaf
							+ "</userdata>\n");
					buf.append("<userdata name=\"isValid\">"
							+ bvo.getIsvalid() + "</userdata>\n");
					buf.append("<userdata name=\"parentbusinessid\">"
							+ bvo.getParentbusinessid()
							+ "</userdata>\n");
					buf.append("<userdata name=\"sortorder\">"
							+ bvo.getSortorder() + "</userdata>\n");
					buf.append("<userdata name=\"businesscode\">"
							+ bvo.getBusinesscode()
							+ "</userdata>\n</item>\n");
				}
			}
		}
		buf.append("</tree>\n");
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		outs.write(buf.toString());
		outs.close();
	}
%>

