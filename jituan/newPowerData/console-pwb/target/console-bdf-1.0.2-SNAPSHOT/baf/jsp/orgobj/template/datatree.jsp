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
	
	
	//如果选择了多个模板，就把获取到的模板ID放到数组tempIDs[]里
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
	//所有需要展开的数据权限节点ID
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
		
		//如果点击的权限因子为空则直接返回。
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
			
			//解析选中的权限ID
			if (selectedDataRight != null && !selectedDataRight.equals("")) {
				String[] selectedArray = selectedDataRight.split("\\,");
				selectedHashtable = new Hashtable<String, String>();
				for (String selectedID : selectedArray) {
					selectedHashtable.put(selectedID, "");
				}
			}
			
			//解析原来已经选中，但是取消掉的权限ID			
			if (cancelDataRight != null && !cancelDataRight.equals("")) {
				String[] cancelArray = cancelDataRight.split("\\,");
				cancelHashtable = new Hashtable<String, String>();
				for (String cancelID : cancelArray) {
					cancelHashtable.put(cancelID, "");
				}
			}
			
			//解析选中的权限ID 的父节点。
			if (parentID != null && !parentID.equals("")) {
				String[] parentArray = parentID.split("\\,");
				parentHashtable = new Hashtable<String, String>();
				for (String parent : parentArray) {
					parentHashtable.put(parent, "");
				}
			}
			
			//获取用户数据
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
			//多个模板的时候
			if(count>1){
				dataRightAuth.setObjectIds(tempIDs);
				TemplateID="";
			}
			//单个模板的时候
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
			/*如果查询节点参数objectId为空,则认为查询树的顶点,此时xml的tree id属性应为0,否则为objectId*/
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
							//新增勾选
							builder.append(" checked = \"1\" ");
						} else {
							//已有数据是否已经被选中
							
							if ("Y".equalsIgnoreCase(vo.getIsSelect())) {
								//再判断是否已经取消
								if (cancelHashtable != null && cancelHashtable.containsKey(vo.getId())) {
									//已经取消
									
								} else {
									//没有取消
									
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
						//节点是否是权限路径
						
						if(vo.getIsAuthPath().equals("Y")){
							if(temp==0){
								builder.append(colorStyle);
							}
						}
						if(parentHashtable != null && parentHashtable.containsKey(vo.getId())){
							builder.append(" open = \"1\" ");
						}
						
						 //从接口返回值中取，判断节点有无复选框
						String hasCheckbox = vo.getShowCheckBox();
						
						if("N".equals(hasCheckbox)){
							builder.append(" nocheckbox = \"1\" ");
						}
						
						/*判断是否为叶子节点,如果为非叶子节则在树的节点显示加"+"号的图标,否则显示"-"图标*/
						
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

