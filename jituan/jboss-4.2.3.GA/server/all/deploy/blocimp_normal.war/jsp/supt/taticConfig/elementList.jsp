<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/commonjs.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<html>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<form name="queryListForm">
<table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
                    <tbody>
						<tr class="titletr">
								<td style="word-break: keep-all;">
									ѡ��
								</td>
								<td style="word-break: keep-all;">
									Ԫ������
								</td>
								<td style="word-break: keep-all;">
									Ԫ�ر���
								</td>
								<td style="word-break: keep-all;">
									��Դ����
								</td>
								<td style="word-break: keep-all;">
									��Ӧ��̬���ݱ���
								</td>
							</tr>
							<c:forEach items="${requestScope.elementList}" var="obj" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center">
										<input type="checkbox" name="checkid" value="${obj.elementid}" id="${obj.elementname}"/>
										<img  alt="�鿴����" onclick="getDetail('${obj.elementid}','${obj.elementname}')" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
									</td>
									<td align="center">
										${obj.elementname}
									</td>
									<td align="center">
										${obj.elementcode}
									</td>
									<td align="center">
										<c:if test="${'TEXT' eq obj.sourcetype}">��ͨ�ı�</c:if>
										<c:if test="${'SELECT' eq obj.sourcetype}">����</c:if>
										<c:if test="${'TREE' eq obj.sourcetype}">����</c:if>
									</td>
									<td align="center">
										${obj.sqlstr}
									</td>
								</tr>
							</c:forEach>
                    </tbody>
                  </table>
 </form>
</body>
</html>