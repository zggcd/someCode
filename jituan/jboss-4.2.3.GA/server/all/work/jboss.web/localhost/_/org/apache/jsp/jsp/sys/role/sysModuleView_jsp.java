package org.apache.jsp.jsp.sys.role;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sysModuleView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type='text/javascript' src='/dwr/interface/sysModuleAction.js'></script>\r\n");

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
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/cb2.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/js/tab/webfx.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/js/tab-view/css/tab-view.css\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/tab-view/js/ajax.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/tab-view/js/tab-view.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tDWREngine.setErrorHandler(handler);\r\n");
      out.write("    function handler(errors) {\r\n");
      out.write("        alert(errors);\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=GBK\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("\t<form name=\"formView\">\r\n");
      out.write("\t\t<table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<table  border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"font-size:13px\" >\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td  class=\"tabpaneleft2\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"tabpanebg2\"   width=\"120\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/main_01/ico_fellow.gif\" width=\"18\" height=\"15\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>模块细节</span>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"tabpaneright2\"></td>\r\n");
      out.write("\t\t\t\t    </tr>\r\n");
      out.write("\t\t\t    </table>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<table border=1 width=\"100%\" CELLPADDING=0 CELLSPACING=0 class=\"table01\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"bg_01\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"100% border=\" 0\"  ellpadding=\"2\" cellspacing=\"1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<table height=\"100%\" width=100% border=1 cellpadding=2 cellspacing=0 bordercolorlight=#CCCCCC bordercolordark=#FFFFFF bgcolor=\"#FFFFFF\" frame=box id=powergrid style=\"FONT-SIZE: 13px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tpcolor=\"#CCCCCC\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     上级模块:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"parentName\" disabled >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      模块名称:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"moduleName\" maxlength=\"50\" size=\"40\" dataType=\"Require\" msg=\"模块名称不能为空\" disabled />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     是否有效:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"isValid_Y\" name=\"isValid\" value=\"Y\" disabled>有效\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"isValid_N\" name=\"isValid\" value=\"N\" disabled>无效\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     是否叶子菜单:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"isLeaf_Y\" name=\"isLeaf\" value=\"Y\" disabled>是\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"isLeaf_N\" name=\"isLeaf\" value=\"N\" disabled>否\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     排列次序:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"sortOrder\" maxlength=\"3\" size=\"3\" disabled />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t模块视图链接:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"moduleUrl\" maxlength=\"130\" size=\"70\" disabled  />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t菜单描述:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<textarea id=\"moduleDesc\" name=\"moduleDesc\" rows=\"3\"  style=\"width: 95%;\" class=\"inputtext01\" disabled>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"moduleId\" name=\"moduleId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sysModule.moduleId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
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
      out.write("\tfunction initData()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.forms[0].parentName.value =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.parentName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\tdocument.forms[0].moduleName.value =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sysModule.moduleName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("\t\tif(\"Y\"==\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sysModule.isValid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\") {\r\n");
      out.write("\t\t\t$(\"isValid_Y\").checked=true;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$(\"isValid_N\").checked=true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(\"Y\"==\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sysModule.isLeaf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\") {\r\n");
      out.write("\t\t\t$(\"isLeaf_Y\").checked=true;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$(\"isLeaf_N\").checked=true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tdocument.forms[0].moduleDesc.value =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sysModule.moduleDesc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\tdocument.forms[0].sortOrder.value =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sysModule.sortOrder}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\tdocument.forms[0].moduleUrl.value =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sysModule.moduleUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("\t\ttrimForm();\r\n");
      out.write("\t}\r\n");
      out.write("\tinitData();\r\n");
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
