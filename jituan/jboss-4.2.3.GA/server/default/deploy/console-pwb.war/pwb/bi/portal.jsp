<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Portal - jQuery EasyUI</title>
<%@ include file="/pwb/common/jsp/easyUIincluded.inc" %> 
<script type="text/javascript" src="<%=request.getContextPath()%>/pwb/common/easyui/jquery.portal.js"></script>
	<style type="text/css">
		.title{
			font-size:16px;
			font-weight:bold;
			padding:20px 10px;
			background:#eee;
			overflow:hidden;
			border-bottom:1px solid #ccc;
		}
		.t-list{
			padding:5px;
		}
	</style>

	
	<script>
		$(function(){
			$('#pp').portal({
				border:false,
				fit:true
			});
			add();
		});
		function add(){
			for(var i=0; i<3; i++){
				var p = $('<div/>').appendTo('body');
				p.panel({
					title:'Title'+i,
					content:'<div style="padding:5px;">Content'+(i+1)+'</div>',
					height:100,
					closable:true,
					collapsible:true
				});
				$('#pp').portal('add', {
					panel:p,
					columnIndex:i
				});
			}
			$('#pp').portal('resize');
		}
		function remove(){
			$('#pp').portal('remove',$('#pgrid'));
			$('#pp').portal('resize');
		}
	</script>
</head>
<body class="easyui-layout">
	<div  class="title" border="false" style="height: 20px; background-color: #293c55;color: white;">
		jQuery EasyUI Portal
	</div>
	<div  border="false">
		<div id="pp" style="position:relative">
			<div style="width:30%;">
				<div title="Clock" style="text-align:center;background:#f3eeaf;height:150px;padding:5px;">
					<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,29,0" width="100" height="100">
				      <param name="movie" value="http://www.respectsoft.com/onlineclock/analog.swf">
				      <param name=quality value=high>
				      <param name="wmode" value="transparent">
				      <embed src="http://www.respectsoft.com/onlineclock/analog.swf" width="100" height="100" quality=high pluginspage="http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash" type="application/x-shockwave-flash" wmode="transparent"></embed>
				    </object>
			    </div>
			    <div title="教程" collapsible="true" closable="true" style="height:200px;padding:5px;">
			    	<div class="t-list"><a href="http://www.jeasyui.com/tutorial/datagrid/datagrid1.php">Build border layout for Web Pages</a></div>
			    	<div class="t-list"><a href="http://www.jeasyui.com/tutorial/layout/panel.php">Complex layout on Panel</a></div>
			    	<div class="t-list"><a href="http://www.jeasyui.com/tutorial/layout/accordion.php">Create Accordion</a></div>
			    	<div class="t-list"><a href="http://www.jeasyui.com/tutorial/layout/tabs.php">Create Tabs</a></div>
			    	<div class="t-list"><a href="http://www.jeasyui.com/tutorial/layout/tabs2.php">Dynamically add tabs</a></div>
			    	<div class="t-list"><a href="http://www.jeasyui.com/tutorial/layout/panel2.php">Create XP style left panel</a></div>
			    </div>
			</div>
			<div style="width:40%;">
				<div id="pgrid" title="表格数据"   class="easyui-panel" closable="true" style="height:650px;">
					<table class="easyui-datagrid" title="基础表格样式" style="width:900px;height:650px"
			data-options="singleSelect:true,collapsible:true,url:'<%=request.getContextPath()%>/queryItems.do',method:'post',singleSelect:false, 
        pagination:true,
        rownumbers:true,pageSize:20,pageList:[15,20,30,50] ">
				<thead style="text-align: center;">
					<tr>
						<th data-options="field:'itemid',width:80" style="text-align: center;">Item ID</th>
						<th data-options="field:'itemname',width:100" style="text-align: center;">条目名称</th>
						<th data-options="field:'itemvalue',width:200,align:'right'" style="text-align: center;">条目值</th>
						<th data-options="field:'itemdesc',width:80,align:'right'" style="text-align: center;">条目描述</th>
						<th data-options="field:'dictionaryid',width:250" style="text-align: center;">字典ID</th>
						<th data-options="field:'isvalid',width:60,align:'center'" style="text-align: center;">是否有效</th>
					</tr>
				</thead>
			</table>
				</div>
			</div>
			<div style="width:30%;">
				<div title="搜素" iconCls="icon-search" closable="true" style="height:80px;padding:10px;">
					<input class="easyui-searchbox">
				</div>
				<div title="图形" closable="true" style="height:200px;text-align:center;">
					<img height="160" src="http://pic2.ooopic.com/03/06/31/99b1OOOPICc9.jpg"></img>
				</div>
			</div>
		</div>
	</div>
</body>
</html>