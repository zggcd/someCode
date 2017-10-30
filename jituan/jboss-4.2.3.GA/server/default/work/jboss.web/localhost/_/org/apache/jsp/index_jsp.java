package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.framework.common.IBusiness;
import com.regaltec.baf.framework.bp.BusinessDelegateImpl;
import com.regaltec.baf.module.common.valueobj.ModuleVO;
import com.regaltec.baf.module.common.valueobj.ElementVO;
import com.regaltec.baf.org.user.common.valueobj.UserVO;
import com.regaltec.baf.org.user.ui.control.UserLoginBean;
import com.regaltec.common.util.StringHelper;
import com.regaltec.baf.dict.dictionary.common.valueobj.DictionaryItemVO;
import com.regaltec.baf.dict.dictionary.bo.IDictionaryItemBO;
import com.regaltec.baf.taskmanage.common.SpringUtil;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

   	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String urlPath="";
	try {
	 IDictionaryItemBO dicBO = SpringUtil.getBean("baf_dictionaryItemBO",
				IDictionaryItemBO.class);
		String isSHLogin="";
		DictionaryItemVO vo = dicBO.getItemByDictCodeAndItemCode("IDD_SYS", "SYS_SSO_SWITCH");
			if (vo != null) {
				String itemValue = vo.getItemValue();
				if (itemValue != null && !"".equals(itemValue)) {
					isSHLogin=itemValue;
				}
			}
			String SHurl="";
		DictionaryItemVO vo1 = dicBO.getItemByDictCodeAndItemCode("IDD_SYS", "SYS_SHURL");
			if (vo1 != null) {
				String itemValue1 = vo1.getItemValue();
				if (itemValue1 != null && !"".equals(itemValue1)) {
					SHurl=itemValue1;
				}
			}
        String customUrl="";	
        DictionaryItemVO vo2 = dicBO.getItemByDictCodeAndItemCode("IDD_SYS", "SYS_CUSTOM_LOGIN_URL");
			if (vo2 != null) {
				String itemValue2 = vo2.getItemValue();
				if (itemValue2 != null && !"".equals(itemValue2)) {
					customUrl=itemValue2;
				}
			}
		if("Y".equals(isSHLogin)){
 	       urlPath=SHurl;
 	     }else{
 	        if("".equals(customUrl)||"Y".equals(customUrl)){
 	            urlPath ="baf/jsp/uiframe/login.xhtml";
 	        }else{
 	            urlPath=request.getContextPath()+customUrl;
 	        }
 	       
 	     }
	} catch (Exception e) {
		e.printStackTrace();
	}

      out.write("\r\n");
      out.write("<meta http-equiv=\"Refresh\" content=\"0;  url=");
      out.print(urlPath );
      out.write("\"> \r\n");
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
