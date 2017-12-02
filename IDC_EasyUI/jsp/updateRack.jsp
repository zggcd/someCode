<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 导入公共资源库 -->
<%@ include file="/pwb/include/common.jspf"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>机房管理</title>
</head>
<body class="easyui-layout">
<style type="text/css">
	.table-bordered {
		margin: 5px auto;
		border-collapse: collapse;  
     	border: none;
     	font-size:12px;
		width : 95%;
	}
	.table-bordered>tbody>tr>td, .table-bordered>tbody>tr>th, .table-bordered>tfoot>tr>td, .table-bordered>tfoot>tr>th, .table-bordered>thead>tr>td, .table-bordered>thead>tr>th {
	    border: 1px solid #ddd;
	    padding: 3px;
	}
</style>
<script type="text/javascript">
	$(function() {
		var roomid = $("#roomid").val();
		//数据表格
		$('#rackDatagrid').datagrid({
			url : "/dCRack?datagrid",
			loadMsg : '数据加载中,请稍候...',
			rownumbers : true,
			idField : 'id',
			pagination : true, //分页控件
			onClickRow : onClickRow,
			pageList : [ 10, 20, 50, 100, 150, 200 ],
			pageSize : 20,
			singleSelect : true,//单选还是多选
			striped : true,
			fit : true,//自适应大小
			queryParams : {
				roomid : roomid,
				 /* rowno : $("#rowno").combobox("getText"),
				colno : $("#colno").combobox("getText")  */
			},
			columns : [ [ {
				title : '机架编码',
				field : 'no',
				halign : 'center',
				align : 'center',
				width : '20%'
			}, {
				title : '机架名称',
				field : 'name',
				halign : 'center',
				align : 'center',
				width : '20%'
			}, {
				title : '列号',
				field : 'colno',
				halign : 'center',
				align : 'center',
				width : '16%'
			}, 
			{
				title : '电源相位',
				field : 'power',
				halign : 'center',
				align : 'center',
				width : '20%',
				editor : 'text'
			} ,{
				title : '行号',
				field : 'rowno',
				halign : 'center',
				align : 'center',
				width : '16%'
			}] ]
		,
		toolbar: [
				{
					id : 'btnSave',
					text : '保存',
					iconCls : 'icon-save',
					handler : function() {
						savepower();//实现添加记录的页面
					}
				},'-',{
					iconCls: 'icon-cancel',
					text:'取消',
					handler: function () {
						roomDialog.dialog('destroy').remove();
						//window.parent.$('#win_rack').window('close');
		            }
				}
		]

		});

	});
	var editIndex = undefined;
	function onClickRow(index, field) {

		if (editIndex != index) {
			if (endEditing()) {
				var row = $("#rackDatagrid").datagrid('getSelected');
				if (row) {
					var rowIndex = $("#rackDatagrid").datagrid('getRowIndex',
							row);
					$("#rackDatagrid").datagrid('beginEdit', rowIndex);
				}
				editIndex = index;
			} else {
				$('#rackDatagrid').datagrid('selectRow', editIndex);
			}
		}
	}
	function endEditing() {
		if (editIndex == undefined) {
			return true
		}
		if ($('#rackDatagrid').datagrid('validateRow', editIndex)) {
			$('#rackDatagrid').datagrid('endEdit', editIndex);
			editIndex = undefined;
			return true;
		} else {
			return false;
		}
	}
	function doSearchPower(roomid,rowno,colno) {
		var roomid=$("#roomid").val();
		var rowno=$("#rowno").combobox("getText");
		var colno=$("#colno").combobox("getText");
		endEditing();
		$('#rackDatagrid').datagrid('load', {
			roomid : roomid,
			rowno : rowno,
			colno : colno 
		});

	}
	function doReSetPower() {
		var roomid=$("#roomid").val();
		var rowno=$("#rowno").combobox("getText");
		var colno=$("#colno").combobox("getText");
		endEditing();
		$('#rowno').combobox('setValues', '');
		$('#colno').combobox('setValues', '');
		doSearchPower(roomid,rowno,colno);
	}
	function savepower() {
		endEditing();
		if ($('#rackDatagrid').datagrid('getChanges').length) {
			var updated = $('#rackDatagrid').datagrid('getChanges', "updated");
			var effectRow = new Object();
			if (updated.length) {
				effectRow["updated"] = JSON.stringify(updated);
			}
			$.post("/dCRack/batchUpdate", effectRow, function(data) {
				if(data.success){
					$.messager.alert("提示", "保存成功！");
					$("#rackDatagrid").datagrid("reload");
				}
				//$('#rackDatagrid').datagrid('acceptChanges');
			}, "JSON").error(function() {
				$.messager.alert("提示", "保存错误了！");
				$("#rackDatagrid").datagrid("reload");
			});
		}
		else{
			$("#rackDatagrid").datagrid("reload");
			$.messager.alert("提示", "未做任何修改！");
		}
	}
</script>
	<div class="easyui-layout" data-options="fit:true,border:false">
		<div data-options="region:'north',border:false">
			<div class="easyui-accordion" data-options="fit:true,border:false">
				<form id="queryCustForm" method="post" data-options="novalidate:true" style="padding-bottom: 5px">
					<table align="center" class="table-bordered">
					<input id ="roomid" name = "roomid" type="hidden" value="${roomid}"/>
						<tr>
							<td style="width: 100px;text-align: center;">第几行:</td>
							<td><input class="easyui-combobox" style="width: 180px;" type="text" id="rowno" name="rowno"
								data-options="valueField:'id',textField:'upsname',url:'/dCRack/rows', editable:false,panelHeight:'200px'"/>
							</td>
							<td style="width: 100px;text-align: center;">第几列:</td>
							<td><input class="easyui-combobox" style="width: 180px;" type="text" id="colno" name="colno"
								data-options="valueField:'id',textField:'upsname',url:'/dCRack/cols', editable:false,panelHeight:'200px'"/>
							</td>
							<td style="border: none;">
								<div style="text-align:center;">
									<a href="#" class="easyui-linkbutton" onclick="doSearchPower();"
										style="width: 50px; margin: 1px 3px;">查询</a> 
									<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doReSetPower();"
										style="width: 50px; margin: 1px 3px;">重置</a> 
								</div>
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<div data-options="region:'center',title:'机架信息'">
			<table id="rackDatagrid"  style="width:auto;" rownumbers="true" fitcolumns="true"></table>
		</div>
	</div>
</body>
</html>