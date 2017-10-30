<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/sysTipAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
	<title>温馨提示</title>
</head>
<script>

	DWREngine.setErrorHandler(handler);
	 
	 function handler(errors) {
        alert(errors);
        enableForm("tipForm");
        return false;
    }
    
</script>
<body>
	<form name="tipForm">
<!--					<input type="hidden" id="flag" value=""/>-->
					<input type="hidden" id="tipLabel" value=""/>
					<input type="hidden" id="tipModuleId" value=""/>
					<table border=1 width="100%" CELLPADDING=0 CELLSPACING=0 class="table01">
					<tr>
						<table border="0" width="100%" cellpadding="0" cellspacing="0">
							<tr>
								<td width="100%"  class="headers" height="24px">
									<table width="100%" border="0" cellspacing="0" cellpadding="0" >
										<tr class="headerfont">
											<td width="3%"></td>
				                            <td width="40%">帮助提示</td>
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
														<td noWrap bgcolor="#F4F4F4" width="10%">
															<div align="right">
															      帮助:
															</div>
														</td>
														<td align="left">
															<textarea id="tipContext" name="tipContext" type="text" rows="15"  style="width:95%;" class="inputtext01" onkeydown="if(event.keyCode==13){$('tipContext').value = $('tipContext').value+'\n';}">
															</textarea>
														</td>
													</tr>
													<tr>
														<td colspan="2" align="center">
															<input type="button" class="button"  onClick="tipDoSave();" value="保存" tabindex="-1">
															<input type="button" class="button"  onClick="tipDoClose();" value="返回" tabindex="-1">
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
	
	initTipData();
	
	function initTipData() {
		trimForm();
		$('tipLabel').value = objData.tipLabel;
		$('tipModuleId').value = objData.tipModuleId;
		sysTipAction.getSysTipsWithBLOBsByPrimaryKey(objData,callbackTipFun);
		disableForm();
	}
	
	function callbackTipFun(obj) {
		enableForm();
		if(obj!=null) {
			if(obj.tipContext == undefined || obj.tipContext == null || obj.tipContext == '') {
				$('tipContext').value = '';
			} else {
				$('tipContext').value = obj.tipContext;
			}
			$('tipLabel').value = obj.tipLabel;
			$('tipModuleId').value = obj.tipModuleId;
		}
	}
	
	function tipDoClose() {
		window.close();
	}
	
	function tipDoSave() {
		trimForm();
		var formObj = new Object();
		formObj.tipLabel = $('tipLabel').value;
		formObj.tipContext = $('tipContext').value;
		formObj.tipModuleId = $('tipModuleId').value;
		sysTipAction.updateByTip(formObj,callbackDoSave);
		disableForm();
	}
	
	function callbackDoSave(str) {
		enableForm();
		if(str!=undefined && str!=null && str!=''){
			handler(str);
		}
		window.close();
	}

</script>
</html>