package org.apache.jsp.ida40.module.sa.page.sound;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class playSound_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=GBK");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=GBK\">\r\n");
      out.write("<title>声音警告</title>\r\n");
      out.write("<style type=\"text/css\" media=\"screen\">\r\n");
      out.write("\t#wmplayer {\r\n");
      out.write("\t\tdisplay: none;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("//<![CDATA[\r\n");
      out.write("var isIE = navigator.userAgent.search(\"MSIE\") > -1; // IE浏览器\r\n");
      out.write("var isSafari = navigator.userAgent.search(\"Safari\") > -1;//Google瀏覽器是用這核心 \r\n");
      out.write("\r\n");
      out.write("function playSound() {\r\n");
      out.write("  if(document.getElementById(\"playSounder\") != null && document.getElementById(\"playSounder\") != 'undefined') {\r\n");
      out.write("\t  if(isIE) {\r\n");
      out.write("\t   document.getElementById(\"playSounder\").innerHTML=\"<embed src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/ida40/module/sa/page/sound/newMessage.wav' hidden='true'  type='audio/wav' loop='true' autostart='true' /> \"; \r\n");
      out.write("\t  } \r\n");
      out.write("\t  if(isSafari) {\r\n");
      out.write("\t   document.getElementById(\"playSounder\").innerHTML=\"<audio src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/ida40/module/sa/page/sound/newMessage.wav' autoplay loop >你的浏览器不支持audio标签，不能播放音频文件！</audio> \";\r\n");
      out.write("\t  }\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//]]>\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <span id=\"playSounder\"></span>\r\n");

int totalRows=request.getParameter("totalRows")==null?0:Integer.parseInt(request.getParameter("totalRows"));
if(totalRows>0){

      out.write("\r\n");
      out.write("<script >\r\n");
      out.write("//<![CDATA[\r\n");
      out.write("playSound();\r\n");
      out.write("//]]>\r\n");
      out.write("</script>\r\n");

}

      out.write("\r\n");
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
}
