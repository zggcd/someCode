package org.apache.jsp.ida40.module.sms.tree;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.regaltec.ida40.cd.sms.model.object.MsgObject;
import com.regaltec.ida40.cd.sms.bo.object.IMsgObjectBO;
import com.regaltec.ida40.cd.sms.model.object.MsgTemplateObject;
import com.regaltec.ida40.cd.sms.bo.object.IMsgTemplateObjectBO;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;

public final class msgGroupObjectTree_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   \r\n");

	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String id = request.getParameter("id");  
	
	if(id==null){
	    id="";
	} 
	if(id.equals("0")){
	    id="";
	} 
	
	String nativenetId = request.getParameter("nativenetId");  
		
	PrintWriter outs = null;
	StringBuffer buf = null;
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IMsgTemplateObjectBO msgTemplateObjectBO = (IMsgTemplateObjectBO) ctx.getBean("msgTemplateObjectBO"); 
		
		outs = response.getWriter();
		buf = new StringBuffer();
		buf.append("<?xml version='1.0' encoding='GBK'?>\n");
		if (!id.equals("")) {
			buf.append("<tree id=\""+id+"\">\n");
		} else {
			buf.append("<tree id=\"0\">\n");
		}
		String child = "";
		String open = " open=\"true\" call=\"1\" select=\"1\" ";
		int k = 0; 
		
		List list = msgTemplateObjectBO.getAllMsgTemplateList(id,nativenetId);	 
			if(list!=null && list.size()>0){ // 加群组
				for (int i = 0; i < list.size(); i++) {
				    MsgTemplateObject vo = (MsgTemplateObject) list.get(i);
					k++; 		 
					
					child = "1";
					  
					buf.append("<item text=\""+vo.getTemplateName()+"\" id=\""+vo.getTemplateId()+"\" child=\""+child+"\"");			
					if (k == 1 && id.equalsIgnoreCase("")){
						buf.append(open);
					}
					buf.append(" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" ");
					buf.append(" tooltip=\""+vo.getTemplateName()+"\" >\n");			 
						
					buf.append("<userdata name=\"ifGroup\">1</userdata>\n");
					buf.append("<userdata name=\"objectType\">99</userdata>\n");
					buf.append("<userdata name=\"objectName\">"+vo.getTemplateName()+"</userdata>\n</item>\n"); 	
				}
			}else{ 
				//加载群组对应的人员		 
			    IMsgObjectBO msgObjectBO = (IMsgObjectBO) ctx.getBean("msgObjectBO");
				if(id!=null && !"".equals(id)){
			    	list=msgObjectBO.selectByTemplateId(Long.valueOf(id));
				}
			    if(list!=null && list.size()>0){
			        for(int i=0;i<list.size();i++){
			            MsgObject mo=(MsgObject) list.get(i);
			            child = "0";
			            
			            buf.append("<item text=\""+mo.getNotifyDescript()+"\" id=\""+mo.getNotifyObject()+"\" child=\""+child+"\"");			
					
						buf.append(" im0 =\"person.gif\" im1 =\"person.gif\" im2=\"person.gif\" ");
						buf.append(" tooltip=\""+mo.getNotifyDescript()+"\" >\n");			 
						
						buf.append("<userdata name=\"ifGroup\">0</userdata>\n");
						buf.append("<userdata name=\"groupName\">"+msgTemplateObjectBO.selectByPrimaryKey(mo.getTemplateId()).getTemplateName()+"</userdata>\n");
						buf.append("<userdata name=\"objectName\">"+mo.getNotifyDescript()+"</userdata>\n"); 	
						buf.append("<userdata name=\"objectId\">"+mo.getNotifyObject()+"</userdata>\n"); 
						buf.append("<userdata name=\"objectType\">"+mo.getNotifyObjectType()+"</userdata>\n</item>\n"); 
			        }
			    }
			} 
		if ((list == null ||  list.size() == 0 ) && id.equals("")){
		    buf.append("<item text=\"暂无数据\" id=\"null\" call=\"1\" select=\"1\" />");	 
		 }
		buf.append("</tree>\n");		
	} catch (Exception e) {
		e.printStackTrace();
	} finally{
		outs.write(buf.toString());
		outs.close();  		  
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
