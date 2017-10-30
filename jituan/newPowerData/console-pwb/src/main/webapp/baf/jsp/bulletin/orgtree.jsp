<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.org.organization.common.valueobj.OrgTreeVO"%>
<%@ page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%@ page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String businessId = request.getParameter("businessid");
	String objectId = request.getParameter("id");
		//获取用户数据
	UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
	UserVO userVO = null;
	if(loginBean!=null){
		userVO = loginBean.getCurrentUser();
	}
	if (businessId == null)
		businessId = "";
	if (objectId == null || objectId.equals("0"))
		objectId = "";
	
	PrintWriter printOut = response.getWriter();
	StringBuilder builder = new StringBuilder();
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");

		Hashtable hashtable = new Hashtable();
		hashtable.put("parentId", objectId); //父对象ID		
		hashtable.put("rightFactorCode", "IDR_PUB_BULLETIN_UNIT"); //组织颗粒度类型（有四类颗粒度：O只查单位、OP查单位和岗位、OE查单位及人员、OPE查所有）
		hashtable.put("currentThread", Thread.currentThread().getName());
		hashtable.put("userId",userVO.getUserId());
		hashtable.put("loginName",userVO.getLoginName());
		hashtable.put("ServletContext", sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_bulletinBI", "getReceiverOrgWithRight", hashtable);
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
			orgTreeList = (List) retHashtable.get("getReceiverOrgWithRight");
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

					builder.append(" >\n");
						
					builder.append("<userdata name=\"objectid\">");
					builder.append("<![CDATA[");
					builder.append(vo.getObjectid());
					builder.append("]]>");
					builder.append("</userdata>\n");
												
					builder.append("<userdata name=\"objectCategory\">");
					builder.append("<![CDATA[");
					builder.append(vo.getObjectcategory());
					builder.append("]]>");
					builder.append("</userdata>\n");
					
					builder.append("<userdata name=\"objName\">");
					builder.append("<![CDATA[");
					builder.append(vo.getObjectname());
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
%>

