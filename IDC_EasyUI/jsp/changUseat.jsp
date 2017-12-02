<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 导入公共资源库 -->
<%@ include file="/pwb/include/common.jspf"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>机架管理</title>

</head>
<body class="easyui-layout">
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
		.datagrid{
		border:1px solid #ccc;
	}
	</style>
	<div data-options="region:'center'" style="width: 100%;height: 95%;">
		<table style="width: 95%;height: 100%;margin: 10px auto" class="table-bordered" >
			<tr>
				<td style="text-align: center;height:40px">原有的机位(选择占用或者预占的机位) </td>
				<td style="text-align: center;">替换的机位(选择空闲的机位)</td>
			</tr>
			<tr>
				<td style="width: 45%;height: 100%;">
					<table style="width: 100%;height: 100%;">
						<tr>
							<td style="width:120px;height:40px;">
								<input class="easyui-textbox" name="rackname" id="rackname_search1"  style="height:32px;"
									 data-options="buttonText:'选择',
										prompt:'---请选择机架---',
										editable:false,
									  	onClickButton:function(){
									  		createBoxForRack('search','doConfirmRackold','','','','Y');
									  	}
					   					"/> 
			   					<input type="hidden" id="rackid_search1" name="rackid" /></td>
						</tr>
						<tr>
							<td style="width: 100%;height: 77%;">
								<table id="useatlist1" align="center"></table>
							</td>	
						</tr>
					</table>
				</td>
				<td style="width: 45%;height: 100%;">
					<table style="width: 100%;height: 100%;">
						<tr>
							<td style="width:120px;height:40px;"><input class="easyui-textbox" name="rackname" id="rackname_search2"  style="height:32px;"
									 data-options="buttonText:'选择',
										prompt:'---请选择机架---',
										editable:false,
									  	onClickButton:function(){
									  		createBoxForRack('search','doConfirmRacknew','','','','Y');
									  	}"/>
					   					<input type="hidden" id="rackid_search2" name="rackid" />
						</tr>
						<tr>
							<td style="width: 100%;height: 77%;">
								<table id="useatlist2"  align="center"></table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;">
					<a href="#" class="easyui-linkbutton c2" onclick="saveChangeUseat();" style="width: 80px;  margin: 3px auto;">保存</a>
					<a href="#" class="easyui-linkbutton c2" onclick="closeChangeUseatWin();" style="width: 80px;  margin: 3px auto;">取消</a>
					
				</td>
			</tr>
		</table>
		<!-- <div id="operationWin" class="easyui-window"></div> -->
	</div>
	<script type="text/javascript">
	function closeChangeUseatWin(){
		$('#changeUseatDialog').dialog('destroy').remove();
	}
	
	function saveChangeUseat() {
		var newUseatRows=null;
		var oldUseatRows =null;
		try{
			oldUseatRows= $("#useatlist1").datagrid('getSelections');//选择的原有U位的 行
			newUseatRows= $("#useatlist2").datagrid('getSelections');//选择的替换U位的 行
		}catch(err){
			$.messager.alert('提示','请选择进行互换的机位！!!!');
			return;
		}
		if(newUseatRows.length<1 && oldUseatRows.length<1){
			$.messager.alert('提示','请选择进行互换的机位！');
			return;
		}
		if(newUseatRows.length!= oldUseatRows.length){
			var msg = "选择原机位数为：" + oldUseatRows.length + "个,\n而选择替换的机位数为：" + newUseatRows.length + "个,\两者选择的个数必须相同才能互换！";
			$.messager.alert('提示',msg);
			return;
		}
		if(newUseatRows.length == oldUseatRows.length && newUseatRows.length>0){
			for (var i = 0; i < newUseatRows.length; i++) {
				if(newUseatRows[i].status !="1"){
					$.messager.alert('提示','选择的要替换的机位中存在非空闲机位，请重新选择！');
					return;
				}
			}
		}
		var num = 0; //选择原有机位的空闲个数
		var oldUseatArr ='';//
		var newUseatArr ='';
		if (oldUseatRows != null) {
			for (var i = 0; i < oldUseatRows.length; i++) {
				oldUseatArr+=oldUseatRows[i].id
				if(i<oldUseatRows.length-1){
					oldUseatArr+=','
				}
				if (oldUseatRows[i].status == "1") {//状态为空闲
					num += 1;
				}
			}
		}
		if (newUseatRows != null) {
			for (var i = 0; i < newUseatRows.length; i++) {
				newUseatArr+=newUseatRows[i].id
				if(i<newUseatRows.length-1){
					newUseatArr+=','
				}
			}
		}
		if (oldUseatRows.length != num) {
		    $.messager.progress({
		        title:'提示',
		        msg:'机位互换中,请稍后...',
		        text: ''
		    });
		   $.ajax({ 
                type : "POST",  //提交方式  
                url : "/dCRack/BathReplace",//路径  
                data : {  
                    "newUseatids" : newUseatArr,
                    "oldUseatids" : oldUseatArr
                },//数据，这里使用的是Json格式进行传输  
                success : function(data) {//返回数据根据结果进行相应的处理  
                	$.messager.progress('close');
                	data=JSON.parse(data);
                    if ( data.success ) {
                    	$.messager.alert("提示", data.msg);
                    	$('#changeUseatDialog').dialog('destroy').remove();
                    } else {  
                    	$.messager.alert("提示", data.msg); 
                    }  
                }  
            });
		    /* var timer = setInterval(function(){
		         $.ajax({
		                url: "/rack/progress",
		                success: function(data){
		                	data=JSON.parse(data);
		                    if(data.success){
		                        $.messager.progress('bar').progressbar('setValue','100');
		                        clearInterval(timer);
		                        $.messager.alert("提示", data.msg);
		                        $('#changeUseatDialog').dialog('destroy').remove();
		                    } else {  
		                    	$.messager.alert("提示", data.msg); 
		                    }  
		                }
		            }); 
		          }, scanTime); */
		} else{//如果原有机位选择的都是空闲，就不用执行后台方法，直接返回到上级页面，因为空闲换空闲，什么都不会有变化
			$.messager.alert("提示","原有机位与要替换的机位均为空闲状态，无需替换！");
			return;
		}	
	}
	function doConfirmRackold(){
		var rowData = $('#selectRackDatagrid').datagrid('getSelected');
		if($('#rackFlagParams').val()=='search'){
			$('#rackid_search1').val(rowData.id);
			$('#rackname_search1').textbox('setValue',rowData.name);
			$('#useatlist1').datagrid({
				onBeforeLoad:function(){
					$('#useatlist1').datagrid('clearSelections'); 
				},
				url : '/dcuseat?datagrid',
				loadMsg : '数据加载中,请稍候...',
				rownumbers : true,
				idField : 'id',
				queryParams : {
					rackid : rowData.id,
					changeUseat:'Y'
					
				},
				pagination : true, //分页控件
				pageList : [ 10, 20, 50, 100, 150, 200 ],
				pageSize : 20,
				singleSelect : false,//单选还是多选
				striped : true,
				fit : true,//自适应大小
				//nowrap : true,//数据长度超出列宽时将会自动截取。
				columns : [ [ 
		            {title : '选择',field : 'id',checkbox : true}, 
		            {title : 'U位',field : 'code', halign:'center',align:'center'}, 
					{title : '机架名称',field : 'rackName', halign:'center',align:'center'}, 
					{title : '客户名称',field : 'customerName', halign:'center',align:'center'}, 
					{title : '状态',field : 'status',hidden:true},
					{title : '状态',field : 'statusName', halign:'center',align:'center'}
				] ]
			});
		}else{
			$('#customerid_add').val(rowData.id);
			$('#customername_add').textbox('setValue',rowData.name);
		}
		$('#queryRack').dialog('destroy').remove();
	}
	function doConfirmRacknew(){
		var rowData = $('#selectRackDatagrid').datagrid('getSelected');
		if($('#rackFlagParams').val()=='search'){
			$('#rackid_search2').val(rowData.id);
			$('#rackname_search2').textbox('setValue',rowData.name);
			$('#useatlist2').datagrid({
				onBeforeLoad:function(){
					$('#useatlist2').datagrid('clearSelections'); 
				},
				url : '/dcuseat?datagrid',
				loadMsg : '数据加载中,请稍候...',
				rownumbers : true,
				idField : 'id',
				pagination : true, //分页控件
				pageList : [ 10, 20, 50, 100, 150, 200 ],
				pageSize : 20,
				singleSelect : false,//单选还是多选
				striped : true,
				queryParams : {
					rackid : $('#rackid_search2').val(),
					changeUseat:'Y',
					status:'1',
				},
				fit : true,//自适应大小
				//nowrap : true,//数据长度超出列宽时将会自动截取。
				columns : [ [
				{title : '选择',field : 'id',checkbox : true}, 
				{title : 'U位',field : 'code', halign:'center',align:'center'}, 
				{title : '机架名称',field : 'rackName', halign:'center',align:'center'}, 
				{title : '客户名称',field : 'customerName',halign:'center',align:'center'}, 
				{title : '状态',field : 'status',hidden:true},
				{title : '状态',field : 'statusName',halign:'center',align:'center'}
				] ]
			});
		}
		$('#queryRack').dialog('destroy').remove();
	}
</script>
</body>
</html>