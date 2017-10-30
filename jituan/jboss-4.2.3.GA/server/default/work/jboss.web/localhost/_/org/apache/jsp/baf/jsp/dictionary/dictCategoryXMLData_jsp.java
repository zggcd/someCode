package org.apache.jsp.baf.jsp.dictionary;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.framework.common.IBusiness;
import com.regaltec.baf.org.user.ui.control.UserLoginBean;
import com.regaltec.baf.org.user.common.valueobj.UserVO;
import com.regaltec.baf.dict.category.common.valueobj.DictionaryCategoryVO;
import com.regaltec.common.util.Constant;

public final class dictCategoryXMLData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	String objectId = request.getParameter("id");	
	
	if (objectId == null || objectId.equals("0"))
		objectId = "";

	StringBuilder builder = new StringBuilder();
	PrintWriter outs = response.getWriter();
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
		
		Hashtable hashtable = new Hashtable();
		//获取当前登录用户对象
		UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
		UserVO userVO = null;
		if(loginBean!=null){
			userVO = loginBean.getCurrentUser();
		}
		if(userVO!=null){
			hashtable.put("user", userVO);
		}
		hashtable.put("rightFactorCode", Constant.RIGHTFACTOR_CODE_DICT);
		hashtable.put("parentDictCategoryId", objectId);
		hashtable.put("ServletContext", sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_dictCategoryBI", "getDictChildren", hashtable);
		List cateList = null;			
		
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id=\"");
		/*如果查询节点参数objectId为空,则认为查询树的顶点,此时xml的tree id属性应为0,否则为objectId*/
		if(objectId == null ||  "".equals(objectId)){
		   builder.append("0");
		}else{
		   builder.append(objectId);
		}
		builder.append("\">\n");
		if (retHashtable != null){
			cateList = (List) retHashtable.get("getDictChildren");
			if (cateList != null){
				int k=0;
			    for (int i = 0; i < cateList.size(); i++) {
			    	DictionaryCategoryVO vo = (DictionaryCategoryVO)cateList.get(i);
			    	k++;
			    	String cateId = vo.getDictionaryCategoryId();
			    	String cateName = vo.getDictionaryCategoryName();
			    	
				 	builder.append("<item text=\""+cateName+"\" id=\""+cateId+"\" ");			
				 	if(vo.getDictionaryCategoryLevel().equals("0")){
				 		builder.append(" im0 =\"person.gif\" im1 =\"person.gif\" im2=\"person.gif\" ");
				 	}else{
				 		builder.append(" im0 =\"iconClient.gif\" im1 =\"iconClient.gif\" im2=\"iconClient.gif\" ");
				 	}					
					
					if(k==1 && objectId.equals("")){
						builder.append(" select=\"1\" call=\"1\" open = \"1\" ");
					}
					
					/*判断是否为叶子节点,如果为非叶子节则在树的节点显示加"+"号的图标,否则显示"-"图标*/
					if( "Y".equalsIgnoreCase(vo.getIsLeaf()) ){
					    builder.append(" child = \"0\" ");
					}else{
					    builder.append(" child = \"1\" ");
					}					
					builder.append(" >\n");										
					builder.append("<userdata name=\"isLeaf\">"+vo.getIsLeaf()+"</userdata>\n");	
					builder.append("<userdata name=\"isExistDict\">"+vo.getIsExistDict()+"</userdata>\n");					
					builder.append("</item>\n");
				}	
		  	}
	 	}
	 	if ((cateList == null ||  cateList.size() == 0 ) && objectId.equals("")){
	    	builder.append("<item text=\"右键点击这里添加数据\" id=\"null\" call=\"1\"/>");	 
	 	}
	 	builder.append("</tree>\n");
	}catch (Exception e) {
		e.printStackTrace();
	}finally{
		outs.write(builder.toString());
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
