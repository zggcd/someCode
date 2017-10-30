<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%@ page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@ page import="com.regaltec.baf.rig.authorize.common.valueobj.DataRightVO"%>
<%@ page import="com.regaltec.baf.rig.authorize.common.valueobj.DataRightAuthorizeVO"%>
<%@page import="com.regaltec.common.util.StringHelper"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String objectID = request.getParameter("id");
	if (objectID == null || objectID.equals("0")){
		objectID = "";
	}
	
	String rightFactorID = request.getParameter("rightFactorID");
	String selectedDataRight = request.getParameter("selectedDataRight");
	String parentID = request.getParameter("parentID");
	String hasCheckboxFlag = (request.getParameter("hasCheckbox")!=null) ? request.getParameter("hasCheckbox") : "";
	String postID = request.getParameter("postID");
	String cancelDataRight = request.getParameter("cancelDataRight");
	//System.out.println("***********����Ȩ������ID=" + rightFactorID + " ���ڵ�ID=" + objectID + " ��ѡ�ڵ�ID=" + selectedDataRight + " ��ȡ���ڵ�ID=" + cancelDataRight + " ��ѡ�ڵ�ĸ��ڵ�ID=" + parentID + " ��λID=" + postID + " �Ƿ���CheckBox=" + hasCheckboxFlag);
	
	PrintWriter outs = null;
	StringBuilder builder = null;
	Hashtable selectedHashtable = null;
	Hashtable cancelHashtable = null;
	Hashtable parentHashtable = null;	
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
		
		//��������Ȩ������Ϊ����ֱ�ӷ��ء�
		if (rightFactorID == null || rightFactorID.equals("")) {
			builder = new StringBuilder();
			outs = response.getWriter();
			builder.append("<?xml version='1.0' encoding='GBK'?>\n");
			builder.append("<tree id=\"0\">\n");
			builder.append("</tree>\n");
		    outs.write(builder.toString());
		    outs.close();
		} else {			
			outs = response.getWriter();
			
			//����ѡ�е�Ȩ��ID
			if (selectedDataRight != null && !selectedDataRight.equals("")) {
				String[] selectedArray = selectedDataRight.split("\\,");
				selectedHashtable = new Hashtable();
				for (int i=0;i<selectedArray.length;i++) {
					String selectedID = selectedArray[i];
					selectedHashtable.put(selectedID, "");
				}
			}
			
			//����ԭ���Ѿ�ѡ�У�����ȡ������Ȩ��ID			
			if (cancelDataRight != null && !cancelDataRight.equals("")) {
				String[] cancelArray = cancelDataRight.split("\\,");
				cancelHashtable = new Hashtable();
				for (int i=0;i<cancelArray.length;i++) {
					String cancelID = cancelArray[i];
					cancelHashtable.put(cancelID, "");
				}
			}
			
			//����ѡ�е�Ȩ��ID �ĸ��ڵ㡣
			if (parentID != null && !parentID.equals("")) {
				String[] parentArray = parentID.split("\\,");
				parentHashtable = new Hashtable();
				for (int i=0;i<parentArray.length;i++) {
					String parent = parentArray[i];					
					parentHashtable.put(parent, "");
				}
			}
			
			//��ȡ�û�����
			UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
			UserVO userVO = null;
			if(loginBean!=null){
				userVO = loginBean.getCurrentUser();
			}
			Hashtable hashtable = new Hashtable();
			if(userVO!=null){
				hashtable.put("user", userVO);
			}
			hashtable.put("showCheckBox", hasCheckboxFlag);		
			hashtable.put("currentThread", Thread.currentThread().getName());
			DataRightAuthorizeVO dataRightAuth = new DataRightAuthorizeVO();
			dataRightAuth.setRightFactorId(rightFactorID);
			dataRightAuth.setObjectId(postID);
			dataRightAuth.setObjectCategory("P");
			dataRightAuth.setRightValue(objectID);
			hashtable.put("dataRightAuth",dataRightAuth);
			hashtable.put("ServletContext", sc);
			String authDataFlag = StringHelper.convertStringNull(request.getParameter("authDataFlag"));
			hashtable.put("authDataFlag",authDataFlag);
			Hashtable retHashtable = (Hashtable) business.invoke("baf_dataRightAuthorizeBI", "getDataRightAuthByUser", hashtable);
			List rightTreeList = null;			
			
			builder = new StringBuilder();
			builder.append("<?xml version='1.0' encoding='GBK'?>\n");
			builder.append("<tree id=\"");
			/*�����ѯ�ڵ����objectIdΪ��,����Ϊ��ѯ���Ķ���,��ʱxml��tree id����ӦΪ0,����ΪobjectId*/
			if(objectID == null ||  "".equals(objectID)){
			   builder.append("0");
			}else{
			   builder.append(objectID);
			}
			builder.append("\">\n");
			if (retHashtable != null){
				rightTreeList = (List) retHashtable.get("getDataRightAuthByUser");
				if (rightTreeList != null){
				    for (int i=0;i<rightTreeList.size();i++) {
				    	DataRightVO vo = (DataRightVO)rightTreeList.get(i);
					 	builder.append("<item text=\""+vo.getName()+"\" id=\""+vo.getId()+"\" ");					
						builder.append(" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" ");						
						
						if(selectedHashtable != null && selectedHashtable.containsKey(vo.getId())){		
							//������ѡ
							builder.append(" checked = \"1\" ");
						} else {
							//���������Ƿ��Ѿ���ѡ��
							//System.out.println("------------name:"+vo.getName() + " isSelect:" + vo.getIsSelect());
							if ("Y".equalsIgnoreCase(vo.getIsSelect())) {
								//���ж��Ƿ��Ѿ�ȡ��
								if (cancelHashtable != null && cancelHashtable.containsKey(vo.getId())) {
									//�Ѿ�ȡ��
									//System.out.println("------------name:"+vo.getName() + " �Ѿ���ȡ��" + " ID="+ vo.getId());
								} else {
									//û��ȡ��
									//System.out.println("------------name:"+vo.getName() + " û��ȡ��" + " ID="+ vo.getId());
									builder.append(" checked = \"1\" ");
								}								
							}
						} 
						int temp = 0;
						String colorStyle = " aCol=\"black\" sCol=\"white\" style=\"font-weight:bold;\" ";
						if(parentHashtable != null && parentHashtable.containsKey(vo.getId())){
							builder.append(" open = \"1\" ");
							builder.append(colorStyle);
							temp = 1;
						}else{
							if(i == 0 && "".equals(objectID)){
								builder.append(" open = \"1\" ");
							}
						}
						
						//�ڵ��Ƿ���Ȩ��·��
						if(vo.getIsAuthPath().equals("Y")){
							if(temp==0){
								builder.append(colorStyle);
							}
						}
						
						 //�ӽӿڷ���ֵ��ȡ���жϽڵ����޸�ѡ��
						String hasCheckbox = vo.getShowCheckBox();
						
						if("N".equals(hasCheckbox)){
							builder.append(" nocheckbox = \"1\" ");
						}
						
						/*�ж��Ƿ�ΪҶ�ӽڵ�,���Ϊ��Ҷ�ӽ��������Ľڵ���ʾ��"+"�ŵ�ͼ��,������ʾ"-"ͼ��*/
						//System.out.println("------------name:"+vo.getName() + " �Ƿ���Ҷ�ӽڵ�isLeaf="+ vo.getIsLeaf());
						if( "Y".equalsIgnoreCase(vo.getIsLeaf()) ){
						    builder.append(" child = \"0\" ");
						}else{
						    builder.append(" child = \"1\" ");
						}					
						builder.append(" >\n");								
						builder.append("<userdata name=\"objectTypeID\">"+vo.getId()+"</userdata>\n");						
						builder.append("<userdata name=\"hasCheckbox\">"+hasCheckbox+"</userdata>\n");	
						builder.append("<userdata name=\"isSelect\">"+vo.getIsSelect()+"</userdata>\n");	
						builder.append("<userdata name=\"isAuthPath\">"+vo.getIsAuthPath()+"</userdata>\n");
						builder.append("</item>\n");
					}	
			  	}
		 	}
		 	builder.append("</tree>\n");
		} 
	}catch (Exception e) {
		e.printStackTrace();
	}finally{
		outs.write(builder.toString());
		outs.close();
	}
%>

