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
									�ֵ���Ŀ
								</td>
								<td style="word-break: keep-all;">
									�����ֵ�����
								</td>
								<td style="word-break: keep-all;">
									�����ֵ����
								</td>
								<td style="word-break: keep-all;">
									��ע
								</td>
							</tr>
							<c:forEach items="${requestScope.ajaxPage}" var="objData" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center" style="width:3%">
										<input type="checkbox" name="checkid" value="${objData.dictionaryId}"/>
									</td>
									<td align="center" style="width:5%">
										<img  alt="�鿴����" onclick="toSysDicItemRelateList('${objData.dictionaryId}');" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
									</td>
									<td align="center">
										${objData.dictionaryName}
									</td>
									<td align="center">
										${objData.dictionaryCode}
									</td>
									<td align="center">
										${objData.remark}
									</td>
								</tr>
							</c:forEach>
                    </tbody>
                  </table>
<blocimp:pageControl formId="commonQueryForm" jsFunction="initqueryResultList" declareName="ajaxPage" />