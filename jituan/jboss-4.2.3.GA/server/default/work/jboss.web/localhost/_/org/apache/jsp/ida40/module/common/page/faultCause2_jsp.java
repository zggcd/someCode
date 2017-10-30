package org.apache.jsp.ida40.module.common.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.codehaus.jettison.json.JSONObject;
import org.codehaus.jettison.json.JSONArray;
import com.regaltec.ida40.common.bo.IFaultCauseBO;
import com.regaltec.ida40.common.model.FaultCause;
import com.regaltec.ida40.common.model.FaultCauseExample;
import com.regaltec.ida40.common.model.FaultCauseExample.Criteria;
import java.util.List;
import java.io.Writer;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.context.WebApplicationContext;

public final class faultCause2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tld/customTag.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjson_005fwriteArray_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjson_005fwriteObject;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjson_005fwriteBoolean_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjson_005fwriteString_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fjson_005fwriteArray_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fjson_005fwriteObject = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fjson_005fwriteBoolean_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fjson_005fwriteString_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fjson_005fwriteArray_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fjson_005fwriteObject.release();
    _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fjson_005fwriteBoolean_005fvalue_005fname_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    WebApplicationContext wac =
            (WebApplicationContext) application
                    .getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
    IFaultCauseBO faultCauseBO = (IFaultCauseBO) wac.getBean("faultCauseBO");
    String specialtyId = StringUtils.trimToEmpty(request.getParameter("specialtyId"));
    
    List<FaultCause> faultCauseList = null;
    if (StringUtils.isNotBlank(specialtyId)) {
        FaultCauseExample example = new FaultCauseExample();
        Criteria criteria = example.createCriteria();
        criteria.andSpecialtyIdEqualTo(specialtyId);
        example.setOrderByClause("PU16.FAULT_CAUSE");
        String faultCause = StringUtils.trimToEmpty(request.getParameter("faultCause"));
        if (StringUtils.isBlank(faultCause) || StringUtils.equals(faultCause, "0")) {
            criteria.andParentIdIsNull();
        } else {
            criteria.andParentIdEqualTo(faultCause);
        }
        faultCauseList = faultCauseBO.findCauses(example);
        request.setAttribute("faultCauseList", faultCauseList);
    }

      out.write('\r');
      out.write('\n');
      if (_jspx_meth_json_005fwriteArray_005f0(_jspx_page_context))
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

  private boolean _jspx_meth_json_005fwriteArray_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:writeArray
    com.regaltec.ida40.taglib.JsonArrayTag _jspx_th_json_005fwriteArray_005f0 = (com.regaltec.ida40.taglib.JsonArrayTag) _005fjspx_005ftagPool_005fjson_005fwriteArray_005fvar_005fitems.get(com.regaltec.ida40.taglib.JsonArrayTag.class);
    _jspx_th_json_005fwriteArray_005f0.setPageContext(_jspx_page_context);
    _jspx_th_json_005fwriteArray_005f0.setParent(null);
    // /ida40/module/common/page/faultCause2.jsp(40,0) name = items type = java.util.Collection reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteArray_005f0.setItems((java.util.Collection) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.faultCauseList}", java.util.Collection.class, (PageContext)_jspx_page_context, null, false));
    // /ida40/module/common/page/faultCause2.jsp(40,0) name = var type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteArray_005f0.setVar("faultCause");
    int _jspx_eval_json_005fwriteArray_005f0 = _jspx_th_json_005fwriteArray_005f0.doStartTag();
    if (_jspx_eval_json_005fwriteArray_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_json_005fwriteArray_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_json_005fwriteArray_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_json_005fwriteArray_005f0.doInitBody();
      }
      do {
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_json_005fwriteObject_005f0(_jspx_th_json_005fwriteArray_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
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
        out.write("\t\t");
        if (_jspx_meth_json_005fwriteString_005f0(_jspx_th_json_005fwriteObject_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_json_005fwriteString_005f1(_jspx_th_json_005fwriteObject_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_005fif_005f0(_jspx_th_json_005fwriteObject_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_005fif_005f1(_jspx_th_json_005fwriteObject_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_json_005fwriteString_005f2(_jspx_th_json_005fwriteObject_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_json_005fwriteString_005f3(_jspx_th_json_005fwriteObject_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_json_005fwriteString_005f4(_jspx_th_json_005fwriteObject_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_json_005fwriteString_005f5(_jspx_th_json_005fwriteObject_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_json_005fwriteString_005f6(_jspx_th_json_005fwriteObject_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
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
    // /ida40/module/common/page/faultCause2.jsp(42,2) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f0.setName("id");
    // /ida40/module/common/page/faultCause2.jsp(42,2) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${faultCause.codeId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
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
    // /ida40/module/common/page/faultCause2.jsp(43,2) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f1.setName("name");
    // /ida40/module/common/page/faultCause2.jsp(43,2) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${faultCause.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_json_005fwriteString_005f1 = _jspx_th_json_005fwriteString_005f1.doStartTag();
    if (_jspx_th_json_005fwriteString_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteString_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteString_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_json_005fwriteObject_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_json_005fwriteObject_005f0);
    // /ida40/module/common/page/faultCause2.jsp(44,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${'0' eq faultCause.nodeType}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_json_005fwriteBoolean_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_json_005fwriteBoolean_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:writeBoolean
    com.regaltec.ida40.taglib.JsonWriteBooleanTag _jspx_th_json_005fwriteBoolean_005f0 = (com.regaltec.ida40.taglib.JsonWriteBooleanTag) _005fjspx_005ftagPool_005fjson_005fwriteBoolean_005fvalue_005fname_005fnobody.get(com.regaltec.ida40.taglib.JsonWriteBooleanTag.class);
    _jspx_th_json_005fwriteBoolean_005f0.setPageContext(_jspx_page_context);
    _jspx_th_json_005fwriteBoolean_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /ida40/module/common/page/faultCause2.jsp(45,3) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteBoolean_005f0.setName("leaf");
    // /ida40/module/common/page/faultCause2.jsp(45,3) name = value type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteBoolean_005f0.setValue(new Boolean(true));
    int _jspx_eval_json_005fwriteBoolean_005f0 = _jspx_th_json_005fwriteBoolean_005f0.doStartTag();
    if (_jspx_th_json_005fwriteBoolean_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjson_005fwriteBoolean_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteBoolean_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fjson_005fwriteBoolean_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteBoolean_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_json_005fwriteObject_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_json_005fwriteObject_005f0);
    // /ida40/module/common/page/faultCause2.jsp(47,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${'0' ne faultCause.nodeType}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_json_005fwriteBoolean_005f1(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_json_005fwriteBoolean_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:writeBoolean
    com.regaltec.ida40.taglib.JsonWriteBooleanTag _jspx_th_json_005fwriteBoolean_005f1 = (com.regaltec.ida40.taglib.JsonWriteBooleanTag) _005fjspx_005ftagPool_005fjson_005fwriteBoolean_005fvalue_005fname_005fnobody.get(com.regaltec.ida40.taglib.JsonWriteBooleanTag.class);
    _jspx_th_json_005fwriteBoolean_005f1.setPageContext(_jspx_page_context);
    _jspx_th_json_005fwriteBoolean_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    // /ida40/module/common/page/faultCause2.jsp(48,3) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteBoolean_005f1.setName("leaf");
    // /ida40/module/common/page/faultCause2.jsp(48,3) name = value type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteBoolean_005f1.setValue(new Boolean(false));
    int _jspx_eval_json_005fwriteBoolean_005f1 = _jspx_th_json_005fwriteBoolean_005f1.doStartTag();
    if (_jspx_th_json_005fwriteBoolean_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjson_005fwriteBoolean_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteBoolean_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fjson_005fwriteBoolean_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteBoolean_005f1);
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
    // /ida40/module/common/page/faultCause2.jsp(50,2) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f2.setName("faultCause");
    // /ida40/module/common/page/faultCause2.jsp(50,2) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${faultCause.faultCause}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
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
    com.regaltec.ida40.taglib.JsonWriteStringTag _jspx_th_json_005fwriteString_005f3 = (com.regaltec.ida40.taglib.JsonWriteStringTag) _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.get(com.regaltec.ida40.taglib.JsonWriteStringTag.class);
    _jspx_th_json_005fwriteString_005f3.setPageContext(_jspx_page_context);
    _jspx_th_json_005fwriteString_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_json_005fwriteObject_005f0);
    // /ida40/module/common/page/faultCause2.jsp(51,2) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f3.setName("specialtyId");
    // /ida40/module/common/page/faultCause2.jsp(51,2) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${faultCause.specialtyId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_json_005fwriteString_005f3 = _jspx_th_json_005fwriteString_005f3.doStartTag();
    if (_jspx_th_json_005fwriteString_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteString_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteString_005f3);
    return false;
  }

  private boolean _jspx_meth_json_005fwriteString_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_json_005fwriteObject_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:writeString
    com.regaltec.ida40.taglib.JsonWriteStringTag _jspx_th_json_005fwriteString_005f4 = (com.regaltec.ida40.taglib.JsonWriteStringTag) _005fjspx_005ftagPool_005fjson_005fwriteString_005fname.get(com.regaltec.ida40.taglib.JsonWriteStringTag.class);
    _jspx_th_json_005fwriteString_005f4.setPageContext(_jspx_page_context);
    _jspx_th_json_005fwriteString_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_json_005fwriteObject_005f0);
    // /ida40/module/common/page/faultCause2.jsp(52,2) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f4.setName("createTime");
    int _jspx_eval_json_005fwriteString_005f4 = _jspx_th_json_005fwriteString_005f4.doStartTag();
    if (_jspx_eval_json_005fwriteString_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_json_005fwriteString_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_json_005fwriteString_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_json_005fwriteString_005f4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_json_005fwriteString_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_json_005fwriteString_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_json_005fwriteString_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_json_005fwriteString_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjson_005fwriteString_005fname.reuse(_jspx_th_json_005fwriteString_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fjson_005fwriteString_005fname.reuse(_jspx_th_json_005fwriteString_005f4);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_json_005fwriteString_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_json_005fwriteString_005f4);
    // /ida40/module/common/page/faultCause2.jsp(53,3) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${faultCause.createTime}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /ida40/module/common/page/faultCause2.jsp(53,3) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd HH:mm:ss");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_json_005fwriteString_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_json_005fwriteObject_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:writeString
    com.regaltec.ida40.taglib.JsonWriteStringTag _jspx_th_json_005fwriteString_005f5 = (com.regaltec.ida40.taglib.JsonWriteStringTag) _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.get(com.regaltec.ida40.taglib.JsonWriteStringTag.class);
    _jspx_th_json_005fwriteString_005f5.setPageContext(_jspx_page_context);
    _jspx_th_json_005fwriteString_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_json_005fwriteObject_005f0);
    // /ida40/module/common/page/faultCause2.jsp(55,2) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f5.setName("treeCode");
    // /ida40/module/common/page/faultCause2.jsp(55,2) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f5.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${faultCause.treeCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_json_005fwriteString_005f5 = _jspx_th_json_005fwriteString_005f5.doStartTag();
    if (_jspx_th_json_005fwriteString_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteString_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteString_005f5);
    return false;
  }

  private boolean _jspx_meth_json_005fwriteString_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_json_005fwriteObject_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:writeString
    com.regaltec.ida40.taglib.JsonWriteStringTag _jspx_th_json_005fwriteString_005f6 = (com.regaltec.ida40.taglib.JsonWriteStringTag) _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.get(com.regaltec.ida40.taglib.JsonWriteStringTag.class);
    _jspx_th_json_005fwriteString_005f6.setPageContext(_jspx_page_context);
    _jspx_th_json_005fwriteString_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_json_005fwriteObject_005f0);
    // /ida40/module/common/page/faultCause2.jsp(56,2) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f6.setName("pyCode");
    // /ida40/module/common/page/faultCause2.jsp(56,2) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_json_005fwriteString_005f6.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${faultCause.pyCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_json_005fwriteString_005f6 = _jspx_th_json_005fwriteString_005f6.doStartTag();
    if (_jspx_th_json_005fwriteString_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteString_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fjson_005fwriteString_005fvalue_005fname_005fnobody.reuse(_jspx_th_json_005fwriteString_005f6);
    return false;
  }
}
