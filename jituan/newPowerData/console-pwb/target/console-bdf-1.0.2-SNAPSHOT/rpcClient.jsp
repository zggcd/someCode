<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.apache.axis.client.Service" %>
<%@ page import="org.apache.axis.client.Call" %>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.dict.dictionary.common.valueobj.DictionaryItemVO"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>更新缓存数据</title>
</head>
<body>

  <% 
    response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	List<DictionaryItemVO> parentList=null;
	String types=request.getParameter("types");
	
	String updateTime="30";//更新最近30分钟的数据
	
	try {			
	ServletContext sc = session.getServletContext();
    WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
    IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
     Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
				hashtable.put("regionId", "");
				hashtable.put("dictionaryCode", "IDD_SERVERS");
				hashtable.put("dictionaryId", "");
				hashtable.put("ServletContext", sc);
    Hashtable phash = (Hashtable) business.invoke("baf_dictionaryItemBI","getAllItemByCondition", hashtable);
		if (phash != null) {
			 parentList = (List) phash.get("getAllItemByCondition");
		}
	}catch (Exception e) {
	   out.println("<font color='red'>获取服务器列表失败！<font><br/>");
		e.printStackTrace();
	}
  String result ="";
  if(null!=parentList&&parentList.size()>0){
     for(DictionaryItemVO vo:parentList){
        String url=vo.getItemValue();
        try {
			String endpoint = "http://"+url+"/services/RpcServiceImpl?wsdl";

			Service service = new Service();

			Call call = (Call) service.createCall();

			call.setTargetEndpointAddress(endpoint);

			call.setOperationName("RpcUpdate");

			call.addParameter("types", org.apache.axis.encoding.XMLType.XSD_STRING,

			javax.xml.rpc.ParameterMode.IN);
			
			call.addParameter("time", org.apache.axis.encoding.XMLType.XSD_STRING,

			javax.xml.rpc.ParameterMode.IN);

			call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);

			call.setUseSOAPAction(true);


			call.setSOAPActionURI("http://www.my.com/Rpc");

			//System.out.println(types);
			
			call.setTimeout(3000);//将调用超时设置为3秒

			result = (String)call.invoke(new Object[]{types,updateTime});
			
			if("1".equals(result)){
			   out.println(url+"服务器同步成功！<br/>");
			}else{
			   out.println("<font color='red'>"+url+"服务器同步失败！<font><br/>");
			}

			}

			catch (Exception e) {
               out.println("<font color='red'>"+url+"服务器同步失败！<font><br/>");
			   System.err.println(e.toString());
			}
     }
  }
    	
     %>
     <br/>

</body>
</html>