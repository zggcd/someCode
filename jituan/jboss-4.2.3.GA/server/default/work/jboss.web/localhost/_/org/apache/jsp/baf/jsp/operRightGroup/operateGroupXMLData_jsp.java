package org.apache.jsp.baf.jsp.operRightGroup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.framework.common.IBusiness;
import com.regaltec.baf.rig.group.common.valueobj.OperateGroupVO;
import com.regaltec.baf.org.user.common.valueobj.UserVO;
import com.regaltec.baf.org.user.ui.control.UserLoginBean;
import com.regaltec.common.util.StringHelper;
import com.regaltec.common.util.Constant;

public final class operateGroupXMLData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	
	String groupId = request.getParameter("id");
	if (groupId == null || groupId.equals("0")){
		groupId = "";
	}
	String searchValue = request.getParameter("searchValue");
	if (searchValue == null) {
		searchValue = "";	
	}	
	
	PrintWriter printOut = response.getWriter();
	StringBuilder builder = new StringBuilder();
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
		
		//从session中获取当前登录用户对象
		UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
		UserVO userVO = null;
		if(loginBean!=null){
			userVO = loginBean.getCurrentUser();
		}
		
		Hashtable hashtable = new Hashtable();
		if(userVO!=null){
			hashtable.put("currentUser",userVO);
		}	
		hashtable.put("ServletContext", sc);	
		Hashtable retHashtable = (Hashtable) business.invoke("baf_operateGroupBI", "getAllOperateGroupByUser", hashtable);
		List rightList = null;
			
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id=\"");
		
		//如果rightId为空,则查询树的顶点，tree的id为0,否则为rightId
		if(groupId == null ||  "".equals(groupId)){
		   builder.append("0");
		}else{
		   builder.append(groupId);
		}
		
		builder.append("\">\n");
		
		//定义变量，记录树上是否生成了数据
		int k = 0;
		if (retHashtable != null){
			rightList = (List) retHashtable.get("getAllOperateGroupByUser");
			//获取系统参数中配置的“本地网权限组管理员”的ID
			String nativenetGroupId = StringHelper.convertStringNull(request.getParameter("nativenetGroupId"));			
			if (rightList != null){
			    for (int i=0;i<rightList.size();i++) {
			    	OperateGroupVO vo = (OperateGroupVO)rightList.get(i);
		    		String id = vo.getGroupId();
			    	String groupCode = StringHelper.convertStringNull(vo.getGroupCode());
			    	//任何人登陆进来“系统管理员”权限组都不显示
			    	if(groupCode.equals(Constant.GROUP_CODE_ADMIN) || nativenetGroupId.equals(id)){
					 		
			    	}else{
			    		//判断权限组名称是否与搜索字符串匹配！
			    		if (searchValue != null && !"".equals(searchValue)) {			    						    			
			    			if (vo.getGroupName().indexOf(searchValue) != -1) {
					    		builder.append("<item text=\"");
								builder.append(vo.getGroupName());
								builder.append("\" id=\"");
								builder.append(id);
								builder.append("\" ");				
								if(k == 0){
									builder.append(" call=\"1\" select=\"1\" ");
								}
								builder.append(" im0 =\"box.gif\" im1 =\"box.gif\" im2=\"box.gif\" ");
								builder.append(" child = \"0\" ");
								builder.append(" tooltip=\"");
								builder.append(vo.getGroupName());
								builder.append("\" >\n");
								
								builder.append("</item>\n");
					    		k++;
			    			}
			    		} else {
				    		builder.append("<item text=\"");
							builder.append(vo.getGroupName());
							builder.append("\" id=\"");
							builder.append(id);
							builder.append("\" ");				
							if(k == 0){
								builder.append(" call=\"1\" select=\"1\" ");
							}
							builder.append(" im0 =\"box.gif\" im1 =\"box.gif\" im2=\"box.gif\" ");
							builder.append(" child = \"0\" ");
							builder.append(" tooltip=\"");
							builder.append(vo.getGroupName());
							builder.append("\" >\n");
							
							builder.append("</item>\n");
				    		k++;	
			    		}
			    	}
				}					
		  	}
	 	}	
	 	if (k == 0){
	    	builder.append("<item text=\"右键点击这里添加数据\" id=\"null\" call=\"1\"/>");	 
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
