package org.apache.jsp.ida40.module.common.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.codehaus.jettison.json.JSONObject;
import org.codehaus.jettison.json.JSONArray;
import com.regaltec.ida40.common.bo.IComplaintCauseBO;
import com.regaltec.ida40.common.model.ComplaintCause;
import com.regaltec.ida40.common.model.ComplaintCauseExample;
import com.regaltec.ida40.common.model.ComplaintCauseExample.Criteria;
import java.util.List;
import java.io.Writer;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.context.WebApplicationContext;

public final class complaintCause2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    WebApplicationContext wac =
            (WebApplicationContext) application
                    .getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
    IComplaintCauseBO complaintCauseBO = (IComplaintCauseBO) wac.getBean("complaintCauseBO");
    String deleteId = StringUtils.trimToEmpty(request.getParameter("deleteId"));
    String specialtyId = StringUtils.trimToEmpty(request.getParameter("specialtyId"));
    String complaintId = StringUtils.trimToEmpty(request.getParameter("complaintId"));
    if ("Y".equals(deleteId)) {//complaintId为主键
        if (!StringUtils.isNumeric(complaintId)) {
            throw new IllegalArgumentException();
        }
        complaintCauseBO.deleteCause(Long.valueOf(complaintId));
    } else {//complaintId为代码
        JSONArray jsonArray = new JSONArray();
        if (StringUtils.isNotBlank(specialtyId)) {
            ComplaintCauseExample example = new ComplaintCauseExample();
            Criteria criteria = example.createCriteria();
            criteria.andSpecialtyIdEqualTo(specialtyId);
            example.setOrderByClause("PU14.COMPLAINT_CAUSE");
            if (StringUtils.isBlank(complaintId) || StringUtils.equals(complaintId, "0")) {
                criteria.andParentIdIsNull();
            } else {
                criteria.andParentIdEqualTo(complaintId);
            }
            List<ComplaintCause> complaintCauseList = complaintCauseBO.findCauses(example);
            for (ComplaintCause complaintCause : complaintCauseList) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("id", complaintCause.getCodeId());
                jsonObject.put("text", complaintCause.getName());
                if (StringUtils.equals(complaintCause.getNodeType(), "0")) {
                    jsonObject.put("leaf", Boolean.TRUE);
                }
                jsonObject.put("specialtyId", complaintCause.getSpecialtyId());
                jsonObject.put("complaintId", complaintCause.getComplaintCause());
                jsonArray.put(jsonObject);
            }
        }
        out.println(jsonArray.toString());
    }

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
