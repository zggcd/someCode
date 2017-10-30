<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.org.organization.common.valueobj.OrgTreeVO"%>
<%@ page import="com.regaltec.baf.profile.desktop.ui.control.DesktopCostomizeBean"%>
<%@page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%@page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@page import="com.regaltec.common.util.StringHelper"%>
<%
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
		/*�����ѯ�ڵ����parentObjectIdΪ��,����Ϊ��ѯ���Ķ���,��ʱxml��tree id����ӦΪ0,����ΪparentObjectId*/
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
			if(isAdmin.equals("Y")){	//��¼�û��Ƿ���ϵͳ����Ա�����ǹ���Ա���򽫸��û�������֯����
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
					
					/*�ж��Ƿ�ΪҶ�ӽڵ�,���Ϊ��Ҷ�ӽ��������Ľڵ���ʾ��"+"�ŵ�ͼ��,������ʾ"-"ͼ��*/
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
%>

