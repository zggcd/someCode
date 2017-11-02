package org.apache.jsp.baf.jsp.org.profilePost;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.framework.common.IBusiness;
import com.regaltec.baf.org.organization.common.valueobj.OrgTreeVO;
import com.regaltec.baf.org.user.common.valueobj.UserVO;
import com.regaltec.common.util.Constant;
import com.regaltec.baf.org.user.ui.control.UserLoginBean;
import com.regaltec.baf.org.organization.common.valueobj.OrganizationVO;

public final class profilePostTree_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	//根据id查询下级组
	String objectId = request.getParameter("id");
	if (objectId == null || objectId.equals("0"))
		objectId = "";
	
	PrintWriter printOut = response.getWriter();
	StringBuilder builder = new StringBuilder();
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
		
		//获取当前登录用户对象
		UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
		UserVO userVO = null;
		if(loginBean!=null){
			userVO = loginBean.getCurrentUser();
		}
		Hashtable hashtable = new Hashtable();
		Hashtable param = new Hashtable();
		if(userVO!=null){
			hashtable.put("user", userVO);
			param.put("orgIds",userVO.getUnitIds());
			param.put("userId",userVO.getUserId());
		}
		
		//获取已经勾选了共享岗位
		param.put("ServletContext",sc);
		Hashtable selectIds = new Hashtable();
		Hashtable selHashtable = (Hashtable) business.invoke("baf_organizationBI", "selectProfilePostByUserId", param);
		if(null!=selHashtable){
			List<String> selList=(List<String>)selHashtable.get("selectProfilePostByUserId");
			if(selList!=null&&selList.size()>0){
				for(int i=0;i<selList.size();i++){
					selectIds.put(selList.get(i),selList.get(i));
				}
			}
		}
		List<OrganizationVO>listFirst=null;
		if("".equals(objectId)){//第一层树
			
			param.put("currentThread", Thread.currentThread().getName());
			//param.put("rightFactorCode", Constant.RIGHTFACTOR_CODE_ORG);			
			Hashtable orgHashtable = (Hashtable) business.invoke("baf_organizationBI", "selectOrgByUnitIds", param);
			if(null!=orgHashtable){
				listFirst=(List<OrganizationVO>)orgHashtable.get("selectOrgByUnitIds");
			}
			
			builder.append("<?xml version='1.0' encoding='GBK'?>\n");
			builder.append("<tree id=\"");
		   	builder.append("0");
			builder.append("\">\n");
			if (listFirst != null){
				int k = 0;
			    for (int i=0;i<listFirst.size();i++) {
			    	OrganizationVO vo = (OrganizationVO)listFirst.get(i);
			    	k++;
				 	builder.append("<item text=\"");
					builder.append(vo.getOrgname());
					builder.append("\" id=\"");
					builder.append(vo.getOrgid());
					builder.append("\" ");
					if("O".equalsIgnoreCase(vo.getObjectcategory()))
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
					builder.append(" child = \"1\" ");
					if(k==1 && objectId.equals("")){
					   builder.append(" select = \"1\" ");
					   builder.append(" call = \"1\" ");
					   builder.append(" open = \"1\" "); 
					}
					builder.append(" nocheckbox = \"1\" ");
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
					
					builder.append("<userdata name=\"objectTypeId\">");
					builder.append("<![CDATA[");
					builder.append(vo.getObjecttypeid());
					builder.append("]]>");
					builder.append("</userdata>\n");
					
					builder.append("</item>\n");
				}
			}
		}else{//第二层树
			
			hashtable.put("orgid", objectId);
			hashtable.put("rightFactorCode", Constant.RIGHTFACTOR_CODE_ORG);
			hashtable.put("currentThread", Thread.currentThread().getName());
			hashtable.put("ServletContext",sc);
			Hashtable retHashtable = (Hashtable) business.invoke("baf_organizationBI", "selectNextObject", hashtable);
			List orgTreeList = null;
			builder.append("<?xml version='1.0' encoding='GBK'?>\n");
			builder.append("<tree id=\"");
			builder.append(objectId);
			builder.append("\">\n");
			if (retHashtable != null){
				orgTreeList = (List) retHashtable.get("selectNextObject");
				if (orgTreeList != null){
					int k = 0;
			    	for (int i=0;i<orgTreeList.size();i++) {
			    		OrgTreeVO vo = (OrgTreeVO)orgTreeList.get(i);
			    		//如果不是班组就不显示，继续往下检查
			    		if(!"10".equals(vo.getObjecttypeid()))continue;
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
					    builder.append(" child = \"0\" ");
						//if( "2".equalsIgnoreCase(vo.getObjecttypeid())|| "1".equalsIgnoreCase(vo.getObjecttypeid()) ){
						if(k==1 && objectId.equals("")){
					   		builder.append(" select = \"1\" ");
					   		builder.append(" call = \"1\" ");
					   		builder.append(" open = \"1\" "); 
						}
						if(selectIds.containsKey(vo.getObjectid())){
							builder.append(" checked = \"1\" ");		
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
					
						builder.append("<userdata name=\"objectTypeId\">");
						builder.append("<![CDATA[");
						builder.append(vo.getObjecttypeid());
						builder.append("]]>");
						builder.append("</userdata>\n");
					
						builder.append("<userdata name=\"isLeaf\">");
						builder.append("<![CDATA[");
						builder.append(vo.getIsleaf());
						builder.append("]]>");
						builder.append("</userdata>\n");
					
						builder.append("</item>\n");
					}	
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