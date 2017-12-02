<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 导入公共资源库 -->
<%@ include file="/pwb/include/common.jspf"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>机架互换</title>

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
	<div class="easyui-panel" style="height: auto;margin: 5px auto;">
		<table class="table-bordered" style="margin: 5px auto">
			<tr>
				<td style="text-align: center">目前机架:</td>
				<td width="40%">
					<input id="rackid1" type="hidden" value="${rackPage.id }" />
					${rackPage.name } 
				</td>
				
				<td style="text-align: center">转换为:</td>
				<td  width="40%">
					 <input class="easyui-textbox" name="rackname" id="rackname_search"  style="height:32px;"
						 data-options="buttonText:'选择',
							prompt:'---请选择机架---',
							editable:false,
						  	onClickButton:function(){
						  		createBoxForRack('search','doConfirmRack','','','','Y');
						  	}"/>
					 <input type="hidden" id="rackid_search" name="rackid" />
				</td>
			</tr>
			<tr>
				
				<td colspan="4" style="text-align: center">
					<a href="javascript:void(0);" class="easyui-linkbutton" id="find_cust2" onclick="saveRackSwap();"style="width: 50px; margin: 5px 3px;">保存</a>
					<a href="javascript:void(0);" class="easyui-linkbutton"  onclick="closeChangeRackWin();"style="width: 50px; margin: 5px 3px;">取消</a>
				
				</td>
			</tr>
		</table>
	</div>
	<script type="text/javascript">
	function closeChangeRackWin(){
		$('#changeRackDialog').dialog('destroy').remove();
	}
	
	
	
</script>
</body>
</html>