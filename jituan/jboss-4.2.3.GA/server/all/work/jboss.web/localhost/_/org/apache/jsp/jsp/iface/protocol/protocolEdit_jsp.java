package org.apache.jsp.jsp.iface.protocol;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class protocolEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/jsp/common/allTag.jsp");
    _jspx_dependants.add("/WEB-INF/custom-tag.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fblocimp_005fsysDicDis_005fvalue_005fiddValue_005fdicItemIn_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fblocimp_005fsysDicDis_005fvalue_005fiddValue_005fdicItemIn_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fblocimp_005fsysDicDis_005fvalue_005fiddValue_005fdicItemIn_005fnobody.release();
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
      out.write("<script type='text/javascript' src='/dwr/interface/ifaceConfigProtocolAction.js'></script>\r\n");

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
      out.write("    \r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form name=\"ifaceConfigProtocolEditForm\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"applicationId\" name=\"applicationId\" value=\"\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"protocolId\" name=\"protocolId\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t<table border=1 width=\"100%\" CELLPADDING=0 CELLSPACING=0 class=\"table01\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"100%\"  class=\"headers\" height=\"24px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"headerfont\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"3%\"></td>\r\n");
      out.write("\t\t\t\t                            <td width=\"40%\">编辑接口系统配置</td>\r\n");
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
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\" width=\"15%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      服务类别:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\" width=\"35%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select size=\"1\" id=\"serveType\" name=\"serveType\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"SERVER\" selected>服务器端\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"CLIENT\">客户端\r\n");
      out.write("\t\t  \t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\" width=\"15%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       用户名:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\" width=\"35%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"userName\" maxlength=\"200\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      电话号码:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"phoneNumber\" maxlength=\"200\" Require=\"false\" dataType=\"Phone\" msg=\"电话号码格式不正确\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       Email 地址:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"emailAddress\" maxlength=\"200\" size=\"30\" require=\"false\" dataType=\"Email\" msg=\"信箱格式不正确\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      接口名称:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"interfaceName\" maxlength=\"100\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       协议名称:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_blocimp_005fsysDicDis_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tFTP地址:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"remoteHost\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.remoteHost}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"200\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    FTP端口:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"remotePort\" maxlength=\"255\" size=\"30\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      授权帐户:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"authAccount\" maxlength=\"200\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      提供商名称:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"providerName\" maxlength=\"200\" size=\"30\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      帐户密码:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"authPassword\" maxlength=\"200\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       JNDI 名称:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"jndiName\" maxlength=\"200\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       服务名称:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"serviceName\" maxlength=\"200\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      JMS消息目的地:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"destination\" maxlength=\"200\" size=\"30\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      端口名称:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"portName\" maxlength=\"200\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       命名空间:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" name=\"nameSpace\" maxlength=\"255\" size=\"30\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td noWrap bgcolor=\"#F4F4F4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   WSDL地址:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputtext01\" id=\"wsdlAddr\" name=\"wsdlAddr\" maxlength=\"200\" size=\"80\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"4\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" class=\"button\"  onClick=\"ifaceConfigProtocolSave();\" value=\"保存\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" class=\"button\"  onClick=\"ifaceConfigProtocolClose();\" value=\"取消\">\r\n");
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
      out.write("\tvar protocolId = window.dialogArguments;\r\n");
      out.write("\t\r\n");
      out.write("\tinitIfaceConfigProtocolEdit();\r\n");
      out.write("\t\r\n");
      out.write("\tfunction initIfaceConfigProtocolEdit() {\r\n");
      out.write("\t\ttrimForm();\r\n");
      out.write("\t\tifaceConfigProtocolAction.selectProtocolByPrimaryKey(protocolId,callbackFun);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction callbackFun(objData) {\r\n");
      out.write("\t\tif(objData.serveType!=null && objData.serveType!='') {\r\n");
      out.write("\t\t\t$('serveType').value = objData.serveType;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objData.userName!=null && objData.userName!='') {\r\n");
      out.write("\t\t\t$('userName').value = objData.userName;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objData.phoneNumber!=null && objData.phoneNumber!='') {\r\n");
      out.write("\t\t\t$('phoneNumber').value = objData.phoneNumber;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objData.emailAddress!=null && objData.emailAddress!='') {\r\n");
      out.write("\t\t\t$('emailAddress').value = objData.emailAddress;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objData.interfaceName!=null && objData.interfaceName!='') {\r\n");
      out.write("\t\t\t$('interfaceName').value = objData.interfaceName;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objData.protocolName!=null && objData.protocolName!='') {\r\n");
      out.write("\t\t\t$('protocolName').value = objData.protocolName;\r\n");
      out.write("\t\t\tif($('protocolName').value == 'ws') {\r\n");
      out.write("\t\t\t\t$('jndiName').readOnly = true;\r\n");
      out.write("\t    \t\t$('providerName').readOnly = true;\r\n");
      out.write("\t    \t\t$('destination').readOnly = true;\r\n");
      out.write("\t\t\t} else if($('protocolName').value == 'jms') {\r\n");
      out.write("\t\t\t\t$('nameSpace').readOnly = true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objData.authAccount!=null && objData.authAccount!='') {\r\n");
      out.write("\t\t\t$('authAccount').value = objData.authAccount;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objData.providerName!=null && objData.providerName!='') {\r\n");
      out.write("\t\t\t$('providerName').value = objData.providerName;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objData.authPassword!=null && objData.authPassword!='') {\r\n");
      out.write("\t\t\t$('authPassword').value = objData.authPassword;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objData.jndiName!=null && objData.jndiName!='') {\r\n");
      out.write("\t\t\t$('jndiName').value = objData.jndiName;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objData.wsdlAddr && objData.wsdlAddr!='') {\r\n");
      out.write("\t\t\t$('wsdlAddr').value = objData.wsdlAddr;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objData.serviceName!=null && objData.serviceName!='') {\r\n");
      out.write("\t\t\t$('serviceName').value = objData.serviceName;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objData.destination!=null && objData.destination!='') {\r\n");
      out.write("\t\t\t$('destination').value = objData.destination;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objData.portName!=null && objData.portName!='') {\r\n");
      out.write("\t\t\t$('portName').value = objData.portName;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objData.nameSpace!=null && objData.nameSpace!='') {\r\n");
      out.write("\t\t\t$('nameSpace').value = objData.nameSpace;\r\n");
      out.write("\t\t} \r\n");
      out.write("\t\tif(objData.protocolId!=null && objData.protocolId!='') {\r\n");
      out.write("\t\t\t$('protocolId').value = objData.protocolId;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objData.applicationId!=null && objData.applicationId!='') {\r\n");
      out.write("\t\t\t$('applicationId').value = objData.applicationId;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objData.remoteHost!=null && objData.remoteHost!='') {\r\n");
      out.write("\t\t\t$('remoteHost').value = objData.remoteHost;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objData.remotePort!=null && objData.remotePort!='') {\r\n");
      out.write("\t\t\t$('remotePort').value = objData.remotePort;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction operationProtocolSelected(obj) {\r\n");
      out.write("    \tif(obj.value == 'jms') {\r\n");
      out.write("    \t\t$('nameSpace').value = '';\r\n");
      out.write("    \t\t$('nameSpace').readOnly = true;\r\n");
      out.write("    \t\t$('jndiName').readOnly = false;\r\n");
      out.write("    \t\t$('providerName').readOnly = false;\r\n");
      out.write("    \t\t$('destination').readOnly = false;\r\n");
      out.write("    \t} else if(obj.value == 'ws') {\r\n");
      out.write("    \t\t$('nameSpace').value = '';\r\n");
      out.write("    \t\t$('nameSpace').readOnly = false;\r\n");
      out.write("    \t\t$('jndiName').readOnly = true;\r\n");
      out.write("    \t\t$('providerName').readOnly = true;\r\n");
      out.write("    \t\t$('destination').readOnly = true;\r\n");
      out.write("    \t\t$('jndiName').value = '';\r\n");
      out.write("    \t\t$('providerName').value = '';\r\n");
      out.write("    \t\t$('destination').value = '';\r\n");
      out.write("    \t} else {\r\n");
      out.write("    \t\t$('jndiName').readOnly = false;\r\n");
      out.write("    \t\t$('providerName').readOnly = false;\r\n");
      out.write("    \t\t$('destination').readOnly = false;\r\n");
      out.write("    \t\t$('nameSpace').readOnly = false;\r\n");
      out.write("    \t}\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function warnInfo(obj) {\r\n");
      out.write("    \tif(obj.readOnly == true){\r\n");
      out.write("    \t\talert('JNDI名称，提供商名称，JMS消息目的地只有当协议名称为jms时才有效.');\r\n");
      out.write("    \t\treturn false;\t\r\n");
      out.write("    \t}\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function warnInfo2(obj) {\r\n");
      out.write("    \tif(obj.readOnly == true){\r\n");
      out.write("    \t\talert('命名空间只有当协议名称为ws时才有效.');\r\n");
      out.write("    \t\treturn false;\t\r\n");
      out.write("    \t}\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function ifaceConfigProtocolClose() {\r\n");
      out.write("    \twindow.close();\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function ifaceConfigProtocolSave() {\r\n");
      out.write("    \tif (!validateForm(ifaceConfigProtocolEditForm, 1)) {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\t\tvar formObj = $('ifaceConfigProtocolEditForm').serialize(true); \r\n");
      out.write("    \tifaceConfigProtocolAction.updateIfaceConfigProtocolRecord(formObj,callBackDoSave);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function callBackDoSave() {\r\n");
      out.write("    \talert(\"操作成功\");\r\n");
      out.write("    \twindow.returnValue = 1;\r\n");
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

  private boolean _jspx_meth_blocimp_005fsysDicDis_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  blocimp:sysDicDis
    com.regaltec.blocimp.web.tag.SysDicDis _jspx_th_blocimp_005fsysDicDis_005f0 = (com.regaltec.blocimp.web.tag.SysDicDis) _005fjspx_005ftagPool_005fblocimp_005fsysDicDis_005fvalue_005fiddValue_005fdicItemIn_005fnobody.get(com.regaltec.blocimp.web.tag.SysDicDis.class);
    _jspx_th_blocimp_005fsysDicDis_005f0.setPageContext(_jspx_page_context);
    _jspx_th_blocimp_005fsysDicDis_005f0.setParent(null);
    // /jsp/iface/protocol/protocolEdit.jsp(101,15) name = iddValue type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_blocimp_005fsysDicDis_005f0.setIddValue("PROTOCOL_TYPE");
    // /jsp/iface/protocol/protocolEdit.jsp(101,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_blocimp_005fsysDicDis_005f0.setValue("protocolName");
    // /jsp/iface/protocol/protocolEdit.jsp(101,15) name = dicItemIn type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_blocimp_005fsysDicDis_005f0.setDicItemIn((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.protocolId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_blocimp_005fsysDicDis_005f0 = _jspx_th_blocimp_005fsysDicDis_005f0.doStartTag();
    if (_jspx_th_blocimp_005fsysDicDis_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fblocimp_005fsysDicDis_005fvalue_005fiddValue_005fdicItemIn_005fnobody.reuse(_jspx_th_blocimp_005fsysDicDis_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fblocimp_005fsysDicDis_005fvalue_005fiddValue_005fdicItemIn_005fnobody.reuse(_jspx_th_blocimp_005fsysDicDis_005f0);
    return false;
  }
}
