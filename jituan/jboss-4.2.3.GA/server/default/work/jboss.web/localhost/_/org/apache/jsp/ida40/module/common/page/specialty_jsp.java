package org.apache.jsp.ida40.module.common.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.regaltec.baf.business.common.valueobj.BusinessVO;
import java.util.List;
import org.apache.commons.lang.StringUtils;
import java.util.Hashtable;
import com.regaltec.baf.external.business.bi.IBusinessBI;
import org.springframework.web.context.WebApplicationContext;

public final class specialty_jsp extends org.apache.jasper.runtime.HttpJspBase
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

WebApplicationContext wac = (WebApplicationContext) application.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
IBusinessBI businessBI = (IBusinessBI) wac.getBean("ext_baf_businessBI");
String businessId = StringUtils.trimToEmpty(request.getParameter("node"));
if ("0".equals(businessId)) {
    businessId = "";
}
Hashtable hash = new Hashtable();
hash.put("parentBusinessid", businessId);
hash.put("ServletContext", getServletContext());
Hashtable result = businessBI.selectChildren(hash);
List<BusinessVO> businessVOs = (List<BusinessVO>) result.get("selectChildren");
StringBuilder stringBuilder = new StringBuilder();
stringBuilder.append("[");
for (BusinessVO businessVO : businessVOs) {
	stringBuilder.append("{\"text\": \"").append(businessVO.getBusinessname()).append("\"");
	stringBuilder.append(", \"id\": \"").append(businessVO.getBusinessid()).append("\"");
	if ("Y".equals(businessVO.getIsleaf())) {
	    stringBuilder.append(", \"leaf\": true");
	} else {
	    stringBuilder.append(", \"leaf\": false");
	}
	stringBuilder.append("},");
}
stringBuilder.deleteCharAt(stringBuilder.length() - 1);
stringBuilder.append("]");
out.println(stringBuilder.toString());

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
