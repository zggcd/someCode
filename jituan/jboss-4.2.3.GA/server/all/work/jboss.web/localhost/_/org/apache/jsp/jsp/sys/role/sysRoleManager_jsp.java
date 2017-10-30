package org.apache.jsp.jsp.sys.role;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sysRoleManager_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type='text/javascript' src='/dwr/interface/sysRoleModuleAction.js'></script>\r\n");

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
      out.write("<link rel=\"STYLESHEET\" type=\"text/css\" href=\"/js/dhtmlxtree/dhtmlxtree.css\">\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/dhtmlxtree/dhtmlxcommon.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/dhtmlxtree/dhtmlxtree.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>OSS接口平台</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tDWREngine.setErrorHandler(handler);\r\n");
      out.write("    function handler(errors) {\r\n");
      out.write("        alert(errors);\r\n");
      out.write("        enableForm();\r\n");
      out.write("        setUI();\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("\tfunction setUI()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar id=tree.getSelectedItemId();\r\n");
      out.write("\t\t$('btnAdd').disabled=false;\r\n");
      out.write("\t\tif(id!=\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t$('btnEdit').disabled=false;\r\n");
      out.write("\t\t  \t$('btnDel').disabled=false\r\n");
      out.write("\t\t} else\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t$('btnEdit').disabled=true;\r\n");
      out.write("\t\t\t$('btnDel').disabled=true;\r\n");
      out.write("\t\t}\t    \r\n");
      out.write("\t\t$('btnSave').disabled=true;\r\n");
      out.write("\t\t$('btnCancel').disabled=true;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.forms[0].action = \"/sys/sysRoleModuleAction.do?method=toSysRoleModuleView\";\r\n");
      out.write("\t    document.forms[0].target = \"list_page\";\r\n");
      out.write("\t    document.forms[0].submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction enabledToSave()\r\n");
      out.write("\t{\r\n");
      out.write("\t\t$('btnAdd').disabled=true;\r\n");
      out.write("\t\t$('btnEdit').disabled=true;\r\n");
      out.write("\t\t$('btnDel').disabled=true;\r\n");
      out.write("\t\t$('btnSave').disabled=false;\r\n");
      out.write("\t\t$('btnCancel').disabled=false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction sysRoleAdd ()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar id=tree.getSelectedItemId();\r\n");
      out.write("\t\tif(id==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.forms[0].roleId.value=\"-1\";\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tdocument.forms[0].roleId.value=id;\r\n");
      out.write("\t\t\tvar parentId=tree.getParentId(id);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tdocument.forms[0].action = \"/sys/sysRoleAction.do?method=toSysRoleAdd\";\r\n");
      out.write("\t    document.forms[0].target = \"list_page\";\r\n");
      out.write("\t    document.forms[0].submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction sysRoleEdit()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar id=tree.getSelectedItemId();\r\n");
      out.write("\t\tif(id!=\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\tdocument.forms[0].roleId.value=id;\r\n");
      out.write("\t\t\tdocument.forms[0].action = \"/sys/sysRoleModuleAction.do?method=toSysRoleModuleEdit\";\r\n");
      out.write("\t\t    document.forms[0].target = \"list_page\";\r\n");
      out.write("\t\t    document.forms[0].submit();\r\n");
      out.write("\r\n");
      out.write("\t\t}else\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"请选择节点！\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction sysRoleDel()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar id=tree.getSelectedItemId();\r\n");
      out.write("\t\tif(id!=\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif(confirm(\"此操作可能会影响\"+ getSubName(id) +\"相关用户和组织的权限，确定删除节点\"+ getSubName(id) +\"?\"))\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tdocument.forms[0].roleId.value=id;\r\n");
      out.write("\t\t\t\tsysRoleModuleAction.deleteDataSysRoleModule($('roleId').value,delCallback);\r\n");
      out.write("\t\t\t\tdisableForm();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"请选择节点！\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction delCallback(error){\r\n");
      out.write("\t\tif(error!=\"\") {\r\n");
      out.write("\t\t\treturn handler(error);\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"操作成功\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t    enableForm();\r\n");
      out.write("\t   \tvar id=tree.getSelectedItemId();\r\n");
      out.write("\t   \tif(id!=\"\")\r\n");
      out.write("\t   \t{\r\n");
      out.write("\t   \t\tvar parentId=tree.getParentId(id)\r\n");
      out.write("\t\t\ttree.refreshItem(parentId);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tsetUI();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction sysRoleSave()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tlist_page.window.addTabViewDoSave();\r\n");
      out.write("\t\ttree.refreshItem(\"0\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction sysRoleModuleCancel ()\r\n");
      out.write("\t{\r\n");
      out.write("\r\n");
      out.write("\t\tvar id=tree.getSelectedItemId();\r\n");
      out.write("\t\tif(id==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\ttree.refreshItem(\"0\");\r\n");
      out.write("\t\t\tdocument.forms[0].roleId.value=\"-1\";\r\n");
      out.write("\t\t}else {\r\n");
      out.write("\t\t\ttree.refreshItem(\"id\");\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tsetUI();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" topmargin=\"0\" >\r\n");
      out.write("<table border=\"0\" style=\"FONT-SIZE: 13px\" cellpadding=\"5\" cellspacing=\"0\" bgcolor=\"#FFFFFF\" height=\"100%\" width=\"100%\" > \r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"29.5%\">\r\n");
      out.write("        \t<div id=\"show_tree\" style=\"width:100%;height:100%;overflow:hidden;border :1px solid Silver;\"></div>\r\n");
      out.write("        </td>\r\n");
      out.write("\t\t<td width=\"70.5%\">\r\n");
      out.write("            <iframe name=\"list_page\" height=\"410\" width=\"100%\"  frameborder=\"0\" MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" src=\"\">\r\n");
      out.write("            </iframe>\r\n");
      out.write("        </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"100%\" colspan=\"2\" align=\"left\">\r\n");
      out.write("\t\t\t<form id=\"queryForm\" method=\"post\">\r\n");
      out.write("\t        \t<input type=\"button\" class=\"button\" value=\"添加\" id=\"btnAdd\" name=\"btnAdd\" onclick=\"sysRoleAdd ()\" >\r\n");
      out.write("\t\t\t\t<input type=\"button\" class=\"button\" value=\"修改\" id=\"btnEdit\" disabled name=\"btnEdit\" onclick=\"sysRoleEdit ()\" >\r\n");
      out.write("\t\t\t\t<input type=\"button\" class=\"button\" value=\"删除\" id=\"btnDel\" disabled name=\"btnDelave\" onclick=\"sysRoleDel ()\" >\r\n");
      out.write("\t\t\t\t<input type=\"button\" class=\"button\" value=\"保存\" id=\"btnSave\" disabled name=\"btnSave\" onclick=\"sysRoleSave ()\" >\r\n");
      out.write("\t\t\t\t<input type=\"button\" class=\"button\" value=\"取消\" id=\"btnCancel\" disabled name=\"btnCancel\" onclick=\"sysRoleModuleCancel ()\" >\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"roleId\" name=\"roleId\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("        </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    /*实列化dhtmlxtree树型对象*/\r\n");
      out.write("    var tree = new dhtmlXTreeObject(\"show_tree\", \"100%\", \"100%\", 0);\r\n");
      out.write("    tree.setImagePath(\"/js/dhtmlxtree/imgs/\");\r\n");
      out.write("    tree.enableCheckBoxes(0);\r\n");
      out.write("    tree.enableDragAndDrop(false);\r\n");
      out.write("    tree.setOnClickHandler(clickable);\r\n");
      out.write("    tree.setXMLAutoLoading(\"/sys/sysRoleModuleAction.do?method=showTreeWithType\");\r\n");
      out.write("    tree.loadXML(\"/sys/sysRoleModuleAction.do?method=showTreeWithType&id=0\");\r\n");
      out.write("\r\n");
      out.write("\tfunction getSubName (id) {\r\n");
      out.write("\t\tvar name=tree.getItemText(id);\r\n");
      out.write("\t\treturn name;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction clickable (id) {\r\n");
      out.write("        document.forms[0].roleId.value=id;\r\n");
      out.write("\t\tsetUI();\r\n");
      out.write("\t}\r\n");
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
