<%@ page contentType="text/html;charset=gbk" language="java"%>
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
									�������
								</td>
								<td style="word-break: keep-all;">
									ά����Ա
								</td>
								<td style="word-break: keep-all;">
									ά����Ա�绰����
								</td>
								<td style="word-break: keep-all;">
									Email ��ַ
								</td>
								<td style="word-break: keep-all;">
									�ӿ�����
								</td>
								<td style="word-break: keep-all;">
									Э������(��)
								</td>
								<td style="word-break: keep-all;">
									Զ�̵�ַ
								</td>
								<td style="word-break: keep-all;">
									��Ȩ�ʻ�
								</td>
								<td style="word-break: keep-all;">
									�ʻ�����
								</td>
								<td style="word-break: keep-all;">
									��������
								</td>
								<td style="word-break: keep-all;">
									�˿�����
								</td>
							</tr>
							<c:forEach items="${requestScope.ifaceConfigProtocolList}" var="objData" varStatus="n">
							<tr align="center" bgcolor="" style="cursor: 'hand'">
								<td align="center" style="">
									<input type="checkbox" name="checkid" value="${objData.protocolId}"/>
								</td>
								<td align="center" style="">
									<img  alt="�鿴����" onclick="openIfaceConfigProtocolEdit('${objData.protocolId}');" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
								</td>
								<td align="center">
									${objData.serveType}
								</td>
								<td align="center">
									${objData.userName}
								</td>
								<td align="center">
									${objData.phoneNumber}
								</td>
								<td align="center">
									${objData.emailAddress}
								</td>
								<td align="center">
									${objData.interfaceName}
								</td>
								<td align="center" onmouseover="TagToTip('T2TAdaptWidth_${objData.protocolName}',TITLE,'��ϸ��Ϣ',FADEIN, 300, FADEOUT, 300, WIDTH, 300,CLICKSTICKY, true)" onmouseout="UnTip()">
										${objData.protocolName}
										<span id="T2TAdaptWidth_${objData.protocolName}" style="display: none">�ṩ�����ƣ�${objData.providerName}<br/>JNDI ���ƣ�${objData.jndiName}<br/>
										JMS��ϢĿ�ĵأ�${objData.destination}<br/>�����ռ䣺${objData.nameSpace}</span>
								</td>
								<td align="center">
									${objData.wsdlAddr}
								</td>
								<td align="center">
									${objData.authAccount}
								</td>
								<td align="center">
									${objData.authPassword}
								</td>
								<td align="center">
									${objData.serviceName}
								</td>
								<td align="center">
									${objData.portName}
								</td>
							</tr>
						</c:forEach>
                    </tbody>
                  </table>