package org.apache.jsp.ida40.module.sms.tree;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.regaltec.baf.bureau.bi.IBureauBI;
import com.regaltec.baf.business.bi.IBusinessBI;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.framework.common.IBusiness;
import com.regaltec.baf.framework.bp.BusinessDelegateImpl;
import com.regaltec.baf.business.common.valueobj.BusinessVO;
import com.regaltec.baf.bureau.common.valueobj.BureauVO;

public final class businessBureauTree_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	
	// 获得当前操作人 所属本地网ID
	String userNativeNet = request.getParameter("userNativeNet");
	
	String businessId = request.getParameter("id");
	String businessIdTemp=businessId;
	if (businessId == null || businessId.equals("0")){
		businessId = "";
	} 
	if (businessId.indexOf(",01,")>=0){
		businessId = businessId.replace(",01,","");
	}  
	
	PrintWriter outs = null;
	StringBuffer buf = null;
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusinessBI business = (IBusinessBI) ctx.getBean("baf_businessBI");
		
		outs = response.getWriter();
		buf = new StringBuffer();
		buf.append("<?xml version='1.0' encoding='GBK'?>\n");
		if (!businessId.equalsIgnoreCase("")) {
			buf.append("<tree id=\""+businessId+"\">\n");
		} else {
			buf.append("<tree id=\"0\">\n");
		}
		String child = "";
		String open = " open=\"true\" call=\"1\" select=\"1\" ";
		int k = 0;
				
		//添加公共部分信息
		/**
		buf.append("<item text=\"公共部分\" id=\"0000000,01,\" child=\"1\" im0 =\"books_close.gif\" im1 =\"books_close.gif\" im2=\"books_close.gif\"  tooltip=\"公共部分\" >\n");
		buf.append("<userdata name=\"isleaf\">N</userdata>\n");
		buf.append("<userdata name=\"isvalid\">Y</userdata>\n");
		buf.append("<userdata name=\"parentbusinessid\">null</userdata>\n"); 
		buf.append("<userdata name=\"sortorder\">0</userdata>\n");
		buf.append("<userdata name=\"businesscode\">0</userdata>\n"); 
		buf.append("<userdata name=\"businessproperty\">0</userdata>\n");
		buf.append("<userdata name=\"treecode\">0000000</userdata>\n");
		buf.append("<userdata name=\"urlFlag\">element</userdata>\n");
		buf.append("<userdata name=\"allId\">0000000</userdata>\n");  
		buf.append("<userdata name=\"businessName\">公共部分</userdata>\n");  
		buf.append("</item>\n");   
		*/
		
		Hashtable hash = new Hashtable(); 
		
		hash.put("parentBusinessid", (Object)businessId); 
		
		hash=business.selectChildren(hash);
						
		List list = null;
		if(hash!=null){
			list = (List) hash.get("selectChildren");		
			if(list!=null && list.size()>0){
				for (int i = 0; i < list.size(); i++) {
					BusinessVO vo = (BusinessVO) list.get(i);
					k++;
					String isLeaf = vo.getIsleaf();			
					if("N".equalsIgnoreCase(isLeaf)){
						//不是叶子节点
						child = "1";
					}else{						
						child = "1";							
					}
					
					//只加载业务树的首层
					if(vo.getTreecode().length()==4){
					
						buf.append("<item text=\""+vo.getBusinessname()+"\" id=\""+vo.getBusinessid()+",01,"+"\" child=\""+child+"\"");			
						if (k == 1 && businessId.equalsIgnoreCase("")){
							buf.append(open);
						}
						buf.append(" im0 =\"books_close.gif\" im1 =\"books_close.gif\" im2=\"books_close.gif\" ");
						buf.append(" tooltip=\""+vo.getBusinessname()+"\" >\n");				
						
						buf.append("<userdata name=\"isleaf\">"+isLeaf+"</userdata>\n");
						buf.append("<userdata name=\"isvalid\">"+vo.getIsvalid()+"</userdata>\n");
						buf.append("<userdata name=\"parentbusinessid\">"+vo.getParentbusinessid()+"</userdata>\n");
						buf.append("<userdata name=\"sortorder\">"+vo.getSortorder()+"</userdata>\n");
						buf.append("<userdata name=\"businesscode\">"+vo.getBusinesscode()+"</userdata>\n");
						buf.append("<userdata name=\"businessproperty\">"+vo.getBusinessproperty()+"</userdata>\n");
						buf.append("<userdata name=\"treecode\">"+vo.getTreecode()+"</userdata>\n");
						buf.append("<userdata name=\"urlFlag\">element</userdata>\n");
						buf.append("<userdata name=\"allId\">"+vo.getBusinessid()+"</userdata>\n");
						buf.append("<userdata name=\"businessName\">"+vo.getBusinessname()+"</userdata>\n</item>\n"); 
						
					}else{
						//从这里开始加载局向树  START 
						String id = request.getParameter("id");
						if (businessIdTemp.indexOf(",01,")>=0){
							id = "";
						}else{
							id=id.split(",")[1];
						}
						
						sc = session.getServletContext();
						
						IBureauBI iBureauBI = (IBureauBI) ctx.getBean("baf_bureauBI");
						Hashtable hashtable = new Hashtable(); 
						hashtable.put("parentBureauid", id);  
						Hashtable retHashtable=iBureauBI.selectChildren(hashtable);
						
						List orgTreeList = null;			
						PrintWriter printOut = response.getWriter();
						buf = new StringBuffer();
						buf.append("<?xml version='1.0' encoding='GBK'?>\n");
						buf.append("<tree id=\"");
						/*如果查询节点参数objectId为空,则认为查询树的顶点,此时xml的tree id属性应为0,否则为objectId*/ 
						
						if(businessIdTemp.indexOf("_")>=0){
							//businessIdTemp=businessIdTemp.substring(0,7);
						}
						buf.append(businessIdTemp);

						buf.append("\">\n");
						if (retHashtable != null){
							orgTreeList = (List) retHashtable.get("selectChildren");
							if (orgTreeList != null){
							    BureauVO vo1; 
							    for (int ii=0;ii<orgTreeList.size();ii++) {
							        vo1=(BureauVO)orgTreeList.get(ii); 
							        
							        if (vo1.getBureautype().equals("01")
											|| vo1.getBureautype().equals("02")) {  
							            
									 	buf.append("<item text=\"");
										buf.append(vo1.getBureauname());
										buf.append("\" id=\"");
										buf.append(businessId+","+vo1.getBureauid());
										buf.append("\" ");
										buf.append(" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" ");
									
										if( "Y".equalsIgnoreCase(vo1.getIsleaf())){
										    buf.append(" child = \"0\" ");
										}else{
											if (vo1.getBureautype().equals("02")) {
										    	buf.append(" child = \"0\" ");
											}else{
												buf.append(" child = \"1\" ");
											}
										} 
										
										buf.append(" >\n");
											
										buf.append("<userdata name=\"bureauid\">");
										buf.append("<![CDATA[");
										buf.append(vo1.getBureauid());
										buf.append("]]>");
										buf.append("</userdata>\n");
																	
										buf.append("<userdata name=\"bureauname\">");
										buf.append("<![CDATA[");
										buf.append(vo1.getBureauname());
										buf.append("]]>");
										buf.append("</userdata>\n");
										
										buf.append("<userdata name=\"bureautype\">");
										buf.append("<![CDATA[");
										buf.append(vo1.getBureautype());
										buf.append("]]>");
										buf.append("</userdata>\n");
										
										buf.append("<userdata name=\"urlFlag\">");
										buf.append("<![CDATA[");
										buf.append("templateObject");
										buf.append("]]>");
										buf.append("</userdata>\n");
										
										buf.append("<userdata name=\"allId\">");
										buf.append("<![CDATA[");
										buf.append(businessId+","+vo1.getBureauid());
										buf.append("]]>");
										buf.append("</userdata>\n");
										
										buf.append("</item>\n");
									}	
							    }   
						  }
					 }
						//加载局向树  END
					}
				} 
			}else{ 			    
				//从这里开始加载局向树  START
				String id = request.getParameter("id");
				if (businessIdTemp.indexOf(",01,")>=0){
					id = "";
				}else{
					id=id.split(",")[1];
				} 
				
				IBureauBI iBureauBI = (IBureauBI) ctx.getBean("baf_bureauBI");
				Hashtable hashtable = new Hashtable(); 
				hashtable.put("parentBureauid", id);  
				Hashtable retHashtable=iBureauBI.selectChildren(hashtable);
				
				List orgTreeList = null;			
				PrintWriter printOut = response.getWriter();
				buf = new StringBuffer();
				buf.append("<?xml version='1.0' encoding='GBK'?>\n");
				buf.append("<tree id=\"");
				/*如果查询节点参数objectId为空,则认为查询树的顶点,此时xml的tree id属性应为0,否则为objectId*/ 
				if(businessIdTemp.indexOf("_")>=0){
					//businessIdTemp=businessIdTemp.substring(0,7);
				}
				buf.append(businessIdTemp);

				buf.append("\">\n");
				if (retHashtable != null){
					orgTreeList = (List) retHashtable.get("selectChildren");
					
					if (orgTreeList != null){
					    BureauVO vo1; 
					    for (int ii=0;ii<orgTreeList.size();ii++) {
					        vo1=(BureauVO)orgTreeList.get(ii); 
					        
					        if (vo1.getBureautype().equals("01")
									|| vo1.getBureautype().equals("02")) { 
					            
					            if((vo1.getBureautype().equals("02") && vo1.getBureauid().equals(userNativeNet)) || "".equals(userNativeNet) || vo1.getBureautype().equals("01")){
					            					        
								 	buf.append("<item text=\"");
									buf.append(vo1.getBureauname());
									buf.append("\" id=\"");
									buf.append(businessId+","+vo1.getBureauid());
									buf.append("\" ");
									buf.append(" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" ");
								
									if( "Y".equalsIgnoreCase(vo1.getIsleaf())){
									    buf.append(" child = \"0\" ");
									}else{
										if (vo1.getBureautype().equals("02")) {
									    	buf.append(" child = \"0\" ");
										}else{
											buf.append(" child = \"1\" ");
										}
									} 
									
									buf.append(" >\n");
										
									buf.append("<userdata name=\"bureauid\">");
									buf.append("<![CDATA[");
									buf.append(vo1.getBureauid());
									buf.append("]]>");
									buf.append("</userdata>\n");
																
									buf.append("<userdata name=\"bureauname\">");
									buf.append("<![CDATA[");
									buf.append(vo1.getBureauname());
									buf.append("]]>");
									buf.append("</userdata>\n");
									
									buf.append("<userdata name=\"bureautype\">");
									buf.append("<![CDATA[");
									buf.append(vo1.getBureautype());
									buf.append("]]>");
									buf.append("</userdata>\n");
									
									buf.append("<userdata name=\"urlFlag\">");
									buf.append("<![CDATA[");
									buf.append("templateObject");
									buf.append("]]>");
									buf.append("</userdata>\n");
									
									buf.append("<userdata name=\"allId\">");
									buf.append("<![CDATA[");
									buf.append(businessId+","+vo1.getBureauid());
									buf.append("]]>");
									buf.append("</userdata>\n");
										
									buf.append("</item>\n");
								
					            }
					        }
						}	
				  }
			 }
				//加载局向树  END			
			} 			
		} 
		
		if ((list == null ||  list.size() == 0 ) && businessId.equals("")){
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
