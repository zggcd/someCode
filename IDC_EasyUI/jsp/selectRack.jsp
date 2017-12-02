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
	<style type="text/css">
		.table-bordered {
			margin: 5px 5px 5px 5px;
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
	<!-- 标识参数，根据标识参数确定返回的值填充到指定的位置 -->
	<input id="rackFlagParams" type="hidden">
	<div class="easyui-layout" data-options="fit:true,border:false">
		<div data-options="region:'north',border:false">
			<div class="easyui-accordion" data-options="fit:true,border:false">
				<form id="querySelectRackFrom" method="post"
					data-options="novalidate:true">
					<table align="center" class="table-bordered" style="margin: 5px auto">
						<tr>
							<td >所属机房:</td>
							<td ><input type="hidden" name="roomid" id="inRack_roomid" value="${rack.roomid }"/>
								<input type="text" class="easyui-textbox" name="roomName" value="${rack.roomName }"
								id="inRack_roomname" style="height: 32px;"
								data-options="
									prompt:'---请选择机房---',
									editable:false,
									hasDownArrow:false,
									buttonText:'选择',
									onClickButton:function() {
										createBoxForArea('', 'room', 'doConfirmNativeNetInRack','','Y');
										
									}" /></td>
							<td >机架名称:</td>
							<td ><input type="text" class="easyui-textbox" name="name"
								id="name" /></td>
							<td>机架类型:</td>
							<td ><input class="easyui-combobox" type="text" id="typeid"
								name="typeid"
								data-options="url:'/racktype/find_RacktypeList',valueField:'id',textField:'name',prompt:'--请选择--',panelHeight:'200px'"></input>
							</td>
							<td>业务状态:</td>
							<td ><input class="easyui-combobox" type="text"
								id="serviceStatus" name="serviceStatus"
								data-options="
								url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_SERVICSTATUS',
								valueField:'itemCode',
								textField:'itemName',
								prompt:'--请选择--',
								panelHeight:'auto'
								"></input></td>
								
						</tr>
						<tr>
							<td >维护状态:</td>
							<td><input class="easyui-combobox" type="text"
								id="maintstatus" name="maintstatus"
								data-options="
								url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_MAINTSTATUS',
								valueField:'itemCode',
								textField:'itemName',
								prompt:'--请选择--',
								panelHeight:'auto'
								"></input></td>
							<td >用途:</td>
							<td><input class="easyui-combobox" type="text" id="useful"
								name="useful"
								data-options="
								url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_USERFUL',
								valueField:'itemCode',
								textField:'itemName',
								prompt:'--请选择--',
								panelHeight:'auto'
								"></td>
							<td >整租客户:</td>
							<td><input type="hidden" id="inRack_customerid" name="customerid" />
								<input class="easyui-textbox" id="inRack_customername"
								style="height:32px;"data-options="
										buttonText:'选择',
										prompt:'---请选择客户---',
										editable:false,
									  	onClickButton:function(){
									  		createBoxForCust('','doConfirmCustInRack','Y');
									  	}" />
							</td>
							<td >租用类型:</td>
							<td>
								<input class="easyui-combobox" type="text" id="inRack_hiretype" name="hiretype"
									data-options="
									url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_HIRETYPE',
									valueField:'itemCode',
									textField:'itemName',
									prompt:'--请选择--',
									panelHeight:'auto'
									" />
							</td>
							
						</tr>
						<tr>
							<td colspan="8" style="text-align:right;border: none">
							<a href="javascript:void(0)" class="easyui-linkbutton" onclick="doSearchRack();"
								style="width: 50px;  margin: 1px 6px 5px 6px;">查询</a>
							<a href="javascript:void(0)"
								class="easyui-linkbutton" onclick="doReSetRack();"
								style="width: 50px;  margin: 1px 6px 5px 6px;">重置</a> </td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<div data-options="region:'center',title:'机架信息'">
			<table id="selectRackDatagrid" class="easyui-datagrid"
			data-options="
				onBeforeLoad:function(){
					$('#selectRackDatagrid').datagrid('clearSelections'); 
				},
				url:'/dCRack?datagrid&areaids='+'${param.areaid}',
				queryParams:{
					roomid:$('#inRack_roomid').val()
				},
				rownumbers:true,
				loadMsg: '数据加载中,请稍候...',
				idField: 'id',
				striped:true,
				toolbar: [{
						iconCls: 'icon-ok',
						id:'isOk',
						text:'确定',
						handler:function(){
							doConfirmSelect(rackMethodCall)
						}
					},'-',{
						iconCls: 'icon-cancel',
						text:'取消',
						handler: function () {
			            	closeRackWin();
			            }
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
					<th data-options="field:'id',checkbox:true">选择</th>
					<th data-options="field:'name',halign:'center',align:'center',width:'auto'">机架名称</th>
					<th data-options="field:'no',halign:'center',align:'center',width:'20%'">机架编号</th>
					<th data-options="field:'roomName',halign:'center',align:'center',width:'20%'">所属机房</th>
					<th data-options="field:'roomid',halign:'center',align:'center',width:'auto',hidden:true">所属机房</th>
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
		function doConfirmNativeNetInRack() {
			var node = $('#localNetTree').tree('getSelected');
			if (node != null) {
				if (node.attributes.type == 'room') {
					$('#inRack_roomid').val(node.id);
					$('#inRack_roomname').textbox('setValue',node.text);
				}else{
					$.messager.alert('提示', '请选择机房!');
					return;
				}
			}
			$('#queryArea').dialog('destroy').remove();
		}
		/* <!-- 客户选择 --> */
		function doConfirmCustInRack() {
			var rowData = $('#customerDatagrid').datagrid('getSelected');
			if(rowData!=null){
				$('#inRack_customerid').val(rowData.id);
				$('#inRack_customername').textbox('setValue',rowData.clientname);
			}
			$('#queryCustomer').dialog('destroy').remove();
		}
		function closeRackWin() {
			$('#queryRack').dialog('destroy').remove();
		}
		function doSearchRack() {
			var queryParams = $("#selectRackDatagrid").datagrid('options').queryParams;
			var queryFormParams = $("#querySelectRackFrom").serializeArray();
			$.each(queryFormParams, function(i, field) {
				queryParams[field.name] = field.value.trim();
			});
			$("#selectRackDatagrid").datagrid('load');
		}
		function doReSetRack() {
			$('#querySelectRackFrom .easyui-combobox').combobox('clear');
			$('#querySelectRackFrom').form('clear');
			//doSearchRack();
		}
	</script>
</body>
</html>