<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/taglib.jsp'%>
<table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
                    <tbody>
						<tr class="titletr">
								<td style="word-break: keep-all;">
									ѡ��
								</td>
								<td style="word-break: keep-all;">
									����
								</td>
								<td style="word-break: keep-all;">
									��̨��������
								</td>
								<td style="word-break: keep-all;">
									��̨����CLASS
								</td>
								<td style="word-break: keep-all;">
									��̨��������
								</td>
								<td style="word-break: keep-all;">
									Ĭ������
								</td>
								<td style="word-break: keep-all;">
									���ʱ��(����Ϊ��λ)
								</td>
								<td style="word-break: keep-all;">
									�Ƿ�ֻ����һ��
								</td>
							</tr>
							<c:forEach items="${requestScope.sysTaskServiceList}" var="objData" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center">
										<input type="checkbox" name="checkid" value="${objData.serviceId}"/>
									</td>
									<td align="center">
										<img  alt="�鿴����" onclick="updateSysServiceConfigDetail('${objData.serviceId}');" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
									</td>
									<td align="center">
										${objData.serviceName}
									</td>
									<td align="center">
										${objData.serviceClass}
									</td>
									<td align="center">
										${objData.serviceDesc}
									</td>
									<td align="center">
										<c:choose>
											<c:when test="${objData.startDefault == 'Y' }">
												��
											</c:when>
											<c:when test="${objData.startDefault == 'N' }">
												��
											</c:when>
											<c:otherwise>
												���ݲ���
											</c:otherwise>
										</c:choose>
									</td>
									<td align="center">
										<c:if test="${objData.startRunonce eq 'N'}">
											${objData.runInterval}
										</c:if>
									</td>
									<td align="center">
										${objData.startRunonce}
									</td>
								</tr>
							</c:forEach>
                    </tbody>
                  </table>
<blocimp:pageControl formId="commonQueryForm" jsFunction="initqueryResultList" declareName="sysTaskServiceList" />