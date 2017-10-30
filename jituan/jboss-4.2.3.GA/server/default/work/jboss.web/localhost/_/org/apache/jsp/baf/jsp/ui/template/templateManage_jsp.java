package org.apache.jsp.baf.jsp.ui.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.regaltec.common.util.Constant;

public final class templateManage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/customTag.tld");
    _jspx_dependants.add("/WEB-INF/spring.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");

   response.setHeader("Pragma", "No-cache");
   response.setHeader("Cache-Control", "no-cache");
   response.setHeader("Expires", "0");
   String path = request.getContextPath();
   String locale = request.getLocale().toString();
   if(Constant.localMap.get(locale)==null)
   		locale="zh_CN";

      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html> \r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"user-scalable=no, width=device-width, initial-scale=1.0, maximum-scale=1.0\" />\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\"> \r\n");
      out.write("\r\n");
      out.write("<title>");
      if (_jspx_meth_spring_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/baf/jsp/ui/js/language/");
      out.print(locale);
      out.write(".js\" type=\"text/javascript\"></script>\r\n");
      out.write("<link rel=\"STYLESHEET\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/baf/jsp/ui/js/dhtmlxtree/dhtmlxtree.css\">\r\n");
      out.write("<script src=\"");
      out.print(path );
      out.write("/baf/jsp/ui/js/dhtmlxtree/dhtmlxcommon.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.print(path );
      out.write("/baf/jsp/ui/js/dhtmlxtree/dhtmlxtree.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/baf/jsp/ui/js/jquery-1.4.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/baf/jsp/ui/js/main.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/baf/jsp/ui/js/ccssoftUI/ccssoft.all.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("  .title {font-size:14px;font-weight:bold;};\r\n");
      out.write("  body{width:100%;overflow-x:hidden;}\r\n");
      out.write("  tr{cursor:pointer;}\r\n");
      out.write("  tr.selected td{background-color: #D6DFEB;} \r\n");
      out.write(" \r\n");
      out.write(" .grid .datagrid caption{background:#ddd;border:#aaa 1px solid;padding:5px 10px;height:30px;line-height:30px;}\r\n");
      out.write(" .grid .datagrid caption img{cursor:pointer;}\r\n");
      out.write(" .grid .datagrid tbody td a{font-size:15px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<form name=\"searchForm\" id=\"searchForm\" method=\"post\">\r\n");
      out.write("  <div class=\"ccs_toolbar\" id=\"ccs_toolbar\">\r\n");
      out.write("\t");
      if (_jspx_meth_spring_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("：\r\n");
      out.write("      <select name=\"search_TemplateCategory\" id=\"search_TemplateCategory\" class=\"ccs_text\" style=\"width: 160px;\">\r\n");
      out.write("\t\t<option value=\"o\" id=\"search_org\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_spring_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</option >\r\n");
      out.write("\t\t<option value=\"e\" id=\"search_employee\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_spring_005fmessage_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</option>\r\n");
      out.write("\t  </select>\r\n");
      out.write("     ");
      if (_jspx_meth_spring_005fmessage_005f4(_jspx_page_context))
        return;
      out.write("：\r\n");
      out.write("     <input type=\"text\" class=\"ccs_text\" style=\"width: 160px\" id=\"search_TemplateName\" name=\"search_TemplateName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${search_TemplateName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("    <input type=\"button\" class=\"ccs_button\" value=\"");
      if (_jspx_meth_spring_005fmessage_005f5(_jspx_page_context))
        return;
      out.write("\" onclick=\"ev_search();\" />\r\n");
      out.write("    <a href=\"#\" onclick=\"ev_reset();return false;\">&nbsp;&nbsp;&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f6(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;</a>\r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
      out.write("<input type=\"hidden\" id=\"getTemplateCategory\" value=\"");
      out.print(request.getParameter("search_TemplateCategory"));
      out.write("\"/>\r\n");
      out.write("<div class=\"grid\">\r\n");
      out.write("  <table class=\"datagrid\" align=\"center\" >\r\n");
      out.write("    <caption>\r\n");
      out.write("        <span class=\"tools ccs_right\">\r\n");
      out.write("          <input type=\"button\" class=\"ccs_button\" id=\"addRegion\" value=\"");
      if (_jspx_meth_spring_005fmessage_005f7(_jspx_page_context))
        return;
      out.write("\" onclick=\"ev_addTemplate()\" />\r\n");
      out.write("\t\t  <input type=\"button\" class=\"ccs_button\" onclick=\"ev_permission(this)\" value=\"");
      if (_jspx_meth_spring_005fmessage_005f8(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("\t\t</span>\r\n");
      out.write("    </caption>\r\n");
      out.write("    <thead>\r\n");
      out.write("      <tr>\r\n");
      out.write("      \t<td style=\"text-align:center;width:5%;\"><label><input type=\"checkbox\" class=\"all\" onclick=\"result.selectAll(this);\"/></label></td>\r\n");
      out.write("        <th style=\"padding-left:1em;width:150px\">");
      if (_jspx_meth_spring_005fmessage_005f9(_jspx_page_context))
        return;
      out.write("</th>\r\n");
      out.write("        <th style=\"width:150px;padding-left:2em\"></th>\r\n");
      out.write("        <th style=\"text-align:center;width:100px\"></th>\r\n");
      out.write("        <th>&nbsp;</th>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <tbody>\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </tbody>\r\n");
      out.write("  </table>\r\n");
      out.write("</div>\r\n");
      out.write("<br/><br/><br/><br/><br/>\r\n");
      out.write("<div url=\"");
      out.print(path);
      out.write("/baf/jsp/ui/template/templatemanage.do\" pageSize=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfoVO.pageSize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" totalCount=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfoVO.totalCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" currentPage=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfoVO.currPage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" pageCount=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfoVO.pageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"ccs_page\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" \r\n");
      out.write("  $(document).ready(function()\r\n");
      out.write("  {\r\n");
      out.write("  \t$(\".ccs_page\").ccs_page(\"searchForm\");\r\n");
      out.write("  \t\r\n");
      out.write("  \t//查询栏数据的显示\r\n");
      out.write("    var getTemplateCategory=$(\"#getTemplateCategory\").val();\r\n");
      out.write("    if(getTemplateCategory.indexOf(\"o\")==0){\r\n");
      out.write("\t\t$(\"#search_org\").attr(\"selected\",true);\r\n");
      out.write("\t}else if(getTemplateCategory.indexOf(\"e\")==0){\r\n");
      out.write("\t\t$(\"#search_employee\").attr(\"selected\",true);\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t$(\"#search_org\").attr(\"selected\",true);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"div.grid table.datagrid tbody tr\").mouseover(function(){\r\n");
      out.write("\t$(\"div.grid table.datagrid tbody tr\").removeClass(\"selected\");\r\n");
      out.write("\t$(this).addClass(\"selected\");\r\n");
      out.write(" \t$(\".btnSpan\").hide();\r\n");
      out.write("\t$(this).find(\".btnSpan\").show();\r\n");
      out.write("\t});\t\t\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write(" function ev_reset(){\r\n");
      out.write(" \t$(\"#search_TemplateName\").val(\"\");\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" function ev_check(){\r\n");
      out.write("    \tvar search_TemplateCategory=$(\"#search_TemplateCategory\").find('option:selected').val();\r\n");
      out.write("    \tvar search_TemplateName=$(\"#search_TemplateName\").val();\r\n");
      out.write("    \twindow.location.href='/baf/jsp/ui/template/templatemanage.do?search_TemplateCategory='+search_TemplateCategory+'&search_TemplateName='+search_TemplateName;\r\n");
      out.write("\t}\r\n");
      out.write("  \r\n");
      out.write("  function ev_search()\r\n");
      out.write("\t{\r\n");
      out.write("\t  $(\"#searchForm\").action=\"");
      out.print(path);
      out.write("/baf/jsp/ui/template/templatemanage.do\";\r\n");
      out.write("      $(\"#searchForm\").submit();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("  function ev_delete(obj,templateID,category)\r\n");
      out.write("  {\r\n");
      out.write("  \tvar templateCategory=\"\";\r\n");
      out.write("  \tif(category==\"人员\"){\r\n");
      out.write("  \t\t templateCategory=\"e\";\r\n");
      out.write("  \t}else{\r\n");
      out.write("  \t\ttemplateCategory=\"o\";\r\n");
      out.write("  \t}\r\n");
      out.write("    $(obj).ccs_confirm(_dic._msg_template_isDelete,function(){\r\n");
      out.write("      $.ajax({\r\n");
      out.write("   \t  url:\"");
      out.print(path);
      out.write("/baf/jsp/ui/template/deleteTemplate.do?templateID=\"+templateID+\"&templateCategory=\"+templateCategory,\r\n");
      out.write("\t  type: \"POST\",\r\n");
      out.write("\t  dataType:\"json\",\r\n");
      out.write("\t  success: function(data){\r\n");
      out.write("\t\t\tif(data==\"1\"){\r\n");
      out.write("\t\t\t\tshowGlobalMessage(_dic._deleteSuccess,1000,\"msgSuccess\");\r\n");
      out.write("\t\t   \t    ev_search()\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tshowGlobalMessage(_dic._deleteFailure,1000,\"msgSuccess\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t  }\r\n");
      out.write("      });  \r\n");
      out.write("    });\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" function ev_addTemplate()\r\n");
      out.write(" {\r\n");
      out.write(" \tvar templateID=\"\";\r\n");
      out.write("\tvar templateCategory=$(\"#search_TemplateCategory\").find('option:selected').val();\r\n");
      out.write("\tvar url=\"");
      out.print(path);
      out.write("/baf/jsp/ui/template/editorTemplate.do?templateCategory=\"+templateCategory+\"&templateID=\"+templateID;\r\n");
      out.write("    ccs_dialog.open(url,{width:'82%',unClose:true,zIndex:900,onClose:function(dialog,state)\r\n");
      out.write("    {\r\n");
      out.write("    \tif(state==\"1\"){\r\n");
      out.write("    \t\tev_search();\r\n");
      out.write("    \t\tshowGlobalMessage(_dic._success,false,\"msgSuccess\");\r\n");
      out.write("    \t}\r\n");
      out.write("    }\r\n");
      out.write("    });\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(" function ev_editorTemplate(templateID,category){\r\n");
      out.write(" \tvar templateCategory;\r\n");
      out.write("  \tif(category==_dic._msg_template_employee){\r\n");
      out.write("  \t\t templateCategory=\"e\";\r\n");
      out.write("  \t}else if(category==_dic._msg_template_post){\r\n");
      out.write("  \t\ttemplateCategory=\"p\";\r\n");
      out.write("  \t}else{\r\n");
      out.write("  \t\ttemplateCategory=\"o\";\r\n");
      out.write("  \t}\r\n");
      out.write("\tvar url=\"");
      out.print(path);
      out.write("/baf/jsp/ui/template/editorTemplate.do?templateCategory=\"+templateCategory+\"&templateID=\"+templateID;\r\n");
      out.write("    ccs_dialog.open(url,{width:'82%',unClose:true,zIndex:900,onClose:function(dialog,state)\r\n");
      out.write("    {\r\n");
      out.write("    \tif(state==\"1\"){\r\n");
      out.write("    \t\tev_search();\r\n");
      out.write("    \t\tshowGlobalMessage(_dic._success,false,\"msgSuccess\");\r\n");
      out.write("    \t}\r\n");
      out.write("    }\r\n");
      out.write("    });\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function ev_permission(obj){\r\n");
      out.write("\tvar templateIds=\"\";\r\n");
      out.write("\tvar curSelObjArray=new Array;\r\n");
      out.write("\tvar arrChk=$(\"input:checked[name='templateIds']\");\r\n");
      out.write("\tif(arrChk.length<=0){\r\n");
      out.write("  \t\t\t$(obj).ccs_confirm(_dic._msg_template_selectTemplate,150);\r\n");
      out.write("  \t\t\treturn false;\r\n");
      out.write("  \t}\r\n");
      out.write("    $(arrChk).each(function(){\r\n");
      out.write("\t\ttemplateIds+=this.value+\"~\";\r\n");
      out.write("\t});\r\n");
      out.write("\tvar category=$(\"#getTemplateCategory\").val();\r\n");
      out.write("\tif(\"e\".indexOf(category)!=-1){\r\n");
      out.write("\t\t var url=\"");
      out.print(path);
      out.write("/baf/jsp/ui/template/templatePermsissionEmp.jsp?templateCategory=\"+category+\"&templateID=\"+templateIds;\r\n");
      out.write("    \tccs_dialog.open(url,{width:'82%',unClose:true,zIndex:900,onClose:function(dialog,id)\r\n");
      out.write("    \t{\r\n");
      out.write("    \t\r\n");
      out.write("      \t}});\r\n");
      out.write("\t\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t var url=\"");
      out.print(path);
      out.write("/baf/jsp/ui/template/templatePermissionOrg.jsp?templateID=\"+templateIds;\r\n");
      out.write("    \tccs_dialog.open(url,{width:'82%',unClose:true,zIndex:900,onClose:function(dialog,id)\r\n");
      out.write("    \t{\r\n");
      out.write("    \t\r\n");
      out.write("      \t}});\r\n");
      out.write("\t}\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("   //全选\r\n");
      out.write("  $(\".all\").click(function(){\r\n");
      out.write("    var sign=$(this).attr(\"checked\");\r\n");
      out.write("    $(\"input[name='templateIds']\").attr(\"checked\",sign);\r\n");
      out.write("  });\r\n");
      out.write("\t\r\n");
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

  private boolean _jspx_meth_spring_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f0 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f0.setParent(null);
    // /baf/jsp/ui/template/templateManage.jsp(24,7) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setCode("baf.org.TemplateList");
    int[] _jspx_push_body_count_spring_005fmessage_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f0 = _jspx_th_spring_005fmessage_005f0.doStartTag();
      if (_jspx_th_spring_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f1 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f1.setParent(null);
    // /baf/jsp/ui/template/templateManage.jsp(47,1) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setCode("baf.org.TemplateCategory");
    int[] _jspx_push_body_count_spring_005fmessage_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f1 = _jspx_th_spring_005fmessage_005f1.doStartTag();
      if (_jspx_th_spring_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f2 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f2.setParent(null);
    // /baf/jsp/ui/template/templateManage.jsp(50,3) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f2.setCode("baf.org.Template.orgAndPost");
    int[] _jspx_push_body_count_spring_005fmessage_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f2 = _jspx_th_spring_005fmessage_005f2.doStartTag();
      if (_jspx_th_spring_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f3 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f3.setParent(null);
    // /baf/jsp/ui/template/templateManage.jsp(53,3) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f3.setCode("baf.org.Employee");
    int[] _jspx_push_body_count_spring_005fmessage_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f3 = _jspx_th_spring_005fmessage_005f3.doStartTag();
      if (_jspx_th_spring_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f3.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f4 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f4.setParent(null);
    // /baf/jsp/ui/template/templateManage.jsp(56,5) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f4.setCode("baf.org.TemplateName");
    int[] _jspx_push_body_count_spring_005fmessage_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f4 = _jspx_th_spring_005fmessage_005f4.doStartTag();
      if (_jspx_th_spring_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f4.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f5 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f5.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f5.setParent(null);
    // /baf/jsp/ui/template/templateManage.jsp(58,51) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f5.setCode("baf.org.btnSearch");
    int[] _jspx_push_body_count_spring_005fmessage_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f5 = _jspx_th_spring_005fmessage_005f5.doStartTag();
      if (_jspx_th_spring_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f5.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f6 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f6.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f6.setParent(null);
    // /baf/jsp/ui/template/templateManage.jsp(59,69) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f6.setCode("baf.org.btnReset");
    int[] _jspx_push_body_count_spring_005fmessage_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f6 = _jspx_th_spring_005fmessage_005f6.doStartTag();
      if (_jspx_th_spring_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f6.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f7 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f7.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f7.setParent(null);
    // /baf/jsp/ui/template/templateManage.jsp(67,72) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f7.setCode("baf.org.TemplateAdd");
    int[] _jspx_push_body_count_spring_005fmessage_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f7 = _jspx_th_spring_005fmessage_005f7.doStartTag();
      if (_jspx_th_spring_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f7.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f8 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f8.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f8.setParent(null);
    // /baf/jsp/ui/template/templateManage.jsp(68,81) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f8.setCode("baf.org.TemplatePermission");
    int[] _jspx_push_body_count_spring_005fmessage_005f8 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f8 = _jspx_th_spring_005fmessage_005f8.doStartTag();
      if (_jspx_th_spring_005fmessage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f8.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f9 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f9.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f9.setParent(null);
    // /baf/jsp/ui/template/templateManage.jsp(74,49) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f9.setCode("baf.org.TemplateName");
    int[] _jspx_push_body_count_spring_005fmessage_005f9 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f9 = _jspx_th_spring_005fmessage_005f9.doStartTag();
      if (_jspx_th_spring_005fmessage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f9.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /baf/jsp/ui/template/templateManage.jsp(81,4) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templateList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /baf/jsp/ui/template/templateManage.jsp(81,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("templateVo");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t  <tr>\r\n");
          out.write("\t  \t<td style='text-align:center;'><label><input type='checkbox' name='templateIds'  value='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templateVo.templateID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("' /></label></td>\r\n");
          out.write("        <td style=\"padding-left: 1em\">\r\n");
          out.write("          <div>\r\n");
          out.write("             <h3><span class='ruleNameTD'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templateVo.templateName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span></h3>\r\n");
          out.write("          </div>\r\n");
          out.write("          <div>\r\n");
          out.write("            <span class=\"allow\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templateVo.templateCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("          </div>\r\n");
          out.write("          <div>\r\n");
          out.write("            <span class=\"link_statu\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templateVo.templateDesc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("          </div>\r\n");
          out.write("        </td>\r\n");
          out.write("        <td style=\"padding-left: 2em\"></td>\r\n");
          out.write("        <td style=\"text-align:center;\" >\r\n");
          out.write("        </td>\r\n");
          out.write("        <td>\r\n");
          out.write("        \t<span class=\"ccs_tools btnSpan\" style=\"display: none;padding-left: 3em\">\r\n");
          out.write("\t          <input type=\"button\" class=\"ccs_button\" onclick=\"ev_editorTemplate('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templateVo.templateID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write(',');
          out.write('\'');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templateVo.templateCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("');\" value=\"");
          if (_jspx_meth_spring_005fmessage_005f10(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\" />\r\n");
          out.write("\t          <input type=\"button\" class=\"ccs_button\" onclick=\"ev_delete(this,'");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templateVo.templateID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write(',');
          out.write('\'');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templateVo.templateCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("');\" value=\"");
          if (_jspx_meth_spring_005fmessage_005f11(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\" />\r\n");
          out.write("\t        </span>\r\n");
          out.write("        </td>\r\n");
          out.write("      </tr>\r\n");
          out.write("   ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f10 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f10.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /baf/jsp/ui/template/templateManage.jsp(100,148) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f10.setCode("baf.org.btnEdit");
    int[] _jspx_push_body_count_spring_005fmessage_005f10 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f10 = _jspx_th_spring_005fmessage_005f10.doStartTag();
      if (_jspx_th_spring_005fmessage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f10.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f10);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f11 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f11.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /baf/jsp/ui/template/templateManage.jsp(101,145) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f11.setCode("baf.org.btnDelete");
    int[] _jspx_push_body_count_spring_005fmessage_005f11 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f11 = _jspx_th_spring_005fmessage_005f11.doStartTag();
      if (_jspx_th_spring_005fmessage_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f11[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f11.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f11.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f11);
    }
    return false;
  }
}
