<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysTaskAction.js'></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/cb2.js"></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/imgurl.css" type="text/css">
<html>
<head>
<title>OSS�ӿ�ƽ̨</title>
</head>
<script src="<%=request.getContextPath()%>/js/frameservice.js"></script>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td>
    <table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
	<tr>
	<td  class="tabpaneleft2"></td>
	<td class="tabpanebg2"   width="120">
	<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
	����������
	</td>
	<td class="tabpaneright2">
   </td>
    </tr>
    </table>
    </td>
  </tr>
  <tr>
    <td bgcolor="#FFFFFF">
    <table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
    <tr>
    <td> <div id="queryResultList" style="PADDING-RIGHT:0px;">
    
    		<html>
			<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
			<form name="queryListForm">
			<table class=table id=powergrid style="FONT-SIZE: 13px"
			            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
			            pcolor="#BCC8F5">
			                   <thead>
									<tr class="titletr">
											<td style="word-break: keep-all;">
												��������
											</td>
											<td style="word-break: keep-all;">
												����CLASS
											</td>
											<td style="word-break: keep-all;">
												Ĭ������
											</td>
											<td style="word-break: keep-all;">
												����
											</td>
										</tr>
										</thead>
										 <tbody>
											<c:forEach items="${requestScope.runningTaskList}" var="obj" varStatus="n">
											<tr align="center" bgcolor="" style="cursor: 'hand'">
												<td align="center" style="height:24">
													${obj.serviceName}
												</td>
												<td align="center">
													${obj.serviceClass}
												</td>
												<td align="center">
													${obj.startDefault}
												</td>
												<td align="center">
													<a href="javascript:void(0);" onclick="sysTaskAction.startTask('${obj.serviceId}')">����</a>
												</td>
											</tr>
										</c:forEach>
			                    </tbody>
			                  </table>
			 </form>
			</body>
			</html>
    
           </div>
      </td>
  </tr>
</table>
      </td>
  </tr>
</table>
  </td>
  </tr>
</table>
</body>
</html>