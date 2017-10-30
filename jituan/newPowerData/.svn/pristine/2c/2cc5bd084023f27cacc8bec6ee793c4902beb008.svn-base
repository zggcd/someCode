<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.framework.bp.BusinessDelegateImpl"%>
<%@ page import="com.regaltec.baf.specialty.common.valueobj.SpecialtyVO"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String specialtyId = request.getParameter("id");
	if (specialtyId == null || specialtyId.equals("0")){
		specialtyId = "";
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
		if (!specialtyId.equalsIgnoreCase("")) {
			buf.append("<tree id=\""+specialtyId+"\">\n");
		} else {
			buf.append("<tree id=\"0\">\n");
		}
		String child = "";
		String open = " open=\"true\" call=\"1\" select=\"1\" ";
		int k = 0;
		
		Hashtable hash = new Hashtable();
		hash.put("parentSpecialtyid", (Object)specialtyId);
		hash.put("ServletContext", sc);
		hash = (Hashtable) business.invoke("baf_specialtyBI","selectChildren", hash);
		List list = null;
		if(hash!=null){
			list = (List) hash.get("selectChildren");		
			if(list!=null && list.size()>0){
				for (int i = 0; i < list.size(); i++) {
					SpecialtyVO vo = (SpecialtyVO) list.get(i);
					k++;
					String isLeaf = vo.getIsleaf();			
					if("N".equalsIgnoreCase(isLeaf)){
						//不是叶子节点
						child = "1";
					}else{						
						child = "0";							
					}
									
					buf.append("<item text=\""+vo.getSpecialtyname()+"\" id=\""+vo.getSpecialtyid()+"\" child=\""+child+"\"");			
					if (k == 1 && specialtyId.equalsIgnoreCase("")){
						buf.append(open);
					}
					buf.append(" im0 =\"books_close.gif\" im1 =\"books_close.gif\" im2=\"books_close.gif\" ");
					buf.append(" tooltip=\""+vo.getSpecialtyname()+"\" >\n");					
					
					buf.append("<userdata name=\"isLeaf\">"+isLeaf+"</userdata>\n");
					buf.append("<userdata name=\"isValid\">"+vo.getIsvalid()+"</userdata>\n");
					buf.append("<userdata name=\"parentSpecialtyId\">"+vo.getParentspecialtyid()+"</userdata>\n");
					buf.append("<userdata name=\"sortOrder\">"+vo.getSortorder()+"</userdata>\n");
					buf.append("<userdata name=\"specProperty\">"+vo.getSpecproperty()+"</userdata>\n");
					buf.append("<userdata name=\"specialtyCode\">"+vo.getSpecialtycode()+"</userdata>\n</item>\n");
				}
			}
		}
		if ((list == null ||  list.size() == 0 ) && specialtyId.equals("")){
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

