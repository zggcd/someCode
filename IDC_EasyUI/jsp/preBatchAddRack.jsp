<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 导入公共资源库 -->
<%@ include file="/pwb/include/common.jspf"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>机房管理</title>

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
		    padding: 8px;
		}
		.datagrid{
			border:1px solid #ccc;
		}
		 .rowTd{
		  display: none;
		}
		 .colTd{
			display: none;
		}  
</style>

	<div>
<!-- 		<fieldset style="border-color:#F7F7F7;margin: 15px 15px " > -->
		<form id="batchAddRackForm" method="post">
		<input name="roomId" id="roomId" hidden="hidden" value="${roomid}">
		<table align="center" class="table-bordered" >
			<tr align="center">
				<td colspan="6" width="100%">请选择机房/微模块内大部分机架的属性,点击下一步进行部分机架属性修改</td>
			</tr>
			<tr>
				<td width="15%" align="right"><font color="red">*</font>&nbsp;机架容量:</td>
				<td width="20%">
					<input class="easyui-numberbox" type="text" id="capacity" name="capacity" data-options="required:true,missingMessage:'请输入数字！'"/>
				</td>
				<td width="15%" align="right"><font color="red">*</font>&nbsp;机架类型:</td>
				<td width="20%">
					<select id = "racktypeId" style="height: 30px;" >
						<option value="">--请选择--</option>
						<c:if test="${not empty rackTypes }">
							<c:forEach var="rackType" items="${rackTypes}" varStatus="status">
								<option value="${rackType.id}">${rackType.name}</option>
							</c:forEach>
						</c:if>
					</select>
					<!-- <input  class="easyui-combobox" type="text" id="racktypeId" name="racktypeId"
						data-options="valueField:'id',textField:'name',editable:false,required:true,prompt:'--请选择--'"/> -->
				</td>
				<td width="15%" align="right">电源相位:</td>
				<td width="15%">
					<input class="easyui-textbox" type="text" id="power" name="power" data-options=""/>
				</td>
			</tr>
			<tr>
				<td class="colTd" align="right" width="15%;">按列增加机架:</td>
				<td class="colTd" width="15%;">
				<select id="selCol" name="colNo" style="height: 30px;">
					<option value="0">
						---请选择列----
					</option>
					<c:forEach var="s"  begin="1" end="${colNo}">
						<option value="${s}">${s} </option>
					</c:forEach>
				</select>
					<!-- <input class="easyui-combobox"  type="text" id="rowno" name="rowno"
					data-options="valueField:'id',textField:'name',url:'/rack/rows', editable:false,prompt:'--请选择行--'"/> -->
				</td>
				<td style="width: 15%;text-align: right;"  class="rowTd">按行增加机架:</td>
				<td  class="rowTd">
					<select id="selRow" name="rowNo"  style="height: 30px;">
						<option value="0">
							---请选择行----
						</option>
						<c:forEach var="rowNo"  begin="1" end="${rowNo}">
							<option value="${rowNo}">${rowNo} </option>
						</c:forEach>
					</select>
					<!-- <input class="easyui-combobox"  type="text" id="colno" name="colno"
					data-options="valueField:'id',textField:'name',url:'/rack/cols', width:'100px;',editable:false,prompt:'--请选择列--'"/> -->
				</td>
				<td id="buttonTd" colspan="6" width="100%">
					<div id="dlg-buttons" style="text-align: center;">
						<a href="javascript:void(0)" class="easyui-linkbutton"	iconCls="icon-cancel" onclick="doFormCancel()" style="width:auto;">取消</a>
						<a href="javascript:void(0)" class="easyui-linkbutton"	iconCls="icon-ok" onclick="setRow()" style="width:auto;">按行增加机架</a>
						<a href="javascript:void(0)" class="easyui-linkbutton"	iconCls="icon-ok" onclick="setCol()" style="width:auto;">按列增加机架</a> 
						<a href="javascript:void(0)" class="easyui-linkbutton"	iconCls="icon-ok" onclick="preBatchAddNext()" style="width:auto;">下一步</a>
					</div>
				</td>
			</tr>
		</table>
		</form>
<!-- 	</fieldset> -->
	</div>
	
<script type="text/javascript">


	function setRow(){
		$(".colTd").hide();
// 		$("#selCol option:checked").attr("selected", "");
		$("#selCol").find("option[value='0']").attr("selected",true); 
		$(".rowTd").show();
		$("#buttonTd").attr("colspan", '4');
	}
	function setCol(){
		$(".rowTd").hide();
// 		$("#selRow option:checked").attr("selected", "");
		$("#selRow").find("option[value='0']").attr("selected",true);
		$(".colTd").show();
		$("#buttonTd").attr("colspan", '4');
		$("#buttonTd").attr("width", '70%');
	}

//下一步
function preBatchAddNext(){
	
// 	var racktypeId = $('#racktypeId').combobox('getValue');
// 	var rowNo = $('#rowno').combobox('getValue');
// 	var colNo = $('#colno').combobox('getValue');
	var racktypeId = $('#racktypeId option:selected').val();
	var rowNo = $('#selRow option:selected').val();
	var colNo = $('#selCol option:selected').val();
	var capacity = $('#capacity').numberbox('getValue');
	var power = $('#power').textbox('getValue');
	var roomId = $("#roomId").val();
	
	var flag =  $('#batchAddRackForm').form('validate');
	if(!flag){
		return flag;
	}
	if(racktypeId ==''){
		$.messager.alert('提示','请先选择机架类型!');
		return false;
	}
	var queryParams = {
			'racktypeId' : racktypeId,
			'rowNo' : rowNo,
			'colNo' : colNo,
			'capacity' : capacity,
			'power' : power,
			'roomId' : roomId
		}
	$.ajax({
		url : "/dCRack?batchAddSecond",
		async : false,
		data:queryParams,
		success : function(data) {
			data=JSON.parse(data);
			if(data.success){
				addRackDialog = createDialog("批量录入机架", "/dCRack?batchAddSecondAgain", queryParams, false, "100%", "100%",'addRackSecond');
			}else{
				$.messager.alert("提示",data.msg );
			}
		}
	});
		
	
	}	 
</script>	
</body>
</html>