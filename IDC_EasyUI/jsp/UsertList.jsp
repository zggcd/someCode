<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 导入公共资源库 -->
<%@ include file="/pwb/include/common.jspf" %>
<%@ include file="/pwb/include/taglib.jsp"%>
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
	/**
	 * 说明：
	 1.尽量不直接访问静态资源(安全以及保证数据取到的是最新，基础数据获取等)，
	
	 */

	//权限校验的URL
	var checkOperationUrl = "/dCRack?checkOperation";
	//模块编号
	var modelCode = "IDM_IDC_RM_RACK";
	//需校验模块下的元素集合,key为id,value为元素编号
	var elementCodeMap = {
		'add' : 'IDE_INSERT_rack'
	};

	//数据表格ID
	var datagrid = "rackDatagrid";
	//数据列表数据地址
	var datagridUrl = "/dCRack?datagrid";

	//对话窗口
	var rackDialog;
	//对话窗口from表单ID
	var formId = "form";

	//新增或修改后台连接地址
	var toAddOrupdateUrl = "/dCRack?addorupdate";

	//新增或修改 保存URL
	var addOrupdateUrl = "/dCRack?save";

	//批量删除URL
	var deleteUrl = "/dCRack?doBatchDelete";

	//左侧树ID
	var treeid = "dataTree";
	//左侧树查询表单ID
	var queryFrom = "queryFrom";
	

	var treeUrl = "/orgOrganization/treeData/room?displayType=DC";
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
	
	$(function() {
		//权限处理
		checkOperation(checkOperationUrl, modelCode, elementCodeMap);
		//树加载
		$('#dataTree').tree({    
		    url: '/orgOrganization/treeData/room',
		    checkbox: true,
		    animate: true,
		    lines: true,
		    onBeforeExpand: function(node){
		    	$('#'+treeid).tree('options').url = treeUrl+'&type='+node.attributes.type;
		    }
		});
		//数据表格
		$('#' + datagrid)
				.datagrid(
						{
							url : datagridUrl,
							loadMsg : '数据加载中,请稍候...',
							rownumbers : true,
							idField : 'id',
							pagination : true, //分页控件
							pageList : [ 10, 20, 50, 100, 150, 200 ],
							pageSize : 20,
							singleSelect : false,//单选还是多选
							striped : true,
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
										title : '机架编码',
										field : 'no',
										width : 100
									},
									{
										title : '机架名称',
										field : 'name',
										formatter : formatName
									},
									{
										title : '机架类型',
										field : 'typeName',
										formatter : formatName
									},
									{
										title : '所属机房ID',
										field : 'roomName',
										formatter : formatName
									},
									{
										title : '列号',
										field : 'colno',
										width : 100
									},
									{
										title : '行号',
										field : 'rowno',
										width : 100
									},
									{
										title : '机房X坐标',
										field : 'xposition',
										width : 100
									},
									{
										title : '机房Y坐标',
										field : 'yposition',
										width : 100
									},
									{
										title : '电源相位',
										field : 'power',
										width : 100
									},
									{
										title : '业务状态',
										field : 'serviceStatus',
										width : 100, formatter: function(value,row,index){
							      			return getDictLabel(value, 'IDD_IDC_RACK_SERVICSTATUS', '');
							      		} 
									},
									{
										title : '整架租用的客户',
										field : 'customerName',
										width : 100,
										formatter : formatName
									},
									{
										title : '维护信息',
										field : 'maintenanceDept'
									},
									
									{
										title : '开始使用日期',
										field : 'startDate',
										width : 100
									},
									{
										title : '所有者类型',
										field : 'ownertype',
										width : 100, formatter: function(value,row,index){
							      			return getDictLabel(value, 'IDD_IDC_RACK_OWNERTYPE', '');
							      		} 
									},
									{
										title : '机架容量',
										field : 'capacity',
										width : 100
									},
									{
										title : '机架维护状态',
										field : 'maintstatus',
										width : 100, formatter: function(value,row,index){
							      			return getDictLabel(value, 'IDD_IDC_RACK_MAINTSTATUS', '');
							      		} 
									},
									{
										title : '机架用途',
										field : 'useful',
										width : 100, formatter: function(value,row,index){
							      			return getDictLabel(value, 'IDD_IDC_RACK_USEFUL', '');
							      		} 
									}, {
										title : '创建时间',
										field : 'createtime',
										width : 100
									}, {
										title : '更新时间',
										field : 'updatetime',
										width : 100
									}

							] ],
							/*,
							toolbar: [
								{id: 'btnAdd', text: '新增', iconCls: 'icon-add', handler: add},
								{id: 'btnUpdate', text: '修改', iconCls: 'icon-edit', handler: update},
								{id: 'btnDelete', text: '删除', iconCls: 'icon-remove', handler: deleteALLSelect}
							],*/
							toolbar : [
									{
										id : 'btnAdd',
										text : '新增',
										iconCls : 'icon-add',
										handler : function() {
											addWin();//实现添加记录的页面
										}
									},
									'-',
									{
										id : 'btnUpdate',
										text : '修改',
										iconCls : 'icon-edit',
										handler : function() {
											updates();//实现修改记录的方法
										}
									},
									'-',
									{
										id : 'btnDelete',
										text : '删除',
										iconCls : 'icon-remove',
										handler : function() {
											deleteALLSelect(datagrid, deleteUrl);//实现直接删除数据的方法
										}
									},
									'-',
									{
										id : 'changeUseat',
										text : '机位互换',
										iconCls : 'icon-edit',
										handler : function() {
											document
													.getElementById('catalog_iframe').src = "/dCRack/changUseat";
											$('#win_details').dialog('open')
													.dialog('setTitle', '机位互换');
										}
									},
									'-',
									{
										id : 'rackRelIP',
										text : '建立IP关联',
										iconCls : 'icon-edit',
										handler : function() {
											var rowsData = $('#' + datagrid).datagrid('getSelections');
											if (!rowsData || rowsData.length == 0) {
												tip('请选择一个机架');
												return;
											}
											if (rowsData.length > 1) {
												tip('请选择一个机再在转换');
												return;
											}
											document
													.getElementById('catalog_iframe').src = "/dCRack/rackToIPs/"+rowsData[0].id;
											$('#win_details').dialog('open')
													.dialog('setTitle', '建立IP关联');
										}
									},
									'-',
									{
										id : 'changeRack',
										text : '机架互换',
										iconCls : 'icon-edit',
										handler : function() {
											var rowsData = $('#' + datagrid).datagrid('getSelections');
											if (!rowsData || rowsData.length == 0) {
												tip('请选择一个机架');
												return;
											}
											if (rowsData.length > 1) {
												tip('请选择一个机再在转换');
												return;
											}
											$("#rackname1").textbox('setValue',rowsData[0].name);
											$("#rackid1").val(rowsData[0].id);
											$('#win_details2').dialog('open').dialog('setTitle', '机架互换');
										}
									},
									'-',
									{
										id : 'btnView',
										text : '查看',
										iconCls : 'icon-edit',
										handler : function() {
											var row = $('#' + datagrid).datagrid('getSelections');
							        		if (row == null) {
							        			$.messager.alert("提示", "请选择一个机架！", "info");
							        			return;
							        		}
							        		if (row.length > 1) {
							    				$.messager.alert("提示", "请选择一个机架,不能选择多个机架！", "info");
							    				return;
							    			}
							        		rackDialog = view(datagrid, '机架信息', toAddOrupdateUrl);//实现查看记录详细信息的方法
										}
									},
									'-',
									{
										id : 'btnReload',
										text : '刷新',
										iconCls : 'icon-reload',
										handler : function() {
											$("#" + datagrid)
													.datagrid("reload");
										}
									} ]
						});

	});

	//重置 
	function doReSet() {
		$('#' + queryFrom).form('clear');
		doSearch();
	}
	function formatName(value) {
		return "<span title='"
				+ value
				+ "'  onmouseover='this.className=\"span_move\"'  onclick=\"NameShow()\" onmouseout='this.className=\"span_out\"'>"
				+ value + "</span>";
	}
	//查询
	function doSearch(){
		var queryParams = $("#"+datagrid).datagrid('options').queryParams;
		var nodes = $('#'+treeid).tree('getChecked');;
		var treeCheckedIds = '';
		if (nodes != null) {
			for(var i=0; i<nodes.length; i++){
				if (treeCheckedIds != '') treeCheckedIds += ',';
				treeCheckedIds += nodes[i].id;
			}
		} 
		queryParams['areaids'] = treeCheckedIds;
		var queryFormParams = $("#"+queryFrom).serializeArray();
		$.each(queryFormParams, function(i, field){
			queryParams[field.name] = field.value;
		});
		$("#"+datagrid).datagrid('load');
	}

	//新增
	function addWin() {
		var nodes = $('#'+treeid).tree('getChecked');//, 'indeterminate'：半选中状态
		if(nodes.length > 0){
			var treeCheckedIds = '';
			var treeCheckedNames = '';
			var roomCount = 0;
			var roomNode;
			var areaid;
			var areaname;
			var roomid;
			var roomname;
			for(var i=0; i<nodes.length; i++){
				//alert(nodes[i].id+"="+nodes[i].text+"="+nodes[i].attributes.type);
				if (treeCheckedIds != '') treeCheckedIds += ',';
				treeCheckedIds += nodes[i].id;
				if (treeCheckedNames != '') treeCheckedNames += ',';
				treeCheckedNames += nodes[i].text;
				if(nodes[i].attributes.type == 'room'){//节点类型是机房
					roomCount ++;
					roomNode = nodes[i];
				}
			}
			$('#treeCheckedIds').val(treeCheckedIds);
			$('#treeCheckedNames').val(treeCheckedNames);
			// 类型判断
			if(roomCount == 1 && roomNode.attributes.type == 'room'){//节点类型是机房
				//上级节点：所属区域
				var parentNode = $('#'+treeid).tree('getParent',roomNode.target);
				areaid=parentNode.id;
				areaname=parentNode.text;
				roomid=roomNode.id;
				roomname=roomNode.text;
			}
			else{
				$.messager.alert('提示','请在区域树上选择一个机房!');
				return;
			}
		}
		else{
			$.messager.alert('提示','请在区域树上选择一个机房!');
			return;
		}
		var queryParams = {
			'pageType' : 'add',
			'areaid': areaid,
			'areaName': areaname,
			'roomid': roomid,
			'roomName': roomname
		};
		rackDialog = add(datagrid, '机架信息录入', toAddOrupdateUrl, queryParams);
	}
	function find_cust() {
		var queryParams = $("#kehulist").datagrid('options').queryParams;
		var queryFormParams = $("#getcustForm").serializeArray();
		alert(queryFormParams[0]);
		$.each(queryFormParams, function(i, field) {
			queryParams[field.name] = field.value.trim();
		});
		$("#kehulist").datagrid('load');

	}

	//表单重置 
	function doFormReSet() {
		$('#' + formId).form('clear');
	}
	//表单取消
	function doFormCancel() {
		rackDialog.dialog("destroy").remove();
	}

	//保存(新增或修改)
	function save() {
		$('#' + formId).form('submit', {
			url : addOrupdateUrl,
			onSubmit : function() {
				return $(this).form('validate');
			},
			success : function(data) {
				var resultData = $.parseJSON(data);
				if (resultData.success) {
					$.messager.alert('提示', resultData.msg);
					doFormCancel();//关闭窗口
					$('#' + datagrid).datagrid('load');
				} else {
					$.messager.alert('提示', '保存失败!');
				}
			}
		});
	}
	//新增
	/*function add() {
		var nodes = $('#' + treeid).tree('getChecked');
		/*
		if(nodes.length == 1){
			//$('#roomid').val(nodes[0].id);
			//$('#roomid').textbox('setValue', nodes[0].text);
		}
		else if(nodes.length > 1){
			$.messager.alert('提示','只能选择一个机房!');
			return;
		}
		else{
			$.messager.alert('提示','请在区域树上选择一个机房!');
			return;
		}
		 */
		/*var titile = "机房信息录入";
		//$('#dlg').dialog('open').dialog('center').dialog('setTitle', titile);
		//$('#fm').form('clear');
		createDialog(dialogId, titile, toAddOrupdateUrl);
	}*/
	/* <!-- 机架选择 --> */
	function doConfirmRack(){
		var rowData = $('#selectRackDatagrid').datagrid('getSelected');
		if($('#rackFlagParams').val()=='search'){
			$('#rackid_search').val(rowData.id);
			$('#rackname_search').textbox('setValue',rowData.name);
			if(rowData.id == $('#rackid1').val()){
				alert('互换机架不能相同，请重新选择！！');
				$('#rackid_search').val('');
				$('#rackname_search').textbox('setValue','');
			}
		}else{
 			$('#rackid_add').val(rowData.id);
 			$('#rackname_add').textbox('setValue',rowData.name);
		}
		$('#queryRack').dialog('destroy').remove();
	}
	//修改
	function updates() {
		var rowsData = $('#' + datagrid).datagrid('getSelections');
		if (!rowsData || rowsData.length == 0) {
			tip('请选择编辑项目');
			return;
		}
		if (rowsData.length > 1) {
			tip('请选择一条记录再编辑');
			return;
		}
		var row = rowsData[0];
		var titile = '机架信息更新';
		rackDialog = update(datagrid, titile, toAddOrupdateUrl);//实现查看记录详细信息的方法;//实现修改记录的方法
	}
	function saveRackSwap(){
		if($("#rackid_search").val()!=null && $("#rackid").val()!=""){
			$.ajax({
				type:"POST",
				url : "/dCRack/changeOut",
				data : {
					"oldRackid" : $("#rackid1").val(),
					"newRackid" : $("#rackid_search").val()
				},
				//返回数据的格式
				datatype : "json",//"xml", "html", "script", "json", "jsonp", "text".
				success : function(data) {
					data=JSON.parse(data);
					$.messager.alert('提示', data.msg);
					$('#win_details2').dialog('destroy').remove();
				},
				error : function(e) {
					alert("error");
				}
			});
		}else{
			$.messager.alert('提示', '请选择要进行转换的机架!');
		}
	}
	//保存(新增或修改)
	function save() {
		$('#' + formId).form('submit', {
			url : addOrupdateUrl,
			onSubmit : function() {
				return $(this).form('validate');
			},
			success : function(data) {
				var resultData = $.parseJSON(data);
				if (resultData.success) {
					$.messager.alert('提示', resultData.msg);
					doFormCancel();//关闭窗口
					$('#' + datagrid).datagrid('load');
				} else {
					$.messager.alert('提示', '保存失败!');
				}
			}
		});
	}
	// 	批量删除
	// 	function deleteALLSelect() {
	// 		var ids = [];
	// 		var rows = $("#" + datagrid).datagrid('getSelections');
	// 		if (rows.length > 0) {
	// 			$.messager.confirm('确认', '你确定永久删除该数据吗？', function(r) {
	// 				if (r) {
	// 					for (var i = 0; i < rows.length; i++) {
	// 						ids.push(rows[i].id);
	// 					}
	// 					$.ajax({
	// 						url : deleteUrl,
	// 						type : 'post',
	// 						data : {
	// 							ids : ids.join(',')
	// 						},
	// 						cache : false,
	// 						success : function(data) {
	// 							var resultData = $.parseJSON(data.jsonStr);
	// 							if (resultData.success) {
	// 								var msg = resultData.msg;
	// 								$.messager.alert('提示', msg);
	// 								$('#' + datagrid).datagrid('load');
	// 								$("#" + datagrid).datagrid('unselectAll');
	// 								ids = '';
	// 							}
	// 						}
	// 					});
	// 				}
	// 			});
	// 		} else {
	// 			tip("请选择需要删除的数据");
	// 		}
	// 	}
</script>
</head>
<body class="easyui-layout">
	<div data-options="region:'west',split:true,title:'查询条件'"
		style="width:250px;">
		<div class="easyui-layout" data-options="fit:true,border:false">
			<div data-options="region:'north',border:false"
				style="height:65%;padding:10px">
				<ul id="dataTree" class="easyui-tree"></ul>
			</div>
			<div data-options="region:'south',split:true" style="height:50%;">
				<form id="queryFrom" method="post">
					<input type="hidden" name="treeCheckedIds" id="treeCheckedIds">
					<input type="hidden" name="treeCheckedNames" id="treeCheckedNames">
					<input type="hidden" name="areaid" id="areaid"> <input
						type="hidden" name="areaName" id="areaName"> <input
						type="hidden" name="roomid" id="roomid"> <input
						type="hidden" name="roomName" id="roomName">
					<table align="center">
						<tr>
							<td   class="introduce">机架名称:</td>
							<td><input class="easyui-textbox" type="text" name="name"
								id="name" data-options=""></input></td>
						</tr>
						<tr>
							<td   class="introduce">机架类型:</td>
							<td><input class="easyui-combobox" id="typeid" name="typeid"
								data-options="url:'/racktype/find_RacktypeList',valueField:'id',textField:'name',prompt:'--请选择--'">
							</td>
						</tr>
						<tr>
							<td   class="introduce">业务状态:</td>
							<td><input class="easyui-combobox" id="serviceStatus"
								name="serviceStatus"
								data-options="url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_SERVICSTATUS',valueField:'itemCode',textField:'itemName',prompt:'--请选择--'">
							</td>
						</tr>
						<tr>
							<td   class="introduce">用途:</td>
							<td><input class="easyui-combobox" id="useful" name="useful"
								data-options="url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_USERFUL',valueField:'itemCode',textField:'itemName',prompt:'--请选择--'">
							</td>
						</tr>
						<tr>
							<td   class="introduce">维护状态:</td>
							<td><input class="easyui-combobox" id="maintstatus"
								name="maintstatus"
								data-options="url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_MAINTSTATUS',valueField:'itemCode',textField:'itemName',prompt:'--请选择--'">
							</td>
						</tr>
						<tr>
							<td   class="introduce">申请编号:</td>
							<td><input class="easyui-textbox" type="text" name="applyid"
								id="applyid" data-options=""></input></td>
						</tr>
						<tr>
							<td   class="introduce">接入号:</td>
							<td><input class="easyui-textbox" type="text"
								name="accessno" id="accessno" data-options=""></input></td>
						</tr>
						<tr>
							<td   class="introduce">整租客户:</td>
							<td><input class="easyui-textbox" name="customername" id="customername_search"  style="height:32px;"
									 data-options="buttonText:'选择',
										prompt:'---请选择客户---',
										editable:false,
									  	onClickButton:function(){
									  		createBoxForCust('search','doConfirmCustRack','Y');
									  	}
					   					"/>
            				<input type="hidden" id="customerid_search" name="customerid"/>
            				<input type="hidden" id="areaid_seach" name="areaid"/>
						</tr>
						<tr>
							<td></td>
							<td>
								<div style="text-align:center;padding:5px">
									<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doReSet();"
										style="width: 50px; float: right; margin: 1px 3px;">重置</a> <a
										href="#" class="easyui-linkbutton" onclick="doSearch();"
										style="width: 50px; float: right; margin: 1px 3px;">查询</a>
								</div>
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
	<div data-options="region:'center',title:'机架信息'">
		<!-- <div data-options="region:'north',border:false" style="height:40px;background:#B3DFDA;padding:10px">
			<a href="#" id="add" class="easyui-linkbutton c1" onclick="add();" style="width: 50px; float: right; margin: 6px 5px;">增加</a>
			<a href="#" class="easyui-linkbutton c2" onclick="update();" style="width: 50px; float: right; margin: 6px 5px;">修改</a>
			<a href="#" class="easyui-linkbutton c3" onclick="deleteALLSelect();" style="width: 50px; float: right; margin: 6px 5px;">删除</a>
		</div>	 -->
		<table id="useatDatagrid"  style="width:auto;" rownumbers="true" fitcolumns="true"></table>

		<!-- <div id="operationWin" class="easyui-window"></div> -->
	</div>
	
</body>
</html>