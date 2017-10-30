package org.apache.jsp.baf.jsp.ui.newOperRight;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.regaltec.common.util.Constant;

public final class operRightList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
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
      out.write("<script src=\"");
      out.print(path);
      out.write("/baf/jsp/ui/js/language/");
      out.print(locale);
      out.write(".js\" type=\"text/javascript\"></script>\r\n");
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
      out.write("\r\n");
      out.write(" .grid .datagrid caption{background:#ddd;border:#aaa 1px solid;padding:5px 10px;height:30px;line-height:30px;}\r\n");
      out.write(" .grid .datagrid caption img{cursor:pointer;}\r\n");
      out.write(" .grid .datagrid tbody td a{font-size:15px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <form method=\"post\" name=\"queryForm\"  id=\"queryForm\"  onkeydown=\"if(event.keyCode==13){ev_search('1');return false;}\">\r\n");
      out.write("\t<div class=\"ccs_toolbar\" id=\"ccs_toolbar\">\r\n");
      out.write("      ");
      if (_jspx_meth_spring_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("：\r\n");
      out.write("      <input type=\"text\" class=\"ccs_text\"  name=\"searchInputText\" id=\"searchInputText\" />&nbsp;&nbsp;&nbsp;\r\n");
      out.write("      <input type=\"button\" name=\"search\" id=\"search\" class=\"ccs_button\" value=\"");
      if (_jspx_meth_spring_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("\" onclick=\"ev_search();\"/>\r\n");
      out.write("      <a href=\"#\" onclick=\"ev_reset();return false;\">");
      if (_jspx_meth_spring_005fmessage_005f3(_jspx_page_context))
        return;
      out.write("</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </form>\r\n");
      out.write("  <div class=\"grid\">\r\n");
      out.write("\t<table class=\"datagrid\" align=\"center\">\r\n");
      out.write("      <caption>\r\n");
      out.write("        <span class=\"tools ccs_right\">\r\n");
      out.write("          <input type=\"button\" class=\"ccs_button\"  value=\"");
      if (_jspx_meth_spring_005fmessage_005f4(_jspx_page_context))
        return;
      out.write("\" onclick=\"ev_add();\"/>\r\n");
      out.write("          <input type=\"button\" class=\"ccs_button\"  value=\"");
      if (_jspx_meth_spring_005fmessage_005f5(_jspx_page_context))
        return;
      out.write("\" onclick=\"removebatch(this);\"/>\r\n");
      out.write("        </span>\r\n");
      out.write("      </caption>\r\n");
      out.write("      <thead id=\"userth\" class=\"userTable\"> \r\n");
      out.write("        <tr>\r\n");
      out.write("          <th style=\"text-align:center;width:5%;\"><label><input type=\"checkbox\"  onclick=\"selObjAll(this.checked);\"/></label></th>\r\n");
      out.write("          <th style=\"padding-left: 1em;\">");
      if (_jspx_meth_spring_005fmessage_005f6(_jspx_page_context))
        return;
      out.write(" </th>\r\n");
      out.write("          <th style=\"width:30%;\">&nbsp;</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </thead>\r\n");
      out.write("      <tbody >\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      </tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div url=\"");
      out.print(path);
      out.write("/group/query.do\" pageSize=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageVO.pageSize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" totalCount=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageVO.totalRecord}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" currentPage=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageVO.pageNum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" pageCount=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageVO.pageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"ccs_page\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  $(document).ready(function()\r\n");
      out.write("  {\r\n");
      out.write("\t  $(\".ccs_page\").ccs_page(\"queryForm\");\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  function ev_reset()\r\n");
      out.write("  {\r\n");
      out.write("    $(\"#searchInputText\").val(\"\");\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  function ev_show(groupID)\r\n");
      out.write("  {\r\n");
      out.write("     if(groupID==\"\")return ;\r\n");
      out.write("     //检查是否显示保存按钮\r\n");
      out.write("     var flag=\"show\";\r\n");
      out.write("     var url=\"");
      out.print(path );
      out.write("/group/isShowSave.do?groupID=\"+groupID;\r\n");
      out.write("  \t$.ajax({\r\n");
      out.write("       type: \"POST\",\r\n");
      out.write("       url: url,\r\n");
      out.write("       dateType:\"json\",\r\n");
      out.write("       async:false, \r\n");
      out.write("       success: function(data,textStatus) {\r\n");
      out.write("          if(data==\"show\"){\r\n");
      out.write("            flag=\"show\"\r\n");
      out.write("          }else{ \r\n");
      out.write("            flag=\"hide\"\r\n");
      out.write("       \t  }\r\n");
      out.write("      }\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("  \tvar url=\"");
      out.print(path);
      out.write("/group/showGroup.do?groupID=\"+groupID;\r\n");
      out.write("\t//ccs_dialog.open(url,{width:'82%',unClose:true,zIndex:900,parms:{domWindow:window}});\r\n");
      out.write("  \tvar win={title:\"编辑权限组\",modal:1,url:url,width:770};\r\n");
      out.write("\t\tshowDialog(flag,win,function(data){\r\n");
      out.write("\t       if(data.state == \"1\"){\r\n");
      out.write("           \t  showGlobalMessage(_dic._success,1000,\"msgSuccess\");\r\n");
      out.write("           \t  ev_search();\t\t\r\n");
      out.write("           }else{\r\n");
      out.write("           \t  showGlobalMessage(_dic._failure);\r\n");
      out.write("\t\t   }    \r\n");
      out.write("    \t});\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  function ev_add()\r\n");
      out.write("  {\r\n");
      out.write("  \tvar url=\"");
      out.print(path);
      out.write("/baf/jsp/ui/newOperRight/operRightForm.jsp\";\r\n");
      out.write("\t//ccs_dialog.open(url,{width:'82%',unClose:true,zIndex:900,parms:{domWindow:window}});\r\n");
      out.write("\tvar win={title:\"编辑权限组\",modal:1,url:url,width:770};\r\n");
      out.write("\t\tshowDialog(\"show\",win,function(data){\r\n");
      out.write("\t       if(data.state == \"1\"){\r\n");
      out.write("           \t  showGlobalMessage(_dic._success,1000,\"msgSuccess\");\r\n");
      out.write("           \t  ev_search();\t\t\r\n");
      out.write("           }else{\r\n");
      out.write("           \t  showGlobalMessage(_dic._failure);\r\n");
      out.write("\t\t   }    \r\n");
      out.write("    \t});\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  function ev_search()\r\n");
      out.write("  {\r\n");
      out.write("    queryForm.action= \"");
      out.print(path);
      out.write("/group/getGroup.do\";\r\n");
      out.write("    queryForm.submit();\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  $(\".datagrid tbody tr\").hover(\r\n");
      out.write("    function(){\r\n");
      out.write("        $(this).addClass(\"selected\");\r\n");
      out.write("        $(this).find(\".tools\").show();\r\n");
      out.write("    },function(){\r\n");
      out.write("        $(this).removeClass(\"selected\");\r\n");
      out.write("        $(this).find(\".tools\").hide();\r\n");
      out.write("    }\r\n");
      out.write("  );\r\n");
      out.write("\t\r\n");
      out.write("  function ev_dele(obj,groupId){\r\n");
      out.write("\t//if(confirm(_dic._msg_operRightGroup_isDelete))\r\n");
      out.write("\tvar delFlag=checkDelete(groupId);\r\n");
      out.write("\tif(delFlag==\"N\"){\r\n");
      out.write("\t\t$(obj).ccs_confirm(\"对不起，您没有权限删除此权限组。\",150,function(){});\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar flag=checkGroup(groupId);\r\n");
      out.write("\tif(flag==\"Y\"){\r\n");
      out.write("\t\t$(obj).ccs_confirm(_dic._msg_group_isDelete,150,function(){\r\n");
      out.write("\t\t\tdeleteGroup(groupId);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t$(obj).ccs_confirm(_dic._msg_operRightGroup_isDelete,150,function(){\r\n");
      out.write("\t\t\tdeleteGroup(groupId);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  //检查权限组是否分配给人员或者机构\r\n");
      out.write("  function checkGroup(groupId){\r\n");
      out.write("  \tvar flag=\"\";\r\n");
      out.write("  \tvar url=\"");
      out.print(path );
      out.write("/group/checkGroup.do?groupId=\"+groupId;\r\n");
      out.write("  \t$.ajax({\r\n");
      out.write("       type: \"POST\",\r\n");
      out.write("       url: url,\r\n");
      out.write("       dateType:\"json\",\r\n");
      out.write("       async:false, \r\n");
      out.write("       success: function(data,textStatus) {\r\n");
      out.write("          if(data==\"Y\"){\r\n");
      out.write("            flag=\"Y\"\r\n");
      out.write("          }else{ \r\n");
      out.write("            flag=\"N\"\r\n");
      out.write("       \t  }\r\n");
      out.write("      }\r\n");
      out.write("\t});\r\n");
      out.write("\treturn flag;\r\n");
      out.write("  }\r\n");
      out.write("\t\r\n");
      out.write("  function deleteGroup(groupId){\r\n");
      out.write("    var url=\"");
      out.print(path );
      out.write("/group/deleteGroup.do?groupId=\"+groupId;\r\n");
      out.write("    $.ajax({\r\n");
      out.write("       type: \"POST\",\r\n");
      out.write("       url: url,\r\n");
      out.write("       dateType:\"json\",\r\n");
      out.write("       async:false, \r\n");
      out.write("       success: function(data,textStatus) {\r\n");
      out.write("          if(data==\"Y\"){\r\n");
      out.write("            curSelUserAddArray = new Array;\r\n");
      out.write("            showGlobalMessage(_dic._success,1000,\"msgSuccess\");\r\n");
      out.write("            ev_search();\r\n");
      out.write("            }\r\n");
      out.write("          else \r\n");
      out.write("             showGlobalMessage(_dic._failure);\r\n");
      out.write("       },  \r\n");
      out.write("       error:function(data,textStatus) {\r\n");
      out.write("          showGlobalMessage(_dic._failure); \r\n");
      out.write("       }\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("   //检查是否有权限删除权限组\r\n");
      out.write("  function checkDelete(groupId){\r\n");
      out.write("  \tvar flag=\"\";\r\n");
      out.write("  \tvar url=\"");
      out.print(path );
      out.write("/group/checkDelete.do?groupId=\"+groupId;\r\n");
      out.write("  \t$.ajax({\r\n");
      out.write("       type: \"POST\",\r\n");
      out.write("       url: url,\r\n");
      out.write("       dateType:\"json\",\r\n");
      out.write("       async:false, \r\n");
      out.write("       success: function(data,textStatus) {\r\n");
      out.write("          if(data==\"Y\"){\r\n");
      out.write("            flag=\"Y\"\r\n");
      out.write("          }else{ \r\n");
      out.write("            flag=\"N\"\r\n");
      out.write("       \t  }\r\n");
      out.write("      }\r\n");
      out.write("\t});\r\n");
      out.write("\treturn flag;\r\n");
      out.write("  }\r\n");
      out.write("\t\r\n");
      out.write("  //批量选中的对象列表\r\n");
      out.write("  var curSelUserAddArray = new Array;\r\n");
      out.write("  var objIdArray = new Array;\t     \t//对象ID集合\r\n");
      out.write("  var objNameArray = new Array;\t    //对象Name集合\r\n");
      out.write("\r\n");
      out.write("  //往对象数组中加减数据\r\n");
      out.write("  function selObj(obj){\r\n");
      out.write("\tvar curSelObjArray = curSelUserAddArray;\r\n");
      out.write("\tvar v = obj.value;\r\n");
      out.write("\tif(obj.checked && !curSelObjArray.in_array(v)){\r\n");
      out.write("\t\tcurSelObjArray.push(v);\r\n");
      out.write("\t}else if(!obj.checked && curSelObjArray.in_array(v)){\r\n");
      out.write("\t\tcurSelObjArray.remove(v);\r\n");
      out.write("\t}\r\n");
      out.write("  }\r\n");
      out.write("\t\r\n");
      out.write("  //全选复选框\r\n");
      out.write("  function selObjAll(checked) {\r\n");
      out.write("\tvar curSelObjArray  =  curSelUserAddArray;\r\n");
      out.write("\t$(\"input[name='item']\").each(function(){\r\n");
      out.write("\t\tvar ch=$(this);\r\n");
      out.write("\t    ch.attr(\"checked\", checked);\r\n");
      out.write("\t\tvar v = ch.val();\r\n");
      out.write("\t\tif(v != undefined){\r\n");
      out.write("\t\t\tif(checked && !curSelObjArray.in_array(v)){\r\n");
      out.write("\t\t\t\tcurSelObjArray.push(v);\r\n");
      out.write("\t\t\t}else if(!checked && curSelObjArray.in_array(v)){\r\n");
      out.write("\t\t\t   \r\n");
      out.write("\t\t\t\tcurSelObjArray.remove(v);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("  }\r\n");
      out.write("\t\r\n");
      out.write("  Array.prototype.remove = function(b) {\r\n");
      out.write("\tvar a = this.in_array(b);\r\n");
      out.write("\tif (a) {\r\n");
      out.write("\t\tthis.splice(a, 1);\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\treturn false;\r\n");
      out.write("  };\r\n");
      out.write("\r\n");
      out.write("  Array.prototype.in_array = function(e){  \r\n");
      out.write("    for(i=0;i<this.length;i++){  \r\n");
      out.write("\t    if(this[i] == e)  \r\n");
      out.write("\t        return true;  \r\n");
      out.write("\t}  \r\n");
      out.write("\treturn false;  \r\n");
      out.write("  } \r\n");
      out.write("\r\n");
      out.write("  function removebatch(obj){\r\n");
      out.write("  \t var noDeleteName=new Array;\r\n");
      out.write("     if(curSelUserAddArray.length==0){\r\n");
      out.write("     \t$(obj).ccs_confirm(_dic._msg_operRightGroup_selectRightGroup,150);\r\n");
      out.write("        //alert(_dic._msg_operRightGroup_selectRightGroup);\r\n");
      out.write("        return;\r\n");
      out.write("     }else{\r\n");
      out.write("        objIdArray = new Array;\t     \t//对象ID集合\t\r\n");
      out.write("\t\tobjNameArray = new Array;\t    //对象Name集合\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor(var i = 0;i <curSelUserAddArray.length;i++){\r\n");
      out.write("\t\t\tvar v = curSelUserAddArray[i].split(\";\");\r\n");
      out.write("\t\t\tvar flag=checkDelete(v[0]);\r\n");
      out.write("\t\t\tif(flag==\"Y\"){\r\n");
      out.write("\t\t\t\tobjIdArray.push(v[0]);\r\n");
      out.write("\t\t\t\tobjNameArray.push(v[1]);\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tnoDeleteName.push(v[1]);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("    }\r\n");
      out.write("    if(noDeleteName.length>0){\r\n");
      out.write("    \t$(obj).ccs_confirm(\"对不起起，你没有权限删这些权限组\"+noDeleteName,300,function(){\r\n");
      out.write("\t\t\t$(obj).ccs_confirm(_dic._msg_operRightGroup_isDelete+objNameArray.join(\",\"),300,function(){\r\n");
      out.write("\t\t\t\tdeleteGroup(objIdArray.join(\",\"));\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("    }else{\r\n");
      out.write("       $(obj).ccs_confirm(_dic._msg_operRightGroup_isDelete+objNameArray.join(\",\"),300,function(){\r\n");
      out.write("\t   \t\tdeleteGroup(objIdArray.join(\",\"));\r\n");
      out.write("\t   });\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    //$(obj).ccs_confirm(_dic._msg_operRightGroup_isDelete+objNameArray.join(\",\"),300,function(){\r\n");
      out.write("\t//\tdeleteGroup(objIdArray.join(\",\"));\r\n");
      out.write("\t//});\r\n");
      out.write("    //if(confirm(_dic._msg_operRightGroup_isDelete+objNameArray.join(\",\"))){\r\n");
      out.write("    //    deleteGroup(objIdArray.join(\",\"));\r\n");
      out.write("    //}\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  function showDialog(state,win,callback)\r\n");
      out.write("\t{\r\n");
      out.write("\t   if(state==\"show\"){\r\n");
      out.write("\t\t  \ttop.window.bootDialog.open({url:win.url,width:win.width,height:win.height,title:win.title,buttons: [\r\n");
      out.write("\t\t     \r\n");
      out.write("\t\t\t      {text: _dic._msg_yes,style:\"btn-primary\",onclick: function (item, dialog){\r\n");
      out.write("\t\t\t          dialog.find(\"iframe\")[0].contentWindow.submit(function(data){\r\n");
      out.write("\t\t\t            if(data.state == \"1\")\r\n");
      out.write("\t\t\t            {\r\n");
      out.write("\t\t\t              dialog.close();\r\n");
      out.write("\t\t\t              if(callback&&typeof(callback)==\"function\"){\r\n");
      out.write("\t\t\t                callback(data);\r\n");
      out.write("\t\t\t              }\r\n");
      out.write("\t\t\t            }\r\n");
      out.write("\t\t\t          });\r\n");
      out.write("\t\t\t      }},\r\n");
      out.write("\t\t  \t  \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t      {text: _dic._msg_cancel,style:\"btn-danger\",onclick:function (item, dialog){dialog.close();}}\r\n");
      out.write("\t\t  ]});\r\n");
      out.write("\t }else{\r\n");
      out.write("\t \ttop.window.bootDialog.open({url:win.url,width:win.width,height:win.height,title:win.title,buttons: [\r\n");
      out.write("\t\t      {text: _dic._msg_cancel,style:\"btn-danger\",onclick:function (item, dialog){dialog.close();}}\r\n");
      out.write("\t\t  ]});\r\n");
      out.write("\t }\r\n");
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

  private boolean _jspx_meth_spring_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f0 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f0.setParent(null);
    // /baf/jsp/ui/newOperRight/operRightList.jsp(23,7) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setCode("baf.operRightGroup.operRigGroupInfo");
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
    // /baf/jsp/ui/newOperRight/operRightList.jsp(42,6) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setCode("baf.operRightGroup.operRigGroupName");
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
    // /baf/jsp/ui/newOperRight/operRightList.jsp(44,79) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f2.setCode("baf.org.btnSearch");
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
    // /baf/jsp/ui/newOperRight/operRightList.jsp(45,53) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f3.setCode("baf.org.btnReset");
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
    // /baf/jsp/ui/newOperRight/operRightList.jsp(52,58) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f4.setCode("baf.org.btnNew");
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
    // /baf/jsp/ui/newOperRight/operRightList.jsp(53,58) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f5.setCode("baf.org.BatchDelete");
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
    // /baf/jsp/ui/newOperRight/operRightList.jsp(59,41) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f6.setCode("baf.operRightGroup.baseInfo");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /baf/jsp/ui/newOperRight/operRightList.jsp(64,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageVO.list}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /baf/jsp/ui/newOperRight/operRightList.jsp(64,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          <tr>\r\n");
          out.write("            <td style=\"text-align:center;width:5%;\"><label><input type=\"checkbox\"  value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.groupId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(';');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.groupName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"item\" onclick=\"selObj(this);\"/></label></td>\r\n");
          out.write("    \t    <td style=\"text-align:left;width:400px;padding-left: 1em\">\r\n");
          out.write("    \t  \t  <div><span class=\"bureauNameTD\"><a>");
          if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</a></span></div>\r\n");
          out.write("     \t\t  <div><span class=\"allow\">");
          if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</span></div>\r\n");
          out.write("     \t\t  <div><span class=\"link_statu\">");
          if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</span></div>\r\n");
          out.write("    \t    </td>\r\n");
          out.write("    \t    <td >\r\n");
          out.write("    \t\t  <span class=\"tools\" style=\"display: none\">\r\n");
          out.write("    \t\t    <input type='button' class='ccs_button' onclick=\"ev_show('");
          if (_jspx_meth_c_005fout_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("');\" value='");
          if (_jspx_meth_spring_005fmessage_005f7(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("' />\r\n");
          out.write("    \t\t    <input type='button' class='ccs_button' onclick=\"ev_dele(this,'");
          if (_jspx_meth_c_005fout_005f4(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("');\" value='");
          if (_jspx_meth_spring_005fmessage_005f8(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("' />\r\n");
          out.write("    \t\t  </span>\r\n");
          out.write("    \t    </td>\r\n");
          out.write("    \t  </tr>\r\n");
          out.write("        ");
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

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /baf/jsp/ui/newOperRight/operRightList.jsp(68,45) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.groupName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /baf/jsp/ui/newOperRight/operRightList.jsp(69,34) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.groupCode}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /baf/jsp/ui/newOperRight/operRightList.jsp(70,39) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.groupDesc}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /baf/jsp/ui/newOperRight/operRightList.jsp(74,68) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.groupId}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f7 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f7.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /baf/jsp/ui/newOperRight/operRightList.jsp(74,112) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f7.setCode("baf.org.btnEdit");
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

  private boolean _jspx_meth_c_005fout_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /baf/jsp/ui/newOperRight/operRightList.jsp(75,73) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.groupId}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
    if (_jspx_th_c_005fout_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f8 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f8.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /baf/jsp/ui/newOperRight/operRightList.jsp(75,117) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f8.setCode("baf.org.btnDelete");
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
}
