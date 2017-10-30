package org.apache.jsp.baf.jsp.org.unit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.framework.common.IBusiness;
import com.regaltec.baf.rig.right.common.valueobj.OperateRightVO;
import com.regaltec.baf.rig.group.common.valueobj.OperateGroupVO;
import com.regaltec.baf.org.user.common.valueobj.UserVO;
import com.regaltec.baf.org.user.ui.control.UserLoginBean;
import com.regaltec.baf.rig.authorize.common.valueobj.OperateAuthorizeVO;
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
      out.write("\r\n");
      out.write("\r\n");

	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	
	String objectId = request.getParameter("id");	
	if (objectId == null || objectId.equals("0")){
		objectId = "";
	}		
	String unitId = "";
	if(request.getParameter("unitId")!=null){
		unitId = request.getParameter("unitId");
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
		String groupId = "";   //权限组ID
		if(!objectId.equals("") && objectId.indexOf("#")==-1){
			groupId = objectId;
		}else{
			if(!objectId.equals("")){
				String[] temp = objectId.split("#");
				hashtable.put("parentRightId", temp[0]);
				groupId = temp[1];
			}			
		}
		hashtable.put("groupId", groupId);		
		if(userVO!=null){
			hashtable.put("currentUser",userVO);
		}	
		OperateAuthorizeVO operateAuthorize = new OperateAuthorizeVO();
		if( unitId != null) {
			operateAuthorize.setObjectId(unitId);
	    }
		operateAuthorize.setObjectCategory(Constant.CATEGORY_O);
		hashtable.put("currentThread", Thread.currentThread().getName());
		hashtable.put("operateAuthorize", operateAuthorize);
		hashtable.put("ServletContext", sc);
		String beanMethod = "";
		String beanId = "";
		if(request.getParameter("groupId")==null){
			beanId = "baf_operateGroupBI";
			beanMethod = "getAllOperateGroupByUser";
		}else{
			beanId = "baf_operateRightBI";
			beanMethod = "getChildrenByGroupId";
			hashtable.put("isLeaf","Y");
		}
		Hashtable retHashtable = (Hashtable) business.invoke(beanId, beanMethod, hashtable);
		List rightList = null;
		List groupList = null;
		Hashtable selectIds = new Hashtable();
		if(request.getParameter("groupId")==null){
			Hashtable table = (Hashtable) business.invoke("baf_operateGroupBI", "getObjAuthOperateGroup", hashtable);
			List listY = null;
			if(table!=null){
				listY = (List)table.get("getObjAuthOperateGroup");
			}
			if(listY!=null && listY.size()>0){
				for(int i=0;i<listY.size();i++){
					OperateGroupVO vo = (OperateGroupVO)listY.get(i);
					selectIds.put(vo.getGroupId(),vo.getGroupId());
				}
			}
		}
			
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id=\"");
		
		//如果rightId为空,则查询树的顶点，tree的id为0,否则为rightId
		if(objectId == null ||  "".equals(objectId)){
		   	builder.append("0");
		}else{
			builder.append(objectId);
		}		
		builder.append("\">\n");		
		if (retHashtable != null){
			//获取系统参数中配置的“本地网权限组管理员”的ID
			String nativenetGroupId = StringHelper.convertStringNull(request.getParameter("nativenetGroupId"));
			if(request.getParameter("groupId")==null){		
				groupList = (List) retHashtable.get(beanMethod);					
				if (groupList != null){
				    for (int i=0;i<groupList.size();i++) {
				    	OperateGroupVO vo = (OperateGroupVO)groupList.get(i);
			    		String id = vo.getGroupId();
				    	String groupCode = StringHelper.convertStringNull(vo.getGroupCode());
				    	if(groupCode.equals(Constant.GROUP_CODE_ADMIN) || nativenetGroupId.equals(id)){
				    		
				    	}else{
						 	builder.append("<item text=\"");
							builder.append(vo.getGroupName());
							builder.append("\" id=\"");
							builder.append(id);
							builder.append("\" ");				
							if(i==0){
								//builder.append(" open=\"1\" call=\"1\" select=\"1\" ");
							}
							if(selectIds.containsKey(id)){
								builder.append(" checked = \"1\" ");		
							}
							builder.append(" im0 =\"box.gif\" im1 =\"box.gif\" im2=\"box.gif\" ");
							String isLeaf = StringHelper.convertStringNull(vo.getIsLeaf());
							if(isLeaf.equals("N") && !vo.getGroupCode().equals(Constant.GROUP_CODE_ADMIN)){
								builder.append(" child = \"1\" ");
							}						
							builder.append(" tooltip=\"");
							builder.append(vo.getGroupName());
							builder.append("\" >\n");						
							builder.append("</item>\n");	
				    	}
					}					
			  	}
			}else{
				rightList = (List) retHashtable.get(beanMethod);			
				if (rightList != null){
				    for (int i=0;i<rightList.size();i++) {
				    	OperateRightVO vo = (OperateRightVO)rightList.get(i);
				    	String id = vo.getRightId();
					 	builder.append("<item text=\"");
						builder.append(vo.getRightName());
						builder.append("\" id=\"");
						builder.append(id);
						builder.append("#"+groupId);		
						builder.append("\" im0 =\"book_titel.gif\" im1 =\"book_titel.gif\" im2=\"book_titel.gif\" ");
						String isLeaf = StringHelper.convertStringNull(vo.getIsLeaf());
						if(isLeaf.equals("N")){
							builder.append(" child = \"1\" ");
						}
						builder.append(" tooltip=\"");
						builder.append(vo.getRightName());
						builder.append("\" nocheckbox = \"1\" ");
						builder.append(">\n");
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
