package org.apache.jsp.jsp.iface.system;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class systemEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/jsp/common/allTag.jsp");
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

      out.write("\r\n");
      out.write("<script type='text/javascript' src='/js/prototype.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/js/commonjs.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/js/validator.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/dwr/engine.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/dwr/util.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/dwr/interface/ifaceConfigSystemAction.js'></script>\r\n");

	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");

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
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/main.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/imgurl.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=GBK\" />\r\n");
      out.write("\t<title>OSS接口平台</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form name=\"ifaceConfigSystemForm\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"applicationId\" name=\"applicationId\" value=\"\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"applicationSn\" name=\"applicationSn\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t<table border=1 width=\"100%\" CELLPADDING=0 CELLSPACING=0 class=\"table01\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"100%\"  class=\"headers\" height=\"24px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"headerfont\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"3%\"></td>\r\n");
      out.write("\t\t\t\t                            <td width=\"40%\">编辑所选接口系统</td>\r\n");
      out.write("\t\t\t\t                            <td width=\"57%\"></td>\r\n");
      out.write("\t\t\t\t                        </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"bg_01\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"100% border=\" 0\"  ellpadding=\"2\" cellspacing=\"1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<table height=\"100%\" width=100% border=1 cellpadding=2 cellspacing=0 bordercolorlight=#CCCCCC bordercolordark=#FFFFFF bgcolor=\"#FFFFFF\" frame=box id=powergrid style=\"FONT-SIZE: 13px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tpcolor=\"#CCCCCC\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\" width=\"35%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      系统名称:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"applicationName\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       系统编码:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"applicationSnEdit\" disabled/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" class=\"button\"  onClick=\"ifaceConfigSystemSave();\" value=\"保存\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" class=\"button\"  onClick=\"ifaceConfigSystemClose();\" value=\"取消\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var diaObj = window.dialogArguments;\r\n");
      out.write("    if(diaObj!=null) {\r\n");
      out.write("    \t//主键\r\n");
      out.write("    \tif(diaObj.applicationId!=null && diaObj.applicationId!='') {\r\n");
      out.write("    \t\t$('applicationId').value = diaObj.applicationId;\r\n");
      out.write("    \t}\r\n");
      out.write("    \t//应用程序名称\r\n");
      out.write("    \tif(diaObj.applicationName!=null && diaObj.applicationName!='') {\r\n");
      out.write("    \t\t$('applicationName').value = diaObj.applicationName;\r\n");
      out.write("    \t}\r\n");
      out.write("    \t//应用程序编码(non-view)\r\n");
      out.write("    \tif(diaObj.applicationSn!=null && diaObj.applicationSn!='') {\r\n");
      out.write("    \t\t$('applicationSn').value = diaObj.applicationSn;\r\n");
      out.write("    \t}\r\n");
      out.write("    \t//应用程序编码(view)\r\n");
      out.write("    \tif(diaObj.applicationSn!=null && diaObj.applicationSn!='') {\r\n");
      out.write("    \t\t$('applicationSnEdit').value = diaObj.applicationSn;\r\n");
      out.write("    \t}\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function ifaceConfigSystemClose() {\r\n");
      out.write("    \twindow.close();\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function ifaceConfigSystemSave() {\r\n");
      out.write("    \tif (!validateForm(ifaceConfigSystemForm, 1)) {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\t\tvar formObj = $('ifaceConfigSystemForm').serialize(true);\r\n");
      out.write("    \tifaceConfigSystemAction.updateByPrimaryKeySelective(formObj,callBackDoSave);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function callBackDoSave() {\r\n");
      out.write("    \talert(\"操作成功\");\r\n");
      out.write("    \twindow.returnValue=1;\r\n");
      out.write("    \twindow.close();\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("</script>\r\n");
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
