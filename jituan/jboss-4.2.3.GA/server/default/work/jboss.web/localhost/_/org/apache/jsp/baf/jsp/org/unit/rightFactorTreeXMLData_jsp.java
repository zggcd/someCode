package org.apache.jsp.baf.jsp.org.unit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.framework.common.IBusiness;
import com.regaltec.baf.rig.factor.common.valueobj.DataRightFactorVO;
import com.regaltec.baf.rig.factor.common.valueobj.DataRightFactorTypeVO;
import com.regaltec.baf.ui.UIDataHandler;

public final class rightFactorTreeXMLData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	String factorTypeId = request.getParameter("id");
	if (factorTypeId == null || factorTypeId.equals("0")){
		factorTypeId = "";
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
		if (!factorTypeId.equalsIgnoreCase("")) {
			buf.append("<tree id=\""+factorTypeId+"\">\n");
		} else {
			buf.append("<tree id=\"0\">\n");
		}
		String child = "";
		String open = " open=\"true\" call=\"1\" select=\"1\" ";
		int k = 0;
		
		if (!factorTypeId.equalsIgnoreCase("")) {
			//获取该权限因子类型信息
			Hashtable hashtable = new Hashtable();
			hashtable.put("factorTypeId", (Object) factorTypeId);
			hashtable.put("ServletContext", sc);
			Hashtable retHashtable = (Hashtable) business.invoke("baf_factorTypeBI", "getFactorTypeById", hashtable);
			DataRightFactorTypeVO factorTypeVO = (DataRightFactorTypeVO) retHashtable.get("getFactorTypeById");
			hashtable.put("factorTypeId",factorTypeId);
			hashtable = (Hashtable) business.invoke("baf_dataRightFactorBI","getRightFactorByTypeId", hashtable);
			List rlist = null;			
			if (factorTypeVO == null) {
				buf.append("</tree>\n");				
				return;
			}else{
				if(hashtable!=null){
					rlist = (List)hashtable.get("getRightFactorByTypeId");				
					if(rlist!=null && rlist.size()>0){
						buf = new StringBuffer();
						buf.append("<?xml version='1.0' encoding='GBK'?>\n");
						buf.append("<tree id=\""+factorTypeId+"\">\n");
						for(int j=0;j<rlist.size();j++){
							DataRightFactorVO rvo = (DataRightFactorVO)rlist.get(j);
							buf.append("<item text=\""+rvo.getRightFactorName()+"\" id=\""+rvo.getRightFactorId()+"\" child=\"0\"");
							buf.append(" im0 =\"book.gif\" im1 =\"book.gif\" im2=\"book.gif\" ");
							buf.append(" tooltip=\""+rvo.getRightFactorName()+"\" >\n");
							buf.append("<userdata name=\"type\">R</userdata>\n");
							buf.append("<userdata name=\"isLeaf\">Y</userdata>\n");
							buf.append("<userdata name=\"url\"></userdata>\n");
							buf.append("<userdata name=\"linktarget\"></userdata>\n");
							buf.append("<userdata name=\"domainname\"></userdata>\n");
							buf.append("<userdata name=\"applicationCode\"></userdata>\n</item>\n");					
						}
						buf.append("</tree>\n");
						return;
					}
				}
			}
		}
		
		Hashtable hash = new Hashtable();
		hash.put("parentFactorTypeId", (Object)factorTypeId);
		//加入权限控制，目前没有userId，暂时空着
		String userId = "";
		hash.put("userId",userId);
		hash.put("ServletContext", sc);
		hash = (Hashtable) business.invoke("baf_factorTypeBI","getChildren", hash);
		List list = null;
		if(hash!=null){
			list = (List) hash.get("getChildren");		
			if(list!=null && list.size()>0){
				for (int i = 0; i < list.size(); i++) {
					DataRightFactorTypeVO vo = (DataRightFactorTypeVO) list.get(i);
					k++;
					String isLeaf = vo.getIsLeaf();			
					if("N".equalsIgnoreCase(isLeaf)){
						//不是叶子节点
						child = "1";
					}else{
						//是叶子节点	，下面没有权限因子			
						if("L".equalsIgnoreCase(isLeaf)){
							child = "0";
							isLeaf = "Y";
						}else if("Y".equalsIgnoreCase(isLeaf)){
							//纯叶子节点，下面有权限因子
							child = "1";					
						}
					}
									
					buf.append("<item text=\""+vo.getFactorTypeName()+"\" id=\""+vo.getFactorTypeId()+"\" child=\""+child+"\"");			
					if (factorTypeId.equalsIgnoreCase("")){
						if(k == 1){
							buf.append(open);
						}else{
							buf.append(" open=\"true\" ");
						}
					}
					buf.append(" im0 =\"books_close.gif\" im1 =\"books_close.gif\" im2=\"books_close.gif\" ");
					buf.append(" tooltip=\""+vo.getFactorTypeName()+"\" >\n");
					
					buf.append("<userdata name=\"type\">T</userdata>\n");
					buf.append("<userdata name=\"isLeaf\">"+isLeaf+"</userdata>\n");
					buf.append("<userdata name=\"url\"></userdata>\n");
					buf.append("<userdata name=\"linktarget\"></userdata>\n");
					buf.append("<userdata name=\"domainname\"></userdata>\n");
					buf.append("<userdata name=\"applicationCode\"></userdata>\n</item>\n");
				}
			}
		}
		if ((list == null ||  list.size() == 0 ) && factorTypeId.equals("")){
		    buf.append("<item text=\"右键点击这里添加数据\" id=\"null\" call=\"1\" />");	 
		 }
		buf.append("</tree>\n");		
	} catch (Exception e) {
		e.printStackTrace();
	} finally{
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
