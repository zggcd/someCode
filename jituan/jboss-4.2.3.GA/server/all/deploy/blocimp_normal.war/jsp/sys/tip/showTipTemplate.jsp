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
	<title>OSS�ӿ�ƽ̨</title>
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
				                            <td width="40%">��ʾ��ǩģ��</td>
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
															��һ��������js��:
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
															�ڶ���������Ҫ��ǩ����������onclick�¼���
														</td>
													</tr>
													<tr>
														<td align="left">
															<textarea type="text" rows="10"  style="width:95%;color:#FF0000 " class="inputtext01" readOnly>
																<img  alt="˵��" onclick="showTips('moduleId','labelId');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">������Ҫ��ʾ��ǩ�������ĺ��棬�����'moduleid'������ʱ��д��ģ��ID,'labelId'������ʱ��д�ı�ǩID.
															</textarea>
														</td>
													</tr>
													<tr>
														<td colspan="2" align="center">
															<input type="button" class="button"  onClick="DoClose();" value="����">
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