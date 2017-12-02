<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/pwb/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>机架详细信息</title>
<%@ include file="/pwb/include/common.jspf"%>
</head>
<script type="text/javascript">
	var pageType = $("#pageType").val();
	alert(pageType);
</script>
<body>
<style type="text/css">
	.table-bordered {
		margin: 5px 5px 5px 5px;
		border-collapse: collapse;  
     	border: none;
     	font-size:12px;
		width : 100%;
	}
	.table-bordered>tbody>tr>td, 
	.table-bordered>tbody>tr>th, 
	.table-bordered>tfoot>tr>td, 
	.table-bordered>tfoot>tr>th, 
	.table-bordered>thead>tr>td, 
	.table-bordered>thead>tr>th {
	    border: 1px solid #ddd;
	    padding: 7px;
	} 
</style>
	<form id="form" method="post" data-options="novalidate:true">
		<!-- 标识页面是查看(query)、修改(edit)、新增(add) -->
		<input type="hidden" name="id" id="id"
			value="${rackPage.id}"/>
		<fieldset style="border-color:#F7F7F7;margin: 15px 15px " >
        	<legend>机架详情</legend>
			<table align="center" class="table-bordered" style="margin: 5px auto;text-align: center; ">
				<tr>
					<td style="width: 15%;">机架名称:</td>
					<td style="width: 30%;">${rackPage.name }</td>
					<td style="width: 15%;">机架编码:</td>
					<td style="width: 30%;">${rackPage.no }</td>
				</tr>
				<tr>
					<td style="width: 15%;">资产编号:</td>
					<td>${rackPage.assetCode }</td>
					<td style="width: 15%;">机架类型:</td>
					<td width="30%" >${rackPage.typeName }</td>
				</tr>
				<tr>
					<td style="width: 15%;">所属机房:</td>
					<td>${rackPage.roomName }</td>
					<td style="width: 15%;">列号:</td>
					<td>${rackPage.colno }</td>
					
				</tr>
				<tr>
					<td style="width: 15%;">行号:</td>
					<td>${rackPage.rowno }</td>
					<td style="width: 15%;">机房X坐标:</td>
					<td>${rackPage.xposition }</td>
				</tr>
				<tr>
					<td style="width: 15%;">机房Y坐标:</td>
					<td>${rackPage.yposition }</td>
					<td style="width: 15%;">电源相位:</td>
					<td>${rackPage.power }</td>
				</tr>
				<tr>
					<td style="width: 15%;">业务状态:</td>
					<td>${rackPage.serviceStatusName }</td>
					<td style="width: 15%;">整租客户:</td>
					<td>${rackPage.customerName }</td>
				</tr>
				<tr>
					<td style="width: 15%;">申请单:</td>
					<td>${rackPage.applyid }</td>
					<td style="width: 15%;">机架所有权:</td>
					<td>${rackPage.ownertypename }</td>
				</tr>
				<tr>
					<td style="width: 15%;">机架容量:</td>
					<td>${rackPage.capacity }</td>
					<td style="width: 15%;">维护信息:</td>
					<td style="text-align: left;" colspan="3">${rackPage.maintenanceDept }</td>
				</tr>
	
			</table>
		</fieldset>
	</form>
</body>
</html>