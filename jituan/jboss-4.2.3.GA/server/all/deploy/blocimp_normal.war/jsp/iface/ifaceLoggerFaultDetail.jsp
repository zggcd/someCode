<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/ifaceLoggerFaultAction.js'></script>
<%@ include file='/jsp/widget/calendar.jsp'%>
<%@ include file='/jsp/common/allTag.jsp' %>


<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
	<title>OSS�ӿ�ƽ̨</title>
</head>
<body>
	<form name="ifaceLogFacadeEdit">
			<input type="hidden" id="repositoryId" name="repositoryId" value="" />
			<input type="hidden" id="repairId" name="repairId" value="" />
			
			<input type="hidden" id="repairUser" name="repairUser" value="" />
			<input type="hidden" id="repairDate" name="repairDate" value="" />
			<input type="hidden" id="faultCause" name="faultCause" value="" />
			<input type="hidden" id="faultDescription" name="faultDescription" value="" />
					<table border=1 width="100%" CELLPADDING=0 CELLSPACING=0 class="table01">
					<tr>
						<table border="0" width="100%" cellpadding="0" cellspacing="0">
							<tr>
								<td width="100%"  class="headers" height="24px">
									<table width="100%" border="0" cellspacing="0" cellpadding="0" >
										<tr class="headerfont">
											<td width="3%"></td>
				                            <td width="40%">�����޸�</td>
				                            <td width="57%"></td>
				                        </tr>
									</table>
								</td>
							</tr>
						</table>
					</tr>
						<tr>
							<td class="bg_01">
								<table width="100% border=" 0"  ellpadding="2" cellspacing="1">
									<tr>
										<td valign="top">
											<table height="100%" width=100% border=1 cellpadding=2 cellspacing=0 bordercolorlight=#CCCCCC bordercolordark=#FFFFFF bgcolor="#FFFFFF" frame=box id=powergrid style="FONT-SIZE: 13px"
												pcolor="#CCCCCC">
												<tbody>
													<tr>
														<td noWrap bgcolor="#F4F4F4" width="35%">
															<div align="right">
															      ϵͳ����:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="applicationName" style="border:0 0 0 0;width:90%" disabled/>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       ϵͳ����:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="applicationSn" style="border:0 0 0 0;width:90%" disabled/>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																����ʱ��:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="createDate" style="border:0 0 0 0;width:90%" disabled />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															     ������־:
															</div>
														</td>
														<td align="left">
															<textarea name="traceText" type="text" rows="10"  style="width:90%;border:0px" class="inputtext01" readOnly >
															</textarea>
														</td>														
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      �޸���:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="repairUserCopy" size="20" dataType="Require" msg="�޸��˲���Ϊ��" />
															<font color="red">*</font>
														</td>								
													</tr>
													<tr>
													<td noWrap bgcolor="#F4F4F4">
														<div align="right">
															�޸�ʱ��:
														</div>
													</td>
													<td align="left">
														<input name="repairDateCopy" class="inputtext01" size="20" readonly maxlength="20" dataType="Date" msg="�޸�ʱ���������" onclick="return showCalendar('repairDateCopy', '%Y-%m-%d');" />
														<font color="red">*</font>
													</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																����ԭ��:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="faultCauseCopy" value="" style="width:90%" dataType="Require" msg="����ԭ����Ϊ��"/>
															<font color="red">*</font>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																��������:
															</div>
														</td>
														<td align="left">
															<textarea name="faultDescriptionCopy" id="faultDescriptionCopy" rows="3" class="inputtext01" style="width:90%" >
															</textarea>	
														</td>
													</tr>
													<tr>
														<td colspan="2" align="center">
															<input type="button" class="button"  onClick="ifaceLogFacadeDoSave();" value="����">
															&nbsp;&nbsp;
															<input type="button" class="button"  onClick="ifaceLogFacadeDoClose();" value="ȡ��">
														</td>
													</tr>
												</tbody>
											</table>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
</body>
<script type="text/javascript">
    var ifaceLogFacadeObj = window.dialogArguments;
    if(ifaceLogFacadeObj!=null) {
    	//Ӧ�ó�������
    	if(ifaceLogFacadeObj.applicationName!=null && ifaceLogFacadeObj.applicationName!='') {
    		$('applicationName').value = ifaceLogFacadeObj.applicationName;
    	}
    	//Ӧ�ó������
    	if(ifaceLogFacadeObj.applicationSn!=null && ifaceLogFacadeObj.applicationSn!='') {
    		$('applicationSn').value = ifaceLogFacadeObj.applicationSn;
    	}
    	//����ʱ��
    	if(ifaceLogFacadeObj.createDate!=null && ifaceLogFacadeObj.createDate!='') {
    		$('createDate').value = ifaceLogFacadeObj.createDate.toLocaleString();
    	}
    	//�쳣��ջ
    	if(ifaceLogFacadeObj.traceText!=null && ifaceLogFacadeObj.traceText!='') {
    		$('traceText').value = ifaceLogFacadeObj.traceText;
    	}
    	
    	//�޸���
    	if(ifaceLogFacadeObj.repairUser!=null && ifaceLogFacadeObj.repairUser!='') {
    		$('repairUser').value = ifaceLogFacadeObj.repairUser;
    		$('repairUserCopy').value = ifaceLogFacadeObj.repairUser;
    		$('repairUserCopy').style.disabled = true;
    	}
    	//�޸�ʱ��
    	if(ifaceLogFacadeObj.repairDate!=null && ifaceLogFacadeObj.repairDate!='') {
    		var temp = ifaceLogFacadeObj.repairDate.toLocaleDateString();
    		var dateFormatYYYYMMDD = temp.substring(0,4)+"-"+temp.substring(5,7)+"-"+temp.substring(8,10);
    		$('repairDateCopy').value = dateFormatYYYYMMDD;
    		$('repairDate').value = dateFormatYYYYMMDD;
    		$('repairDateCopy').style.disabled = true;
    	}
    	//����ԭ��
    	if(ifaceLogFacadeObj.faultCause!=null && ifaceLogFacadeObj.faultCause!='') {
    		$('faultCause').value = ifaceLogFacadeObj.faultCause;
    		$('faultCauseCopy').value = ifaceLogFacadeObj.faultCause;
    		$('faultCauseCopy').style.disabled = true;
    	}
    	//��������
    	if(ifaceLogFacadeObj.faultDescription!=null && ifaceLogFacadeObj.faultDescription!='') {
    		$('faultDescription').value = ifaceLogFacadeObj.faultDescription;
    		$('faultDescriptionCopy').value = ifaceLogFacadeObj.faultDescription;
    		$('faultDescriptionCopy').style.disabled = true;
    	}
    	
    	if(ifaceLogFacadeObj.repositoryId!=null && ifaceLogFacadeObj.repositoryId!='') {
    		$('repositoryId').value = ifaceLogFacadeObj.repositoryId;
    	}
    	if(ifaceLogFacadeObj.repairId!=null && ifaceLogFacadeObj.repairId!='') {
    		$('repairId').value = ifaceLogFacadeObj.repairId;
    	}
    }
    
    initIfaceLogFacadeData();
    
    function initIfaceLogFacadeData() {
    	trimForm();
    }
    
    function ifaceLogFacadeDoClose() {
    	window.close();
    }
    
    function ifaceLogFacadeDoSave() {
    	if (!validateForm(ifaceLogFacadeEdit, 1)) {
            return false;
        }
        //�޸���
        if($('repairUserCopy').value!='') {
        	$('repairUser').value = $('repairUserCopy').value;
        }
        //�޸�ʱ��
        if($('repairDateCopy').value!='') {
        	$('repairDate').value = $('repairDateCopy').value;
        }
        //����ԭ��
        if($('faultCauseCopy').value!='') {
        	$('faultCause').value = $('faultCauseCopy').value;
        }
        //��������
        if($('faultDescriptionCopy').value!='') {
        	$('faultDescription').value = $('faultDescriptionCopy').value;
        }
		var formObj = $('ifaceLogFacadeEdit').serialize(true); 
    	ifaceLoggerFaultAction.updateIfaceLogRepair(formObj,callBackDoSave);
    }
    
    function callBackDoSave() {
    	alert("�����ɹ�");
    	window.close();
    }
    
    
</script>
</html>