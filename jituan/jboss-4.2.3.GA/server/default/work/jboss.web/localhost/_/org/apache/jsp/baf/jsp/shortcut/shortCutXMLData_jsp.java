package org.apache.jsp.baf.jsp.shortcut;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.framework.common.IBusiness;
import com.regaltec.baf.module.common.valueobj.ModuleVO;
import com.regaltec.baf.org.user.common.valueobj.UserVO;
import com.regaltec.baf.org.user.ui.control.UserLoginBean;

public final class shortCutXMLData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	String moduleId = request.getParameter("id");
	if (moduleId == null || moduleId.equals("0")){
		moduleId = "";
	}
	
	PrintWriter outs = null;
	StringBuilder buf = null;
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
		
		outs = response.getWriter();
		buf = new StringBuilder();
		buf.append("<?xml version='1.0' encoding='GBK'?>\n");
		if (!moduleId.equalsIgnoreCase("")) {
			buf.append("<tree id=\""+moduleId+"\">\n");
		} else {
			buf.append("<tree id=\"0\">\n");
		}
		String child = "";
		String open = " open=\"true\" call=\"1\" select=\"1\" ";
		int k = 0;		

		Hashtable hash = new Hashtable();
		hash.put("parentModuleId", moduleId);
		//加入权限控制，目前没有userId，暂时空着
		UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
		UserVO userVO = null;
		if(loginBean!=null){
			userVO = loginBean.getCurrentUser();
		}
		if(userVO != null){
			hash.put("user",userVO);
		}		
		hash.put("ServletContext", sc);
		hash = (Hashtable) business.invoke("baf_shortCutBI","getChildShortCutByUser", hash);
		List list = null;
		if(hash!=null){
			list = (List) hash.get("getChildShortCutByUser");
		}
		
		//用户已经配置的快捷方式的treecode集合，用于做比对，勾中复选框
		String treeCodes = request.getParameter("treeCodes");
		Hashtable hashtable = new Hashtable();
		if(treeCodes!=null){
			String[] strs = treeCodes.split("$");
			for(int i=0;i<strs.length;i++){
				String s = strs[i];
				if(!s.equals("")){
					hashtable.put(s,s);
				}
			}
		}		
		if(list!=null && list.size()>0){
			for (int i = 0; i < list.size(); i++) {
				ModuleVO vo = (ModuleVO) list.get(i);
				k++;
				//判断是否显示在导航树中，不显示在导航树中的模块，在快捷功能配置树种也不显示
				if("N".equalsIgnoreCase(vo.getIsShowedInNav())){
					continue;
				}				
				String isLeaf = vo.getIsLeaf();
				if ("Y".equalsIgnoreCase(isLeaf)) {//如果是叶子节点					
					child = "0";
				} else {//不是叶子节点					
					child = "1";
				}						
				buf.append("<item text=\""+vo.getModuleName()+"\" id=\""+vo.getModuleId()+"\" child=\""+child+"\"");			
				if (k == 1 && moduleId.equalsIgnoreCase("")){
					//buf.append(open);
				}
				if(treeCodes.indexOf("$"+vo.getTreeCode())!=-1){					
					buf.append(" checked = \"1\" ");
				}		
				if("Y".equals(vo.getIsLeaf())){
					buf.append(" im0 =\"box.gif\" im1 =\"box.gif\" im2=\"box.gif\" ");
				}else{
					buf.append(" im0 =\"book.gif\" im1 =\"book.gif\" im2=\"book.gif\" ");
				}
				buf.append(" tooltip=\""+vo.getModuleName()+"\" >\n");
				buf.append("<userdata name=\"isLeaf\">"+vo.getIsLeaf()+"</userdata>\n");
				buf.append("<userdata name=\"treeCode\">"+vo.getTreeCode()+"</userdata>\n");
				buf.append("<userdata name=\"isSelect\">"+vo.getIsSelect()+"</userdata>\n</item>\n");
			}
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
