<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/common/allTag.jsp' %>
<table class="table" id="powergrid" style="FONT-SIZE: 13px" cellspacing=0 bordercolordark=#ffffff  cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box  pcolor="#BCC8F5">
	<tr class="titletr">
		<td style="word-break: keep-all;">
			ѡ��
		</td>
		<td style="word-break: keep-all;">
			��½�ʺ�
		</td>
		<td style="word-break: keep-all;">
			�û�����
		</td>
		<td style="word-break: keep-all;">
			�ֻ�
		</td>
		<td style="word-break: keep-all;">
			��ע
		</td>
		<td style="word-break: keep-all;">
			�Ƿ���Ч
		</td>
	</tr>
	<c:forEach items="${requestScope.ajaxPage}" var="obj" varStatus="n">
		<tr align="center" bgcolor="" style="cursor: 'hand'">
			<td align="center">
				<input type="checkbox" name="checkid" value="${obj.userId}"/>
				<img  alt="�鿴����" onclick="getDetail('${obj.userId}','${obj.userName}')" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
			</td>
			<td align="center">
				${obj.loginName}
			</td>
			<td align="center">
				${obj.userName}
			</td>
			<td align="center">
				${obj.mobilePhone}
			</td>
			<td align="center">
			    ${obj.remark}
			</td>
			<td align="center">
			    ${obj.isValidName}
			</td>
		</tr>
	</c:forEach>
</table>