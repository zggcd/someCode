<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/commonjs.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<html>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<form name="allForm1" id="allForm1">
<table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
                    <tbody>
						<tr class="titletr">
								<td style="word-break: keep-all;">
									ѡ��
								</td>
								<td style="word-break: keep-all;">
									ϵͳ����
								</td>
								<td style="word-break: keep-all;">
									�ӿ�����
								</td>
								<td style="word-break: keep-all;">
									�ӿڱ���
								</td>
								<td style="word-break: keep-all;">
									�����
								</td>
								<td style="word-break: keep-all;">
									XML�ڵ���
								</td>
								<td style="word-break: keep-all;">
									�Ƿ��Ϊ��
								</td>
								<td style="word-break: keep-all;">
									��������
								</td>
								<td style="word-break: keep-all;">
									���ݳ���
								</td>
								<td style="word-break: keep-all;">
									��ʽ
								</td>
							</tr>
							<c:forEach items="${requestScope.elementList}" var="obj" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center">
										<input type="checkbox" name="validid" value="${obj.checkId}"/>
									</td>
									<td align="center">
										${obj.applicationName}
									</td>
									<td align="center">
										${obj.cimpName}
									</td>
									<td align="center">
										${obj.methodName}
									</td>
									<td align="center">										
										<c:if test="${'IN' eq obj.returnAppid}">
										���
									  </c:if>
									   <c:if test="${'OUT' eq obj.returnAppid}">
										����
									  </c:if>
									</td>
									<td align="center">
										${obj.fieldName}
									</td>
									<td align="center">
									    <c:if test="${'Y' eq obj.isNull}">
										��
									  </c:if>
									   <c:if test="${'N' eq obj.isNull}">
										��
									  </c:if>										
									</td>
									<td align="center">
									  <c:if test="${'static' eq obj.dataType}">
										��̬����
									  </c:if>
									   <c:if test="${'int' eq obj.dataType}">
										����
									  </c:if>										
									</td>
									<td align="center">
									    ${obj.fieldLegth}
									</td>
									<td align="center">
									    ${obj.format}
									</td>
								</tr>
							</c:forEach>
                    </tbody>
                  </table>
               </form>
</body>
</html>