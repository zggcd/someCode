<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysServiceConfig.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>


<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
	<title>OSS�ӿ�ƽ̨</title>
</head>
<script>

	DWREngine.setErrorHandler(handler);
	 
	 function handler(errors) {
        alert(errors);
        enableForm("addSysServiceConfigForm");
        return false;
    }
    
    function startRunonceOnChange() {
    	var startRunonce = $('startRunonce').value;
    	if(startRunonce == 'Y') {
    		$('runInterval').value = "";
    		$('runInterval').disabled = true;
    		alert('����ʱ����������!');
    		return false;
    	} else {
    		$('runInterval').disabled = false;
    	}
    }
    
</script>
<body>
	<form name="addSysServiceConfigForm">
					<table border=1 width="100%" CELLPADDING=0 CELLSPACING=0 class="table01">
					<tr>
						<table border="0" width="100%" cellpadding="0" cellspacing="0">
							<tr>
								<td width="100%"  class="headers" height="24px">
									<table width="100%" border="0" cellspacing="0" cellpadding="0" >
										<tr class="headerfont">
											<td width="3%"></td>
				                            <td width="40%">������������</td>
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
															      ��������:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="serviceName" maxlength="100" size="40" dataType="Require" msg="�������Ʋ���Ϊ��" />
															<font color="red">*</font>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       ����CLASS:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="serviceClass" maxlength="100" size="40" dataType="Require" msg="����CLASS����Ϊ��" />
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
															<textarea name="serviceDesc" type="text" rows="5"  style="width:87%;" class="inputtext01" ></textarea>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      ����������:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="serviceHostname" maxlength="128" size="40" />
														</td>														
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      WS URL:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="wsUrl" maxlength="255" size="40" />
														</td>								
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																�Ƿ�ֻ����һ��:
															</div>
														</td>
														<td align="left">
															<select name="startRunonce" size="1" onChange="startRunonceOnChange();">
																<option value="N">��
																<option value="Y">��
															</select>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																����ʱ����:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" id="runInterval" name="runInterval" maxlength="16" size="40" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																Ĭ������:
															</div>
														</td>
														<td align="left">
															<select name="startDefault" size="1">
																<option value="Y">��
																<option value="N">��
															</select>
														</td>
													</tr>
													<tr>
														<td colspan="2" align="center">
															<input type="button" class="button"  onClick="saveSysTask();" value="����">
															&nbsp;&nbsp;
															<input type="button" class="button"  onClick="window.close();" value="ȡ��">
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

    function closeWindow() {
    	window.close();
    }
    
    function saveSysTask() {
    	if (!validateForm(addSysServiceConfigForm, 1)) {
            return false;
        }
        if($('startRunonce').value == 'N' && $('runInterval').value == '') {
        	alert('����ʱ��������Ϊ���ұ���Ϊ����');
        	return false;
        }
		var formObj = $('addSysServiceConfigForm').serialize(true); 
    	sysServiceConfig.insertSelectiveDataToSysServiceConfig(formObj,callBackDoSave);
    }
    
    function callBackDoSave(str) {
    	if(str == "") {
    		alert("�����ɹ�");
	    	window.returnValue = 1;
	    	window.close();
    	} else {
    		handler(str);
    	}
    	
    }
    
</script>
</html>