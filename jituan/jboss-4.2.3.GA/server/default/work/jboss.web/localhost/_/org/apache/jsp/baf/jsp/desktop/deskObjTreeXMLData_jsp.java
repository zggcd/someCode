package org.apache.jsp.baf.jsp.desktop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.framework.common.IBusiness;
import com.regaltec.baf.org.organization.common.valueobj.OrgTreeVO;
import com.regaltec.baf.profile.desktop.ui.control.DesktopCostomizeBean;
import com.regaltec.baf.org.user.ui.control.UserLoginBean;
import com.regaltec.baf.org.user.common.valueobj.UserVO;
import com.regaltec.common.util.StringHelper;

public final class deskObjTreeXMLData_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String parentObjectId = request.getParameter("id");
	String lastSelectedId = request.getParameter("lastSelectedId");
	if(lastSelectedId == null){
		lastSelectedId = "";   
	}
	if (parentObjectId == null || parentObjectId.equals("0"))
		parentObjectId = "";
	
	PrintWriter printOut = response.getWriter();
	StringBuilder builder = new StringBuilder();
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
		Hashtable hashtable = new Hashtable();
		hashtable.put("parentObjectId", parentObjectId);
		hashtable.put("objectType",DesktopCostomizeBean.showLevel);
		hashtable.put("currentThread", Thread.currentThread().getName());
		hashtable.put("ServletContext", sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_organizationBI", "selectChildObject", hashtable);
		List orgTreeList = null;
			
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id=\"");
		/*如果查询节点参数parentObjectId为空,则认为查询树的顶点,此时xml的tree id属性应为0,否则为parentObjectId*/
		if(parentObjectId == null ||  "".equals(parentObjectId)){
		   builder.append("0");
		}
		else{
		   builder.append(parentObjectId);
		}
		builder.append("\">\n");
		UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
		UserVO userVO = null;
		if(loginBean!=null){
			userVO = loginBean.getCurrentUser();
		}
		String parentId = "";
		if(userVO!=null){
			String isAdmin = StringHelper.convertStringNull(userVO.getIsAdmin());
			if(isAdmin.equals("Y")){	//登录用户是否是系统管理员，若是管理员，则将该用户挂在组织树上
				String unitId = StringHelper.convertStringNull(userVO.getUnitId());
				String postId = StringHelper.convertStringNull(userVO.getPostid());
				String xmlstr = "<item text=\""+userVO.getUserName()+"\" id=\""+userVO.getUserId()+"\" ";
				xmlstr = xmlstr + " im0 =\"person.gif\" im1 =\"person.gif\" im2=\"person.gif\" child = \"0\" ";
				if(!lastSelectedId.equals("") && lastSelectedId.equals(userVO.getUserId())){
			    	xmlstr = xmlstr + " select = \"1\" >\n";
			    }
				xmlstr = xmlstr + "><userdata name=\"objectTypeID\"><![CDATA["+userVO.getUserId()+"]]></userdata>\n";
				xmlstr = xmlstr + "<userdata name=\"objectCategory\"><![CDATA["+userVO.getObjectCategory()+"]]></userdata>\n";
				xmlstr = xmlstr + "</item>\n";
				if(postId.equals("")){
					if(unitId.equals(parentObjectId)){
						builder.append(xmlstr);						
					}
					parentId = unitId;
				}else{
					if(postId.equals(parentObjectId)){
						builder.append(xmlstr);
					}
					parentId = postId;
				}
			}
		}
		if (retHashtable != null){
			orgTreeList = (List) retHashtable.get("selectChildObject");
			if (orgTreeList != null){
				int k = 0;
			    for (int i = 0; i < orgTreeList.size(); i++) {
			    	OrgTreeVO vo = (OrgTreeVO)orgTreeList.get(i);
			    	k++;
				 	builder.append("<item text=\"");
					builder.append(vo.getObjectname());
					builder.append("\" id=\"");
					builder.append(vo.getObjectid());
					builder.append("\" ");
					if(  "O".equalsIgnoreCase(vo.getObjectcategory()))
					{
					   builder.append(" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" ");
					}
					else if(  "P".equalsIgnoreCase(vo.getObjectcategory()))
					{
					   builder.append(" im0 =\"position.gif\" im1 =\"position.gif\" im2=\"position.gif\" ");
					}
					else if( "E".equalsIgnoreCase(vo.getObjectcategory()))
					{
					    builder.append(" im0 =\"person.gif\" im1 =\"person.gif\" im2=\"person.gif\" ");
					}
					
					/*判断是否为叶子节点,如果为非叶子节则在树的节点显示加"+"号的图标,否则显示"-"图标*/
					if( "Y".equalsIgnoreCase(vo.getIsleaf()))
					{
						if(vo.getObjectid().equals(parentId)){
							builder.append(" child = \"1\" ");
						}else{
					    	builder.append(" child = \"0\" ");
						}
					}else{
						builder.append(" child = \"1\" ");
					}
					if(k==1 && parentObjectId.equals("")){
					   	builder.append(" open = \"1\" "); 
					}else{
						if(!lastSelectedId.equals("") && lastSelectedId.equals(vo.getObjectid())){
					    	builder.append(" select = \"1\" ");
					    }
					}
					
					builder.append(" >\n");
						
					builder.append("<userdata name=\"objectTypeID\">");
					builder.append("<![CDATA[");
					builder.append(vo.getObjecttypeid());
					builder.append("]]>");
					builder.append("</userdata>\n");
												
					builder.append("<userdata name=\"objectCategory\">");
					builder.append("<![CDATA[");
					builder.append(vo.getObjectcategory());
					builder.append("]]>");
					builder.append("</userdata>\n");
						
					builder.append("</item>\n");
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
