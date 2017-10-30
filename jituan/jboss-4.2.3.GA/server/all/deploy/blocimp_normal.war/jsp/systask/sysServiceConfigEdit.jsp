<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysServiceConfig.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>


<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
	<title>OSS接口平台</title>
</head>
<script>

	DWREngine.setErrorHandler(handler);
	 
	 function handler(errors) {
        alert(errors);
        enableForm("updateSysServiceConfigForm");
        return false;
    }
    
    function startRunonceOnChange() {
    	var startRunonce = $('startRunonce').value;
    	if(startRunonce == 'Y') {
    		$('runInterval').value = "";
    		$('runInterval').disabled = true;
    		alert('运行时间间隔不可用!');
    		return false;
    	} else {
    		$('runInterval').disabled = false;
    	}
    }
    
</script>
<body>
	<form name="updateSysServiceConfigForm">
			<input type="hidden" id="serviceId" name="serviceId" value="" />
				<table border=1 width="100%" CELLPADDING=0 CELLSPACING=0 class="table01">
					<tr>
						<table border="0" width="100%" cellpadding="0" cellspacing="0">
							<tr>
								<td width="100%"  class="headers" height="24px">
									<table width="100%" border="0" cellspacing="0" cellpadding="0" >
										<tr class="headerfont">
											<td width="3%"></td>
				                            <td width="40%">更新定时任务</td>
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
														<td noWrap bgcolor="#F4F4F4" width="30%">
															<div align="right">
															      服务名称:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="serviceName" maxlength="100" size="40" dataType="Require" msg="服务名称不能为空" />
															<font color="red">*</font>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       服务CLASS:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="serviceClass" maxlength="100" size="40" readOnly style="border:0 0 0 0"/>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																服务描述:
															</div>
														</td>
														<td align="left">
															<textarea name="serviceDesc" type="text" rows="5"  style="width:87%;" class="inputtext01" ></textarea>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      服务主机名:
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
																是否只运行一次:
															</div>
														</td>
														<td align="left">
															<select name="startRunonce" size="1" onChange="startRunonceOnChange();">
																<option value="N">否
																<option value="Y">是
															</select>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																运行时间间隔:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" id="runInterval" name="runInterval" maxlength="16" size="40" />
															<font color="red">*</font>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																默认启动:
															</div>
														</td>
														<td align="left">
															<select name="startDefault" size="1">
																<option value="Y">是
																<option value="N">否
															</select>
														</td>
													</tr>
													<tr>
														<td colspan="2" align="center">
															<input type="button" class="button"  onClick="saveSysTask();" value="保存">
															&nbsp;&nbsp;
															<input type="button" class="button"  onClick="window.close();" value="取消">
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

	var objData = window.dialogArguments;
	
	if(objData.serviceId!=null && objData.serviceId!='') {
		$('serviceId').value = objData.serviceId;
	}
	if(objData.serviceName!=null && objData.serviceName!='') {
		$('serviceName').value = objData.serviceName;
	}
	if(objData.serviceClass!=null && objData.serviceClass!='') {
		$('serviceClass').value = objData.serviceClass;
	}
	if(objData.serviceDesc!=null && objData.serviceDesc!='') {
		$('serviceDesc').value = objData.serviceDesc;
	}
	if(objData.serviceHostname!=null && objData.serviceHostname!='') {
		$('serviceHostname').value = objData.serviceHostname;
	}
	if(objData.wsUrl!=null && objData.wsUrl!='') {
		$('wsUrl').value = objData.wsUrl;
	}
	if(objData.runInterval!=null && objData.runInterval!='') {
		$('runInterval').value = objData.runInterval;
	}
	if(objData.startDefault!=null && objData.startDefault!='') {
		$('startDefault').value = objData.startDefault;
	}
	if(objData.startRunonce!=null && objData.startRunonce!='') {
		$('startRunonce').value = objData.startRunonce;
	}
   
    function saveSysTask() {
    	if (!validateForm(updateSysServiceConfigForm, 1)) {
            return false;
        }
        if($('startRunonce').value == 'N' && $('runInterval').value == '') {
        	alert('运行时间间隔不能为空且必须为整数');
        	return false;
        }
		var formObj = $('updateSysServiceConfigForm').serialize(true); 
    	sysServiceConfig.updateSelectiveDataToSysServiceConfig(formObj,callBackDoSave);
    }
    
    function callBackDoSave(str) {
    	if(str == "") {
    		handler('存在异常情况!');
    	} else {
    		alert("操作成功");
	    	window.returnValue = '1';
	    	window.close();
    	}
    	
    }
    
</script>
</html>