<%@ page contentType="text/html;charset=GBK" language="java"%>
<script type='text/javascript' src='/js/prototype.js'></script>
<script type='text/javascript' src='/js/commonjs.js'></script>
<script type='text/javascript' src='/js/validator.js'></script>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/taticConfigAction.js'></script>
<%@ include file='/jsp/common/allTag.jsp' %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/cb2.css" type="text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/tab/webfx.css" type="text/css">
<link rel="stylesheet" href="/js/tab-view/css/tab-view.css" type="text/css" media="screen">
<script type="text/javascript" src="/js/tab-view/js/ajax.js"></script>
<script type="text/javascript" src="/js/tab-view/js/tab-view.js"></script>
<html>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4"  bgcolor="#FFFFFF">
<form name="mainForm">
<table width="100%" border="0" cellpadding="5" cellspacing="0" bgcolor="#FFFFFF"  height="100%">
  <tr>
    <td valign="top">
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td>
    <table  border="0" cellspacing="0" cellpadding="0" style="font-size:13px" >
	<tr>
	<td  class="tabpaneleft2"></td>
	<td class="tabpanebg2"   width="150">
	<img src="<%=request.getContextPath()%>/images/main_01/ico_fellow.gif" width="18" height="15">
	����ʵ��ά��
	</td>
	<td class="tabpaneright2"> </td>
	<td></td>
   </tr>
    </table>
    </td>
  </tr>
  <tr>
    <td bgcolor="#FFFFFF">
    <table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
     <input type="hidden" name="taticgoupid"  value="${param.taticgoupid}"/>
     <input type="hidden" name="interfacecode"  value="${param.cimpFaceId}"/>
     <input type="hidden" name="applicationId"  value="${param.applicationId}"/>
     <input type="hidden" name="rowrecordid"  value="${param.rowrecordid}"/>
                         	<c:forEach items="${requestScope.elementList}" var="obj" varStatus="n">
								<tr >
								<td align="right"  bgcolor="#F4F4F4" width="10%" nowrap>
									${obj.elementname}��
								</td>
								<td  width="20%">
								    <input type="hidden" name="elementid" value="${obj.elementid}">
									<c:choose>
									<c:when test="${not empty requestScope.instanceList}">
									<c:forEach items="${requestScope.instanceList}" var="instanceObj" varStatus="x">
									    <c:if test="${instanceObj.elementid eq obj.elementid}">
									        <c:choose>
									      <c:when test="${obj.sourcetype eq 'TEXT'}">
									         <input type="text" name="elevalue1" value="${instanceObj.elevalue1}"  size="15">
									        <input type="hidden" name="elevalue2" value="${instanceObj.elevalue2}">
									     </c:when>
									     <c:otherwise>
                                             <blocimp:ifaceSelectTag iddValue="${obj.sqlstr}"  applicationId="${param.applicationId}"  value="elevalue1"  selectValue="${instanceObj.elevalue1}"  style="width:100" hasNull="true" />
									         <input type="hidden" name="elevalue2" >
									     </c:otherwise>
									   </c:choose>
									    </c:if>
									</c:forEach>
									</c:when>
									<c:otherwise>
									    <c:choose>
									      <c:when test="${obj.sourcetype eq 'TEXT'}">
									        <input type="text" name="elevalue1"  size="15">
									        <input type="hidden" name="elevalue2" >
									     </c:when>
									     <c:otherwise>
                                             <blocimp:ifaceSelectTag   iddValue="${obj.sqlstr}"  applicationId="${param.applicationId}"  value="elevalue1"  style="width:100"  hasNull="true"/>
									         <input type="hidden" name="elevalue2" >
									     </c:otherwise>
									   </c:choose>
									</c:otherwise>
									</c:choose>
								</td>
								<td align="right"  bgcolor="#F4F4F4"  width="10%" nowrap>
									ƥ�����
								</td>
								<td  width="15%">
								 <c:choose>
									<c:when test="${not empty requestScope.instanceList}">
								<c:forEach items="${requestScope.instanceList}" var="instanceObj" varStatus="x">
									<c:if test="${instanceObj.elementid eq obj.elementid}">
									<select name="matchingRule">
									   <option value="equal" <c:if test="${instanceObj.matchingRule eq 'equal'}">selected</c:if>>����</option>
									   <option value="notEqual" <c:if test="${instanceObj.matchingRule eq 'notEqual'}">selected</c:if>>������</option>
									   <option value="like" <c:if test="${instanceObj.matchingRule eq 'like'}">selected</c:if>>ģ��</option>
									   <option value="llike" <c:if test="${instanceObj.matchingRule eq 'llike'}">selected</c:if>>��ģ��</option>
									   <option value="rlike" <c:if test="${instanceObj.matchingRule eq 'rlike'}">selected</c:if>>��ģ��</option>
									   <option value="greater" <c:if test="${instanceObj.matchingRule eq 'greater'}">selected</c:if>>����</option>
									   <option value="less" <c:if test="${instanceObj.matchingRule eq 'less'}">selected</c:if>>С��</option>
									   <option value="greaterAndEqual" <c:if test="${instanceObj.matchingRule eq 'greaterAndEqual'}">selected</c:if>>���ڵ���</option>
									   <option value="lessAndEqual" <c:if test="${instanceObj.matchingRule eq 'lessAndEqual'}">selected</c:if>>С�ڵ���</option>
									   <option value="notUse" <c:if test="${instanceObj.matchingRule eq 'notUse'}">selected</c:if>>��Ч</option>
									   <option value="null" <c:if test="${instanceObj.matchingRule eq 'null'}">selected</c:if>>Ϊ��</option>
									   <option value="notNull" <c:if test="${instanceObj.matchingRule eq 'notNull'}">selected</c:if>>��Ϊ��</option>
									   <option value="existValue" <c:if test="${instanceObj.matchingRule eq 'existValue'}">selected</c:if>>�Ѵ���ֵ</option>
									</select>
									</c:if>
								</c:forEach>
								</c:when>
									<c:otherwise>
									  <select name="matchingRule">
									   <option value="equal">����</option>
									   <option value="notEqual">������</option>
									   <option value="like" >ģ��</option>
									   <option value="llike" >��ģ��</option>
									   <option value="rlike" >��ģ��</option>
									   <option value="greater">����</option>
									   <option value="less">С��</option>
									   <option value="greaterAndEqual" >���ڵ���</option>
									   <option value="lessAndEqual" >С�ڵ���</option>
									   <option value="notUse">��Ч</option>
									   <option value="null">Ϊ��</option>
									   <option value="notNull">��Ϊ��</option>
									   <option value="existValue">�Ѵ���ֵ</option>
									</select>
									</c:otherwise>
								</c:choose>
								</td>
								<td align="right"  bgcolor="#F4F4F4" width="10%" nowrap>
									xml�ڵ�·����
								</td>
								<td  width="35%" >
								   <c:choose>
									<c:when test="${not empty requestScope.instanceList}">
									<c:forEach items="${requestScope.instanceList}" var="instanceObj" varStatus="x">
									    <c:if test="${instanceObj.elementid eq obj.elementid}">
									        <input type="text" name="xmlNodename" title="${instanceObj.xmlNodename}" value="${instanceObj.xmlNodename}" size="35">
									         </c:if>
									</c:forEach>
									</c:when>
									<c:otherwise>
									   <input type="text" name="xmlNodename"  size="35">
									</c:otherwise>
									</c:choose>
								</td>
								</tr>
								</c:forEach>
								<c:choose>
								  <c:when test="${suptTaticGroup.tatictype eq 'tactic_dispatch'}">
								    <tr>
								<td align="right"  bgcolor="#F4F4F4">
									�ɷ�����:
								</td>
								<td colspan="5">
								  	<c:forEach items="${requestScope.applicationList}" var="applicationObj" varStatus="n">
								     <input type="checkbox" name="applicationCheckid"  value="${applicationObj.applicationId}" <c:if test="${fn:contains(instanceModel.dispatchobject,applicationObj.applicationId)}">checked</c:if>>
								  	  ${applicationObj.applicationName}&nbsp;
								  	</c:forEach>
									<input type="hidden" name="dispatchobject">
									</td>
							  </tr>
							 </c:when>
							<c:otherwise>
							 <tr>
								<td align="right"  bgcolor="#F4F4F4">
								    ת��Ԫ����:
								</td>
								<td colspan="3">
								  	<input type="text" name="changeElement" value="${instanceModel.changeElement}" size="30">
								</td>
								<td align="right"  bgcolor="#F4F4F4">
								    �������:
								</td>
								<td>
								  	<select name="resulttype">
									   <option value="result" <c:if test="${instanceModel.resulttype eq 'result'}">selected</c:if>>���ֵ</option>
									   <option value="xmlNode" <c:if test="${instanceModel.resulttype eq 'xmlNode'}">selected</c:if>>xml�ڵ�·��</option>
									</select>
								</td>
							  </tr>
								  <tr>
								<td align="right"  bgcolor="#F4F4F4">
								    ת�����:
								</td>
								<td colspan="5">
								  	<input type="text" name="dispatchobject" value="${instanceModel.dispatchobject}" size="90">
								    <img  alt="˵��" onclick="showTips('tactic','dispatchobject');" src="/images/main/ico_help.gif" border=0 style="cursor: pointer">
								</td>
							  </tr>
							 </c:otherwise>
							</c:choose>
 <tr>
    <td colspan="6" align="center" height="40">
       <input type="button" class="button" value="����" accesskey="Q"  onclick="save()" />
       <input type="button" class="button" value="ȡ��" accesskey="Q"  onclick="window.close()" />
      </td>
  </tr>
</table>
      </td>
  </tr>
</table>
</td></tr></table>
  </form>
   </td>
 </tr>
</table>
</body>
<script>
function SuptTaticInstance(elementid,elevalue1,elevalue2,matchingRule,xmlNodename){
	this.elementid= elementid;
	this.elevalue1= elevalue1;
	this.elevalue2= elevalue2;
	this.matchingRule=matchingRule;
	this.xmlNodename=xmlNodename;
}
function getInstanceArrs(){
   var elementids =document.getElementsByName("elementid");
   var elevalue1s=document.getElementsByName("elevalue1");
   var elevalue2s=document.getElementsByName("elevalue2");
   var matchingRules=document.getElementsByName("matchingRule");
   var xmlNodenames=document.getElementsByName("xmlNodename");
    var instanceArrs = new Array();
    for (var i = 0; i < elementids.length; i++) {
        var elementid = elementids[i].value;
        var elevalue1=elevalue1s[i].value;
        var elevalue2=elevalue2s[i].value;
        var matchingRule=matchingRules[i].value;
        var xmlNodename=xmlNodenames[i].value;
		instanceArrs[instanceArrs.length] = new SuptTaticInstance(elementid,elevalue1,elevalue2,matchingRule,xmlNodename);
        }
   return  instanceArrs;
}
function save(){
		DWRUtil.useLoadingMessage('���ݶ�ȡ��...');
		var tatictype="${suptTaticGroup.tatictype}";
		if(tatictype=="tactic_dispatch"){
		  var ids=getSelectCheckboxValue("mainForm","applicationCheckid","|");
		  $("dispatchobject").value=ids;
		}
		var formObj=$('mainForm').serialize(true);
		var instanceArrs=getInstanceArrs();
		taticConfigAction.saveInstance(formObj,instanceArrs,goBack);
}
function goBack(s){
 if(s==""){
  alert("�����ɹ���");
  window.returnValue="true";
  window.close();
  }
}
</script>
</html>