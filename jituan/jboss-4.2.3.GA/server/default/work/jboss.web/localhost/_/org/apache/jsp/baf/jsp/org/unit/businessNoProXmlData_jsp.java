package org.apache.jsp.baf.jsp.org.unit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.framework.common.IBusiness;
import com.regaltec.baf.framework.bp.BusinessDelegateImpl;
import com.regaltec.baf.business.common.valueobj.BusinessVO;
import com.regaltec.baf.business.common.valueobj.BusinessRelVO;

public final class businessNoProXmlData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String objectId = request.getParameter("id");
	String requestId = request.getParameter("requestId");
	String objectType=request.getParameter("objectType");
	String isFirstDisp=request.getParameter("isFirstDisp");
	if (objectId == null || objectId.equals("0")) {
		objectId = "";
	}
	if(requestId==null){
	   requestId="";
	}
	if(objectType==null){
	   objectType="";
	}
	PrintWriter outs = null;
	StringBuffer buf = null;
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");

		outs = response.getWriter();
		buf = new StringBuffer();
		buf.append("<?xml version='1.0' encoding='GBK'?>\n");
		if (!objectId.equalsIgnoreCase("")) {
			buf.append("<tree id=\"" + objectId + "\">\n");
		} else {
			buf.append("<tree id=\"0\">\n");
		}
		String child = "";
		String open = " open=\"true\" call=\"1\" select=\"1\" ";
		int k = 0;

		Hashtable hash = new Hashtable();
		hash.put("objectid",requestId);
		hash.put("objecttype",objectType);
		hash.put("parentBusinessid", (Object) objectId);
		hash.put("businessProperty","");//businessProperty 为空时查询所有数据       "1":主专业, "0":非主专业, "2": 业务,
		hash.put("ServletContext", sc);
		hash = (Hashtable) business.invoke("baf_businessBI","selectChildrenForProperty", hash);
		List list = null;
		if (hash != null) {
			list = (List) hash.get("selectChildrenForProperty");
			if (list != null && list.size() > 0) {
				for (int i = 0; i < list.size(); i++) {
					BusinessVO bvo=(BusinessVO)list.get(i);
					k++;
			
					String isLeaf = bvo.getIsleaf();
					if ("Y".equals(isLeaf)) {
						child = "0";
					} else {
						child = "1";
					}
 
					buf.append("<item text=\"" + bvo.getBusinessname()
							+ "\" id=\"" + bvo.getBusinessid()
							+ "\" child=\"" + child + "\"");
					if (k == 1 && objectId.equalsIgnoreCase("")) {
						buf.append(open);
					}
					
					if("2".equals(bvo.getBusinessproperty())){
						buf.append(" nocheckbox = \"1\" ");
					}
					if(bvo!=null&&"Y".equalsIgnoreCase(bvo.getIsSelect())){
					   buf.append(" checked = \"1\" ");
					}
					if("0".equals(bvo.getBusinessproperty())&&"Y".equals(isFirstDisp)){//如果是首派功能就更换颜色
						buf.append(" im0 =\"book.gif\" im1 =\"book.gif\" im2=\"book.gif\" ");
					}else{
						buf.append(" im0 =\"books_close.gif\" im1 =\"books_close.gif\" im2=\"books_close.gif\" ");
					}
					buf.append(" tooltip=\"" + bvo.getBusinessname()
							+ "\" >\n");

					buf.append("<userdata name=\"type\">" +bvo.getBusinessproperty()
							+ "</userdata>\n");
					buf.append("<userdata name=\"isLeaf\">" + isLeaf
							+ "</userdata>\n");
					buf.append("<userdata name=\"isValid\">"
							+ bvo.getIsvalid() + "</userdata>\n");
					buf.append("<userdata name=\"parentbusinessid\">"
							+ bvo.getParentbusinessid()
							+ "</userdata>\n");
					buf.append("<userdata name=\"sortorder\">"
							+ bvo.getSortorder() + "</userdata>\n");
					buf.append("<userdata name=\"businesscode\">"
							+ bvo.getBusinesscode()
							+ "</userdata>\n</item>\n");
				}
			}
		}
		buf.append("</tree>\n");
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		outs.write(buf.toString());
		outs.close();
	}

      out.write("\r\n");
      out.write("\r\n");
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
