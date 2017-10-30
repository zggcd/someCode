<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/taglib.jsp'%>
<table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
                    <tbody>
						<tr class="titletr">
								<td style="word-break: keep-all;">
									选择
								</td>
								<td style="word-break: keep-all;">
									详情
								</td>
								<td style="word-break: keep-all;">
									模块名称
								</td>
								<td style="word-break: keep-all;">
									提示标签
								</td>
								<td style="word-break: keep-all;">
									提示标签内容
								</td>
							</tr>
							<c:forEach items="${requestScope.ajaxPage}" var="objData" varStatus="n">
								<tr align="center" bgcolor="" style="cursor: 'hand'">
									<td align="center" style="width:3%">
										<input type="checkbox" name="checkid" value="${objData.tipId}"/>
									</td>
									<td align="center" style="width:5%">
										<img  alt="查看详情" onclick="toSysTipsEdit('${objData.tipId}');" src="/images/main/icon_search01.gif" border=0 style="cursor: pointer">
									</td>
									<td align="center">
										${objData.tipModuleId}
									</td>
									<td align="center">
										${objData.tipLabel}
									</td>
									<td align="center">
										${objData.tipContext}
									</td>
								</tr>
							</c:forEach>
                    </tbody>
                  </table>
<blocimp:pageControl formId="commonQueryForm" jsFunction="initqueryResultList" declareName="ajaxPage" />