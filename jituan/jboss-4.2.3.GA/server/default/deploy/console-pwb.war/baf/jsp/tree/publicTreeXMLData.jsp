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
	//ͨ�������ñ��
	String dataSource = "";
	if(request.getParameter("dataSource")!=null){
		dataSource = request.getParameter("dataSource");
	}
		
	PrintWriter printOut = response.getWriter();
	StringBuilder builder = new StringBuilder();
	builder.append("<?xml version='1.0' encoding='GBK'?>\n");
	builder.append("<tree id=\"");
	
	//��dataSourceΪ����ʱ����ѯ�����壬����ֱ������һ����������������������˴���
	if("".equals(dataSource)){
		//builder.append("0\" />\n");
	 	//printOut.write(builder.toString());
	 	//printOut.close();
	 	//return;
	}
	
	//���Ƿ���ʾȫ·��
	String showFullPath = "";
	if(request.getParameter("showFullPath")!=null){
		showFullPath = request.getParameter("showFullPath");
	}
	//ͨ����SQL����
	String param = "";
	if(request.getParameter("param")!=null){
		param = request.getParameter("param");
	}
	//ͨ�������ڵ�ID
	String rootId = "";
	if(request.getParameter("rootId")!=null){
		rootId = request.getParameter("rootId");
	}
	//��չ��ʱĬ��ѡ�еĽڵ�ID
	String checkedIds = "";
	if(request.getParameter("checkedIds")!=null){
		checkedIds = request.getParameter("checkedIds");
	}
	//Ҫ���в�ѯ��λ�Ľڵ��ID
	String searchId = "";
	if(request.getParameter("searchId")!=null){
		searchId = request.getParameter("searchId");
	}
	//��ѯ��λʱ����չ�����ڼ���
	int expandLevel = 3;
	if(request.getParameter("expandLevel")!=null){
		expandLevel = Integer.parseInt(request.getParameter("expandLevel"));
	}
	//�Ƿ�һ���Լ�����������
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
		
		//��session�л�ȡ��ǰ��¼�û�����
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
		//��ʶ�Ƿ���Ԥ��
		String isPreview = "";
		if(request.getParameter("isPreview")!=null){
			isPreview = request.getParameter("isPreview");
		}else{
			isPreview = "N";
		}
		hashtable.put("isPreview", isPreview);  //�Ƿ���Ԥ��
		hashtable.put("rootId", rootId);  //���ڵ�ID
		hashtable.put("param", param);  //sql���ò���
		//ͨ��������Ԥ��ʱ��session�л�ȡ����ʹ�����ʱֱ��ʹ�ö����VO
		CurrencyTreeVO treeVO = new CurrencyTreeVO();
		if(isPreview.equals("Y")){
			//����ֱ�Ӷ�session�е������������������´��ٴ�session��ȡֵʱ��ֵ�Ǹ��ű仯��
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
			hashtable.put("currencyTree", treeVO);  //ͨ��������
		}
		hashtable.put("nodeId", objectId);  //չ���ڵ�ID
		hashtable.put("isFullTree", showFullPath.equals("1")?"Y":"N");  //�Ƿ�չʾȫ·��
		hashtable.put("searchId", searchId);  //Ҫ���в�ѯ��λ�Ľڵ��ID
		hashtable.put("treeAlias", dataSource);  //Ҫ���в�ѯ��λ�Ľڵ��ID
		//���õĽӿڷ���		
		String methodName = "previewCurrencyTree";
		if(oneOffLoad){
			methodName = "selectAllTreeData";
		}
		Hashtable retHashtable = (Hashtable) business.invoke("baf_CurrencyTreeBI", methodName, hashtable);
				
		//���objectIdΪ��,���ѯ���Ķ��㣬tree��idΪ0
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
			//��ʶ�ڵ������Ǵ����ݿ��ѯ�����л�ȡ���ǻ�ȡ�ֹ������ֵ
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
			params.put("expandLevel", expandLevel);  //Ҫ���в�ѯ��λ�Ľڵ��ID
			List<CurrencyTreeVO> firstData = (List)retHashtable.get("firstData");
			List<CurrencyTreeVO> allData = (List)retHashtable.get("allData");
			if(firstData!=null){
				params.put("firstData",firstData);
			}
			if(allData!=null){
				params.put("allData",allData);
			}
			
			//������װXML����
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

