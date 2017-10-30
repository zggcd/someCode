<html>
<%@ page contentType="text/html; charset=utf-8" %>
<%
response.setHeader("Pragma","No-cache");
response.setHeader("Cache-Control","no-cache");
response.setHeader("Expires","0");
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>集团电子运维系统互联接口平台</title>
<script type="text/javascript" src="/js/prototype.js"></script>
<script type="text/javascript" src="/dwr/engine.js"></script>
<script type="text/javascript" src="/dwr/interface/loginAction.js"></script>
<script type="text/javascript">
Event.observe(window, "load", function() {
	Event.observe("loginName", "keypress", function(event) {
		if (event.keyCode == Event.KEY_RETURN) {
			event.stop();
			if (!$("loginName").present()) {
				alert("请输入用户名");
			} else {
				$("loginPassword").select();
			}
		}
	});

	Event.observe("loginPassword", "keypress", function(event) {
		if (event.keyCode == Event.KEY_RETURN) {
			event.stop();
			if ($F("loginName").blank()) {
				alert("请输入用户名");
				$("loginName").focus();
			} else if ($F("loginPassword").blank()) {
				alert("请输入密码");
				("loginPassword").focus();
			} else {
				submitHandler();
			}
		}
	});

	Event.observe("btnSubmit", "click", submitHandler);

	$("loginName").focus();
});

function submitHandler() {
	if ($F("loginName").blank()) {
		alert("请输入用户名");
		$("loginName").focus();
		return false;
	}
	if ($F("loginPassword").blank()) {
		alert("请输入密码");
		$("loginPassword").focus();
		return false;
	}
	loginAction.checkin($("loginForm").serialize(true), function(result){
		if(result.blank()) {
			window.location.href="<%=request.getContextPath()%>/sys/loginAction.do?method=checkLogin";
		}else{
			alert(result);
			$("loginPassword").select();
		}
	});
}

</script>
</head>

<body bgcolor="26427F" text="#000000" >
<form name="loginForm" id="loginForm">
	<input type="hidden" name="method" value="checkLogin" />
	<table width="100%" border="0" cellspacing="0" cellpadding="0" height="99%">
		<tr>
			<td>
				<div align="center">
					<br />
					<table width="422" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="148"><img src="<%=request.getContextPath()%>/images/main/pic.gif" width="511" height="161" border="0"></td>
						</tr>
						<tr>
							<td background="<%=request.getContextPath()%>/images/main/pic2.gif">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="13%">
										<div align="right"><img
											src="<%=request.getContextPath()%>/images/main/pic4.gif"
											width="70" height="66"></div>
										</td>
										<td width="87%">
										<table width="100%" border="0" cellspacing="2" cellpadding="3">
											<tr>
												<td><input type="text" id="loginName" name="loginName" style="width: 150px;" /></td>
											</tr>
											<tr>
												<td height="33"><input type="password" id="loginPassword" name="loginPassword" style="width: 150px" /></td>
											</tr>
										</table>
										</td>
									</tr>
									<tr>
										<td width="13%" height="3"><img src="<%=request.getContextPath()%>/images/main/pic5.gif" width="189" height="49"></td>
										<td width="87%" valign="top" height="3">
										<table width="100%" border="0" cellspacing="2" cellpadding="3">
											<tr>
												<td><img id="btnSubmit" border="0" src="<%=request.getContextPath()%>/images/main/ok01.gif" width="78" height="24" /></td>
											</tr>
										</table>
										</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td><img src="<%=request.getContextPath()%>/images/main/pic3.gif" width="511" height="201"></td>
						</tr>
					</table>
				</div>
			</td>
		</tr>
		<tr>
			<td height="20" align="right"><a href="/swf/install_flash_player_ax.exe"><img src="/images/icon/plugin.png" border="0" width="16" height="16" /></a></td>
		</tr>
	</table>
</form>
</body>
</html>
