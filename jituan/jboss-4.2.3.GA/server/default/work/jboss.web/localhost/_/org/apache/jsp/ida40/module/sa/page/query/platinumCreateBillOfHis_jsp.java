package org.apache.jsp.ida40.module.sa.page.query;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class platinumCreateBillOfHis_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tld/customTag.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fida_005fidaDataTable_005fvar_005fitems_005findex;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbaf_005ftranslate_005ftype_005fobjId_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbaf_005fdictionary_005ftype_005fitemValue_005fdicCode_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fida_005fidaDataTable_005fvar_005fitems_005findex = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbaf_005ftranslate_005ftype_005fobjId_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbaf_005fdictionary_005ftype_005fitemValue_005fdicCode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fida_005fidaDataTable_005fvar_005fitems_005findex.release();
    _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.release();
    _005fjspx_005ftagPool_005fbaf_005ftranslate_005ftype_005fobjId_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fbaf_005fdictionary_005ftype_005fitemValue_005fdicCode_005fnobody.release();
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
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=GBK\" />\r\n");
      out.write("\t\t<title>白金卡公众历史故障界面</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<table id=\"platinumCreateBillOfHis\" style=\"padding: 10px; background-color: #F3F2F2\">\r\n");
      out.write("\t\t");
      //  ida:idaDataTable
      com.regaltec.ida40.taglib.IdaDataTableTag _jspx_th_ida_005fidaDataTable_005f0 = (com.regaltec.ida40.taglib.IdaDataTableTag) _005fjspx_005ftagPool_005fida_005fidaDataTable_005fvar_005fitems_005findex.get(com.regaltec.ida40.taglib.IdaDataTableTag.class);
      _jspx_th_ida_005fidaDataTable_005f0.setPageContext(_jspx_page_context);
      _jspx_th_ida_005fidaDataTable_005f0.setParent(null);
      // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(15,2) name = items type = java.util.Collection reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ida_005fidaDataTable_005f0.setItems((java.util.Collection) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${saBillHis}", java.util.Collection.class, (PageContext)_jspx_page_context, null, false));
      // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(15,2) name = var type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ida_005fidaDataTable_005f0.setVar("obj");
      // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(15,2) name = index type = java.lang.Integer reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ida_005fidaDataTable_005f0.setIndex("ind");
      int _jspx_eval_ida_005fidaDataTable_005f0 = _jspx_th_ida_005fidaDataTable_005f0.doStartTag();
      if (_jspx_eval_ida_005fidaDataTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object obj = null;
        java.lang.Integer ind = null;
        obj = (java.lang.Object) _jspx_page_context.findAttribute("obj");
        ind = (java.lang.Integer) _jspx_page_context.findAttribute("ind");
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_ida_005fidaColumn_005f0(_jspx_th_ida_005fidaDataTable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_ida_005fidaColumn_005f1(_jspx_th_ida_005fidaDataTable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_ida_005fidaColumn_005f2(_jspx_th_ida_005fidaDataTable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_ida_005fidaColumn_005f3(_jspx_th_ida_005fidaDataTable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_ida_005fidaColumn_005f4(_jspx_th_ida_005fidaDataTable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_ida_005fidaColumn_005f5(_jspx_th_ida_005fidaDataTable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_ida_005fidaColumn_005f6(_jspx_th_ida_005fidaDataTable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_ida_005fidaColumn_005f7(_jspx_th_ida_005fidaDataTable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_ida_005fidaColumn_005f8(_jspx_th_ida_005fidaDataTable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_ida_005fidaColumn_005f9(_jspx_th_ida_005fidaDataTable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_ida_005fidaColumn_005f10(_jspx_th_ida_005fidaDataTable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_ida_005fidaColumn_005f11(_jspx_th_ida_005fidaDataTable_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_ida_005fidaDataTable_005f0.doAfterBody();
          obj = (java.lang.Object) _jspx_page_context.findAttribute("obj");
          ind = (java.lang.Integer) _jspx_page_context.findAttribute("ind");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_ida_005fidaDataTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fida_005fidaDataTable_005fvar_005fitems_005findex.reuse(_jspx_th_ida_005fidaDataTable_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fida_005fidaDataTable_005fvar_005fitems_005findex.reuse(_jspx_th_ida_005fidaDataTable_005f0);
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</body>\r\n");
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

  private boolean _jspx_meth_ida_005fidaColumn_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaDataTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ida:idaColumn
    com.regaltec.ida40.taglib.IdaColumnTag _jspx_th_ida_005fidaColumn_005f0 = (com.regaltec.ida40.taglib.IdaColumnTag) _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.get(com.regaltec.ida40.taglib.IdaColumnTag.class);
    _jspx_th_ida_005fidaColumn_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ida_005fidaColumn_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaDataTable_005f0);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(16,3) name = label type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ida_005fidaColumn_005f0.setLabel("详情");
    int _jspx_eval_ida_005fidaColumn_005f0 = _jspx_th_ida_005fidaColumn_005f0.doStartTag();
    if (_jspx_eval_ida_005fidaColumn_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<a href=\"javascript:showBillDetail('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.billId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.dealCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("')\">点击进入</a>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_ida_005fidaColumn_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ida_005fidaColumn_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f0);
    return false;
  }

  private boolean _jspx_meth_ida_005fidaColumn_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaDataTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ida:idaColumn
    com.regaltec.ida40.taglib.IdaColumnTag _jspx_th_ida_005fidaColumn_005f1 = (com.regaltec.ida40.taglib.IdaColumnTag) _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.get(com.regaltec.ida40.taglib.IdaColumnTag.class);
    _jspx_th_ida_005fidaColumn_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ida_005fidaColumn_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaDataTable_005f0);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(19,3) name = label type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ida_005fidaColumn_005f1.setLabel("工单流水号");
    int _jspx_eval_ida_005fidaColumn_005f1 = _jspx_th_ida_005fidaColumn_005f1.doStartTag();
    if (_jspx_eval_ida_005fidaColumn_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.billSn}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_ida_005fidaColumn_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ida_005fidaColumn_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f1);
    return false;
  }

  private boolean _jspx_meth_ida_005fidaColumn_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaDataTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ida:idaColumn
    com.regaltec.ida40.taglib.IdaColumnTag _jspx_th_ida_005fidaColumn_005f2 = (com.regaltec.ida40.taglib.IdaColumnTag) _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.get(com.regaltec.ida40.taglib.IdaColumnTag.class);
    _jspx_th_ida_005fidaColumn_005f2.setPageContext(_jspx_page_context);
    _jspx_th_ida_005fidaColumn_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaDataTable_005f0);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(22,3) name = label type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ida_005fidaColumn_005f2.setLabel("故障编号");
    int _jspx_eval_ida_005fidaColumn_005f2 = _jspx_th_ida_005fidaColumn_005f2.doStartTag();
    if (_jspx_eval_ida_005fidaColumn_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.dealCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_ida_005fidaColumn_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ida_005fidaColumn_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f2);
    return false;
  }

  private boolean _jspx_meth_ida_005fidaColumn_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaDataTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ida:idaColumn
    com.regaltec.ida40.taglib.IdaColumnTag _jspx_th_ida_005fidaColumn_005f3 = (com.regaltec.ida40.taglib.IdaColumnTag) _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.get(com.regaltec.ida40.taglib.IdaColumnTag.class);
    _jspx_th_ida_005fidaColumn_005f3.setPageContext(_jspx_page_context);
    _jspx_th_ida_005fidaColumn_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaDataTable_005f0);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(25,3) name = label type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ida_005fidaColumn_005f3.setLabel("业务类型");
    int _jspx_eval_ida_005fidaColumn_005f3 = _jspx_th_ida_005fidaColumn_005f3.doStartTag();
    if (_jspx_eval_ida_005fidaColumn_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_baf_005ftranslate_005f0(_jspx_th_ida_005fidaColumn_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_ida_005fidaColumn_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ida_005fidaColumn_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f3);
    return false;
  }

  private boolean _jspx_meth_baf_005ftranslate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaColumn_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  baf:translate
    com.regaltec.customtag.TranslatedTag _jspx_th_baf_005ftranslate_005f0 = (com.regaltec.customtag.TranslatedTag) _005fjspx_005ftagPool_005fbaf_005ftranslate_005ftype_005fobjId_005fnobody.get(com.regaltec.customtag.TranslatedTag.class);
    _jspx_th_baf_005ftranslate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_baf_005ftranslate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaColumn_005f3);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(26,4) name = objId type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_baf_005ftranslate_005f0.setObjId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.specialtyId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(26,4) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_baf_005ftranslate_005f0.setType("business");
    int _jspx_eval_baf_005ftranslate_005f0 = _jspx_th_baf_005ftranslate_005f0.doStartTag();
    if (_jspx_th_baf_005ftranslate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbaf_005ftranslate_005ftype_005fobjId_005fnobody.reuse(_jspx_th_baf_005ftranslate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbaf_005ftranslate_005ftype_005fobjId_005fnobody.reuse(_jspx_th_baf_005ftranslate_005f0);
    return false;
  }

  private boolean _jspx_meth_ida_005fidaColumn_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaDataTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ida:idaColumn
    com.regaltec.ida40.taglib.IdaColumnTag _jspx_th_ida_005fidaColumn_005f4 = (com.regaltec.ida40.taglib.IdaColumnTag) _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.get(com.regaltec.ida40.taglib.IdaColumnTag.class);
    _jspx_th_ida_005fidaColumn_005f4.setPageContext(_jspx_page_context);
    _jspx_th_ida_005fidaColumn_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaDataTable_005f0);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(28,3) name = label type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ida_005fidaColumn_005f4.setLabel("受理时间");
    int _jspx_eval_ida_005fidaColumn_005f4 = _jspx_th_ida_005fidaColumn_005f4.doStartTag();
    if (_jspx_eval_ida_005fidaColumn_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_ida_005fidaColumn_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_ida_005fidaColumn_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ida_005fidaColumn_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f4);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaColumn_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaColumn_005f4);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(29,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.createTime}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(29,4) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd HH:mm");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_ida_005fidaColumn_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaDataTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ida:idaColumn
    com.regaltec.ida40.taglib.IdaColumnTag _jspx_th_ida_005fidaColumn_005f5 = (com.regaltec.ida40.taglib.IdaColumnTag) _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.get(com.regaltec.ida40.taglib.IdaColumnTag.class);
    _jspx_th_ida_005fidaColumn_005f5.setPageContext(_jspx_page_context);
    _jspx_th_ida_005fidaColumn_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaDataTable_005f0);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(31,3) name = label type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ida_005fidaColumn_005f5.setLabel("派修时间");
    int _jspx_eval_ida_005fidaColumn_005f5 = _jspx_th_ida_005fidaColumn_005f5.doStartTag();
    if (_jspx_eval_ida_005fidaColumn_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_fmt_005fformatDate_005f1(_jspx_th_ida_005fidaColumn_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_ida_005fidaColumn_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ida_005fidaColumn_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f5);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaColumn_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaColumn_005f5);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(32,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.dispatchTime}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(32,4) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setPattern("yyyy-MM-dd HH:mm");
    int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
    return false;
  }

  private boolean _jspx_meth_ida_005fidaColumn_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaDataTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ida:idaColumn
    com.regaltec.ida40.taglib.IdaColumnTag _jspx_th_ida_005fidaColumn_005f6 = (com.regaltec.ida40.taglib.IdaColumnTag) _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.get(com.regaltec.ida40.taglib.IdaColumnTag.class);
    _jspx_th_ida_005fidaColumn_005f6.setPageContext(_jspx_page_context);
    _jspx_th_ida_005fidaColumn_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaDataTable_005f0);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(34,3) name = label type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ida_005fidaColumn_005f6.setLabel("申告现象");
    int _jspx_eval_ida_005fidaColumn_005f6 = _jspx_th_ida_005fidaColumn_005f6.doStartTag();
    if (_jspx_eval_ida_005fidaColumn_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_ida_005fcomplaintCause_005f0(_jspx_th_ida_005fidaColumn_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_ida_005fidaColumn_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ida_005fidaColumn_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f6);
    return false;
  }

  private boolean _jspx_meth_ida_005fcomplaintCause_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaColumn_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ida:complaintCause
    com.regaltec.ida40.taglib.ComplaintCauseTag _jspx_th_ida_005fcomplaintCause_005f0 = new com.regaltec.ida40.taglib.ComplaintCauseTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_ida_005fcomplaintCause_005f0);
    _jspx_th_ida_005fcomplaintCause_005f0.setJspContext(_jspx_page_context);
    _jspx_th_ida_005fcomplaintCause_005f0.setParent(_jspx_th_ida_005fidaColumn_005f6);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(35,4) name = specialtyId type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ida_005fcomplaintCause_005f0.setSpecialtyId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.specialtyId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(35,4) name = complaintCause type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ida_005fcomplaintCause_005f0.setComplaintCause((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.createCause}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_ida_005fcomplaintCause_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_ida_005fcomplaintCause_005f0);
    return false;
  }

  private boolean _jspx_meth_ida_005fidaColumn_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaDataTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ida:idaColumn
    com.regaltec.ida40.taglib.IdaColumnTag _jspx_th_ida_005fidaColumn_005f7 = (com.regaltec.ida40.taglib.IdaColumnTag) _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.get(com.regaltec.ida40.taglib.IdaColumnTag.class);
    _jspx_th_ida_005fidaColumn_005f7.setPageContext(_jspx_page_context);
    _jspx_th_ida_005fidaColumn_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaDataTable_005f0);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(37,3) name = label type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ida_005fidaColumn_005f7.setLabel("受理员");
    int _jspx_eval_ida_005fidaColumn_005f7 = _jspx_th_ida_005fidaColumn_005f7.doStartTag();
    if (_jspx_eval_ida_005fidaColumn_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_baf_005ftranslate_005f1(_jspx_th_ida_005fidaColumn_005f7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_ida_005fidaColumn_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ida_005fidaColumn_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f7);
    return false;
  }

  private boolean _jspx_meth_baf_005ftranslate_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaColumn_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  baf:translate
    com.regaltec.customtag.TranslatedTag _jspx_th_baf_005ftranslate_005f1 = (com.regaltec.customtag.TranslatedTag) _005fjspx_005ftagPool_005fbaf_005ftranslate_005ftype_005fobjId_005fnobody.get(com.regaltec.customtag.TranslatedTag.class);
    _jspx_th_baf_005ftranslate_005f1.setPageContext(_jspx_page_context);
    _jspx_th_baf_005ftranslate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaColumn_005f7);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(38,4) name = objId type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_baf_005ftranslate_005f1.setObjId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.createOper}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(38,4) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_baf_005ftranslate_005f1.setType("user");
    int _jspx_eval_baf_005ftranslate_005f1 = _jspx_th_baf_005ftranslate_005f1.doStartTag();
    if (_jspx_th_baf_005ftranslate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbaf_005ftranslate_005ftype_005fobjId_005fnobody.reuse(_jspx_th_baf_005ftranslate_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbaf_005ftranslate_005ftype_005fobjId_005fnobody.reuse(_jspx_th_baf_005ftranslate_005f1);
    return false;
  }

  private boolean _jspx_meth_ida_005fidaColumn_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaDataTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ida:idaColumn
    com.regaltec.ida40.taglib.IdaColumnTag _jspx_th_ida_005fidaColumn_005f8 = (com.regaltec.ida40.taglib.IdaColumnTag) _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.get(com.regaltec.ida40.taglib.IdaColumnTag.class);
    _jspx_th_ida_005fidaColumn_005f8.setPageContext(_jspx_page_context);
    _jspx_th_ida_005fidaColumn_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaDataTable_005f0);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(40,3) name = label type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ida_005fidaColumn_005f8.setLabel("测试结果");
    int _jspx_eval_ida_005fidaColumn_005f8 = _jspx_th_ida_005fidaColumn_005f8.doStartTag();
    if (_jspx_eval_ida_005fidaColumn_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_baf_005fdictionary_005f0(_jspx_th_ida_005fidaColumn_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_ida_005fidaColumn_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ida_005fidaColumn_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f8);
    return false;
  }

  private boolean _jspx_meth_baf_005fdictionary_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaColumn_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  baf:dictionary
    com.regaltec.customtag.DictionaryTag _jspx_th_baf_005fdictionary_005f0 = (com.regaltec.customtag.DictionaryTag) _005fjspx_005ftagPool_005fbaf_005fdictionary_005ftype_005fitemValue_005fdicCode_005fnobody.get(com.regaltec.customtag.DictionaryTag.class);
    _jspx_th_baf_005fdictionary_005f0.setPageContext(_jspx_page_context);
    _jspx_th_baf_005fdictionary_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaColumn_005f8);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(41,4) name = dicCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_baf_005fdictionary_005f0.setDicCode("IDD_SA_TEST_RESULT");
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(41,4) name = itemValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_baf_005fdictionary_005f0.setItemValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.testResult}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(41,4) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_baf_005fdictionary_005f0.setType("dictionaryItem");
    int _jspx_eval_baf_005fdictionary_005f0 = _jspx_th_baf_005fdictionary_005f0.doStartTag();
    if (_jspx_th_baf_005fdictionary_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbaf_005fdictionary_005ftype_005fitemValue_005fdicCode_005fnobody.reuse(_jspx_th_baf_005fdictionary_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbaf_005fdictionary_005ftype_005fitemValue_005fdicCode_005fnobody.reuse(_jspx_th_baf_005fdictionary_005f0);
    return false;
  }

  private boolean _jspx_meth_ida_005fidaColumn_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaDataTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ida:idaColumn
    com.regaltec.ida40.taglib.IdaColumnTag _jspx_th_ida_005fidaColumn_005f9 = (com.regaltec.ida40.taglib.IdaColumnTag) _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.get(com.regaltec.ida40.taglib.IdaColumnTag.class);
    _jspx_th_ida_005fidaColumn_005f9.setPageContext(_jspx_page_context);
    _jspx_th_ida_005fidaColumn_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaDataTable_005f0);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(43,3) name = label type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ida_005fidaColumn_005f9.setLabel("区局");
    int _jspx_eval_ida_005fidaColumn_005f9 = _jspx_th_ida_005fidaColumn_005f9.doStartTag();
    if (_jspx_eval_ida_005fidaColumn_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_baf_005ftranslate_005f2(_jspx_th_ida_005fidaColumn_005f9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_ida_005fidaColumn_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ida_005fidaColumn_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f9);
    return false;
  }

  private boolean _jspx_meth_baf_005ftranslate_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaColumn_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  baf:translate
    com.regaltec.customtag.TranslatedTag _jspx_th_baf_005ftranslate_005f2 = (com.regaltec.customtag.TranslatedTag) _005fjspx_005ftagPool_005fbaf_005ftranslate_005ftype_005fobjId_005fnobody.get(com.regaltec.customtag.TranslatedTag.class);
    _jspx_th_baf_005ftranslate_005f2.setPageContext(_jspx_page_context);
    _jspx_th_baf_005ftranslate_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaColumn_005f9);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(44,4) name = objId type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_baf_005ftranslate_005f2.setObjId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.nativenetId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(44,4) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_baf_005ftranslate_005f2.setType("bureau");
    int _jspx_eval_baf_005ftranslate_005f2 = _jspx_th_baf_005ftranslate_005f2.doStartTag();
    if (_jspx_th_baf_005ftranslate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbaf_005ftranslate_005ftype_005fobjId_005fnobody.reuse(_jspx_th_baf_005ftranslate_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbaf_005ftranslate_005ftype_005fobjId_005fnobody.reuse(_jspx_th_baf_005ftranslate_005f2);
    return false;
  }

  private boolean _jspx_meth_ida_005fidaColumn_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaDataTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ida:idaColumn
    com.regaltec.ida40.taglib.IdaColumnTag _jspx_th_ida_005fidaColumn_005f10 = (com.regaltec.ida40.taglib.IdaColumnTag) _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.get(com.regaltec.ida40.taglib.IdaColumnTag.class);
    _jspx_th_ida_005fidaColumn_005f10.setPageContext(_jspx_page_context);
    _jspx_th_ida_005fidaColumn_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaDataTable_005f0);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(46,3) name = label type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ida_005fidaColumn_005f10.setLabel("站点");
    int _jspx_eval_ida_005fidaColumn_005f10 = _jspx_th_ida_005fidaColumn_005f10.doStartTag();
    if (_jspx_eval_ida_005fidaColumn_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_baf_005ftranslate_005f3(_jspx_th_ida_005fidaColumn_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_ida_005fidaColumn_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ida_005fidaColumn_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f10);
    return false;
  }

  private boolean _jspx_meth_baf_005ftranslate_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaColumn_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  baf:translate
    com.regaltec.customtag.TranslatedTag _jspx_th_baf_005ftranslate_005f3 = (com.regaltec.customtag.TranslatedTag) _005fjspx_005ftagPool_005fbaf_005ftranslate_005ftype_005fobjId_005fnobody.get(com.regaltec.customtag.TranslatedTag.class);
    _jspx_th_baf_005ftranslate_005f3.setPageContext(_jspx_page_context);
    _jspx_th_baf_005ftranslate_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaColumn_005f10);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(47,4) name = objId type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_baf_005ftranslate_005f3.setObjId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.bureauId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(47,4) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_baf_005ftranslate_005f3.setType("bureau");
    int _jspx_eval_baf_005ftranslate_005f3 = _jspx_th_baf_005ftranslate_005f3.doStartTag();
    if (_jspx_th_baf_005ftranslate_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbaf_005ftranslate_005ftype_005fobjId_005fnobody.reuse(_jspx_th_baf_005ftranslate_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbaf_005ftranslate_005ftype_005fobjId_005fnobody.reuse(_jspx_th_baf_005ftranslate_005f3);
    return false;
  }

  private boolean _jspx_meth_ida_005fidaColumn_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_ida_005fidaDataTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ida:idaColumn
    com.regaltec.ida40.taglib.IdaColumnTag _jspx_th_ida_005fidaColumn_005f11 = (com.regaltec.ida40.taglib.IdaColumnTag) _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.get(com.regaltec.ida40.taglib.IdaColumnTag.class);
    _jspx_th_ida_005fidaColumn_005f11.setPageContext(_jspx_page_context);
    _jspx_th_ida_005fidaColumn_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ida_005fidaDataTable_005f0);
    // /ida40/module/sa/page/query/platinumCreateBillOfHis.jsp(49,3) name = label type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ida_005fidaColumn_005f11.setLabel("修复时限");
    int _jspx_eval_ida_005fidaColumn_005f11 = _jspx_th_ida_005fidaColumn_005f11.doStartTag();
    if (_jspx_eval_ida_005fidaColumn_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.billLimit}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_ida_005fidaColumn_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ida_005fidaColumn_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fida_005fidaColumn_005flabel.reuse(_jspx_th_ida_005fidaColumn_005f11);
    return false;
  }
}
