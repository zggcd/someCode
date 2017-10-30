package org.apache.jsp.baf.jsp.org.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.framework.common.IBusiness;
import com.regaltec.baf.framework.bp.BusinessDelegateImpl;
import com.regaltec.baf.org.organization.common.valueobj.OrgTreeVO;
import com.regaltec.baf.org.user.common.valueobj.UserVO;
import com.regaltec.baf.org.user.ui.control.UserLoginBean;
import com.regaltec.baf.rig.right.common.valueobj.OperateRightVO;
import com.regaltec.common.util.Constant;
import com.regaltec.baf.rig.authorize.common.valueobj.OperateAuthorizeVO;

public final class operateRightXMLData_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	
	String objectId = request.getParameter("id");	//当前展开节点ID
	String objectCheckState = request.getParameter("checkstate");   //当前展开节点复选框状态
	
	String userID = "";
	if(request.getParameter("userID")!=null){
		userID = request.getParameter("userID");
		session.removeAttribute("userID");
	}else{
		userID = session.getAttribute("userID").toString();
	}	
	session.setAttribute("userID",userID);
	
	StringBuilder builder = null;
	PrintWriter printOut = response.getWriter();
	
	if (objectId == null || objectId.equals("0"))
		objectId = "";
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
		hashtable.put("objectId", userID);
		hashtable.put("parentRightId", objectId);	
		hashtable.put("objectCategory","E");
		hashtable.put("currentThread", Thread.currentThread().getName());
		hashtable.put("ServletContext", sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_operateRightBI", "getChildrenByUser", hashtable);
		List rightTreeList = null;			
		
		//查询用户所拥有的操作权限，用于展开操作权限树节点时来进行对父节点的判断，决定是否让子节点都选中
		Hashtable hash = new Hashtable();
		hash.put("currentThread", Thread.currentThread().getName());
		hash.put("objectId", userID);
		hash.put("objectCategory", Constant.CATEGORY_E);
		hash.put("rightObjectType", Constant.OPERATE_R);
		hash.put("ServletContext", sc);
		Hashtable operHahstable = (Hashtable) business.invoke("baf_operateAuthorizeBI", "getOperateAuthorizeByObjId", hash);
		List operList = (List)operHahstable.get("getOperateAuthorizeByObjId");
		Hashtable operIdHash = new Hashtable();
		if(operList!=null){
			for(int i=0;i<operList.size();i++){
				OperateAuthorizeVO vo = (OperateAuthorizeVO)operList.get(i);
				operIdHash.put(vo.getRightObjectId(),vo.getRightObjectId());
			}
		}
		
		builder = new StringBuilder();
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
			rightTreeList = (List) retHashtable.get("getChildrenByUser");
			if (rightTreeList != null){
			    for (int i=0;i<rightTreeList.size();i++) {
			    	OperateRightVO vo = (OperateRightVO)rightTreeList.get(i);
			    	String rightId = vo.getRightId();
				 	builder.append("<item text=\""+vo.getRightName()+"\" id=\""+rightId+"\" ");					
					
					String rightType = vo.getRightType();
					if("M".equalsIgnoreCase(rightType)){
						builder.append(" im0 =\"book_titel.gif\" im1 =\"book_titel.gif\" im2=\"book_titel.gif\" ");
					}else if("E".equalsIgnoreCase(rightType)){
						builder.append(" im0 =\"book.gif\" im1 =\"book.gif\" im2=\"book.gif\" ");
					}else if("O".equalsIgnoreCase(rightType)){
						builder.append(" im0 =\"magazines_open.gif\" im1 =\"magazines_open.gif\" im2=\"magazines_open.gif\" ");
					}

					if(objectId.equals("")){
						if("Y".equals(vo.getIsSelect())){
							builder.append(" checked = \"1\" ");
						}
					}else{
						if(objectCheckState!=null && objectCheckState.equals("1")){
							if(operIdHash.containsKey(objectId)){
								if("Y".equals(vo.getIsSelect())){
									builder.append(" checked = \"1\" ");
								}
							}else{
								builder.append(" checked = \"1\" ");
							}
						}	
					}					
					
					/*判断是否为叶子节点,如果为非叶子节则在树的节点显示加"+"号的图标,否则显示"-"图标*/
					if( "Y".equalsIgnoreCase(vo.getIsLeaf()) ){
					    builder.append(" child = \"0\" ");
					}else{
					    builder.append(" child = \"1\" ");
					}					
					builder.append(" >\n");						
					builder.append("<userdata name=\"isLeaf\">"+vo.getIsLeaf()+"</userdata>\n");			
					builder.append("<userdata name=\"isSelect\">"+vo.getIsSelect()+"</userdata>\n");					
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
