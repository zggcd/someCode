<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 导入公共资源库 -->
<%@ include file="/pwb/include/common.jspf"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>机架建立IP关联</title>

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
	<div id="p_customer2" class="easyui-panel">
		<!-- <form id="queryConditionform" method="post" action=""> -->
		<form id="queryipform" method="post" action="">
			<input name="id" id="rackid" type="hidden" value="${rack.id}"/>
			<table id="querytable"  class="table-bordered" style="margin: 5px auto">
				<input type="hidden" id="startip" datatype="ip" prerequisite="0" label="起始IP地址" name="startip" value="" /> 
				<input type="hidden" id="endip" datatype="ip" prerequisite="0" label="结束IP地址" name="endip" value="" />
				<tr>
					<td align="center">名称</td>
					<td colspan="4" align="center" >起始IP</td>
					<td align="center">至</td>
					<td align="center">终止IP</td>
				</tr>
				<tr>
					<td>
						<center>格式</center>
					</td>
					<td align="center">
						123.
					</td>
					<td align="center">
						123.
					</td>
					<td align="center">
						123.
					</td>
					<td align="center">
						0
					</td>
					<td align="center">
						<center>—</center>
					</td>
					<td align="center">
						<center>255</center>
					</td>
				</tr>
				<tr>
					<td align="center">
						<center>输入</center>
					</td>
					<td  style="text-align: center;">
						<input class="inputtext01" type="text" id="one" name="one" onkeyup="focus1('one','two')" onblur="blur1()"/>
					</td>
					<td  align="center">
						<input class="inputtext01" type="text" id="two" name="two" onkeyup="focus1('two','three')"/>
					</td>
					<td align="center">
						<input class="inputtext01" type="text" id="three" name="three" onkeyup="focus1('three','four')"/>
					</td>
					<td  align="center">
						<input class="inputtext01" type="text" id="four" name="four" onkeyup="focus1('four','four')"/>
					</td>
					<td align="center">
						—
					</td>
					<td align="center">
						<input type="text" id="five"  value="" class="inputtext01" />
					</td>
				</tr>
				<tr>
					<td align="right" nowrap>ip段名称：</td>
					<td colspan="4">
						<input class="easyui-textbox" type="text"  id="ipName" name="ipName" data-options="">
					</td>
					<td align="right" nowrap>业务状态：</td>
					<td >
						<input class="easyui-combobox" id="status" 
						data-options="url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_SERVICSTATUS',valueField:'itemCode',textField:'itemName',prompt:'--请选择--'"/>
					</td>
				</tr>
				<tr class=prop>
					<td align="right" nowrap>所属区域或机房：</td>
					<td colspan="4" align=left nowrap>
						<input type="hidden" name="roomid" id="roomId" />
						<input type="hidden" id="areaId" name="areaId" value=""/>
						<input type="text" class="easyui-textbox" name="areaName"  id="areaNameRack" style="height: 32px;"
						data-options="
							prompt:'---请选择本地网---',
							editable:false,
							hasDownArrow:false,
							buttonText:'选择',
							onClickButton:function(){
								createBoxForArea('queryCust','room','doConfirmNativeNet','','Y');
								
							}" />
					</td>
					<td align="right" colspan="2">
						<div align="right">
							<a href="javascript:void(0);" class="easyui-linkbutton" onclick="resetqueryipform()" style="width: 50px; float: right; margin: 1px 3px;">重置</a> 
							<a href="javascript:void(0);" class="easyui-linkbutton" onclick="searchiplist();" style="width: 50px; float: right; margin: 1px 3px;">查询</a>
						</div>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id="p_customer1" class="easyui-panel" title="机架和IP关联">
		<table class="table-bordered" style="margin: 5px auto">
			<tr>
				<td colspan="2" width="45%" align="center">
					机架名称:</td>
				
				<td colspan="3" width="55%" align="center">${rack.name}</td>
			</tr>
			<tr>
				<td colspan="2" width="47%" align="center">IP</td>
				<td colspan="1"></td>
				<td colspan="2" width="47%" align="center">
					已关联IP</td>
			</tr>
			<tr>
				<td colspan="2">
					<div id="tableDiv" style="overflow: auto; height: 180px;"class="table" id="loadData">
						<table id="rackList" width="100%"  class="table-bordered" style="margin: 5px auto">
							<tr>
								<td  style="text-align: center;">选择</td>
								<td style="text-align: center;">IP地址</td>
							</tr>
						</table>
					</div>
				</td>
				<td valign="middle" align="center">
					<input type="button" value=">>" onclick="addCvs()" class="button"/>
					<br> <br> 
					<input type="button" value="<<" onclick="delCvs()" class="button"/>
				</td>
				<td colspan="2">
					<div id="tableDiv" style="overflow: auto; height: 180px;"
						class="table">
						<table id="selrackList" width="100%"  class="table-bordered" style="margin: 5px auto">
							<tr>
								<td style="text-align: center;">选择</td>
								<td style="text-align: center;">IP地址</td>
							</tr>
							<c:if test="${!empty  Rack_IpList}" >
								<c:forEach items="${Rack_IpList}" var="item" varStatus="c">
									<tr>
										<td align="center">
											<input name="checkSpa" type="checkbox" value="${item.id}" checked="checked"/>
										</td>
										
										<td align="center">${item.ipadd}</td>
									</tr>
								</c:forEach>
							</c:if>
						</table>
					</div>
				</td>
			</tr>
			<tr>
				<td colspan="5" align="center">
					<a href="javascript:void(0);" class="easyui-linkbutton" onclick="submitValue();" style="width: 50px; margin: 1px 3px;">确定</a>
					<a href="javascript:void(0);" class="easyui-linkbutton" onclick="cancelValue();" style="width: 50px;margin: 1px 3px;">取消</a>
				</td>
			</tr>
		</table>
	</div>
	<script type="text/javascript">
	function resetqueryipform(){
		$('#queryipform .easyui-combobox').combobox('clear');
		var rackid=$('#rackid').val();
		$('#queryipform').form('clear');
		$('#rackid').val(rackid);
	}
	function cancelValue() {
		$("#rackToIPsDialog").dialog("destroy").remove();
	}
	var rackid= $('#rackid').val();
	function addCvs() {
		if($('#rackList input:checked').length==0){
			$.messager.alert('提示','请选择要添加的IP地址!');
			return;
		}
		$('#rackList input:checked').each(function (){
			var tr = $(this).parent().parent();
			$('#selrackList').append(tr.clone());
			tr.remove()
		});
		
	}
	function delCvs() {
		if($('#selrackList input:checked').length==0){
			$.messager.alert('提示','请选择要移除的IP地址!');
			return;
		}
		$('#selrackList input:checked').each(function (){
			var tr = $(this).parent().parent();
			$('#rackList').append(tr.clone());
			$('#rackList').find("input").attr("checked", false);
			tr.remove();
		});
		
	}

	function submitValue() {//rackList selrackList
		var ipids='';
		if($('#selrackList input').length<1){
			$.messager.alert('提示','请选择要关联的IP!');
			return;
		}else{
			$('#selrackList input').each(function (i){
				console.log(i+":"+$(this).val());
				if(i<$('#selrackList input').length-1){
					ipids+=($(this).val()+",");
				}else{
					ipids+=$(this).val();
				}
			});
			$.ajax({  
	            type : "POST",  //提交方式  
	            url : "/dCRack?rackRelationIp",//路径  
	            data : {  
	                "rackid" : $('#rackid').val(),
	                "ipids":ipids
	            },//数据，这里使用的是Json格式进行传输  
	            success : function(result) {//返回数据根据结果进行相应的处理  
	            	result=JSON.parse(result);
	                if (result.success ) {  
	                	$.messager.alert('提示',result.msg);
	                	$("#rackToIPsDialog").dialog("destroy").remove();
	                } else {  
	                	$.messager.alert('提示',result.msg);
	                }  
	            }  
	        });
		}
	}

	var ipflag = 0;
	var netflag = 0;
	var netflagOk = 0;
	var notLarge = 0;
	function checkip() {
		ipflag = 0;
		notLarge = 0;
		if ($("#one").val().trim().length > 0){
			ipflag += 1;
		}
		if ($("#two").val().trim().length > 0){
			ipflag += 1;
		}
		if ($("#three").val().trim().length > 0){
			ipflag += 1;
		}
		if ($("#four").val().trim().length > 0){
			ipflag += 1;
		}
		if ($("#five").val().trim().length > 0){
			ipflag += 1;
		}
	}

	function searchiplist() {
		checkip();
		/* if($("#areaId").val()==""){
			$.messager.alert('提示',"请选择区域或机房！");
			return;
		} */
		if (ipflag == 5) {
			var n1 = new Number($("#four").val().trim());
			var n2 = new Number($("#five").val().trim());
			if (n1 >= n2 && n1 < 255 && n2 < 255) {
				notLarge = 1;
				$.messager.alert('提示',"终止IP要比起始IP大！");
				return;
			}
		}
		if (ipflag > 0 && ipflag < 4) {
			$.messager.alert('提示',"请至少输入起始IP或终止IP，或重置！");
			return;
		} else {
			if (ipflag == 5) {
				$("#startip").val($("#one").val().trim()+ "."+ $("#two").val().trim()+ "."+ $("#three").val().trim()+ "."+ $("#four").val().trim());
				$("#endip").val($("#one").val().trim()+ "."+ $("#two").val().trim()+ "."+ $("#three").val().trim()+ "."+ $("#five").val().trim());
			}
			if (ipflag == 4) {
				if ($("#four").val().length > 0){
					$("#startip").val($("#one").val().trim()+ "."+ $("#two").val().trim()+ "."+ $("#three").val().trim()+ "."+ $("#four").val().trim());
				}else{
					$("#endip").val($("#one").val().trim()+ "."+ $("#two").val().trim()+ "."+ $("#three").val().trim()+ "."+ $("#five").val().trim());
				}
			}
			findIpByIps();
		}
	}

	function findIpByIps() {
		var ipsegName = $("#ipName").textbox('getValue');
		if ($("#four").val() == "") {
			$("#four").val('0') ;
		}
		if ($("#five").val() == "") {
			$("#five").val('255');
		}
		var ipSta = $("#one").val() + "."+ $("#two").val() + "."+ $("#three").val() + ":"+ $("#four").val();
		var ipEnd = $("#five").val();
		var status =  $("#status").combobox("getValue");
		var areaName = $("#areaNameRack").textbox('getValue');
		var areaId = $("#areaId").val();
		
		/* var ipCheck = document.getElementsByName("selItemChk");
		var ipArrId = new Array();
		for (var i = 0; i < ipCheck.length; i++) {
			ipArrId.push(ipCheck[i].val());
		}
		var ipId = ipArrId.join(","); */
 		if (ipsegName == "" && ipSta == "..:0" && areaName == "") {
			$.messager.alert('提示',"起始IP、IP段名称、区域或机房条件中至少输入一个查询条件，请输入！");
			return;
		} else {
			$("#rackList tr:not(:first)").remove();
			$.messager.progress({
				'title':'提示 ' ,
				'msg':'正在查询，请稍后··· ',
				'text':''		
			}); 
			$.ajax({
				type:"POST",
				url:"/dCIp/findFlag",
				data:{
					"id":$('#rackid').val(),
					"ipsegName":ipsegName,
					"areaName":areaName,
					"areaId":areaId,
					"status":status,
					"ipSta":ipSta,
					"endip":ipEnd
				},
				dataType:"json",
				success:function(data){
					$.messager.progress('close');
					if(data.ipList!=null && data.ipList.length>0){
						var str="";
						for (var i = 0; i < data.ipList.length; i++) {
		 					str+="<tr><td align='center' noWrap width='20%'>"+
								"<input type='checkBox' value='"+data.ipList[i].id+"'/>"+
								"</td><td align='center' noWrap width='40%'>"+data.ipList[i].ipadd+"</td></tr>"
						}
		 				$("#rackList").append(str);
					}else{
						$.messager.alert('提示',"没有找到相应的ip地址");
					}
				}
			})
		} 
	}
	function focus1(id, nextId) {
		var Text = document.getElementById(id);
		if (parseInt(Text.value) > 255) {
			if (id == "one") {
				alert(Text.value + "不是有效项，请填入一个介于1-223的值！");
				Text.value = 223;
			} else {
				alert(Text.value + "不是有效项，请填入一个介于1-255的值！");
				Text.value = 255;
			}
		}
		if (Text.value.length > 2) {
			document.getElementById(nextId).focus();
		}
		if (isNaN(parseInt(Text.value))) {
			Text.value = "";
		}
		return;
	}
	function blur1() {
		var Text = $("#one").val();
		if (parseInt(Text.value) <= 0) {
			$.messager.alert('提示',Text.value + "不是有效项，请填入一个介于1-223的值！");
			Text.focus();
			Text.value = 1;
		}
		return;
	}
	function doConfirmNativeNet() {
		var node = $('#localNetTree').tree('getSelected');
		if (node.attributes.type == '2') {
			$.messager.alert('提示', '选择的区域无效，请重新选择!');
			return;
		}
		if (node != null) {
			var nodeparent = $('#localNetTree').tree('getParent',node.target);
			if ($('#AreaFlagParams').val() == 'queryCust') {
				if (node.attributes.type == 'room') {
					$('#roomId').val(node.id);
					$('#areaId').val(nodeparent.id);
					$('#areaNameRack').textbox('setValue',node.text);
				} else {
					$('#areaId').val(node.id);
					$('#areaNameRack').textbox('setValue',node.text);
				}
			} 
		}
		$('#queryArea').dialog('destroy').remove();
	}
</script>
</body>
</html>
