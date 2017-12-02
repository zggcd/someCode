<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 导入公共资源库 -->
<%@ include file="/pwb/include/common.jspf"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>机架选择</title>
</head>
<body>
	<div class="easyui-layout" style="width:100%;height:100%;" id="queryRackForIp">
   		<div data-options="region:'north',border:false" style="height:130px;">
   			<form id="queryFrom" method="post">
			<table align="center" class="table-bordered" style="width:98%;">
				<tr>
					<td width="10%" class="align-right">机架名称:</td>
					<td width="15%">
						<input type="text" class="easyui-textbox" name="name" id="name" />
						<input type="hidden" name="customerid" id="${param.customerid }" />
						<input type="hidden" name="status" value="${param.status }">
					</td>
					<td width="10%" class="align-right">机架编码:</td>
					<td width="15%"><input type="text" class="easyui-textbox" name="code"
						id="code" /></td>
				</tr>
				<tr>
					<td></td>
					<td colspan="4">
					    <a href="javascript:void(0);" class="easyui-linkbutton" onclick="doReSetRack();" style="width: 50px;float:left; margin: 1px 3px;">重置</a>
					    <a href="javascript:void(0);" class="easyui-linkbutton" onclick="doSearchRack();" style="width: 50px;float:left; margin: 1px 3px;">查询</a>
					</td>
				</tr>
			</table>
		</form>
   		</div>
	    <div data-options="region:'center'">
			<table id="selectRackDatagrid" class="easyui-datagrid"
				data-options="
								onBeforeLoad:function(){
									$('#selectRackDatagrid').datagrid('clearSelections'); 
								},
								url:'/dCRack?datagrid',
								rownumbers:true,
								loadMsg: '数据加载中,请稍候...',
								idField: 'id',
								striped:true,
								queryParams : {customerid : '${param.customerid }', status : '2'},
								toolbar: [{
									id : 'dialog-btn-ok',
									text:'确定',
									iconCls: 'icon-ok'
								},'-',{
									id : 'dialog-btn-cancel',
									text:'取消',
									iconCls: 'icon-cancel'
								}],
								singleSelect:true,
								autoRowHeight:false,
								pagination:true,
								pageSize:10,
								onLoadSuccess : function(data) {
									$('.datagrid-header-check').html('');
								},
								fit:true">
				<thead>
					<tr>
						<th data-options="field:'id',checkbox:true,width:'5%'">选择</th>
						<th data-options="field:'name',halign:'center',align:'center',width:'20%'">机架名称</th>
						<th data-options="field:'no',halign:'center',align:'center',width:'10%'">机架编号</th>
						<th data-options="field:'roomName',halign:'center',align:'center',width:'13%'">所属机房</th>
						<th data-options="field:'typeName',halign:'center',align:'center',width:'10%'">机架类型</th>
						<th data-options="field:'power',halign:'center',align:'center',width:'10%'">电源相位</th>
						<th data-options="field:'rowno',halign:'center',align:'center',width:'10%'">行号</th>
						<th data-options="field:'colno',halign:'center',align:'center',width:'10%'">列号</th>
					</tr>
				</thead>
			</table>
	    </div>
   	</div>
	<script type="text/javascript">
		function doSearchRack() {
			var queryParams = $("#selectRackDatagrid").datagrid('options').queryParams;
			var queryFormParams = $("#queryRackForIp #queryFrom").serializeArray();
			$.each(queryFormParams, function(i, field) {
				queryParams[field.name] = field.value.trim();
			});
			$("#selectRackDatagrid").datagrid('load');
		}
		function doReSetRack() {
			$('#queryRackForIp .easyui-combobox').combobox('clear');
			$('#queryRackForIp .easyui-textbox').textbox('clear');
			doSearchRack();
		}
	</script>
</body>
</html>