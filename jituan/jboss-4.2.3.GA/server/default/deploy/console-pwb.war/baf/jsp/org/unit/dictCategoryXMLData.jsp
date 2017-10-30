<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%@ page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@ page import="com.regaltec.baf.dict.category.common.valueobj.DictionaryCategoryVO"%>
<%@ page import="com.regaltec.baf.dict.dictionary.common.valueobj.DictionaryVO"%>
<%@ page import="com.regaltec.common.util.Constant"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String objectId = request.getParameter("id");	
	
	if (objectId == null || objectId.equals("0"))
		objectId = "";

	StringBuilder builder = new StringBuilder();
	PrintWriter outs = response.getWriter();
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
		
		Hashtable hashtable = new Hashtable();
		//获取当前登录用户对象
		UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
		UserVO userVO = null;
		if(loginBean!=null){
			userVO = loginBean.getCurrentUser();
		}
		if(userVO!=null){
			hashtable.put("user", userVO);
		}
		hashtable.put("rightFactorCode", Constant.RIGHTFACTOR_CODE_DICT);
		hashtable.put("parentDictCategoryId", objectId);
		hashtable.put("ServletContext", sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_dictCategoryBI", "getDictChildren", hashtable);
		List cateList = null;			
		
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id=\"");
		/*如果查询节点参数objectId为空,则认为查询树的顶点,此时xml的tree id属性应为0,否则为objectId*/
		if(objectId == null ||  "".equals(objectId)){
		   builder.append("0");
		}else{
		   builder.append(objectId);
		}
		builder.append("\">\n");
		//获取字典类型
		if (retHashtable != null){
			cateList = (List) retHashtable.get("getDictChildren");
			if (cateList != null){
				int k=0;
			    for (int i = 0; i < cateList.size(); i++) {
			    	DictionaryCategoryVO vo = (DictionaryCategoryVO)cateList.get(i);
			    	k++;
			    	String cateId = vo.getDictionaryCategoryId();
			    	String cateName = vo.getDictionaryCategoryName();
			    	
				 	builder.append("<item text=\""+cateName+"\" id=\""+cateId+"\" ");			
				 	if(vo.getDictionaryCategoryLevel().equals("0")){
				 		builder.append(" im0 =\"person.gif\" im1 =\"person.gif\" im2=\"person.gif\" ");
				 	}else{
				 		builder.append(" im0 =\"iconClient.gif\" im1 =\"iconClient.gif\" im2=\"iconClient.gif\" ");
				 	}					
					
					if(k==1 && objectId.equals("")){
						builder.append(" select=\"1\" call=\"1\" open = \"1\" ");
					}
					
					/*判断是否为叶子节点,如果为非叶子节则在树的节点显示加"+"号的图标,否则显示"-"图标*/
					//if( "Y".equalsIgnoreCase(vo.getIsLeaf()) ){
					//    builder.append(" child = \"0\" ");
					//}else{
					    builder.append(" child = \"1\" ");
					//}					
					builder.append(" >\n");										
					builder.append("<userdata name=\"type\">dicCategory</userdata>\n");	
					builder.append("</item>\n");
				}	
		  	}
	 	}
	 	//获取字典
	 		hashtable.put("dictionaryCategoryId", objectId);
	 		Hashtable dicHashtable = (Hashtable) business.invoke("baf_dictionaryBI", "selectDictionaryByTypeId", hashtable);
			List dicList = null;
			if(null!=dicHashtable){
				dicList = (List) dicHashtable.get("selectDictionaryByTypeId");
			if (dicList != null){
				int k=0;
			    for (int i = 0; i < dicList.size(); i++) {
			    	DictionaryVO vo = (DictionaryVO)dicList.get(i);
			    	k++;
			    	String cateId = vo.getDictionaryId();
			    	String cateName = vo.getDictionaryName();
			    	
				 	builder.append("<item text=\""+cateName+"\" id=\""+cateId+"\" ");			
				 	builder.append(" im0 =\"book.gif\" im1 =\"book.gif\" im2=\"book.gif\" ");
					
					if(k==1 && objectId.equals("")){
						builder.append(" select=\"1\" call=\"1\" open = \"1\" ");
					}
					
					/*判断是否为叶子节点,如果为非叶子节则在树的节点显示加"+"号的图标,否则显示"-"图标*/					
					builder.append(" child = \"0\" ");									
					builder.append(" >\n");
					builder.append("<userdata name=\"type\">dic</userdata>\n");					
					builder.append("</item>\n");
				}	
		  	}
			}
		
	 	if ((cateList == null ||  cateList.size() == 0 ) && objectId.equals("")){
	    	builder.append("<item text=\"Click here to add data\" id=\"null\" call=\"1\"/>");	 
	 	}
	 	builder.append("</tree>\n");
	}catch (Exception e) {
		e.printStackTrace();
	}finally{
		outs.write(builder.toString());
		outs.close();
	}
%>

