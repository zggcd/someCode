<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/taticConfigAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="/js/tab-view/css/tab-view.css" type="text/css" media="screen">
<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>
<html>
<head>
<title>OSS�ӿ�ƽ̨</title>
</head>
<script>

</script>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="0" >
<form name="queryForm" >
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
         ���������ƣ�
      </td>
      <td>
         <input type="text" name="taticgoupname" >
      </td>
      <td>
         <input type="button" class="button" value="��ѯ(Q)" accesskey="Q"  onclick="initQueryResultList()" />
         <input type="button" class="button" value="ȷ��(S)" accesskey="S"  onclick="onSure()" />
         <input type="button" class="button" value="ȡ��(C)" accesskey="C"  onclick="window.close();" />
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
	<span>�������б�</span>
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
</table>
</div>
  </td>
  </tr>
</table>
<script>
initTabs('tabView1',Array('�������б�'),0,'100%','100%');
function getDetail(id,name){
	createNewTab('tabView1','������{'+name+'}','','/supt/taticConfigAction.do?method=taticGroupDetail&taticgoupid='+id,true);
}
function delElement(){
  var checkids=getSelectCheckboxValue("queryListForm","checkid","|");
  if(checkids==""){
     alert("��ѡ���¼��");
     return;
  }
  if(confirm("��ȷ��Ҫɾ��ѡ�м�¼��")){
    taticConfigAction.delTaticGroup(checkids,goBack);
  }
}

initQueryResultList();
function initQueryResultList(){
		DWRUtil.useLoadingMessage('���ݶ�ȡ��...');
		var formObj=$('queryForm').serialize(true);
		taticConfigAction.taticGroupList(formObj,showResultList);
}

function showResultList(str){
		$('queryResultList').innerHTML = str;
}

function saveGroup(){
     if (!validateForm(detailForm, 1)) {
            return false;
        }
    var elementCheckids=getSelectCheckboxValue("detailForm","elementCheckid","|");
    if(elementCheckids==""){
       alert("��ѡ��˲����������Ԫ�أ�");
       return;
    }
    var formObj=$('detailForm').serialize(true);
    formObj.elementCheckids=elementCheckids;
    taticConfigAction.saveTaticGroup(formObj,goBack);
}
function goBack(s){
  if(s==""){
     alert("�����ɹ���");
     initQueryResultList();
  }
}

function onSure(){
 var cimpFaceId="${param.cimpFaceId}";
 var checkids=getSelectCheckboxValue("queryListForm","checkid","|");
 var formObj={};
 formObj.elementCheckids=checkids;
 formObj.cimpFaceId=cimpFaceId;
 taticConfigAction.saveIfaceGroup(formObj,goBack1);
}
function goBack1(s){
  if(s==""){
     alert("�����ɹ���");
     window.returnValue="true";
     window.close();
  }
}

</script>

</body>
</html>