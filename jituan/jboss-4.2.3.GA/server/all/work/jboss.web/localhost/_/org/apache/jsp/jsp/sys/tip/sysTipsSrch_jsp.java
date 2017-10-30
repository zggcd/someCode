package org.apache.jsp.jsp.sys.tip;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sysTipsSrch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type='text/javascript' src='/dwr/interface/sysTipAction.js'></script>\r\n");
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
      out.write("\tDWREngine.setErrorHandler(handler);\r\n");
      out.write("\t \r\n");
      out.write("\t function handler(errors) {\r\n");
      out.write("        alert(errors);\r\n");
      out.write("        enableForm(\"commonQueryForm\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\t//use\r\n");
      out.write("\tfunction doDel() {\r\n");
      out.write("\t\tvar ids = getSelectCheckboxValue(\"queryResultList\",\"checkid\",\":\");\r\n");
      out.write("\t\tif(ids!=\"\"){\r\n");
      out.write("\t\t\tif(confirm(\"确定删除?\"))\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tsysTipAction.deleteByIds(ids,delCallback);\r\n");
      out.write("\t\t\t\tdisableForm();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"请选择记录!\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction delCallback(){\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\talert(\"操作成功\");\r\n");
      out.write("\t\tshowAllData();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//use\r\n");
      out.write("\tfunction toSysTipsAdd() {\r\n");
      out.write("    \tvar sysTipsObj = window.showModalDialog(\"/jsp/sys/tip/sysTipsAdd.jsp\",null,\"dialogWidth=430px;dialogHeight=400px;center=yes;status=no;scroll=no\");\r\n");
      out.write("    \tif(sysTipsObj!=-1) {\r\n");
      out.write("    \t\tshowAllData();\r\n");
      out.write("    \t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction countValidCheck() {\r\n");
      out.write("\t\tvar id = document.getElementsByName(\"checkid\");\r\n");
      out.write("\t\tvar count = 0;\r\n");
      out.write("\t\tfor ( var i = 0; i < id.length; i++) {\r\n");
      out.write("\t\t\tif (id[i].checked) {\r\n");
      out.write("\t\t\t\tcount++;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn count;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getValidFirstCheckValue() {\r\n");
      out.write("\t\tvar id = document.getElementsByName(\"checkid\");\r\n");
      out.write("\t\tvar count = 0;\r\n");
      out.write("\t\tfor ( var i = 0; i < id.length; i++) {\r\n");
      out.write("\t\t\tif (id[i].checked) {\r\n");
      out.write("\t\t\t\treturn id[i].value;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction toSysDicConfigEdit() {\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\tvar count = countValidCheck();\r\n");
      out.write("\t\tif(count <= 0) {\r\n");
      out.write("\t\t\talert(\"请选择一条记录!\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t} else if(count > 1) {\r\n");
      out.write("\t\t\talert(\"只能选择一条记录!\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t} else if(count == 1) {\r\n");
      out.write("\t\t\tvar id = getValidFirstCheckValue();\r\n");
      out.write("\t\t\tsysDicConfigAction.getDataSysDicConfig(id,callbackSysDicConfig);\r\n");
      out.write("\t\t\tdisableForm();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//use\r\n");
      out.write("\tfunction toSysTipsEdit(tipId) {\r\n");
      out.write("\t\tvar editObj = window.showModalDialog(\"/jsp/sys/tip/sysTipsEdit.jsp\",tipId,\"dialogWidth=430px;dialogHeight=400px;center=yes;status=no;scroll=no\");\r\n");
      out.write("\t\tif(editObj==1) {\r\n");
      out.write("   \t\t\tshowAllData();\r\n");
      out.write("   \t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction toSysDicItemRelateList(obj) {\r\n");
      out.write("\t\tcreateNewTab('tabView1','字典条目列表','','/sys/sysDicConfigAction.do?method=showSysDicItemByDictionaryId&dictionaryId='+obj,true);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//use\r\n");
      out.write("\tfunction showAllData(){\r\n");
      out.write("\t\tDWRUtil.useLoadingMessage('数据读取中...');\r\n");
      out.write("\t\ttrimForm();\r\n");
      out.write("\t\tvar formObj = $('commonQueryForm').serialize(true); \r\n");
      out.write("\t\tformObj.tipModuleId = '';\r\n");
      out.write("\t\tformObj.tipLabel = '';\r\n");
      out.write("\t\tformObj.tipContext = '';\r\n");
      out.write("\t\tsysTipAction.selectByExample(formObj,showTablequeryResultList);\r\n");
      out.write("\t\tdisableForm();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//use\r\n");
      out.write("\tfunction showTableAfterDel(str) {\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\t$('queryResultList').innerHTML = str;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction callTipTemplate() {\r\n");
      out.write("\t\twindow.showModalDialog(\"/jsp/sys/tip/showTipTemplate.jsp\",null,\"dialogWidth=400px;dialogHeight=400px;center=yes;status=no;scroll=no\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
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
      out.write("      <td align=\"right\"  bgcolor=\"#F4F4F4\" >\r\n");
      out.write("        模块名称：\r\n");
      out.write("      </td>\r\n");
      out.write("      <td><input type=\"text\" name=\"tipModuleId\" class=\"inputtext01\" value=\"\"/></td>\r\n");
      out.write("      <td align=\"right\"  bgcolor=\"#F4F4F4\" >\r\n");
      out.write("         标签名称：\r\n");
      out.write("      </td>\r\n");
      out.write("      <td><input type=\"text\" name=\"tipLabel\" class=\"inputtext01\" value=\"\"/></td>\r\n");
      out.write("      <td align=\"right\"  bgcolor=\"#F4F4F4\" >\r\n");
      out.write("         标签内容：\r\n");
      out.write("      </td>\r\n");
      out.write("      <td><input type=\"text\" name=\"tipContext\" class=\"inputtext01\" value=\"\"/></td>\r\n");
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
      out.write("\t<span>提示标签列表</span>\r\n");
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
      out.write("     <input id=\"addConfig\" type=\"button\" class=\"button\" value=\"新增\" onClick=\"toSysTipsAdd();\"/>\r\n");
      out.write("     <input id=\"deleteConfig\" type=\"button\" class=\"button\" value=\"删除\" onClick=\"doDel();\"/>\r\n");
      out.write("     <input id=\"tipTemplate\" type=\"button\" class=\"button\" value=\"调用模板\" onClick=\"callTipTemplate();\"/>\r\n");
      out.write("   </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("  </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
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
      out.write("\t\tsysTipAction.selectByExample(formObj,showTablequeryResultList);\r\n");
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
