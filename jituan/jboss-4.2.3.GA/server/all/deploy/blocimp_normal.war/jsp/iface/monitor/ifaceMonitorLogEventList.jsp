<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file="/jsp/taglib.jsp" %>
<table class=table id=powergrid style="FONT-SIZE: 13px" pcolor="#BCC8F5"
	cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100%
	bordercolorlight=#D7D7D7 border=1 frame=box>
	<tbody>
		<tr class="titletr">
			<td style="word-break: keep-all;">
				��־����
			</td>
			<td style="word-break: keep-all;">
				�¼�����
			</td>
			<td style="word-break: keep-all;">
				��־����
			</td>
			<td style="word-break: keep-all;">
				�Ƿ�ɹ�
			</td>
			<td style="word-break: keep-all;">
				����ĵ�
			</td>
			<td style="word-break: keep-all;">
				�¼�����
			</td>
			<td style="word-break: keep-all;">
				��������
			</td>
		</tr>
		<c:forEach items="${requestScope.ajaxPage}" var="objData"
			varStatus="n">
			<tr align="center" bgcolor="" style="cursor: 'hand'">
				<td align="center">
					<img  alt="�鿴��־�����б�" onclick="openIfaceLogRepositoryDetail ('${objData.relateId}')" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
				</td>
				<td align="center">
					<c:if test="${objData.type=='TRACE'}">
						����
					</c:if>
					<c:if test="${objData.type=='ERROR'}">
						����
					</c:if>
				</td>
				<td align="center">
					${objData.description}
				</td>
				<td align="center">
					<c:choose> 					
						<c:when test="${'Y'==objData.successful}">
							�ɹ�
						</c:when>
						<c:when test="${'N'==objData.successful}">
							ʧ��	
						</c:when>
						<c:otherwise>
							δ֪
						</c:otherwise>
					</c:choose> 
				</td>
				<td align="center">
					<img  alt="�鿴����ĵ�" onclick="openIfaceLogEventArgu ('${objData.eventId}')" src="/images/icon/code.png" border=0 style="cursor: pointer">
				</td>
				<td align="center">
					<img  alt="�鿴�¼�����" onclick="openIfaceLogEventDesc ('${objData.eventId}')" src="/images/icon/text.png" border=0 style="cursor: pointer">
				</td>
				<td align="center">
					<fmt:formatDate value="${objData.created}" pattern="yyyy-MM-dd HH:mm:ss" />
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>