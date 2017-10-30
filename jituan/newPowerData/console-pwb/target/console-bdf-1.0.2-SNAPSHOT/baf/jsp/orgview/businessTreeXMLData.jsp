<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.business.common.valueobj.BusinessVO"%>
<%@page import="com.regaltec.common.util.Constant"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String id = request.getParameter("id");
	if (id == null || id.equals("0")) {
		id = "";
	}

	PrintWriter outs = null;
	StringBuffer buf = null;
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc
				.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");

		outs = response.getWriter();
		buf = new StringBuffer();
		buf.append("<?xml version='1.0' encoding='GBK'?>\n");
		if (!id.equalsIgnoreCase("")) {
			buf.append("<tree id=\"" + id + "\">\n");
		} else {
			buf.append("<tree id=\"0\">\n");
		}
		String child = "";
		String open = " open=\"true\" call=\"1\" select=\"1\" ";
		int k = 0;

		Hashtable hash = new Hashtable();
		hash.put("parentBusinessid", id);
		hash.put("businessProperty", "2");
		hash.put("isOrgViewFlag", Constant.YESNO_Y);
		hash.put("ServletContext", sc);
		hash = (Hashtable) business.invoke("baf_businessBI", "selectChildren", hash);
		List list = null;
		if (hash != null) {
			list = (List) hash.get("selectChildren");
			if (list != null && list.size() > 0) {
				for (int i = 0; i < list.size(); i++) {
					BusinessVO bvo=(BusinessVO)list.get(i);
					k++;
					
					//判断是否是叶子节点
					String isLeaf = Constant.YESNO_Y;
					hash.put("parentBusinessid", bvo.getBusinessid());
					hash.put("businessProperty", "2");
					hash.put("isOrgViewFlag", Constant.YESNO_Y);
					hash.put("ServletContext", sc);
					hash = (Hashtable) business.invoke("baf_businessBI", "selectChildren", hash);
					if (hash != null && ((List)hash.get("selectChildren")).size() > 0) {
						child = "1";	
						isLeaf = Constant.YESNO_N;
					} else {
						child = "0";
						isLeaf = Constant.YESNO_Y;
					}

					buf.append("<item text=\"" + bvo.getBusinessname()
							+ "\" id=\"" + bvo.getBusinessid()
							+ "\" child=\"" + child + "\"");
					if (k == 1 && id.equalsIgnoreCase("")) {
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
		/*
		if ((list == null || list.size() == 0) && id.equals("")) {
			buf.append("<item text=\"点击这里添加数据\" id=\"null\" />");
		}
		*/
		buf.append("</tree>\n");
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		outs.write(buf.toString());
		outs.close();
	}
%>

