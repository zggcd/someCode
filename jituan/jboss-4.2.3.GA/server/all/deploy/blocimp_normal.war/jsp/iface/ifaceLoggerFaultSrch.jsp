<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/ifaceLoggerFaultAction.js'></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/cb2.js"></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/imgurl.css" type="text/css">
<html>
<head>
<title>�쳣��־�б�</title>
</head>
<script src="<%=request.getContextPath()%>/js/frameservice.js"></script>
<script>

	function openLogFacadeDetail(repositoryId,repairId) {
		if(repositoryId!=null && repositoryId!='') {
			ifaceLoggerFaultAction.getIfaceLogTrace(repositoryId,showOneRowqueryResultList);
		}
	}
	
	function showOneRowqueryResultList(obj) {
		window.showModalDialog("ifaceLoggerFaultDetail.jsp",obj,"dialogWidth=550px;dialogHeight=540px;center=yes;status=no;scroll=no");
		showAllData();
	}
	
	function showAllData() {
		DWRUtil.useLoadingMessage('���ݶ�ȡ��...');
		//-------2009/10/14���---------
		var formObj = $('commonQueryForm').serialize(true); 
		formObj.applicationName = '';
		formObj.faultCause = '';
		formObj.repairUser = '';
		//-------2009/10/14���---------
		ifaceLoggerFaultAction.getIfaceLogRepairList(formObj,callBackQueryResultList);
	}
	
	function callBackQueryResultList(str) {
		$('queryResultList').innerHTML = str;
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
		    	<div id="queryCondicationArea">
			    <table class=table id=powergrid style="FONT-SIZE: 13px"
			            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
			            pcolor="#BCC8F5">
				   <tr style="display:display">
				      <td noWrap bgcolor="#F4F4F4" align="right">�ӿ����ƣ�</td>
				      <td>
				      <select name="applicationName" size="1" id="applicationName">
						 <option value="">---ѡ��ӿ�����---</option>
					  </select>
					  </td>
				      <td noWrap bgcolor="#F4F4F4" align="right">����ԭ��</td>
				      <td><input type="text" name="faultCause" class="inputtext01" value=""/></td>
				      <td noWrap bgcolor="#F4F4F4" align="right">�޸��ˣ�</td>
				      <td><input type="text" name="repairUser" class="inputtext01" value=""/></td>
				  </tr>
				  <tr>
				  		<td></td>
				  		<td border=0></td>
				  		<td border=0></td>
				  		<td border=0></td>
				  		<td border=0></td>
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
						�쳣��־�б�
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
				      <td> 
					    <div id="queryResultList" style="PADDING-RIGHT:0px;">
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
	
	//��ʼ������
	function initqueryResultList(){
		DWRUtil.useLoadingMessage('���ݶ�ȡ��...');
		trimForm();
		var formObj = $('commonQueryForm').serialize(true); 
		//��־�б���Ϣ����
		ifaceLoggerFaultAction.getIfaceLogRepairList(formObj,showTablequeryResultList);
		disableForm();
	}
	
	function showTablequeryResultList(str){
		enableForm();
		$('queryResultList').innerHTML = str;
	}
	
	//Ӧ�ó��������ֻ��߽ӿ����Ƽ���ȡ�ò���
	function getApplicationNameList() {
	 	ifaceLoggerFaultAction.getIfaceApplicationNameList(callBackApplicationNameList);
	 }
	 
	 function callBackApplicationNameList(objList) {
	 	if(objList!=null) {
	 		DWRUtil.removeAllOptions("applicationName");
	 		DWRUtil.addOptions("applicationName", objList);
	 	}
	 }
	 
</script>

</body>
</html>