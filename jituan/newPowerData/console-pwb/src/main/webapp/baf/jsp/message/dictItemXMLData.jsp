<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.dict.dictionary.common.valueobj.DictionaryItemVO"%>

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
		hashtable.put("dictionaryCode", "IDD_MESSAGE_TYPE");
		hashtable.put("ServletContext", sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_dictionaryItemBI", "getAllItemsByDictCode", hashtable);
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
		if (retHashtable != null){
			cateList = (List) retHashtable.get("getAllItemsByDictCode");
			if (cateList != null){
				int k=0;
			    for (int i = 0; i < cateList.size(); i++) {
			    	DictionaryItemVO vo = (DictionaryItemVO)cateList.get(i);
			    	k++;
			    	String itemId=vo.getItemId();
			    	String itemName=vo.getItemName();
			    	//String cateId = vo.getDictionaryCategoryId();
			    	//String cateName = vo.getDictionaryCategoryName();
			    	
				 	builder.append("<item text=\""+itemName+"\" id=\""+itemId+"\" ");			
				 //	if(vo.getDictionaryCategoryLevel().equals("0")){
				 		builder.append(" im0 =\"person.gif\" im1 =\"person.gif\" im2=\"person.gif\" ");
				 //	}else{
				 //		builder.append(" im0 =\"iconClient.gif\" im1 =\"iconClient.gif\" im2=\"iconClient.gif\" ");
				 //	}					
					
					if(k==1 && objectId.equals("")){
						builder.append(" select=\"1\" call=\"1\" open = \"1\" ");
					}
					
					/*判断是否为叶子节点,如果为非叶子节则在树的节点显示加"+"号的图标,否则显示"-"图标*/
				//	if( "Y".equalsIgnoreCase(vo.getIsLeaf()) ){
				//	    builder.append(" child = \"0\" ");
				//	}else{
				//	    builder.append(" child = \"1\" ");
				//	}					
					builder.append(" >\n");										
					builder.append("<userdata name=\"itemCode\">"+vo.getItemCode()+"</userdata>\n");						
					builder.append("</item>\n");
				}	
		  	}
	 	}
	 	if ((cateList == null ||  cateList.size() == 0 ) && objectId.equals("")){
	    	builder.append("<item text=\"点击这里添加数据\" id=\"null\" call=\"1\"/>");	 
	 	}
	 	builder.append("</tree>\n");
	}catch (Exception e) {
		e.printStackTrace();
	}finally{
		outs.write(builder.toString());
		outs.close();
	}
%>

