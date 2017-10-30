package org.apache.jsp.jsp.sys.tip;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sysTipsEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type='text/javascript' src='/dwr/interface/sysTipAction.js'></script>\r\n");

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=GBK\" />\r\n");
      out.write("\t<title>OSS接口平台</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\tDWREngine.setErrorHandler(handler);\r\n");
      out.write("\t \r\n");
      out.write("\t function handler(errors) {\r\n");
      out.write("        alert(errors);\r\n");
      out.write("        enableForm(\"sysTipsEditForm\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form name=\"sysTipsEditForm\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"tipId\" name=\"tipId\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"tipModuleId\" name=\"tipModuleId\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t<table border=1 width=\"100%\" CELLPADDING=0 CELLSPACING=0 class=\"table01\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"100%\"  class=\"headers\" height=\"24px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"headerfont\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"3%\"></td>\r\n");
      out.write("\t\t\t\t                            <td width=\"40%\">编辑提示标签</td>\r\n");
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
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\" width=\"25%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      模块名称:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"tipModuleIdShow\" maxlength=\"64\" style=\"width:85%\" style=\"border:0\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\" width=\"25%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      提示标签名称:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" id=\"tipLabel\" name=\"tipLabel\" maxlength=\"64\" style=\"width:85%\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       提示标签内容:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<textarea name=\"tipContext\" type=\"text\" rows=\"12\"  style=\"width:85%;\" class=\"inputtext01\" dataType=\"Require\" msg=\"提示标签内容不能为空\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" class=\"button\"  onClick=\"sysDicTipsSave();\" value=\"保存\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" class=\"button\"  onClick=\"sysDicTipsCancel();\" value=\"取消\">\r\n");
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
      out.write("\r\n");
      out.write("    var tipId = window.dialogArguments;\r\n");
      out.write("    \r\n");
      out.write("    initData();\r\n");
      out.write("    \r\n");
      out.write("    //use\r\n");
      out.write("    function initData() {\r\n");
      out.write("    \ttrimForm();\r\n");
      out.write("    \tsysTipAction.selectByPrimaryKey(tipId,callbackEditFun);\r\n");
      out.write("    \tdisableForm();\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    //use\r\n");
      out.write("    function callbackEditFun(obj) {\r\n");
      out.write("    \tenableForm();\r\n");
      out.write("    \tif(obj!=null) {\r\n");
      out.write("\t    \tif(obj.tipModuleId!=null && obj.tipModuleId!=\"\") {\r\n");
      out.write("\t    \t\t$('tipModuleId').value = obj.tipModuleId;\r\n");
      out.write("\t    \t\t$('tipModuleIdShow').value = obj.tipModuleId;\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    \tif(obj.tipId!=null && obj.tipId!=\"\") {\r\n");
      out.write("\t    \t\t$('tipId').value = obj.tipId;\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    \tif(obj.tipLabel!=null && obj.tipLabel!=\"\") {\r\n");
      out.write("\t    \t\t$('tipLabel').value = obj.tipLabel;\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    \tif(obj.tipContext!=null && obj.tipContext!=\"\") {\r\n");
      out.write("\t    \t\t$('tipContext').value = obj.tipContext;\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    }\r\n");
      out.write("\t    $('tipModuleIdShow').disabled = true;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    //use\r\n");
      out.write("    function sysDicTipsCancel() {\r\n");
      out.write("    \twindow.close();\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    //use\r\n");
      out.write("    function sysDicTipsSave() {\r\n");
      out.write("    \tif (!validateForm(sysTipsEditForm, 1)) {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\t\tvar formObj = $('sysTipsEditForm').serialize(true); \r\n");
      out.write("    \tsysTipAction.updateByPrimaryKeySelective(formObj,callBackDoSave);\r\n");
      out.write("    \tdisableForm();\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    //use\r\n");
      out.write("    function callBackDoSave(str) {\r\n");
      out.write("    \tenableForm();\r\n");
      out.write("    \tif(str == \"\") {\r\n");
      out.write("    \t\talert(\"操作成功\");\r\n");
      out.write("\t    \twindow.returnValue = 1;\r\n");
      out.write("\t    \twindow.close();\r\n");
      out.write("    \t} else {\r\n");
      out.write("    \t\thandler(str);\r\n");
      out.write("    \t}\r\n");
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
