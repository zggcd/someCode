package org.apache.jsp.ida40.module.tactic.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.external.business.bi.IBusinessBI;
import com.regaltec.baf.external.bureau.bi.IBureauBI;
import com.regaltec.baf.org.organization.common.valueobj.OrgTreeVO;
import com.regaltec.baf.bureau.common.valueobj.BureauVO;
import com.regaltec.baf.business.common.valueobj.BusinessVO;
import com.regaltec.baf.org.user.common.valueobj.UserVO;
import com.regaltec.common.util.Constant;
import com.regaltec.ida40.cd.tactic.bo.element.ITacticElementBO;
import com.regaltec.ida40.cd.tactic.model.element.TacticElement;

public final class bureauBusinessComElementTree_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");

	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String id = request.getParameter("id");
	
	//局向id
	String buid = null;
	//业务id
	String biid = null;
	
	//判断并提取局向和业务id
	if (id == null || id.equals("0")){
	    id = "";
	    buid = "";
		biid = null;
	}else{
	    String[] ids = id.split("#");
	    if(ids.length > 1){
	        buid = ids[0];
	        biid = ids[1];
	    }else{
	        buid = ids[0];
	        biid = null;
	    }
	}
	
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBureauBI iBureauBI = (IBureauBI) ctx.getBean("ext_baf_bureauBI");
		IBusinessBI business = (IBusinessBI) ctx.getBean("ext_baf_businessBI");
		//读取组合元素BO
		ITacticElementBO tacticElementBO = (ITacticElementBO) ctx.getBean("tacticElementBO");
		
		PrintWriter printOut = response.getWriter();
		StringBuilder builder = new StringBuilder();
		
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id=\"");
		
		/*如果查询节点参数objectId为空,则认为查询树的顶点,此时xml的tree id属性应为0,否则为objectId*/
		if(buid == null ||  "".equals(buid)){
		   builder.append("0");
		}
		else{
		   builder.append(id);
		}
		
		builder.append("\">\n");
		
		//如果业务id不为空，则点击的是业务节点，此时展开业务节点下的组合元素实列。 否则加载业务和局向节点
		if(biid != null){
		    //展开组合元素实列
			 List<TacticElement> elements = tacticElementBO.selectedElement(biid, "2");
			 for (int i = 0; i < elements.size(); i++) {
			     TacticElement element = elements.get(i);
				 builder.append("<item text=\"");
				 builder.append( element.getElementName());
				 builder.append("\" id=\"");
				 builder.append( id + "#"  + element.getElementId());
				 builder.append("\" ");
			  	 builder.append(" im0 =\"books_close.gif\" im1 =\"books_close.gif\" im2=\"books_close.gif\" ");
			     builder.append(" child = \"0\" ");
			     builder.append(" >\n");
			     builder.append("<userdata name=\"type\"><![CDATA[E]]></userdata>\n");
			     builder.append("<userdata name=\"eleId\"><![CDATA[" + element.getElementId() + "]]></userdata>\n");
			     builder.append("<userdata name=\"biId\"><![CDATA[" +  biid + "]]></userdata>\n");
			     builder.append("<userdata name=\"buId\"><![CDATA[" +  buid + "]]></userdata>\n"); 
			     builder.append("</item>");
			 }
		    
		}else{ 
		    //加载业务, 顶层节点不需加载业务
		   List<BusinessVO> busis = business.selectChildren("",null,null);
		   if (busis != null && !"".equals(id)){
		       for (int i = 0; i < busis.size(); i++) {
		           	BusinessVO vo = busis.get(i);
					builder.append("<item text=\"");
					builder.append(vo.getBusinessname());
					builder.append("\" id=\"");
					builder.append(buid + "#" + vo.getBusinessid());
					builder.append("\" ");
				 	builder.append(" im0 =\"books_close.gif\" im1 =\"books_close.gif\" im2=\"books_close.gif\" ");
				    builder.append(" child = \"1\" ");
					builder.append(" >\n ");
					builder.append("<userdata name=\"type\"><![CDATA[BI]]></userdata>\n");
					builder.append("<userdata name=\"biId\"><![CDATA[" + vo.getBusinessid() + "]]></userdata>\n");
					builder.append("</item>");
		       }
		   }
		    
		  	//加载局向
		  	if(biid == null){
				List<BureauVO> bureaus = iBureauBI.selectChildren(buid);
				if (bureaus != null){
				    BureauVO vo;
					int k = 0;
				    for (int i = 0; i < bureaus.size(); i++) {
				        vo= (BureauVO) bureaus.get(i);
				    	k++;
				    	if(!"01".equals(vo.getBureautype()) 
		    	        	&& !"02".equals(vo.getBureautype()) 
		    	        	&& !"03".equals(vo.getBureautype())){
				    	    continue;
				    	}
				    	
				    	/*****局向节点***********************************************************/
					 	builder.append("<item text=\"");
						builder.append(vo.getBureauname());
						builder.append("\" id=\"");
						builder.append(vo.getBureauid());
						builder.append("\" ");
					  	builder.append(" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" ");
					    builder.append(" child = \"1\" ");
					    if( k==1 && buid.equals("") ){
						   builder.append(" select = \"1\" ");
						   builder.append(" call = \"1\" ");
						   builder.append(" open = \"1\" "); 
						}
						builder.append(" >\n ");
						builder.append("<userdata name=\"type\"><![CDATA[BU]]></userdata>\n");
						builder.append("<userdata name=\"buId\"><![CDATA[" + vo.getBureauid() + "]]></userdata>\n");
						builder.append("</item>");
						
			    	}
				}
			}
		}
		 builder.append("</tree>\n");
		 
		 printOut.write(builder.toString());
		 printOut.close();
	 
	}catch (Exception e) {
		e.printStackTrace();
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
