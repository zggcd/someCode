<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysDicItemAction.js'></script>
<script type='text/javascript' src='/dwr/interface/sysDicConfigAction.js'></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/cb2.js"></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/imgurl.css" type="text/css">
<html>
<head>
<title>OSS�ӿ�ƽ̨</title>
</head>
<script src="<%=request.getContextPath()%>/js/frameservice.js"></script>
<script>

	DWREngine.setErrorHandler(handler);
	 
	 function handler(errors) {
        alert(errors);
        enableForm("commonQueryForm");
        return false;
    }

	function doDel() {
		var ids = getSelectCheckboxValue("queryResultList","checkid","|");
		if(ids!=""){
			if(confirm("ȷ��ɾ��?"))
			{
				sysDicItemAction.deleteDataSysDicItem(ids,delCallback);
				disableForm();
			}
		} else {
			alert("��ѡ���¼!");
			return false;
		}
	}
	
	function delCallback(){
		alert("�����ɹ�");
		enableForm();
		showAllData();
	}
	
	function toSysDicItemAdd() {
		enableForm();
    	var addSysDicConfigObj = window.showModalDialog("/jsp/sys/dic/sysDicItemAdd.jsp",null,"dialogWidth=400px;dialogHeight=400px;center=yes;status=no;scroll=no");
    	if(addSysDicConfigObj!=-1) {
    		showAllData();
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
    		showAllData();
    	}
	}
	
	function showAllData() {
		DWRUtil.useLoadingMessage('���ݶ�ȡ��...');
		var formObj = $('commonQueryForm').serialize(true); 
		sysDicItemAction.getSysDicItemList(formObj,showTablequeryResultList);
		disableForm();
	}
	
	function queryResultList(str) {
		enableForm();
		$('queryResultList').innerHTML = str;
	}
	
	function countCheck() {
		var id = document.getElementsByName("checkid");
		var count = 0;
		for ( var i = 0; i < id.length; i++) {
			if (id[i].checked) {
				count++;
			}
		}
		return count;
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
	��ѯ����
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
       	�����ֵ����ƣ�
      </td>
      <td>
		<select size="1" id="dicId" name="dicId"></select>
	  </td>
      <td align="right"  bgcolor="#F4F4F4" >
         �ֵ���Ŀ���ţ�
      </td>
      <td><input type="text" name="itemCode" class="inputtext01" value=""/></td>
      <td align="right"  bgcolor="#F4F4F4" >
         �ֵ���Ŀ���ƣ�
      </td>
      <td><input type="text" name="itemValue" class="inputtext01" value=""/></td>
      <td>
         <input type="button" class="button" value="��ѯ(Q)" accesskey="Q"  onclick="initqueryResultList();" align="right"/>
    	 <input type="button" class="button" value="����(R)" accesskey="R"  onclick="reset();" align="right"/>
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
	<span>�ֵ���Ŀ�б�</span>
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
     <input id="addItem" type="button" class="button" value="����" onClick="toSysDicItemAdd();"/>
     <input id="deleteItem" type="button" class="button" value="ɾ��" onClick="doDel()"/>
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
			sysDicConfigAction.getSysDicConfigIdAndNameList(callbackInit2);
	}else{
			Event.observe(window, 'load', initqueryResultList); 
			sysDicConfigAction.getSysDicConfigIdAndNameList(callbackInit2);
	}
	
	function initqueryResultList(){
		DWRUtil.useLoadingMessage('���ݶ�ȡ��...');
		trimForm();
		var formObj = $('commonQueryForm').serialize(true); 
		if(DWRUtil.getValue('dicId')!=null && DWRUtil.getValue('dicId')!="") {
			formObj.dictionaryId = DWRUtil.getValue('dicId');
		}
		sysDicItemAction.getSysDicItemList(formObj,showTablequeryResultList);
		disableForm();
	}
	
	function showTablequeryResultList(str){
		enableForm();
		$('queryResultList').innerHTML = str;
	}
	
	function callbackInit2(objList) {
		if(objList!=null){
			DWRUtil.removeAllOptions("dicId");
			DWRUtil.addOptions("dicId", objList,"dictionaryId","dictionaryName");
		}
	}
	
</script>

</body>
</html>