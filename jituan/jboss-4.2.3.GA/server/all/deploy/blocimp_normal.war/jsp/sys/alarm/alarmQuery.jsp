<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/alarmAction.js'></script>
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
<!--
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
         �澯���ͣ�
      </td>
      <td>
         <input type="text" name="elementName" >
      </td>
      <td>
         <input type="button" class="button" value="��ѯ(Q)" accesskey="Q"  onclick="initQueryResultList()" />
         <input type="button" class="button" value="���(C)" accesskey="C"  onclick="delAlarm()" />
         </td>
  </tr>
</table>
      </td>
  </tr>
</table>
<br>
 -->
 </form>
<div id="tabView1">
			<DIV id="tabView1tab_tabPane">
				<DIV id=tabTabtabView1_0>
    <table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
	<tr>
	<td  class="tabpaneleft2"></td>
	<td class="tabpanebg2"   width="120">
	<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
	<span>�澯��Ϣ�б�</span>
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
initTabs('tabView1',Array('�澯��Ϣ�б�'),0,'100%','100%');
function getDetail(elementid,name){
	createNewTab('tabView1','Ԫ��{'+name+'}','','/sys/alarmAction.do?method=taticElementDetail&elementid='+elementid,true);
}

function delAlarm(){
  var checkids=getSelectCheckboxValue("queryListForm","checkid","|");
  if(checkids==""){
     alert("��ѡ���¼��");
     return;
  }
  if(confirm("��ȷ��Ҫɾ��ѡ�м�¼��")){
    alarmAction.delAlarm(checkids,goBack);
  }
}

initQueryResultList();
function initQueryResultList(){
		DWRUtil.useLoadingMessage('���ݶ�ȡ��...');
		var formObj=$('queryForm').serialize(true);
		alarmAction.alarmList(formObj,showResultList);
}

function showResultList(str){
		$('queryResultList').innerHTML = str;
}

function goBack(s){
  if(s==""){
     alert("�����ɹ���");
     initQueryResultList();
  }
}

setInterval("initQueryResultList()",60000);  //һ����ˢ��һ��
</script>

</body>
</html>