package org.apache.jsp.baf.jsp.uimain.home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.regaltec.baf.org.user.common.valueobj.UserVO;
import com.regaltec.baf.org.user.ui.control.UserLoginBean;
import java.util.Locale;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/baf/jsp/ui/js/config.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String path = request.getContextPath();
//获取当前登录用户对象
        UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
        UserVO userVO = null;
        if(loginBean!=null){
            userVO = loginBean.getCurrentUser();
        }
        String locale = request.getLocale().toString();
        java.util.Locale.setDefault(new java.util.Locale(locale.substring(0,locale.indexOf("_")), locale.substring(locale.indexOf("_")+1))); 

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html> \r\n");
      out.write("<head>\r\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titleName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</title>\r\n");
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
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/baf/jsp/uimain/home/style/frame.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/baf/jsp/ui/js/topWindow.js\"type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/baf/jsp/ui/js/ccssoftUI/ccssoft.all.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("* html,body{height:100%;width:100%;overflow:hidden;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<div class=\"main\" style=\"width:400px;\">\r\n");
      out.write("\t\t\t<!-- \r\n");
      out.write("\t\t\t<div class=\"message\"></div>\r\n");
      out.write("\t\t\t<ul class=\"messageNum\">\r\n");
      out.write("\t\t\t\t<li class=\"first\"></li>\r\n");
      out.write("\t\t\t\t<li class=\"num\"><span>42</span></li>\r\n");
      out.write("\t\t\t\t<li class=\"last\"></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t -->\r\n");
      out.write("\t\t\t<ul class=\"userBar\">\r\n");
      out.write("\t\t\t\t<li class=\"first\"></li>\r\n");
      out.write("\t\t\t\t");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
          // /baf/jsp/uimain/home/index.jsp(45,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_c_005fwhen_005f0.setTest(userVO.getUserName().length()>6);
          int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
          if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t<li class=\"user\" title=\"用户名：");
              out.print(userVO.getUserName());
              out.write("&#13IP：");
              out.print(request.getRemoteAddr());
              out.write("\"><span>");
              out.print(userVO.getUserName().substring(0,5)+"...");
              out.write("</span></li>\r\n");
              out.write("\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          //  c:otherwise
          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
          _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
          int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
          if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t<li class=\"user\" title=\"IP：");
              out.print(request.getRemoteAddr());
              out.write("\"><span>");
              out.print(userVO.getUserName());
              out.write("</span></li>\r\n");
              out.write("\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
          out.write("\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      out.write("\r\n");
      out.write("\t\t\t\t <li class=\"profile\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/baf/jsp/uiframe/modifyPassword.xhtml\" target=\"pages\">修改密码</a></li>\r\n");
      out.write("\t\t\t\t <li class=\"profile\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/handBook/queryAll.p\" target=\"pages\">帮助中心</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"logout\"><a href=\"#\" onclick=\"logout();\">退出</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"last\"></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titleName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"sider\">\r\n");
      out.write("\t\t<ul class=\"menu\" id=\"menu\"></ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"body\" id=\"body\" >\r\n");
      out.write("\t\t<iframe id=\"pages\" name=\"pages\" border=\"0\" src=\"\" style=\"heigh:100%;width:100%\" frameborder=\"0\"></iframe>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("In.ready(\"underscore\",\"ccssoft\",function(){\r\n");
      out.write("   //location.hash=location.hash.replace(\"/index.do\",\"\")\r\n");
      out.write("   \r\n");
      out.write("   var lastId;\r\n");
      out.write("\tvar menu = window.menu = {\r\n");
      out.write("\t\tcurrent : null,\r\n");
      out.write("\t\tselect\t: function(target){\r\n");
      out.write("\t\t\tvar self = this;\r\n");
      out.write("\t\t\tif(self.current)self.current.className = \"\";\r\n");
      out.write("\t\t\tself.current = target;\r\n");
      out.write("\t\t\tself.current.className = \"selected\";\r\n");
      out.write("\t\t\tvar url = target.getElementsByTagName(\"a\")[0];\r\n");
      out.write("\t\t\tself.open(url);\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\topen : function(url){\r\n");
      out.write("\t\t\tdocument.getElementById(\"pages\").src=url;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tsetView : function(list){\r\n");
      out.write("\t\t\tvar tmpl = \"<li id='M_@{moduleId}'><a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("@{moduleUrl}' target='pages'><span style='background-image:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("@{largeIcon})'></span>@{moduleName}</a></li>\";\r\n");
      out.write("\t\t\tvar html = [];\r\n");
      out.write("\t\t\thtml.push(ccssoft.stringReplace(tmpl,{moduleId:\"home\",moduleUrl:\"/baf/jsp/ui/bulletin/viewBulletin.jsp\",largeIcon:\"/baf/jsp/uimain/home/style/images/icons/home.png\",moduleName:\"首页\"}));\r\n");
      out.write("\t\t\tfor(var i = 0 ,row ; row = list[i] ; i++){\r\n");
      out.write("\t\t\t\tif(row.applicationId && row.applicationId !=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${applicationId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" && row.moduleUrl){\r\n");
      out.write("\t\t\t\t\tif(row.moduleUrl.indexOf(\"?\") == -1)\r\n");
      out.write("\t\t\t\t\t\trow.moduleUrl = row.moduleUrl + \"?operID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&hashCode=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${thisHashCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\t\t\t\telse\r\n");
      out.write("\t\t\t\t\t\trow.moduleUrl = row.moduleUrl + \"&operID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&hashCode=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${thisHashCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\t\t\t}else if(!row.applicationId && row.moduleUrl){\r\n");
      out.write("\t\t\t\t\t\trow.moduleUrl = row.moduleUrl + \"?id=\"+row.moduleId+\"&img=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/\"+row.largeIcon+\"&moduleName=\"+row.simpleName;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\trow.moduleUrl = \"/baf/jsp/uimain/home/frame.jsp?id=\"+row.moduleId+\"&img=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/\"+row.largeIcon+\"&moduleName=\"+row.simpleName;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\trow.largeIcon = row.largeIcon || \"/baf/jsp/uimain/home/style/images/icons/analyse.png\";\r\n");
      out.write("\t\t\t\thtml.push(ccssoft.stringReplace(tmpl,row));\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\thtml.push(ccssoft.stringReplace(tmpl,{moduleId:\"more\",moduleUrl:\"/getModule.do\",largeIcon:\"/baf/jsp/uimain/home/style/images/icons/more.png\",moduleName:\"更多\"}));\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#menu\").empty().append(html.join(\"\"));\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar arr = location.hash.replace(\"#\",\"\").split(\"&module=\");\r\n");
      out.write("\t\t\tif(!lastId || lastId != arr[1])menu.init();\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tinit : function(){\r\n");
      out.write("\t\t\tvar self = this;\r\n");
      out.write("\t\t\tvar menu = document.getElementById(\"menu\");\r\n");
      out.write("\t\t\tvar list = menu.getElementsByTagName(\"li\");\r\n");
      out.write("\t\t\tif(location.hash.replace(\"#\",\"\").length>0){\r\n");
      out.write("\t\t\t\tvar arr = location.hash.replace(\"#\",\"\").split(\"&module=\");\r\n");
      out.write("\t\t\t\tlastId = arr[1];\r\n");
      out.write("\t\t\t\tself.select(document.getElementById(arr[1]));\r\n");
      out.write("\t\t\t\tself.open(arr[0]);\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tself.select(list[0]);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfor(var i = 0 , li ; li = list[i] ; i++){\r\n");
      out.write("\t\t\t\tli.onclick = function(){\r\n");
      out.write("\t\t\t\t\tself.select(this);\r\n");
      out.write("\t\t\t\t\tlastId = $(this).attr(\"id\");\r\n");
      out.write("\t\t\t\t\tvar url = $(this).children(\"a\").attr(\"href\");\r\n");
      out.write("\t\t\t\t\tvar module = self.current.id;\r\n");
      out.write("\t\t\t\t\tmodule = \"&module=\"+module;\r\n");
      out.write("\t\t\t\t\tlocation.hash = url+module;\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction resize(){\r\n");
      out.write("\t\tvar h = document.body.offsetHeight;\r\n");
      out.write("\t\tvar w = document.body.offsetWidth;\r\n");
      out.write("\t\th = h - 100;\r\n");
      out.write("\t\tw = w -105;\r\n");
      out.write("\t\tvar contentArea = document.getElementById(\"body\");\r\n");
      out.write("\t\tvar pages = document.getElementById(\"pages\");\r\n");
      out.write("\t\tcontentArea.style.width = w + \"px\";\r\n");
      out.write("\t\tcontentArea.style.height = h + \"px\";\r\n");
      out.write("\t\tpages.style.width = (w - 15) + \"px\";\r\n");
      out.write("\t\tpages.style.height = (h - 20) + \"px\";\r\n");
      out.write("\t}\r\n");
      out.write("\tresize();\r\n");
      out.write("\t$(window).resize(function(){\r\n");
      out.write("\t\tresize();\r\n");
      out.write("\t});\r\n");
      out.write("\tvar data = [];\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\tmenu.setView(data);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\twindow.onbeforeunload = function()   \r\n");
      out.write("    { \r\n");
      out.write("        //用户点击浏览器右上角关闭按钮或是按alt+F4关闭\r\n");
      out.write("        if(document.body.clientWidth - event.clientX <20 || event.altKey)   \r\n");
      out.write("        {   \r\n");
      out.write("      \t\t$.ajax({  \r\n");
      out.write("                async:false,//使用同步的Ajax请求  \r\n");
      out.write("                type: \"POST\",  \r\n");
      out.write("                url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/logout.do\",  \r\n");
      out.write("                data: \"\",  \r\n");
      out.write("                success: function(msg){  \r\n");
      out.write("                }  \r\n");
      out.write("           });  \r\n");
      out.write("       }\r\n");
      out.write("      //用户点击任务栏，右键关闭或是按alt+F4关闭\r\n");
      out.write("     else if(event.clientY > document.body.clientHeight || event.altKey)\r\n");
      out.write("     {\r\n");
      out.write("      \t$.ajax({  \r\n");
      out.write("                async:false,//使用同步的Ajax请求  \r\n");
      out.write("                type: \"POST\",  \r\n");
      out.write("                url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/logout.do\",  \r\n");
      out.write("                data: \"\",  \r\n");
      out.write("                success: function(msg){  \r\n");
      out.write("              }  \r\n");
      out.write("           });\r\n");
      out.write("     }  \r\n");
      out.write("   }\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    //注销用户\r\n");
      out.write("    function logout(){\r\n");
      out.write("        //是否注销当前登录用户？\r\n");
      out.write("       if(confirm(\"是否注销当前登录用户?\"))\r\n");
      out.write("        {\r\n");
      out.write("            $.ajax({  \r\n");
      out.write("                async:false,//使用同步的Ajax请求  \r\n");
      out.write("                type: \"POST\",  \r\n");
      out.write("                url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/logout.do\",  \r\n");
      out.write("                data: \"\",  \r\n");
      out.write("                success: function(msg){  \r\n");
      out.write("                 onLogoutComplete();\r\n");
      out.write("                }  \r\n");
      out.write("           });  \r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function onLogoutComplete(){\r\n");
      out.write("    \twindow.location.href =\"");
      out.print(path);
      out.write("/baf/jsp/uimain/login.jsp\";\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /baf/jsp/uimain/home/index.jsp(152,1) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listTop}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /baf/jsp/uimain/home/index.jsp(152,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("list");
    // /baf/jsp/uimain/home/index.jsp(152,1) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\tdata.push({\r\n");
          out.write("\t\tapplicationId : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.applicationId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\r\n");
          out.write("\t\tmoduleUrl : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.moduleUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\r\n");
          out.write("\t\tmoduleId : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.moduleId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\r\n");
          out.write("\t\tlargeIcon : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.largeIcon}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\r\n");
          out.write("\t\tmoduleName : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.moduleName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t});\r\n");
          out.write("    ");
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
}
