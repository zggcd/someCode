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
	
	//当前展开的节点是否有复选框
	String isHasCheckbox = request.getParameter("hasCheckbox");
	if(isHasCheckbox==null){
		isHasCheckbox = "";
	}
	String orgID = request.getParameter("orgID");
	
	StringBuilder builder = null;
	PrintWriter printOut = response.getWriter();
	//itemType为T时，点击的是权限因子类型，则右边是空树
	if(rightFactorId==null){
		builder = new StringBuilder();
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id=\"0\">");
		builder.append("</tree>\n");
	 	printOut.write(builder.toString());	 	
	 	printOut.close();
		return;
	}		
	//所有选中的数据权限ID
	String allChecked = request.getParameter("checkedRight");
	String[] checkedList = allChecked.split(",");
	Hashtable checkedIds = new Hashtable();
	for(int i=0;i<checkedList.length;i++){
		String rightId = checkedList[i];
		checkedIds.put(rightId,"");
	}
	
	//所有数据库中存在限制取消选中的数据权限ID
	String allCancle = request.getParameter("cancleRight");
	String[] cancleList = allCancle.split(",");
	Hashtable cancleIds = new Hashtable();
	for(int i=0;i<cancleList.length;i++){
		String rightId = cancleList[i];
		cancleIds.put(rightId,"");
	}
	
	//所有需要展开的数据权限节点ID
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
		
		//获取当前登录用户对象
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
		/*如果查询节点参数objectId为空,则认为查询树的顶点,此时xml的tree id属性应为0,否则为objectId*/
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
					
					//如果checkedIds中包含该权限ID，则复选框选中
					if(checkedIds.containsKey(vo.getId())){
						builder.append(" checked = \"1\" ");
					}else{
						//若checkedIds中不包含该权限ID，但数据库中有该权限，则复选框选中（相当于第一次加载时）
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
					
					//节点是否是权限路径
					if(vo.getIsAuthPath().equals("Y")){
						if(temp==0){
							builder.append(colorStyle);
						}
					}
					
					String hasCheckbox = vo.getShowCheckBox();   //从接口返回值中取，判断节点有无复选框
					
					//设定节点不显示复选框，这个也是从接口返回值中取得，暂时只是测试
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

