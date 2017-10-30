package org.apache.jsp.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>OSS接口平台</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/main.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/imgurl.css\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"top_body\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"top_bg\">\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"88\">\r\n");
      out.write("\t\t\t\t<table width=\"165\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"logo\" width=\"165\" height=\"81\" valign=\"top\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"5%\">\r\n");
      out.write("\t\t\t\t\t\t\t<table width=\"199\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"199\" class=\"top_banner\" height=\"52\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"95%\">\r\n");
      out.write("\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr align=\"right\" width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\" style=\"font-size: 13px\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/images/main/ico_fellow.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\twidth=\"18\" height=\"14\"><font id=\"currentuser\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tcolor=\"#333333\">当前处理人：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.currentUser.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/images/main/ico_cipher.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\twidth=\"13\" height=\"15\" border=\"0\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"/jsp/common/chgPassword.jsp\" class=\"font\" target=\"workarea\">密码修改</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/images/main/ico_fellow02.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\twidth=\"13\" height=\"14\" border=\"0\"> <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"_blank\" class=\"font\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"if (confirm('是否要注销当前登录用户？') == false) return false; window.top.opener = 'anyone'; window.top.close();\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t注销</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td style=\"font-size: 13px\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"7%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table width=\"82\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talign=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"82\" height=\"52\" class=\"top_arrow02\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"1%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"15\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"15\" valign=\"top\" height=\"28\" class=\"menu_arrow01\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"right\" style=\"font-size: 13px\"><a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"little3\"></a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/sys/alarmAction.do?method=init\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"little3\" target=\"workarea\">&nbsp;告警提示</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"2%\"><a href=\"#\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"Image2\" border=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/images/main/menu_arrow_01.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth=\"13\" height=\"29\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"2%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div align=\"right\"><a href=\"#\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"Image1\" border=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/images/main/menu_top_01.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth=\"25\" height=\"29\"></a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td align=\"right\" width=\"12\" class=\"top_arrow06\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td valign=\"top\" class=\"left_menu\" height=\"25\" width=\"165\"></td>\r\n");
      out.write("\t\t\t<td class=\"top_bg02\">\r\n");
      out.write("\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"25\" class=\"top_arrow04\" height=\"25\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"244\" height=\"25\" align=\"left\" class=\"top_td\">&nbsp;当前位置&nbsp;&#58;&nbsp;<span id=\"location\">首页</span></td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"80\" class=\"top_td\">\r\n");
      out.write("\t\t\t\t\t\t\t<div align=\"center\"><font color=\"#333333\">最新信息 |</font></div>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"top_td\" align=\"right\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td class=\"top_arrow05\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
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
