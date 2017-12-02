<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="com.ccssoft.rsas.rs.rack.entity.Rack" %>
<%
	String roomid = request.getSession().getAttribute("roomid")
			.toString();
%>

<!-- 导入公共资源库 -->
<%@ include file="/pwb/include/taglib.jsp"%>
<%@ include file="/pwb/include/common.jspf"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>机房管理</title>
<link rel="stylesheet" type="text/css"
	href="/pwb/common/easyui15/themes/metro/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="/pwb/common/easyui15/themes/mobile.css" />
<script type="text/javascript"
	src="/pwb/common/easyui15/jquery.easyui.mobile.js"></script>
<script type="text/javascript">
	var roomid = '<%=roomid%>';
	function save(){
		
	}
</script>
</head>
<body class="easyui-layout">
	<div id="pdd2" class="easyui-navpanel">
		<header>
			<div class="m-toolbar">
				<div class="m-title">批量录入机架（第三步）</div>
			</div>
		</header>
		<div id="dlg-buttons" style="text-align: center;margin: 30px;">
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-ok" onclick="save()" style="width:90px">保存</a>
		</div>
		<table id="rackDatagrid"  width=100% border=1 cellpadding=2 
						            cellspacing=0 bordercolorlight=#CCCCCC bordercolordark=#FFFFFF bgcolor="#FFFAFA" frame=box id=powergrid style="FONT-SIZE: 23px" 
						            pcolor="#CCCCCC">
			<%
				int cols = 0;
				Object obj = request.getAttribute("cols");
				int rowNum = 1;
				if (obj != null) {
					cols = (Integer) obj;
				}
				String rt = (100/(cols+1))+"%";
			%>
			<tr>
				<td height="35" colspan="<%=cols+1%>">
				<input type="hidden" name="roomId" value="${roomId}">
				<input type="hidden" name="microModuleId" value="${microModuleId}">
				机架预览；确认无误后点击保存数据入库(可以在文本框中修改“电源相位”)
				</td>
			</tr>
			<tr>
				<%
					for (int i = 0; i <= cols; i++) {
						if (i == 0) {
				%>
				<td  width="<%=rt%>"><center>行/列</center></td>
				<%
						} else {
				%>
				<td  width="<%=rt%>"><center>
						第<%=i%>列
					</center></td>
				<%
						}
					}
				%>
			</tr>
			<c:forEach items="${rcvRacks}" var="i" varStatus="status">
				<c:if test="${status.index%cols==0}">
					<tr>
						<td  width="<%=rt%>" ><center>
								第<%=rowNum++%>行
							</center></td>
				</c:if>
				<td   width="<%=rt%>"  title='第<c:out value="${i.rowno}"/>行<c:out value="${i.colno}"/>列'>
				<center>
				<c:if test="${!empty  i.colno}">
					<c:if test="${!empty  i.racktype}">
						<c:out value="${i.racktype.name}"/>
					</c:if>
						 <input
						style="width:70px" name="${i.power}" id="power"
						value="<c:out value='${i.power}'/>" class="easyui-textbox">
						</center>
						</td>
				</c:if>
					
				<c:if test="${status.index%i.colno==(i.colno-1)}">
					</tr>
				</c:if>
			</c:forEach>
		</table>
	</div>
</body>
</html>