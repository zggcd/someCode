<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 导入公共资源库 -->
<%@ include file="/pwb/include/common.jspf"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>机房管理</title>
<style>
	body {
		margin : 0;
		border : 1px solid #ddd;
	}
	#queryForm .table-bordered {
	}
	#queryForm .table-bordered>tbody>tr>td, #queryForm .table-bordered>tbody>tr>th, #queryForm .table-bordered>tfoot>tr>td, #queryForm .table-bordered>tfoot>tr>th, #queryForm .table-bordered>thead>tr>td, #queryForm .table-bordered>thead>tr>th {
	    border: 1px solid #ddd;
	    padding: 8px;
	}
</style>

</head>
<body>
<div id="p_rack1" class="easyui-panel" style="height: 30%;">
	<table style="width:100%;height:auto;">
		<tr style="margin:2px;">
			<td>
				<form id="queryRackFrom" method="post" style="border: 1px solid #ddd;padding:5px;margin-bottom:2px;">
					<!-- <input type="hidden" name="treeCheckedIds" id="treeCheckedIds">
					<input type="hidden" name="treeCheckedNames" id="treeCheckedNames">
					<input type="hidden" name="areaid" id="areaid"> <input
						type="hidden" name="areaName" id="areaName"> <input
						type="hidden" name="roomid" id="roomid"> <input
						type="hidden" name="roomName" id="roomName"> -->
					<table align="center;" class="table-bordered">
						<tr>
							<td width="10%">机架名称:</td>
							<td width="15%"><input class="easyui-textbox" type="text" name="name"
								id="name" data-options=""></input></td>
							<td width="10%">机架类型:</td>
							<td width="15%"><input class="easyui-combobox" id="typeid" name="typeid"
								data-options="panelHeight:'200px',url:'/racktype/find_RacktypeList',valueField:'id',textField:'name',prompt:'--请选择--'">
							</td>
							<td width="10%">业务状态:</td>
							<td width="15%"><input class="easyui-combobox" id="serviceStatus"
								name="serviceStatus"
								data-options="url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_SERVICSTATUS',valueField:'itemCode',textField:'itemName',prompt:'--请选择--'">
							</td>
							<td width="10%">用途:</td>
							<td width="15%"><input class="easyui-combobox" id="useful" name="useful"
								data-options="url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_USERFUL',valueField:'itemCode',textField:'itemName',prompt:'--请选择--'">
							</td>
						</tr>
						
						<tr>
							<td width="10%">维护状态:</td>
							<td width="15%"><input class="easyui-combobox" id="maintstatus"
								name="maintstatus"
								data-options="url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_MAINTSTATUS',valueField:'itemCode',textField:'itemName',prompt:'--请选择--'">
							</td>
							<td width="10%">整租客户:</td>
							<td width="15%">
							<input class="easyui-textbox" name="customername" id="customername_search"  style="height:32px;"
										 data-options="buttonText:'选择',
											prompt:'---请选择客户---',
											editable:false,
										  	onClickButton:function(){
										  		createBoxForCust('search','doConfirmCustRack','Y');
										  	}
						   					"/>
							<input type="hidden" id="customerid_search" name="customerid"/>
	            			<input type="hidden" id="areaid_seach" name="areaid"/>
							<td align="center" colspan="4">
								<a href="javascript:void(0)" class="easyui-linkbutton" onclick="doReSetRack();" style="width: 50px; margin: 1px 3px;">重置</a> 
								<a href="javascript:void(0)" class="easyui-linkbutton" onclick="doSearchRack();" style="width: 50px;  margin: 1px 3px;">查询</a>
							</td>
						</tr>
					</table>
				</form>
			<td>
		</tr>
		<!-- <tr style="margin:2px;height:auto;">
			<td style="margin:2px;height:auto;min-height:200px;">
				<div id="rackDatagrid" style="height:auto;overflow:auto;min-height:200px;"></div>
			</td>
		</tr>
		<tr style="margin:2px;padding:5px;border:1px solid #ddd;text-align:center;">
			<td style="margin:2px;"><button  style="width:40px" onclick="selectRack();" class="l-btn l-btn-small">确认</button></td>
		</tr> -->
	</table>
	</div>
	<div id="p_rack2" class="easyui-panel" style="height: 70%;">
		<table id="rackDatagrid"></table>
	</div>
	
	<script type="text/javascript">
	//数据表格ID
// 	var datagrid = "rackDatagrid";
	//数据列表数据地址
// 	var datagridUrl = "/rack?datagrid";
	var queryRackFrom = 'queryRackFrom';
	$(function() {
		//数据表格
		$('#rackDatagrid').datagrid(
						{
							url : "/dCRack?datagrid",
							loadMsg : '数据加载中,请稍候...',
							rownumbers : true,
							idField : 'id',
							pagination : true, //分页控件
							pageList : [ 10, 20, 50, 100, 150, 200 ],
							pageSize : 10,
							checkbox : false,
							queryParams: {
								roomid: addToRackRoomId,
							},
							singleSelect : true,//单选还是多选
							striped : true,
							fit : true,//自适应大小
							nowrap : false,//数据长度超出列宽时将会自动截取。
							fitColumns:true,
							columns : [ [
							        {title : '选择',field : 'id',checkbox : true,halign:'center',align:'center'},
									{title : '机架编码',field : 'no',halign:'center',align:'center',width : '200'},
									{title : '机架名称',halign:'center',align:'center',field : 'name',width : '200'},
									{title : '机架类型',halign:'center',align:'center',field : 'typeName',width : '200'},
									{title : '所属机房ID',halign:'center',align:'center',field : 'roomName',width : '200'},
									{title : '所属区域',halign:'center',align:'center',field : 'areaName',width : '200'},
									{title : '租用类型',halign:'center',align:'center',field : 'hiretypeName',width :'100'}

							] ],
							onLoadSuccess : function(data) {
								$(".datagrid-header-check").html("");
							},
							toolbar: [{
								iconCls: 'icon-ok',
								text:'确定',
								handler:function(){
									selectRack();
								}
							},'-',{
								iconCls: 'icon-cancel',
								text:'取消',
								handler: function () {
					            	cancelSelectRack();
					            }
						}]
						});

	});

	function doConfirmCustRack(){
		var rowData = $('#customerDatagrid').datagrid('getSelected');
		if($('#custFlagParams').val()=='search'){
			$('#customerid_search').val(rowData.id);
			$('#customername_search').textbox('setValue',rowData.clientname);
		}else{
			$('#customerid_add').val(rowData.id);
			$('#customername_add').textbox('setValue',rowData.clientname);
		}
		$('#queryCustomer').dialog('destroy').remove();
	}
	
	function doReSetRack(){
		$('#queryRackFrom .easyui-combobox').combobox('clear');
		$('#queryRackFrom').form('clear');
		doSearchRack();
	}
	
	//查询
	function doSearchRack() {
		var queryParams = $("#rackDatagrid").datagrid('options').queryParams;
		var queryFormParams = $("#" + queryRackFrom).serializeArray();
		$.each(queryFormParams, function(i, field) {
			queryParams[field.name] = field.value;
		});
		$("#rackDatagrid").datagrid('load');
	}
	
	function selectRack() {
		var rows = $("#rackDatagrid").datagrid('getSelections');
	    if (rows.length == 0) {
	    	$.messager.alert('提示', '请选择一条记录!');
	    	return;
	    }
	    var row = rows[0];
		$('#rackid').val(row.id);
		$('#rackName').textbox('setValue',row.name);
		selectUseat(row.id);
	    cancelSelectRack();
	}
	function cancelSelectRack() {
		$('#queryRack').dialog('destroy').remove();
	}

</script>
</body>
</html>