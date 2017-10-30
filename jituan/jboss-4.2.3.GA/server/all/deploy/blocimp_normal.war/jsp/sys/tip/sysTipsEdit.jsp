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
	<title>OSS接口平台</title>
</head>
<script>

	DWREngine.setErrorHandler(handler);
	 
	 function handler(errors) {
        alert(errors);
        enableForm("sysTipsEditForm");
        return false;
    }
    
</script>
<body>
	<form name="sysTipsEditForm">
					<input type="hidden" id="tipId" name="tipId" value="" />
					<input type="hidden" id="tipModuleId" name="tipModuleId" value="" />
					<table border=1 width="100%" CELLPADDING=0 CELLSPACING=0 class="table01">
					<tr>
						<table border="0" width="100%" cellpadding="0" cellspacing="0">
							<tr>
								<td width="100%"  class="headers" height="24px">
									<table width="100%" border="0" cellspacing="0" cellpadding="0" >
										<tr class="headerfont">
											<td width="3%"></td>
				                            <td width="40%">编辑提示标签</td>
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
														<td noWrap bgcolor="#F4F4F4" width="25%">
															<div align="right">
															      模块名称:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" name="tipModuleIdShow" maxlength="64" style="width:85%" style="border:0"/>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4" width="25%">
															<div align="right">
															      提示标签名称:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" id="tipLabel" name="tipLabel" maxlength="64" style="width:85%"/>
															<font color="red">*</font>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       提示标签内容:
															</div>
														</td>
														<td align="left">
															<textarea name="tipContext" type="text" rows="12"  style="width:85%;" class="inputtext01" dataType="Require" msg="提示标签内容不能为空">
															</textarea>
															<font color="red">*</font>
														</td>
													</tr>
													<tr>
														<td colspan="2" align="center">
															<input type="button" class="button"  onClick="sysDicTipsSave();" value="保存">
															&nbsp;&nbsp;
															<input type="button" class="button"  onClick="sysDicTipsCancel();" value="取消">
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

    var tipId = window.dialogArguments;
    
    initData();
    
    //use
    function initData() {
    	trimForm();
    	sysTipAction.selectByPrimaryKey(tipId,callbackEditFun);
    	disableForm();
    }
    
    //use
    function callbackEditFun(obj) {
    	enableForm();
    	if(obj!=null) {
	    	if(obj.tipModuleId!=null && obj.tipModuleId!="") {
	    		$('tipModuleId').value = obj.tipModuleId;
	    		$('tipModuleIdShow').value = obj.tipModuleId;
	    	}
	    	if(obj.tipId!=null && obj.tipId!="") {
	    		$('tipId').value = obj.tipId;
	    	}
	    	if(obj.tipLabel!=null && obj.tipLabel!="") {
	    		$('tipLabel').value = obj.tipLabel;
	    	}
	    	if(obj.tipContext!=null && obj.tipContext!="") {
	    		$('tipContext').value = obj.tipContext;
	    	}
	    }
	    $('tipModuleIdShow').disabled = true;
    }
    
    //use
    function sysDicTipsCancel() {
    	window.close();
    }
    
    //use
    function sysDicTipsSave() {
    	if (!validateForm(sysTipsEditForm, 1)) {
            return false;
        }
		var formObj = $('sysTipsEditForm').serialize(true); 
    	sysTipAction.updateByPrimaryKeySelective(formObj,callBackDoSave);
    	disableForm();
    }
    
    //use
    function callBackDoSave(str) {
    	enableForm();
    	if(str == "") {
    		alert("操作成功");
	    	window.returnValue = 1;
	    	window.close();
    	} else {
    		handler(str);
    	}
    }
    
</script>
</html>