package org.apache.jsp.baf.jsp.bureau;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.framework.common.IBusiness;
import com.regaltec.baf.bureau.common.valueobj.BureauVO;

public final class bureautree_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String id = request.getParameter("id");
	if (id == null || id.equals("0"))
		id = "";
	PrintWriter printOut = response.getWriter();
	StringBuilder builder = new StringBuilder();
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
		Hashtable hashtable = new Hashtable();
		hashtable.put("ServletContext", sc);
		hashtable.put("parentBureauid", id);
		hashtable.put("currentThread", Thread.currentThread().getName());
		Hashtable retHashtable = (Hashtable) business.invoke("baf_bureauBI", "selectChildren", hashtable);
		List orgTreeList = null;			
		
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id=\"");
		/*如果查询节点参数objectId为空,则认为查询树的顶点,此时xml的tree id属性应为0,否则为objectId*/
		if(id == null ||  "".equals(id)){
		   builder.append("0");
		}
		else{
		   builder.append(id);
		}
		builder.append("\">\n");
		if (retHashtable != null){
			orgTreeList = (List) retHashtable.get("selectChildren");
			if (orgTreeList != null){
			    BureauVO vo;
				int k = 0;
			    for (int i=0;i<orgTreeList.size();i++) {
			        vo=(BureauVO)orgTreeList.get(i);
			    	k++;
				 	builder.append("<item text=\"");
					builder.append(vo.getBureauname());
					builder.append("\" id=\"");
					builder.append(vo.getBureauid());
					builder.append("\" ");
				/*	if(  "O".equalsIgnoreCase(vo.getBureautype()))
					{*/
					   builder.append(" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" ");
				/*	}
					else if(  "P".equalsIgnoreCase(vo.getBureautype()))
					{
					   builder.append(" im0 =\"position.gif\" im1 =\"position.gif\" im2=\"position.gif\" ");
					}
					else 
					{
					    builder.append(" im0 =\"person.gif\" im1 =\"person.gif\" im2=\"person.gif\" ");
					}*/
					
					/*判断是否为叶子节点,如果为非叶子节则在树的节点显示加"+"号的图标,否则显示"-"图标*/
					if( "Y".equalsIgnoreCase(vo.getIsleaf()) )
					{
					    builder.append(" child = \"0\" ");
					}else{
					    builder.append(" child = \"1\" ");
					}
					if(k==1 && id.equals("")){
					   builder.append(" select = \"1\" ");
					   builder.append(" call = \"1\" ");
					   builder.append(" open = \"1\" "); 
					}
					
					builder.append(" >\n");
						
					builder.append("<userdata name=\"bureauid\">");
					builder.append("<![CDATA[");
					builder.append(vo.getBureauid());
					builder.append("]]>");
					builder.append("</userdata>\n");
												
					builder.append("<userdata name=\"bureauname\">");
					builder.append("<![CDATA[");
					builder.append(vo.getBureauname());
					builder.append("]]>");
					builder.append("</userdata>\n");
					
					builder.append("<userdata name=\"bureautype\">");
					builder.append("<![CDATA[");
					builder.append(vo.getBureautype());
					builder.append("]]>");
					builder.append("</userdata>\n");
						
					builder.append("</item>\n");
				}	
		  	}
		}

		if ((orgTreeList == null ||  orgTreeList.size() == 0 ) && (id == null || id.equalsIgnoreCase("") ) ){
		    builder.append("<item text=\"点击这里添加数据\" id=\"null\" call = \"1\" open = \"1\" />");
		 
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
