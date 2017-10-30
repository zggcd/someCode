<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/ifaceConfigCacheAction.js'></script>
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

	/*
	 *  �쳣����
	 */
	DWREngine.setErrorHandler(handler);
	 
	 function handler(errors) {
        alert(errors);
        enableForm("commonQueryForm");
        return false;
    }
	
	/*
	 *  insert operation
	 */
	function insertOperation(rootId) {
		if(rootId!=null && rootId!='') {
			ifaceConfigCacheAction.selectRecordByRootId(rootId,callbackInsertOperation);
			disableForm();
		}
	}
	
	function callbackInsertOperation(instanceAndRootId) {
		enableForm();
		var pos = instanceAndRootId.indexOf(':');
		if(pos == 0) {
			ifaceConfigCacheAction.insertBySelective(instanceAndRootId,callbackInsertOperation2);
			disableForm();
		} else {
			if(confirm("�Ѿ����ھ�̬����ʵ����¼�����������룿")) {
				ifaceConfigCacheAction.insertBySelective(instanceAndRootId,callbackInsertOperation2);
				disableForm();
			}
		}
	}
	
	function callbackInsertOperation2() {
		enableForm();
		alert('�����ɹ�!');
		showAllData();
	}
	
	/*
	 *  remove operation
	 */
	function removeOperation(rootId) {
		if(rootId!=null && rootId!='') {
			ifaceConfigCacheAction.selectRecordByRootId(rootId,callbackRemoveOperation);
			disableForm();
		}
	}
	
	function callbackRemoveOperation(instanceAndRootId) {
		enableForm();
		var pos = instanceAndRootId.indexOf(':');
		if(pos != 0) {
			if(confirm("ȷ��ɾ����")) {
			
				ifaceConfigCacheAction.findMapping(instanceAndRootId,callbackRemoveFun);
				disableForm();
			}
		} else {
			alert('�����ڶ�Ӧ�ľ�̬ʵ����¼!');
			return false;
		}
	}
	
	function callbackRemoveFun(info) {
		enableForm();
		if(info=='cannotDelete') {
			if(confirm('Ҫɾ����̬ʵ�����ݣ�����ɾ����ؾ�̬�������ݣ��Ƿ���ת����̬���ý��棿')){
				//document.form1.action = "/sys/sysDicConfigAction.do?method=toSysDicConfigSrch";
				//document.form1.submit();
				window.location.href = "/jsp/iface/ifaceConfigMapping2.jsp";
			}
		} else {
			alert("ɾ���ɹ�!");
			showAllData();
		}
	}
	
	/*
	 *  update operation
	 */
	function updateOperation(rootId) {
		if(rootId!=null && rootId!='') {
			ifaceConfigCacheAction.selectRecordByRootId(rootId,callbackUpdateOperation);
			disableForm();
		}
	}
	
	function callbackUpdateOperation(instanceAndRootId) {
		enableForm();
		if(instanceAndRootId!=null && instanceAndRootId!=''){
			var pos = instanceAndRootId.indexOf(':');
			if(pos != 0) {
				if(confirm('ȷ������������ʵ������?')) {
					ifaceConfigCacheAction.updateInstanceByInstanceAndRootId(instanceAndRootId,callbackUpdateFun);
					disableForm();
				}
			} else {
				alert('��̬ʵ�����в�����������¼���޷����²���!');
				return false;
			}
		}
	}
	
	function callbackUpdateFun() {
		enableForm();
		alert("ɾ���ɹ�!");
		showAllData();
	}
	
	/*
	 *  ��ѯ��ť�������޶�����������ˢ�½���
	 */
	function showAllData() {
		DWRUtil.useLoadingMessage('���ݶ�ȡ��...');
		var formObj = $('commonQueryForm').serialize(true); 
		ifaceConfigCacheAction.getIfaceWxtogbeomsList(formObj,showTablequeryResultList);
		disableForm();
	}
	
	function queryResultList(str) {
		enableForm();
		$('queryResultList').innerHTML = str;
	}
	
</script>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<form name="form1" method="post" action=""></form>
<form name="commonQueryForm">
<input type="hidden" id="orderByClause" name="orderByClause" value="" />
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
	<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="17" onClick="ev_hiddenQueryTable();">
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
    <div id="queryCondicationArea">
    <table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
    <tr style="display:display">
      <td align="right"  bgcolor="#F4F4F4" width="130">��Ӧ���ͣ�</td>
      <td>
      	<select size="1" id="responseCode" name="responseCode">
	        <option value=""></option>
			<option value="0">�ɹ�</option>
			<option value="-1">ʧ��</option>
		  </select>
      </td>
      <td align="right"  bgcolor="#F4F4F4" >��̬���ݱ��룺</td>
      <td><input type="text" name="sysCode" class="inputtext01" value=""/></td>
  	  <td align="right"  bgcolor="#F4F4F4" >ʵ�����룺</td>
      <td><input type="text" name="itemId" class="inputtext01" value=""/></td>
      <td align="right"  bgcolor="#F4F4F4" >�������ͣ�</td>
      <td>
      	<select size="1" id="changetype" name="changetype">
	        <option value=""></option>
			<option value="update">����</option>
			<option value="insert">����</option>
			<option value="delete">ɾ��</option>
		  </select>
      </td>
  </tr>
  <tr>
  		<td colspan=7></td>
	   <td align="left">
	   	    <input type="button" class="button" value="��ѯ(Q)" accesskey="Q"  onclick="initqueryResultList();" align="right"/>
       		<input type="button" class="button" value="����(R)" accesskey="R"  onclick="reset();" align="right"/>
       		<input type="hidden" name="pageNumber" value="1" />
       		<input type="hidden" name="maxResults" value="15" />
	   </td>
  </tr>
</table>
</div>
      </td>
  </tr>
</table>
</form>
<br>
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td>
    <table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
	<tr>
	<td  class="tabpaneleft2"></td>
	<td class="tabpanebg2"   width="120">
	<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
	ϵͳ�����б�
	</td>
	<td class="tabpaneright2">
   </td>
    </tr>
    </table>
    </td>
  </tr>
  <tr>
    <td bgcolor="#FFFFFF">
    <table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
    <tr>
    <td> <div id="queryResultList" style="PADDING-RIGHT:0px;">
           </div>
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
	if(Prototype.Browser.Opera){
			initqueryResultList(); 
	}else{
			Event.observe(window, 'load', initqueryResultList); 
	}
	
	function initqueryResultList(){
		DWRUtil.useLoadingMessage('���ݶ�ȡ��...');
		trimForm();
		var formObj = $('commonQueryForm').serialize(true); 
		ifaceConfigCacheAction.getIfaceWxtogbeomsList(formObj,showTablequeryResultList);
		disableForm();
	}
	
	function showTablequeryResultList(str){
		enableForm();
		$('queryResultList').innerHTML = str;
	}
</script>

</body>
</html>