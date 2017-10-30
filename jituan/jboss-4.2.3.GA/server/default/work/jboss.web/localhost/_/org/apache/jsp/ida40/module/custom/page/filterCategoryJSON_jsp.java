package org.apache.jsp.ida40.module.custom.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class filterCategoryJSON_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjson_005fwriteJsonp_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjson_005fwriteArray_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjson_005fwriteObject;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjson_005fwriteString_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fjson_005fwriteJsonp_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fjson_005fwriteArray_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fjson_005fwriteObject = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fjson_005fwriteString_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fjson_005fwriteJsonp_005fname.release();
    _005fjspx_005ftagPool_005fjson_005fwriteArray_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fjson_005fwriteObject.release();
    _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fjson_005fwriteString_005fname.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.release();
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
      response.setContentType("application/json; charset=UTF-8");
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
      if (_jspx_meth_json_005fwriteJsonp_005f0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_json_005fwriteJsonp_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:writeJsonp
    com.regaltec.ida40.taglib.JsonPaddingTag _jspx_th_json_005fwriteJsonp_005f0 = (com.regaltec.ida40.taglib.JsonPaddingTag) _005fjspx_005ftagPool_005fjson_005fwriteJsonp_005fname.get(com.regaltec.ida40.taglib.JsonPaddingTag.class);
    _jspx_th_json_005fwriteJsonp_005f0.setPageContext(_jspx_page_context);
    _jspx_th_json_005fwriteJsonp_005f0.setParent(null);
    // /ida40/module/custom/page/filterCategoryJSON.jsp(4,0) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteJsonp_005f0.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.callback}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_json_005fwriteJsonp_005f0 = _jspx_th_json_005fwriteJsonp_005f0.doStartTag();
    if (_jspx_eval_json_005fwriteJsonp_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_json_005fwriteJsonp_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_json_005fwriteJsonp_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_json_005fwriteJsonp_005f0.doInitBody();
      }
      do {
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_json_005fwriteArray_005f0(_jspx_th_json_005fwriteJsonp_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_json_005fwriteJsonp_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_json_005fwriteJsonp_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_json_005fwriteJsonp_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjson_005fwriteJsonp_005fname.reuse(_jspx_th_json_005fwriteJsonp_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fjson_005fwriteJsonp_005fname.reuse(_jspx_th_json_005fwriteJsonp_005f0);
    return false;
  }

  private boolean _jspx_meth_json_005fwriteArray_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_json_005fwriteJsonp_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:writeArray
    com.regaltec.ida40.taglib.JsonArrayTag _jspx_th_json_005fwriteArray_005f0 = (com.regaltec.ida40.taglib.JsonArrayTag) _005fjspx_005ftagPool_005fjson_005fwriteArray_005fvar_005fitems.get(com.regaltec.ida40.taglib.JsonArrayTag.class);
    _jspx_th_json_005fwriteArray_005f0.setPageContext(_jspx_page_context);
    _jspx_th_json_005fwriteArray_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_json_005fwriteJsonp_005f0);
    // /ida40/module/custom/page/filterCategoryJSON.jsp(5,1) name = items type = java.util.Collection reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteArray_005f0.setItems((java.util.Collection) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.filterProjects}", java.util.Collection.class, (PageContext)_jspx_page_context, null, false));
    // /ida40/module/custom/page/filterCategoryJSON.jsp(5,1) name = var type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteArray_005f0.setVar("filterProject");
    int _jspx_eval_json_005fwriteArray_005f0 = _jspx_th_json_005fwriteArray_005f0.doStartTag();
    if (_jspx_eval_json_005fwriteArray_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_json_005fwriteArray_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_json_005fwriteArray_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_json_005fwriteArray_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_json_005fwriteObject_005f0(_jspx_th_json_005fwriteArray_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        int evalDoAfterBody = _jspx_th_json_005fwriteArray_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_json_005fwriteArray_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_json_005fwriteArray_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjson_005fwriteArray_005fvar_005fitems.reuse(_jspx_th_json_005fwriteArray_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fjson_005fwriteArray_005fvar_005fitems.reuse(_jspx_th_json_005fwriteArray_005f0);
    return false;
  }

  private boolean _jspx_meth_json_005fwriteObject_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_json_005fwriteArray_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:writeObject
    com.regaltec.ida40.taglib.JsonObjectTag _jspx_th_json_005fwriteObject_005f0 = (com.regaltec.ida40.taglib.JsonObjectTag) _005fjspx_005ftagPool_005fjson_005fwriteObject.get(com.regaltec.ida40.taglib.JsonObjectTag.class);
    _jspx_th_json_005fwriteObject_005f0.setPageContext(_jspx_page_context);
    _jspx_th_json_005fwriteObject_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_json_005fwriteArray_005f0);
    int _jspx_eval_json_005fwriteObject_005f0 = _jspx_th_json_005fwriteObject_005f0.doStartTag();
    if (_jspx_eval_json_005fwriteObject_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_json_005fwriteObject_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_json_005fwriteObject_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_json_005fwriteObject_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_json_005fwriteString_005f0(_jspx_th_json_005fwriteObject_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_json_005fwriteString_005f1(_jspx_th_json_005fwriteObject_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_json_005fwriteString_005f2(_jspx_th_json_005fwriteObject_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_json_005fwriteString_005f3(_jspx_th_json_005fwriteObject_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_json_005fwriteString_005f4(_jspx_th_json_005fwriteObject_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_json_005fwriteObject_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_json_005fwriteObject_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_json_005fwriteObject_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjson_005fwriteObject.reuse(_jspx_th_json_005fwriteObject_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fjson_005fwriteObject.reuse(_jspx_th_json_005fwriteObject_005f0);
    return false;
  }

  private boolean _jspx_meth_json_005fwriteString_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_json_005fwriteObject_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:writeString
    com.regaltec.ida40.taglib.JsonWriteStringTag _jspx_th_json_005fwriteString_005f0 = (com.regaltec.ida40.taglib.JsonWriteStringTag) _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.get(com.regaltec.ida40.taglib.JsonWriteStringTag.class);
    _jspx_th_json_005fwriteString_005f0.setPageContext(_jspx_page_context);
    _jspx_th_json_005fwriteString_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_json_005fwriteObject_005f0);
    // /ida40/module/custom/page/filterCategoryJSON.jsp(7,3) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f0.setName("projectId");
    // /ida40/module/custom/page/filterCategoryJSON.jsp(7,3) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filterProject.projectId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_json_005fwriteString_005f0 = _jspx_th_json_005fwriteString_005f0.doStartTag();
    if (_jspx_th_json_005fwriteString_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteString_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteString_005f0);
    return false;
  }

  private boolean _jspx_meth_json_005fwriteString_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_json_005fwriteObject_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:writeString
    com.regaltec.ida40.taglib.JsonWriteStringTag _jspx_th_json_005fwriteString_005f1 = (com.regaltec.ida40.taglib.JsonWriteStringTag) _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.get(com.regaltec.ida40.taglib.JsonWriteStringTag.class);
    _jspx_th_json_005fwriteString_005f1.setPageContext(_jspx_page_context);
    _jspx_th_json_005fwriteString_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_json_005fwriteObject_005f0);
    // /ida40/module/custom/page/filterCategoryJSON.jsp(8,3) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f1.setName("projectName");
    // /ida40/module/custom/page/filterCategoryJSON.jsp(8,3) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filterProject.projectName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_json_005fwriteString_005f1 = _jspx_th_json_005fwriteString_005f1.doStartTag();
    if (_jspx_th_json_005fwriteString_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteString_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteString_005f1);
    return false;
  }

  private boolean _jspx_meth_json_005fwriteString_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_json_005fwriteObject_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:writeString
    com.regaltec.ida40.taglib.JsonWriteStringTag _jspx_th_json_005fwriteString_005f2 = (com.regaltec.ida40.taglib.JsonWriteStringTag) _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.get(com.regaltec.ida40.taglib.JsonWriteStringTag.class);
    _jspx_th_json_005fwriteString_005f2.setPageContext(_jspx_page_context);
    _jspx_th_json_005fwriteString_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_json_005fwriteObject_005f0);
    // /ida40/module/custom/page/filterCategoryJSON.jsp(9,3) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f2.setName("shareable");
    // /ida40/module/custom/page/filterCategoryJSON.jsp(9,3) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filterProject.shareable}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_json_005fwriteString_005f2 = _jspx_th_json_005fwriteString_005f2.doStartTag();
    if (_jspx_th_json_005fwriteString_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteString_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteString_005f2);
    return false;
  }

  private boolean _jspx_meth_json_005fwriteString_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_json_005fwriteObject_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:writeString
    com.regaltec.ida40.taglib.JsonWriteStringTag _jspx_th_json_005fwriteString_005f3 = (com.regaltec.ida40.taglib.JsonWriteStringTag) _005fjspx_005ftagPool_005fjson_005fwriteString_005fname.get(com.regaltec.ida40.taglib.JsonWriteStringTag.class);
    _jspx_th_json_005fwriteString_005f3.setPageContext(_jspx_page_context);
    _jspx_th_json_005fwriteString_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_json_005fwriteObject_005f0);
    // /ida40/module/custom/page/filterCategoryJSON.jsp(10,3) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f3.setName("updateDate");
    int _jspx_eval_json_005fwriteString_005f3 = _jspx_th_json_005fwriteString_005f3.doStartTag();
    if (_jspx_eval_json_005fwriteString_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_json_005fwriteString_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_json_005fwriteString_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_json_005fwriteString_005f3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_json_005fwriteString_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_json_005fwriteString_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_json_005fwriteString_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_json_005fwriteString_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjson_005fwriteString_005fname.reuse(_jspx_th_json_005fwriteString_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fjson_005fwriteString_005fname.reuse(_jspx_th_json_005fwriteString_005f3);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_json_005fwriteString_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_json_005fwriteString_005f3);
    // /ida40/module/custom/page/filterCategoryJSON.jsp(11,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filterProject.updateDate}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /ida40/module/custom/page/filterCategoryJSON.jsp(11,4) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd HH:mm:ss");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_json_005fwriteString_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_json_005fwriteObject_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:writeString
    com.regaltec.ida40.taglib.JsonWriteStringTag _jspx_th_json_005fwriteString_005f4 = (com.regaltec.ida40.taglib.JsonWriteStringTag) _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.get(com.regaltec.ida40.taglib.JsonWriteStringTag.class);
    _jspx_th_json_005fwriteString_005f4.setPageContext(_jspx_page_context);
    _jspx_th_json_005fwriteString_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_json_005fwriteObject_005f0);
    // /ida40/module/custom/page/filterCategoryJSON.jsp(13,3) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f4.setName("orderNo");
    // /ida40/module/custom/page/filterCategoryJSON.jsp(13,3) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f4.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filterProject.orderNo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_json_005fwriteString_005f4 = _jspx_th_json_005fwriteString_005f4.doStartTag();
    if (_jspx_th_json_005fwriteString_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteString_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteString_005f4);
    return false;
  }
}
