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
									ϵͳ����
								</td>
								<td style="word-break: keep-all;">
									������־
								</td>
								<td style="word-break: keep-all;">
									����ԭ��
								</td>
								<td style="word-break: keep-all;">
									��������
								</td>
								<td style="word-break: keep-all;">
									�޸���
								</td>
								<td style="word-break: keep-all;">
									�޸�ʱ��
								</td>
							</tr>
							<c:forEach items="${requestScope.ifaceLogRepairList}" var="objData" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center">
										<img  alt="�鿴����" onclick="openLogFacadeDetail('${objData.repositoryId}','${objData.repairId}')" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
									</td>
									<td align="center">
										${objData.applicationName}
									</td>
									<td align="center" width="30%">
										${objData.traceText}
									</td>
									<td align="center" width="15%">
										${objData.faultCause}
									</td>
									<td align="center" width="15%">
										${objData.faultDescription}
									</td>
									<td align="center">
										${objData.repairUser}
									</td>
									<td align="center">
										<fmt:formatDate type="both" value="${objData.repairDate}" />
									</td>
								</tr>
							</c:forEach>
                    </tbody>
                  </table>
<blocimp:pageControl formId="commonQueryForm" jsFunction="initqueryResultList" declareName="ifaceLogRepairList" />