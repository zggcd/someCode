<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 导入公共资源库 -->
<%@ include file="/pwb/include/common.jspf"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户机架列表</title>
</head>
<body>
<style>
	body {
		margin : 0;
		padding : 0;
	}
	table {
		border-collapse: collapse;  
     	border: none;
     	font-size:12px;
	}
	.table-bordered {
		width : 100%;
	}
	.table-bordered>tbody>tr>td, .table-bordered>tbody>tr>th, .table-bordered>tfoot>tr>td, .table-bordered>tfoot>tr>th, .table-bordered>thead>tr>td, .table-bordered>thead>tr>th {
	    border: 1px solid #ddd;
	    padding: 4px;
	}
	.panel-body {
		margin : 2px;
	    border: 1px solid #ccc;
	}
	.datagrid .datagrid-pager {
	    border-top: 1px solid #ccc;
	}
	.datagrid-toolbar {
	    background : #fff;
	    padding : 8px;
	}
	.tool-bar-btn-disabled {
		background : #e5e5e5 !important;
		color : #fff !important;
		cursor : none !important;
	}
</style>
	<fieldset id="searchCondition">
		<legend><b>查询条件  </b></legend>
			<div>
				<form id="queryCustRackForm"  method="post" data-options="novalidate:true">
					<table align="center" style="width:100%;" class="table-bordered">
						<tr>
							<td align="right" width="10%">机架名称:</td>
							<td width="15%"><input type="text" class="easyui-textbox"	name="name" id="find_name" /></td>
							<td  align="right" width="10%">机架类型:</td>
							<td width="15%"><input type="text" class="easyui-combobox" name="typeid" id="find_typeid"
								data-options="url:'/racktype/find_RacktypeList',valueField:'id',textField:'name',panelHeight:'100px',prompt:'--请选择--'" />
							</td>
							<td  align="right" width="10%">业务状态:</td>
							<td width="15%"><input type="text" class="easyui-combobox" name="serviceStatus"
								id="find_serviceStatus"
								data-options="url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_SERVICSTATUS',valueField:'itemCode',textField:'itemName',prompt:'--请选择--'" />
							</td>
							<td align="center" width="25%">
								<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doReSetCustRack();" style="width: 50px; margin: 1px 3px;">重置</a>
								<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doSearchCustRack();" style="width: 50px;  margin: 1px 3px;">查询</a>
							</td>
						</tr>
					</table>
				</form>
			</div>
		</fieldset>
		<table id="custRackDatagrid" class="easyui-datagrid"
			data-options="
							url:'/dCRack?datagrid',
							rownumbers:true,
							queryParams: {
								customerid:$('#id').val()
							},
							loadMsg: '数据加载中,请稍候...',
							idField: 'id',
							striped:true,
							singleSelect:true,
							autoRowHeight:false,
							pagination:true,
							pageSize:10,
							nowrap: false,
							fit:false">
			<thead>
				<tr>
<!-- 					<th data-options="field:'id',checkbox:true">选择</th> -->
					<th data-options="field:'name',halign:'center',align:'center',width:'20%'" >机架名称</th>
					<th data-options="field:'accessno',halign:'center',align:'center',width:'20%'">接入号</th>
					<th data-options="field:'colno',halign:'center',align:'center',width:'20%'">列号</th>
					<th data-options="field:'rowno',halign:'center',align:'center',width:'20%'">行号</th>
					<th data-options="field:'serviceStatusName',halign:'center',align:'center',width:'20%'">业务状态</th>
				</tr>
			</thead>
		</table>
	</div>
	<script type="text/javascript">
	$(function (){
		$('#custRackDatagrid').css({
			 height: $(document).height() - $('#searchCondition').height() -68
		})
		$(window).resize(function () {
			dgResize();
	   });
	})
	
	function dgResize() {
		$('#custRackDatagrid').datagrid('resize', {
			height: $(document).height() - $('#searchCondition').height() -68
	    });
	}
	function doSearchCustRack() {
		var queryParams = $("#custRackDatagrid").datagrid('options').queryParams;
		var queryFormParams = $("#queryCustRackForm").serializeArray();
		$.each(queryFormParams, function(i, field){
			queryParams[field.name] = field.value.trim();
		});
		$("#custRackDatagrid").datagrid('load');
	}
	function doReSetCustRack(){
		$('#queryCustRackForm').form('clear');
		doSearchCustRack();
	}
	</script>
</body>
</html>