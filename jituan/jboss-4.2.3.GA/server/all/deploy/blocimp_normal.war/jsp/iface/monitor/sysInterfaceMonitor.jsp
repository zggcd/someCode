<%@ page contentType="text/html;charset=GBK" language="java"%>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css"
	type="text/css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="/js/tab-view/css/tab-view.css"
	type="text/css" media="screen">
<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>
<%@ include file='/jsp/common/allTag.jsp'%>
<html>
	<head>
		<script type='text/javascript'>
			function initqueryResultList(){
				document.forms['queryListForm'].action = "/iface/ifaceMonitorAction.do";
				document.forms['queryListForm'].submit();
			}
			setInterval("initqueryResultList()",60000);  //һ����ˢ��һ��

		</script>
	</head>
	<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0"
		topmargin="4">
		<form name="queryListForm">
			<input type="hidden" name="method" value="initSysInterfaceList">
			<DIV id="tabView1tab_tabPane">
				<DIV id=tabTabtabView1_0>
					<table border="0" cellspacing="0" cellpadding="0"
						style="font-size: 13px">
						<tr>
							<td class="tabpaneleft2"></td>
							<td class="tabpanebg2" width="120">
								<img
									src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif"
									width="18" height="15">
								<span>�ӿ��������</span>
							</td>
							<td class="tabpaneright2">
							</td>
						</tr>
					</table>
				</DIV>
			</DIV>
			<div class="tab_aTab">
				<table class=table id=powergrid style="FONT-SIZE: 13px"
					cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100%
					bordercolorlight=#D7D7D7 border=1 frame=box pcolor="#BCC8F5">
					<tbody>
						<tr class="titletr">
							<td style="word-break: keep-all;">
								���
							</td>
							<td style="word-break: keep-all;">
								�ӿ�����
							</td>
							<td style="word-break: keep-all;">
								���һ��ִ��ʱ��
							</td>
							<td style="word-break: keep-all;">
								�Ƿ�����
							</td>
						</tr>
						<c:forEach items="${requestScope.confList}" var="obj"
							varStatus="n">
							<tr align="center" bgcolor="">
								<td align="center" class="data_Td_char">
									${n.index+1}
								</td>
								<td align="left" class="data_Td_char">
									${obj.backgroundTypeDesc}
								</td>
								<td align="center" class="data_Td_char">
									<fmt:formatDate type="both" value="${obj.lastRunTime}" />
								</td>
								<td align="center" class="data_Td_char">
									<c:if test="${obj.isNormal eq 'T'}">����</c:if>
									<c:if test="${obj.isNormal eq 'F'}">
										<font color="red">�쳣</font>
									</c:if>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</form>
	</body>
</html>