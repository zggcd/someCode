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
									���ر���
								</td>
								<td style="word-break: keep-all;">
									���ش�����Ϣ
								</td>
								<td style="word-break: keep-all;">
									��̬���ݱ���
								</td>
								<td style="word-break: keep-all;">
									��̬��������
								</td>
								<td style="word-break: keep-all;">
									ʵ����Ŀ����
								</td>
								<td style="word-break: keep-all;">
									ʵ����Ŀ����
								</td>
								<td style="word-break: keep-all;">
									����ʵ����ĿID
								</td>
								<td style="word-break: keep-all;">
									��������
								</td>
								<td style="word-break: keep-all;">
									ϵ�к���
								</td>
							</tr>
							<c:forEach items="${requestScope.ifaceWxtogbeomsList}" var="objData" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center">
										<!-- <input type="checkbox" name="checkid" value="${objData.rootId}"/>  -->
										<c:choose>
											<c:when test="${objData.changetype == 'DELETE'}">
												<img  alt="ɾ������" onclick="removeOperation('${objData.rootId}')" src="/images/main/icon_del01.gif" border=0 style="cursor: pointer">
											</c:when>
											<c:when test="${objData.changetype == 'INSERT'}">
												<img  alt="��Ӳ���" onclick="insertOperation('${objData.rootId}')" src="/images/main/icon_save01.gif" border=0 style="cursor: pointer">
											</c:when>
											<c:when test="${objData.changetype == 'UPDATE'}">
												<img  alt="���²���" onclick="updateOperation('${objData.rootId}')" src="/images/main/icon_save01.gif" border=0 style="cursor: pointer">
											</c:when>
											<c:otherwise>
												<img  alt="�޲���" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
											</c:otherwise>
										</c:choose>
									</td>
									<td align="center">
										<c:choose>
											<c:when test="${objData.responseCode == 0}">
												�ɹ�
											</c:when>
											<c:otherwise>
												ʧ��
											</c:otherwise>
										</c:choose>
									</td>
									<td align="center">
										${objData.responseInfo}
									</td>
									<td align="center">
										${objData.sysCode}
									</td>
									<td align="center">
										${objData.sysCodename}
									</td>
									<td align="center">
										${objData.itemId}
									</td>
									<td align="center">
										${objData.itemName}
									</td>
									<td align="center">
										${objData.parentItemId}
									</td>
									<td align="center">
										<c:choose>
											<c:when test="${objData.changetype == 'UPDATE'}">
												����
											</c:when>
											<c:when test="${objData.changetype == 'INSERT'}">
												����
											</c:when>
											<c:when test="${objData.changetype == 'DELETE'}">
												ɾ��
											</c:when>
											<c:otherwise></c:otherwise>
										</c:choose>
									</td>
									<td align="center">
										${objData.serialNumber}
									</td>
								</tr>
							</c:forEach>
                    </tbody>
                  </table>
<blocimp:pageControl formId="commonQueryForm" jsFunction="initqueryResultList" declareName="ifaceWxtogbeomsList" />