<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/widget/calendar.jsp'%>
<%@ include file='/jsp/common/allTag.jsp' %>
<html>
<head>
<title>OSS�ӿ�ƽ̨</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/imgurl.css" type="text/css">
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/ifaceLoggerTraceAction.js'></script>
</head>
<script type="text/javascript">

	function openIfaceLogRepositoryMWBDetail(applicationId,repositoryId) {
		enableForm();
		window.showModalDialog("/iface/ifaceLoggerTraceAction.do?method=getIfaceLogRepositoryDataSrchDetail&repositoryId=" + repositoryId + "&dc=" + new Date(), null, "dialogWidth:800px;dialogHeight:650px;center:yes;status:no;");
		//ifaceLoggerTraceAction.getIfaceLogRepositoryDataSrchDetail(applicationId,repositoryId,callBackLogRepositoryDetail);
    }
    
     //�ж��Ƿ񽫲�ѯ������
	 function ev_hiddenQueryTable(){
		if ($('queryCondicationArea').style.display == "none") {
				$('queryCondicationArea').show();
			} else {
				$('queryCondicationArea').hide();
			}
	 }
	
</script>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
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
      <td align="right"  bgcolor="#F4F4F4" width="130">�ӿ����ƣ�</td>
      <td>
       	<select size="1" id="applicationName" name="applicationName">
		</select>     
      </td>
      <td align="right"  bgcolor="#F4F4F4" >��־���ͣ�</td>
      <td>
      	<select size="1" id="traceLevel" name="traceLevel">
      		<option value=""></option>
      		<option value="TRACE">����</option>
      		<option value="ERROR">�쳣</option>
		</select>
	   </td>
	   <td align="right"  bgcolor="#F4F4F4" >�������ƣ�</td>
	   <td>
	   	<input name="methodName" class="inputtext01" size="20" />
	   </td>
	   <td align="right"  bgcolor="#F4F4F4" >��־���ݣ�</td>
	   <td>
	   	<input name="traceText" class="inputtext01" size="20" />
	   </td>
  </tr>
  <tr>
      <td align="right"  bgcolor="#F4F4F4" width="130">��ʼ���ڣ�</td>
      <td>
       	<input name="createOnStart" class="inputtext01" size="10" readonly maxlength="10" dataType="Date" msg="��ʼ�����������" onclick="return showCalendar('createOnStart', '%Y-%m-%d');" />
      </td>
      <td align="right"  bgcolor="#F4F4F4" >�������ڣ�</td>
      <td>
      	<input name="createOnEnd" class="inputtext01" size="10" readonly maxlength="10" dataType="Date" msg="���������������" onclick="return showCalendar('createOnEnd', '%Y-%m-%d');" />
	   </td>
	   <td align="right"  bgcolor="#F4F4F4" >�������ݣ�</td>
	   <td>
	   	<input name="xmlDocument" class="inputtext01" size="20" />
	   </td>
	   <td align="right"  bgcolor="#F4F4F4" >�Ƿ�鵵��</td>
	   <td>
	   	 <select id="isArchived" name="isArchived">
	   	 	<option value="0" selected>��</option>
	   	 	<option value="1">��</option>
	   	 </select>
	   </td>
  </tr>
  <tr>
  	  <td colSpan="8" align="right">
	   	    <input type="button" class="button" value="��ѯ(Q)" accesskey="Q"  onclick="initqueryResultList();" align="right"/>
       		<input type="button" class="button" value="����(R)" accesskey="R"  onclick="reset();" align="right"/>
       		<input type="hidden" name="relateId" value="${param.relateId}" />
       		<input type="hidden" name="skipResults" value="0" />
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
	��־�б�
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
			Event.observe(window, 'load', getApplicationNameList); 
	}
	
	function initqueryResultList(){
		DWRUtil.useLoadingMessage('���ݶ�ȡ��...');
		trimForm();
		var formObj = $('commonQueryForm').serialize(true); 
		ifaceLoggerTraceAction.getIfaceLogRepositoryDataList(formObj,showTablequeryResultList);
		disableForm();
	}
	
	function showTablequeryResultList(str){
		enableForm();
		$('queryResultList').innerHTML = str;
	}
	
	//Ӧ�ó��������ֻ��߽ӿ����Ƽ���ȡ�ò���(���ڳ�ʼ��ʱʹ��)
	function getApplicationNameList() {
	 	ifaceLoggerTraceAction.getIfaceApplicationNameList(callBackApplicationNameList);
	 }
	 
	 function callBackApplicationNameList(objList) {
	 	DWRUtil.removeAllOptions("applicationName");
	 	DWRUtil.addOptions("applicationName", objList,"applicationId","applicationName");
	 }
	
</script>

</body>
</html>