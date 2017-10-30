package org.apache.jsp.baf.jsp.uiframe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.pub.common.bi.*;
import com.regaltec.baf.dict.dictionary.*;
import com.regaltec.baf.dict.dictionary.dao.IDictionaryItemDAO;
import com.regaltec.baf.dict.dictionary.common.valueobj.DictionaryItemVO;
import com.regaltec.baf.framework.common.exception.DAOException;
import com.regaltec.baf.taskmanage.common.SpringUtil;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<!-- saved from -->\r\n");
  
	 IDictionaryItemDAO dictionaryItemDao =  (IDictionaryItemDAO)SpringUtil.getBean("baf_dictionaryItemDao", IDictionaryItemDAO.class);
	String title ="无";
	DictionaryItemVO vo = null;
	try {
		vo = dictionaryItemDao.getItemByDictCodeAndItemCode(
				"IDD_SYS", "SYS_COMPANY");
		if (vo != null) {
			String itemValue = vo.getItemValue();
			if ((itemValue != null) && (!("".equals(itemValue)))) {
				title = itemValue;
			}
		}
	} catch (DAOException e) {
		// TODO Auto-generated catch block
	
	}
	

      out.write("\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>铁塔-欢迎登录</title>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<meta content=\"text/html; charset=UTF-8\" http-equiv=\"Content-Type\">\r\n");
      out.write("\t<meta content=\"IE=Edge http-equiv=X-UA-Compatible\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" \r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/baf/css/login_itower/base.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" \r\n");
      out.write("href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/baf/css/login_itower/passport-2015.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/baf/js/jquery-1.6.4.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/baf/js/jquery.form.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/tongji.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 头部 -->\r\n");
      out.write("<div class=\"w\">\r\n");
      out.write("\t<!-- Logo信息 -->\r\n");
      out.write("  <div id=\"logo\">\r\n");
      out.write("  <a href=\"#\">\r\n");
      out.write("\t<img alt=\"铁塔\"  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/baf/css/login_itower/logo-201305-b.png\" width=\"160\" height=\"60\" />\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<span style=\"font-size:28px;vertical-align: middle;height:60px;line-height:60px;\">");
      out.print(title );
      out.write("</span>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 正文 -->\r\n");
      out.write("     <div id=\"content\">\r\n");
      out.write("            <div class=\"login-wrap\">\r\n");
      out.write("                <div class=\"w\">\r\n");
      out.write("                    <div class=\"login-form\">\r\n");
      out.write("                        <div class=\"login-box\">\r\n");
      out.write("                            <div class=\"mt\">\r\n");
      out.write("                                <h1>\r\n");
      out.write("                                    登录\r\n");
      out.write("                                </h1>\r\n");
      out.write("                                <div class=\"extra-r\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"msg-wrap\">\r\n");
      out.write("                               \r\n");
      out.write("                                <div id=\"msgWrap\" class=\"msg-error hide\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"mc\">\r\n");
      out.write("                                <div class=\"form\">\r\n");
      out.write("                                    <form id=\"loginForm\" method=\"post\" >\r\n");
      out.write("                                        <div class=\"item item-fore1\">\r\n");
      out.write("                                        <label class=\"login-label name-label\"  for=\"loginName\"></label>\r\n");
      out.write("                                            <input id=\"loginName\" class=\"itxt\" tabindex=\"1\" type=\"text\" name=\"loginName\" placeholder=\"用户名\" autocomplete=\"off\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div id=\"entry\" class=\"item item-fore2\">\r\n");
      out.write("                                         <label class=\"login-label pwd-label\" for=\"password\"></label>\r\n");
      out.write("                                            <input id=\"password\" class=\"itxt itxt-error\" tabindex=\"2\" type=\"password\" name=\"password\" placeholder=\"密码\" autocomplete=\"off\" /> \r\n");
      out.write("                                  \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"item item-fore3\">\r\n");
      out.write("                                            <div class=\"safe\">\r\n");
      out.write("                                                <span><input id=\"autologin\" class=\"checkbox\" tabindex=\"3\" type=\"checkbox\" name=\"chkRememberMe\"  /> <label for=\"\">自动登录</label></span> \r\n");
      out.write("                                                <span class=\"forget-pw-safe\"><a href=\"#\" target=\"_blank\" >忘记密码?</a></span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"item item-fore5\">\r\n");
      out.write("                                            <div class=\"login-btn\">\r\n");
      out.write("                                                <input id=\"loginsubmit\"  type=\"submit\" class=\"btn-img btn-entry\" tabindex=\"6\"  name=\"loginsubmit\" value=\"登    录\" />\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"login-banner\">\r\n");
      out.write("                    <div class=\"w\">\r\n");
      out.write("                        <div id=\"banner-bg\" class=\"i-inner\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=w>\r\n");
      out.write("\r\n");
      out.write("<div class=copyright>Copyright&copy;2014-2015&nbsp;&nbsp;为了提高系统的使用性能，请尽量使用谷歌浏览器。外网用户可从谷歌 官网 在线安装。内网用户点击 下载地址 下载安装。\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"copyright\" color=\"red\"  >若使用IE浏览器，请设置成“<a href=# onclick=\"showWin();\" >兼容模式</a>”。\r\n");
      out.write("</div> </div>\r\n");
      out.write("\r\n");
      out.write("<script type=text/javascript>\r\n");
      out.write("function showWin(){\r\n");
      out.write("\t\r\n");
      out.write("\twindow.open ('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/baf/jsp/uiframe/setIE.jsp','newwindow','height=540,width=1140,toolbar=no,menubar=no,scrollbars=no,resizable=no,location=no,status=no') \r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("~function() {\r\n");
      out.write("    var data = [{\r\n");
      out.write("        src: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/baf/css/login_itower/banner01.png\",\r\n");
      out.write("        bgColor: \"#e5ddc1\",\r\n");
      out.write("        weight: \"4\"\r\n");
      out.write("    }, {\r\n");
      out.write("    \tsrc:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/baf/css/login_itower/banner02.png\",\r\n");
      out.write("    \tbgColor:\"#ffe7ac\",\r\n");
      out.write("    \tweight: \"4\"\r\n");
      out.write("    }];\r\n");
      out.write("    var getRandom = function(arr) {\r\n");
      out.write("            var _temp = 0,\r\n");
      out.write("                _random = 0,\r\n");
      out.write("                _weight, _newArr = [];\r\n");
      out.write("            for (var i = 0; i < arr.length; i++) {\r\n");
      out.write("                _weight = arr[i].weight ? parseInt(arr[i].weight) : 1;\r\n");
      out.write("                _newArr[i] = [];\r\n");
      out.write("                _newArr[i].push(_temp);\r\n");
      out.write("                _temp += _weight;\r\n");
      out.write("                _newArr[i].push(_temp);\r\n");
      out.write("            }\r\n");
      out.write("            _random = Math.ceil(_temp * Math.random());\r\n");
      out.write("            for (var i = 0; i < _newArr.length; i++) {\r\n");
      out.write("                if (_random > _newArr[i][0] && _random <= _newArr[i][1]) {\r\n");
      out.write("                    return arr[i];\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("    var tpl = '<div class=\"login-banner\" style=\"background-color: {bgColor}\">\\\t\t              <div class=\"w\">\\\t\t\t         <div id=\"banner-bg\"  clstag=\"pageclick|keycount|20150112ABD|46\" class=\"i-inner\" style=\"background: url({imgURI}) 0px 0px no-repeat;background-color: {bgColor}\"></div>\\\t\t              </div>\\\t\t           </div>';\r\n");
      out.write("    var bgData = getRandom(data);\r\n");
      out.write("    var bannerHtml = tpl.replace(/{bgColor}/g, bgData.bgColor).replace(/{imgURI}/g, bgData.src);\r\n");
      out.write("    $('.login-banner').replaceWith(bannerHtml);\r\n");
      out.write("}();\r\n");
      out.write("</script>\r\n");
      out.write("<script type=text/javascript>\r\n");
      out.write(" \r\n");
      out.write(" $(document).ready(function(){\r\n");
      out.write("\t \r\n");
      out.write("\t $(\"#loginForm\").submit(function(){\r\n");
      out.write("\t\t login();\r\n");
      out.write("\t\t return false;\r\n");
      out.write("\t });\r\n");
      out.write(" });\r\n");
      out.write(" \r\n");
      out.write(" function login(){\r\n");
      out.write("\t \r\n");
      out.write("\t var loginName = $(\"#loginName\").val();\r\n");
      out.write("\t var password = $(\"#password\").val();\r\n");
      out.write("\t \r\n");
      out.write("\t if(loginName==\"\"){\r\n");
      out.write("\t\t showError(\"用户名不能为空！\");\r\n");
      out.write("\t\t return;\r\n");
      out.write("\t }\r\n");
      out.write("\t if(password==\"\"){\r\n");
      out.write("\t\t showError(\"密码不能为空！\");\r\n");
      out.write("\t\t return;\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write(" \tvar data = $(\"#loginForm\").serialize();\r\n");
      out.write(" \tdata = serialize2json(data);\r\n");
      out.write("\t\r\n");
      out.write("\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jf/login/checkLogin\";\r\n");
      out.write("\r\n");
      out.write("\t$.post(url,data,function(state){\r\n");
      out.write("\t\tvar data=state.status;\r\n");
      out.write("\t\tvar status = {\r\n");
      out.write("\t\t\t\"-2\" : \"登录失败，密码错误！\",\r\n");
      out.write("\t\t\t\"-1\" : \"登录失败，账号不存在！\",\r\n");
      out.write("\t\t\t1  : \"OK\",\r\n");
      out.write("\t\t\t2  : \"您的密码已到期，请修改密码！\",\r\n");
      out.write("\t\t\t3  : \"验证码输入错误！\",\r\n");
      out.write("\t\t\t4  : \"强制修改密码\",\r\n");
      out.write("\t\t\t51 : \"登录失败！系统要求绑定IP地址登录，请绑定IP地址！\",\r\n");
      out.write("\t\t\t52 : \"登录失败！您的登录IP与您绑定的IP不符！\",\r\n");
      out.write("\t\t\t6  : \"动态密码不正确，请点击获取!\",\r\n");
      out.write("\t\t\t7  : \"动态密码不正确，请重新输入!\",\r\n");
      out.write("\t\t\t8  : \"当前人员必须通过统一认证系统登录！\",\r\n");
      out.write("\t\t\t9  : \"有多个部门需选择一个\",\r\n");
      out.write("\t\t\t10 : \"您已经被选为试运行发布测试用户，系统将自动跳转到试运行服务器，请重新输入密码登录!\",\r\n");
      out.write("\t\t\t11 : \"密码不能再错一次，否则被锁定!\",\r\n");
      out.write("\t\t\t12 : \"密码错误次数\"+state.sysCount+\"次被锁!解锁请联系管理员！\",\r\n");
      out.write("\t\t\t13 : \"您登陆的IP地址已经被限制登陆，请联系管理员解除限制！\"\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\tvar msg = \"\";\r\n");
      out.write("\t\tvar action = \"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(status[data]){\r\n");
      out.write("\t\t\tif(data == 1)\r\n");
      out.write("\t\t\t\taction = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/baf/jsp/uiframe/frame.xhtml\";\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\tmsg = status[data];\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tif(data.indexOf(\"#\")!= -1){\r\n");
      out.write("\t\t\t\tvar state = data.split(\"#\")[0];\r\n");
      out.write("\t\t\t\tvar message = data.split(\"#\")[1];\r\n");
      out.write("\t\t\t\tif(state == 5){\r\n");
      out.write("\t\t\t\t\tif(!message)\r\n");
      out.write("\t\t\t\t\t\tmsg = status[51];\r\n");
      out.write("\t\t\t\t\telse\r\n");
      out.write("\t\t\t\t\t\tmsg = status[52];\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(state == 10){\r\n");
      out.write("\t\t\t\t\tmsg = status[10];\r\n");
      out.write("\t\t\t\t\taction = \"http://\"+message;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(state == 11 || state == 12)\r\n");
      out.write("\t\t\t\t\tmsg = message;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert(\"出现未知错误无法处理\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(msg){\r\n");
      out.write("\t\t\tshowError(msg);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tif(action){\r\n");
      out.write("\t\t\tlocation.href=action;\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write(" //显示错误信息\r\n");
      out.write(" function showError(msg){\r\n");
      out.write("\t $(\"#msgWrap\").html(\"<b></b>\"+msg);\r\n");
      out.write("\t $(\"#msgWrap\").removeClass(\"hide\");\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write("function serialize2json(serial){\r\n");
      out.write("\tserial = decodeURIComponent(serial);\r\n");
      out.write("\tvar arr = serial.split(\"&\");\r\n");
      out.write("\tvar result = {};\r\n");
      out.write("\tfor(var i = 0, row ; row = arr[i] ; i++){\r\n");
      out.write("\t\tvar member = row.split(\"=\");\r\n");
      out.write("\t\tresult[member[0]] = member[1];\r\n");
      out.write("\t}\r\n");
      out.write("\treturn result;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</Html>\r\n");
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
