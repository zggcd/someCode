package org.apache.jsp.pwb.bi;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.regaltec.baf.org.user.common.valueobj.UserVO;

public final class demo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/pwb/common/jsp/easyUIincluded.inc");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>demo</title>\r\n");
      out.write('\r');
      out.write('\n');
      out.write(' ');

 com.regaltec.baf.profile.theme.ui.control.SkinBean skinBean = (com.regaltec.baf.profile.theme.ui.control.SkinBean)session.getAttribute("skinBean"); 
  if( null != skinBean)
  {
	if ("DEFAULT".equals(skinBean.getSkin()) || "classic".equals(skinBean.getSkin())){ 
      out.write("\r\n");
      out.write("\t   <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/pwb/common/easyui/themes/gray/easyui.css\" />\r\n");
      out.write("\t");
 }else if ("blueSky".equals(skinBean.getSkin())){
      out.write("\r\n");
      out.write("\t     <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/pwb/common/easyui/themes/default/easyui.css\" />\r\n");
      out.write("\t");
}
    }else{
      out.write("\r\n");
      out.write("\t  <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/pwb/common/easyui/themes/gray/easyui.css\" />\r\n");
      out.write(" ");
}
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/pwb/common/easyui/themes/icon.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/pwb/common/easyui/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/pwb/common/easyui/jquery.easyui.min.js\"></script>\r\n");

    String locale = request.getLocale().toString();
    if( "zh_CN".equals(locale))
    {
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/pwb/common/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("    ");
}else{
      out.write("\r\n");
      out.write("    \r\n");
}
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background-color: #EFF7FF; margin: 0px;\">\r\n");
      out.write("\t<nav style=\"background-color: #293c55; color: white;\">\r\n");
      out.write("\t\t<IMG style=\"padding-top: 5px; padding-left: 5px;\"\r\n");
      out.write("\t\t\tSRC=\"");
      out.print(request.getContextPath());
      out.write("/pwb/images/navicons/spotify.png\" />\r\n");
      out.write("\t\t");

		    UserVO uservo = (UserVO) request.getAttribute("currentUser");
					if (null != uservo) {
						out.println("登录用户姓名：" + uservo.getUserName());
						out.println("登录用户账号：" + uservo.getLoginName());
						out.println("登录用户所属部门：" + uservo.getUnitNames());
					} else {
						out.println("你没有登录本系统");
					}
		
      out.write("\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t");
      out.print(request.getLocale().toString());
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print(request.getLocale().getLanguage());
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print(request.getLocale().getCountry());
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<p>窗口在屏幕自由托动</p>\r\n");
      out.write("\t<div style=\"margin: 20px 0;\">\r\n");
      out.write("\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\tonclick=\"$('#w').window('open')\">打开窗口</a> <a\r\n");
      out.write("\t\t\thref=\"javascript:void(0)\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\tonclick=\"$('#w').window('close')\">关闭窗口</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"w\" class=\"easyui-window\" title=\"基本窗口\"\r\n");
      out.write("\t\tdata-options=\"iconCls:'icon-save',closed:true\"\r\n");
      out.write("\t\tstyle=\"width: 500px; height: 200px; padding: 10px;\">\r\n");
      out.write("\t\teasyui是一种基于jQuery的用户界面插件集合。</br> easyui为创建现代化，互动，JavaScript应用程序，提供必要的功能。</br>\r\n");
      out.write("\r\n");
      out.write("\t\t使用easyui你不需要写很多代码，你只需要通过编写一些简单HTML标记，就可以定义用户界面。</br>\r\n");
      out.write("\r\n");
      out.write("\t\teasyui是个完美支持HTML5网页的完整框架。</br> easyui节省您网页开发的时间和规模。</br> easyui很简单但功能强大的。\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<a class=\"easyui-linkbutton\"\r\n");
      out.write("\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/userAction.do\">spring事务测试</a>\r\n");
      out.write("\r\n");
      out.write("\t<table class=\"easyui-datagrid\" title=\"基础表格样式\"\r\n");
      out.write("\t\tstyle=\"width: 900px; height: 650px\"\r\n");
      out.write("\t\tdata-options=\"singleSelect:true,collapsible:true,url:'");
      out.print(request.getContextPath());
      out.write("/queryItems.do',method:'post',singleSelect:false, \r\n");
      out.write("        pagination:true,\r\n");
      out.write("        rownumbers:true,pageSize:20,pageList:[15,20,30,50] \">\r\n");
      out.write("\t\t<thead style=\"text-align: center;\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'itemid',width:80\"\r\n");
      out.write("\t\t\t\t\tstyle=\"text-align: center;\">Item ID</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'itemname',width:100\"\r\n");
      out.write("\t\t\t\t\tstyle=\"text-align: center;\">条目名称</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'itemvalue',width:200,align:'right'\"\r\n");
      out.write("\t\t\t\t\tstyle=\"text-align: center;\">条目值</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'itemdesc',width:80,align:'right'\"\r\n");
      out.write("\t\t\t\t\tstyle=\"text-align: center;\">条目描述</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'dictionaryid',width:250\"\r\n");
      out.write("\t\t\t\t\tstyle=\"text-align: center;\">字典ID</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'isvalid',width:60,align:'center'\"\r\n");
      out.write("\t\t\t\t\tstyle=\"text-align: center;\">是否有效</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\tonclick=\"jq_alert()\">警报提示框</a>\r\n");
      out.write("\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\tonclick=\"jq_Confirm()\">确认提示框<a> <br /> <br />\r\n");
      out.write("\r\n");
      out.write("\t\t\t<form id=\"ff\" method=\"post\" action=\"/demo/submit.do\">\r\n");
      out.write("\t\t\t\t<table cellpadding=\"5\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>姓名:</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input class=\"easyui-textbox\" type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-options=\"required:true\"></input></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Email:</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input class=\"easyui-textbox\" type=\"text\" name=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-options=\"required:true,validType:'email'\"></input></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>学科:</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input class=\"easyui-textbox\" type=\"text\" name=\"subject\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-options=\"required:true\"></input></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>消息:</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input class=\"easyui-textbox\" name=\"message\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-options=\"multiline:true\" style=\"height: 60px\"></input></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>语言:</td>\r\n");
      out.write("\t\t\t\t\t\t<td><select class=\"easyui-combobox\" name=\"language\"><option\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"ar\">Arabic</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"bg\">Bulgarian</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"ca\">Catalan</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"zh-cht\">中国传统</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"cs\">Czech</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"da\">Danish</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"nl\">Dutch</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"en\" selected=\"selected\">English</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"et\">Estonian</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"fi\">Finnish</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"fr\">French</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"de\">German</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"el\">Greek</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"ht\">Haitian Creole</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"he\">Hebrew</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"hi\">Hindi</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"mww\">Hmong Daw</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"hu\">Hungarian</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"id\">Indonesian</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"it\">Italian</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"ja\">Japanese</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"ko\">Korean</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"lv\">Latvian</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"lt\">Lithuanian</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"no\">Norwegian</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"fa\">Persian</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"pl\">Polish</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"pt\">Portuguese</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"ro\">Romanian</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"ru\">Russian</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"sk\">Slovak</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"sl\">Slovenian</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"es\">Spanish</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"sv\">Swedish</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"th\">Thai</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"tr\">Turkish</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"uk\">Ukrainian</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"vi\">Vietnamese</option></select></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" style=\"text-align: center; padding: 5px\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"submitForm()\">提交表单</a> <a href=\"javascript:void(0)\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-linkbutton\" onclick=\"ajaxsubmit()\">ajax异步提交</a> <a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"javascript:void(0)\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"clearForm()\">重置</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\t//普通提交\r\n");
      out.write("\tfunction submitForm() {\r\n");
      out.write("\t\t('#ff').form('submit');\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction clearForm() {\r\n");
      out.write("\t\t$('#ff').form('clear');\r\n");
      out.write("\t}\r\n");
      out.write("    //ajax异步提交\r\n");
      out.write("\tfunction ajaxsubmit() {\r\n");
      out.write("\t\tvar data = $(\"#ff\").serializeArray(); //将form表单封装成json\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype : \"post\", //提交方式使用Post方式请求\r\n");
      out.write("\t\t\turl : \"/demo/submit.do\", //数据提交地址\r\n");
      out.write("\t\t\tdata : data, //提交参数，      \r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tsuccess : function(result) { //回调函数，result，返回值\r\n");
      out.write("\t\t\t\tif( true == result.sucess )\r\n");
      out.write("\t\t\t    {\r\n");
      out.write("\t\t\t\t    $.messager.alert(\"操作提示\", \"操作成功！<br>返回数据：\" + result.data.name, \"info\");\r\n");
      out.write("\t\t\t    }else\r\n");
      out.write("\t\t\t    {\r\n");
      out.write("\t\t\t    \t$.messager.alert(\"操作提示\", \"操作失败成功！\", \"error\");\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t\t//alert(\"返回数据：\" + result.data.name + result.data.email);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function(resut) {\r\n");
      out.write("\t\t\t\talert(resut);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction jq_alert() {\r\n");
      out.write("\t\t$.messager.alert(\"操作提示\", \"操作成功！\", \"info\");\r\n");
      out.write("\t\t$.messager.alert(\"操作提示\", \"操作成功！\", \"error\");\r\n");
      out.write("\t\t$.messager.alert(\"操作提示\", \"操作成功！\", \"warning\");\r\n");
      out.write("\t\t$.messager.alert(\"操作提示\", \"您确定要执行操作吗！\", \"question\");\r\n");
      out.write("\t}\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tjq_Confirm();\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction jq_Confirm() {\r\n");
      out.write("\t\t$.messager.confirm(\"操作提示\", \"您确定要执行操作吗？\", function(data) {\r\n");
      out.write("\t\t\tif (data) {\r\n");
      out.write("\t\t\t\talert(\"确定\");\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\talert(\"取消\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
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
