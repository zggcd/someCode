package org.apache.jsp.baf.jsp.ui.newOrg;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class unitAndUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/customTag.tld");
    _jspx_dependants.add("/WEB-INF/spring.tld");
    _jspx_dependants.add("/baf/jsp/ui/js/config.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.release();
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
      out.write(" \r\n");

   response.setHeader("Pragma", "No-cache");
   response.setHeader("Cache-Control", "no-cache");
   response.setHeader("Expires", "0");
   request.setCharacterEncoding("UTF-8");
   String path = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");

   String getPath = request.getContextPath();
   String getLocal = request.getLocale().toString();

      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"user-scalable=no, width=device-width, initial-scale=1.0, maximum-scale=1.0\" />\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">  \r\n");
      out.write("<script src=\"");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/language/zh_CN.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/jquery-1.7.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/jquery.json-2.4.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/in-min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/bootstrap/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/bootstrap/css/bootstrap-responsive.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/bootstrap/css/ccssoft_extend.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--[if lte IE 6]>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/bootstrap/css/bootstrap-ie6.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/bootstrap/css/ie.css\">\r\n");
      out.write("  <script src=\"");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/bootstrap/js/bootstrap-ie.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script>\r\n");
      out.write("console = window.console || {log:function(){}};\r\n");
      out.write("In.add('mainCSS',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/css/main.css',type:'css',charset:'utf-8'});\r\n");
      out.write("\r\n");
      out.write("In.add('ccssoft',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/ccssoft.js',type:'js',charset:'utf-8'});\r\n");
      out.write("In.add('underscore',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/underscore-min.js',type:'js',charset:'utf-8'});\r\n");
      out.write("In.add('backbone',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/backbone-min.js',type:'js',charset:'utf-8',rely:['underscore']});\r\n");
      out.write("\r\n");
      out.write("In.add('json',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/json2.js',type:'js',charset:'utf-8'});\r\n");
      out.write("//dragable\r\n");
      out.write("In.add('dragable',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/jquery.dragable.js',type:'js',charset:'utf-8',rely:['ccssoft']});\r\n");
      out.write("\r\n");
      out.write("In.add('extJson',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/ext.json.js',type:'js',charset:'utf-8'});\r\n");
      out.write("In.add('main',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/main.js',type:'js',charset:'utf-8'});\r\n");
      out.write("\r\n");
      out.write("In.add('all',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/ccssoftUI/ccssoft.all.js',type:'js',charset:'utf-8',rely:['main']});\r\n");
      out.write("\r\n");
      out.write("//åé¡µæ§ä»¶\r\n");
      out.write("In.add('pageSize',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/jquery.boot_pageSize.js',type:'js',charset:'utf-8'});\r\n");
      out.write("\r\n");
      out.write("//artTemplate\r\n");
      out.write("In.add('template',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/template.min.js',type:'js',charset:'utf-8'});\r\n");
      out.write("//dhtmlxtree \r\n");
      out.write("In.add('dhtmlxtreeCSS',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/dhtmlxtree/dhtmlxtree.css',type:'css',charset:'utf-8'});\r\n");
      out.write("In.add('dhtmlxcommon',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/dhtmlxtree/dhtmlxcommon.js',type:'js',charset:'utf-8'});\r\n");
      out.write("In.add('dhtmlxtree',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/dhtmlxtree/dhtmlxtree.js',type:'js',charset:'utf-8',rely:['dhtmlxcommon','dhtmlxtreeCSS']});\r\n");
      out.write("\r\n");
      out.write("In.add('treeDialog',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/treeDialog.js',type:'js',charset:'utf-8'});\r\n");
      out.write("//jqtransform\r\n");
      out.write("In.add('jqtransformCSS',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/jqtransform/jqtransformplugin/jqtransform.css',type:'css',charset:'utf-8'});\r\n");
      out.write("In.add('jqtransform',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/jqtransform/jqtransformplugin/jquery.jqtransform.js',type:'js',charset:'utf-8',rely:['jqtransformCSS']});\r\n");
      out.write("//form\r\n");
      out.write("In.add('validTool',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/bootstrap/js/bootstrap.ccssoft.validTools.js',type:'js',charset:'utf-8'});\r\n");
      out.write("In.add('submit',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/jquery.form.js',type:'js',charset:'utf-8'});\r\n");
      out.write("In.add('validate',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/validate.js',type:'js',charset:'utf-8',rely:['validTool','submit']});\r\n");
      out.write("\r\n");
      out.write("//others\r\n");
      out.write("In.add('frontierFloat',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/jquery.frontierFloat.js',type:'js',charset:'utf-8'});\r\n");
      out.write("In.add('confirm',{path:'");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/ui-confirm.js',type:'js',charset:'utf-8',rely:['frontierFloat']});\r\n");
      out.write("\r\n");
      out.write("var context = \"");
      out.print(getPath);
      out.write("\"\r\n");
      out.write("function showGlobalMessage(text,times,style){\r\n");
      out.write("\ttop.window.showTopMessage.show(text,times,style);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goTop() {\r\n");
      out.write("\t$('html, body').animate({ scrollTop: 0 }, 0);\r\n");
      out.write("}\r\n");
      out.write("var showDialog = top.window.bootDialog;\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"");
      out.print(getPath);
      out.write("/baf/jsp/ui/js/topWindow.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("  <title>");
      if (_jspx_meth_spring_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("  <style>\r\n");
      out.write("  .props{float:left;width:300px;font-size:12px;color:#666;}\r\n");
      out.write("  .gray{font-size:12px;color:#888;font-weight:normal;padding:0 3px;}\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("<div class=\"row-fluid\">\r\n");
      out.write("\t<div class=\"span8\" id=\"contentArea\"></div>\r\n");
      out.write("\t<div class=\"span3 \">\r\n");
      out.write("\t\t <div class=\"input-prepend\">\r\n");
      out.write("\t\t      <span class=\"add-on\"><i class=\"icon-search\"></i></span>\r\n");
      out.write("\t\t      <input class=\"input-medium\" id=\"search-query\" type=\"text\" placeholder=\"");
      if (_jspx_meth_spring_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t <div id=\"treebox\" class=\"clearfix tree_ieFix\">\r\n");
      out.write("\t\t\t<div id=\"tree\" ></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"searchbox\" class=\"clearfix\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<span id=\"resultTemplate\" class=\"hide\">\r\n");
      out.write("\t<ul class=\"nav nav-tabs nav-stacked\">\r\n");
      out.write("\t\t<li class=\"active\"><a href=\"javascript:;\"><span class=\"badge\">{ length }</span> ");
      if (_jspx_meth_spring_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("\"<span class=\"text-error\">{ key }</span>\"{ overflow }</a></li>\r\n");
      out.write("\t\t{ each list as result index }\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t\t<a href=\"javascript:;\" class=\"data-{ result.objectcategory }\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-id=\"{ result.objectid }\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-name=\"{ echo result.objectname }\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-type=\"{ result.objecttypeid }\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-parentid=\"{ result.parentobjectid }\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-parenttype=\"{ result.parentobjectcategory }\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-parentname=\"{ result.parentobjectname }\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t>\r\n");
      out.write("\t\t\t\t<i class=\"icon-chevron-right close\"></i>\r\n");
      out.write("\t\t\t\t{ echo result.typeName }\r\n");
      out.write("\t\t\t\t<span class=\"title\">{ echo result.objectnameCustom }</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t{/each}\r\n");
      out.write("\t</ul>\r\n");
      out.write("</span>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("(function(){\r\n");
      out.write("\tvar tree = window.tree =  {\r\n");
      out.write("\t\thandle : null,\r\n");
      out.write("\t\tdata : null,\r\n");
      out.write("\t\tinit : function(callback){\r\n");
      out.write("\t\t\tvar self = this;\r\n");
      out.write("\t\t\tvar tree=new dhtmlXTreeObject('tree',\"\",\"\",0);\r\n");
      out.write("    \t\ttree.setImagePath(\"");
      out.print(path);
      out.write("/baf/images/dhtmlxtree/\");\r\n");
      out.write("\t\t\ttree.enableDragAndDrop(false);\r\n");
      out.write("\t\t\ttree.enableTreeLines(false);\r\n");
      out.write("\t\t\ttree.enableThreeStateCheckboxes(false);\r\n");
      out.write("\t\t\ttree.enableCheckBoxes(0,0);\r\n");
      out.write("\t\t\ttree.loadXML(\"");
      out.print(path);
      out.write("/baf/jsp/ui/org/orgtree.jsp\",function(xml){\r\n");
      out.write("\t\t\t\tif(callback&&typeof(callback)==\"function\")callback();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\ttree.setXMLAutoLoading(\"");
      out.print(path);
      out.write("/baf/jsp/ui/org/orgtree.jsp\");\r\n");
      out.write("\t\t\ttree.setOnClickHandler(function(){\r\n");
      out.write("\t\t\t\tvar selectId = tree.getSelectedItemId();\r\n");
      out.write("\t\t\t\tself.openPage(selectId,tree.getSelectedItemText(),tree.getUserData(selectId,\"objectTypeID\"),1);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tthis.handle = tree;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\topenPage : function(selectId,selectname,selecttypeid,currPage,callback){\r\n");
      out.write("\t\t\tif(currPage && typeof(currPage)==\"function\"){\r\n");
      out.write("\t\t\t\tcallback=currPage;\r\n");
      out.write("\t\t\t\tcurrPage=1;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar url=\"/OrganizationController/getOAndEData.do?currPage=\"+currPage+\"&orgId=\"+selectId+\"&selectid=\"+selectId+\"&selectname=\"+encodeURIComponent(selectname)+\"&selecttypeid=\"+selecttypeid;\r\n");
      out.write("\t\t\t$(\"#contentArea\").empty().load(url,function(){\r\n");
      out.write("\t\t\t\tif(callback&&typeof(callback)==\"function\")callback();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\topenLink : function(){\r\n");
      out.write("\t\t\tvar self = tree;\r\n");
      out.write("\t\t\tvar id = $(this).attr(\"data-id\");\r\n");
      out.write("\t\t\tvar name = $(this).attr(\"data-name\");\r\n");
      out.write("\t\t\tvar type = $(this).attr(\"data-type\");\r\n");
      out.write("\t\t\tself.openPage(id,name,type,1);\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\trefresh : function(id,callback){\r\n");
      out.write("\t\t\t$(\"#tree\").empty();\r\n");
      out.write("\t\t\ttree.init();\r\n");
      out.write("\t\t\tsearch.data = null;\r\n");
      out.write("\t\t\tsearch.getData(function(){\r\n");
      out.write("\t\t\t\tif(callback&&typeof(callback)==\"function\")callback();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\trefreshById : function(id,callback){\r\n");
      out.write("\t\t\tvar orgTree=tree.handle;\r\n");
      out.write("\t\t\tvar temp=orgTree.getOpenState(id);\r\n");
      out.write("\t\t\tif(temp==1){//1代表节点已经展开了，0代表未展开\r\n");
      out.write("\t\t\t\torgTree.refreshItem(id);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(callback&&typeof(callback)==\"function\")callback();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\tIn.ready(\"dhtmlxtree\",function(){\r\n");
      out.write("\t\ttree.init();\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t//组织与人员快速筛选工具\r\n");
      out.write("\tvar search = {\r\n");
      out.write("\t\tlastKey : null , \t//上次搜索关键词\r\n");
      out.write("\t\tdata : null ,\t\t//组织与人员数据\r\n");
      out.write("\t\tcrumb : function(id){ //面包屑\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\texist : function(string,subString){//子字符串搜索工具\r\n");
      out.write("\t\t\tif(string.indexOf(subString) != -1)return true;\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\thide:function(){//隐藏搜索结果窗体\r\n");
      out.write("\t\t\t$(\"#treebox\").show();\r\n");
      out.write("\t\t\t$(\"#searchbox\").hide();\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tshow: function(){//显示搜索结果窗体\r\n");
      out.write("\t\t\t$(\"#treebox\").hide();\r\n");
      out.write("\t\t\t$(\"#searchbox\").show();\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tgetData : function(callback){//获取组织与人员数据\r\n");
      out.write("\t\t\tvar searchName = $(\"#search-query\").val();\r\n");
      out.write("\t\t\tif(searchName == \"\" || searchName == null)return false;\r\n");
      out.write("\t\t\tvar self = this;\r\n");
      out.write("\t\t\tvar url = \"");
      out.print(path);
      out.write("/OrganizationController/searchTreeData.do?searchName=\"+encodeURIComponent(searchName);\r\n");
      out.write("\t\t\t$.getJSON(url,function(data){\r\n");
      out.write("\t\t\t\tif(data.state == 1){\r\n");
      out.write("\t\t\t\t\tself.data = data;\r\n");
      out.write("\t\t\t\t\tif(callback&&typeof(callback)==\"function\")callback(data);\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\talert(data.message);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tsearch : function(query){//根据key从数据中获取匹配的结果\r\n");
      out.write("\t\t\tvar self = this ;\r\n");
      out.write("\t\t\tvar pageSize = 20;\r\n");
      out.write("\t\t\tvar result = [];\r\n");
      out.write("\t\t\tquery = query.toLowerCase();\r\n");
      out.write("\t\t\tfor(var i = 0 , node ;node = self.data.treeList[i] ; i++){\r\n");
      out.write("\t\t\t\tif( self.exist(node.objectname,query) || self.exist(node.fullCode,query) || self.exist(node.shortCode,query)){\r\n");
      out.write("\t\t\t\t\tnode = $.extend({},node);\r\n");
      out.write("\t\t\t\t\tnode.objectnameCustom = node.objectname.replace(query,\"<span class='text-error'>\"+query+\"</span>\");\r\n");
      out.write("\t\t\t\t\tif(node.objectcategory.toLowerCase() == \"e\")node.typeName=\"<span class='label label-info'>");
      if (_jspx_meth_spring_005fmessage_005f3(_jspx_page_context))
        return;
      out.write("</span>\";\r\n");
      out.write("\t\t\t\t\tif(node.objectcategory.toLowerCase() == \"o\")node.typeName=\"<span class='label label-inverse'>");
      if (_jspx_meth_spring_005fmessage_005f4(_jspx_page_context))
        return;
      out.write("</span>\";\r\n");
      out.write("\t\t\t\t\tif(node.objectcategory.toLowerCase() == \"p\")node.typeName=\"<span class='label'>");
      if (_jspx_meth_spring_005fmessage_005f5(_jspx_page_context))
        return;
      out.write("</span>\";\r\n");
      out.write("\t\t\t\t\tresult.push(node);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar result = {list : result , length : self.data.count , key : query ,pageSize : pageSize}\r\n");
      out.write("\t\t\tif(self.data.count > pageSize)result.overflow = _dic._msg_unit_warningDrag3;\r\n");
      out.write("\t\t\treturn result;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tlist : function(query){//显示搜索结果列表\r\n");
      out.write("\t\t\tvar self = this;\r\n");
      out.write("\t\t\tvar list = $(\"#searchbox\");\r\n");
      out.write("\t\t\tvar result = self.search(query);\r\n");
      out.write("\t\t\tif(!result.length){\r\n");
      out.write("\t\t\t\tself.hide();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tself.show();\r\n");
      out.write("\t\t\t//生成搜索结果\r\n");
      out.write("\t\t\tIn.ready(\"template\",function(){\r\n");
      out.write("\t\t\t\tvar html = [];\r\n");
      out.write("\t\t\t\tresult.key = query;\r\n");
      out.write("\t\t\t\t//渲染模板\r\n");
      out.write("\t\t\t\t//console.log(result)\r\n");
      out.write("\t\t\t\thtml.push(template.render(\"resultTemplate\",result));\r\n");
      out.write("\t\t\t\tlist.html(html.join(\"\"));\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tstart : function(query){//程序入口\r\n");
      out.write("\t\t\tvar self = this;\r\n");
      out.write("\t\t\tif(!query){self.hide();return false;}\r\n");
      out.write("\t\t\tself.getData(function(data){\r\n");
      out.write("\t\t\t\tself.list(query);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t$(\"body\")\r\n");
      out.write("\t\t.delegate(\"#search-query\",\"keyup\",function(){//快速搜索绑定事件\r\n");
      out.write("\t\t\tvar query = $(this).val();\r\n");
      out.write("\t\t\tsearch.start(query);\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t.delegate(\".breadcrumb a\",\"click\",tree.openLink)\r\n");
      out.write("\t\t//编辑部门查询结果\r\n");
      out.write("\t\t.delegate(\"#searchbox .data-O\",\"click\",function(){\r\n");
      out.write("\t\t\tvar self = this;\r\n");
      out.write("\t\t\tvar id = $(self).attr(\"data-id\");\r\n");
      out.write("\t\t\tvar name = $(self).attr(\"data-name\");\r\n");
      out.write("\t\t\tvar type = $(self).attr(\"data-type\");\r\n");
      out.write("\t\t\tvar win={title:name,modal:1,width:770,url:\"");
      out.print(path);
      out.write("/OrganizationController/forwardUnitPage.do?type=edit&orgId=\"+id};\r\n");
      out.write("\t\t\tshowDialog(win,function(data){\r\n");
      out.write("\t        \treturn false;      \r\n");
      out.write("    \t\t});\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t//编辑人员查询结果\r\n");
      out.write("\t\t.delegate(\"#searchbox .data-E\",\"click\",function(){\r\n");
      out.write("\t\t\tvar self = this;\r\n");
      out.write("\t\t\tvar id = $(self).attr(\"data-id\");\r\n");
      out.write("\t\t\tvar name = $(self).attr(\"data-name\");\r\n");
      out.write("\t\t\tvar type = $(self).attr(\"data-type\");\r\n");
      out.write("\t\t\tvar pid = $(self).attr(\"data-parentid\");\r\n");
      out.write("\t\t\tvar win={title:name,modal:1,width:770,url:\"");
      out.print(path);
      out.write("/OrganizationController/forwardUsePage.do?searchcrumb=Y&type=edit&id=\"+id+\"&orgId=\"+pid};\r\n");
      out.write("\t\t\tshowDialog(win,function(data){\r\n");
      out.write("\t        \treturn false;      \r\n");
      out.write("    \t\t});\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t.delegate(\"#searchbox .data-P\",\"click\",function(){\r\n");
      out.write("\t\t\tvar self = this;\r\n");
      out.write("\t\t\tvar id = $(self).attr(\"data-id\");\r\n");
      out.write("\t\t\tvar name = $(self).attr(\"data-name\");\r\n");
      out.write("\t\t\tvar type = $(self).attr(\"data-type\");\r\n");
      out.write("\t\t\tvar win={title:name,modal:1,width:770,url:\"");
      out.print(path);
      out.write("/OrganizationController/forwardUnitPage.do?type=edit&orgId=\"+id};\r\n");
      out.write("\t\t\tshowDialog(win,function(data){\r\n");
      out.write("\t        \treturn false;      \r\n");
      out.write("    \t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\tfunction showDialog(win,callback)\r\n");
      out.write("\t{\r\n");
      out.write("\t  top.window.bootDialog.open({url:win.url,width:win.width,height:win.height,title:win.title,buttons: [\r\n");
      out.write("\t      {text: _dic._msg_yes,style:\"btn-primary\",onclick: function (item, dialog){\r\n");
      out.write("\t          dialog.find(\"iframe\")[0].contentWindow.submit(function(data){\r\n");
      out.write("\t            if(data.state == \"1\")\r\n");
      out.write("\t            {\r\n");
      out.write("\t              dialog.close();\r\n");
      out.write("\t              if(callback&&typeof(callback)==\"function\"){\r\n");
      out.write("\t                callback(data);\r\n");
      out.write("\t              }\r\n");
      out.write("\t            }\r\n");
      out.write("\t          });\r\n");
      out.write("\t      }},\r\n");
      out.write("\t      {text: _dic._msg_cancel,style:\"btn-danger\",onclick:function (item, dialog){dialog.close();}}\r\n");
      out.write("\t  ]});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("})();\r\n");
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
    // /baf/jsp/ui/newOrg/unitAndUser.jsp(15,9) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setCode("baf.org.unitAndUser");
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
    // /baf/jsp/ui/newOrg/unitAndUser.jsp(28,79) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setCode("baf.org.unit.searchQuery");
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
    // /baf/jsp/ui/newOrg/unitAndUser.jsp(40,82) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f2.setCode("baf.org.unit.resultsMatch");
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
    // /baf/jsp/ui/newOrg/unitAndUser.jsp(163,95) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f3.setCode("baf.org.user");
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
    // /baf/jsp/ui/newOrg/unitAndUser.jsp(164,98) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f4.setCode("baf.org.Organize");
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
    // /baf/jsp/ui/newOrg/unitAndUser.jsp(165,84) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f5.setCode("baf.org.post");
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
}
