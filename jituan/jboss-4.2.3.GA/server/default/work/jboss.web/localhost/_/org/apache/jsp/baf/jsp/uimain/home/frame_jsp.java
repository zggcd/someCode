package org.apache.jsp.baf.jsp.uimain.home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class frame_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/baf/jsp/ui/js/config.jsp");
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

response.setHeader("Pragma", "No-cache");
response.setHeader("Cache-Control", "no-cache");
response.setHeader("Expires", "0");

String moduleId = request.getParameter("id");
String moduleName = request.getParameter("moduleName");
String targetName = request.getParameter("targetName");
String img = request.getParameter("img");
 
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html lang=\"en\"> \r\n");
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
      out.write("    <title>Frame</title>\r\n");
      out.write("    <style>\r\n");
      out.write("    \thtml,body{height:100%;}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"navbar\">\r\n");
      out.write("\t<div class=\"navbar-inner\">\r\n");
      out.write("\t\t<ul class=\"nav subMenu\"></ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<iframe name=\"mainFrame\" id=\"mainFrame\" title=\"mainFrame\" scrolling=\"no\" width=\"100%\" marginwidth=\"0\" framespacing=\"0\" marginheight=\"0\" frameborder=\"0\"  ></iframe>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" var menuData = [];\r\n");
      out.write("$(\".subMenu\").delegate(\"li\",\"click\",function(){\r\n");
      out.write("   $(\".subMenu li.active\").removeClass(\"active\");\r\n");
      out.write("   $(this).addClass(\"active\");\r\n");
      out.write("});\r\n");
      out.write("//解析菜单\r\n");
      out.write("loadMenu();\r\n");
      out.write("function loadMenu(){\r\n");
      out.write("    var url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/baf/jsp/uimain/moduleNavigationXMLData.jsp?id=");
      out.print(moduleId);
      out.write("&&type=0\";\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        type: \"GET\",\r\n");
      out.write("        url: url,\r\n");
      out.write("        dataType: \"xml\",\r\n");
      out.write("        success: function(xml) {\r\n");
      out.write("            var menuList=[];\r\n");
      out.write("            var html=[];\r\n");
      out.write("            $(xml.documentElement.childNodes).each(function(){\r\n");
      out.write("                var text=$(this).attr(\"text\");\r\n");
      out.write("                var url=$(this).find(\"userdata[name=url]\").text();\r\n");
      out.write("                var isLeaf=$(this).find(\"userdata[name=isLeaf]\").text();\r\n");
      out.write("                var id=$(this).attr(\"id\");\r\n");
      out.write("                if(text&&url)menuList.push([text,url,isLeaf,id]);\r\n");
      out.write("            })\r\n");
      out.write("            if(menuList.length<1)return false;\r\n");
      out.write("            var loadUrl=\"#\";\r\n");
      out.write("            var menu=menuList[0];\r\n");
      out.write("            $(\"#mainFrame\").attr(\"src\",menu[1]);\r\n");
      out.write("            var num=0;\r\n");
      out.write("            if(menuList.length<6)\r\n");
      out.write("               num=menuList.length;\r\n");
      out.write("             else\r\n");
      out.write("               num=5;\r\n");
      out.write("             for(var i=0;i<num;i++){\r\n");
      out.write("                var menu=menuList[i];\r\n");
      out.write("                var li = $(\"<li></li>\").html(\"<a target='mainFrame' class='icon1' id='\"+menu[3]+\"' href='\"+menu[1]+\"'>\"+menu[0]+\"</a>\").appendTo(\".subMenu\");\r\n");
      out.write("                if(i==0)\r\n");
      out.write("                  li.addClass(\"active\");\r\n");
      out.write("             }\r\n");
      out.write("             if(menuList.length>5){\r\n");
      out.write("               var li_more = $(\"<li></li>\").addClass(\"dropdown\").html(\"<a href='#' class='dropdown-toggle' data-toggle='dropdown'>更多<b class='caret'></b></a>\").appendTo(\".subMenu\");\r\n");
      out.write("               var dropDown = $(\"<ul class='dropdown-menu' role='menu' aria-labelledby='dLabel'></ul>\").appendTo(li_more);\r\n");
      out.write("               for(var i=5, menu ;menu =  menuList[i];i++){\r\n");
      out.write("               \t  $(\".dropdown-menu\").append(\"<li class='more_li'><a  target='mainFrame' id='\"+menu[3]+\"' href='\"+menu[1]+\"'>\"+menu[0]+\"</a></li>\");\r\n");
      out.write("               }\r\n");
      out.write("             }\r\n");
      out.write("           \r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(" var lastHeight = 0;\r\n");
      out.write("    function setMainHeight() {\r\n");
      out.write("        var timer = setTimeout(function() {\r\n");
      out.write("            setMainHeight();\r\n");
      out.write("            clearTimeout(timer);\r\n");
      out.write("        }, 200);\r\n");
      out.write("        var obj=document.getElementById(\"mainFrame\");\r\n");
      out.write("        var iframe = obj.contentWindow || obj.contentDocument;\r\n");
      out.write("        var ibody = iframe.document.body;\r\n");
      out.write("        if (!ibody)return false;\r\n");
      out.write("        var h = ibody.scrollHeight;\r\n");
      out.write("        if ($.browser.safari||$.browser.chrome)h=iframe.document.documentElement.scrollHeight\r\n");
      out.write("        if (h != lastHeight) {\r\n");
      out.write("            if (h < 550)h = 550;\r\n");
      out.write("            obj.style.height = h + \"px\";\r\n");
      out.write("            lastHeight = h;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    setMainHeight();\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
}
