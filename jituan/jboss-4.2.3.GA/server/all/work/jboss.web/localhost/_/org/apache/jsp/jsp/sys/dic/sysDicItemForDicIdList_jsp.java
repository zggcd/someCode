package org.apache.jsp.jsp.sys.dic;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sysDicItemForDicIdList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/jsp/common/allTag.jsp");
    _jspx_dependants.add("/WEB-INF/custom-tag.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("<script type='text/javascript' src='/js/commonjs.js'></script>\r\n");

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
      out.write("\r\n");
      out.write("<form name=\"allForm3\" id=\"allForm3\">\r\n");
      out.write("<table class=table id=powergrid style=\"FONT-SIZE: 13px\"\r\n");
      out.write("            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box\r\n");
      out.write("            pcolor=\"#BCC8F5\">\r\n");
      out.write("            \t\t<thead>\r\n");
      out.write("            \t\t\t<tr class=\"titletr\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"word-break: keep-all;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t选择\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"word-break: keep-all;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t详情\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"word-break: keep-all;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t数据字典条目名称\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"word-break: keep-all;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t数据字典条目代号\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"word-break: keep-all;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t描述\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("            \t\t</thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                  </table>\r\n");
      out.write("               </form>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /jsp/sys/dic/sysDicItemForDicIdList.jsp(31,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/jsp/sys/dic/sysDicItemForDicIdList.jsp(31,7) '${requestScope.sysDicItemForDicIdList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope.sysDicItemForDicIdList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /jsp/sys/dic/sysDicItemForDicIdList.jsp(31,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("obj");
    // /jsp/sys/dic/sysDicItemForDicIdList.jsp(31,7) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("n");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<tr align=\"center\" bgcolor=\"\" style=\"cursor: 'hand'\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\" style=\"width:3%\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"checkid1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.itemId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\" style=\"width:3%\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<img  alt=\"查看详情\" onclick=\"toSysDicItemEdit('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.itemId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("');\" src=\"/images/main/icon_search01.gif\" border=0 style=\"cursor: pointer\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t   ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.itemValue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t   ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.itemCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t   ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.itemDesc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t");
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
