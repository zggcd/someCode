package org.apache.jsp.baf.jsp.impexp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.framework.common.IBusiness;
import com.regaltec.baf.framework.bp.BusinessDelegateImpl;
import com.regaltec.baf.business.common.valueobj.BusinessVO;

public final class chkBusinessTreeXMLData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
		    buf.append("<item text=\"Click here to add data\" id=\"null\" />");	 
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
