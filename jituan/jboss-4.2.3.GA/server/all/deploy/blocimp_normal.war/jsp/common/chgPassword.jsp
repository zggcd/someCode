<%@ page contentType="text/html; charset=GBK" %>
<%@ include file="/jsp/common/allTag.jsp"%>

<html>
<head>
<title>OSS�ӿ�ƽ̨</title>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
</head>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/cb2.js"></script>

<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type='text/javascript' src='/dwr/interface/loginAction.js'></script>
<script>
function  doSubmit(){
   if($("loginPassword").value==""){
     alert("�����벻��Ϊ�գ�");
     return;
   }
    if($("newPassword").value==""){
     alert("�����벻��Ϊ�գ�");
     return;
   }
    if($("newConfirmPassword").value!=$("newPassword").value){
     alert("ȷ������������벻ͬ��");
     return;
   }
   var formObj={};
   formObj.loginPassword=$("loginPassword").value;
   formObj.newPassword=$("newPassword").value;
  loginAction.changePassWord(formObj,function(s){
      if(s==""){
        alert("�����޸ĳɹ���");
        $("loginPassword").value="";
        $("newPassword").value="";
        $("newConfirmPassword").value="";
      }else{
         alert(s);
      }
  });

}
</script>
<body bgcolor="#FFFFFF" leftmargin="0" marginwidth="0" marginheight="0" topmargin="4" >
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td valign="top">
      <table width="100%" border="0" cellspacing="8" cellpadding="0" bgcolor="#FFFFFF">
        <tr>
          <td height="71" colspan="2" >
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td>
                  <table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td width="4%"><img src="<%=request.getContextPath()%>/images/main/home_mian_arrow.gif" width="41" height="29"></td>
                      <td width="94%"  class="headers">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0" >
                          <tr class="headerfont">
                            <td width="95%">�޸�����</td>
                            <td width="5%">
                              <div align="right"></div>
                            </td>
                          </tr>
                        </table>
                      </td>
                      <td width="2%">
                        <div align="right"><img src="<%=request.getContextPath()%>/images/main/home_mian_arrow02.gif" width="36" height="29"></div>
                      </td>
                    </tr>
                  </table>
                </td>
              </tr>
              <tr>
                <td bgcolor="#FFFFFF" height="1"> </td>
              </tr>
              <tr>
                <td>
                  <table class=table id=powergrid style="FONT-SIZE: 13px"
            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box
            pcolor="#BCC8F5">
                    <tbody>

                    <tr style="cursor:hand"  height=25 bgcolor="#FFFFFF" height="40">
                      <td width="30%" bgcolor="#F9F9F9"  align="right">ԭ���룺 </td>
                      <td width="70%"><input type="password" name="loginPassword"><font color="red">*</font></td>
                    </tr>
                     <tr style="cursor:hand"  height=25 bgcolor="#FFFFFF"  height="40">
                      <td width="30%" bgcolor="#F9F9F9"  align="right">������ ��</td>
                      <td width="70%"><input type="password" name="newPassword"><font color="red">*</font></td>
                    </tr>
                     <tr style="cursor:hand"  height=25 bgcolor="#FFFFFF"  height="40">
                      <td width="30%" bgcolor="#F9F9F9" align="right">��ȷ�����룺</td>
                      <td width="70%"><input type="password" name="newConfirmPassword"><font color="red">*</font></td>
                    </tr>
                     <tr style="cursor:hand"  height=25 bgcolor="#FFFFFF"  height="40">
                      <td width="30%"  align="right"></td>
                      <td width="70%"><input type="button" name="confirm" value="ȷ��" onclick="doSubmit()"></td>
                    </tr>
                    </tbody>
                  </table>
                </td>
              </tr>
              <tr>
                <td background="<%=request.getContextPath()%>/images/main/home_mian_bg02.gif">
                  <table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td width="12%" valign="top"><img src="<%=request.getContextPath()%>/images/main/home_mian_arrow04.gif" width="17" height="15"></td>
                      <td width="88%" valign="top">
                        <div align="right"><img src="<%=request.getContextPath()%>/images/main/home_mian_arrow05.gif" width="21" height="15"></div>
                      </td>
                    </tr>
                  </table>
                </td>
              </tr>
            </table>
          </td>
        </tr>
        <tr>
          <td height="36">&nbsp; </td>
          <td height="36">&nbsp; </td>
        </tr>
      </table>
</td>
  </tr>
</table>
<script>
</script>

</body>
</html>