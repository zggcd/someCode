package org.apache.jsp.ida40.module.sms.tree;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.regaltec.baf.org.user.ui.control.UserLoginBean;
import com.regaltec.baf.org.user.common.valueobj.UserVO;
import com.regaltec.baf.org.group.common.valueobj.GroupVO;
import com.regaltec.baf.external.org.group.bi.IGroupBI;
import com.regaltec.baf.org.group.common.valueobj.GroupMemberVo;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;

public final class msgBaseGroupObjectTree_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=GBK");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");

	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String id = request.getParameter("id");  
	
	if(id==null){
	    id="";
	} 
	if(id.equals("0")){
	    id="";
	} 
	
	String nativenetId = request.getParameter("nativenetId");  
		
	PrintWriter outs = null;
	StringBuffer buf = null;
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IGroupBI groupBI = (IGroupBI) ctx.getBean("ext_baf_groupBI");
		
		outs = response.getWriter();
		buf = new StringBuffer();
		buf.append("<?xml version='1.0' encoding='GBK'?>\n");
		if (!id.equals("")) {
			buf.append("<tree id=\""+id+"\">\n");
		} else {
			buf.append("<tree id=\"0\">\n");
		}
		int k = 0; 
		List<GroupVO> list = null;
		
		if(id == null || "".equals(id)){
		    
		    UserLoginBean userLoginBean = (UserLoginBean) session.getAttribute("userLoginBean");
		    UserVO currentUser = userLoginBean.getCurrentUser();
		    if(currentUser!=null){
			    list = groupBI.getGroupVOByUserId(currentUser.getUserId());
				if(list!=null && list.size()>0){ // 加群组
					for (int i = 0; i < list.size(); i++) {
					    GroupVO vo = (GroupVO) list.get(i);
						buf.append("<item text=\""+vo.getGroupName()+"\" id=\""+vo.getGroupId()+"\" child=\"1\"");			
						buf.append(" im0 =\"department.gif\" im1 =\"person.gif\" im2=\"person.gif\" ");
						buf.append(" tooltip=\"grouptest\" >\n");			 
							
						buf.append("<userdata name=\"ifGroup\">1</userdata>\n");
						buf.append("<userdata name=\"objectType\">99</userdata>\n");
						buf.append("<userdata name=\"objectName\">"+vo.getGroupName()+"</userdata>\n</item>\n"); 
					}
				}
			}
		}else {
		
		    List<GroupMemberVo> memberList = groupBI.getMembersByGroupId(id);
			if(memberList!=null && memberList.size()>0){
				for (int i = 0; i < memberList.size(); i++) {
				    GroupMemberVo vo = (GroupMemberVo) memberList.get(i);

			    	buf.append("<item text=\""+vo.getObjectName()+"\" id=\""+vo.getObjectId()+"\" child=\"0\"");			
					buf.append(" im0 =\"person.gif\" im1 =\"person.gif\" im2=\"person.gif\" ");
					buf.append(" tooltip=\""+vo.getObjectName()+"\" >\n");			 
					
					buf.append("<userdata name=\"ifGroup\">0</userdata>\n");
					buf.append("<userdata name=\"objectName\">"+vo.getObjectName()+"</userdata>\n"); 	
					buf.append("<userdata name=\"objectId\">"+vo.getObjectId()+"</userdata>\n"); 
					buf.append("<userdata name=\"objectType\">"+vo.getObjectType()+"</userdata>\n</item>\n"); 
				}
			}
		}
		
		if ((list == null ||  list.size() == 0 ) && id.equals("")){
		    buf.append("<item text=\"暂无数据\" id=\"null\" call=\"1\" select=\"1\" />");	 
		 }
		buf.append("</tree>\n");		
	} catch (Exception e) {
		e.printStackTrace();
	} finally{
		outs.write(buf.toString());
		outs.close();  		  
	}

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
