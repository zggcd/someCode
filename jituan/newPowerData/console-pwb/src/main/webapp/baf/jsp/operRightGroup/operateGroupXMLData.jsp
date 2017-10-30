<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@page import="com.regaltec.baf.rig.group.common.valueobj.OperateGroupVO"%>
<%@page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@ page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%@page import="com.regaltec.common.util.StringHelper"%>
<%@page import="com.regaltec.common.util.Constant"%>
<%
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
		
		//��session�л�ȡ��ǰ��¼�û�����
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
		
		//���rightIdΪ��,���ѯ���Ķ��㣬tree��idΪ0,����ΪrightId
		if(groupId == null ||  "".equals(groupId)){
		   builder.append("0");
		}else{
		   builder.append(groupId);
		}
		
		builder.append("\">\n");
		
		//�����������¼�����Ƿ�����������
		int k = 0;
		if (retHashtable != null){
			rightList = (List) retHashtable.get("getAllOperateGroupByUser");
			//��ȡϵͳ���������õġ�������Ȩ�������Ա����ID
			String nativenetGroupId = StringHelper.convertStringNull(request.getParameter("nativenetGroupId"));			
			if (rightList != null){
			    for (int i=0;i<rightList.size();i++) {
			    	OperateGroupVO vo = (OperateGroupVO)rightList.get(i);
		    		String id = vo.getGroupId();
			    	String groupCode = StringHelper.convertStringNull(vo.getGroupCode());
			    	//�κ��˵�½������ϵͳ����Ա��Ȩ���鶼����ʾ
			    	if(groupCode.equals(Constant.GROUP_CODE_ADMIN) || nativenetGroupId.equals(id)){
					 		
			    	}else{
			    		//�ж�Ȩ���������Ƿ��������ַ���ƥ�䣡
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
	    	builder.append("<item text=\"�Ҽ���������������\" id=\"null\" call=\"1\"/>");	 
	 	}
	 	builder.append("</tree>\n");
	}catch (Exception e) {
		e.printStackTrace();
	}finally{
		printOut.write(builder.toString());
		printOut.close();
	}
%>

