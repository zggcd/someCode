package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("\r\n");

response.setHeader("Pragma","No-cache");
response.setHeader("Cache-Control","no-cache");
response.setHeader("Expires","0");

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>集团电子运维系统互联接口平台</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/prototype.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/dwr/engine.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/dwr/interface/loginAction.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("Event.observe(window, \"load\", function() {\r\n");
      out.write("\tEvent.observe(\"loginName\", \"keypress\", function(event) {\r\n");
      out.write("\t\tif (event.keyCode == Event.KEY_RETURN) {\r\n");
      out.write("\t\t\tevent.stop();\r\n");
      out.write("\t\t\tif (!$(\"loginName\").present()) {\r\n");
      out.write("\t\t\t\talert(\"请输入用户名\");\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\"loginPassword\").select();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tEvent.observe(\"loginPassword\", \"keypress\", function(event) {\r\n");
      out.write("\t\tif (event.keyCode == Event.KEY_RETURN) {\r\n");
      out.write("\t\t\tevent.stop();\r\n");
      out.write("\t\t\tif ($F(\"loginName\").blank()) {\r\n");
      out.write("\t\t\t\talert(\"请输入用户名\");\r\n");
      out.write("\t\t\t\t$(\"loginName\").focus();\r\n");
      out.write("\t\t\t} else if ($F(\"loginPassword\").blank()) {\r\n");
      out.write("\t\t\t\talert(\"请输入密码\");\r\n");
      out.write("\t\t\t\t(\"loginPassword\").focus();\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tsubmitHandler();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tEvent.observe(\"btnSubmit\", \"click\", submitHandler);\r\n");
      out.write("\r\n");
      out.write("\t$(\"loginName\").focus();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function submitHandler() {\r\n");
      out.write("\tif ($F(\"loginName\").blank()) {\r\n");
      out.write("\t\talert(\"请输入用户名\");\r\n");
      out.write("\t\t$(\"loginName\").focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif ($F(\"loginPassword\").blank()) {\r\n");
      out.write("\t\talert(\"请输入密码\");\r\n");
      out.write("\t\t$(\"loginPassword\").focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tloginAction.checkin($(\"loginForm\").serialize(true), function(result){\r\n");
      out.write("\t\tif(result.blank()) {\r\n");
      out.write("\t\t\twindow.location.href=\"");
      out.print(request.getContextPath());
      out.write("/sys/loginAction.do?method=checkLogin\";\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\talert(result);\r\n");
      out.write("\t\t\t$(\"loginPassword\").select();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"26427F\" text=\"#000000\" >\r\n");
      out.write("<form name=\"loginForm\" id=\"loginForm\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"method\" value=\"checkLogin\" />\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"99%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t<table width=\"422\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"148\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/main/pic.gif\" width=\"511\" height=\"161\" border=\"0\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td background=\"");
      out.print(request.getContextPath());
      out.write("/images/main/pic2.gif\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"13%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div align=\"right\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/images/main/pic4.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\twidth=\"70\" height=\"66\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"87%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"2\" cellpadding=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" id=\"loginName\" name=\"loginName\" style=\"width: 150px;\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"33\"><input type=\"password\" id=\"loginPassword\" name=\"loginPassword\" style=\"width: 150px\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"3\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/main/pic5.gif\" width=\"189\" height=\"49\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"87%\" valign=\"top\" height=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"2\" cellpadding=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><img id=\"btnSubmit\" border=\"0\" src=\"");
      out.print(request.getContextPath());
      out.write("/images/main/ok01.gif\" width=\"78\" height=\"24\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/main/pic3.gif\" width=\"511\" height=\"201\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"20\" align=\"right\"><a href=\"/swf/install_flash_player_ax.exe\"><img src=\"/images/icon/plugin.png\" border=\"0\" width=\"16\" height=\"16\" /></a></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
