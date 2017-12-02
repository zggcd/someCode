<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 导入公共资源库 -->
<%@ include file="/pwb/include/common.jspf"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
</style>
</head>
<body class="easyui-layout">
	<style type="text/css">
.table-bordered {
	margin: 5px auto 8px auto;
	border-collapse: collapse;
	border: none;
	font-size: 12px;
	width: 95%;
}

.table-bordered>tbody>tr>td,.table-bordered>tbody>tr>th,.table-bordered>tfoot>tr>td,.table-bordered>tfoot>tr>th,.table-bordered>thead>tr>td,.table-bordered>thead>tr>th
	{
	border: 1px solid #ddd;
	padding: 3px;
}
</style>
<script type="text/javascript">
//# sourceURL=updateRackType.js
	var typeComboBox = '${typeComboBox}';
	var typeComboBox = JSON.parse(typeComboBox);

	var name = "";
	$(function() {
		var roomid = $("#roomid").val();
		//数据表格
		$('#dCRackDatagrid').datagrid({
			url : "/dCRack?datagrid",
			loadMsg : '数据加载中,请稍候...',
			rownumbers : true,
			idField : 'id',
			pagination : true, //分页控件
			onClickCell : onClickCell,
			pageList : [ 10, 20, 50, 100, 150, 200 ],
			pageSize : 20,
			singleSelect : true,//单选还是多选
			fitColumns : true,
			striped : true,
			 queryParams : {
				roomid : roomid
				/* rowno : $("#rowno").combobox("getText"),
				colno : $("#colno").combobox("getText") */
			}, 
			fit : true,//自适应大小
			nowrap : true,//数据长度超出列宽时将会自动截取。
			
		columns : [ [ {
				title : '机架编码',
				halign : 'center',
				align : 'center',
				field : 'no',
				width : '20%'
			}, {
				title : '机架名称',
				halign : 'center',
				align : 'center',
				field : 'name',
				width : '20%'
			}, {
				title : '列号',
				field : 'colno',
				halign : 'center',
				align : 'center',
				width : '20%'
			},{
				title : '机架类型',
				field : 'typeid',
				halign : 'center',
				align : 'center',
				width : '25%',
				fix : true,
				formatter : function(value, row) {
					var name;
					$.ajax({
						url : "/racktype/getRacktype/" + value,
						async : false,
						success : function(data) {
							data=JSON.parse(data);
							name = data.name
						}
					});
					return name;
				},
				editor : {
					type : 'combobox',
					options : {
						valueField : 'id',
						textField : 'name',
						// url : '/racktype/find_RacktypeList',
						data : typeComboBox,
						required : true,
						hasDownArrow : false,
						panelHeight:'200px',
						editable : false
					}
				}
			}, {
				title : '行号',
				field : 'rowno',
				halign : 'center',
				align : 'center',
				width : '15%'
			} ] ],
			toolbar : [ {
				id : 'btnSave',
				text : '保存',
				iconCls : 'icon-save',
				handler : function() {
					saveRackType();//实现添加记录的页面
				}
			}, '-', {
				iconCls : 'icon-cancel',
				text : '取消',
				handler : function() {
					roomDialog.dialog('destroy').remove();
					//window.parent.$('#win_rack').window('close');
				}
			} ]

		});

	});
	function getName(names) {
		name = names
		alert(name + "1")
		return name;
	}
	var editIndex = undefined;
	function onClickCell(index, field,value) {
		if(field!='typeid'){
			endEditing();
		}else{
			if (editIndex != index) {
				if (endEditing()) {
					var row = $("#dCRackDatagrid").datagrid('getSelected');
					if (row) {
						var rowIndex = $("#dCRackDatagrid").datagrid('getRowIndex',
								row);
						// 					$("#dCRackDatagrid").datagrid('beginEdit', rowIndex);
						$('#dCRackDatagrid').datagrid('selectRow', index).datagrid(
								'beginEdit', index);
						var ed = $('#dCRackDatagrid').datagrid('getEditor', {
							index : index,
							field : field
						});
						editIndex = index;
					} else {
						$('#dCRackDatagrid').datagrid('selectRow', editIndex);
					}
				}
			}
		}
	}
	function doSearchRackType(roomid,rowno,colno) {
		var roomid=$("#roomid").val();
		var rowno=$("#rowno").combobox("getText");
		var colno=$("#colno").combobox("getText");
		endEditing();
		$('#dCRackDatagrid').datagrid('load', {
			roomid : roomid,
			rowno : rowno,
			colno : colno 
		});

	}
	function doReSetRackType() {
		var roomid=$("#roomid").val();
		var rowno=$("#rowno").combobox("getText");
		var colno=$("#colno").combobox("getText");
		endEditing();
		$('#rowno').combobox('setValues', '');
		$('#colno').combobox('setValues', '');
		doSearchRackType(roomid,rowno,colno);
	}
	function endEditing() {
		if (editIndex == undefined) {
			return true
		}
		if ($('#dCRackDatagrid').datagrid('validateRow', editIndex)) {
			var ed = $('#dCRackDatagrid').datagrid('getEditor', {
				index : editIndex,
				field : 'typeid'
			});
			var name='';
			if(ed!=null){
				name =$(ed.target).combobox('getText');
			}
			//var name = $(ed.target).combobox('getText');
			$('#dCRackDatagrid').datagrid('getRows')[editIndex]['typeid'] = name;
			$('#dCRackDatagrid').datagrid('endEdit', editIndex);
			editIndex = undefined;
			return true;
		} else {
			return false;
		}
	}
	function saveRackType() {
		endEditing();
		if ($('#dCRackDatagrid').datagrid('getChanges').length) {
			var updated = $('#dCRackDatagrid').datagrid('getChanges', "updated");
			var effectRow = new Object();
			if (updated.length) {
				effectRow["updated"] = JSON.stringify(updated);
			}
			$.post("/dCRack/batchUpdate", effectRow, function(data) {
				if (data.success) {
					$.messager.alert("提示",data.msg);
					//$dg.datagrid('acceptChanges');
					$("#dCRackDatagrid").datagrid("reload");
				}else{
					$.messager.alert("提示",data.msg);
					return;
				}
			}, "JSON").error(function() {
				$.messager.alert("提示", "提交错误了！");
				$("#dCRackDatagrid").datagrid("reload");
			});
		}
		else{
			$("#dCRackDatagrid").datagrid("reload");
			$.messager.alert("提示", "未做任何修改！");
		}
	}
</script>
	<div class="easyui-layout" data-options="fit:true,border:false">
		<div data-options="region:'north',border:false">
			<div class="easyui-accordion" data-options="fit:true,border:false">
				<form id="queryCustForm" method="post" data-options="novalidate:true" style="padding-bottom: 3px">
					<table align="center" class="table-bordered" >
						<input id="roomid" name="roomid" type="hidden" value="${roomid}" />
						<tr>
							<td style="width: 100px; text-align: center;">第几行:</td>
							<td><input class="easyui-combobox" style="width: 180px;"
								type="text" id="rowno" name="rowno"
								data-options="valueField:'id',textField:'upsname',url:'/dCRack/rows', editable:false,panelHeight:'100px'"></input>
							</td>
							<td style="width: 100px; text-align: center;">第几列:</td>
							<td><input class="easyui-combobox" style="width: 180px;"
								type="text" id="colno" name="colno"
								data-options="valueField:'id',textField:'upsname',url:'/dCRack/cols', editable:false,panelHeight:'200px'"></input>
							</td>
							<td style="border: none;">
								<div style="text-align: left;">
									<a href="#" class="easyui-linkbutton" onclick="doSearchRackType();"
										style="width: 50px; margin: 1px 8px;">查询</a>
									<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doReSetRackType();"
										style="width: 50px; margin: 1px 0px;">重置</a> 
								</div>
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<div data-options="region:'center',title:'机架信息'">
			<table id="dCRackDatagrid"></table>
		</div>
	</div>
</body>
</html>