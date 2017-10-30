package org.apache.jsp.jsp.sys.unit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sysUserUnitSrch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type='text/javascript' src='/dwr/interface/sysUserUnitAction.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/dwr/interface/sysUserAction.js'></script>\r\n");
      out.write("\r\n");

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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>OSS接口平台</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" topmargin=\"0\" >\r\n");
      out.write("<form name=\"queryDataForm\" >\r\n");
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
      out.write("\t    <tr style=\"display:\">\r\n");
      out.write("\t\t      <td align=\"right\"  bgcolor=\"#F4F4F4\" >\r\n");
      out.write("\t\t         登陆账号：\r\n");
      out.write("\t\t      </td>\r\n");
      out.write("\t\t      <td>\r\n");
      out.write("\t\t         <input type=\"text\" name=\"loginName\" >\r\n");
      out.write("\t\t      </td>\r\n");
      out.write("\t\t       <td align=\"right\"  bgcolor=\"#F4F4F4\" >\r\n");
      out.write("\t\t         用户名称：\r\n");
      out.write("\t\t       </td>\r\n");
      out.write("\t\t      <td>\r\n");
      out.write("\t\t         <input type=\"text\" name=\"userName\" >\r\n");
      out.write("\t\t      </td>\r\n");
      out.write("\t     </tr>\r\n");
      out.write("\t     <tr>\r\n");
      out.write("\t\t      <td align=\"center\"  colspan=\"4\">\r\n");
      out.write("\t\t         <input type=\"button\" class=\"button\" value=\"查询(Q)\" id=\"btnQuery\" name=\"btnQuery\"accesskey=\"Q\"  onclick=\"initQueryResultList()\" />\r\n");
      out.write("\t\t         <input type=\"button\" class=\"button\" value=\"新增\" id=\"btnAdd\" name=\"btnAdd\"accesskey=\"A\"  onclick=\"toAdd()\" />\r\n");
      out.write("\t\t         <input type=\"button\" class=\"button\" value=\"删除\" id=\"btnDel\" name=\"btnDel\"accesskey=\"R\"  onclick=\"delElement()\" />\r\n");
      out.write("\t\t      </td>\r\n");
      out.write("\t \t </tr >\r\n");
      out.write("\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.unitId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"unitId\" name=\"unitId\" />\r\n");
      out.write(" </form>\r\n");
      out.write("</table>\r\n");
      out.write("      </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("\t<div id=\"tabView1\">\r\n");
      out.write("\t\t<div id=\"tabView1tab_tabPane\">\r\n");
      out.write("\t\t\t<div id=tabTabtabView1_0>\r\n");
      out.write("\t\t\t    <table  border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"font-size:13px\" >\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td  class=\"tabpaneleft2\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"tabpanebg2\"   width=\"150\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/main_01/ico_fellow.gif\" width=\"18\" height=\"15\">\r\n");
      out.write("\t\t\t\t\t\t<span>用户列表</span>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"tabpaneright2\">\r\n");
      out.write("\t\t\t\t\t  \t</td>\r\n");
      out.write("\t\t\t\t    </tr>\r\n");
      out.write("\t\t\t    </table>\r\n");
      out.write("\t\t \t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"tab_aTab\">\r\n");
      out.write("\t\t    <table class=table id=\"powergrid\" style=\"FONT-SIZE: 13px\"\r\n");
      out.write("\t\t            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box\r\n");
      out.write("\t\t            pcolor=\"#BCC8F5\">\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t\t    <td>\r\n");
      out.write("\t\t\t\t      <div id=\"queryResultList\" style=\"PADDING-RIGHT:0px;\"></div>\r\n");
      out.write("\t\t\t\t    </td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("  </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("initTabs('tabView1',Array('用户列表'),0,'100%','100%');\r\n");
      out.write("function getDetail(id,name){\r\n");
      out.write("\tcreateNewTab('tabView1','修改用户','','/sys/sysUserUnitAction.do?method=toSysUserUnitEdit&userId='+id,true);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function toAdd(){\r\n");
      out.write("    createNewTab('tabView1','新增用户','','/sys/sysUserUnitAction.do?method=toSysUserUnitAdd&unitId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.unitId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("',true);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function delElement(){\r\n");
      out.write("  var checkids=getSelectCheckboxValue(\"queryResultList\",\"checkid\",\"|\");\r\n");
      out.write("  if(checkids==\"\"){\r\n");
      out.write("     alert(\"请选择记录！\");\r\n");
      out.write("     return;\r\n");
      out.write("  }\r\n");
      out.write("  if(confirm(\"您确认要删除选中记录吗？\")){\r\n");
      out.write(" \r\n");
      out.write("    sysUserUnitAction.deleteDataSysUserUnit('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.unitId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("',checkids,goBack);\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("initQueryResultList();\r\n");
      out.write("\r\n");
      out.write("function initQueryResultList() {\r\n");
      out.write("\t\tDWRUtil.useLoadingMessage('数据读取中...');\r\n");
      out.write("\t\tvar formObj=$('queryDataForm').serialize(true);\r\n");
      out.write("\t\tsysUserUnitAction.getSysUserUnitList(formObj,showResultList);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function showResultList(str){\r\n");
      out.write("\t$('queryResultList').innerHTML = str;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goBack(s){\r\n");
      out.write("  if(s==\"\"){\r\n");
      out.write("     alert(\"操作成功！\");\r\n");
      out.write("     initQueryResultList();\r\n");
      out.write("  }else{\r\n");
      out.write("    alert(s);\r\n");
      out.write("    initQueryResultList();\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function enabledToSave()\r\n");
      out.write("{\r\n");
      out.write("\t$('btnQuery').disabled=false;\r\n");
      out.write("\t$('btnAdd').disabled=false;\r\n");
      out.write("\t$('btnDel').disabled=true;\r\n");
      out.write("}\r\n");
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
