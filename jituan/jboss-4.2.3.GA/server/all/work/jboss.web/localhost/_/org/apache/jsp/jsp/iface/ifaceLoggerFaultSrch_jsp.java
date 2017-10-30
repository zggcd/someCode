package org.apache.jsp.jsp.iface;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ifaceLoggerFaultSrch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type='text/javascript' src='/dwr/interface/ifaceLoggerFaultAction.js'></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/cb2.js\"></script>\r\n");

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
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/cb2.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/main.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/imgurl.css\" type=\"text/css\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>异常日志列表</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/frameservice.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\tfunction openLogFacadeDetail(repositoryId,repairId) {\r\n");
      out.write("\t\tif(repositoryId!=null && repositoryId!='') {\r\n");
      out.write("\t\t\tifaceLoggerFaultAction.getIfaceLogTrace(repositoryId,showOneRowqueryResultList);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction showOneRowqueryResultList(obj) {\r\n");
      out.write("\t\twindow.showModalDialog(\"ifaceLoggerFaultDetail.jsp\",obj,\"dialogWidth=550px;dialogHeight=540px;center=yes;status=no;scroll=no\");\r\n");
      out.write("\t\tshowAllData();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction showAllData() {\r\n");
      out.write("\t\tDWRUtil.useLoadingMessage('数据读取中...');\r\n");
      out.write("\t\t//-------2009/10/14添加---------\r\n");
      out.write("\t\tvar formObj = $('commonQueryForm').serialize(true); \r\n");
      out.write("\t\tformObj.applicationName = '';\r\n");
      out.write("\t\tformObj.faultCause = '';\r\n");
      out.write("\t\tformObj.repairUser = '';\r\n");
      out.write("\t\t//-------2009/10/14添加---------\r\n");
      out.write("\t\tifaceLoggerFaultAction.getIfaceLogRepairList(formObj,callBackQueryResultList);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction callBackQueryResultList(str) {\r\n");
      out.write("\t\t$('queryResultList').innerHTML = str;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t //判断是否将查询块收起\r\n");
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
      out.write("\t    <table  border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"font-size:13px\" >\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td  class=\"tabpaneleft2\"></td>\r\n");
      out.write("\t\t\t<td class=\"tabpanebg2\"   width=\"120\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/main_01/ico_fellow.gif\" width=\"18\" height=\"15\">\r\n");
      out.write("\t\t\t查询条件\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/main/button_bug2.gif\"   width=\"19\" height=\"17\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td class=\"tabpaneright2\"> </td>\r\n");
      out.write("\t\t   </tr>\r\n");
      out.write("\t\t    </table>\r\n");
      out.write("\t\t    </td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t    <td bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t    \t<div id=\"queryCondicationArea\">\r\n");
      out.write("\t\t\t    <table class=table id=powergrid style=\"FONT-SIZE: 13px\"\r\n");
      out.write("\t\t\t            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box\r\n");
      out.write("\t\t\t            pcolor=\"#BCC8F5\">\r\n");
      out.write("\t\t\t\t   <tr style=\"display:display\">\r\n");
      out.write("\t\t\t\t      <td noWrap bgcolor=\"#F4F4F4\" align=\"right\">接口名称：</td>\r\n");
      out.write("\t\t\t\t      <td>\r\n");
      out.write("\t\t\t\t      <select name=\"applicationName\" size=\"1\" id=\"applicationName\">\r\n");
      out.write("\t\t\t\t\t\t <option value=\"\">---选择接口名称---</option>\r\n");
      out.write("\t\t\t\t\t  </select>\r\n");
      out.write("\t\t\t\t\t  </td>\r\n");
      out.write("\t\t\t\t      <td noWrap bgcolor=\"#F4F4F4\" align=\"right\">故障原因：</td>\r\n");
      out.write("\t\t\t\t      <td><input type=\"text\" name=\"faultCause\" class=\"inputtext01\" value=\"\"/></td>\r\n");
      out.write("\t\t\t\t      <td noWrap bgcolor=\"#F4F4F4\" align=\"right\">修复人：</td>\r\n");
      out.write("\t\t\t\t      <td><input type=\"text\" name=\"repairUser\" class=\"inputtext01\" value=\"\"/></td>\r\n");
      out.write("\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t  \t\t<td></td>\r\n");
      out.write("\t\t\t\t  \t\t<td border=0></td>\r\n");
      out.write("\t\t\t\t  \t\t<td border=0></td>\r\n");
      out.write("\t\t\t\t  \t\t<td border=0></td>\r\n");
      out.write("\t\t\t\t  \t\t<td border=0></td>\r\n");
      out.write("\t\t\t\t\t   <td align=\"left\">\r\n");
      out.write("\t\t\t\t\t   \t    <input type=\"button\" class=\"button\" value=\"查询(Q)\" accesskey=\"Q\"  onclick=\"initqueryResultList();\" align=\"right\"/>\r\n");
      out.write("\t\t\t\t       \t\t<input type=\"button\" class=\"button\" value=\"重置(R)\" accesskey=\"R\"  onclick=\"reset();\" align=\"right\"/>\r\n");
      out.write("\t\t\t\t       \t\t<input type=\"hidden\" name=\"pageNumber\" value=\"1\" />\r\n");
      out.write("       \t\t\t\t\t\t<input type=\"hidden\" name=\"maxResults\" value=\"15\" />\r\n");
      out.write("\t\t\t\t\t   </td>\r\n");
      out.write("\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t      </td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t    <td>\r\n");
      out.write("\t\t\t    <table  border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"font-size:13px\" >\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td  class=\"tabpaneleft2\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"tabpanebg2\"   width=\"120\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/main_01/ico_fellow.gif\" width=\"18\" height=\"15\">\r\n");
      out.write("\t\t\t\t\t\t异常日志列表\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"tabpaneright2\">\r\n");
      out.write("\t\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t    </tr>\r\n");
      out.write("\t\t\t    </table>\r\n");
      out.write("\t\t    </td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t    <td bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t    <table class=table id=powergrid style=\"FONT-SIZE: 13px\"\r\n");
      out.write("\t\t\t            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box\r\n");
      out.write("\t\t\t            pcolor=\"#BCC8F5\">\r\n");
      out.write("\t\t\t\t    <tr>\r\n");
      out.write("\t\t\t\t      <td> \r\n");
      out.write("\t\t\t\t\t    <div id=\"queryResultList\" style=\"PADDING-RIGHT:0px;\">\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t      </td>\r\n");
      out.write("\t\t\t\t   </tr>\r\n");
      out.write("\t\t\t   </table>\r\n");
      out.write("\t\t    </td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("  </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tif(Prototype.Browser.Opera){\r\n");
      out.write("\t\t\tinitqueryResultList(); \r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t\tEvent.observe(window, 'load', initqueryResultList); \r\n");
      out.write("\t\t\tEvent.observe(window, 'load', getApplicationNameList); \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//初始化操作\r\n");
      out.write("\tfunction initqueryResultList(){\r\n");
      out.write("\t\tDWRUtil.useLoadingMessage('数据读取中...');\r\n");
      out.write("\t\ttrimForm();\r\n");
      out.write("\t\tvar formObj = $('commonQueryForm').serialize(true); \r\n");
      out.write("\t\t//日志列表信息操作\r\n");
      out.write("\t\tifaceLoggerFaultAction.getIfaceLogRepairList(formObj,showTablequeryResultList);\r\n");
      out.write("\t\tdisableForm();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction showTablequeryResultList(str){\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\t$('queryResultList').innerHTML = str;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//应用程序名称又或者接口名称集合取得操作\r\n");
      out.write("\tfunction getApplicationNameList() {\r\n");
      out.write("\t \tifaceLoggerFaultAction.getIfaceApplicationNameList(callBackApplicationNameList);\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t function callBackApplicationNameList(objList) {\r\n");
      out.write("\t \tif(objList!=null) {\r\n");
      out.write("\t \t\tDWRUtil.removeAllOptions(\"applicationName\");\r\n");
      out.write("\t \t\tDWRUtil.addOptions(\"applicationName\", objList);\r\n");
      out.write("\t \t}\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
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
