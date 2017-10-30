<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@ page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%@ page import="com.regaltec.baf.rig.authorize.common.valueobj.DataRightVO"%>
<%@ page import="com.regaltec.baf.rig.authorize.common.valueobj.DataRightAuthorizeVO"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");

	response.setContentType("text/xml; charset=GBK");
	
	String objectId = request.getParameter("id");
	
	String rightFactorId = request.getParameter("rightFactorId");
	String itemType = request.getParameter("itemType");
	if(itemType!=null){
		session.setAttribute("itemType",itemType);
	}
	if(itemType==null){
		itemType = (String)session.getAttribute("itemType");
	}
	
	//��ǰչ���Ľڵ��Ƿ��и�ѡ��
	String isHasCheckbox = request.getParameter("hasCheckbox");
	if(isHasCheckbox==null){
		isHasCheckbox = "";
	}
	String orgID = request.getParameter("orgID");
	
	StringBuilder builder = null;
	PrintWriter printOut = response.getWriter();
	//itemTypeΪTʱ���������Ȩ���������ͣ����ұ��ǿ���
	if(rightFactorId==null){
		builder = new StringBuilder();
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id=\"0\">");
		builder.append("</tree>\n");
	 	printOut.write(builder.toString());	 	
	 	printOut.close();
		return;
	}		
	//����ѡ�е�����Ȩ��ID
	String allChecked = request.getParameter("checkedRight");
	String[] checkedList = allChecked.split(",");
	Hashtable checkedIds = new Hashtable();
	for(int i=0;i<checkedList.length;i++){
		String rightId = checkedList[i];
		checkedIds.put(rightId,"");
	}
	
	//�������ݿ��д�������ȡ��ѡ�е�����Ȩ��ID
	String allCancle = request.getParameter("cancleRight");
	String[] cancleList = allCancle.split(",");
	Hashtable cancleIds = new Hashtable();
	for(int i=0;i<cancleList.length;i++){
		String rightId = cancleList[i];
		cancleIds.put(rightId,"");
	}
	
	//������Ҫչ��������Ȩ�޽ڵ�ID
	String parentIds = request.getParameter("parentIds");
	String[] parentList = parentIds.split(",");
	Hashtable parenthIds = new Hashtable();
	for(int i=0;i<parentList.length;i++){
		String parentId = parentList[i];
		parenthIds.put(parentId,"");
	}
	
	if (objectId == null || objectId.equals("0"))
		objectId = "";
	try {
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
//		hashtable.put("rightFactorId", rightFactorId);		
		if(userVO!=null){
			hashtable.put("user", userVO);
		}
//		hashtable.put("objectId", orgID);
//		hashtable.put("objectCategory", "O");
//		hashtable.put("rightValue", objectId);
		hashtable.put("showCheckBox", isHasCheckbox);		
		hashtable.put("currentThread", Thread.currentThread().getName());
		DataRightAuthorizeVO dataRightAuth = new DataRightAuthorizeVO();
		dataRightAuth.setRightFactorId(rightFactorId);
		dataRightAuth.setObjectId(orgID);
		dataRightAuth.setObjectCategory("O");
		dataRightAuth.setRightValue(objectId);
		hashtable.put("dataRightAuth",dataRightAuth);
		hashtable.put("ServletContext", sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_dataRightAuthorizeBI", "getDataRightAuthByUser", hashtable);
		List rightTreeList = null;			
		
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
			rightTreeList = (List) retHashtable.get("getDataRightAuthByUser");
			if (rightTreeList != null){
				int i = 0;
				for(int k=0;k<rightTreeList.size();k++){
			   		DataRightVO vo = (DataRightVO)rightTreeList.get(k);
				 	builder.append("<item text=\""+vo.getName()+"\" id=\""+vo.getId()+"\" ");					
					builder.append(" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" ");
					
					//���checkedIds�а�����Ȩ��ID����ѡ��ѡ��
					if(checkedIds.containsKey(vo.getId())){
						builder.append(" checked = \"1\" ");
					}else{
						//��checkedIds�в�������Ȩ��ID�������ݿ����и�Ȩ�ޣ���ѡ��ѡ�У��൱�ڵ�һ�μ���ʱ��
						if("Y".equals(vo.getIsSelect()) && !cancleIds.containsKey(vo.getId())){
							builder.append(" checked = \"1\" ");
						}
					} 
					int temp = 0;
					String colorStyle = " aCol=\"black\" sCol=\"white\" style=\"font-weight:bold;\" ";
					if(parenthIds.containsKey(vo.getId())){
						builder.append(" open = \"1\" ");
						builder.append(colorStyle);
						temp = 1;
					}else{
						if(k == 0 && "".equals(objectId)){
							builder.append(" open = \"1\" ");
						}
					}
					
					//�ڵ��Ƿ���Ȩ��·��
					if(vo.getIsAuthPath().equals("Y")){
						if(temp==0){
							builder.append(colorStyle);
						}
					}
					
					String hasCheckbox = vo.getShowCheckBox();   //�ӽӿڷ���ֵ��ȡ���жϽڵ����޸�ѡ��
					
					//�趨�ڵ㲻��ʾ��ѡ�����Ҳ�Ǵӽӿڷ���ֵ��ȡ�ã���ʱֻ�ǲ���
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
					builder.append("<userdata name=\"isAuthPath\">"+vo.getIsAuthPath()+"</userdata>\n");
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

