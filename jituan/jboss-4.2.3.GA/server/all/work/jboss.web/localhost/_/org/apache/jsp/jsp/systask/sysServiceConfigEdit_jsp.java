package org.apache.jsp.jsp.systask;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sysServiceConfigEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type='text/javascript' src='/js/commonjs.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/js/validator.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/js/prototype.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/dwr/engine.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/dwr/util.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/dwr/interface/sysServiceConfig.js'></script>\r\n");

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
      out.write("        enableForm(\"updateSysServiceConfigForm\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function startRunonceOnChange() {\r\n");
      out.write("    \tvar startRunonce = $('startRunonce').value;\r\n");
      out.write("    \tif(startRunonce == 'Y') {\r\n");
      out.write("    \t\t$('runInterval').value = \"\";\r\n");
      out.write("    \t\t$('runInterval').disabled = true;\r\n");
      out.write("    \t\talert('运行时间间隔不可用!');\r\n");
      out.write("    \t\treturn false;\r\n");
      out.write("    \t} else {\r\n");
      out.write("    \t\t$('runInterval').disabled = false;\r\n");
      out.write("    \t}\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form name=\"updateSysServiceConfigForm\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"serviceId\" name=\"serviceId\" value=\"\" />\r\n");
      out.write("\t\t\t\t<table border=1 width=\"100%\" CELLPADDING=0 CELLSPACING=0 class=\"table01\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"100%\"  class=\"headers\" height=\"24px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"headerfont\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"3%\"></td>\r\n");
      out.write("\t\t\t\t                            <td width=\"40%\">更新定时任务</td>\r\n");
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
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\" width=\"30%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      服务名称:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"serviceName\" maxlength=\"100\" size=\"40\" dataType=\"Require\" msg=\"服务名称不能为空\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       服务CLASS:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"serviceClass\" maxlength=\"100\" size=\"40\" readOnly style=\"border:0 0 0 0\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t服务描述:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<textarea name=\"serviceDesc\" type=\"text\" rows=\"5\"  style=\"width:87%;\" class=\"inputtext01\" ></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      服务主机名:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"serviceHostname\" maxlength=\"128\" size=\"40\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      WS URL:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"wsUrl\" maxlength=\"255\" size=\"40\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t是否只运行一次:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"startRunonce\" size=\"1\" onChange=\"startRunonceOnChange();\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"N\">否\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"Y\">是\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t运行时间间隔:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" id=\"runInterval\" name=\"runInterval\" maxlength=\"16\" size=\"40\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t默认启动:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"startDefault\" size=\"1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"Y\">是\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"N\">否\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" class=\"button\"  onClick=\"saveSysTask();\" value=\"保存\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" class=\"button\"  onClick=\"window.close();\" value=\"取消\">\r\n");
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
      out.write("\tvar objData = window.dialogArguments;\r\n");
      out.write("\t\r\n");
      out.write("\tif(objData.serviceId!=null && objData.serviceId!='') {\r\n");
      out.write("\t\t$('serviceId').value = objData.serviceId;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(objData.serviceName!=null && objData.serviceName!='') {\r\n");
      out.write("\t\t$('serviceName').value = objData.serviceName;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(objData.serviceClass!=null && objData.serviceClass!='') {\r\n");
      out.write("\t\t$('serviceClass').value = objData.serviceClass;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(objData.serviceDesc!=null && objData.serviceDesc!='') {\r\n");
      out.write("\t\t$('serviceDesc').value = objData.serviceDesc;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(objData.serviceHostname!=null && objData.serviceHostname!='') {\r\n");
      out.write("\t\t$('serviceHostname').value = objData.serviceHostname;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(objData.wsUrl!=null && objData.wsUrl!='') {\r\n");
      out.write("\t\t$('wsUrl').value = objData.wsUrl;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(objData.runInterval!=null && objData.runInterval!='') {\r\n");
      out.write("\t\t$('runInterval').value = objData.runInterval;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(objData.startDefault!=null && objData.startDefault!='') {\r\n");
      out.write("\t\t$('startDefault').value = objData.startDefault;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(objData.startRunonce!=null && objData.startRunonce!='') {\r\n");
      out.write("\t\t$('startRunonce').value = objData.startRunonce;\r\n");
      out.write("\t}\r\n");
      out.write("   \r\n");
      out.write("    function saveSysTask() {\r\n");
      out.write("    \tif (!validateForm(updateSysServiceConfigForm, 1)) {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        if($('startRunonce').value == 'N' && $('runInterval').value == '') {\r\n");
      out.write("        \talert('运行时间间隔不能为空且必须为整数');\r\n");
      out.write("        \treturn false;\r\n");
      out.write("        }\r\n");
      out.write("\t\tvar formObj = $('updateSysServiceConfigForm').serialize(true); \r\n");
      out.write("    \tsysServiceConfig.updateSelectiveDataToSysServiceConfig(formObj,callBackDoSave);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function callBackDoSave(str) {\r\n");
      out.write("    \tif(str == \"\") {\r\n");
      out.write("    \t\thandler('存在异常情况!');\r\n");
      out.write("    \t} else {\r\n");
      out.write("    \t\talert(\"操作成功\");\r\n");
      out.write("\t    \twindow.returnValue = '1';\r\n");
      out.write("\t    \twindow.close();\r\n");
      out.write("    \t}\r\n");
      out.write("    \t\r\n");
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
