package org.apache.jsp.jsp.supt.taticConfig;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class taticGroupDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/jsp/common/allTag.jsp");
    _jspx_dependants.add("/WEB-INF/custom-tag.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fblocimp_005fsysDicDis_005fvalue_005fiddValue_005fdicItemIn_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fblocimp_005fsysDicDis_005fvalue_005fiddValue_005fdicItemIn_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fblocimp_005fsysDicDis_005fvalue_005fiddValue_005fdicItemIn_005fnobody.release();
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
      response.setContentType("text/html;charset=GBK");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");

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
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/main.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/imgurl.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" topmargin=\"4\" >\r\n");
      out.write("<form name=\"detailForm\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"5\" cellspacing=\"0\" bgcolor=\"#FFFFFF\"  height=\"100%\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td valign=\"top\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <table class=table id=powergrid style=\"FONT-SIZE: 13px\"\r\n");
      out.write("            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box\r\n");
      out.write("            pcolor=\"#BCC8F5\">\r\n");
      out.write("    <tr >\r\n");
      out.write("      <td align=\"right\"  bgcolor=\"#F4F4F4\" >\r\n");
      out.write("         策略组名称：\r\n");
      out.write("      </td>\r\n");
      out.write("      <td>\r\n");
      out.write("         <input type=\"hidden\" name=\"taticgoupid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${suptTaticGroup.taticgoupid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("         <input type=\"text\" name=\"taticgoupname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${suptTaticGroup.taticgoupname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"  dataType=\"Require\" msg=\"策略组名称不能为空\" >\r\n");
      out.write("         <font color=\"red\">*</font>\r\n");
      out.write("      </td>\r\n");
      out.write("\r\n");
      out.write("      <td align=\"right\"  bgcolor=\"#F4F4F4\"  >\r\n");
      out.write("         策略类型：\r\n");
      out.write("      </td>\r\n");
      out.write("      <td>\r\n");
      out.write("      ");
      if (_jspx_meth_blocimp_005fsysDicDis_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("         <font color=\"red\">*</font>\r\n");
      out.write("      </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("      <td align=\"right\"  bgcolor=\"#F4F4F4\" >\r\n");
      out.write("         所包含元素：\r\n");
      out.write("      </td>\r\n");
      out.write("      <td colspan=\"3\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <span id=\"elementSpan\"></span>\r\n");
      out.write("        &nbsp;\r\n");
      out.write("        <input type=\"button\" class=\"button\" value=\"添加元素\" accesskey=\"Q\"  onclick=\"selectElement()\" />\r\n");
      out.write("      </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td align=\"right\"  bgcolor=\"#F4F4F4\" >\r\n");
      out.write("         备注：\r\n");
      out.write("      </td>\r\n");
      out.write("      <td colspan=\"3\">\r\n");
      out.write("        <textarea   name=\"remark\"  cols=\"70\"  rows=\"5\"  >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${suptTaticGroup.remark}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\r\n");
      out.write("      </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"4\" align=\"center\" height=\"40\">\r\n");
      out.write("       <input type=\"button\" class=\"button\" value=\"保存\" accesskey=\"Q\"  onclick=\"saveGroup()\" />\r\n");
      out.write("      </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("      </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_blocimp_005fsysDicDis_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  blocimp:sysDicDis
    com.regaltec.blocimp.web.tag.SysDicDis _jspx_th_blocimp_005fsysDicDis_005f0 = (com.regaltec.blocimp.web.tag.SysDicDis) _005fjspx_005ftagPool_005fblocimp_005fsysDicDis_005fvalue_005fiddValue_005fdicItemIn_005fnobody.get(com.regaltec.blocimp.web.tag.SysDicDis.class);
    _jspx_th_blocimp_005fsysDicDis_005f0.setPageContext(_jspx_page_context);
    _jspx_th_blocimp_005fsysDicDis_005f0.setParent(null);
    // /jsp/supt/taticConfig/taticGroupDetail.jsp(29,6) name = iddValue type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_blocimp_005fsysDicDis_005f0.setIddValue("SUPT_TACTIC_TYPE");
    // /jsp/supt/taticConfig/taticGroupDetail.jsp(29,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_blocimp_005fsysDicDis_005f0.setValue("tatictype");
    // /jsp/supt/taticConfig/taticGroupDetail.jsp(29,6) name = dicItemIn type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_blocimp_005fsysDicDis_005f0.setDicItemIn((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${suptTaticGroup.tatictype}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_blocimp_005fsysDicDis_005f0 = _jspx_th_blocimp_005fsysDicDis_005f0.doStartTag();
    if (_jspx_th_blocimp_005fsysDicDis_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fblocimp_005fsysDicDis_005fvalue_005fiddValue_005fdicItemIn_005fnobody.reuse(_jspx_th_blocimp_005fsysDicDis_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fblocimp_005fsysDicDis_005fvalue_005fiddValue_005fdicItemIn_005fnobody.reuse(_jspx_th_blocimp_005fsysDicDis_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /jsp/supt/taticConfig/taticGroupDetail.jsp(38,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/jsp/supt/taticConfig/taticGroupDetail.jsp(38,8) '${requestScope.taticElementList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope.taticElementList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /jsp/supt/taticConfig/taticGroupDetail.jsp(38,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("obj");
    // /jsp/supt/taticConfig/taticGroupDetail.jsp(38,8) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("n");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("           <input type=\"checkbox\" name=\"elementCheckid\" checked value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.elementid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.elementname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(";\r\n");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
