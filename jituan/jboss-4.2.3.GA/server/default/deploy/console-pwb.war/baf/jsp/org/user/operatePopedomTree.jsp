<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.framework.bp.BusinessDelegateImpl"%>
<%@ page import="com.regaltec.baf.module.common.valueobj.ModuleVO"%>
<%@ page import="com.regaltec.baf.module.common.valueobj.ElementVO"%>
<%@page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@ page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String moduleId = request.getParameter("id");

	PrintWriter outs = null;
	StringBuilder buf = null;
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
		
		outs = response.getWriter();
		buf = new StringBuilder();
		buf.append("<?xml version='1.0' encoding='GBK'?>\n");
		if (moduleId != null && !moduleId.equalsIgnoreCase("0")) {
			buf.append("<tree id=\""+moduleId+"\">\n");
		} else {
			buf.append("<tree id=\"0\">\n");
		}
		String child = null;
		String open = " open=\"true\" call=\"1\" select=\"1\" ";
		
		Hashtable hash = new Hashtable();
		if( moduleId  == null ) moduleId ="";
		hash.put("parentModuleId", moduleId);
		//获取当前登录用户对象
		UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
		UserVO uvo = null;
		if(loginBean!=null){
			uvo = loginBean.getCurrentUser();
		}
		String userId = "";
		if( uvo != null)
		{
			userId = uvo.getUserId();
		}
		hash.put("userId",userId);
		hash.put("ServletContext", sc);
		hash = (Hashtable) business.invoke("baf_moduleBI","getChildren", hash);
		List list = (List) hash.get("getChildren");
		for (int i = 0; list!= null &&  i < list.size(); i++) {
			ModuleVO vo = (ModuleVO) list.get(i);
			if ("Y".equalsIgnoreCase(vo.getIsLeaf())) {
				child = "0";  //如果是叶子节点
			} else {
				child = "1"; //不是叶子节点
			}			
			buf.append("<item text=\""+vo.getModuleName()+"\" id=\""+vo.getModuleId()+"\" child=\""+child+"\"");			
			buf.append(" im0 =\"tool.gif\" im1 =\"tool.gif\" im2=\"tool.gif\" ");
			buf.append(" tooltip=\""+vo.getModuleName()+"\" >\n");
			buf.append("</item>\n");
		}
		buf.append("</tree>\n");		
	} catch (Exception e) {
		e.printStackTrace();
	} finally{
		outs.write(buf.toString());
		outs.close();
	}
%>

