<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@ page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%@page import="com.regaltec.baf.ui.TreeData"%>
<%@page import="com.regaltec.baf.tree.common.valueobj.CurrencyTreeVO"%>
<%@page import="org.apache.commons.lang.StringUtils"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String objectId = request.getParameter("id");	
	if (objectId == null || objectId.equals("0")){
		objectId = "";
	}		
	//通用树配置编号
	String dataSource = "";
	if(request.getParameter("dataSource")!=null){
		dataSource = request.getParameter("dataSource");
	}
		
	PrintWriter printOut = response.getWriter();
	StringBuilder builder = new StringBuilder();
	builder.append("<?xml version='1.0' encoding='GBK'?>\n");
	builder.append("<tree id=\"");
	
	//当dataSource为“”时，查询无意义，所以直接生成一个空树（已在树组件中做了处理）
	if("".equals(dataSource)){
		//builder.append("0\" />\n");
	 	//printOut.write(builder.toString());
	 	//printOut.close();
	 	//return;
	}
	
	//树是否显示全路径
	String showFullPath = "";
	if(request.getParameter("showFullPath")!=null){
		showFullPath = request.getParameter("showFullPath");
	}
	//通用树SQL参数
	String param = "";
	if(request.getParameter("param")!=null){
		param = request.getParameter("param");
	}
	//通用树根节点ID
	String rootId = "";
	if(request.getParameter("rootId")!=null){
		rootId = request.getParameter("rootId");
	}
	//树展开时默认选中的节点ID
	String checkedIds = "";
	if(request.getParameter("checkedIds")!=null){
		checkedIds = request.getParameter("checkedIds");
	}
	//要进行查询定位的节点的ID
	String searchId = "";
	if(request.getParameter("searchId")!=null){
		searchId = request.getParameter("searchId");
	}
	//查询定位时设置展开到第几层
	int expandLevel = 3;
	if(request.getParameter("expandLevel")!=null){
		expandLevel = Integer.parseInt(request.getParameter("expandLevel"));
	}
	//是否一次性加载所有数据
	boolean oneOffLoad = false;
	if(request.getParameter("oneOffLoad")!=null){
		oneOffLoad = Boolean.valueOf(request.getParameter("oneOffLoad"));
	}
	HashMap<String,String> idsMap = new HashMap<String,String>();
	if(!checkedIds.equals("")){
		String[] ids = StringUtils.split(checkedIds,"$");
		if(ids.length>0){
			for(int i=0;i<ids.length;i++){
				idsMap.put(ids[i],ids[i]);
			}
		}
	}
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
		
		//从session中获取当前登录用户对象
		UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
		UserVO userVO = null;
		if(loginBean!=null){
			userVO = loginBean.getCurrentUser();
		}
		Hashtable hashtable = new Hashtable();
		if(userVO!=null){
			hashtable.put("user",userVO);
		}	
		hashtable.put("currentThread", Thread.currentThread().getName());
		hashtable.put("ServletContext", sc);
		//标识是否是预览
		String isPreview = "";
		if(request.getParameter("isPreview")!=null){
			isPreview = request.getParameter("isPreview");
		}else{
			isPreview = "N";
		}
		hashtable.put("isPreview", isPreview);  //是否是预览
		hashtable.put("rootId", rootId);  //根节点ID
		hashtable.put("param", param);  //sql配置参数
		//通用树对象，预览时从session中获取对象，使用组件时直接使用定义的VO
		CurrencyTreeVO treeVO = new CurrencyTreeVO();
		if(isPreview.equals("Y")){
			//不能直接对session中的引用做操作，这样下次再从session中取值时，值是跟着变化的
			CurrencyTreeVO ss = (CurrencyTreeVO)session.getAttribute("currencyTree");
			treeVO.setQueryScript(ss.getQueryScript());
			treeVO.setNodeId(ss.getNodeId());
			treeVO.setNodeName(ss.getNodeName());
			treeVO.setParentId(ss.getParentId());
			treeVO.setSortOrder(ss.getSortOrder());
		}else{
			treeVO.setTreeAlias(dataSource);
		}
		if(treeVO!=null){
			hashtable.put("currencyTree", treeVO);  //通用树对象
		}
		hashtable.put("nodeId", objectId);  //展开节点ID
		hashtable.put("isFullTree", showFullPath.equals("1")?"Y":"N");  //是否展示全路径
		hashtable.put("searchId", searchId);  //要进行查询定位的节点的ID
		hashtable.put("treeAlias", dataSource);  //要进行查询定位的节点的ID
		//调用的接口方法		
		String methodName = "previewCurrencyTree";
		if(oneOffLoad){
			methodName = "selectAllTreeData";
		}
		Hashtable retHashtable = (Hashtable) business.invoke("baf_CurrencyTreeBI", methodName, hashtable);
				
		//如果objectId为空,则查询树的顶点，tree的id为0
		if(objectId == null ||  "".equals(objectId)){
		   	builder.append("0");
		}else{
			builder.append(objectId);
		}		
		builder.append("\">\n");		
		List list = null;		
		if (retHashtable != null){
			list = (List) retHashtable.get(methodName);		
			List<String> parentIdsList = (List) retHashtable.get("parentIds");		
			//标识节点属性是从数据库查询数据中获取还是获取手工输入的值
			CurrencyTreeVO flagVO = (CurrencyTreeVO)retHashtable.get("falgVO");
			Hashtable<String,Object> params = new Hashtable<String,Object>();
			params.put("builder",builder);
			if(list!=null){	
				params.put("list",list);
			}
			if(flagVO!=null){	
				params.put("flagVO",flagVO);
			}
			params.put("objectId",objectId);
			params.put("idsMap",idsMap);
			params.put("searchId",searchId);
			if(parentIdsList!=null){
				params.put("parentIdsList",parentIdsList);
			}
			params.put("expandLevel", expandLevel);  //要进行查询定位的节点的ID
			List<CurrencyTreeVO> firstData = (List)retHashtable.get("firstData");
			List<CurrencyTreeVO> allData = (List)retHashtable.get("allData");
			if(firstData!=null){
				params.put("firstData",firstData);
			}
			if(allData!=null){
				params.put("allData",allData);
			}
			
			//调用组装XML方法
			if(oneOffLoad){
				builder = TreeData.onceBuildXml(params);
			}else{
				builder = TreeData.buildXml(params);
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

