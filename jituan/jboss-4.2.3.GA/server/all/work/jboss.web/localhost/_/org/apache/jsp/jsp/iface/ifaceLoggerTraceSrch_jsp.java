package org.apache.jsp.jsp.iface;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ifaceLoggerTraceSrch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/jsp/widget/calendar.jsp");
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

      out.write('\r');
      out.write('\n');
      out.write("<script type='text/javascript' src='/js/calendar/calendarccatscas.js'></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"/js/calendar/skins/aqua/theme.css\" title=\"Aqua\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/calendar/calendar.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/calendar/calendar-zh.js\"></script>");
      out.write('\r');
      out.write('\n');

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
      out.write("<title>OSS接口平台</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/js/tab/webfx.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/cb2.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/main.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/imgurl.css\" type=\"text/css\">\r\n");
      out.write("<script type='text/javascript' src='/js/prototype.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/js/commonjs.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/js/validator.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/dwr/engine.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/dwr/util.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/dwr/interface/ifaceLoggerTraceAction.js'></script>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tfunction openIfaceLogRepositoryMWBDetail(applicationId,repositoryId) {\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\twindow.showModalDialog(\"/iface/ifaceLoggerTraceAction.do?method=getIfaceLogRepositoryDataSrchDetail&repositoryId=\" + repositoryId + \"&dc=\" + new Date(), null, \"dialogWidth:800px;dialogHeight:650px;center:yes;status:no;\");\r\n");
      out.write("\t\t//ifaceLoggerTraceAction.getIfaceLogRepositoryDataSrchDetail(applicationId,repositoryId,callBackLogRepositoryDetail);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("     //判断是否将查询块收起\r\n");
      out.write("\t function ev_hiddenQueryTable(){\r\n");
      out.write("\t\tif ($('queryCondicationArea').style.display == \"none\") {\r\n");
      out.write("\t\t\t\t$('queryCondicationArea').show();\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$('queryCondicationArea').hide();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t }\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" topmargin=\"4\" >\r\n");
      out.write("<form name=\"commonQueryForm\">\r\n");
      out.write("<input type=\"hidden\" id=\"orderByClause\" name=\"orderByClause\" value=\"\" />\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"5\" cellspacing=\"0\" bgcolor=\"#FFFFFF\"  height=\"100%\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td valign=\"top\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("    <table  border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"font-size:13px\" >\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td  class=\"tabpaneleft2\"></td>\r\n");
      out.write("\t<td class=\"tabpanebg2\"   width=\"120\">\r\n");
      out.write("\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/main_01/ico_fellow.gif\" width=\"18\" height=\"17\" onClick=\"ev_hiddenQueryTable();\">\r\n");
      out.write("\t查询条件\r\n");
      out.write("\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/main/button_bug2.gif\"   width=\"19\" height=\"17\">\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td class=\"tabpaneright2\"> </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <div id=\"queryCondicationArea\">\r\n");
      out.write("    <table class=table id=powergrid style=\"FONT-SIZE: 13px\"\r\n");
      out.write("            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box\r\n");
      out.write("            pcolor=\"#BCC8F5\">\r\n");
      out.write("    <tr style=\"display:display\">\r\n");
      out.write("      <td align=\"right\"  bgcolor=\"#F4F4F4\" width=\"130\">接口名称：</td>\r\n");
      out.write("      <td>\r\n");
      out.write("       \t<select size=\"1\" id=\"applicationName\" name=\"applicationName\">\r\n");
      out.write("\t\t</select>     \r\n");
      out.write("      </td>\r\n");
      out.write("      <td align=\"right\"  bgcolor=\"#F4F4F4\" >日志类型：</td>\r\n");
      out.write("      <td>\r\n");
      out.write("      \t<select size=\"1\" id=\"traceLevel\" name=\"traceLevel\">\r\n");
      out.write("      \t\t<option value=\"\"></option>\r\n");
      out.write("      \t\t<option value=\"TRACE\">正常</option>\r\n");
      out.write("      \t\t<option value=\"ERROR\">异常</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t   </td>\r\n");
      out.write("\t   <td align=\"right\"  bgcolor=\"#F4F4F4\" >方法名称：</td>\r\n");
      out.write("\t   <td>\r\n");
      out.write("\t   \t<input name=\"methodName\" class=\"inputtext01\" size=\"20\" />\r\n");
      out.write("\t   </td>\r\n");
      out.write("\t   <td align=\"right\"  bgcolor=\"#F4F4F4\" >日志内容：</td>\r\n");
      out.write("\t   <td>\r\n");
      out.write("\t   \t<input name=\"traceText\" class=\"inputtext01\" size=\"20\" />\r\n");
      out.write("\t   </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("      <td align=\"right\"  bgcolor=\"#F4F4F4\" width=\"130\">开始日期：</td>\r\n");
      out.write("      <td>\r\n");
      out.write("       \t<input name=\"createOnStart\" class=\"inputtext01\" size=\"10\" readonly maxlength=\"10\" dataType=\"Date\" msg=\"开始日期输入错误\" onclick=\"return showCalendar('createOnStart', '%Y-%m-%d');\" />\r\n");
      out.write("      </td>\r\n");
      out.write("      <td align=\"right\"  bgcolor=\"#F4F4F4\" >结束日期：</td>\r\n");
      out.write("      <td>\r\n");
      out.write("      \t<input name=\"createOnEnd\" class=\"inputtext01\" size=\"10\" readonly maxlength=\"10\" dataType=\"Date\" msg=\"结束日期输入错误\" onclick=\"return showCalendar('createOnEnd', '%Y-%m-%d');\" />\r\n");
      out.write("\t   </td>\r\n");
      out.write("\t   <td align=\"right\"  bgcolor=\"#F4F4F4\" >工单内容：</td>\r\n");
      out.write("\t   <td>\r\n");
      out.write("\t   \t<input name=\"xmlDocument\" class=\"inputtext01\" size=\"20\" />\r\n");
      out.write("\t   </td>\r\n");
      out.write("\t   <td align=\"right\"  bgcolor=\"#F4F4F4\" >是否归档：</td>\r\n");
      out.write("\t   <td>\r\n");
      out.write("\t   \t <select id=\"isArchived\" name=\"isArchived\">\r\n");
      out.write("\t   \t \t<option value=\"0\" selected>否</option>\r\n");
      out.write("\t   \t \t<option value=\"1\">是</option>\r\n");
      out.write("\t   \t </select>\r\n");
      out.write("\t   </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t  <td colSpan=\"8\" align=\"right\">\r\n");
      out.write("\t   \t    <input type=\"button\" class=\"button\" value=\"查询(Q)\" accesskey=\"Q\"  onclick=\"initqueryResultList();\" align=\"right\"/>\r\n");
      out.write("       \t\t<input type=\"button\" class=\"button\" value=\"重置(R)\" accesskey=\"R\"  onclick=\"reset();\" align=\"right\"/>\r\n");
      out.write("       \t\t<input type=\"hidden\" name=\"relateId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.relateId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("       \t\t<input type=\"hidden\" name=\"skipResults\" value=\"0\" />\r\n");
      out.write("       \t\t<input type=\"hidden\" name=\"maxResults\" value=\"15\" />\r\n");
      out.write("\t   </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("      </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<br>\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("    <table  border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"font-size:13px\" >\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td  class=\"tabpaneleft2\"></td>\r\n");
      out.write("\t<td class=\"tabpanebg2\"   width=\"120\">\r\n");
      out.write("\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/main_01/ico_fellow.gif\" width=\"18\" height=\"15\">\r\n");
      out.write("\t日志列表\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td class=\"tabpaneright2\">\r\n");
      out.write("   </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <table class=table id=powergrid style=\"FONT-SIZE: 13px\"\r\n");
      out.write("            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box\r\n");
      out.write("            pcolor=\"#BCC8F5\">\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td> <div id=\"queryResultList\" style=\"PADDING-RIGHT:0px;\">\r\n");
      out.write("           </div>\r\n");
      out.write("      </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("      </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("  </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<script>\r\n");
      out.write("\tif(Prototype.Browser.Opera){\r\n");
      out.write("\t\t\tinitqueryResultList(); \r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t\tEvent.observe(window, 'load', initqueryResultList); \r\n");
      out.write("\t\t\tEvent.observe(window, 'load', getApplicationNameList); \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction initqueryResultList(){\r\n");
      out.write("\t\tDWRUtil.useLoadingMessage('数据读取中...');\r\n");
      out.write("\t\ttrimForm();\r\n");
      out.write("\t\tvar formObj = $('commonQueryForm').serialize(true); \r\n");
      out.write("\t\tifaceLoggerTraceAction.getIfaceLogRepositoryDataList(formObj,showTablequeryResultList);\r\n");
      out.write("\t\tdisableForm();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction showTablequeryResultList(str){\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\t$('queryResultList').innerHTML = str;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//应用程序名称又或者接口名称集合取得操作(仅在初始化时使用)\r\n");
      out.write("\tfunction getApplicationNameList() {\r\n");
      out.write("\t \tifaceLoggerTraceAction.getIfaceApplicationNameList(callBackApplicationNameList);\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t function callBackApplicationNameList(objList) {\r\n");
      out.write("\t \tDWRUtil.removeAllOptions(\"applicationName\");\r\n");
      out.write("\t \tDWRUtil.addOptions(\"applicationName\", objList,\"applicationId\",\"applicationName\");\r\n");
      out.write("\t }\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
