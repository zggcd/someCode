package org.apache.jsp.jsp.iface.protocol;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class protocolSrch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/jsp/taglib.jsp");
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
      response.setContentType("text/html; charset=gbk");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\" />\r\n");
      out.write("<title>OSS接口平台</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/cb2.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/js/tab/webfx.css\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/prototype.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/commonjs.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/validator.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/mydiv.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" topmargin=\"0\" >\r\n");
      out.write("<form name=\"queryForm\">\r\n");
      out.write("     <input type=\"hidden\" id=\"orderByClause\" name=\"orderByClause\" value=\"\" />\r\n");
      out.write("\t <input type=\"hidden\" id=\"applicationId\" name=\"applicationId\" value=\"\" />\r\n");
      out.write("\t <input type=\"hidden\" name=\"pageNumber\" value=\"1\" />\r\n");
      out.write("     <input type=\"hidden\" name=\"maxResults\" value=\"15\" /></form>\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"5\" cellspacing=\"0\" bgcolor=\"#FFFFFF\"  height=\"100%\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td valign=\"top\">\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <table class=table id=powergrid style=\"FONT-SIZE: 13px\"\r\n");
      out.write("            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box\r\n");
      out.write("            pcolor=\"#BCC8F5\">\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td> <div id=\"queryResultList2\" style=\"PADDING-RIGHT:0px;\">\r\n");
      out.write("           </div>   \r\n");
      out.write("        <input id=\"addConfig\" type=\"button\" class=\"button\" value=\"新增\" onClick=\"addIfaceConfigProtocol();\"/>\r\n");
      out.write("     <input id=\"deleteConfig\" type=\"button\" class=\"button\" value=\"删除\" onClick=\"doDel();\"/>\r\n");
      out.write("       </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("      </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("  </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<script>\r\n");
      out.write("    var paramObj = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.applicationId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\r\n");
      out.write("\tinitqueryProtocolResultList();\r\n");
      out.write("\t\r\n");
      out.write("\tfunction initqueryProtocolResultList(){\r\n");
      out.write("\t\tDWRUtil.useLoadingMessage('数据读取中...');\r\n");
      out.write("\t\t$('applicationId').value = paramObj;\r\n");
      out.write("\t\tvar formObj = $('queryForm').serialize(true); \r\n");
      out.write("\t\tifaceConfigProtocolAction.getIfaceConfigProtocolList(formObj,showTablequeryProtocolResultList);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction showTablequeryProtocolResultList(str){\r\n");
      out.write("\t\tenableForm();\r\n");
      out.write("\t\t$('queryResultList2').innerHTML = str;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction addIfaceConfigProtocol() {\r\n");
      out.write("\t\tvar obj = window.showModalDialog(\"/jsp/iface/protocol/protocolAdd.jsp\",paramObj,\"dialogWidth=750px;dialogHeight=400px;center=yes;status=no;scroll=no\");\r\n");
      out.write("    \tif(obj!=-1) {\r\n");
      out.write("    \t\tshowProtocolAllData();\r\n");
      out.write("    \t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction openIfaceConfigProtocolEdit(protocolId) {\r\n");
      out.write("\t\tvar obj = window.showModalDialog(\"/jsp/iface/protocol/protocolEdit.jsp\",protocolId,\"dialogWidth=750px;dialogHeight=400px;center=yes;status=no;scroll=no\");\r\n");
      out.write("    \tif(obj!=-1) {\r\n");
      out.write("    \t\tshowProtocolAllData();\r\n");
      out.write("    \t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction showProtocolAllData() {\r\n");
      out.write("\t\tDWRUtil.useLoadingMessage('数据读取中...');\r\n");
      out.write("\t\tvar formObj = $('queryForm').serialize(true); \r\n");
      out.write("\t\tifaceConfigProtocolAction.getIfaceConfigProtocolList(formObj,showTablequeryProtocolResultList);\r\n");
      out.write("\t\tdisableForm();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doDel() {\r\n");
      out.write("\t\tvar ids = getSelectCheckboxValue(\"queryResultList2\",\"checkid\",\":\");\r\n");
      out.write("\t\tif(ids!=\"\"){\r\n");
      out.write("\t\t\tif(confirm(\"确定删除?\"))\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tifaceConfigProtocolAction.deleteIfaceConfigProtocolData(ids,callbackDeleteProtocol);\r\n");
      out.write("\t\t\t\tdisableForm();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"请选择记录!\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction callbackDeleteProtocol() {\r\n");
      out.write("\t\talert(\"删除成功!\");\r\n");
      out.write("\t\tshowProtocolAllData();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
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
