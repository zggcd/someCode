<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/checkAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>


<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
</head>
<body>
	<form name="CheckActionForm">			
					<table border=1 width="100%" CELLPADDING=0 CELLSPACING=0 class="table01">
					<tr>
						<table border="0" width="100%" cellpadding="0" cellspacing="0">
							<tr>
								<td width="100%"  class="headers" height="24px">
									<table width="100%" border="0" cellspacing="0" cellpadding="0" >
										<tr class="headerfont">
											<td width="3%"></td>
				                            <td width="40%">������֤����</td>
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
												  <input type="hidden" value="${requestScope.check.checkId}" name="checkId"/>													    
													  <c:if test="${param.id ne null}">
														<input type="hidden"  value="${param.id}" name="cimpFaceId"  />												  	    
										                  
									                    </c:if>
													
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															       XML�ڵ���:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.check.fieldName}" name="fieldName" maxlength="100" dataType="Require" msg="Ӧ�ó�����벻��Ϊ��" />
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																�Ƿ�����Ϊ��:
															</div>
														</td>
														<td align="left">
															<select name="isNull" class="inputtext01" >															
																<option value="Y" <c:if test="${'Y' eq requestScope.check.isNull}">selected</c:if>>
																	��
																</option>
																<option value="N" <c:if test="${'N' eq requestScope.check.isNull}">selected</c:if>>
																	��
																</option>
															</select>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
																��������:
															</div>
														</td>
														<td align="left">
															<select name="dataType" class="inputtext01" >	
															    <option value=""></option>								
																<option value="static" <c:if test="${'static' eq requestScope.check.dataType}">selected</c:if>>
																	��̬����
																</option>
																<option value="int" <c:if test="${'int' eq requestScope.check.dataType}">selected</c:if>>
																	����
																</option>
															</select>
														</td>
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      ���ݳ���:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.check.fieldLegth}" name="fieldLegth" maxlength="100" size=20 dataType="Require" msg="��ϵ�˲���Ϊ��" />
														</td>														
													</tr>
													<tr>
														<td noWrap bgcolor="#F4F4F4">
															<div align="right">
															      ��ʽ:
															</div>
														</td>
														<td align="left">
															<input type="text" class="inputtext01" value="${requestScope.check.format}" name="format" maxlength="100" size=20 dataType="Double" msg="��ϵ�绰����Ϊ��" />
														</td>								
													</tr>																										
													<tr>
														<td colspan="2" align="center">
															<input type="button" class="button"  onClick="ifaceApplicationDoSave();" value="����">
															&nbsp;&nbsp;
															<input type="button" class="button"  onClick="ifaceApplicationDoClose();" value="ȡ��">
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
    
    function ifaceApplicationDoClose() {
    	window.close();
    }
    
    function ifaceApplicationDoSave() {
    	//if (!validateForm(CheckActionForm, 1)) {
        //    return false;
        //}
		var formObj = $('CheckActionForm').serialize(true); 
    	checkAction.insertCheck(formObj,callBackDoSave);
    }
    
    function callBackDoSave() {
    	alert("�����ɹ�");
    	window.returnValue='T';
    	window.close();
    }
    
     //ѡ��
	function selectFace(){		
	    var url = "/jsp/faceSupt/selectfaceDataSrch.jsp";
		var returnValue = "";
		returnValue = window.showModalDialog(url, window, 'dialogHeight:550px;dialogWidth:550px;status=no;resizable:no');
	    if(returnValue != "" && returnValue != null){
	       var stringArr = returnValue.split("|");
	       document.CheckActionForm.cimpFaceId.value=stringArr[0];
	       document.CheckActionForm.cimpName.value=stringArr[1];
	    }
	  }
    
</script>
</html>