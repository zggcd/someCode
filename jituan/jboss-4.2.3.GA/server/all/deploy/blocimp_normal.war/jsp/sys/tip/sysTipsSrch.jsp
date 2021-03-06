<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysTipAction.js'></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/cb2.js"></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/imgurl.css" type="text/css">
<html>
<head>
<title>OSS接口平台</title>
</head>
<script src="<%=request.getContextPath()%>/js/frameservice.js"></script>
<script>

	DWREngine.setErrorHandler(handler);
	 
	 function handler(errors) {
        alert(errors);
        enableForm("commonQueryForm");
        return false;
    }

	//use
	function doDel() {
		var ids = getSelectCheckboxValue("queryResultList","checkid",":");
		if(ids!=""){
			if(confirm("确定删除?"))
			{
				sysTipAction.deleteByIds(ids,delCallback);
				disableForm();
			}
		} else {
			alert("请选择记录!");
			return false;
		}
	}
	
	function delCallback(){
		enableForm();
		alert("操作成功");
		showAllData();
	}
	
	//use
	function toSysTipsAdd() {
    	var sysTipsObj = window.showModalDialog("/jsp/sys/tip/sysTipsAdd.jsp",null,"dialogWidth=430px;dialogHeight=400px;center=yes;status=no;scroll=no");
    	if(sysTipsObj!=-1) {
    		showAllData();
    	}
	}
	
	function countValidCheck() {
		var id = document.getElementsByName("checkid");
		var count = 0;
		for ( var i = 0; i < id.length; i++) {
			if (id[i].checked) {
				count++;
			}
		}
		return count;
	}
	
	function getValidFirstCheckValue() {
		var id = document.getElementsByName("checkid");
		var count = 0;
		for ( var i = 0; i < id.length; i++) {
			if (id[i].checked) {
				return id[i].value;
			}
		}
	}
	
	function toSysDicConfigEdit() {
		enableForm();
		var count = countValidCheck();
		if(count <= 0) {
			alert("请选择一条记录!");
			return false;
		} else if(count > 1) {
			alert("只能选择一条记录!");
			return false;
		} else if(count == 1) {
			var id = getValidFirstCheckValue();
			sysDicConfigAction.getDataSysDicConfig(id,callbackSysDicConfig);
			disableForm();
		}
	}
	
	//use
	function toSysTipsEdit(tipId) {
		var editObj = window.showModalDialog("/jsp/sys/tip/sysTipsEdit.jsp",tipId,"dialogWidth=430px;dialogHeight=400px;center=yes;status=no;scroll=no");
		if(editObj==1) {
   			showAllData();
   		}
	}
	
	function toSysDicItemRelateList(obj) {
		createNewTab('tabView1','字典条目列表','','/sys/sysDicConfigAction.do?method=showSysDicItemByDictionaryId&dictionaryId='+obj,true);
	}
	
	//use
	function showAllData(){
		DWRUtil.useLoadingMessage('数据读取中...');
		trimForm();
		var formObj = $('commonQueryForm').serialize(true); 
		formObj.tipModuleId = '';
		formObj.tipLabel = '';
		formObj.tipContext = '';
		sysTipAction.selectByExample(formObj,showTablequeryResultList);
		disableForm();
	}
	
	//use
	function showTableAfterDel(str) {
		enableForm();
		$('queryResultList').innerHTML = str;
	}
	
	function callTipTemplate() {
		window.showModalDialog("/jsp/sys/tip/showTipTemplate.jsp",null,"dialogWidth=400px;dialogHeight=400px;center=yes;status=no;scroll=no");
	}
	
</script>

<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="0" >
<form name="commonQueryForm" >
<input type="hidden" id="orderByClause" name="orderByClause" value="" />
<%@ include file='/jsp/widget/wztool.jsp'%>
<table width="100%" border="0" cellpadding="5" cellspacing="0" bgcolor="#FFFFFF"  height="100%">
  <tr>
    <td valign="top">
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td>
    <table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
	<tr>
	<td  class="tabpaneleft2"></td>
	<td class="tabpanebg2"   width="120">
	<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
	查询条件
	<img src="<%=request.getContextPath()%>/images/main/button_bug2.gif"   width="19" height="17">
	</td>
	<td class="tabpaneright2"> </td>
   </tr>
    </table>
    </td>
  </tr>
  <tr>
    <td bgcolor="#FFFFFF">
    <table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
    <tr style="display:display">
      <td align="right"  bgcolor="#F4F4F4" >
        模块名称：
      </td>
      <td><input type="text" name="tipModuleId" class="inputtext01" value=""/></td>
      <td align="right"  bgcolor="#F4F4F4" >
         标签名称：
      </td>
      <td><input type="text" name="tipLabel" class="inputtext01" value=""/></td>
      <td align="right"  bgcolor="#F4F4F4" >
         标签内容：
      </td>
      <td><input type="text" name="tipContext" class="inputtext01" value=""/></td>
      <td>
         <input type="button" class="button" value="查询(Q)" accesskey="Q"  onclick="initqueryResultList();" align="right"/>
    	 <input type="button" class="button" value="重置(R)" accesskey="R"  onclick="reset();" align="right"/>
    	 <input type="hidden" name="pageNumber" value="1" />
    	 <input type="hidden" name="maxResults" value="15" />
      </td>
  </tr>

 </form>
</table>
      </td>
  </tr>
</table>
<br>
<div id="tabView1">
			<DIV id="tabView1tab_tabPane">
				<DIV id=tabTabtabView1_0>
    <table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
	<tr>
	<td  class="tabpaneleft2"></td>
	<td class="tabpanebg2"   width="120">
	<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
	<span>提示标签列表</span>
	</td>
	<td class="tabpaneright2">
   </td>
    </tr>
    </table>
 </DIV>
</DIV>
<div class="tab_aTab">
    <table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
    <tr>
    <td>
      <div id="queryResultList" style="PADDING-RIGHT:0px;"></div>
    </td>    
  </tr>
  <tr>
   <td>
     <input id="addConfig" type="button" class="button" value="新增" onClick="toSysTipsAdd();"/>
     <input id="deleteConfig" type="button" class="button" value="删除" onClick="doDel();"/>
     <input id="tipTemplate" type="button" class="button" value="调用模板" onClick="callTipTemplate();"/>
   </td>
  </tr>
</table>
</div>
  </td>
  </tr>
</table>

<script>
	
	if(Prototype.Browser.Opera){
			initqueryResultList(); 
	}else{
			Event.observe(window, 'load', initqueryResultList); 
	}
	
	function initqueryResultList(){
		DWRUtil.useLoadingMessage('数据读取中...');
		trimForm();
		var formObj = $('commonQueryForm').serialize(true); 
		sysTipAction.selectByExample(formObj,showTablequeryResultList);
		disableForm();
	}
	
	function showTablequeryResultList(str){
		enableForm();
		$('queryResultList').innerHTML = str;
	}
	
</script>

</body>
</html>