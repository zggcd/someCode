<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@page import="com.regaltec.baf.rig.authorize.common.valueobj.DataRightVO"%>
<%@page import="com.regaltec.baf.rig.authorize.common.valueobj.DataRightAuthorizeVO"%>
<%@page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String objectID = request.getParameter("id");
	if (objectID == null || objectID.equals("0")){
		objectID = "";
	}
	String TemplateID = request.getParameter("TemplateID");
	
	
	//���ѡ���˶��ģ�壬�Ͱѻ�ȡ����ģ��ID�ŵ�����tempIDs[]��
	String manyTempIDs="";
	String []tempIDs=null;
	int count=0;
	if(TemplateID != null&&!"".equals(TemplateID)){
		 String [] ids = TemplateID.split("~");
		 for(int i = 0;i < ids.length; i++){
			if(ids[i] != null&&!"".equals(ids[i])){
				manyTempIDs=manyTempIDs+ids[i]+",";
				count++;
			}
		}
        if(count>1){
             if(manyTempIDs.length()>1){
            	 manyTempIDs=manyTempIDs.substring(0,manyTempIDs.length()-1); 
            	 tempIDs=manyTempIDs.split(",");
            	
             }
        }
    }
	
	String rightFactorId = request.getParameter("rightFactorId");
	String selectedDataRight = request.getParameter("selectedDataRight");
	String parentID = request.getParameter("parentID");
	if(parentID==null)
		parentID="";
	//������Ҫչ��������Ȩ�޽ڵ�ID
	String[] parentList = parentID.split(",");
	Hashtable<String,String> parenthIds = new Hashtable<String,String>();
	for(String strparentId : parentList){
		parenthIds.put(strparentId,"");
	}
	String hasCheckboxFlag = (request.getParameter("hasCheckbox")!=null) ? request.getParameter("hasCheckbox") : "";
	String postID = request.getParameter("postID");
	String cancelDataRight = request.getParameter("cancelDataRight");
	
	PrintWriter outs = null;
	StringBuilder builder = null;
	Hashtable<String, String> selectedHashtable = null;
	Hashtable<String, String> cancelHashtable = null;
	Hashtable<String, String> parentHashtable = null;	
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
		
		//��������Ȩ������Ϊ����ֱ�ӷ��ء�
		if (rightFactorId == null || rightFactorId.equals("")) {
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
				selectedHashtable = new Hashtable<String, String>();
				for (String selectedID : selectedArray) {
					selectedHashtable.put(selectedID, "");
				}
			}
			
			//����ԭ���Ѿ�ѡ�У�����ȡ������Ȩ��ID			
			if (cancelDataRight != null && !cancelDataRight.equals("")) {
				String[] cancelArray = cancelDataRight.split("\\,");
				cancelHashtable = new Hashtable<String, String>();
				for (String cancelID : cancelArray) {
					cancelHashtable.put(cancelID, "");
				}
			}
			
			//����ѡ�е�Ȩ��ID �ĸ��ڵ㡣
			if (parentID != null && !parentID.equals("")) {
				String[] parentArray = parentID.split("\\,");
				parentHashtable = new Hashtable<String, String>();
				for (String parent : parentArray) {
					parentHashtable.put(parent, "");
				}
			}
			
			//��ȡ�û�����
			UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
			UserVO userVO = null;
			if(loginBean!=null){
				userVO = loginBean.getCurrentUser();
			} 	
			Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
			if(userVO!=null){
				hashtable.put("user", userVO);
			}
			hashtable.put("showCheckBox", hasCheckboxFlag);		
			hashtable.put("currentThread", Thread.currentThread().getName());
			hashtable.put("ServletContext", sc);
			DataRightAuthorizeVO dataRightAuth = new DataRightAuthorizeVO();
			dataRightAuth.setRightFactorId(rightFactorId);
			//���ģ���ʱ��
			if(count>1){
				dataRightAuth.setObjectIds(tempIDs);
				TemplateID="";
			}
			//����ģ���ʱ��
			else{
			dataRightAuth.setObjectId(TemplateID);
			}
			dataRightAuth.setObjectCategory("T");
			dataRightAuth.setRightValue(objectID);
			hashtable.put("dataRightAuth",dataRightAuth);
			hashtable.put("ServletContext", sc);
			Hashtable<String, List> retHashtable = (Hashtable) business.invoke("baf_dataRightAuthorizeBI", "getDataRightAuthByUser", hashtable);
			List<DataRightVO> rightTreeList = null;			
			
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
				    for (DataRightVO vo:rightTreeList) {
					 	builder.append("<item text=\""+vo.getName()+"\" id=\""+vo.getId()+"\" ");					
						builder.append(" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" ");						
						
						if(selectedHashtable != null && selectedHashtable.containsKey(vo.getId())){		
							//������ѡ
							builder.append(" checked = \"1\" ");
						} else {
							//���������Ƿ��Ѿ���ѡ��
							
							if ("Y".equalsIgnoreCase(vo.getIsSelect())) {
								//���ж��Ƿ��Ѿ�ȡ��
								if (cancelHashtable != null && cancelHashtable.containsKey(vo.getId())) {
									//�Ѿ�ȡ��
									
								} else {
									//û��ȡ��
									
									builder.append(" checked = \"1\" ");
								}								
							}
						}
						int temp = 0;
						String colorStyle = " aCol=\"black\" sCol=\"white\" style=\"font-weight:bold;\" ";
						if(parenthIds.containsKey(vo.getId())){
							builder.append(" open = \"1\" ");
							builder.append(colorStyle);
							temp = 1;
						}
						//�ڵ��Ƿ���Ȩ��·��
						
						if(vo.getIsAuthPath().equals("Y")){
							if(temp==0){
								builder.append(colorStyle);
							}
						}
						if(parentHashtable != null && parentHashtable.containsKey(vo.getId())){
							builder.append(" open = \"1\" ");
						}
						
						 //�ӽӿڷ���ֵ��ȡ���жϽڵ����޸�ѡ��
						String hasCheckbox = vo.getShowCheckBox();
						
						if("N".equals(hasCheckbox)){
							builder.append(" nocheckbox = \"1\" ");
						}
						
						/*�ж��Ƿ�ΪҶ�ӽڵ�,���Ϊ��Ҷ�ӽ��������Ľڵ���ʾ��"+"�ŵ�ͼ��,������ʾ"-"ͼ��*/
						
						if( "Y".equalsIgnoreCase(vo.getIsLeaf()) ){
						    builder.append(" child = \"0\" ");
						}else{
						    builder.append(" child = \"1\" ");
						}					
						builder.append(" >\n");								
						builder.append("<userdata name=\"objectTypeID\">"+vo.getId()+"</userdata>\n");						
						builder.append("<userdata name=\"hasCheckbox\">"+hasCheckbox+"</userdata>\n");	
						builder.append("<userdata name=\"isSelect\">"+vo.getIsSelect()+"</userdata>\n");	
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

