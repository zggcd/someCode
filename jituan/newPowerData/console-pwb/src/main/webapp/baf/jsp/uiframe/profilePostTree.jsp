<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.org.organization.common.valueobj.OrgTreeVO"%>
<%@page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@page import="com.regaltec.common.util.Constant"%>
<%@page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%@page import="com.regaltec.baf.org.organization.common.valueobj.OrganizationVO"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	//����id��ѯ�¼���
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
		
		//��ȡ��ǰ��¼�û�����
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
		
		//��ȡ�Ѿ���ѡ�˹����λ
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
		if("".equals(objectId)){//��һ����
			
			param.put("currentThread", Thread.currentThread().getName());
			param.put("rightFactorCode", Constant.RIGHTFACTOR_CODE_ORG);			
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
		}else{//�ڶ�����
			
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
			    		//������ǰ���Ͳ���ʾ���������¼��
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
%>

