<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ include file='/jsp/common/allTag.jsp' %>
<html>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<form name="elementForm">
<table width="100%" border="0" cellpadding="5" cellspacing="0" bgcolor="#FFFFFF"  height="100%">
  <tr>
    <td valign="top">
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td bgcolor="#FFFFFF">
    <table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
    <tr >
      <td align="right"  bgcolor="#F4F4F4" >
         Ԫ�����ƣ�
      </td>
      <td>
         <input type="hidden" name="elementid" value="${suptTaticElement.elementid}">
         <input type="text" name="elementname" value="${suptTaticElement.elementname}"  dataType="Require" msg="Ԫ�����Ʋ���Ϊ��" >
         <font color="red">*</font>
      </td>
      </tr>
      <tr>
      <td align="right"  bgcolor="#F4F4F4"  >
         Ԫ�ر��룺
      </td>
      <td>
         <input type="text" name="elementcode"  value="${suptTaticElement.elementcode}"  dataType="Require" msg="Ԫ�ر��벻��Ϊ��" >
         <font color="red">*</font>
      </td>
  </tr>
   <tr >
      <td align="right"  bgcolor="#F4F4F4" >
         ��Դ���ͣ�
      </td>
      <td>
        <select name="sourcetype"   value="${suptTaticElement.sourcetype}" >
          <option value="TEXT" <c:if test="${'TEXT' eq suptTaticElement.sourcetype}">selected</c:if>>��ͨ�ı�</option>
          <option value="SELECT" <c:if test="${'SELECT' eq suptTaticElement.sourcetype}">selected</c:if>>��������</option>
          <option value="TREE" <c:if test="${'TREE' eq suptTaticElement.sourcetype}">selected</c:if>>����</option>
        </select>
      </td>
      </tr>
      <tr>
      <td align="right"  bgcolor="#F4F4F4" >
         ��Ӧ��̬���ݱ��룺
      </td>
      <td>
         <input type="text" name="sqlstr"  value="${suptTaticElement.sqlstr}">
      </td>
  </tr>
  <tr>
  <td></td>
    <td>
      <input type="button" class="button" value="����" accesskey="Q"  onclick="saveElement()" />
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
</html>