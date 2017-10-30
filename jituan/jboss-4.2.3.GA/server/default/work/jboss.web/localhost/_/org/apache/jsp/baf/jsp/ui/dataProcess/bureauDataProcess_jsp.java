package org.apache.jsp.baf.jsp.ui.dataProcess;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.regaltec.common.util.Constant;

public final class bureauDataProcess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/customTag.tld");
    _jspx_dependants.add("/WEB-INF/spring.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      out.write("\r\n");
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
      out.write("<meta http-equiv=\"expires\" content=\"0\">  \r\n");
      out.write("<title>");
      if (_jspx_meth_spring_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("<link rel=\"STYLESHEET\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/baf/jsp/ui/js/dhtmlxtree/dhtmlxtree.css\">\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/baf/jsp/ui/js/language/");
      out.print(locale);
      out.write(".js\" type=\"text/javascript\"></script>\r\n");
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
      out.write(" \r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <form method=\"post\" name=\"searchForm\" id=\"searchForm\" onkeydown=\"if(event.keyCode==13){ev_search();return false;}\">\r\n");
      out.write("      <div class=\"ccs_toolbar\" id=\"ccs_toolbar\">\r\n");
      out.write("          <span class=\"tools ccs_right\">\r\n");
      out.write("              <a href=\"#\" onclick=\"ev_more(this);return false;\">");
      if (_jspx_meth_spring_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("</a>\r\n");
      out.write("          </span>\r\n");
      out.write("          <dl class=\"searchBar\">\r\n");
      out.write("          \t<dt>");
      if (_jspx_meth_spring_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("：</dt>\r\n");
      out.write("         \t<dd><input type=\"text\" class=\"ccs_text\" style=\"width: 150px\" id=\"queryName\" name=\"queryName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.queryName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></dd>\r\n");
      out.write("          \t<dt>");
      if (_jspx_meth_spring_005fmessage_005f3(_jspx_page_context))
        return;
      out.write("：</dt>\r\n");
      out.write("        \t<dd><input type=\"text\" class=\"ccs_text\" style=\"width: 150px\" id=\"queryCode\" name=\"queryCode\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.queryCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></dd>\r\n");
      out.write("            <dt>");
      if (_jspx_meth_spring_005fmessage_005f4(_jspx_page_context))
        return;
      out.write("：</dt>\r\n");
      out.write("            <dd><input type=\"text\" class=\"getDate\" style=\"width: 100px\" id=\"search_startTime\" name=\"search_startTime\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.search_startTime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></dd>\r\n");
      out.write("            <dt>");
      if (_jspx_meth_spring_005fmessage_005f5(_jspx_page_context))
        return;
      out.write("： </dt>\r\n");
      out.write("            <dd><input type=\"text\" class=\"getDate\" style=\"width: 100px\" id=\"search_endTime\" name=\"search_endTime\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.search_endTime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></dd>\r\n");
      out.write("          </dl>\r\n");
      out.write("          <input type=\"button\" class=\"ccs_button\" value=\"");
      if (_jspx_meth_spring_005fmessage_005f6(_jspx_page_context))
        return;
      out.write("\" onclick=\"ev_search()\"/>\r\n");
      out.write("          <a href=\"#\" onclick=\"ev_reset();return false;\">");
      if (_jspx_meth_spring_005fmessage_005f7(_jspx_page_context))
        return;
      out.write("</a>\r\n");
      out.write("      </div>\r\n");
      out.write("  </form>\r\n");
      out.write("  <div class=\"grid\">\r\n");
      out.write("\t<table class=\"datagrid\" align=\"center\" id=\"dataList\">\r\n");
      out.write("\t  <caption>\r\n");
      out.write("        <span class=\"tools ccs_right\">\r\n");
      out.write("          <input type=\"button\" id=\"save\" class=\"ccs_lbutton\" value=\"");
      if (_jspx_meth_spring_005fmessage_005f8(_jspx_page_context))
        return;
      out.write("\" onclick=\"retBureau(this,'old');\" />\r\n");
      out.write("          <input type=\"button\" id=\"save\" class=\"ccs_lbutton\" value=\"");
      if (_jspx_meth_spring_005fmessage_005f9(_jspx_page_context))
        return;
      out.write("\" onclick=\"retBureau(this,'new');\" />\r\n");
      out.write("          <input type=\"button\" class=\"ccs_button\" value=\"");
      if (_jspx_meth_spring_005fmessage_005f10(_jspx_page_context))
        return;
      out.write("\" id=\"delList\" name=\"delList\" onclick=\"delBatchBureau(this)\"/>\r\n");
      out.write("        </span>\r\n");
      out.write("      </caption>\r\n");
      out.write("\t  <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td style=\"text-align:center;width:5%;\"><label><input type=\"checkbox\" class=\"all\"/></label></td>\r\n");
      out.write("         <th style=\"padding-left: 1em;width:35%;\">");
      if (_jspx_meth_spring_005fmessage_005f11(_jspx_page_context))
        return;
      out.write("</th>\r\n");
      out.write("         <th style=\"width:25%; padding-left: 1em;\">");
      if (_jspx_meth_spring_005fmessage_005f12(_jspx_page_context))
        return;
      out.write("</th>\r\n");
      out.write("         <th style=\"width:30%;\">");
      if (_jspx_meth_spring_005fmessage_005f13(_jspx_page_context))
        return;
      out.write("</th>\r\n");
      out.write("         <th >&nbsp</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </thead>\r\n");
      out.write("      <tbody>\r\n");
      out.write("      \t ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("          \r\n");
      out.write("        \r\n");
      out.write("\t  </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div url=\"");
      out.print(path);
      out.write("/baf/jsp/ui/dataProcess/load.do?type=bureau\" pageSize=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageVO.pageSize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" totalCount=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageVO.totalCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" currentPage=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageVO.currPage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" pageCount=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageVO.pageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"ccs_page\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("  $(\".getDate\").dateEditor();\r\n");
      out.write("  \r\n");
      out.write("  function ev_more(obj){\r\n");
      out.write("    if($(obj).attr(\"rel\")!=\"1\"){\r\n");
      out.write("        $(obj).attr(\"rel\",\"1\").html(_dic._msg_hideMoreQuery);\r\n");
      out.write("        $(\"#ccs_toolbar\").animate({height:80},500);\r\n");
      out.write("    }else{\r\n");
      out.write("        $(obj).removeAttr(\"rel\").html(_dic._msg_showMmoreQuery);\r\n");
      out.write("        $(\"#ccs_toolbar\").animate({height:40},500);\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("  $(document).ready(function()\r\n");
      out.write("  {\r\n");
      out.write("    $(\".ccs_page\").ccs_page(\"searchForm\");\r\n");
      out.write("    $(\".datagrid tbody\").delegate(\"tr\",\"mouseover\",\r\n");
      out.write("      function(){\r\n");
      out.write("   \t    $(\".datagrid tbody tr.selected\").removeClass(\"selected\").find(\".tools\").hide();\r\n");
      out.write("        $(this).addClass(\"selected\").find(\".tools\").show();\r\n");
      out.write("    });\t\r\n");
      out.write("  });\r\n");
      out.write("\t\r\n");
      out.write("\t//恢复局向\r\n");
      out.write("\tfunction retBureau(obj,oldOrNew){\r\n");
      out.write("\t\tvar arrChk=\"\";\r\n");
      out.write("\t\tarrChk=$(\"input:checked[name='batchDelete']\"); \r\n");
      out.write("  \t\tif(arrChk.length<=0){\r\n");
      out.write("  \t\t\t//如果选择局向的数目少于1，则不作操作\r\n");
      out.write("  \t\t\t$(obj).ccs_confirm(_dic._msg_dataprocess_seleteBureau,150);\r\n");
      out.write("  \t\t\treturn false;\r\n");
      out.write("  \t\t}\r\n");
      out.write("  \t\tcurSelObjArray = new Array;//清空批量删除数组数据\r\n");
      out.write("  \t\tobjIdArray = new Array;\t     \t//删除对象ID集合\t\r\n");
      out.write("\t\tobjNameArray = new Array;\t    //不能删除对象Name集合\r\n");
      out.write("\t\tretNameArray = new Array;\t    //删除对象Name集合\r\n");
      out.write("\t\t$(arrChk).each(function(){\r\n");
      out.write("\t\t\t//获取每个选择的值，放到统一的数组中\r\n");
      out.write("\t\t\tcurSelObjArray.push(this.value);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tfor(var i = 0;i <curSelObjArray.length;i++){\r\n");
      out.write("\t\t\tvar v = curSelObjArray[i].split(\";\");\r\n");
      out.write("\t\t\tif(oldOrNew==\"old\"){ //恢复到原始局向\r\n");
      out.write("\t\t\t\tif(v[2]==\"N\"){\r\n");
      out.write("\t\t\t\t\tobjNameArray.push(v[1]);\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tretNameArray.push(v[1]);\r\n");
      out.write("\t\t\t\t\tobjIdArray.push(v[0]);     //上级还没有删除的局向id集合\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t//v[0]是bureauVO.bureauid\r\n");
      out.write("\t\t\t\tobjIdArray.push(v[0]);    //所有局向Id的集合\r\n");
      out.write("\t\t\t\tif(v[2]==\"N\"){\r\n");
      out.write("\t\t\t\t\tobjNameArray.push(v[1]);\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t//是局向名name，可以删除对象集合\r\n");
      out.write("\t\t\t\t\tretNameArray.push(v[1]);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tobjIdArray=objIdArray;\r\n");
      out.write("\t\t//objIdArray数组的只含有了当前局向id和其父级局向id，两者用#分隔\r\n");
      out.write("\t\tif(oldOrNew==\"old\"){\r\n");
      out.write("\t\t\tretOdlBureau(obj,objIdArray,objNameArray,retNameArray);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tretNewBureau(obj,objIdArray,objNameArray,retNameArray);\r\n");
      out.write("\t\t}\r\n");
      out.write("  \t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//恢复到原来局向\r\n");
      out.write("\tfunction retOdlBureau(obj,objIdArray,objNameArray,retNameArray){\r\n");
      out.write("\t\tvar tip=objNameArray+_dic._msg_dataprocess_deleteParentBureau;\r\n");
      out.write("\t\tif(objNameArray.length>0&&retNameArray.length==0) { \r\n");
      out.write("\t\t\t$(obj).ccs_confirm(tip,150);\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objIdArray==null||objIdArray.lenght==0){\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objNameArray.length>0&&retNameArray.length>0) {\r\n");
      out.write("\t\t\t$(obj).ccs_confirm(tip,150,function(){\r\n");
      out.write("\t\t\t\trestorationBureau(obj,objIdArray,objNameArray,retNameArray);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\trestorationBureau(obj,objIdArray,objNameArray,retNameArray);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//异步恢复局向\r\n");
      out.write("\tfunction restorationBureau(obj,objIdArray,objNameArray,retNameArray){\r\n");
      out.write("\t\tvar tip=_dic._msg_dataprocess_isSure+retNameArray+_dic._msg_dataprocess_goBackToOldBureau+\"？\";\r\n");
      out.write("\t\t$(obj).ccs_confirm(tip,300,function(){\r\n");
      out.write("      \t\t$.ccssoft.ajax({\r\n");
      out.write("   \t  \t\t\turl:'");
      out.print(path);
      out.write("/baf/jsp/ui/dataProcess/retOdl.do?type=bureau&id='+encodeURIComponent(objIdArray.join(\",\")),\r\n");
      out.write("   \t  \t\t\tremind:false,\r\n");
      out.write("   \t  \t\t\tcallback:function(data)\r\n");
      out.write("   \t  \t\t\t{\r\n");
      out.write("   \t  \t\t\t\tif(data==\"1\"){\r\n");
      out.write("   \t      \t\t\t\tshowGlobalMessage(_dic._success,false,\"msgSuccess\");\r\n");
      out.write("   \t      \t\t\t\tev_search();\r\n");
      out.write("   \t    \t\t\t}else{\r\n");
      out.write("   \t      \t\t\t\tshowGlobalMessage(_dic._failure,false); \r\n");
      out.write("   \t    \t\t\t}\r\n");
      out.write("\t  \t\t\t}});\r\n");
      out.write("    \t});  \r\n");
      out.write("\t}\r\n");
      out.write("\tfunction retNewBureau(obj,objIdArray,objNameArray,delNameArray){\r\n");
      out.write("\t\tvar mark=\"bureau\";\r\n");
      out.write("\t\tvar win={title:_dic._msg_dataprocess_selectParentBureau,modal:1,url:\"");
      out.print(path);
      out.write("/baf/jsp/ui/dataProcess/selectParentNode.jsp?mark=\"+mark,width:500,height:450};\r\n");
      out.write("    \t\r\n");
      out.write("\t\t//创建局向选择对话框\r\n");
      out.write("\t\tfeeDialog(win,function(state){\r\n");
      out.write("    \t\tif(state.length>0){\r\n");
      out.write("    \t\t\tvar idArray = new Array;\t     \t//对象ID集合\r\n");
      out.write("    \t\t\tfor(var i=0;i<objIdArray.length;i++){\r\n");
      out.write("    \t\t\t\tvar ids=objIdArray[i].split(\"#\");\r\n");
      out.write("    \t\t\t\tidArray.push(ids[0]+\"#\"+state);\r\n");
      out.write("    \t\t\t}\r\n");
      out.write("    \t\t\t$.ccssoft.ajax({\r\n");
      out.write("   \t  \t\t\turl:'");
      out.print(path);
      out.write("/baf/jsp/ui/dataProcess/retOdl.do?type=bureau&id='+encodeURIComponent(idArray.join(\",\")),\r\n");
      out.write("   \t  \t\t\tremind:false,\r\n");
      out.write("   \t  \t\t\tcallback:function(data)\r\n");
      out.write("   \t  \t\t\t{\r\n");
      out.write("   \t  \t\t\t\tif(data==\"1\"){\r\n");
      out.write("   \t      \t\t\t\tshowGlobalMessage(_dic._success,false,\"msgSuccess\");\r\n");
      out.write("   \t      \t\t\t\tev_search();\r\n");
      out.write("   \t    \t\t\t}else{\r\n");
      out.write("   \t      \t\t\t\tshowGlobalMessage(_dic._failure,false); \r\n");
      out.write("   \t    \t\t\t}\r\n");
      out.write("\t  \t\t\t}});\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t});\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("// 比较时间差，返回差异的毫秒数\r\n");
      out.write("function dateDiffrent(time1, time2) {\r\n");
      out.write("\tvar d1 = new Date(time1.replace(/\\-/g,\"/\")).getTime();\r\n");
      out.write("\tvar d2 = new Date(time2.replace(/\\-/g,\"/\")).getTime();\r\n");
      out.write("\tvar flag=\"N\";\r\n");
      out.write("\tif(d2 - d1<0){\r\n");
      out.write("\t\tflag=\"Y\";\r\n");
      out.write("\t}\r\n");
      out.write("\treturn flag;\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("  \r\n");
      out.write("  //批量彻底删除业务\r\n");
      out.write("  function delBatchBureau(obj){\r\n");
      out.write("\t\tvar arrChk=\"\";\r\n");
      out.write("\t\tarrChk=$(\"input:checked[name='batchDelete']\"); \r\n");
      out.write("  \t\tif(arrChk.length<=0){\r\n");
      out.write("  \t\t\t$(obj).ccs_confirm(_dic._msg_dataprocess_selectDeleteBureau,150);\r\n");
      out.write("  \t\t\treturn false;\r\n");
      out.write("  \t\t}\r\n");
      out.write("  \t\tcurSelObjArray = new Array;//清空批量删除数组数据\r\n");
      out.write("  \t\tobjIdArray = new Array;\t     \t//删除对象ID集合\t\r\n");
      out.write("\t\tobjNameArray = new Array;\t    //不能删除对象Name集合\r\n");
      out.write("\t\tdelNameArray = new Array;\t    //删除对象Name集合\r\n");
      out.write("\t\t$(arrChk).each(function(){\r\n");
      out.write("\t\t\tcurSelObjArray.push(this.value);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tfor(var i = 0;i <curSelObjArray.length;i++){\r\n");
      out.write("\t\t\tvar v = curSelObjArray[i].split(\";\");\r\n");
      out.write("\t\t\tvar times=v[3];\r\n");
      out.write("\t\t\tvar flag=complareDate(times);\r\n");
      out.write("\t\t\tif(flag==\"Y\"){\r\n");
      out.write("\t\t\t\tobjIdArray.push(v[0].split(\"#\")[0]);\r\n");
      out.write("\t\t\t\tdelNameArray.push(v[1]);\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tobjNameArray.push(v[1]);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar tip=objNameArray+_dic._msg_dataprocess_noDelete;\r\n");
      out.write("\t\tif(objNameArray.length>0&&delNameArray.length==0) { \r\n");
      out.write("\t\t\t$(obj).ccs_confirm(tip,150);\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objIdArray==null||objIdArray.lenght==0){\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(objNameArray.length>0&&delNameArray.length>0) {\r\n");
      out.write("\t\t\t$(obj).ccs_confirm(tip,150,function(){\r\n");
      out.write("\t\t\t\tdelBureau(obj,objIdArray,objNameArray,delNameArray);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tdelBureau(obj,objIdArray,objNameArray,delNameArray);\r\n");
      out.write("\r\n");
      out.write(" }\r\n");
      out.write(" \t//异步删除业务\r\n");
      out.write(" \tfunction delBureau(obj,objIdArray,objNameArray,delNameArray){\r\n");
      out.write(" \t\tvar tip=_dic._msg_dataprocess_isSure+delNameArray+_dic.deletes+\"？\";\r\n");
      out.write("\t\t$(obj).ccs_confirm(tip,300,function(){\r\n");
      out.write("      \t\t$.ccssoft.ajax({\r\n");
      out.write("   \t  \t\t\turl:'");
      out.print(path);
      out.write("/baf/jsp/ui/dataProcess/delBatchBureau.do?bureauId='+objIdArray,\r\n");
      out.write("   \t  \t\t\tremind:false,\r\n");
      out.write("   \t  \t\t\tcallback:function(data)\r\n");
      out.write("   \t  \t\t\t{\r\n");
      out.write("   \t  \t\t\t\tif(data==\"1\"){\r\n");
      out.write("   \t      \t\t\t\tshowGlobalMessage(_dic._deleteSuccess,false,\"msgSuccess\");\r\n");
      out.write("   \t      \t\t\t\tev_search();\r\n");
      out.write("   \t    \t\t\t}else{\r\n");
      out.write("   \t      \t\t\t\tshowGlobalMessage(_dic._deleteFailure,false); \r\n");
      out.write("   \t    \t\t\t}\r\n");
      out.write("\t  \t\t\t}});\r\n");
      out.write("    \t});  \r\n");
      out.write(" \t} \r\n");
      out.write(" \r\n");
      out.write(" \t//比较业务删除时间和当前时间相差多少天\r\n");
      out.write("\tfunction complareDate(time1){\r\n");
      out.write("\t\tflag=\"N\";\r\n");
      out.write("\t\t//注意时间格式是：2012-03-05 11:41:30.910   要把时间格式转成 2012-03-05 11:41:30.910\r\n");
      out.write("\t\tvar times=time1.split(\".\");\r\n");
      out.write("\t\tvar addDate = new Date(times[0].replace(/\\-/g,\"/\"));\r\n");
      out.write("\t\tvar now = new Date();\r\n");
      out.write("\t\tvar diff = now.getTime() - addDate.getTime();\r\n");
      out.write("\t\t//判断大于七天 \r\n");
      out.write("\t\tif (diff-7*24*60*60*1000>0)flag=\"Y\";\r\n");
      out.write("\t\treturn flag;\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("function feeDialog(win,callback){\r\n");
      out.write("  $.ligerDialog.open({url:win.url,width:win.width,height:win.height,title:win.title,buttons: [\r\n");
      out.write("    {text: _dic.confirm,onclick: function (item, dialog){\r\n");
      out.write("        dialog.find(\"iframe\")[0].contentWindow.submit(function(state){\r\n");
      out.write("        \t\r\n");
      out.write("          if(callback&&typeof(callback)==\"function\"){\r\n");
      out.write("            callback(state);\r\n");
      out.write("          }\r\n");
      out.write("          dialog.close();\r\n");
      out.write("        });\r\n");
      out.write("    }},\r\n");
      out.write("    {text: _dic.cancel,onclick:function (item, dialog){dialog.close();}}]});\r\n");
      out.write("  }\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  function ev_search()\r\n");
      out.write("  {\r\n");
      out.write("  \ttime1=$(\"#search_startTime\").val();\r\n");
      out.write("  \ttime2=$(\"#search_endTime\").val();\r\n");
      out.write("  \tvar flag=dateDiffrent(time1, time2)\r\n");
      out.write("  \tif(flag==\"Y\"){\r\n");
      out.write("  \t\tshowGlobalMessage(_dic._msg_dataprocess_OverThanBegin,false,\"msgSuccess\");\r\n");
      out.write("  \t\treturn false;\r\n");
      out.write("  \t}\r\n");
      out.write("    searchForm.action= \"");
      out.print(path);
      out.write("/baf/jsp/ui/dataProcess/load.do?type=bureau\";\r\n");
      out.write("    searchForm.submit();\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  //清空查询条件\r\n");
      out.write("  function ev_reset()\r\n");
      out.write("  {\r\n");
      out.write("    $(\"#queryName,#queryCode,#search_startTime,#search_endTime\").val(\"\");\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write(" //全选\r\n");
      out.write("  $(\".all\").click(function(){\r\n");
      out.write("    var sign=$(this).attr(\"checked\");\r\n");
      out.write("    $(\"input[name='batchDelete']\").attr(\"checked\",sign);\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
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
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(23,7) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setCode("baf.dataprocess.bureauBase");
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
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(47,64) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setCode("baf.showMmoreQuery");
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
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(50,15) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f2.setCode("baf.bureau.bureauName");
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
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(52,15) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f3.setCode("baf.bureau.bureauCode");
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
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(54,16) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f4.setCode("baf.dialoutstrategy.beginTime");
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
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(56,16) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f5.setCode("baf.dialoutstrategy.endTime");
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
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(59,57) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f6.setCode("baf.org.btnSearch");
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
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(60,57) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f7.setCode("baf.org.btnReset");
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
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(67,68) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f8.setCode("baf.dataprocess.resumeOld");
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
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(68,68) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f9.setCode("baf.dataprocess.resumeNew");
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

  private boolean _jspx_meth_spring_005fmessage_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f10 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f10.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f10.setParent(null);
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(69,57) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f10.setCode("baf.dataprocess.quitedelete");
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

  private boolean _jspx_meth_spring_005fmessage_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f11 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f11.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f11.setParent(null);
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(75,50) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f11.setCode("baf.bureau.bureauBaseInfo");
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

  private boolean _jspx_meth_spring_005fmessage_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f12 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f12.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f12.setParent(null);
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(76,51) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f12.setCode("baf.dataprocess.deleteTime");
    int[] _jspx_push_body_count_spring_005fmessage_005f12 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f12 = _jspx_th_spring_005fmessage_005f12.doStartTag();
      if (_jspx_th_spring_005fmessage_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f12[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f12.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f12.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f12);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f13 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f13.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f13.setParent(null);
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(77,32) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f13.setCode("baf.bureau.parentbureauName");
    int[] _jspx_push_body_count_spring_005fmessage_005f13 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f13 = _jspx_th_spring_005fmessage_005f13.doStartTag();
      if (_jspx_th_spring_005fmessage_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f13[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f13.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f13.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f13);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(82,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("bureauVO");
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(82,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageVO.results}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(82,8) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          <tr>\r\n");
          out.write("            <td style='text-align:center;'>\r\n");
          out.write("            \t<label>\r\n");
          out.write("            \t\t");
          if (_jspx_meth_c_005fchoose_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("            \t</label>\r\n");
          out.write("            </td>\r\n");
          out.write("            <td style=\"padding-left: 1em\">\r\n");
          out.write("\t          <div>\r\n");
          out.write("\t            <span style=\"font-size:15px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.bureauname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("\t          </div>\r\n");
          out.write("\t          <div> <span class=\"allow\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.bureaucode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span></div>\r\n");
          out.write("\t          <div><span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.bureautypeName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span></div>\r\n");
          out.write("\t          <div><span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.citycode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span></div>\r\n");
          out.write("\t          <div><span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.latitude}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span></div>\r\n");
          out.write("\t          <div><span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.longitude}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span></div>\r\n");
          out.write("\t          \t\r\n");
          out.write("\t        </td>\r\n");
          out.write("\t        <td style=\"padding-left: 1em\">\r\n");
          out.write("\t        \t <div class=\"ccs_time\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.modifyTime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</div>\r\n");
          out.write("\t\t    </td>\r\n");
          out.write("\t\t    <td>\r\n");
          out.write("\t\t    \t");
          if (_jspx_meth_c_005fchoose_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t    </td>\r\n");
          out.write("\t\t    <td>\r\n");
          out.write("\t\t    </td>\r\n");
          out.write("          </tr>\r\n");
          out.write("         ");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t    \t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t    \t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t    \t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(87,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.parentIsvalid=='N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t    \t\t\t<input type='checkbox' name='batchDelete' value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.bureauid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('#');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.parentbureauid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(';');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.bureauname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(';');
        out.write('N');
        out.write(';');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.modifyTime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t    \t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t    \t\t\t<input type='checkbox' name='batchDelete' value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.bureauid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('#');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.parentbureauid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(';');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.bureauname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(';');
        out.write('Y');
        out.write(';');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.modifyTime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t    \t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
    if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t    \t\t");
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t    \t\t");
        if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t    \t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(112,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.parentIsvalid=='N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t    \t\t\t<div>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.parentBureauName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(" <span class=\"important\">");
        if (_jspx_meth_spring_005fmessage_005f14(_jspx_th_c_005fwhen_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("</span></div>\r\n");
        out.write("\t\t    \t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f14 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f14.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /baf/jsp/ui/dataProcess/bureauDataProcess.jsp(113,67) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f14.setCode("baf.dataprocess.bureauDelete");
    int[] _jspx_push_body_count_spring_005fmessage_005f14 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f14 = _jspx_th_spring_005fmessage_005f14.doStartTag();
      if (_jspx_th_spring_005fmessage_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f14[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f14.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f14.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f14);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t    \t\t\t<div><span>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bureauVO.parentBureauName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span></div>\r\n");
        out.write("\t\t    \t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
    return false;
  }
}
