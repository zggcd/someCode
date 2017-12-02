<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/pwb/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>机架管理</title>
<%@ include file="/pwb/include/common.jspf" %>
</head>
<script type="text/javascript">
$.parser.auto = false;
	//权限校验的URL
	var checkOperationUrl = "/dCRack?checkOperation";
	//模块编号
	var modelCode = "IDM_RES_DC_RACK_MANAGE";
	//需校验模块下的元素集合,key为id,value为元素编号
	var elementCodeMap = {
		'btnAdd' : 'IDE_INSERT_DC_RACK',
		'btnUpdate' : 'IDE_UPDATE_DC_RACK',
		'btnDelete' : 'IDE_DELETE_DC_RACK',
		'changeUseat' : 'IDE_CHANGEUSEAT_DC_RACK',
		'rackRelIP' : 'IDE_RACKRELIP_DC_RACK',
		'changeRack' : 'IDE_CHANGERACK_DC_RACK',
		'btnView' : 'IDE_VIEW_DC_RACK',
		'btnReload' : 'IDE_RELOAD_DC_RACK',
		'btnExport':'IDE_EXPORT_DC_RACK'
		
	};
	//数据表格ID
	var datagrid = "dCRackDatagrid";
	//数据列表数据地址
	var datagridUrl = "/dCRack?datagrid";
	//对话窗口
	var dCRackDialog;
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
	$(function() {
		//权限处理
		$.parser.parse();
		fitQueryPanel("query-panel");		
		checkOperation(checkOperationUrl, modelCode, elementCodeMap);
		//树加载
		$('#dataTree').tree({    
		    url: treeUrl,
		    checkbox: true,
		    animate: true,
		    lines: true,
		    onBeforeExpand: function(node){
		    	$('#'+treeid).tree('options').url = treeUrl+'&type='+node.attributes.type;
		    }
		});
		//数据表格
		$('#' + datagrid).datagrid({
					onBeforeLoad:function(){
						$('#'+datagrid).datagrid('clearSelections'); 
					}, 
					//url : datagridUrl,
					url : '',
					loadMsg : '数据加载中,请稍候...',
					rownumbers : true,
					idField : 'id',
					pagination : true, //分页控件
					pageList : [ 10, 20, 50, 100, 150, 200 ],
					pageSize : 20,
					singleSelect : true,//单选还是多选
					striped : true,
					fit : true,//自适应大小
					nowrap : true,//数据长度超出列宽时将会自动截取。
					onDblClickCell: function(index,field,value){//鼠标双击事件
						if(field=='no'|| field=='name'){
							dCRackDialog = view(datagrid, '机架信息', toAddOrupdateUrl);
						}
					},
					columns : [ [
							{title : '选择',field : 'id',checkbox : true},
							{title : '机架编码',field : 'no',width : '20%',halign:'center',align:'center'},
							{title : '机架名称',field : 'name',width : '20%',formatter :dCRackDetailList,halign:'center',align:'center'},
							{title : '机架类型',field : 'typeName',width : '20%',formatter : dCRackTypeDetail,halign:'center',align:'center'},
							{title : '所属区域',field : 'areaName',width : '20%',halign:'center',align:'center'},
							{title : '所属区域',field : 'areaid',hidden:true},
							{title : '所属机房',field : 'roomName',width : '20%',formatter : roomDetail,halign:'center',align:'center'},
							{title : '所属机房',field : 'roomid',hidden:true},
							{title : '列号',field : 'colno',width : '5%',halign:'center',align:'center'},
							{title : '行号',field : 'rowno',width : '5%',halign:'center',align:'center'},
							{title : '电源相位',field : 'power',width : '8%',halign:'center',align:'center'},
							{title : '电流（A）',field : 'electricity',width : '8%',halign:'center',align:'center'},
							{title : '电压（V）',field : 'electricvoltage',width : '8%',halign:'center',align:'center'},
							{title : '功率（KW）',field : 'electricpower',width : '8%',halign:'center',align:'center'},
							{title : '业务状态',field : 'serviceStatus',width : '10%',halign:'center',align:'center', 
								formatter: function(value,row,index){
					      			return getDictLabel(value, 'IDD_IDC_RACK_SERVICSTATUS', '');
					      		} 
							},
							{title : '租用类型',field : 'hiretypeName',halign:'center',align:'center',width : '10%'},
							{title : '整租客户',field : 'customerName',halign:'center',align:'center',width : '20%',formatter : customerDetail},
							{title : '整架租用的客户',field : 'customerid',hidden:true},
							/* {title : '所有者类型',field : 'ownertype',width : '10%',halign:'center',align:'center', 
								formatter: function(value,row,index){
					      			return getDictLabel(value, 'IDD_IDC_RACK_OWNERTYPE', '');
					      		} 
							}, */
							{title : '机架容量',field : 'capacity',width : '8%',halign:'center',align:'center'},
							{title : '机架电力容量',field : 'rackpower',width : '10%',halign:'center',align:'center'},
							{title : '列头柜电力容量' ,field : 'rowcabinetpower',width : '10%',halign:'center',align:'center'},
							{title : '申请编号' ,field : 'applyid',width : '15%',halign:'center',align:'center'},
							{title : '接入号' ,field : 'accessno',width : '15%',halign:'center',align:'center'}
							/* {title : '机架维护状态',field : 'maintstatus',halign:'center',align:'center',width : '10%', 
								formatter: function(value,row,index){
					      			return getDictLabel(value, 'IDD_IDC_RACK_MAINTSTATUS', '');
					      		} 
							},
							{title : '机架用途',field : 'useful',width : '10%',halign:'center',align:'center', 
								formatter: function(value,row,index){
					      			return getDictLabel(value, 'IDD_IDC_RACK_USERFUL', '');
					      		} 
							},
							{title : '维护信息',width : '20%',field : 'maintenanceDept',halign:'center',align:'center'} */
					] ],
					toolbar : [
							{
								id : 'btnAdd',
								text : '新增',
								iconCls : 'icon-add',
								handler : function() {
									addWin();//实现添加记录的页面
								}
							},
							{
								id : 'btnUpdate',
								text : '修改',
								iconCls : 'icon-edit',
								handler : function() {
									updates();//实现修改记录的方法
								}
							},
							{
								id : 'btnDelete',
								text : '删除',
								iconCls : 'icon-remove',
								handler : function() {
								    var ids = [];
								    var rows = $("#"+datagrid).datagrid('getSelections');
								    if (rows.length > 0) {
								    	for ( var i = 0; i < rows.length; i++) {
								    		if(rows[i].serviceStatus!='1'){
								    			$.messager.alert('提示',"不能删除状态为非空闲的机架！");
								    			return;
									    	}
										}
								    	$.messager.confirm('确认','你确定永久删除该数据吗？',function(r){    
											if (r) {
												for ( var i = 0; i < rows.length; i++) {
													ids.push(rows[i].id);
												}
												$.ajax({
													url : deleteUrl,
													type : 'post',
													data : {
														ids : ids.join(',')
													},
													cache : false,
													success : function(data) {
														resultData = JSON.parse(data);
														//var resultData = $.parseJSON(data.jsonStr);
														if (resultData.success) {
															var msg = resultData.msg;
															$.messager.alert('提示', msg);
															$('#'+datagrid).datagrid('reload');
															$("#"+datagrid).datagrid('unselectAll');
															ids = '';
														}
													}
												});
											}		    	      
								    	}); 
									} else {
										$.messager.alert('提示',"请选择需要删除的数据");
									}
								}		//	deleteALLSelect(datagrid, deleteUrl);//实现直接删除数据的方法
							},
							{
								id : 'changeUseat',
								text : '机位互换',
								iconCls : 'icon-edit',
								handler : function() {
									createBox('','','机位互换','changeUseatDialog','1100px','540px','/jtflow/dcrack/changUseat.jsp')
								}
							},
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
									createDialog('建立IP关联', '/dCRack/rackToIPs/'+rowsData[0].id, null, false, '1100px', '540px', 'rackToIPsDialog')
									/* document
											.getElementById('catalog_iframe').src = "/dCRack/dCRackToIPs/"+rowsData[0].id;
									$('#win_details').dialog('open')
											.dialog('setTitle', '建立IP关联'); */
								}
							},
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
									var queryParams={
											'fromFlag':'changeRack',
											'id':rowsData[0].id
									}
									createDialog('机架互换', '/dCRack?addorupdate', queryParams, false, '1100px', '540px', 'changeRackDialog')
								}
							},
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
					        		dCRackDialog = view(datagrid, '机架信息', toAddOrupdateUrl);//实现查看记录详细信息的方法
								}
							},{
								id : 'btnReload',
								text : '刷新',
								iconCls : 'icon-reload',
								handler : function() {
									$("#" + datagrid)
											.datagrid("reload");
								}
							},{
					        	id: 'btnExport',
					            text: '导出',
					            iconCls: 'icon-search',
					            handler: function () {
					                var queryParams = [];
									var queryFormParams = $("#"+queryFrom).serializeArray();
									$.each(queryFormParams, function(i, field){
										queryParams.push(field.name + '=' + field.value);
									});
									
									var nodes = $('#'+treeid).tree('getChecked');;
									var treeCheckedIds = '';
									var roomids= '';
									if (nodes != null) {
										for(var i=0; i<nodes.length; i++){
											if(nodes[i].attributes.type == 'room'){
												if (roomids != '') {roomids += ','};
												roomids += nodes[i].id; 
											}else{
												treeCheckedIds += nodes[i].id;
												if(i<nodes.length-1){
													treeCheckedIds+=',';
												}
											}
										}
									} 
									queryParams.push('roomids=' + roomids);
									queryParams.push('areaids=' + treeCheckedIds);
					                window.open('/dCRack?exportRack' + '&' + queryParams.join('&'));
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
	//重置 
	function doReSet() {
		$('#queryFrom .easyui-combobox').combobox('clear');
		$('#' + queryFrom).form('clear');
		var root=$('#'+treeid).tree('getRoot');  
	    $('#'+treeid).tree('uncheck',root.target);
		//doSearch();
	}
	
	function dCRackDetailList(value,row,index){
		if(value!=null){
			return '<a href=\"#\" onclick=\"toRackDetailList(\''+row.id+'\')\">'+row.name+'</a>';
		}
	}
	function toRackDetailList(dCRackid){
		var queryParams = {
				'pageType':'query',
		    	'id': dCRackid,
		    	'fromFlag':'fromCustomerAccessno'
		 };
		dCRackDialog =createDialog( '机架机位使用详细信息', '/dCRack?addorupdate', queryParams,true);
	}
	function dCRackTypeDetail(value,row,index){
		if(value!=null){
			return '<a href=\"#\" onclick=\"toRackTypeDetail(\''+row.typeid+'\')\">'+row.typeName+'</a>';
		}
	}
	function toRackTypeDetail(dCRackTypeid){
		var queryParams = {
				'pageType':'query',
		    	'id': dCRackTypeid,
		    	'fromFlag':'fromCustomerAccessno'
		 };
		dCRackTypeDialog =createDialog( '机架类型详细信息', '/racktype?addorupdate', queryParams,true);
	}
	function roomDetail(value,row,index){
		if(value!=null){
			return '<a href=\"#\" onclick=\"toRoomDetail(\''+row.roomid+'\')\">'+row.roomName+'</a>';
		}
	}
	function toRoomDetail(roomid){
		var queryParams = {
				'pageType':'query',
		    	'id': roomid,
		    	'fromFlag':'fromCustomerAccessno'
		 };
		roomDialog =createDialog( '机房详细信息', '/dCRoom?addorupdate', queryParams,true);
	}
	function customerDetail(value,row,index){
		if(value!=null){
			return '<a href=\"#\" onclick=\"toCustomerDetail(\''+row.customerid+'\')\">'+row.customerName+'</a>';
		}
	}
	function toCustomerDetail(customerid){
		var queryParams = {
				'pageType':'query',
		    	'id': customerid
		 };
		CustomerDialog =createDialog( '客戶详细信息', '/dCCustomer?addorupdate', queryParams,true);
	}
	
	//查询
	function doSearch(){
		var queryParams = $("#"+datagrid).datagrid('options').queryParams;
		var nodes = $('#'+treeid).tree('getChecked');;
		var treeCheckedIds = '';
		var roomids= '';
		if (nodes != null) {
			for(var i=0; i<nodes.length; i++){
				if(nodes[i].attributes.type == 'room'){
					if (roomids != '') {roomids += ','};
					roomids += nodes[i].id; 
				}else{
					/* if (treeCheckedIds != '') {
							treeCheckedIds += ',';
						}else{
							treeCheckedIds += nodes[i].id;
						} */
					
					treeCheckedIds += nodes[i].id;
					if(i<nodes.length-1){
						treeCheckedIds+=',';
					}
						
				}
			}
		} 
		queryParams['roomids'] = roomids;
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
			var areaid='';
			var areaName='';
			var roomid='';
			var roomName='';
			
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
				areaName=parentNode.text;
				//机房ID
				roomid=roomNode.id;
				roomName=roomNode.text;
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
			'areaid' : areaid,
			'areaName' : areaName,
			'roomid' :roomid,
			'roomName' : roomName
		};
		dCRackDialog = add(datagrid, '机架信息录入', toAddOrupdateUrl, queryParams);
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
		$('#form .easyui-combobox').combobox('clear');
		var areaid=$('#areaid').val();
		var roomid=$('#roomid').val();
		var roomName=$('#roomName').textbox('getValue')
		$('#' + formId).form('clear');
		$('#areaid').val(areaid);
		$('#roomid').val(roomid);
		$('#roomName').textbox('setValue',roomName);
	}
	//表单取消
	function doFormCancel() {
		dCRackDialog.dialog("destroy").remove();
	}

	//保存(新增或修改)
	function save() {
		if($('#id').val()!=null){
			var message=checkRackType($('#id').val());
			if(message!=''){
				tip(message);
			}
		}
		$.messager.progress({
	        title:'提示',
	        msg:'正在处理,请稍后...',
	        text: ''
	    });
		$('#' + formId).form('submit', {
			url : addOrupdateUrl,
			onSubmit : function() {
				/* if($('#switcha').textbox('getValue')!='' || $('#switchb').textbox('getValue')!=''){
					if($('#switcha').textbox('getValue')==$('#switchb').textbox('getValue')){
						$.messager.alert('提示','A路电源开关与B路电源开关不能相等！')
						return false;
					}
				} */
				if(!$(this).form('validate')){
					return false;
				}
				
			},
			success : function(data) {
				$.messager.progress('close');
				var resultData = $.parseJSON(data);
				if (resultData.success) {
					$.messager.alert('提示', resultData.msg);
					doFormCancel();//关闭窗口//
					$('#' + datagrid).datagrid('load');
				} else {
					$.messager.alert('提示', resultData.msg);
				}
			}
		});
	}

	function checkRackType(rackid){
		var message="";
		$.ajax({
			type:"POST",
			async:false,
			url : "/dcuseat?checkNotIdleUseat",
			data : {
				"rackid" : rackid
			},
			success : function(data) {
				data=JSON.parse(data);
				if(data.success){
					message=data.msg;
				}
			}
		});
		return message;
	}
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
		dCRackDialog = update(datagrid, titile, toAddOrupdateUrl);//实现查看记录详细信息的方法;//实现修改记录的方法
	}
	function saveRackSwap(){
		if($("#rackid_search").val()!=null && $("#rackid1").val()!=""){
			$.ajax({
				type:"POST",
				url : "/dCRack/changeOut",
				data : {
					"oldRackid" : $("#rackid1").val(),
					"newRackid" : $("#rackid_search").val()
				},
				success : function(data) {
					data=JSON.parse(data);
					if(data.success){
						$.messager.alert('提示', data.msg);
						$('#changeRackDialog').dialog('destroy').remove();
						$('#' + datagrid).datagrid('load');
					}else{
						$.messager.alert('提示', data.msg);
					}
				}
			});
		}else{
			$.messager.alert('提示', '请选择要进行转换的机架!');
			return;
		}
	}
	/* //保存(新增或修改)
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
	} */
	window.onload=function(){
		var status = <%=request.getParameter("status")%>; 
		if(status!=null){
			var data = $('#serviceStatus').combobox('getData');
			$.each(data,function(index,value){	
				if(status ==value.itemCode){
					$("#serviceStatus").combobox('select',value.itemCode);	
				}
			});
			var queryParams = $("#"+datagrid).datagrid('options').queryParams;
			var queryFormParams = $("#"+queryFrom).serializeArray();
			$.each(queryFormParams, function(i, field){
				queryParams[field.name] = field.value;
			});
		}
		$("#"+datagrid).datagrid({url:datagridUrl});

	};
	function doConfirmMicroModule(){
		
	 	var rowData = $('#microModuleDatagrid').datagrid('getSelected');
	 	if(null!=rowData){
	 		if($('#microModuleFlagParams').val()=='addorupdate'){
				$('#micromoduleid_addorupdate').val(rowData.id);
				$('#microModuleName_addorupdate').textbox('setValue',rowData.name);
	 		} 
	 	}
		$('#queryMicroModule').dialog('destroy').remove();
	} 
</script>
<body class="easyui-layout" >
<style type="text/css">
	.span_move {
		color: red;
		cursor: pointer;
	}
	a:hover, a:active{
	 color:red;
	}
	a{
	 text-decoration:none;
	}
	
	.span_out {
		color: black;
	}
</style>

	<div data-options="region:'west',split:true,title:'查询条件'" style="width:270px;">
		<div class="easyui-layout" data-options="fit:true,border:false" id="query-panel" style="border-left:5px solid #E6EEF8">
			<div data-options="region:'north',border:false">
				<ul id="dataTree" class="easyui-tree"></ul>
			</div>
			<div data-options="region:'south',split:true">
				<div class="easyui-accordion"  data-options="fit:true,border:false">  
					<form id="queryFrom" method="post">
						<input type="hidden" name="treeCheckedIds" id="treeCheckedIds">
						<input type="hidden" name="treeCheckedNames" id="treeCheckedNames">
						<table align="center">
							<tr>
								<td >机架名称:</td>
								<td><input class="easyui-textbox" type="text" name="name"
									id="name" data-options=""></input></td>
							</tr>
							<tr>
								<td>机架类型:</td>
								<td><input class="easyui-combobox" id="typeid" name="typeid"
									data-options="panelHeight:'200px',url:'/racktype/find_RacktypeList',valueField:'id',textField:'name',prompt:'--请选择--'">
								</td>
							</tr>
							<tr>
								<td>业务状态:</td>
								<td><input class="easyui-combobox" id="serviceStatus"
									name="serviceStatus"
									data-options="panelHeight:'auto',url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_SERVICSTATUS',valueField:'itemCode',textField:'itemName',prompt:'--请选择--'"
									></td>
							</tr>
							<tr>
								<td>租用方式:</td>
								<td><input class="easyui-combobox" id="hiretype" name="hiretype"
									data-options="panelHeight:'auto',url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_HIRETYPE',valueField:'itemCode',textField:'itemName',prompt:'--请选择--'">
								</td>
							</tr>
							<!-- <tr>
								<td>用途:</td>
								<td><input class="easyui-combobox" id="useful" name="useful"
									data-options="panelHeight:'auto',url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_USERFUL',valueField:'itemCode',textField:'itemName',prompt:'--请选择--'">
								</td>
							</tr>
							<tr>
								<td>维护状态:</td>
								<td><input class="easyui-combobox" id="maintstatus"
									name="maintstatus"
									data-options="panelHeight:'auto',url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_MAINTSTATUS',valueField:'itemCode',textField:'itemName',prompt:'--请选择--'">
								</td>
							</tr> -->
							<tr>
								<td>申请编号:</td>
								<td><input class="easyui-textbox" type="text" name="applyid"
									id="applyid" data-options=""></input></td>
							</tr>
							<tr>
								<td>接入号:</td>
								<td><input class="easyui-textbox" type="text"
									name="accessno" id="accessno" data-options=""></input></td>
							</tr>
							<tr>
								<td>整租客户:</td>
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
									<div style="text-align:right;padding:5px">
										<a href="#" class="easyui-linkbutton" onclick="doSearch();"
											style="width: 50px; margin: 1px 3px;">查询</a>
										<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doReSet();"
											style="width: 50px;margin: 1px 3px;">重置</a> 
									</div>
								</td>
							</tr>
						</table>
					</form>
				 </div> 
			</div>
		</div>
	</div>
	<div data-options="region:'center',title:'机架信息'">
		<table id="dCRackDatagrid"></table>
	</div>
<input type="hidden" id="page-source" value="DC">
</body>
</html>