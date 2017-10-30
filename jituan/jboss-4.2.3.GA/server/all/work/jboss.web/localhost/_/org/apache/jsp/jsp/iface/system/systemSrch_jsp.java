package org.apache.jsp.jsp.iface.system;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class systemSrch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/jsp/common/allTag.jsp");
    _jspx_dependants.add("/WEB-INF/custom-tag.tld");
    _jspx_dependants.add("/jsp/widget/wztool.jsp");
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
      out.write("<script type='text/javascript' src='/dwr/interface/ifaceConfigProtocolAction.js'></script>\r\n");
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
      out.write("<link rel=\"stylesheet\" href=\"/js/tab-view/css/tab-view.css\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/tab-view/js/ajax.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/tab-view/js/tab-view.js\"></script>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>OSS接口平台</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/frameservice.js\"></script>\r\n");
      out.write("<script><!--\r\n");
      out.write("\r\n");
      out.write("\tDWREngine.setErrorHandler(handler);\r\n");
      out.write("\t \r\n");
      out.write("\t function handler(errors) {\r\n");
      out.write("        alert(errors);\r\n");
      out.write("        enableForm(\"commonQueryForm\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\t//use\r\n");
      out.write("\tfunction doConfigSystemDel() {\r\n");
      out.write("\t\tvar list = Form.getInputs(\"queryResultList\", \"radio\", \"checkid\");\r\n");
      out.write("\t\tvar radioarray = $A(list);\r\n");
      out.write("\t\tvar resultArray = new Array();\r\n");
      out.write("\t\tvar flag = false;\r\n");
      out.write("\t\tvar appId = '';\r\n");
      out.write("\t\tradioarray.each(function (radiobox) {\r\n");
      out.write("\t\t\tif (radiobox.checked) {\r\n");
      out.write("\t\t\t\tflag = true;\r\n");
      out.write("\t\t\t\tappId = radiobox.value;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tif(flag) {\r\n");
      out.write("\t\t\tif(confirm('确定删除?')) {\r\n");
      out.write("\t\t\t\tifaceConfigSystemAction.deleteLogicByPrimaryKey(appId,delCallback);\r\n");
      out.write("\t\t\t\tdisableForm();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"请选择记录!\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction delCallback(str){\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\tif(str == ''){\r\n");
      out.write("\t\t\talert(\"操作成功\");\r\n");
      out.write("\t\t\tshowAllData();\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\thandler(str);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//use\r\n");
      out.write("\tfunction addIfaceConfigSystem() {\r\n");
      out.write("    \tvar obj = window.showModalDialog(\"/jsp/iface/system/systemAdd.jsp\",null,\"dialogWidth=500px;dialogHeight=500px;center=yes;status=no;scroll=no\");\r\n");
      out.write("    \tif(obj!=-1) {\r\n");
      out.write("    \t\tshowAllData();\r\n");
      out.write("    \t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//use\r\n");
      out.write("\tfunction editIfaceConfigSystem(appid,appname,appsn) {\r\n");
      out.write("\t\tvar obj = new Object();\r\n");
      out.write("\t\tobj.applicationId = appid;\r\n");
      out.write("\t\tobj.applicationName = appname;\r\n");
      out.write("\t\tobj.applicationSn = appsn;\r\n");
      out.write("\t\tvar rtnObj = window.showModalDialog(\"/jsp/iface/system/systemEdit.jsp\",obj,\"dialogWidth=500px;dialogHeight=500px;center=yes;status=no;scroll=no\");\r\n");
      out.write("    \tif(rtnObj!=-1) {\r\n");
      out.write("    \t\tshowAllData();\r\n");
      out.write("    \t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//use\r\n");
      out.write("\tfunction toIfaceConfigProtocal() {\r\n");
      out.write("\t\tvar list = Form.getInputs(\"queryResultList\", \"radio\", \"checkid\");\r\n");
      out.write("\t\tvar radioarray = $A(list);\r\n");
      out.write("\t\tvar resultArray = new Array();\r\n");
      out.write("\t\tvar flag = false;\r\n");
      out.write("\t\tvar appId = '';\r\n");
      out.write("\t\tradioarray.each(function (radiobox) {\r\n");
      out.write("\t\t\tif (radiobox.checked) {\r\n");
      out.write("\t\t\t\tflag = true;\r\n");
      out.write("\t\t\t\tappId = radiobox.value;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tif(flag) {\r\n");
      out.write("\t\t\tcreateNewTab('tabView1','接口协议配置列表','','/iface/ifaceConfigProtocolAction.do?method=ifaceConfigProtocolInit&applicationId='+appId,true);\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert('请选择记录!');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//use\r\n");
      out.write("\tfunction showAllData(){\r\n");
      out.write("\t\tDWRUtil.useLoadingMessage('数据读取中...');\r\n");
      out.write("\t\tvar formObj = $('commonQueryForm').serialize(true);\r\n");
      out.write("\t\tformObj.dictionaryName = '';\r\n");
      out.write("\t\tformObj.dictionaryCode = '';\r\n");
      out.write("\t\tifaceConfigSystemAction.getIfaceConfigSystemList(formObj,showTableAfterDel);\r\n");
      out.write("\t\tdisableForm();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction showTableAfterDel(str) {\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\t$('queryResultList').innerHTML = str;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("   </script>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" topmargin=\"0\" >\r\n");
      out.write("<form name=\"commonQueryForm\" >\r\n");
      out.write("<input type=\"hidden\" id=\"orderByClause\" name=\"orderByClause\" value=\"\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/wz_tooltip/wz_tooltip.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/wz_tooltip/tip_balloon.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/wz_tooltip/tip_centerwindow.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/wz_tooltip/tip_followscroll.js\"></script>");
      out.write("\r\n");
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
      out.write("/images/main_01/ico_fellow.gif\" width=\"18\" height=\"15\">\r\n");
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
      out.write("    <table class=table id=powergrid style=\"FONT-SIZE: 13px\"\r\n");
      out.write("            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box\r\n");
      out.write("            pcolor=\"#BCC8F5\">\r\n");
      out.write("    <tr style=\"display:display\">\r\n");
      out.write("      <td align=\"right\"  bgcolor=\"#F4F4F4\" width=\"130\">系统名称：</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"applicationName\" class=\"inputtext01\" value=\"\"/></td>\r\n");
      out.write("      <td align=\"right\"  bgcolor=\"#F4F4F4\" >系统编码：</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"applicationSn\" class=\"inputtext01\" value=\"\"/></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("    <tr style=\"display:display\">\r\n");
      out.write("      <td colspan=3></td>\r\n");
      out.write("      <td>\r\n");
      out.write("         <input type=\"button\" class=\"button\" value=\"查询(Q)\" accesskey=\"Q\"  onclick=\"initqueryResultList();\" align=\"right\"/>\r\n");
      out.write("    \t <input type=\"button\" class=\"button\" value=\"重置(R)\" accesskey=\"R\"  onclick=\"reset();\" align=\"right\"/>\r\n");
      out.write("    \t <input type=\"hidden\" name=\"pageNumber\" value=\"1\" />\r\n");
      out.write("    \t <input type=\"hidden\" name=\"maxResults\" value=\"15\" />\r\n");
      out.write("      </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write(" </form>\r\n");
      out.write("</table>\r\n");
      out.write("      </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("<div id=\"tabView1\">\r\n");
      out.write("\t\t\t<DIV id=\"tabView1tab_tabPane\">\r\n");
      out.write("\t\t\t\t<DIV id=tabTabtabView1_0>\r\n");
      out.write("    <table  border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"font-size:13px\" >\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td  class=\"tabpaneleft2\"></td>\r\n");
      out.write("\t<td class=\"tabpanebg2\"   width=\"120\">\r\n");
      out.write("\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/main_01/ico_fellow.gif\" width=\"18\" height=\"15\">\r\n");
      out.write("\t<span>接口系统列表</span>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td class=\"tabpaneright2\">\r\n");
      out.write("   </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </table>\r\n");
      out.write(" </DIV>\r\n");
      out.write("</DIV>\r\n");
      out.write("<div class=\"tab_aTab\">\r\n");
      out.write("    <table class=table id=powergrid style=\"FONT-SIZE: 13px\"\r\n");
      out.write("            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box\r\n");
      out.write("            pcolor=\"#BCC8F5\">\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("      <div id=\"queryResultList\" style=\"PADDING-RIGHT:0px;\"></div>\r\n");
      out.write("    </td>    \r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("   <td>\r\n");
      out.write("     <input id=\"addConfig\" type=\"button\" class=\"button\" value=\"新增\" onClick=\"addIfaceConfigSystem();\"/>\r\n");
      out.write("     <input id=\"deleteConfig\" type=\"button\" class=\"button\" value=\"删除\" onClick=\"doConfigSystemDel()\"/>\r\n");
      out.write("     <input id=\"editConfig\" type=\"button\" class=\"button\" value=\"接口协议配置\" onClick=\"toIfaceConfigProtocal();\"/>\r\n");
      out.write("   </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("  </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\tinitTabs('tabView1',Array('系统配置列表'),0,'100%','100%');\r\n");
      out.write("\t\r\n");
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
      out.write("\t\tifaceConfigSystemAction.getIfaceConfigSystemList(formObj,showTablequeryResultList);\r\n");
      out.write("\t\tdisableForm();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction showTablequeryResultList(str){\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\t$('queryResultList').innerHTML = str;\r\n");
      out.write("\t}\r\n");
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
