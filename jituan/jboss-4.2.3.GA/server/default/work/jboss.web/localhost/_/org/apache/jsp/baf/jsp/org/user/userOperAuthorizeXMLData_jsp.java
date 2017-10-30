package org.apache.jsp.baf.jsp.org.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.framework.common.IBusiness;
import com.regaltec.baf.rig.authorize.common.valueobj.OperateAuthPreviewVO;
import com.regaltec.common.util.StringHelper;

public final class userOperAuthorizeXMLData_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	
	String objectId = request.getParameter("id");
	if (objectId == null || objectId.equals("0")){
		objectId = "";
	}
	
	PrintWriter printOut = response.getWriter();
	StringBuilder builder = new StringBuilder();
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
				
		Hashtable hashtable = new Hashtable();
		
		String userId = "";
		if(request.getParameter("userId")!=null){
			userId = request.getParameter("userId");
		}
		hashtable.put("userId", userId);
		hashtable.put("treeCode", objectId);
		hashtable.put("ServletContext", sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_operateAuthorizeBI", "getChildrenOperateAuthRight", hashtable);
		List rightList = null;
			
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id=\"");
		
		//如果rightId为空,则查询树的顶点，tree的id为0,否则为rightId
		if(objectId == null ||  "".equals(objectId)){
		   builder.append("0");
		}else{
		   builder.append(objectId);
		}
		
		builder.append("\">\n");
		
		if (retHashtable != null){
			rightList = (List) retHashtable.get("getChildrenOperateAuthRight");			
			if (rightList != null){
			    for (int i=0;i<rightList.size();i++) {
			    	OperateAuthPreviewVO vo = (OperateAuthPreviewVO)rightList.get(i);
			    	String id = vo.getTreeCode();
				 	String rightType = vo.getObjectType();
				 	String isLeaf = StringHelper.convertStringNull(vo.getIsLeaf());		
			 		builder.append("<item text=\""+vo.getRightName()+"\" id=\""+id+"\" "+" im0 =\"book_titel.gif\" im1 =\"book_titel.gif\" im2=\"book_titel.gif\" ");
		 			if(isLeaf.equals("N")){
		 				builder.append(" child = \"1\" ");
		 			}
					builder.append(" tooltip=\""+vo.getRightName()+"\" >\n</item>\n");			 		
				}					
		  	}
	 	}
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
