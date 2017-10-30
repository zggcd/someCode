package org.apache.jsp.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hiddenFrame_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/jsp/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/custom-tag.tld");
  }

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
      response.setContentType("text/html;charset=GBK");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/js/prototype.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/js/commonjs.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/js/validator.js\" charset=\"GBK\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/dwr/engine.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/dwr/util.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/dwr/interface/ifaceMonitorAction.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/cb2.js\"></script>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/cb2.css\" type=\"text/css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/js/tab/webfx.css\" type=\"text/css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/cb2.css\" type=\"text/css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/main.css\" type=\"text/css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/imgurl.css\" type=\"text/css\">\r\n");
      out.write("\t\t<title>语音</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body class=\"body\" >\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"strLastTime\" name=\"strLastTime\" value=\"\"/>\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"strNowTime\" name=\"strNowTime\" value=\"\"/>\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction openCheckLoop () {\r\n");
      out.write("\t\t\t\tsetInterval(\"checkIfaceLogEvent()\",60000);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction checkIfaceLogEvent () {\r\n");
      out.write("\t\t\t\t//接口监控检测函数\r\n");
      out.write("\t\t\t\t$(\"strLastTime\").value=$(\"strNowTime\").value;\r\n");
      out.write("\t\t\t\tifaceMonitorAction.checkIfaceLogEventCheck($(\"strNowTime\").value,checkIfaceLogEvent_callBack);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction checkIfaceLogEvent_callBack(obj) {\r\n");
      out.write("\t\t\t\tif(obj!=null&&obj!=\"undefined\") {\r\n");
      out.write("\t\t\t\t\tif(obj.logEventCount>0) {\r\n");
      out.write("\t\t\t\t\t\tframes[\"player\"].setSoundPlayer (\"start\",\"receive.wav\",\"once\");\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\tframes[\"player\"].setSoundPlayer (\"stop\",\"\",\"\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif(obj.strNowTime!=null&&obj.strNowTime!=\"undefined\") {\r\n");
      out.write("\t\t\t\t\t\t$(\"strNowTime\").value=obj.strNowTime;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<iframe name=\"player\" src=\"/jsp/common/player.jsp\" ></iframe>\r\n");
      out.write("\t</body>\r\n");
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
