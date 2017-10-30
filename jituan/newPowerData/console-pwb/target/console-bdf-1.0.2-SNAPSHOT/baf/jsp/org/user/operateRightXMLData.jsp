<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.framework.bp.BusinessDelegateImpl"%>
<%@ page import="com.regaltec.baf.org.organization.common.valueobj.OrgTreeVO"%>
<%@page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@ page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%@page import="com.regaltec.baf.rig.right.common.valueobj.OperateRightVO"%>
<%@page import="com.regaltec.common.util.Constant"%>
<%@page import="com.regaltec.baf.rig.authorize.common.valueobj.OperateAuthorizeVO"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	
	String objectId = request.getParameter("id");	//��ǰչ���ڵ�ID
	String objectCheckState = request.getParameter("checkstate");   //��ǰչ���ڵ㸴ѡ��״̬
	
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
		//��ȡ��ǰ��¼�û�����
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
		
		//��ѯ�û���ӵ�еĲ���Ȩ�ޣ�����չ������Ȩ�����ڵ�ʱ�����жԸ��ڵ���жϣ������Ƿ����ӽڵ㶼ѡ��
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
		/*�����ѯ�ڵ����objectIdΪ��,����Ϊ��ѯ���Ķ���,��ʱxml��tree id����ӦΪ0,����ΪobjectId*/
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
					
					/*�ж��Ƿ�ΪҶ�ӽڵ�,���Ϊ��Ҷ�ӽ��������Ľڵ���ʾ��"+"�ŵ�ͼ��,������ʾ"-"ͼ��*/
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
%>

