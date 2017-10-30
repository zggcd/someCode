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
        enableForm("sysTipsAddForm");
        return false;
    }
    
</script>
<body>
	<form name="sysTipsAddForm">
					<table border=1 width="100%" CELLPADDING=0 CELLSPACING=0 class="table01">
					<tr>
						<table border="0" width="100%" cellpadding="0" cellspacing="0">
							<tr>
								<td width="100%"  class="headers" height="24px">
									<table width="100%" border="0" cellspacing="0" cellpadding="0" >
										<tr class="headerfont">
											<td width="3%"></td>
				                            <td width="40%">提示标签模板</td>
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
															第一步：引入js库:
														</td>
													</tr>
													<tr>
														<td align="left">
															<textarea type="text" rows="3"  style="width:95%;color:#FF0000 " class="inputtext01" readOnly>
																<script type='text/javascript' src='/js/commonjs.js'></script>
															</textarea>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4" width="35%">
															第二步：在需要标签的输入框处添加onclick事件：
														</td>
													</tr>
													<tr>
														<td align="left">
															<textarea type="text" rows="10"  style="width:95%;color:#FF0000 " class="inputtext01" readOnly>
																<img  alt="说明" onclick="showTips('moduleId','labelId');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">插入需要提示标签的输入框的后面，这里的'moduleid'是新增时填写的模块ID,'labelId'是新增时填写的标签ID.
															</textarea>
														</td>
													</tr>
													<tr>
														<td colspan="2" align="center">
															<input type="button" class="button"  onClick="DoClose();" value="返回">
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
	
	initFun();
	
	function initFun() {
		trimForm();
	}
	
	function DoClose() {
		window.close();
	}
    
</script>
</html>