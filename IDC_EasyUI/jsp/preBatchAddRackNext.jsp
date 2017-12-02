<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/pwb/include/common.jspf"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>机房管理</title>

</head>
<body>
<script type="text/javascript">
var loadingBg = null;
var rackTypes=[];
function subt(){
	var roomid = $("#roomId").val();
	$("#id").val(roomid);
	$('#racksForm').form('submit', {
		url:'/dCRack/batchAddRack',
		onSubmit: function() {
			// 在用户提交后弹出loading层，阻止其它操作
			loadingBg = layer.load(1, {
			  shade: [0.6,'#ccc'] //0.1透明度的白色背景
			});
		},
		success: function(data){
			var resultData = $.parseJSON(data);
        	if(resultData.success){
        		$.messager.alert('提示', resultData.msg);
        		layer.close(loadingBg);
        		closeRackWin();//关闭当前弹出框
        		doFormCancel();//关闭前一个弹出框
                $('#'+datagrid).datagrid('load');
        	}
        	else{
        		$.messager.alert('提示',resultData.msg);
        	}
		}
	});		
}

function closeRackWin(){
	$("#addRackSecond").dialog("destroy").remove();
}
function Myselect(id){
	var obj = document.getElementById(id);
	var num = obj.options.length;
	if(num > 6){
		return;
	}
		var selectHtml = '<option value="">--请选择机架类型--</option>';
		var oldVal =  $('#'+id+' option:selected').val();
		$('#'+id).empty();
		$('#'+id).append(selectHtml);
		for(var i = 0;i<rackTypes.length;i++){
			var optionVal =  rackTypes[i].id;
			var optionText = rackTypes[i].name;
			if (oldVal == optionVal) {
				$('#'+id).append('<option value="'+optionVal+'" selected = "selected">'+optionText+'</option>');
			}else{
				$('#'+id).append('<option value="'+optionVal+'">'+optionText+'</option>');
			}
		}
}
function loadRackType(){
	$.ajax({
		url : '/racktype/find_RacktypeList',
		type : 'post',
		async : false,
		cache : false,
		success : function(data) {
			rackTypes = JSON.parse(data);
		}
	});
}
$(function (){
	var selectHtml = '';
	var optionVal =  $('#racktypeId option:selected').val();
	var optionText = $('#racktypeId option:selected').text();
	selectHtml = '<option value="'+optionVal+'" selected = "selected">'+optionText+'</option>';
	selectHtml +='<option value="" ></option>';
	selectHtml +='<option value="" ></option>';
	selectHtml +='<option value="" ></option>';
	selectHtml +='<option value="" ></option>';
	$('.defaultOption').after(selectHtml);
	loadRackType();
})
</script>
	<div>
	<form id="racksForm" method="post" >
	<input type="hidden" id="id" name = "id" val="">
			<table  style="width: 100%;" border='1' id="rackTable" >
							<tr>
								<td style="heigth: 35px;" colspan="${colNum+1}">
								<input type="hidden" name="rowCount" value="${rowCount}">
								<input type="hidden" name="colCount" value="${colCount}">
								请调整机架的属性（机架类型、电源相位）;注意：如果没有选择机架类型则该位置的机架将不会录入
								(可以在文本框里面填入电源相位)
								</td>
							</tr>
							<tr>
							<c:set var="a_1" value="${colNum}" />
							<c:set var="a_2" value="1" />
							<c:set var="a_3" value="100" />
							<c:set var="a_4" value="${a_1+a_2}" />
							<c:set var="tdWidth" value="${a_3/a_4}" />
								<c:forEach var="x" begin="0" end="${colNum}">
									<c:choose>  
								   <c:when test="${x==0}">   
										<td width="${tdWidth}%"><center>行/列</center></td>
								   </c:when>  
								     
								   <c:otherwise> 
								   	<td width="${tdWidth}%"><center>第${x}列</center></td>
								   </c:otherwise>
									</c:choose>
								</c:forEach>
							</tr>
			
				<c:if test="${fn:length(rcvRacks)  > 0 }">
					<c:set var="rowNum" value="0" />
					<c:set var="rackIndex" value="0" />
					<c:forEach  items="${rcvRacks}" var="rack" varStatus="stuts">
						<c:if test="${stuts.index%colCount==0 }">
						<c:set var="rowNum" value="${rowNum+1}" />	
							<tr><td width="${tdWidth}%"><center>第${rowNum}行</center></td>
						</c:if>
						<td title="第${rcvRacks[stuts.index].rowno}行${rcvRacks[stuts.index].colno}列" width="${tdWidth}%">
						<c:if test = "${empty  rcvRacks[stuts.index].roomid}">
							<c:if test = "${not empty rcvRacks[stuts.index].colno}">
						  	  <input type="hidden" name="rcvRacks[${stuts.index}].colno" value="${rcvRacks[stuts.index].colno}">
							  <input type="hidden" name="rcvRacks[${stuts.index}].rowno" value="${rcvRacks[stuts.index].rowno}">
							  <input type="hidden" name="rcvRacks[${stuts.index}].capacity" value="${rcvRacks[stuts.index].capacity}">
							  <select style="width:100%;height: 30px;" id="racktype${stuts.index}" name="rcvRacks[${stuts.index}].typeid" class="racktype${stuts.index}"   onclick="Myselect(this.id)">
							  	<option value="" class="defaultOption">--请选择机架类型--</option>
							  </select>
							  <input style="width:100%;" name="rcvRacks[${stuts.index}].power" value="${rcvRacks[stuts.index].power}" placeholder="输入电源相位" title="输入电源相位"/>
							</c:if>
						</c:if>
						</td>
						<c:if test="${stuts.index%colCount==(colCount-1) }">
							</tr>
						</c:if>
					</c:forEach>
				</c:if>
				<tr align="center">
					 <td height="40" colspan="${colNum+1}">
	                  <div align="center">
	                  	<input href="javascript:void(0)" class="easyui-linkbutton"	type="button" onclick="closeRackWin()" style="width:80px;" value="上一步">
						<input href="javascript:void(0)" class="easyui-linkbutton" type="button"  onclick="subt()" style="width:80px;" value="保存">
	                  </div>
                	</td>
				</tr>
			</table>
			</form>
	</div>
	
	<div id="wait-dialog" style="display: none;">Dialog Content.</div> 
</body>
</html>