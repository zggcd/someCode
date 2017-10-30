<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/js/mydiv.js'></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/cb2.js"></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<html>
<head>
<title>OSS接口平台</title>
</head>

<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="0" >

<table width="100%" border="0" cellpadding="5" cellspacing="0" bgcolor="#FFFFFF"  height="100%">
  <tr>
    <td valign="top">

<br>
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  
  <tr>
    <td bgcolor="#FFFFFF">
    <table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
    <tr>
    <td> <div id="queryResultList2" style="PADDING-RIGHT:0px;">
           </div>   
        <input id="addItem" type="button" class="button" value="新增" onClick="toSysDicItemAdd();"/>     
        <input id="del" type="button" class="button" value="删除" onClick="deleteRelateDicItem();"/>
        
       </td>
  </tr>
</table>
      </td>
  </tr>
</table>
  </td>
  </tr>
</table>
<script>
    var dictionaryId = "${param.dictionaryId}";  
	initQueryResultList2();
	function initQueryResultList2(){
		DWRUtil.useLoadingMessage('数据读取中...');
		sysDicItemAction.getDataSysDicItemByDictionaryId(dictionaryId,showResultList2);
		disableForm();
	}

	function showResultList2(str){
		enableForm();
		$('queryResultList2').innerHTML = str;
	}
	
	function deleteRelateDicItem() {
		var ids = getSelectCheckboxValue("queryResultList2","checkid1",":");
		if(ids!=""){
			if(confirm("确定删除?"))
			{
				sysDicItemAction.deleteDataSysDicItem(ids,delCallback);
				disableForm();
			}
		} else {
			alert("请选择记录!");
			return false;
		}
	}
	
	function delCallback() {
		enableForm();
		alert("删除成功!");
		initQueryResultList2();
	}
	
	function toSysDicItemAdd() {
		enableForm();
    	var addSysDicConfigObj = window.showModalDialog("/jsp/sys/dic/sysDicItemAdd.jsp",dictionaryId,"dialogWidth=400px;dialogHeight=400px;center=yes;status=no;scroll=no");
    	if(addSysDicConfigObj!=-1) {
    		initQueryResultList2();
    	}
	}
	
	function toSysDicItemEdit(itemId) {
		enableForm();
		if(itemId!=null) {
			sysDicItemAction.getDataSysDicItem(itemId,callbackSysDicItemEdit);
			disableForm();
		}
	}
	
	function callbackSysDicItemEdit(objData) {
		enableForm();
		var editSysDicConfigObj = window.showModalDialog("/jsp/sys/dic/sysDicItemEdit.jsp",objData,"dialogWidth=400px;dialogHeight=400px;center=yes;status=no;scroll=no");
    	if(editSysDicConfigObj!=-1) {
    		initQueryResultList2();
    	}
	}

</script>

</body>
</html>