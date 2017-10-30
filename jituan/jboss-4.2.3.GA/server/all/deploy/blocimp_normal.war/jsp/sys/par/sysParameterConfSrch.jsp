<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysParameterConfAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="/js/tab-view/css/tab-view.css" type="text/css" media="screen">
<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>
<html>
<head>
<title>OSS接口平台</title>
</head>
<script>
DWREngine.setErrorHandler(handler);
    function handler(errors) {
        alert(errors);
        return false;
    }
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
      <td>
         参数名称：
      </td>
      <td>
         <input type="text" name="parName" >
      </td>
      <td>
         <input type="button" class="button" value="查询(Q)" accesskey="Q"  onclick="initQueryResultList()" />
         <input type="button" class="button" value="重置(R)" accesskey="R"  onclick="" />
         <input type="button" class="button" value="新增" accesskey="Q"  onclick="toAdd()" />
         <input type="button" class="button" value="删除" accesskey="R"  onclick="delElement()" />
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
	<span>  系统参数列表</span>
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
initTabs('tabView1',Array('系统参数列表'),0,'100%','100%');
function getDetail(parId, parName){
	createNewTab('tabView1','参数{'+parName+'}','','/sys/sysParameterConfAction.do?method=toSysParameterConfEdit&parId='+parId,true);
}

function toAdd(){
    createNewTab('tabView1','新增参数','','/sys/sysParameterConfAction.do?method=toSysParameterConfAdd',true);
}

function delElement(){
  var checkids=getSelectCheckboxValue("queryListForm","checkid","|");
  if(checkids==""){
     alert("请选择记录！");
     return;
  }
  if(confirm("您确认要删除选中记录吗？")){
    sysParameterConfAction.deleteDataSysParameterConf(checkids,goBack);
  }
}

initQueryResultList();
function initQueryResultList(){
		DWRUtil.useLoadingMessage('数据读取中...');
		var formObj=$('queryForm').serialize(true);
		sysParameterConfAction.getSysParameterConfList(formObj,showResultList);
}

function showResultList(str){
		$('queryResultList').innerHTML = str;
}

function saveParameter(){
     if (!validateForm(parameterForm, 1)) {
            return false;
        }
    var formObj=$('parameterForm').serialize(true);
    sysParameterConfAction.updateDataSysParameterConf(formObj,goBack);
}

function addParameter(){
     if (!validateForm(parameterAddForm, 1)) {
            return false;
        }
     var formObj=$('parameterAddForm').serialize(true);
     sysParameterConfAction.addDataSysParameterConf(formObj,goBack);
}

function goBack(s){
  if(s==""){
     alert("操作成功！");
     initQueryResultList();
  }else{
    alert(s);
  }
}
</script>

</body>
</html>