package org.apache.jsp.baf.jsp.ui.bulletin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.regaltec.common.util.Constant;
import java.util.Date;

public final class manageBulletin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"expires\" content=\"0\">  \r\n");
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
      out.write("       \t<tr>\r\n");
      out.write("       \t\t<td align=\"right\">");
      if (_jspx_meth_spring_005fmessage_005f8(_jspx_page_context))
        return;
      out.write(" : </td>\r\n");
      out.write("       \t\t<td colspan=\"3\" >&nbsp;&nbsp;<input type=\"radio\" id=\"allStatus\" name=\"status\" checked=\"checked\" value=\"-1\" > ");
      if (_jspx_meth_spring_005fmessage_005f9(_jspx_page_context))
        return;
      out.write(" <input type=\"radio\" name=\"status\" value=\"2\"> ");
      if (_jspx_meth_spring_005fmessage_005f10(_jspx_page_context))
        return;
      out.write(" <input type=\"radio\" name=\"status\" value=\"0\"> ");
      if (_jspx_meth_spring_005fmessage_005f11(_jspx_page_context))
        return;
      out.write(" <input type=\"radio\" name=\"status\" value=\"4\"> ");
      if (_jspx_meth_spring_005fmessage_005f12(_jspx_page_context))
        return;
      out.write("</td>\r\n");
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
      if (_jspx_meth_spring_005fmessage_005f13(_jspx_page_context))
        return;
      out.write(" </div> \r\n");
      out.write("      </caption>\r\n");
      out.write("     </div> \r\n");
      out.write("    <thead class=\"tools\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <th style=\"text-align:left;width:80px;padding-left: 2em;\"><input type=\"checkbox\" class=\"topall\" name=\"topbulletin\" /> ");
      if (_jspx_meth_spring_005fmessage_005f14(_jspx_page_context))
        return;
      out.write("</th>\r\n");
      out.write("        <th style=\"width:50px;padding-left:2em\">");
      if (_jspx_meth_spring_005fmessage_005f15(_jspx_page_context))
        return;
      out.write("</th>\r\n");
      out.write("        <th style=\"width:450px;padding-left:2em\">");
      if (_jspx_meth_spring_005fmessage_005f16(_jspx_page_context))
        return;
      out.write("</th>\r\n");
      out.write("        <th>&nbsp;</th>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <tbody id=\"topBulletinTbody\">\r\n");
      out.write("\t \t\r\n");
      out.write("    </tbody>\r\n");
      out.write("  </table>\r\n");
      out.write("   <br><br><br>\r\n");
      out.write("  <!-- 公告管理列表 -->\r\n");
      out.write("  \r\n");
      out.write("  <table class=\"datagrid\" id=\"bulletinManageTable\" style=\"display:\">\r\n");
      out.write("  \t<div class=\"ccs_right\">\r\n");
      out.write("  \t  <caption>\r\n");
      out.write("\t     <span class=\"tools ccs_right\">\r\n");
      out.write("\t       <!--   <input type=\"button\" class=\"ccs_button\"  value=\"新增\" onclick=\"ev_addBulletin();\"/>  -->\r\n");
      out.write("\t          <span class=\"ccs_tools\">\r\n");
      out.write("\t\t         <input type=\"button\" class=\"ccs_long_selbutton\"  value=\"");
      if (_jspx_meth_spring_005fmessage_005f17(_jspx_page_context))
        return;
      out.write("\"  />\r\n");
      out.write("\t\t         <ul class=\"ccs_menu\" id=\"menuID\">\r\n");
      out.write("\t\t            \r\n");
      out.write("\t\t          </ul>\r\n");
      out.write("\t          </span>\r\n");
      out.write("         </span>\r\n");
      out.write("         <div>");
      if (_jspx_meth_spring_005fmessage_005f18(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("       </caption>\r\n");
      out.write("    </div>\r\n");
      out.write("    <thead >\r\n");
      out.write("     <tr>\r\n");
      out.write("        <th style=\"text-align:left;width:80px;padding-left: 2em;\"><input type=\"checkbox\" class=\"all\" /> ");
      if (_jspx_meth_spring_005fmessage_005f19(_jspx_page_context))
        return;
      out.write("</th>\r\n");
      out.write("        <th style=\"width:50px;padding-left:2em\">");
      if (_jspx_meth_spring_005fmessage_005f20(_jspx_page_context))
        return;
      out.write("</th>\r\n");
      out.write("        <th style=\"width:380px;padding-left:2em\">");
      if (_jspx_meth_spring_005fmessage_005f21(_jspx_page_context))
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
      if (_jspx_meth_spring_005fmessage_005f22(_jspx_page_context))
        return;
      out.write("：<img src=\"/baf/images/bulletin/blt_plain.gif\">&nbsp;&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f23(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;<img src=\"/baf/images/bulletin/blt_urgent.gif\">&nbsp;&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f24(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;<img src=\"/baf/images/bulletin/blt_exurgent.gif\">&nbsp;&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f25(_jspx_page_context))
        return;
      out.write("&nbsp;\r\n");
      out.write("\t&nbsp;<img src=\"/baf/images/bulletin/blt_reverted1.gif\">&nbsp;&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f26(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;<img src=\"/baf/images/bulletin/blt_norevert1.gif\">&nbsp;&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f27(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;<img src=\"/baf/images/bulletin/blt_nlrevert1.gif\">&nbsp;&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f28(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;<img src=\"/baf/images/bulletin/hasAttachment.gif\">&nbsp;&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f29(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;<img src=\"/baf/images/bulletin/noAttachment.gif\">&nbsp;&nbsp;");
      if (_jspx_meth_spring_005fmessage_005f30(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("</body>\r\n");
      out.write("<script type='text/javascript'>\r\n");
      out.write("String.prototype.trim=function() { return this.replace(/(^\\s*)|(\\s*$)/g,\"\"); }\r\n");
      out.write(" $(\".getDate\").dateEditor({showTime:true});\r\n");
      out.write(" var paramRig = {\"edit_btn_flag\":\"false\",\"release_btn_flag\":\"false\",\"delete_btn_flag\":\"false\",\"cancel_btn_flag\":\"false\",\"top_btn_flag\":\"false\",\"cancel_top_btn_flag\":\"false\"}; \r\n");
      out.write("/**\r\n");
      out.write("var liHtml = \"<li ><a onclick=\\\"ev_deleteBulletin('','batch',this);\\\" style=\\\"color:#E0E0E0;\\\"  onmouseover=\\\"this.style.backgroundColor='#F0F0F0'\\\" >批量删除<li>'<br></li>\";\r\n");
      out.write("\t\tliHtml += \"<li ><a onclick=\\\"ev_setTopBulletin('','batch');\\\">批量置顶</a></li>\";\r\n");
      out.write("\t\tliHtml += \"<li><a onclick=\\\"ev_backoutBulletin('','batch');\\\">批量撤销</a></li>\";\r\n");
      out.write("\t\tliHtml += \"<li><a onclick=\\\"ev_publishBulletin('','batch');\\\">批量发布</a></li>\";\t  \r\n");
      out.write("\t\t$(\"#menuID\").html(liHtml); \r\n");
      out.write("\t*/\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//$(\"#menuID\").html(\"<li ><a onclick=\\\"ev_deleteBulletin('','batch',this);\\\" style=\\\"color:#E0E0E0;\\\"  onmouseover=\\\"this.style.backgroundColor='#F0F0F0'\\\" >批量删除</a></li><li ><a onclick=\\\"ev_setTopBulletin('','batch');\\\">批量置顶</a></li><li><a onclick=\\\"ev_backoutBulletin('','batch');\\\">批量撤销</a></li><li><a onclick=\\\"ev_publishBulletin('','batch');\\\">批量发布</a></li>\");\r\n");
      out.write("\t    \r\n");
      out.write("\t  \r\n");
      out.write("        \r\n");
      out.write("//页面样式加载\r\n");
      out.write(" $(\".ccs_tools\").each(function(){\r\n");
      out.write("\r\n");
      out.write("    $(this).ccs_long_tools();\r\n");
      out.write("  }); \r\n");
      out.write(" \r\n");
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
      out.write("\t\t});\t\r\n");
      out.write("\t\t//用户权限按钮控制\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"");
      out.print(path);
      out.write("/bulletinManageController/loadUserRights.do\",\r\n");
      out.write("\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\tasync:false,\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tif(data.delete == \"true\"){\r\n");
      out.write("\t\t\t\t\tparamRig.delete_btn_flag = \"true\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(data.edit == \"true\"){\r\n");
      out.write("\t\t\t\t\tparamRig.edit_btn_flag = \"true\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(data.release == \"true\"){\r\n");
      out.write("\t\t\t\t\tparamRig.release_btn_flag = \"true\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(data.cancel == \"true\"){\r\n");
      out.write("\t\t\t\t\tparamRig.cancel_btn_flag = \"true\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(data.setTop == \"true\"){\r\n");
      out.write("\t\t\t\t\tparamRig.top_btn_flag = \"true\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(data.cancelTop == \"true\"){\r\n");
      out.write("\t\t\t\t\tparamRig.cancel_top_btn_flag = \"true\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror:function(){\r\n");
      out.write("\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f31(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\t\r\n");
      out.write("\t\t/**\r\n");
      out.write("\t\tvar liHtml = \"<li ><a onclick=\\\"ev_deleteBulletin('','batch',this);\\\" style=\\\"color:#E0E0E0;\\\"  onmouseover=\\\"this.style.backgroundColor='#F0F0F0'\\\" >批量删除</a></li>\";\r\n");
      out.write("\t\tliHtml += \"<li ><a onclick=\\\"ev_setTopBulletin('','batch');\\\">批量置顶</a></li>\";\r\n");
      out.write("\t\tliHtml += \"<li><a onclick=\\\"ev_backoutBulletin('','batch');\\\">批量撤销</a></li>\";\r\n");
      out.write("\t\tliHtml += \"<li><a onclick=\\\"ev_publishBulletin('','batch');\\\">批量发布</a></li>\";\t  \r\n");
      out.write("\t\t$(\"#menuID\").html(liHtml); \r\n");
      out.write("\t\t*/\r\n");
      out.write("\t\t/**\r\n");
      out.write("\t\t$(\"li\").bind(\"click\",function(){\r\n");
      out.write("    \t  $(\"li.ui-menu-li-curr\").removeClass(\"ui-menu-li-curr\");\r\n");
      out.write("          $(this).addClass(\"ui-menu-li-curr\");\r\n");
      out.write("           parent.window.document.documentElement.scrollTop=parent.window.document.body.scrollTop=0;\r\n");
      out.write("        });\r\n");
      out.write("        */\r\n");
      out.write("\t\tshowTopBulletinTableList();\r\n");
      out.write("\t\tshowBulletinManageTableList('','','','','-1','1');\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t/****************** 展现顶级公告列表 ******************/\r\n");
      out.write("\tfunction showTopBulletinTableList(){\r\n");
      out.write("\t\t//loading(\"");
      if (_jspx_meth_spring_005fmessage_005f32(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\tvar url = \"");
      out.print(path);
      out.write("/bulletinManageController/queryTopBulletinList.do\";\r\n");
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
      out.write("\t\t\t\t\t\thtml +=\"<td style='padding-left: 2em'><input type='checkbox' name='topbulletin' value=\\\"\" + obj.bulletinId+ \"\\\">&nbsp;&nbsp;&nbsp;<img src='\" + emergencySrc+ \"'></td>\";\r\n");
      out.write("\t\t\t\t\t\tvar status = \"\";\r\n");
      out.write("\t\t\t\t\t\tif(\"0\" == obj.status){\r\n");
      out.write("\t\t\t\t\t\t\tstatus = \"");
      if (_jspx_meth_spring_005fmessage_005f33(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"1\" == obj.status){\r\n");
      out.write("\t\t\t\t\t\t\tstatus = \"");
      if (_jspx_meth_spring_005fmessage_005f34(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"2\" == obj.status){\r\n");
      out.write("\t\t\t\t\t\t\tstatus = \"");
      if (_jspx_meth_spring_005fmessage_005f35(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"3\" == obj.status){\r\n");
      out.write("\t\t\t\t\t\t\tstatus = \"");
      if (_jspx_meth_spring_005fmessage_005f36(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"4\" == obj.status){\r\n");
      out.write("\t\t\t\t\t\t\tstatus = \"");
      if (_jspx_meth_spring_005fmessage_005f37(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\thtml +=\"<input type='hidden' id='\" + obj.bulletinId + \"' value='\" + obj.status + \"' >\";\r\n");
      out.write("\t\t\t\t\t\thtml +=\"<td style='padding-left: 2em' >\" + status + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\tvar responseSrc = \"\";\r\n");
      out.write("\t\t\t\t\t\tif(\"Y\" == obj.isResponsed && \"Y\" == obj.needResponse){\r\n");
      out.write("\t\t\t\t\t\t\tresponseSrc = \"/baf/images/bulletin/blt_reverted1.gif\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"N\" == obj.isResponsed && \"Y\" == obj.needResponse){\r\n");
      out.write("\t\t\t\t\t\t\tresponseSrc = \"/baf/images/bulletin/blt_norevert1.gif\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"N\" == obj.needResponse){\r\n");
      out.write("\t\t\t\t\t\t\tresponseSrc = \"/baf/images/bulletin/blt_nlrevert1.gif\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
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
      out.write("\t\t\t\t\t\tvar attachment = \"\";\r\n");
      out.write("\t\t\t\t\t\tif(\"N\" == obj.hasAttachment){\r\n");
      out.write("\t\t\t\t\t\t\tattachment = \"/baf/images/bulletin/noAttachment.gif\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"Y\" == obj.hasAttachment){\r\n");
      out.write("\t\t\t\t\t\t\tattachment = \"/baf/images/bulletin/hasAttachment.gif\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\thtml +=\"<td style='padding-left: 2em' >\" + title + \"&nbsp;&nbsp;&nbsp;<img src='\" + responseSrc + \"'>&nbsp;<img src='\" + attachment + \"'> <div class='allow'>\" + publisherName + \"</div><div class='ccs_time'>\" + publishTime + \"</div></td>\";\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\thtml +=\"<td>'<span class='ccs_tools btnSpan' style='display: none'>\";\r\n");
      out.write("\t\t\t\t\t\tvar className = \"ccs_button\";\r\n");
      out.write("\t\t\t\t\t\tif(\"2\" == obj.status || \"false\" == paramRig.release_btn_flag){\r\n");
      out.write("\t\t\t\t\t\t\tclassName = \"ccs_button_disabled\";\r\n");
      out.write("\t\t\t\t\t\t\thtml += \"<input type='button' class='\" + className + \"' onclick=\\\"\\\" value='");
      if (_jspx_meth_spring_005fmessage_005f38(_jspx_page_context))
        return;
      out.write("' />\";\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\thtml += \"<input type='button' class='\" + className + \"' onclick=\\\"ev_editBulletin('\" + obj.bulletinId + \"');\\\" value='");
      if (_jspx_meth_spring_005fmessage_005f39(_jspx_page_context))
        return;
      out.write("' />\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif(\"false\" == paramRig.delete_btn_flag){\r\n");
      out.write("\t\t\t\t\t\t\thtml +=\"<input type='button' class='ccs_button_disabled' onclick=\\\"\\\" value='");
      if (_jspx_meth_spring_005fmessage_005f40(_jspx_page_context))
        return;
      out.write("' />\";\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\thtml +=\"<input type='button' class='ccs_button' onclick=\\\"ev_deleteBulletin('\" + obj.bulletinId + \"','',this);\\\" value='");
      if (_jspx_meth_spring_005fmessage_005f41(_jspx_page_context))
        return;
      out.write("' />\";\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif(\"false\" == paramRig.cancel_top_btn_flag){\r\n");
      out.write("\t\t\t\t\t\t\thtml +=\"<input type='button' class='ccs_button_disabled'  value='");
      if (_jspx_meth_spring_005fmessage_005f42(_jspx_page_context))
        return;
      out.write("' onclick=\\\"\\\" />\";\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\thtml +=\"<input type='button' class='ccs_button'  value='");
      if (_jspx_meth_spring_005fmessage_005f43(_jspx_page_context))
        return;
      out.write("' onclick=\\\"ev_cancelTopBulletin('\" + obj.bulletinId+ \"');\\\" />\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\thtml +=\"</span></td>\";\r\n");
      out.write("\t\t\t\t\t\thtml +=\"</tr>\";\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$(\"#topBulletinTbody\").append(html);\r\n");
      out.write("\t\t\t\t\t});\t\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tvar html =\"<tr> <td colspan=\\\"6\\\" align=\\\"center\\\"> <div class='showMessageDialog' >");
      if (_jspx_meth_spring_005fmessage_005f44(_jspx_page_context))
        return;
      out.write("</div></td></tr>\";\r\n");
      out.write("\t\t\t\t\t$(\"#topBulletinTbody\").append(html);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror:function(){\r\n");
      out.write("\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f45(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//unloading();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t/****************** 展现公告管理列表 ******************/\r\n");
      out.write("\tfunction showBulletinManageTableList(title,keyWord,startTime,endTime,status,currPage){\r\n");
      out.write("\t\t//loading(\"");
      if (_jspx_meth_spring_005fmessage_005f46(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\tvar url = \"");
      out.print(path);
      out.write("/bulletinManageController/queryBulletinList.do\";\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:url,\r\n");
      out.write("\t\t\ttype:'post',\r\n");
      out.write("\t\t\tdata:{'currPage':currPage,'title':title,'startTime':startTime,\r\n");
      out.write("\t\t\t      'endTime':endTime,'keyWord':keyWord,'status':status},\r\n");
      out.write("\t\t\tdataType:'json',\r\n");
      out.write("\t\t\tcache:false,\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t$(\"#bulletinManageTable tbody tr\").remove();\r\n");
      out.write("\t\t\t\tvar bulletinData = data.results;\r\n");
      out.write("\t\t\t\tif(bulletinData && bulletinData.length != 0) {\r\n");
      out.write("\t\t\t\t\t$.each(bulletinData,function(i,obj){\r\n");
      out.write("\t\t\t\t\t\tvar html = \"<tr>\";\r\n");
      out.write("\t\t\t\t\t\tvar emergencySrc = '';\r\n");
      out.write("\t\t\t\t\t\tif(\"0\" == obj.emergency){\r\n");
      out.write("\t\t\t\t\t\t\temergencySrc = \"/baf/images/bulletin/blt_exurgent.gif\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"1\" == obj.emergency){\r\n");
      out.write("\t\t\t\t\t\t\temergencySrc = \"/baf/images/bulletin/blt_urgent.gif\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"2\" == obj.emergency){\r\n");
      out.write("\t\t\t\t\t\t\temergencySrc = \"/baf/images/bulletin/blt_plain.gif\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\thtml +=\"<td style='padding-left: 2em'><input type='checkbox' value=\\\"\" + obj.bulletinId +\"\\\">&nbsp;&nbsp;&nbsp;<img src='\" + emergencySrc+ \"'></td>\";\r\n");
      out.write("\t\t\t\t\t\tvar status = \"\";\r\n");
      out.write("\t\t\t\t\t\tif(\"0\" == obj.status){\r\n");
      out.write("\t\t\t\t\t\t\tstatus = \"");
      if (_jspx_meth_spring_005fmessage_005f47(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"1\" == obj.status){\r\n");
      out.write("\t\t\t\t\t\t\tstatus = \"");
      if (_jspx_meth_spring_005fmessage_005f48(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"2\" == obj.status){\r\n");
      out.write("\t\t\t\t\t\t\tstatus = \"");
      if (_jspx_meth_spring_005fmessage_005f49(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"3\" == obj.status){\r\n");
      out.write("\t\t\t\t\t\t\tstatus = \"");
      if (_jspx_meth_spring_005fmessage_005f50(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"4\" == obj.status){\r\n");
      out.write("\t\t\t\t\t\t\tstatus = \"");
      if (_jspx_meth_spring_005fmessage_005f51(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\thtml +=\"<input type='hidden' id='\" + obj.bulletinId + \"' value='\" + obj.status + \"' >\";\r\n");
      out.write("\t\t\t\t\t\thtml +=\"<td style='padding-left: 2em' >\" + status + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\tvar responseSrc = \"\";\r\n");
      out.write("\t\t\t\t\t\tif(\"Y\" == obj.isResponsed && \"Y\" == obj.needResponse){\r\n");
      out.write("\t\t\t\t\t\t\tresponseSrc = \"/baf/images/bulletin/blt_reverted1.gif\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"N\" == obj.isResponsed && \"Y\" == obj.needResponse){\r\n");
      out.write("\t\t\t\t\t\t\tresponseSrc = \"/baf/images/bulletin/blt_norevert1.gif\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"N\" == obj.needResponse){\r\n");
      out.write("\t\t\t\t\t\t\tresponseSrc = \"/baf/images/bulletin/blt_nlrevert1.gif\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
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
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tvar attachment = \"\";\r\n");
      out.write("\t\t\t\t\t\tif(\"N\" == obj.hasAttachment){\r\n");
      out.write("\t\t\t\t\t\t\tattachment = \"/baf/images/bulletin/noAttachment.gif\";\r\n");
      out.write("\t\t\t\t\t\t}else if(\"Y\" == obj.hasAttachment){\r\n");
      out.write("\t\t\t\t\t\t\tattachment = \"/baf/images/bulletin/hasAttachment.gif\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\thtml +=\"<td style='padding-left: 2em' >\" + title + \"&nbsp;&nbsp;&nbsp;<img src='\" + responseSrc + \"'>&nbsp;<img src='\" + attachment + \"'><div class='allow'>\" + publisherName + \"</div><div class='ccs_time'>\" + publishTime + \"</div></td>\";\r\n");
      out.write("\t\t\t\t\t\thtml +=\"<td>' <span class='ccs_tools btnSpan' style='display: none'>\";\r\n");
      out.write("\t\t\t\t\t\tvar className = \"ccs_button\";\r\n");
      out.write("\t\t\t\t\t\tif(\"2\" == obj.status || \"false\" == paramRig.edit_btn_flag){\r\n");
      out.write("\t\t\t\t\t\t\tclassName = \"ccs_button_disabled\";\r\n");
      out.write("\t\t\t\t\t\t\thtml += \"<input type='button' class='\" + className + \"' onclick=\\\"\\\" value='");
      if (_jspx_meth_spring_005fmessage_005f52(_jspx_page_context))
        return;
      out.write("' />\";\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\thtml += \"<input type='button' class='\" + className + \"' onclick=\\\"ev_editBulletin('\" + obj.bulletinId + \"');\\\" value='");
      if (_jspx_meth_spring_005fmessage_005f53(_jspx_page_context))
        return;
      out.write("' />\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif(\"false\" == paramRig.delete_btn_flag){\r\n");
      out.write("\t\t\t\t\t\t\thtml += \"<input type='button' class='ccs_button_disabled' onclick=\\\"\\\" value='");
      if (_jspx_meth_spring_005fmessage_005f54(_jspx_page_context))
        return;
      out.write("' />\";\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\thtml += \"<input type='button' class='ccs_button' onclick=\\\"ev_deleteBulletin('\" + obj.bulletinId + \"','',this);\\\" value='");
      if (_jspx_meth_spring_005fmessage_005f55(_jspx_page_context))
        return;
      out.write("' />\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif(\"4\" == obj.status || \"false\" == paramRig.cancel_btn_flag){\r\n");
      out.write("\t\t\t\t\t\t\thtml += \"<input type='button' class='ccs_button_disabled' onclick=\\\"\\\" value='");
      if (_jspx_meth_spring_005fmessage_005f56(_jspx_page_context))
        return;
      out.write("' />\";\r\n");
      out.write("\t\t\t\t\t\t}else {\r\n");
      out.write("\t\t\t\t\t\t\thtml += \"<input type='button' class='ccs_button' onclick=\\\"ev_backoutBulletin('\" + obj.bulletinId + \"','');\\\" value='");
      if (_jspx_meth_spring_005fmessage_005f57(_jspx_page_context))
        return;
      out.write("' />\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif(\"false\" == paramRig.top_btn_flag){\r\n");
      out.write("\t\t\t\t\t\t\thtml += \"<input type='button' class='ccs_button_disabled'  value='");
      if (_jspx_meth_spring_005fmessage_005f58(_jspx_page_context))
        return;
      out.write("' onclick=\\\"\\\" />\";\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\thtml += \"<input type='button' class='ccs_button'  value='");
      if (_jspx_meth_spring_005fmessage_005f59(_jspx_page_context))
        return;
      out.write("' onclick=\\\"ev_setTopBulletin('\" + obj.bulletinId + \"','');\\\" />\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif(\"2\" == obj.status || \"false\" == paramRig.release_btn_flag){\r\n");
      out.write("\t\t\t\t\t\t\thtml += \"<input type='button' class='ccs_button_disabled' onclick=\\\"\\\" value='");
      if (_jspx_meth_spring_005fmessage_005f60(_jspx_page_context))
        return;
      out.write("' />\";\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\thtml += \"<input type='button' class='ccs_button' onclick=\\\"ev_publishBulletin('\" + obj.bulletinId + \"','');\\\" value='");
      if (_jspx_meth_spring_005fmessage_005f61(_jspx_page_context))
        return;
      out.write("' />\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\thtml += \"</span></td>\";\r\n");
      out.write("\t\t\t\t\t\thtml += \"</tr>\";\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$(\"#bulletinManageTbody\").append(html);\r\n");
      out.write("\t\t\t\t\t});\t\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tvar html =\"<tr> <td colspan=\\\"6\\\" align=\\\"center\\\"> <div class='showMessageDialog' >");
      if (_jspx_meth_spring_005fmessage_005f62(_jspx_page_context))
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
      out.write("\t             showBulletinManageTableList(title,keyWord,startTime,endTime,status,page)\r\n");
      out.write("\t\t       });\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror:function(){\r\n");
      out.write("\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f63(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//unloading();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/******************* 添加公告信息记录 *********************/\r\n");
      out.write("\tfunction ev_addBulletin(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar url = \"");
      out.print(path);
      out.write("/bulletinManageController/toAddPage.do\";\r\n");
      out.write("\t\r\n");
      out.write("\t     ccs_dialog.open(url,{width:'72%',unClose:true,zIndex:900,onClose:function(dialog,param)\r\n");
      out.write("        {\r\n");
      out.write("          if(!param)return false;//使用左侧关闭时 param为undefined 直接退出，不要执行以下的代码 \r\n");
      out.write("\t      if(param.refresh){\r\n");
      out.write("\t      \tshowBulletinManageTableList('','','','','-1','1');\r\n");
      out.write("\t      }\r\n");
      out.write("\t    }}); \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/******************* 编辑公告信息 ********************/\r\n");
      out.write("\tfunction ev_editBulletin(id){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar url = \"");
      out.print(path);
      out.write("/bulletinManageController/show.do?bulletinId=\" + id;\r\n");
      out.write("\t\r\n");
      out.write("\t     ccs_dialog.open(url,{width:'72%',unClose:true,zIndex:900,onClose:function(dialog,param)\r\n");
      out.write("        {\r\n");
      out.write("          if(!param)return false;//使用左侧关闭时 param为undefined 直接退出，不要执行以下的代码 \r\n");
      out.write("\t      if(param.refresh){\r\n");
      out.write("\t      \tshowBulletinManageTableList('','','','','-1',$(\"#bulletinPage\").attr(\"currentPage\"));\r\n");
      out.write("\t      \tshowTopBulletinTableList();\r\n");
      out.write("\t      }\r\n");
      out.write("\t    }}); \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/******************* 发布公告信息 ********************/\r\n");
      out.write("\tfunction ev_publishBulletin(id,batch){\r\n");
      out.write("\t\tif(\"batch\" == batch){//批量发布时\r\n");
      out.write("\t\t\t//作验证\r\n");
      out.write("\t\t\tid = getSelectCheckboxValue();\r\n");
      out.write("\t\t\tif(\"\" == id) {\r\n");
      out.write("\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f64(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar flag = checkStatus(id,'2'); //检查是否存在已发布公告\r\n");
      out.write("\t\t\tif(flag){\r\n");
      out.write("\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f65(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar url = \"");
      out.print(path);
      out.write("/bulletinManageController/publish.do?bulletinIds=\" + id;\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:url,\r\n");
      out.write("\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tif(\"1\" == data.state){\r\n");
      out.write("\t\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f66(_jspx_page_context))
        return;
      out.write("\",null,\"msgSuccess\");\r\n");
      out.write("\t\t\t\t\tshowBulletinManageTableList('','','','','-1',$(\"#bulletinPage\").attr(\"currentPage\"));\r\n");
      out.write("\t\t\t\t\tshowTopBulletinTableList();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror:function(){\r\n");
      out.write("\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f67(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/******************* 取消置顶公告 ********************/\r\n");
      out.write("\tfunction ev_cancelTopBulletin(id){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar url = \"");
      out.print(path);
      out.write("/bulletinManageController/cancelTop.do?bulletinId=\" + id;\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:url,\r\n");
      out.write("\t\t\ttype:'post',\r\n");
      out.write("\t\t\tdataType:'json',\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tif(\"1\" == data.state){\r\n");
      out.write("\t\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f68(_jspx_page_context))
        return;
      out.write("\",null,\"msgSuccess\");\r\n");
      out.write("\t\t\t\t\tshowBulletinManageTableList('','','','','-1',$(\"#bulletinPage\").attr(\"currentPage\"));\r\n");
      out.write("\t\t\t\t\tshowTopBulletinTableList();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror:function(){\r\n");
      out.write("\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f69(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t/******************* 置顶公告 ********************/\r\n");
      out.write("\tfunction ev_setTopBulletin(id,batch){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar url = \"");
      out.print(path);
      out.write("/bulletinManageController/setTop.do\";\r\n");
      out.write("\t\tif(\"batch\" == batch){//批量发布时\r\n");
      out.write("\t\t\t//作验证\r\n");
      out.write("\t\t\tid = getSelectCheckboxValueForManagerBulletin();\r\n");
      out.write("\t\t\tif(\"\" == id) {\r\n");
      out.write("\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f70(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tid=id.split(\"$\").join(\"#\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:url,\r\n");
      out.write("\t\t\ttype:'post',\r\n");
      out.write("\t\t\tdataType:'json',\r\n");
      out.write("\t\t\tdata:{'bulletinId':id},\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tif(\"1\" == data.state){\r\n");
      out.write("\t\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f71(_jspx_page_context))
        return;
      out.write("\",null,\"msgSuccess\");\r\n");
      out.write("\t\t\t\t\tshowBulletinManageTableList('','','','','-1',$(\"#bulletinPage\").attr(\"currentPage\"));\r\n");
      out.write("\t\t\t\t\tshowTopBulletinTableList();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror:function(){\r\n");
      out.write("\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f72(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/******************* 撤销公告 ********************/\r\n");
      out.write("\tfunction ev_backoutBulletin(id,batch){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar url = \"");
      out.print(path);
      out.write("/bulletinManageController/backout.do\";\r\n");
      out.write("\t\tif(\"batch\" == batch){//批量撤销时\r\n");
      out.write("\t\t\tid = getSelectCheckboxValue();\r\n");
      out.write("\t\t\tif(\"\" == id) {\r\n");
      out.write("\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f73(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:url,\r\n");
      out.write("\t\t\ttype:'post',\r\n");
      out.write("\t\t\tdataType:'json',\r\n");
      out.write("\t\t\tdata:{'bulletinIds':id},\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tif(\"1\" == data.state){\r\n");
      out.write("\t\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f74(_jspx_page_context))
        return;
      out.write("\",null,\"msgSuccess\");\r\n");
      out.write("\t\t\t\t\tshowBulletinManageTableList('','','','','-1',$(\"#bulletinPage\").attr(\"currentPage\"));\r\n");
      out.write("\t\t\t\t\tshowTopBulletinTableList();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror:function(){\r\n");
      out.write("\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f75(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/******************* 删除公告 ********************/\r\n");
      out.write("\tfunction ev_deleteBulletin(id,batch,obj){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(\"batch\" == batch){//批量删除时\r\n");
      out.write("\t\t\tid = getSelectCheckboxValue();\r\n");
      out.write("\t\t\tif(\"\" == id) {\r\n");
      out.write("\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f76(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tid = id.split(\"$\").join(\"#\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(obj).ccs_confirm(\"");
      if (_jspx_meth_spring_005fmessage_005f77(_jspx_page_context))
        return;
      out.write("\",function(){\r\n");
      out.write("\t\t\t  $.ajax({\r\n");
      out.write("\t\t\t\turl:\"");
      out.print(path);
      out.write("/bulletinManageController/delete.do\",\r\n");
      out.write("\t\t\t\ttype:'post',\r\n");
      out.write("\t\t\t\tdataType:'json',\r\n");
      out.write("\t\t\t\tdata:{'bulletinIds':id},\r\n");
      out.write("\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\tif(\"1\" == data.state){\r\n");
      out.write("\t\t\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f78(_jspx_page_context))
        return;
      out.write("\",null,\"msgSuccess\");\r\n");
      out.write("\t\t\t\t\t\tshowBulletinManageTableList('','','','','-1','1');\r\n");
      out.write("\t\t\t\t\t\tshowTopBulletinTableList();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror:function(){\r\n");
      out.write("\t\t\t\t\tshowGlobalMessage(\"");
      if (_jspx_meth_spring_005fmessage_005f79(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});  \r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//公告管理列表全选\r\n");
      out.write("\t$(\".all\").click(function(){\r\n");
      out.write("\t    var sign=$(this).attr(\"checked\");\r\n");
      out.write("\t    $(\"input[type=checkbox][name!=topbulletin]\").attr(\"checked\",sign);\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t//置顶公告列表全选\r\n");
      out.write("\t$(\".topall\").click(function(){\r\n");
      out.write("\t    var sign=$(this).attr(\"checked\");\r\n");
      out.write("\t    $(\"input[type=checkbox][name=topbulletin]\").attr(\"checked\",sign);\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("  \r\n");
      out.write("\t function ev_more(obj){\r\n");
      out.write("\t    if($(obj).attr(\"rel\")!=\"1\"){\r\n");
      out.write("\t        $(obj).attr(\"rel\",\"1\").html(\"");
      if (_jspx_meth_spring_005fmessage_005f80(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t        $(obj).attr(\"rel\",\"1\");\r\n");
      out.write("\t        $(\"#ccs_toolbar\").animate({height:120},600);\r\n");
      out.write("\t    }else{\r\n");
      out.write("\t        $(obj).removeAttr(\"rel\").html(\"");
      if (_jspx_meth_spring_005fmessage_005f81(_jspx_page_context))
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
      out.write("  \t$(\"input[type='checkbox'][class!='all'][class!='topall']:checked\").each(function(){\r\n");
      out.write("\t\tif(ids != \"\"){\r\n");
      out.write("\t\t\tids += \"$\"+$(this).val();\r\n");
      out.write("  \t\t}else{\r\n");
      out.write("  \t\t\tids = $(this).val();\r\n");
      out.write("  \t\t}\r\n");
      out.write("  \t});\r\n");
      out.write("  \treturn ids;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("   /***********获取公告管理列表选中的IDS值***********/\r\n");
      out.write("  function getSelectCheckboxValueForManagerBulletin() {\r\n");
      out.write("  \tvar ids = \"\";\r\n");
      out.write("  \t$(\"input[type='checkbox'][class!='all'][class!='topall'][name!='topbulletin']:checked\").each(function(){\r\n");
      out.write("\t\tif(ids != \"\"){\r\n");
      out.write("\t\t\tids += \"$\"+$(this).val();\r\n");
      out.write("  \t\t}else{\r\n");
      out.write("  \t\t\tids = $(this).val();\r\n");
      out.write("  \t\t}\r\n");
      out.write("  \t});\r\n");
      out.write("  \treturn ids;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  /*************** 检查选中的值是否与status值相同 同则返回true,否则返回false **************/\r\n");
      out.write("  function checkStatus(ids,status){\r\n");
      out.write("  \tif(ids == \"\") return false;\r\n");
      out.write("  \tvar idsArr = ids.split(\"$\");\r\n");
      out.write("  \tfor(var i=0;i <idsArr.length;i++){\r\n");
      out.write("  \t\tif(status == $(\"#\"+idsArr[i]).val()){\r\n");
      out.write("  \t\t\treturn true;\r\n");
      out.write("  \t\t}\r\n");
      out.write("  \t}\r\n");
      out.write("  \treturn false;\r\n");
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
      out.write(" \tshowBulletinManageTableList(title,keyWord,startTime,endTime,status,'1')\r\n");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(31,7) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(67,89) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(72,27) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(74,27) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(76,92) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(76,212) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(81,20) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(83,26) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(87,27) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f8.setCode("baf.bulletin.status");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(88,118) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f9.setCode("baf.bulletin.all");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(88,205) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f10.setCode("baf.bulletin.published");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(88,298) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f11.setCode("baf.bulletin.draft");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(88,387) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f12.setCode("baf.bulletin.cancel");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(102,14) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f13.setCode("baf.bulletin.topBulletin");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(107,126) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f14.setCode("baf.bulletin.emergency");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(108,48) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f15.setCode("baf.bulletin.status");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(109,49) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f16.setCode("baf.bulletin.titile");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(126,67) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f17.setCode("baf.batchOperate");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(132,14) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f18.setCode("baf.bulletin.bulletinManagerList");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(137,104) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f19.setCode("baf.bulletin.emergency");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(138,48) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f20.setCode("baf.bulletin.status");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(139,49) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f21.setCode("baf.bulletin.titile");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(155,1) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f22.setCode("baf.bulletin.photoExplain");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(155,110) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f23.setCode("baf.bulletin.plain");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(155,224) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f24.setCode("baf.bulletin.urgent");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(155,341) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f25.setCode("baf.bulletin.exurgent");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(156,69) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f26.setCode("baf.bulletin.answered");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(156,189) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f27.setCode("baf.bulletin.answering");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(156,310) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f28.setCode("baf.bulletin.noAnswer");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(156,430) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f29.setCode("baf.bulletin.withAttachment");
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
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(156,555) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f30.setCode("baf.bulletin.noAttachment");
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

  private boolean _jspx_meth_spring_005fmessage_005f31(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f31 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f31.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f31.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(229,23) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f31.setCode("baf.OperateFail");
    int[] _jspx_push_body_count_spring_005fmessage_005f31 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f31 = _jspx_th_spring_005fmessage_005f31.doStartTag();
      if (_jspx_th_spring_005fmessage_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f31[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f31.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f31.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f31);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f32(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f32 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f32.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f32.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(253,13) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f32.setCode("baf.dict.queryIngWaitForMoment");
    int[] _jspx_push_body_count_spring_005fmessage_005f32 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f32 = _jspx_th_spring_005fmessage_005f32.doStartTag();
      if (_jspx_th_spring_005fmessage_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f32[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f32.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f32.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f32);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f33 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f33.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f33.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(276,17) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f33.setCode("baf.bulletin.draft");
    int[] _jspx_push_body_count_spring_005fmessage_005f33 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f33 = _jspx_th_spring_005fmessage_005f33.doStartTag();
      if (_jspx_th_spring_005fmessage_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f33[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f33.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f33.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f33);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f34(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f34 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f34.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f34.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(278,17) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f34.setCode("baf.bulletin.goingPublish");
    int[] _jspx_push_body_count_spring_005fmessage_005f34 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f34 = _jspx_th_spring_005fmessage_005f34.doStartTag();
      if (_jspx_th_spring_005fmessage_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f34[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f34.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f34.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f34);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f35(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f35 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f35.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f35.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(280,17) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f35.setCode("baf.bulletin.allreadyPublish");
    int[] _jspx_push_body_count_spring_005fmessage_005f35 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f35 = _jspx_th_spring_005fmessage_005f35.doStartTag();
      if (_jspx_th_spring_005fmessage_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f35[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f35.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f35.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f35);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f36 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f36.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f36.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(282,17) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f36.setCode("baf.bulletin.waste");
    int[] _jspx_push_body_count_spring_005fmessage_005f36 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f36 = _jspx_th_spring_005fmessage_005f36.doStartTag();
      if (_jspx_th_spring_005fmessage_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f36[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f36.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f36.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f36);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f37(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f37 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f37.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f37.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(284,17) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f37.setCode("baf.bulletin.cancel");
    int[] _jspx_push_body_count_spring_005fmessage_005f37 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f37 = _jspx_th_spring_005fmessage_005f37.doStartTag();
      if (_jspx_th_spring_005fmessage_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f37[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f37.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f37.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f37);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f38(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f38 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f38.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f38.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(320,83) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f38.setCode("baf.Modify");
    int[] _jspx_push_body_count_spring_005fmessage_005f38 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f38 = _jspx_th_spring_005fmessage_005f38.doStartTag();
      if (_jspx_th_spring_005fmessage_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f38[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f38.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f38.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f38);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f39(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f39 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f39.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f39.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(322,125) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f39.setCode("baf.Modify");
    int[] _jspx_push_body_count_spring_005fmessage_005f39 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f39 = _jspx_th_spring_005fmessage_005f39.doStartTag();
      if (_jspx_th_spring_005fmessage_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f39[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f39.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f39.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f39);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f40(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f40 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f40.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f40.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(325,84) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f40.setCode("baf.Delete");
    int[] _jspx_push_body_count_spring_005fmessage_005f40 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f40 = _jspx_th_spring_005fmessage_005f40.doStartTag();
      if (_jspx_th_spring_005fmessage_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f40[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f40.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f40.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f40);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f41(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f41 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f41.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f41.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(327,127) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f41.setCode("baf.Delete");
    int[] _jspx_push_body_count_spring_005fmessage_005f41 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f41 = _jspx_th_spring_005fmessage_005f41.doStartTag();
      if (_jspx_th_spring_005fmessage_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f41[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f41.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f41.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f41);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f42(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f42 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f42.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f42.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(330,72) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f42.setCode("baf.bulletin.cancelTopBulletin");
    int[] _jspx_push_body_count_spring_005fmessage_005f42 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f42 = _jspx_th_spring_005fmessage_005f42.doStartTag();
      if (_jspx_th_spring_005fmessage_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f42[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f42.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f42.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f42);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f43(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f43 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f43.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f43.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(332,63) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f43.setCode("baf.bulletin.cancelTopBulletin");
    int[] _jspx_push_body_count_spring_005fmessage_005f43 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f43 = _jspx_th_spring_005fmessage_005f43.doStartTag();
      if (_jspx_th_spring_005fmessage_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f43[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f43.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f43.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f43);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f44(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f44 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f44.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f44.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(339,89) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f44.setCode("baf.NoRecord");
    int[] _jspx_push_body_count_spring_005fmessage_005f44 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f44 = _jspx_th_spring_005fmessage_005f44.doStartTag();
      if (_jspx_th_spring_005fmessage_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f44[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f44.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f44.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f44);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f45(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f45 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f45.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f45.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(344,23) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f45.setCode("baf.OperateFail");
    int[] _jspx_push_body_count_spring_005fmessage_005f45 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f45 = _jspx_th_spring_005fmessage_005f45.doStartTag();
      if (_jspx_th_spring_005fmessage_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f45[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f45.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f45.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f45);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f46(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f46 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f46.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f46.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(353,13) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f46.setCode("baf.dict.queryIngWaitForMoment");
    int[] _jspx_push_body_count_spring_005fmessage_005f46 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f46 = _jspx_th_spring_005fmessage_005f46.doStartTag();
      if (_jspx_th_spring_005fmessage_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f46[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f46.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f46.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f46);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f47(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f47 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f47.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f47.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(379,17) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f47.setCode("baf.bulletin.draft");
    int[] _jspx_push_body_count_spring_005fmessage_005f47 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f47 = _jspx_th_spring_005fmessage_005f47.doStartTag();
      if (_jspx_th_spring_005fmessage_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f47[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f47.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f47.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f47);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f48(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f48 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f48.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f48.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(381,17) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f48.setCode("baf.bulletin.goingPublish");
    int[] _jspx_push_body_count_spring_005fmessage_005f48 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f48 = _jspx_th_spring_005fmessage_005f48.doStartTag();
      if (_jspx_th_spring_005fmessage_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f48[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f48.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f48.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f48);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f49(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f49 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f49.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f49.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(383,17) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f49.setCode("baf.bulletin.allreadyPublish");
    int[] _jspx_push_body_count_spring_005fmessage_005f49 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f49 = _jspx_th_spring_005fmessage_005f49.doStartTag();
      if (_jspx_th_spring_005fmessage_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f49[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f49.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f49.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f49);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f50(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f50 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f50.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f50.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(385,17) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f50.setCode("baf.bulletin.waste");
    int[] _jspx_push_body_count_spring_005fmessage_005f50 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f50 = _jspx_th_spring_005fmessage_005f50.doStartTag();
      if (_jspx_th_spring_005fmessage_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f50[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f50.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f50.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f50);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f51(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f51 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f51.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f51.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(387,17) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f51.setCode("baf.bulletin.cancel");
    int[] _jspx_push_body_count_spring_005fmessage_005f51 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f51 = _jspx_th_spring_005fmessage_005f51.doStartTag();
      if (_jspx_th_spring_005fmessage_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f51[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f51.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f51.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f51);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f52(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f52 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f52.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f52.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(423,83) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f52.setCode("baf.Modify");
    int[] _jspx_push_body_count_spring_005fmessage_005f52 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f52 = _jspx_th_spring_005fmessage_005f52.doStartTag();
      if (_jspx_th_spring_005fmessage_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f52[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f52.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f52.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f52);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f53(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f53 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f53.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f53.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(425,125) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f53.setCode("baf.Modify");
    int[] _jspx_push_body_count_spring_005fmessage_005f53 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f53 = _jspx_th_spring_005fmessage_005f53.doStartTag();
      if (_jspx_th_spring_005fmessage_005f53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f53[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f53.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f53.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f53);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f54(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f54 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f54.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f54.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(428,85) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f54.setCode("baf.Delete");
    int[] _jspx_push_body_count_spring_005fmessage_005f54 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f54 = _jspx_th_spring_005fmessage_005f54.doStartTag();
      if (_jspx_th_spring_005fmessage_005f54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f54[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f54.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f54.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f54);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f55(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f55 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f55.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f55.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(430,128) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f55.setCode("baf.Delete");
    int[] _jspx_push_body_count_spring_005fmessage_005f55 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f55 = _jspx_th_spring_005fmessage_005f55.doStartTag();
      if (_jspx_th_spring_005fmessage_005f55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f55[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f55.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f55.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f55);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f56(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f56 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f56.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f56.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(433,85) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f56.setCode("baf.bulletin.cancel");
    int[] _jspx_push_body_count_spring_005fmessage_005f56 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f56 = _jspx_th_spring_005fmessage_005f56.doStartTag();
      if (_jspx_th_spring_005fmessage_005f56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f56[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f56.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f56.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f56);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f57(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f57 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f57.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f57.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(435,124) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f57.setCode("baf.bulletin.cancel");
    int[] _jspx_push_body_count_spring_005fmessage_005f57 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f57 = _jspx_th_spring_005fmessage_005f57.doStartTag();
      if (_jspx_th_spring_005fmessage_005f57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f57[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f57.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f57.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f57);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f58(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f58 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f58.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f58.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(438,73) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f58.setCode("baf.bulletin.setTop");
    int[] _jspx_push_body_count_spring_005fmessage_005f58 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f58 = _jspx_th_spring_005fmessage_005f58.doStartTag();
      if (_jspx_th_spring_005fmessage_005f58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f58[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f58.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f58.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f58);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f59(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f59 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f59.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f59.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(440,64) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f59.setCode("baf.bulletin.setTop");
    int[] _jspx_push_body_count_spring_005fmessage_005f59 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f59 = _jspx_th_spring_005fmessage_005f59.doStartTag();
      if (_jspx_th_spring_005fmessage_005f59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f59[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f59.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f59.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f59);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f60(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f60 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f60.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f60.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(443,85) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f60.setCode("baf.bulletin.publish");
    int[] _jspx_push_body_count_spring_005fmessage_005f60 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f60 = _jspx_th_spring_005fmessage_005f60.doStartTag();
      if (_jspx_th_spring_005fmessage_005f60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f60[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f60.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f60.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f60);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f61(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f61 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f61.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f61.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(445,124) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f61.setCode("baf.bulletin.publish");
    int[] _jspx_push_body_count_spring_005fmessage_005f61 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f61 = _jspx_th_spring_005fmessage_005f61.doStartTag();
      if (_jspx_th_spring_005fmessage_005f61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f61[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f61.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f61.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f61);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f62(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f62 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f62.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f62.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(452,89) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f62.setCode("baf.NoRecord");
    int[] _jspx_push_body_count_spring_005fmessage_005f62 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f62 = _jspx_th_spring_005fmessage_005f62.doStartTag();
      if (_jspx_th_spring_005fmessage_005f62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f62[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f62.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f62.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f62);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f63(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f63 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f63.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f63.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(465,23) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f63.setCode("baf.OperateFail");
    int[] _jspx_push_body_count_spring_005fmessage_005f63 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f63 = _jspx_th_spring_005fmessage_005f63.doStartTag();
      if (_jspx_th_spring_005fmessage_005f63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f63[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f63.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f63.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f63);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f64(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f64 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f64.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f64.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(506,23) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f64.setCode("baf.bulletin.pleaseSelectBulletions");
    int[] _jspx_push_body_count_spring_005fmessage_005f64 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f64 = _jspx_th_spring_005fmessage_005f64.doStartTag();
      if (_jspx_th_spring_005fmessage_005f64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f64[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f64.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f64.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f64);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f65(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f65 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f65.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f65.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(511,23) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f65.setCode("baf.bulletin.selectBulletionsHasPublished");
    int[] _jspx_push_body_count_spring_005fmessage_005f65 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f65 = _jspx_th_spring_005fmessage_005f65.doStartTag();
      if (_jspx_th_spring_005fmessage_005f65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f65[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f65.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f65.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f65);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f66(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f66 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f66.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f66.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(522,24) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f66.setCode("baf.OperateSuccess");
    int[] _jspx_push_body_count_spring_005fmessage_005f66 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f66 = _jspx_th_spring_005fmessage_005f66.doStartTag();
      if (_jspx_th_spring_005fmessage_005f66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f66[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f66.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f66.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f66);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f67(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f67 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f67.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f67.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(528,23) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f67.setCode("baf.OperateFail");
    int[] _jspx_push_body_count_spring_005fmessage_005f67 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f67 = _jspx_th_spring_005fmessage_005f67.doStartTag();
      if (_jspx_th_spring_005fmessage_005f67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f67[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f67.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f67.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f67);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f68(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f68 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f68.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f68.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(544,24) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f68.setCode("baf.OperateSuccess");
    int[] _jspx_push_body_count_spring_005fmessage_005f68 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f68 = _jspx_th_spring_005fmessage_005f68.doStartTag();
      if (_jspx_th_spring_005fmessage_005f68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f68[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f68.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f68.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f68);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f69(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f69 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f69.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f69.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(550,23) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f69.setCode("baf.OperateFail");
    int[] _jspx_push_body_count_spring_005fmessage_005f69 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f69 = _jspx_th_spring_005fmessage_005f69.doStartTag();
      if (_jspx_th_spring_005fmessage_005f69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f69[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f69.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f69.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f69);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f70(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f70 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f70.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f70.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(564,23) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f70.setCode("baf.bulletin.pleaseSelectBulletions");
    int[] _jspx_push_body_count_spring_005fmessage_005f70 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f70 = _jspx_th_spring_005fmessage_005f70.doStartTag();
      if (_jspx_th_spring_005fmessage_005f70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f70[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f70.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f70.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f70);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f71(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f71 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f71.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f71.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(577,24) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f71.setCode("baf.OperateSuccess");
    int[] _jspx_push_body_count_spring_005fmessage_005f71 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f71 = _jspx_th_spring_005fmessage_005f71.doStartTag();
      if (_jspx_th_spring_005fmessage_005f71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f71[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f71.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f71.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f71);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f72(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f72 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f72.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f72.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(583,23) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f72.setCode("baf.OperateFail");
    int[] _jspx_push_body_count_spring_005fmessage_005f72 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f72 = _jspx_th_spring_005fmessage_005f72.doStartTag();
      if (_jspx_th_spring_005fmessage_005f72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f72[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f72.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f72.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f72);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f73(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f73 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f73.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f73.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(595,23) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f73.setCode("baf.bulletin.pleaseSelectBulletions");
    int[] _jspx_push_body_count_spring_005fmessage_005f73 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f73 = _jspx_th_spring_005fmessage_005f73.doStartTag();
      if (_jspx_th_spring_005fmessage_005f73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f73[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f73.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f73.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f73);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f74(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f74 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f74.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f74.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(607,24) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f74.setCode("baf.OperateSuccess");
    int[] _jspx_push_body_count_spring_005fmessage_005f74 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f74 = _jspx_th_spring_005fmessage_005f74.doStartTag();
      if (_jspx_th_spring_005fmessage_005f74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f74[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f74.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f74.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f74);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f75(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f75 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f75.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f75.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(613,23) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f75.setCode("baf.OperateFail");
    int[] _jspx_push_body_count_spring_005fmessage_005f75 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f75 = _jspx_th_spring_005fmessage_005f75.doStartTag();
      if (_jspx_th_spring_005fmessage_005f75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f75[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f75.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f75.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f75);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f76(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f76 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f76.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f76.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(624,23) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f76.setCode("baf.bulletin.pleaseSelectBulletions");
    int[] _jspx_push_body_count_spring_005fmessage_005f76 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f76 = _jspx_th_spring_005fmessage_005f76.doStartTag();
      if (_jspx_th_spring_005fmessage_005f76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f76[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f76.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f76.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f76);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f77(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f77 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f77.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f77.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(630,22) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f77.setCode("baf.IsSureToDelete");
    int[] _jspx_push_body_count_spring_005fmessage_005f77 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f77 = _jspx_th_spring_005fmessage_005f77.doStartTag();
      if (_jspx_th_spring_005fmessage_005f77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f77[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f77.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f77.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f77);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f78(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f78 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f78.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f78.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(638,25) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f78.setCode("baf.OperateSuccess");
    int[] _jspx_push_body_count_spring_005fmessage_005f78 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f78 = _jspx_th_spring_005fmessage_005f78.doStartTag();
      if (_jspx_th_spring_005fmessage_005f78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f78[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f78.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f78.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f78);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f79(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f79 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f79.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f79.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(644,24) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f79.setCode("baf.OperateFail");
    int[] _jspx_push_body_count_spring_005fmessage_005f79 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f79 = _jspx_th_spring_005fmessage_005f79.doStartTag();
      if (_jspx_th_spring_005fmessage_005f79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f79[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f79.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f79.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f79);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f80(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f80 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f80.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f80.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(667,38) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f80.setCode("baf.HideMoreConditions");
    int[] _jspx_push_body_count_spring_005fmessage_005f80 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f80 = _jspx_th_spring_005fmessage_005f80.doStartTag();
      if (_jspx_th_spring_005fmessage_005f80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f80[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f80.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f80.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f80);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f81(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f81 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f81.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f81.setParent(null);
    // /baf/jsp/ui/bulletin/manageBulletin.jsp(671,40) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f81.setCode("baf.SeeMoreConditions");
    int[] _jspx_push_body_count_spring_005fmessage_005f81 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f81 = _jspx_th_spring_005fmessage_005f81.doStartTag();
      if (_jspx_th_spring_005fmessage_005f81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f81[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f81.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f81.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f81);
    }
    return false;
  }
}
