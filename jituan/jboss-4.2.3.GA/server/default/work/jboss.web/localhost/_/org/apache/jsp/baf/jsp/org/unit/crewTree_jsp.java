package org.apache.jsp.baf.jsp.org.unit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.framework.common.IBusiness;
import com.regaltec.baf.org.organization.common.valueobj.OrgTreeVO;
import com.regaltec.baf.org.organization.common.valueobj.OrganizationVO;
import com.regaltec.baf.org.user.common.valueobj.UserVO;
import com.regaltec.common.util.Constant;
import com.regaltec.common.util.StringHelper;
import com.regaltec.baf.org.user.ui.control.UserLoginBean;

public final class crewTree_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String objectId = request.getParameter("id");
	String businessId = request.getParameter("businessId");
	String objectType=request.getParameter("objectType");
	String orgId=request.getParameter("orgId");
	
	if (objectId == null || objectId.equals("0"))
		objectId = "";
	
	PrintWriter printOut = response.getWriter();
	StringBuilder builder = new StringBuilder();
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
		
		Hashtable hashtable = new Hashtable();
		hashtable.put("orgId", StringHelper.convertStringNull(orgId));
		hashtable.put("businessId",StringHelper.convertStringNull(businessId));
		hashtable.put("objectType",StringHelper.convertStringNull(objectType));	
		hashtable.put("is_defualt","Y");	
		hashtable.put("currentThread", Thread.currentThread().getName());
		hashtable.put("ServletContext",sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_organizationBI", "selectCrewByOrgId", hashtable);
		List crewTreeList = null;
			
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id=\"");
		/*如果查询节点参数objectId为空,则认为查询树的顶点,此时xml的tree id属性应为0,否则为objectId*/
		//if(objectId == null ||  "".equals(objectId)){
		   builder.append("0");
		//}
		//else{
		//   builder.append(objectId);
		//}
		builder.append("\">\n");
		if (retHashtable != null){
			crewTreeList = (List) retHashtable.get("selectCrewByOrgId");
			if (crewTreeList != null){
				int k = 0;
			    for (int i=0;i<crewTreeList.size();i++) {
			    	OrganizationVO vo = (OrganizationVO)crewTreeList.get(i);
			    	k++;
				 	builder.append("<item text=\"");
					builder.append(vo.getOrgname());
					builder.append("\" id=\"");
					builder.append(vo.getOrgid());
					builder.append("\" ");
					builder.append(" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" ");
					builder.append(" child = \"0\" ");
					if(vo!=null&&"Y".equalsIgnoreCase(vo.getIsleaf())){//已经在sql赋值给isleaf
					   builder.append(" checked = \"1\" ");
					}
					
					builder.append(" >\n");
					builder.append("<userdata name=\"oldCrewId\">"+vo.getCrewId()+"</userdata>");
					builder.append("</item>\n");
				}	
		  	}
	 	}

	 	//if ((crewTreeList == null ||  crewTreeList.size() == 0 ) && (objectId == null || objectId.equalsIgnoreCase("") ) ){
	    //	builder.append("<item text=\"Click here to add data\" id=\"null\" />");
	 	//}
	 	builder.append("</tree>\n");
	}catch (Exception e) {
		e.printStackTrace();
	}finally{
		printOut.write(builder.toString());
		printOut.close();
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
