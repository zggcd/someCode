package org.apache.jsp.baf.jsp.uimain;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class frame_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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
      response.setContentType("text/html;charset=utf-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");

response.setHeader("Pragma", "No-cache");
response.setHeader("Cache-Control", "no-cache");
response.setHeader("Expires", "0");

String moduleId = request.getParameter("id");
String moduleName = request.getParameter("moduleName");
String targetName = request.getParameter("targetName");
String img = request.getParameter("img");
 
      out.write("\r\n");
      out.write("  <head>\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/baf/js/jQuery/jquery-1.7.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/baf/jsp/ui/js/main.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<Style>\r\n");
      out.write("*,html,body {\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".ccs_menu li.hover a{\r\n");
      out.write("  color: #ffffff;\r\n");
      out.write("  background-color: #0088cc;\r\n");
      out.write("}\r\n");
      out.write(".ccs_menu li a span{float:right;font-family:\"宋体\";padding: 2px 0;}\r\n");
      out.write(".ccs_menu li.active{background-color: #ddd;}\r\n");
      out.write("</Style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"my_left_category\" style=\"position:absolute;top:0;left:0;\">\r\n");
      out.write("     <ul class=\"ccs_menu\" style=\"width:200px\">\r\n");
      out.write("     </ul>\r\n");
      out.write("     </div>\r\n");
      out.write("    \r\n");
      out.write("    <table width=\"100%\" border=\"0\" id=\"table1\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td  align=\"left\" valign=\"top\" id=\"td1\" style=\"width:210px;padding-left:2px;\">&nbsp;</td>\r\n");
      out.write("        <td id=\"td2\" valign=\"top\">\r\n");
      out.write("          <iframe name=\"mainFrame\" id=\"mainFrame\" title=\"mainFrame\" scrolling=\"no\" width=\"100%\" marginwidth=\"0\" framespacing=\"0\" marginheight=\"0\" frameborder=\"0\"  ></iframe>\r\n");
      out.write("            <div class=\"r dr\"></div>\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("  </body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("$(\".ccs_menu\").delegate(\"li\",\"click\",function(){\r\n");
      out.write("   $(\".ccs_menu li.active\").removeClass(\"active\");\r\n");
      out.write("   $(this).addClass(\"active\");\r\n");
      out.write("});\r\n");
      out.write("\r\n");
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
      out.write("            for(var i=0,menu;menu=menuList[i];i++){\r\n");
      out.write("            \tvar li = $(\"<li></li>\").html(\"<a target='mainFrame' id='\"+menu[3]+\"' href='\"+menu[1]+\"'>\"+menu[0]+\"</a>\").appendTo(\".ccs_menu\");\r\n");
      out.write("            \tif(\"N\"==menu[2]){\r\n");
      out.write("            \t\tli\r\n");
      out.write("            \t\t.bind(\"click\",function(){\r\n");
      out.write("            \t\t\treturn false;\r\n");
      out.write("            \t\t})\r\n");
      out.write("            \t\t.children(\"a\")\r\n");
      out.write("\t            \t\t.bind(\"mouseover\",function(ev){\r\n");
      out.write("\t    \t\t\t\t\t$(\".ccs_menu a.hover\").removeClass(\"hover\");\r\n");
      out.write("\t    \t\t\t\t\t$(this).addClass(\"hover\");\r\n");
      out.write("\t    \t\t\t\t\tif($(this).find(\"span\")[0]&&ev.relatedTarget!=$(this).find(\"span\")[0])showMenu(this);\r\n");
      out.write("\t            \t\t})\r\n");
      out.write("\t            \t\t.html(\"<span>&gt;</span>\"+menu[0]);\r\n");
      out.write("            \t}else{\r\n");
      out.write("            \t\tli\r\n");
      out.write("            \t\t.children(\"a\")\r\n");
      out.write("\t            \t\t.bind(\"mouseover\",function(ev){\r\n");
      out.write("\t    \t\t\t\t\t$(\".ccs_menu a.hover\").removeClass(\"hover\");\r\n");
      out.write("\t    \t\t\t\t\t$(this).addClass(\"hover\");\r\n");
      out.write("\t            \t\t})\r\n");
      out.write("            \t}\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function showMenu(obj){\r\n");
      out.write("   var id=$(obj).attr(\"id\");\r\n");
      out.write("    var url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/baf/jsp/uimain/moduleNavigationXMLData.jsp?id=\"+id;\r\n");
      out.write("     $.ajax({\r\n");
      out.write("        type: \"GET\",\r\n");
      out.write("        url: url,\r\n");
      out.write("        dataType: \"xml\",\r\n");
      out.write("        async:false, \r\n");
      out.write("        success: function(xml) {\r\n");
      out.write("            var menuList=[];\r\n");
      out.write("            var html=[];\r\n");
      out.write("            $(xml.documentElement.childNodes).each(function(){\r\n");
      out.write("                var text=$(this).attr(\"text\");\r\n");
      out.write("                var url=$(this).find(\"userdata[name=url]\").text();\r\n");
      out.write("              \r\n");
      out.write("                if(text&&url)menuList.push([text,url]);\r\n");
      out.write("            })\r\n");
      out.write("            if(menuList.length<1)return false;\r\n");
      out.write("            var loadUrl=\"#\";\r\n");
      out.write("            for(var i=0,menu;menu=menuList[i];i++){\r\n");
      out.write("               var parm={\r\n");
      out.write("               \t\ttext:menu[0],\r\n");
      out.write("               \t\turl:menu[1],\r\n");
      out.write("               \t\tisLeaf:menu[2],\r\n");
      out.write("               \t\tid:menu[3]\r\n");
      out.write("               }\r\n");
      out.write("               html.push(parm);\r\n");
      out.write("            }\r\n");
      out.write("\t\t    $(obj).ccs_menu_custom(html,\r\n");
      out.write("\t\t\t    function(menu){\r\n");
      out.write("\t\t\t        $(\".ccs_menu a.hover\").removeClass(\"hover\");\r\n");
      out.write("\t\t\t        $(obj).addClass(\"hover\");\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    function(data){\r\n");
      out.write("\t\t\t    \t$(\"#mainFrame\").attr(\"src\",data.url);\r\n");
      out.write("\t\t\t    \t$(\".ccs_menu li.active\").removeClass(\"active\");\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t    );\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("      \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("(function($) {\r\n");
      out.write("  $.fn.ccs_menu_custom = function(menuData,onmouseover,onselect,onmouseout){\r\n");
      out.write("    var self=this,\r\n");
      out.write("        menuWidth=\"200px\";\r\n");
      out.write("        html=\"<div style='margin:0;width:\"+menuWidth+\";'><ul class='ccs_menu' style='width:\"+menuWidth+\"'></ul></div>\";\r\n");
      out.write("    self.ccs_tip(html,{mode:\"x\",float:{x:-10,y:-5},callback:function(menu){\r\n");
      out.write("        //生成菜单\r\n");
      out.write("        var ul=menu.find(\".ccs_menu\");\r\n");
      out.write("        var len=menuData.length;\r\n");
      out.write("        var i=0;\r\n");
      out.write("        addMenu();\r\n");
      out.write("        menu.hover(function(){\r\n");
      out.write("            if(onmouseover&&typeof(onmouseover)==\"function\")onmouseover(menu);\r\n");
      out.write("        },function(){\r\n");
      out.write("            if(onmouseout&&typeof(onmouseout)==\"function\")onmouseout();\r\n");
      out.write("        })\r\n");
      out.write("        function addMenu(){\r\n");
      out.write("            var m=menuData[i]\r\n");
      out.write("                var html=\"<a href='#' onclick='return false;'>\"+m.text+\"</a>\";\r\n");
      out.write("                if(m.type==\"label\")html=\"<div class='label'>\"+m.text+\"</div>\";\r\n");
      out.write("                var li=$(\"<li></li>\").html(html).data(\"data\",m).unbind().bind(\"click\",function(){\r\n");
      out.write("                    if($(this).find(\"a\").length<1)return false;\r\n");
      out.write("                    if(onselect&&typeof(onselect)==\"function\")onselect($(this).data(\"data\"));                  \r\n");
      out.write("                      menu.remove();                  \r\n");
      out.write("                });\r\n");
      out.write("                if(m.type==\"split\")li.addClass(\"split\").html(\"&nbsp;\");\r\n");
      out.write("                li.appendTo(ul);\r\n");
      out.write("                if(menu)menu.data(\"resize\")();\r\n");
      out.write("                i++;\r\n");
      out.write("                if(i<menuData.length)addMenu();\r\n");
      out.write("        }\r\n");
      out.write("    }});\r\n");
      out.write("    return self;\r\n");
      out.write("  }\r\n");
      out.write("})(jQuery);\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    var lastHeight = 0;\r\n");
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
      out.write("window.onunload=function(){\r\n");
      out.write("    $(parent.window).unbind(\"scroll\");\r\n");
      out.write("}\r\n");
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
