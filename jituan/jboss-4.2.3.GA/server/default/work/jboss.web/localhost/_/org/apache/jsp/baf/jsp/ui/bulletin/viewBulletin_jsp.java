package org.apache.jsp.baf.jsp.ui.bulletin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.regaltec.common.util.Constant;
import java.util.Date;

public final class viewBulletin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/customTag.tld");
    _jspx_dependants.add("/WEB-INF/spring.tld");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
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
      out.write("<meta http-equiv=\"expires\" content=\"0\"> \r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/baf/jsp/ui/js/language/");
      out.print(locale);
      out.write(".js\" type=\"text/javascript\"></script> \r\n");
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
      out.write("<title>");
      if (_jspx_meth_spring_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("<style>\r\n");
      out.write("   .title {font-size:14px;font-weight:bold;};\r\n");
      out.write("  body{width:100%;overflow-x:hidden;}\r\n");
      out.write("  tr{cursor:pointer;}\r\n");
      out.write("  tr.selected td{background-color: #D6DFEB;} \r\n");
      out.write(" \r\n");
      out.write(" .grid .datagrid caption{background:#ddd;border:#aaa 1px solid;padding:5px 10px;height:30px;line-height:30px;}\r\n");
      out.write(" .grid .datagrid caption img{cursor:pointer;}\r\n");
      out.write(" .grid .datagrid tbody td a{font-size:15px;}\r\n");
      out.write(" \r\n");
      out.write(" .ui-menu-li {  \r\n");
      out.write("     border-radius: 5px 5px 0px 0px;  \r\n");
      out.write("     padding: 5px 10px 5px 10px;  \r\n");
      out.write("     list-style: none;  \r\n");
      out.write("     display: inline;  \r\n");
      out.write("    \r\n");
      out.write("     font-size: 14px;  \r\n");
      out.write("     color:#00629d;  \r\n");
      out.write("     font-weight:bold;\r\n");
      out.write("     text-shadow:5px 2px 5px #FFFFFF;  \r\n");
      out.write("     cursor: pointer;  \r\n");
      out.write(" }  \r\n");
      out.write(" .ui-menu-li-curr {  \r\n");
      out.write("    background:url(");
      out.print(path);
      out.write("/baf/jsp/ui/images/nav_title_main2.png) 50% 2px no-repeat;\r\n");
      out.write("     color:#666;\r\n");
      out.write(" }  \r\n");
      out.write("\r\n");
      out.write(" .ui-menu-li:hover {  \r\n");
      out.write("    background:url(");
      out.print(path);
      out.write("/baf/jsp/ui/images/nav_title_main2.png) 50% 2px no-repeat;\r\n");
      out.write("     *cursor:hand;\r\n");
      out.write(" } \r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"ccs_toolbar\" id=\"ccs_toolbar\">\r\n");
      out.write("   <span class=\"tools ccs_right\"><a href=\"#\" onclick=\"ev_more(this);return false;\">&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("&nbsp;</a></span>\r\n");
      out.write("   <form id=\"bulletinForm\">\r\n");
      out.write("    <table>\r\n");
      out.write("       \t<tr>\r\n");
      out.write("       \t\t\r\n");
      out.write("       \t\t<td align=\"right\">");
      if (_jspx_meth_spring_005fmessage_005f2(_jspx_page_context))
        return;
      out.write(": &nbsp;</td>\r\n");
      out.write("       \t\t<td><input class=\"ccs_text\" type=\"text\" id=\"title\" name=\"title\" ></td>\r\n");
      out.write("       \t\t<td align=\"right\">");
      if (_jspx_meth_spring_005fmessage_005f3(_jspx_page_context))
        return;
      out.write(": &nbsp;</td>\r\n");
      out.write("       \t\t<td><input class=\"ccs_text\" type=\"text\" id=\"keyWord\" name=\"keyWord\"></td>\r\n");
      out.write("       \t\t<td align=\"right\">&nbsp;<input type=\"button\" id=\"search\" class=\"ccs_button\" value=\"");
      if (_jspx_meth_spring_005fmessage_005f4(_jspx_page_context))
        return;
      out.write("\" onclick=\"query();\"/> &nbsp;<a href=\"javascript:void(0);\" onclick=\"clearValue();\" >");
      if (_jspx_meth_spring_005fmessage_005f5(_jspx_page_context))
        return;
      out.write("</a>\r\n");
      out.write("       \t\t</td>\r\n");
      out.write("       \t\t<td></td>  \r\n");
      out.write("       \t</tr>\r\n");
      out.write("       \t<tr>\r\n");
      out.write("       \t\t<td> &nbsp;");
      if (_jspx_meth_spring_005fmessage_005f6(_jspx_page_context))
        return;
      out.write(": &nbsp;</td>\r\n");
      out.write("       \t\t<td><input class=\"getDate ccs_text\" type=\"text\" id=\"startTime\" name=\"startTime\" readonly></td>\r\n");
      out.write("       \t\t<td> &nbsp;&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f7(_jspx_page_context))
        return;
      out.write(": &nbsp;</td>\r\n");
      out.write("       \t\t<td><input class=\"getDate ccs_text\" type=\"text\" id=\"endTime\" name=\"endTime\" readonly ></td>\r\n");
      out.write("       \t</tr>\r\n");
      out.write("       </table>\r\n");
      out.write("   </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write(" <table style=\"width:100%;height:100%;overflow:hidden;\" id=\"mainTable\"><tr>\r\n");
      out.write("   <td valign=\"top\">\r\n");
      out.write("   <div class=\"grid\"> \r\n");
      out.write("     \r\n");
      out.write("   <!-- 置顶公告 -->\r\n");
      out.write("  <table class=\"datagrid\" id=\"topBulletin\" style=\"display:\">\r\n");
      out.write("  \t<div class=\"ccs_right\">\r\n");
      out.write("  \t <caption>\r\n");
      out.write("         <div>");
      if (_jspx_meth_spring_005fmessage_005f8(_jspx_page_context))
        return;
      out.write(" </div> \r\n");
      out.write("      </caption>\r\n");
      out.write("     </div> \r\n");
      out.write("    <thead class=\"tools\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <th style=\"text-align:left;width:80px;padding-left: 2em;\"><input type=\"checkbox\" class=\"all\" /> ");
      if (_jspx_meth_spring_005fmessage_005f9(_jspx_page_context))
        return;
      out.write("</th>\r\n");
      out.write("        <th style=\"width:450px;padding-left:2em\">");
      if (_jspx_meth_spring_005fmessage_005f10(_jspx_page_context))
        return;
      out.write("</th>\r\n");
      out.write("        <th>&nbsp;</th>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <tbody id=\"topBulletinTbody\">\r\n");
      out.write("\t   \t\r\n");
      out.write("    </tbody>\r\n");
      out.write("  </table>\r\n");
      out.write("   <br><br><br>\r\n");
      out.write("  <!-- 公告管理列表 -->\r\n");
      out.write("  \r\n");
      out.write("  <table class=\"datagrid\" id=\"bulletinManageTable\" style=\"display:\">\r\n");
      out.write("  \t<div class=\"ccs_right\">\r\n");
      out.write("  \t  <caption>\r\n");
      out.write("         <div>");
      if (_jspx_meth_spring_005fmessage_005f11(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("       </caption>\r\n");
      out.write("    </div>\r\n");
      out.write("    <thead >\r\n");
      out.write("     <tr>\r\n");
      out.write("        <th style=\"text-align:left;width:80px;padding-left: 2em;\"><input type=\"checkbox\" class=\"all\" /> ");
      if (_jspx_meth_spring_005fmessage_005f12(_jspx_page_context))
        return;
      out.write("</th>\r\n");
      out.write("        <th style=\"width:50px;padding-left:2em\">");
      if (_jspx_meth_spring_005fmessage_005f13(_jspx_page_context))
        return;
      out.write("</th>\r\n");
      out.write("        <th style=\"width:450px;padding-left:2em\">");
      if (_jspx_meth_spring_005fmessage_005f14(_jspx_page_context))
        return;
      out.write("</th>\r\n");
      out.write("        <th>&nbsp;</th>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <tbody id=\"bulletinManageTbody\">\r\n");
      out.write("      \t\t\r\n");
      out.write("    </tbody>\r\n");
      out.write("  </table>\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"bulletinPage\" class=\"ccs_page\"></div>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t");
      if (_jspx_meth_spring_005fmessage_005f15(_jspx_page_context))
        return;
      out.write("：<img src=\"/baf/images/bulletin/blt_plain.gif\">&nbsp;&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f16(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;<img src=\"/baf/images/bulletin/blt_urgent.gif\">&nbsp;&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f17(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;<img src=\"/baf/images/bulletin/blt_exurgent.gif\">&nbsp;&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f18(_jspx_page_context))
        return;
      out.write("&nbsp;\r\n");
      out.write("\t&nbsp;<img src=\"/baf/images/bulletin/bulletin_open.gif\">&nbsp;&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f19(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;<img src=\"/baf/images/bulletin/bulletin_close.gif\">&nbsp;&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f20(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;<img src=\"/baf/images/bulletin/hasAttachment.gif\">&nbsp;&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f21(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;<img src=\"/baf/images/bulletin/noAttachment.gif\">&nbsp;&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f22(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("</body>\r\n");
      out.write("<script type='text/javascript'>\r\n");
      out.write("String.prototype.trim=function() { return this.replace(/(^\\s*)|(\\s*$)/g,\"\"); }\r\n");
      out.write(" $(\".getDate\").dateEditor({showTime:true});\r\n");
      out.write("\r\n");
      out.write("//页面样式加载\r\n");
      out.write(" //$(\".ccs_tools\").each(function(){\r\n");
      out.write("\r\n");
      out.write(" //   $(this).ccs_long_tools();\r\n");
      out.write(" // }); \r\n");
      out.write(" $(\"li\").bind(\"click\",function(){\r\n");
      out.write("    \t $(\"li.ui-menu-li-curr\").removeClass(\"ui-menu-li-curr\");\r\n");
      out.write("          $(this).addClass(\"ui-menu-li-curr\");\r\n");
      out.write("           parent.window.document.documentElement.scrollTop=parent.window.document.body.scrollTop=0;\r\n");
      out.write("  });\r\n");
      out.write("  $(\".datagrid tbody tr\").hover(\r\n");
      out.write("    function(){\r\n");
      out.write("        $(this).addClass(\"selected\");\r\n");
      out.write("        $(this).find(\".tools\").show();\r\n");
      out.write("    },function(){\r\n");
      out.write("        $(this).removeClass(\"selected\");\r\n");
      out.write("        $(this).find(\".tools\").hide();\r\n");
      out.write("    }\r\n");
      out.write(");\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\t$(function (){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"div.grid table.datagrid tbody\").delegate(\"tr\",\"mouseover\",function(){\r\n");
      out.write("\t\t   $(\"div.grid table.datagrid tbody tr\").removeClass(\"selected\");\r\n");
      out.write("\t\t   $(this).addClass(\"selected\");\r\n");
      out.write("\t\t   $(\".btnSpan\").hide();\r\n");
      out.write("\t\t   $(this).find(\".btnSpan\").show();\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t\tshowTopBulletinTableList();\r\n");
      out.write("\t\tshowBulletinManageTableList('','','','','1');\r\n");
      out.write("\t\t\r\n");
      out.write("    \r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t/****************** 展现顶级公告列表 ******************/\r\n");
      out.write("\tfunction showTopBulletinTableList(){\r\n");
      out.write("\t\t//loading(\"");
      if (_jspx_meth_spring_005fmessage_005f23(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\tvar url = \"");
      out.print(path);
      out.write("/viewBulletinController/queryTopBulletinList.do\";\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:url,\r\n");
      out.write("\t\t\ttype:'post',\r\n");
      out.write("\t\t\tdataType:'json',\r\n");
      out.write("\t\t\tcache:false,\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t$(\"#topBulletin tbody tr\").remove();\r\n");
      out.write("\t\t\t\tif(data && data.length != 0) {\r\n");
      out.write("\t\t\t\t\t$.each(data,function(i,obj){\r\n");
      out.write("\t\t\t\t\t\tvar html = \"<tr>\";\r\n");
      out.write("\t\t\t\t\t\tvar emergencySrc = '';\r\n");
      out.write("\t\t\t\t\t\tif(\"0\" == obj.emergency){\r\n");
      out.write("\t\t\t\t\t\t\temergencySrc = \"/baf/images/bulletin/blt_exurgent.gif\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"1\" == obj.emergency){\r\n");
      out.write("\t\t\t\t\t\t\temergencySrc = \"/baf/images/bulletin/blt_urgent.gif\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"2\" == obj.emergency){\r\n");
      out.write("\t\t\t\t\t\t\temergencySrc = \"/baf/images/bulletin/blt_plain.gif\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\thtml +=\"<td style='padding-left: 2em'><input type='checkbox' value=\\\"\\\">&nbsp;&nbsp;&nbsp;<img src='\" + emergencySrc+ \"'></td>\";\r\n");
      out.write("\t\t\t\t\t\tvar title = \"\";\r\n");
      out.write("\t\t\t\t\t\tif(obj.title) {\r\n");
      out.write("\t\t\t\t\t\t\ttitle = obj.title;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tvar publisherName = \"\";\r\n");
      out.write("\t\t\t\t\t\tif(obj.publisherName) {\r\n");
      out.write("\t\t\t\t\t\t\tpublisherName = obj.publisherName;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tvar publishTime = \"\";\r\n");
      out.write("\t\t\t\t\t\tif(obj.publishTime) {\r\n");
      out.write("\t\t\t\t\t\t\tpublishTime = new Date(obj.publishTime).pattern();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tvar expireDate = \"\";\r\n");
      out.write("\t\t\t\t\t\tif(obj.expireDate) {\r\n");
      out.write("\t\t\t\t\t\t\texpireDate = new Date(obj.expireDate).pattern();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tvar attachment = \"\";\r\n");
      out.write("\t\t\t\t\t\tif(\"N\" == obj.hasAttachment){\r\n");
      out.write("\t\t\t\t\t\t\tattachment = \"/baf/images/bulletin/noAttachment.gif\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"Y\" == obj.hasAttachment){\r\n");
      out.write("\t\t\t\t\t\t\tattachment = \"/baf/images/bulletin/hasAttachment.gif\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\thtml +=\"<td style='padding-left: 2em' ><a href='javascript:void(0);' onclick=\\\"ev_showBulletin('\" + obj.bulletinId  + \"');\\\">\" + title + \"</a>&nbsp;<img src='\" + attachment + \"'><br><span class='link_statu'>\" + publisherName + \"</span><br><span class='ccs_time'>\" + publishTime + \"</span> - <span class='ccs_time'>\" + expireDate + \"</span></td>\";\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\thtml +=\"<td></td>\";\r\n");
      out.write("\t\t\t\t\t\thtml +=\"</tr>\";\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$(\"#topBulletinTbody\").append(html);\r\n");
      out.write("\t\t\t\t\t});\t\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tvar html =\"<tr> <td colspan=\\\"3\\\" align=\\\"center\\\"> <div class='showMessageDialog' >");
      if (_jspx_meth_spring_005fmessage_005f24(_jspx_page_context))
        return;
      out.write("</div></td></tr>\";\r\n");
      out.write("\t\t\t\t\t$(\"#topBulletinTbody\").append(html);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror:function(){\r\n");
      out.write("\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f25(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//unloading();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t/****************** 展现公告管理列表 ******************/\r\n");
      out.write("\tfunction showBulletinManageTableList(title,keyWord,startTime,endTime,currPage){\r\n");
      out.write("\t\t//loading(\"");
      if (_jspx_meth_spring_005fmessage_005f26(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\tvar url = \"");
      out.print(path);
      out.write("/viewBulletinController/queryBulletinList.do\";\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:url,\r\n");
      out.write("\t\t\ttype:'post',\r\n");
      out.write("\t\t\tdata:{'currPage':currPage,'title':title,'startTime':startTime,\r\n");
      out.write("\t\t\t      'endTime':endTime,'keyWord':keyWord},\r\n");
      out.write("\t\t\tdataType:'json',\r\n");
      out.write("\t\t\tcache:false,\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t$(\"#bulletinManageTable tbody tr\").remove();\r\n");
      out.write("\t\t\t\tvar bulletinData = data.results;\r\n");
      out.write("\t\t\t\tif(bulletinData && bulletinData.length == 0) {\r\n");
      out.write("\t\t\t\t\t$.each(bulletinData,function(i,obj){\r\n");
      out.write("\t\t\t\t\t\tvar html = \"<tr>\";\r\n");
      out.write("\t\t\t\t\t\tvar emergencySrc = '';\r\n");
      out.write("\t\t\t\t\t\tif(\"0\" == obj.emergency){\r\n");
      out.write("\t\t\t\t\t\t\temergencySrc = \"");
      out.print(path);
      out.write("/baf/images/bulletin/blt_exurgent.gif\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"1\" == obj.emergency){\r\n");
      out.write("\t\t\t\t\t\t\temergencySrc = \"");
      out.print(path);
      out.write("/baf/images/bulletin/blt_urgent.gif\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"2\" == obj.emergency){\r\n");
      out.write("\t\t\t\t\t\t\temergencySrc = \"");
      out.print(path);
      out.write("/baf/images/bulletin/blt_plain.gif\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\thtml +=\"<td style='padding-left: 2em'><input type='checkbox' value=\\\"\\\">&nbsp;&nbsp;&nbsp;<img src='\" + emergencySrc+ \"'></td>\";\r\n");
      out.write("\t\t\t\t\t\tvar title = \"\";\r\n");
      out.write("\t\t\t\t\t\tif(obj.title) {\r\n");
      out.write("\t\t\t\t\t\t\ttitle = obj.title;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tvar publisherName = \"\";\r\n");
      out.write("\t\t\t\t\t\tif(obj.publisherName) {\r\n");
      out.write("\t\t\t\t\t\t\tpublisherName = obj.publisherName;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tvar publishTime = \"\";\r\n");
      out.write("\t\t\t\t\t\tif(obj.publishTime) {\r\n");
      out.write("\t\t\t\t\t\t\tpublishTime = new Date(obj.publishTime).pattern();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tvar expireDate = \"\";\r\n");
      out.write("\t\t\t\t\t\tif(obj.expireDate) {\r\n");
      out.write("\t\t\t\t\t\t\texpireDate = new Date(obj.expireDate).pattern();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tvar attachment = \"\";\r\n");
      out.write("\t\t\t\t\t\tif(\"N\" == obj.hasAttachment){\r\n");
      out.write("\t\t\t\t\t\t\tattachment = \"");
      out.print(path);
      out.write("/baf/images/bulletin/noAttachment.gif\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"Y\" == obj.hasAttachment){\r\n");
      out.write("\t\t\t\t\t\t\tattachment = \"");
      out.print(path);
      out.write("/baf/images/bulletin/hasAttachment.gif\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tvar isRead = \"");
      out.print(path);
      out.write("/baf/images/bulletin/bulletin_close.gif\";//未读\r\n");
      out.write("\t\t\t\t\t\tif(obj.readCount && parseInt(obj.readCount) > 0){//已读\r\n");
      out.write("\t\t\t\t\t\t\tisRead = \"");
      out.print(path);
      out.write("/baf/images/bulletin/bulletin_open.gif\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\thtml += \"<td style='padding-left: 2em'><img src='\" + isRead + \"'></td>\";\r\n");
      out.write("\t\t\t\t\t\thtml +=\"<td style='padding-left: 2em' ><a href='javascript:void(0);' onclick=\\\"ev_showBulletin('\" + obj.bulletinId  + \"');\\\">\" + title + \"</a>&nbsp;<img src='\" + attachment + \"'><br><span class='link_statu'>\" + publisherName + \"</span><br><span class='ccs_time'>\" + publishTime + \"</span> - <span class='ccs_time'>\" + expireDate + \"</span></td>\";\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\thtml +=\"<td>'</td>\";\r\n");
      out.write("\t\t\t\t\t\thtml +=\"</tr>\";\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$(\"#bulletinManageTbody\").append(html);\r\n");
      out.write("\t\t\t\t\t});\t\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tvar html =\"<tr> <td colspan=\\\"4\\\" align=\\\"center\\\"> <div class='showMessageDialog' >");
      if (_jspx_meth_spring_005fmessage_005f27(_jspx_page_context))
        return;
      out.write("</div></td></tr>\";\r\n");
      out.write("\t\t\t\t\t$(\"#bulletinManageTbody\").append(html);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t  $(\"#bulletinPage\").html(\"\");\t\t\r\n");
      out.write("\t\t\t  $(\"#bulletinPage\").attr(\"pageSize\",data.pageSize);\r\n");
      out.write("\t\t      $(\"#bulletinPage\").attr(\"totalCount\",data.totalCount);\r\n");
      out.write("\t\t      $(\"#bulletinPage\").attr(\"currentPage\",data.currPage);\r\n");
      out.write("\t\t      $(\"#bulletinPage\").attr(\"pageCount\",data.pageCount);\r\n");
      out.write("\t\t      $(\"#bulletinPage\").ccs_page(function(page){\r\n");
      out.write("\t             showBulletinManageTableList(title,keyWord,startTime,endTime,page)\r\n");
      out.write("\t\t       });\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror:function(){\r\n");
      out.write("\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f28(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//unloading();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/******************* 查看公告信息记录 *********************/\r\n");
      out.write("\tfunction ev_showBulletin(id){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar url = \"");
      out.print(path);
      out.write("/viewBulletinController/show.do?bulletinId=\" + id;\r\n");
      out.write("\t\r\n");
      out.write("\t     ccs_dialog.open(url,{width:'72%',unClose:false,zIndex:900,onClose:function(dialog,param)\r\n");
      out.write("        {\r\n");
      out.write("\t      showBulletinManageTableList('','','','',$(\"#bulletinPage\").attr(\"currentPage\"));\t\r\n");
      out.write("          if(!param)return false;//使用左侧关闭时 param为undefined 直接退出，不要执行以下的代码 \r\n");
      out.write("\t      if(param.refresh){\r\n");
      out.write("\t      }\r\n");
      out.write("\t    }}); \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".all\").click(function(){\r\n");
      out.write("\t    var sign=$(this).attr(\"checked\");\r\n");
      out.write("\t    $(\"input[type=checkbox]\").attr(\"checked\",sign);\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("  \r\n");
      out.write("\t function ev_more(obj){\r\n");
      out.write("\t    if($(obj).attr(\"rel\")!=\"1\"){\r\n");
      out.write("\t        $(obj).attr(\"rel\",\"1\").html(\"");
      if (_jspx_meth_spring_005fmessage_005f29(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t        $(obj).attr(\"rel\",\"1\");\r\n");
      out.write("\t        $(\"#ccs_toolbar\").animate({height:120},600);\r\n");
      out.write("\t    }else{\r\n");
      out.write("\t        $(obj).removeAttr(\"rel\").html(\"");
      if (_jspx_meth_spring_005fmessage_005f30(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t        $(obj).removeAttr(\"rel\");\r\n");
      out.write("\t        $(\"#ccs_toolbar\").animate({height:40},600);\r\n");
      out.write("\t   \t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("  \r\n");
      out.write("  /***********获取选中的IDS值***********/\r\n");
      out.write("  function getSelectCheckboxValue() {\r\n");
      out.write("  \tvar ids = \"\";\r\n");
      out.write("  \t$(\"input[type='checkbox']:checked\").each(function(){\r\n");
      out.write("  \t\tif(\"all\" != $(this).attr(\"class\")){\r\n");
      out.write("  \t\t\tif(ids != \"\"){\r\n");
      out.write("  \t\t\t\tids += \"$\"+$(this).val();\r\n");
      out.write("\t  \t\t}else{\r\n");
      out.write("\t  \t\t\tids = $(this).val();\r\n");
      out.write("\t  \t\t}\r\n");
      out.write("  \t\t}\r\n");
      out.write("  \t});\r\n");
      out.write("  \treturn ids;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  /***************** 去除勾选的复选框 ******************/\r\n");
      out.write("  function unCheckedBox(){\r\n");
      out.write("  \t$(\"input[type='checkbox']:checked\").each(function(){\r\n");
      out.write("  \t\t$(this).attr(\"checked\",false);\r\n");
      out.write("  \t});\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write(" /************时间转为格式为yyyy-MM-dd HH:mm:ss *****************/  \r\n");
      out.write(" Date.prototype.pattern=function(){\r\n");
      out.write(" \tvar now = \"\";\r\n");
      out.write("\tnow = this.getFullYear()+\"-\"; //读英文就行了\r\n");
      out.write("\tnow = now + (this.getMonth()+1)+\"-\";//取月的时候取的是当前月-1如果想取当前月+1就可以了\r\n");
      out.write("\tnow = now + this.getDate()+\" \";\r\n");
      out.write("\tnow = now + this.getHours()+\":\";\r\n");
      out.write("\tnow = now + this.getMinutes()+\":\";\r\n");
      out.write("\tnow = now + this.getSeconds()+\"\";\r\n");
      out.write("\treturn now;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" /************** 查询 **************/\r\n");
      out.write(" function query() {\r\n");
      out.write(" \tvar title = $(\"#title\").val();\r\n");
      out.write(" \tvar startTime = $(\"#startTime\").val();\r\n");
      out.write(" \tvar endTime = $(\"#endTime\").val();\r\n");
      out.write(" \tvar keyWord = $(\"#keyWord\").val();\r\n");
      out.write(" \tvar status = $(\"input[name='status']:checked\").eq(0).val();\r\n");
      out.write(" \tshowBulletinManageTableList(title,keyWord,startTime,endTime,'1')\r\n");
      out.write(" \t\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" /**********清除查询条件值**********/\r\n");
      out.write(" function clearValue() {\r\n");
      out.write(" \t$(\"#allStatus\").attr(\"checked\",true);\r\n");
      out.write(" \t$(\":text\").attr(\"value\",'');\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
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
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(31,7) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setCode("baf.bulletin.bulletinManager");
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
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(67,89) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setCode("baf.SeeMoreConditions");
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
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(72,27) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f2.setCode("baf.bulletin.titile");
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
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(74,27) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f3.setCode("baf.bulletin.keyword");
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
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(76,92) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f4.setCode("baf.Search");
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
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(76,212) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f5.setCode("baf.Clear");
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
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(81,20) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f6.setCode("baf.bulletin.startTime");
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
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(83,26) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f7.setCode("baf.bulletin.endTime");
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
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(98,14) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f8.setCode("baf.bulletin.topBulletin");
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
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(103,104) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f9.setCode("baf.bulletin.emergency");
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
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(104,49) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f10.setCode("baf.bulletin.titile");
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
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(118,14) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f11.setCode("baf.bulletin.bulletinManagerList");
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
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(123,104) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f12.setCode("baf.bulletin.emergency");
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
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(124,48) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f13.setCode("baf.bulletin.isCheck");
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

  private boolean _jspx_meth_spring_005fmessage_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f14 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f14.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f14.setParent(null);
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(125,49) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f14.setCode("baf.bulletin.titile");
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

  private boolean _jspx_meth_spring_005fmessage_005f15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f15 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f15.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f15.setParent(null);
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(141,1) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f15.setCode("baf.bulletin.photoExplain");
    int[] _jspx_push_body_count_spring_005fmessage_005f15 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f15 = _jspx_th_spring_005fmessage_005f15.doStartTag();
      if (_jspx_th_spring_005fmessage_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f15[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f15.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f15.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f15);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f16 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f16.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f16.setParent(null);
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(141,110) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f16.setCode("baf.bulletin.plain");
    int[] _jspx_push_body_count_spring_005fmessage_005f16 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f16 = _jspx_th_spring_005fmessage_005f16.doStartTag();
      if (_jspx_th_spring_005fmessage_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f16[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f16.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f16.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f16);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f17 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f17.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f17.setParent(null);
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(141,224) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f17.setCode("baf.bulletin.urgent");
    int[] _jspx_push_body_count_spring_005fmessage_005f17 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f17 = _jspx_th_spring_005fmessage_005f17.doStartTag();
      if (_jspx_th_spring_005fmessage_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f17[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f17.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f17.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f17);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f18 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f18.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f18.setParent(null);
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(141,341) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f18.setCode("baf.bulletin.exurgent");
    int[] _jspx_push_body_count_spring_005fmessage_005f18 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f18 = _jspx_th_spring_005fmessage_005f18.doStartTag();
      if (_jspx_th_spring_005fmessage_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f18[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f18.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f18.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f18);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f19 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f19.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f19.setParent(null);
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(142,69) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f19.setCode("baf.bulletin.checked");
    int[] _jspx_push_body_count_spring_005fmessage_005f19 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f19 = _jspx_th_spring_005fmessage_005f19.doStartTag();
      if (_jspx_th_spring_005fmessage_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f19[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f19.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f19.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f19);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f20 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f20.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f20.setParent(null);
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(142,189) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f20.setCode("baf.bulletin.checking");
    int[] _jspx_push_body_count_spring_005fmessage_005f20 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f20 = _jspx_th_spring_005fmessage_005f20.doStartTag();
      if (_jspx_th_spring_005fmessage_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f20[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f20.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f20.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f20);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f21 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f21.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f21.setParent(null);
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(142,309) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f21.setCode("baf.bulletin.withAttachment");
    int[] _jspx_push_body_count_spring_005fmessage_005f21 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f21 = _jspx_th_spring_005fmessage_005f21.doStartTag();
      if (_jspx_th_spring_005fmessage_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f21[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f21.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f21.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f21);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f22 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f22.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f22.setParent(null);
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(142,434) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f22.setCode("baf.bulletin.noAttachment");
    int[] _jspx_push_body_count_spring_005fmessage_005f22 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f22 = _jspx_th_spring_005fmessage_005f22.doStartTag();
      if (_jspx_th_spring_005fmessage_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f22[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f22.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f22.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f22);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f23 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f23.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f23.setParent(null);
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(187,13) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f23.setCode("baf.dict.queryIngWaitForMoment");
    int[] _jspx_push_body_count_spring_005fmessage_005f23 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f23 = _jspx_th_spring_005fmessage_005f23.doStartTag();
      if (_jspx_th_spring_005fmessage_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f23[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f23.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f23.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f23);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f24 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f24.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f24.setParent(null);
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(237,89) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f24.setCode("baf.NoRecord");
    int[] _jspx_push_body_count_spring_005fmessage_005f24 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f24 = _jspx_th_spring_005fmessage_005f24.doStartTag();
      if (_jspx_th_spring_005fmessage_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f24[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f24.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f24.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f24);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f25 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f25.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f25.setParent(null);
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(242,23) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f25.setCode("baf.OperateFail");
    int[] _jspx_push_body_count_spring_005fmessage_005f25 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f25 = _jspx_th_spring_005fmessage_005f25.doStartTag();
      if (_jspx_th_spring_005fmessage_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f25[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f25.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f25.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f25);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f26 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f26.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f26.setParent(null);
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(251,13) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f26.setCode("baf.dict.queryIngWaitForMoment");
    int[] _jspx_push_body_count_spring_005fmessage_005f26 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f26 = _jspx_th_spring_005fmessage_005f26.doStartTag();
      if (_jspx_th_spring_005fmessage_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f26[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f26.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f26.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f26);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f27 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f27.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f27.setParent(null);
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(309,89) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f27.setCode("baf.NoRecord");
    int[] _jspx_push_body_count_spring_005fmessage_005f27 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f27 = _jspx_th_spring_005fmessage_005f27.doStartTag();
      if (_jspx_th_spring_005fmessage_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f27[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f27.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f27.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f27);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f28 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f28.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f28.setParent(null);
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(322,23) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f28.setCode("baf.OperateFail");
    int[] _jspx_push_body_count_spring_005fmessage_005f28 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f28 = _jspx_th_spring_005fmessage_005f28.doStartTag();
      if (_jspx_th_spring_005fmessage_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f28[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f28.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f28.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f28);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f29 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f29.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f29.setParent(null);
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(351,38) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f29.setCode("baf.HideMoreConditions");
    int[] _jspx_push_body_count_spring_005fmessage_005f29 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f29 = _jspx_th_spring_005fmessage_005f29.doStartTag();
      if (_jspx_th_spring_005fmessage_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f29[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f29.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f29.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f29);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f30(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f30 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f30.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f30.setParent(null);
    // /baf/jsp/ui/bulletin/viewBulletin.jsp(355,40) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f30.setCode("baf.SeeMoreConditions");
    int[] _jspx_push_body_count_spring_005fmessage_005f30 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f30 = _jspx_th_spring_005fmessage_005f30.doStartTag();
      if (_jspx_th_spring_005fmessage_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f30[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f30.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f30.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f30);
    }
    return false;
  }
}
