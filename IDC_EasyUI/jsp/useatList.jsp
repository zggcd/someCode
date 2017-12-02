<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 导入公共资源库 -->
<%@ include file="/pwb/include/common.jspf"%>
<%@ include file="/pwb/include/taglib.jsp"%>
<%
	String rackids = request.getAttribute("rackids") + "";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>机位管理</title>
<style type="text/css">
.span_move {
	color: red;
	cursor: pointer;
}

.span_out {
	color: black;
}
</style>
<script type="text/javascript">
	var rackids ='<%=rackids%>';
	$(function() {
		//数据表格
		$('#useatDatagrid').datagrid(
				{
					url : '/dcuseat?datagrid',
					loadMsg : '数据加载中,请稍候...',
					rownumbers : true,
					queryParams : {
						rackid : rackids
					},
					idField : 'id',
					pagination : true, //分页控件
					pageList : [ 10, 20, 50, 100, 150, 200 ],
					pageSize : 20,
					singleSelect : false,//单选还是多选
					striped : true,
					onClickRow : onClickRow,
					fit : true,//自适应大小
					nowrap : true,//数据长度超出列宽时将会自动截取。

					columns : [ [
							{
								title : '选择',
								field : 'id',
								checkbox : true,
								width : 100
							},
							{
								title : '机位编号',
								field : 'code',
								width : 100
							},
							{
								title : 'IT设备',
								field : 'subscode'
							},
							{
								title : 'IT设备ip',
								field : 'subscode'
							},
							{
								title : '网络设备',
								field : 'netDevName'
							},
							{
								title : '客户名称',
								field : 'customerName',
								width : 100
							},
							{
								title : '客户编号',
								field : 'customerid',
								width : 100
							},
							{
								title : '业务状态',
								field : 'status',
								width : 100,
								formatter : function(value, row, index) {
									return getDictLabel(value,
											'IDD_IDC_USEAT_STATUS', '');
								},
								editor : {
									type : 'combobox',
									options : {
										valueField : 'itemCode',
										textField : 'itemName',
										url : '/baseController?getDictList&dictionaryCode=IDD_IDC_USEAT_STATUS',
										required : true
									}
								}
							}, {
								title : '接入号',
								field : 'accessno',
								width : 100
							}

					] ]
				});

	});
	var editIndex = undefined;
	function endEditing() {
		if (editIndex == undefined) {
			return true
		}
		if ($('#useatDatagrid').datagrid('validateRow', editIndex)) {
			var ed = $('#useatDatagrid').datagrid('getEditor', {
				index : editIndex,
				field : 'status'
			});
			var name = $(ed.target).combobox('getText');
			$('#useatDatagrid').datagrid('getRows')[editIndex]['status'] = name;
			$('#useatDatagrid').datagrid('endEdit', editIndex);
			editIndex = undefined;
			return true;
		} else {
			return false;
		}
	}

	function onClickRow(index, field) {

		if (editIndex != index) {
			if (endEditing()) {
				var row = $("#useatDatagrid").datagrid('getSelected');
				if (row) {
					var rowIndex = $("#useatDatagrid").datagrid('getRowIndex',
							row);
					// 					$("#rackDatagrid").datagrid('beginEdit', rowIndex);
					$('#useatDatagrid').datagrid('selectRow', index).datagrid(
							'beginEdit', index);
					var ed = $('#useatDatagrid').datagrid('getEditor', {
						index : index,
						field : field
					});
					editIndex = index;
				} else {
					$('#useatDatagrid').datagrid('selectRow', editIndex);
				}

			}
		}
	}
	function save() {
		endEditing();
		if ($('#useatDatagrid').datagrid('getChanges').length) {
			var updated = $('#useatDatagrid').datagrid('getChanges', "updated");
			var effectRow = new Object();
			if (updated.length) {
				effectRow["updated"] = JSON.stringify(updated);
			}
			$.post("/dCRack/batchUpdate", effectRow, function(rsp) {
				if (rsp.status) {
					$.messager.alert("提示", "提交成功！");
					$dg.datagrid('acceptChanges');
				}
			}, "JSON").error(function() {
				$.messager.alert("提示", "提交错误了！");
			});
		}
	}
</script>
</head>
<body class="easyui-layout">
		<div data-options="region:'north',border:false"
			style="height:60px;padding:10px">
<!-- 			<a href="#" id="add" class="easyui-linkbutton c1" onclick="add();" -->
<!-- 				style=" float: right; margin: 6px 5px;">机架面板图</a>  -->
				<a
				href="#" class="easyui-linkbutton c2" onclick="save();"
				style=" float: right; margin: 6px 5px;">保存</a>
		</div>
	<div data-options="region:'center',title:'机位信息'">

		<table id="useatDatagrid" style="width:auto;" rownumbers="true"
			fitcolumns="true"></table>

		<!-- <div id="operationWin" class="easyui-window"></div> -->
	</div>

</body>
</html>