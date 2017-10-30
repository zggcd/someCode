<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isELIgnored="false" %>    

<!doctype html>

<html>
<title>装维技术论坛</title>
<head></head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/baf/jsp/bbs/css/pw_core.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/baf/jsp/bbs/css/mian.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/baf/jsp/bbs/css/main.css">

    <script type="text/javascript" src="${pageContext.request.contextPath}/baf/jsp/bbs/js/jquery1.2.6.pack.js"></script>
    <script  type="text/javascript" src="${pageContext.request.contextPath}/baf/jsp/bbs/js/ui.core.packed.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/baf/jsp/bbs/js/ui.draggable.packed.js" ></script>

<style type="">
	a:hover{ text-decoration:underline;color: #0162f4;}
</style>
<script type="text/javascript">

	var xmlHttp;
//创建XHR对象
function createXMLHttpRequest()
{
    if(window.ActiveXObject)
    {
        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    else if(window.XMLHttpRequest)
    {
        xmlHttp = new XMLHttpRequest();
    }
}
//发送数据
function getRequest()
{
    createXMLHttpRequest();
 
    var queryString = "${pageContext.request.contextPath}/getImgUrl.do";
    xmlHttp.onreadystatechange = handleStateChange;
    xmlHttp.open("GET",queryString,true);
    xmlHttp.send(null);
}
//监听
function handleStateChange()
{
    if(xmlHttp.readyState == 4)
    {
        if(xmlHttp.status == 200)
        {
            parseResults();
        }
    }
}
//处理返回结果
function parseResults()
{
    var responseText = xmlHttp.responseText;
    if(responseText!=""){
      var obj=document.getElementById("imgphoto");
     obj.src="${pageContext.request.contextPath}"+responseText;
     document.getElementById("photo").value=responseText;
     }
     
    
}


function save(){
   var parm=$("#infoForm").serialize();  //得到form所有数据值 
   jQuery.ajax({
                    url: "${pageContext.request.contextPath}/updateUserInfo.do",   // 提交的页面
                    data: parm, // 从表单中获取数据
                    type: "POST",                   // 设置请求类型为"POST"，默认为"GET"
                    success: function(data) { // 设置表单提交完成使用方法
                        if("1"==data){
                            alert("保存成功！");
                        }else if("0"==data){
                           alert("保存失败！");
                        }
                       
                    }
                });

   
}

</script>
<style type="text/css">



</style>

<body >
<div align="center"> 
      <%@include file="/baf/jsp/bbs/top.jsp" %>
</div>

<div class="tac mb5"></div>
<div class="main-wrap">
<div id="main">
<div class="main-wrap">
<div id="infobox" class="cc">

</div></div>


<div id="pw_content" class="mb10" style="height:700px">
 <div class="newInfor"> 
 <div  style="height:30px"></div>
 <table>
 <tr valign="top" >
 <td width="10%" align="center"></td>
 <td width="30%" valign="top">
 <table width="100%"  style="height:650px" align="right">
 <tr style="height:160px">
 <td valign="top">
   <div class="photocontainer">
 <img id="imgphoto" src="${pageContext.request.contextPath}${user.photo}" style="border-width:0px;" />
 </div>
 </td>
 </tr>
 <tr >
 <td valign="top">
  <form name="form1" method="post" action="${pageContext.request.contextPath}/uploadUserHead" id="form1" target="photodiv" enctype="multipart/form-data">
     <div >
         <div id="Step1Container">
            <div class="title"><b>更换照片</b></div>
            <div id="uploadcontainer">
                <div class="uploadtooltip">请选择新的照片文件，文件需小于2.5MB</div>
                <div class="uploaddiv">
                
                <input type="file" name="fuPhoto" id="fuPhoto" title="选择" /></div>
                <div class="uploaddiv">
                <input type="submit" style="font-weight:bolder;padding:0;border:0; background: url(/baf/jsp/bbs/images/search_btn.png) no-repeat;width:45px;height:25px;font-size:10pt;cursor:hand;" 
                 onclick="" name="btnUpload" value="上 传" id="btnUpload" />
                </div>
            </div>
         
         </div>
     </div>
     </form>
     <iframe id="photodiv" name="photodiv" frameborder="0" scrolling="no" height="355px" width="284px" style="valign:top;margin-top:0px"></iframe>
 </td>
 </tr>
 </table>
 </td>
 <td width="60%" valign="top">
 <form id="infoForm" action="${pageContext.request.contextPath}/updateUserInfo.do" target="photodiv">
  <input type="hidden" id="userId" name="userId" value="${user.userId}" />
 <input type="hidden" id="photo"  name="photo" value="${user.photo}" />
 <table width="100%" >
<tr>
<td width="20%" align="right" nowrap="nowrap" style="padding: 6px 6px 6px 12px; "><b>全称：</b></td>
<td width="80%"  align="left"> <input id="fullName" name="fullName" type="text" width="400px" value="${user.fullName}" disabled ></input> </td>
</tr>
<tr>
<td width="20%" align="right" nowrap="nowrap" style="padding: 6px 6px 6px 12px; "><b>昵称：</b></td>
<td width="80%"  align="left"> <input id="nickName"  name="nickName"  type="text" width="400px" value="${user.nickName}" ></input> </td>
</tr>
<tr>
<td width="20%" align="right" nowrap="nowrap" style="padding: 6px 6px 6px 12px; "><b>电话：</b></td>
<td width="80%"  align="left"><input  id="phone" name="phone"  type="text" width="400px" value="${user.phone}" ></input> </td>
</tr>
<tr>
<td width="20%" align="right" nowrap="nowrap" style="padding: 6px 6px 6px 12px; "><b>email：</b></td>
<td width="80%"  align="left">  <input id="email" name="email" type="text" width="400px" value="${user.email}" ></input></td>
</tr>

<tr>
<td width="20%" ></td>
<td width="80%"  align="left">
<input type="button" style="font-weight:bolder;padding:0;border:0; background: url(/baf/jsp/bbs/images/search_btn.png) no-repeat;width:45px;height:25px;font-size:10pt;cursor:hand;" value="保 存" onclick="save();" />

</td>

</tr>
</table>
 </form>
 
 </td>
 </tr>
 </table>

</div>
</div>
</div>
<div align="center"> 
        <%@include file="/baf/jsp/bbs/down.jsp" %>
 </div>
</div>

</body></html>






