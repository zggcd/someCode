package org.apache.jsp.jsp.iface;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ifaceConfigMapping_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Strict//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=7\" />\r\n");
      out.write("<title>静态数据映射</title>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"/css/flash.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\"\r\n");
      out.write("\tid=\"mapping\" width=\"100%\" height=\"100%\"\r\n");
      out.write("\tcodebase=\"http://fpdownload.macromedia.com/get/flashplayer/current/swflash.cab\">\r\n");
      out.write("\t<param name=\"movie\" value=\"/swf/IfaceConfigMapping.swf\" />\r\n");
      out.write("\t<param name=\"quality\" value=\"high\" />\r\n");
      out.write("\t<param name=\"bgcolor\" value=\"#FFFFFF\" />\r\n");
      out.write("\t<!--param name=\"wmode\" value=\"Opaque\" /-->\r\n");
      out.write("\t<param name=\"allowScriptAccess\" value=\"sameDomain\" />\r\n");
      out.write("\t<embed src=\"/swf/IfaceConfigMapping.swf\" quality=\"high\" bgcolor=\"#FFFFFF\"\r\n");
      out.write("\t\twidth=\"100%\" height=\"100%\" name=\"mapping\" align=\"middle\"\r\n");
      out.write("\t\tplay=\"true\"\r\n");
      out.write("\t\tloop=\"false\"\r\n");
      out.write("\t\tquality=\"high\"\r\n");
      out.write("\t\tallowScriptAccess=\"sameDomain\"\r\n");
      out.write("\t\ttype=\"application/x-shockwave-flash\"\r\n");
      out.write("\t\tpluginspage=\"http://www.adobe.com/go/getflashplayer\">\r\n");
      out.write("\t</embed>\r\n");
      out.write("</object>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
