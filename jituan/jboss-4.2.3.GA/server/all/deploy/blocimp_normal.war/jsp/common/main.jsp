<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>集团电子运维系统互联接口平台</title>
</head>
<frameset border="0" id="main" framespacing="0" cols="165,8,*" frameborder="no">
  <frame  name="left" src="<%=request.getContextPath()%>/jsp/common/left.jsp" noresize="noresize" scrolling="no" id="outlookbar" frameborder="0" marginwidth="0" marginheight="0">
  <frame name="center" src="variety.jsp" scrolling="no" id="controlOutlookBar" frameborder="0">
  <frameset rows="*" border="0" frameborder="no" framespacing="0" id="workplace">
	<frame src="workarea.jsp" noresize="noresize" name="worktable">
  </frameset>
</frameset>
</html>
