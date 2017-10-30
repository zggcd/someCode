<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/ifaceConfigProtocolAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>


<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
	<title>OSS接口平台</title>
</head>
<script>
    
</script>
<body>
	<form name="ifaceConfigProtocolEditForm">
			<input type="hidden" id="applicationId" name="applicationId" value="" />
			<input type="hidden" id="protocolId" name="protocolId" value="" />
					<table border=1 width="100%" CELLPADDING=0 CELLSPACING=0 class="table01">
					<tr>
						<table border="0" width="100%" cellpadding="0" cellspacing="0">
							<tr>
								<td width="100%"  class="headers" height="24px">
									<table width="100%" border="0" cellspacing="0" cellpadding="0" >
										<tr class="headerfont">
											<td width="3%"></td>
				                            <td width="40%">编辑接口系统配置</td>
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
														<td noWrap bgcolor="#F4F4F4" width="15%">
															<div align="right">
															      服务类别:
															</div>
														</td>
														<td align="left" width="35%">
															<select size="1" id="serveType" name="serveType">
																<option value="SERVER" selected>服务器端
																<option value="CLIENT">客户端
		  													</select>
														</td>
														<td noWrap bgcolor="#F4F4F4" width="15%">
															<div align="right">
															       用户名:
															</div>
														</td>
														<td align="left" width="35%">
															<input type="text" class="inputtext01" name="userName" maxlength="200" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      电话号码:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="phoneNumber" maxlength="200" Require="false" dataType="Phone" msg="电话号码格式不正确"/>
														</td>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       Email 地址:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="emailAddress" maxlength="200" size="30" require="false" dataType="Email" msg="信箱格式不正确">
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      接口名称:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="interfaceName" maxlength="100" />
														</td>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       协议名称:
															</div>
														</td>
														<td align="left">
															<blocimp:sysDicDis iddValue="PROTOCOL_TYPE" value="protocolName" dicItemIn="${obj.protocolId}" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																FTP地址:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="remoteHost" value="${obj.remoteHost}" maxlength="200" />
														</td>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															    FTP端口:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="remotePort" maxlength="255" size="30" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      授权帐户:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="authAccount" maxlength="200" />
														</td>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      提供商名称:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="providerName" maxlength="200" size="30" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      帐户密码:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="authPassword" maxlength="200" />
														</td>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       JNDI 名称:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="jndiName" maxlength="200" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       服务名称:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="serviceName" maxlength="200" />
														</td>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      JMS消息目的地:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="destination" maxlength="200" size="30" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      端口名称:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="portName" maxlength="200" />
														</td>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       命名空间:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="nameSpace" maxlength="255" size="30" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															   WSDL地址:
															</div>
														</td>
														<td colspan="3" align="left">
															<input type="text" class="inputtext01" id="wsdlAddr" name="wsdlAddr" maxlength="200" size="80"/>
														</td>
													</tr>
													<tr>
														<td colspan="4" align="center">
															<input type="button" class="button"  onClick="ifaceConfigProtocolSave();" value="保存">
															&nbsp;&nbsp;
															<input type="button" class="button"  onClick="ifaceConfigProtocolClose();" value="取消">
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

	var protocolId = window.dialogArguments;
	
	initIfaceConfigProtocolEdit();
	
	function initIfaceConfigProtocolEdit() {
		trimForm();
		ifaceConfigProtocolAction.selectProtocolByPrimaryKey(protocolId,callbackFun);
	}
	
	function callbackFun(objData) {
		if(objData.serveType!=null && objData.serveType!='') {
			$('serveType').value = objData.serveType;
		}
		if(objData.userName!=null && objData.userName!='') {
			$('userName').value = objData.userName;
		}
		if(objData.phoneNumber!=null && objData.phoneNumber!='') {
			$('phoneNumber').value = objData.phoneNumber;
		}
		if(objData.emailAddress!=null && objData.emailAddress!='') {
			$('emailAddress').value = objData.emailAddress;
		}
		if(objData.interfaceName!=null && objData.interfaceName!='') {
			$('interfaceName').value = objData.interfaceName;
		}
		if(objData.protocolName!=null && objData.protocolName!='') {
			$('protocolName').value = objData.protocolName;
			if($('protocolName').value == 'ws') {
				$('jndiName').readOnly = true;
	    		$('providerName').readOnly = true;
	    		$('destination').readOnly = true;
			} else if($('protocolName').value == 'jms') {
				$('nameSpace').readOnly = true;
			}
		}
		if(objData.authAccount!=null && objData.authAccount!='') {
			$('authAccount').value = objData.authAccount;
		}
		if(objData.providerName!=null && objData.providerName!='') {
			$('providerName').value = objData.providerName;
		}
		if(objData.authPassword!=null && objData.authPassword!='') {
			$('authPassword').value = objData.authPassword;
		}
		if(objData.jndiName!=null && objData.jndiName!='') {
			$('jndiName').value = objData.jndiName;
		}
		if(objData.wsdlAddr && objData.wsdlAddr!='') {
			$('wsdlAddr').value = objData.wsdlAddr;
		}
		if(objData.serviceName!=null && objData.serviceName!='') {
			$('serviceName').value = objData.serviceName;
		}
		if(objData.destination!=null && objData.destination!='') {
			$('destination').value = objData.destination;
		}
		if(objData.portName!=null && objData.portName!='') {
			$('portName').value = objData.portName;
		}
		if(objData.nameSpace!=null && objData.nameSpace!='') {
			$('nameSpace').value = objData.nameSpace;
		} 
		if(objData.protocolId!=null && objData.protocolId!='') {
			$('protocolId').value = objData.protocolId;
		}
		if(objData.applicationId!=null && objData.applicationId!='') {
			$('applicationId').value = objData.applicationId;
		}
		if(objData.remoteHost!=null && objData.remoteHost!='') {
			$('remoteHost').value = objData.remoteHost;
		}
		if(objData.remotePort!=null && objData.remotePort!='') {
			$('remotePort').value = objData.remotePort;
		}
	}
	
	function operationProtocolSelected(obj) {
    	if(obj.value == 'jms') {
    		$('nameSpace').value = '';
    		$('nameSpace').readOnly = true;
    		$('jndiName').readOnly = false;
    		$('providerName').readOnly = false;
    		$('destination').readOnly = false;
    	} else if(obj.value == 'ws') {
    		$('nameSpace').value = '';
    		$('nameSpace').readOnly = false;
    		$('jndiName').readOnly = true;
    		$('providerName').readOnly = true;
    		$('destination').readOnly = true;
    		$('jndiName').value = '';
    		$('providerName').value = '';
    		$('destination').value = '';
    	} else {
    		$('jndiName').readOnly = false;
    		$('providerName').readOnly = false;
    		$('destination').readOnly = false;
    		$('nameSpace').readOnly = false;
    	}
    }
    
    function warnInfo(obj) {
    	if(obj.readOnly == true){
    		alert('JNDI名称，提供商名称，JMS消息目的地只有当协议名称为jms时才有效.');
    		return false;	
    	}
    }
    
    function warnInfo2(obj) {
    	if(obj.readOnly == true){
    		alert('命名空间只有当协议名称为ws时才有效.');
    		return false;	
    	}
    }
    
    function ifaceConfigProtocolClose() {
    	window.close();
    }
    
    function ifaceConfigProtocolSave() {
    	if (!validateForm(ifaceConfigProtocolEditForm, 1)) {
            return false;
        }
		var formObj = $('ifaceConfigProtocolEditForm').serialize(true); 
    	ifaceConfigProtocolAction.updateIfaceConfigProtocolRecord(formObj,callBackDoSave);
    }
    
    function callBackDoSave() {
    	alert("操作成功");
    	window.returnValue = 1;
    	window.close();
    }
    
</script>
</html>