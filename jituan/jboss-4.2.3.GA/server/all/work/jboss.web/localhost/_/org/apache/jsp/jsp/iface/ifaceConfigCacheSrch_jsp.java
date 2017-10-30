package org.apache.jsp.jsp.iface;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ifaceConfigCacheSrch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type='text/javascript' src='/dwr/interface/ifaceConfigCacheAction.js'></script>\r\n");
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
      out.write("<title>OSS接口平台</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/frameservice.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\t/*\r\n");
      out.write("\t *  异常处理\r\n");
      out.write("\t */\r\n");
      out.write("\tDWREngine.setErrorHandler(handler);\r\n");
      out.write("\t \r\n");
      out.write("\t function handler(errors) {\r\n");
      out.write("        alert(errors);\r\n");
      out.write("        enableForm(\"commonQueryForm\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("\t/*\r\n");
      out.write("\t *  insert operation\r\n");
      out.write("\t */\r\n");
      out.write("\tfunction insertOperation(rootId) {\r\n");
      out.write("\t\tif(rootId!=null && rootId!='') {\r\n");
      out.write("\t\t\tifaceConfigCacheAction.selectRecordByRootId(rootId,callbackInsertOperation);\r\n");
      out.write("\t\t\tdisableForm();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction callbackInsertOperation(instanceAndRootId) {\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\tvar pos = instanceAndRootId.indexOf(':');\r\n");
      out.write("\t\tif(pos == 0) {\r\n");
      out.write("\t\t\tifaceConfigCacheAction.insertBySelective(instanceAndRootId,callbackInsertOperation2);\r\n");
      out.write("\t\t\tdisableForm();\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tif(confirm(\"已经存在静态数据实例记录，还继续插入？\")) {\r\n");
      out.write("\t\t\t\tifaceConfigCacheAction.insertBySelective(instanceAndRootId,callbackInsertOperation2);\r\n");
      out.write("\t\t\t\tdisableForm();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction callbackInsertOperation2() {\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\talert('操作成功!');\r\n");
      out.write("\t\tshowAllData();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/*\r\n");
      out.write("\t *  remove operation\r\n");
      out.write("\t */\r\n");
      out.write("\tfunction removeOperation(rootId) {\r\n");
      out.write("\t\tif(rootId!=null && rootId!='') {\r\n");
      out.write("\t\t\tifaceConfigCacheAction.selectRecordByRootId(rootId,callbackRemoveOperation);\r\n");
      out.write("\t\t\tdisableForm();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction callbackRemoveOperation(instanceAndRootId) {\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\tvar pos = instanceAndRootId.indexOf(':');\r\n");
      out.write("\t\tif(pos != 0) {\r\n");
      out.write("\t\t\tif(confirm(\"确定删除？\")) {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\tifaceConfigCacheAction.findMapping(instanceAndRootId,callbackRemoveFun);\r\n");
      out.write("\t\t\t\tdisableForm();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert('不存在对应的静态实例记录!');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction callbackRemoveFun(info) {\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\tif(info=='cannotDelete') {\r\n");
      out.write("\t\t\tif(confirm('要删除静态实例数据，请先删除相关静态配置数据！是否跳转到静态配置界面？')){\r\n");
      out.write("\t\t\t\t//document.form1.action = \"/sys/sysDicConfigAction.do?method=toSysDicConfigSrch\";\r\n");
      out.write("\t\t\t\t//document.form1.submit();\r\n");
      out.write("\t\t\t\twindow.location.href = \"/jsp/iface/ifaceConfigMapping2.jsp\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"删除成功!\");\r\n");
      out.write("\t\t\tshowAllData();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/*\r\n");
      out.write("\t *  update operation\r\n");
      out.write("\t */\r\n");
      out.write("\tfunction updateOperation(rootId) {\r\n");
      out.write("\t\tif(rootId!=null && rootId!='') {\r\n");
      out.write("\t\t\tifaceConfigCacheAction.selectRecordByRootId(rootId,callbackUpdateOperation);\r\n");
      out.write("\t\t\tdisableForm();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction callbackUpdateOperation(instanceAndRootId) {\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\tif(instanceAndRootId!=null && instanceAndRootId!=''){\r\n");
      out.write("\t\t\tvar pos = instanceAndRootId.indexOf(':');\r\n");
      out.write("\t\t\tif(pos != 0) {\r\n");
      out.write("\t\t\t\tif(confirm('确定更改已配置实例名称?')) {\r\n");
      out.write("\t\t\t\t\tifaceConfigCacheAction.updateInstanceByInstanceAndRootId(instanceAndRootId,callbackUpdateFun);\r\n");
      out.write("\t\t\t\t\tdisableForm();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\talert('静态实例表中不存在这条记录，无法更新操作!');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction callbackUpdateFun() {\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\talert(\"删除成功!\");\r\n");
      out.write("\t\tshowAllData();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/*\r\n");
      out.write("\t *  查询按钮，根据限定条件，重新刷新界面\r\n");
      out.write("\t */\r\n");
      out.write("\tfunction showAllData() {\r\n");
      out.write("\t\tDWRUtil.useLoadingMessage('数据读取中...');\r\n");
      out.write("\t\tvar formObj = $('commonQueryForm').serialize(true); \r\n");
      out.write("\t\tifaceConfigCacheAction.getIfaceWxtogbeomsList(formObj,showTablequeryResultList);\r\n");
      out.write("\t\tdisableForm();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction queryResultList(str) {\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\t$('queryResultList').innerHTML = str;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" topmargin=\"4\" >\r\n");
      out.write("<form name=\"form1\" method=\"post\" action=\"\"></form>\r\n");
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
      out.write("      <td align=\"right\"  bgcolor=\"#F4F4F4\" width=\"130\">响应类型：</td>\r\n");
      out.write("      <td>\r\n");
      out.write("      \t<select size=\"1\" id=\"responseCode\" name=\"responseCode\">\r\n");
      out.write("\t        <option value=\"\"></option>\r\n");
      out.write("\t\t\t<option value=\"0\">成功</option>\r\n");
      out.write("\t\t\t<option value=\"-1\">失败</option>\r\n");
      out.write("\t\t  </select>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td align=\"right\"  bgcolor=\"#F4F4F4\" >静态数据编码：</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"sysCode\" class=\"inputtext01\" value=\"\"/></td>\r\n");
      out.write("  \t  <td align=\"right\"  bgcolor=\"#F4F4F4\" >实例编码：</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"itemId\" class=\"inputtext01\" value=\"\"/></td>\r\n");
      out.write("      <td align=\"right\"  bgcolor=\"#F4F4F4\" >操作类型：</td>\r\n");
      out.write("      <td>\r\n");
      out.write("      \t<select size=\"1\" id=\"changetype\" name=\"changetype\">\r\n");
      out.write("\t        <option value=\"\"></option>\r\n");
      out.write("\t\t\t<option value=\"update\">更新</option>\r\n");
      out.write("\t\t\t<option value=\"insert\">新增</option>\r\n");
      out.write("\t\t\t<option value=\"delete\">删除</option>\r\n");
      out.write("\t\t  </select>\r\n");
      out.write("      </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t\t<td colspan=7></td>\r\n");
      out.write("\t   <td align=\"left\">\r\n");
      out.write("\t   \t    <input type=\"button\" class=\"button\" value=\"查询(Q)\" accesskey=\"Q\"  onclick=\"initqueryResultList();\" align=\"right\"/>\r\n");
      out.write("       \t\t<input type=\"button\" class=\"button\" value=\"重置(R)\" accesskey=\"R\"  onclick=\"reset();\" align=\"right\"/>\r\n");
      out.write("       \t\t<input type=\"hidden\" name=\"pageNumber\" value=\"1\" />\r\n");
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
      out.write("\t系统配置列表\r\n");
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
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tif(Prototype.Browser.Opera){\r\n");
      out.write("\t\t\tinitqueryResultList(); \r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t\tEvent.observe(window, 'load', initqueryResultList); \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction initqueryResultList(){\r\n");
      out.write("\t\tDWRUtil.useLoadingMessage('数据读取中...');\r\n");
      out.write("\t\ttrimForm();\r\n");
      out.write("\t\tvar formObj = $('commonQueryForm').serialize(true); \r\n");
      out.write("\t\tifaceConfigCacheAction.getIfaceWxtogbeomsList(formObj,showTablequeryResultList);\r\n");
      out.write("\t\tdisableForm();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction showTablequeryResultList(str){\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\t$('queryResultList').innerHTML = str;\r\n");
      out.write("\t}\r\n");
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
