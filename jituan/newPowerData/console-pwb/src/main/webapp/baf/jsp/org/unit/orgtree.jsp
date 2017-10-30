<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.org.organization.common.valueobj.OrgTreeVO"%>
<%@page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@page import="com.regaltec.common.util.Constant"%>
<%@page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
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
		hashtable.put("orgid", objectId);
		if(userVO!=null){
			hashtable.put("user", userVO);
		}		
		hashtable.put("rightFactorCode", Constant.RIGHTFACTOR_CODE_ORG);
		hashtable.put("currentThread", Thread.currentThread().getName());
		hashtable.put("ServletContext",sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_organizationBI", "selectNextObject", hashtable);
		List orgTreeList = null;
			
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id=\"");
		/*如果查询节点参数objectId为空,则认为查询树的顶点,此时xml的tree id属性应为0,否则为objectId*/
		if(objectId == null ||  "".equals(objectId)){
		   builder.append("0");
		}
		else{
		   builder.append(objectId);
		}
		builder.append("\">\n");
		if (retHashtable != null){
			orgTreeList = (List) retHashtable.get("selectNextObject");
			if (orgTreeList != null){
				int k = 0;
			    for (int i=0;i<orgTreeList.size();i++) {
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
					if( "Y".equalsIgnoreCase(vo.getIsleaf()) )
					{
					    builder.append(" child = \"0\" ");
					}else{
					    builder.append(" child = \"1\" ");
					}
					//if( "2".equalsIgnoreCase(vo.getObjecttypeid())|| "1".equalsIgnoreCase(vo.getObjecttypeid()) ){
					if(k==1 && objectId.equals("")){
					   builder.append(" select = \"1\" ");
					   builder.append(" call = \"1\" ");
					   builder.append(" open = \"1\" "); 
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

	 	if ((orgTreeList == null ||  orgTreeList.size() == 0 ) && (objectId == null || objectId.equalsIgnoreCase("") ) ){
	    	builder.append("<item text=\"点击这里添加数据\" id=\"null\" />");
	 	}
	 	builder.append("</tree>\n");
	}catch (Exception e) {
		e.printStackTrace();
	}finally{
		printOut.write(builder.toString());
		printOut.close();
	}
%>

