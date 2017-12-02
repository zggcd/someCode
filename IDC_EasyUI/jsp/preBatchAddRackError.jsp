<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!-- 导入公共资源库 -->
<%@ include file="/pwb/include/taglib.jsp"%>
<%@ include file="/pwb/include/common.jspf"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>机房管理</title>
<link rel="stylesheet" type="text/css"
	href="/pwb/common/easyui15/themes/metro/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="/pwb/common/easyui15/themes/mobile.css" />
<script type="text/javascript"
	src="/pwb/common/easyui15/jquery.easyui.mobile.js"></script>
<script type="text/javascript">

</script>
</head>
<body>
	<div  style="width: 100%;height: auto; text-align: center; font-size: 25px;margin-top: 10px;"><font color="red">${errorMsg} </font></div>
	
	 <div id="dlg-buttons" style="text-align: center;">
	        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="$('#addRackSecond').dialog('destroy').remove();" style="width:90px;margin-top: 40px;">上一步</a>
	    </div>	
</body>
</html>