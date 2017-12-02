<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/pwb/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>rack管理</title>
<%@ include file="/pwb/include/common.jspf" %>
	<style>
		table {
			border-collapse: collapse;  
	     	border: none;
	     	font-size:12px;
		}
		.table-bordered {
			width : 100%;
		}
		.panel-body {
			margin : 2px;
		    border: 1px solid #ccc;
		}
		.datagrid .datagrid-pager {
		    border-top: 1px solid #ccc;
		}
	</style>
	
</head>
<body>
	<div class="easyui-layout" style="width:100%;height:100%;">
	    <div data-options="region:'west'" style="width:20%; border:1px solid #ddd;" valign="top"  >
	    	<ul id="dataTree" class="easyui-tree"></ul>
	    </div>
	    <div data-options="region:'east'" style="width:80%;" valign="top" >
	    	<div class="easyui-layout" style="width:100%;height:100%;">
	    		<div data-options="region:'north',border:false" style="height:130px;">
	    			<form id="queryFrom" method="post">
					<input type="hidden" name="treeCheckedIds" id="treeCheckedIds">
					<input type="hidden" name="treeCheckedNames" id="treeCheckedNames">
					<input type="hidden" name="areaid" id="areaid">
					<input type="hidden" name="areaName" id="areaName">	
					<input type="hidden" name="customerid" value="${param.customerid }">
					<input type="hidden" name="serviceStatus" value="${param.serviceStatus }">
					<input type="hidden" name="hiretype" value="0">
					<table align="center" class="table-bordered"  style="width:98%" valign=middle>
						<tr>
							<td width="10%" class="align-right">机架名称:</td>
							<td width="35%"><input class="easyui-textbox" type="text" name="name" id="name" data-options=""></input></td>
							<td width="10%" class="align-right">机架编码:</td>
							<td width="35%"><input class="easyui-textbox" type="text" name="no" id="no" data-options=""></input></td>
						</tr>
						<!-- <tr>
							<td>业务状态:</td>
							<td><input class="easyui-combobox" id="status" name="status" data-options="url:'/baseController?getDictList&dictionaryCode=IDD_IDC_IP_STATUS',valueField:'itemCode',textField:'itemName'" value="${rackPage.status }"></td>
						</tr>	 -->																				
						<tr>
							<td></td>
							<td colspan="4">
							    <a href="javascript:void(0);" class="easyui-linkbutton" onclick="doReSet();" style="width: 50px;float:left; margin: 1px 3px;">重置</a>
								<a href="javascript:void(0);" class="easyui-linkbutton" onclick="doSearch();" style="width: 50px;float:left; margin: 1px 3px;">查询</a>
							</td>
						</tr>
					</table>
				</form>
	    		</div>
			    <div data-options="region:'center'">
					<table id="rackDatagrid" class="easyui-datagrid" style="height:334px;"
					data-options="
									onBeforeLoad:function() {
										$('#rackDatagrid').datagrid('clearSelections'); 
									},
									url:'/dCRack?datagrid',
									rownumbers:true,
									loadMsg: '数据加载中,请稍候...',
									idField: 'id',
									striped:true,
									singleSelect:true,
									queryParams : {customerid : '${param.customerid }', serviceStatus : '${param.serviceStatus }', hiretype : 0},
									toolbar: [{
											id : 'dialog-btn-ok',
											text:'确定',
											iconCls: 'icon-ok'
										},'-',{
											id : 'dialog-btn-cancel',
											text:'取消',
											iconCls: 'icon-cancel'
									}],
									autoRowHeight:false,
									pagination:true,
									pageSize:10,
									fit:true">
					<thead>
						<tr>
							<th data-options="field:'id',checkbox:true">选择</th>
							<th data-options="title : '机架编码',field : 'no',width : 100">机架编码</th>
							<th data-options="title : '机架名称',field : 'name',width : 100">机架名称</th>
							<th data-options="title : '机架类型',field : 'typeName',width : 100">机架类型</th>
							<th data-options="title : '所属机房ID',field : 'roomName',width : 100">所属机房ID</th>
							<th data-options="title : '所属区域',field : 'areaName',width : 100">所属区域</th>
							<th data-options="title : '租用类型',field : 'hiretypeName',width : 100">租用类型</th>
						</tr>
					</thead>
				</table> 
			    </div>
	    	</div>
	    </div>
	</div>
	<script type="text/javascript">
		var treeUrl = "/orgOrganization/treeData/default?displayType=DC";
		
		//数据表格ID
		var datagrid = "rackDatagrid";
		//数据列表数据地址
		var datagridUrl = "/dCRack?datagrid";
		
		//对话窗口
		var rackDialog;
		//对话窗口from表单ID
		var formId = "form";
		
		//左侧树ID
		var treeid = "dataTree";
		//左侧树查询表单ID
		var queryFrom = "queryFrom";
		
		$(function() {
			//树加载
			$('#'+treeid).tree({    
			    url: treeUrl,//IDC中心默认
			    checkbox: true,
			    animate: true,
			    lines: true,
			    onBeforeExpand : function(node){
			    	$('#'+treeid).tree('options').url = treeUrl+'&type='+node.attributes.type;
			    }
			}); 
		});
		
		//重置 
		function doReSet(){
			var root=$('#'+treeid).tree('getRoot');  
		    $('#'+treeid).tree('uncheck',root.target);
			$('#name,#no').textbox('setValue', '');
			doSearch();
		}
		
		//查询
		function doSearch(){
			var pager = $("#"+datagrid).datagrid('getPager');
			pager.pagination('refresh',{
		    	pageNumber:1,
			});
			
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
				queryParams[field.name] = $.trim(field.value);
			});
			$("#"+datagrid).datagrid('load');
		}
	</script>
</body>    
</html>