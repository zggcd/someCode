<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file="/jsp/taglib.jsp" %>
<table class=table id=powergrid style="FONT-SIZE: 13px" pcolor="#BCC8F5" cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box>
	<tbody>
		<tr class="titletr">
			<td style="word-break: keep-all;">
				���
			</td>
			<td style="word-break: keep-all;">
				ϵͳ���
			</td>
			<td style="word-break: keep-all;">
				ϵͳ����
			</td>
			<td style="word-break: keep-all;">
				�ӿڱ���
			</td>
			<td style="word-break: keep-all;">
				��־��ʶ��
			</td>
			<td style="word-break: keep-all;">
				�¼�����
			</td>
			<td style="word-break: keep-all;">
				��־����
			</td>
			<td style="word-break: keep-all;">
				��������
			</td>
			<td style="word-break: keep-all;">
				��������
			</td>
		</tr>
		<c:forEach items="${requestScope.ajaxPage}" var="objData" varStatus="n">
			<tr align="center" bgcolor="" style="cursor: 'hand'">
				<td align="center">
					${objData.sequenceId}
				</td>
				<td align="center">
					${objData.applicationSn}
				</td>
				<td align="center">
					${objData.applicationName}
				</td>
				<td align="center">
					${objData.methodName}
				</td>
				<td align="center">
					${objData.traceIndicator}
				</td>
				<td align="center">
					<c:if test="${objData.traceLevel=='TRACE'}">
						����
					</c:if>
					<c:if test="${objData.traceLevel=='ERROR'}">
						����
					</c:if>
				</td>
				<td align="center">
					${objData.traceText}
				</td>
				<td align="center">
					<img  alt="�鿴��������" onclick="openIfaceLogRepositoryXmlDocument ('${objData.repositoryId}')" src="/images/icon/note.gif" border=0 style="cursor: pointer">
				</td>
				<td align="center">
					<fmt:formatDate value="${objData.createDate}" pattern="yyyy-MM-dd HH:mm:ss" />
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>