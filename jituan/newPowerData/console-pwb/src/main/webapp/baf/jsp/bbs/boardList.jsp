<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isELIgnored="false" %>    

<!doctype html>
<html>
  <head>
    <title>版块选择</title>
    <script type="text/javascript">
    var boardId="";
    function showInfo(id){ 
       var uls=document.getElementsByTagName("ul");
       for(var i=0;i<uls.length;i++){
          if(uls[i].id.indexOf("_info")>-1){
          if(uls[i].id==id){
             uls[i].style.display="block";
          }else{
            uls[i].style.display="none";
          }
       } 
       }     
    }
    function setClass(obj,flag){
     var lis=document.getElementsByTagName("li");
       if(1==flag){
           for(var i=0;i<lis.length;i++){
          if(lis[i].id.indexOf("main_")>-1){
            if(lis[i].id==obj.id){
                lis[i].className="selected";
            }else{
               lis[i].className="";
             }
          } 
         }   
       }
           if(2==flag){
           for(var i=0;i<lis.length;i++){
          if(lis[i].id.indexOf("sub_")>-1){
            if(lis[i].id==obj.id){
                lis[i].className="selected";
            }else{
               lis[i].className="";
             }
          } 
         }   
       }
    }
    function getValue(id){
      boardId=id;
    }
    
    function addtopic(){
       if(boardId==""){
         alert("请选择版块！");
         return;
       }
      window.dialogArguments.location.href='${pageContext.request.contextPath}/baf/jsp/bbs/topicInfo.xhtml?boardId='+boardId;
      window.close();
    }
    </script>
     <style>
    body{background:#eee;}
    .selectbox{float:left;background:#ccc;margin:5px 0 5px 5px;border-radius:5px;border:#aaa 1px solid;}
    .selectbox ul{border:#022635 2px solid;background:#E4F1FC;overflow-x:hidden;overflow-y:auto;height:348px;margin:5px;}
    .selectbox ul li{text-shadow:0 0px 3px rgba(0, 0, 0, 0.7);color:#045679;padding:8px 1em;line-height:15px;border:#E4F1FC 1px solid;font-size:14px;border-bottom:#A7D2F5 1px dotted;overflow:hidden;cursor:pointer;}
    .selectbox ul li:hover{text-shadow:0 0px 3px rgba(0, 0, 0, 0.7)border:#FF4D00 1px solid;background:#FF7D46;color:#FFB493;}
    .selectbox ul li.selected{text-shadow:0 0px 3px rgba(f, f, f, 0.7)border:#FF7D46 1px solid;background:#FF4D00;color:#FFF;}
    #main{width:160px;}
    #sub{width:400px;}
    
    div.noData{padding:8px 1em;line-height:15px;color:#666;text-shadow:0 0px 3px rgba(0, 0, 0, 0.7);}
  </style>
  </head>
  
  <body style="background-color:#EFF7FF;">
  <div style="width:600px;height:400px;overflow:hidden;">
  <div class="selectbox" id="main"><ul>
  <c:forEach items="${boardList}" var="boardVO">
  <li onclick="showInfo('${boardVO.boardId}_info');setClass(this,1);" id="main_${boardVO.boardId}">${boardVO.boardName}</li>
  </c:forEach>
  
  </ul></div>
  <div class="selectbox" id="sub">
   <ul  id="_info" >
   </ul>
   <c:forEach items="${boardList}" var="boardVO">
   <ul style="display:none" id="${boardVO.boardId}_info" >
   <c:forEach items="${boardVO.childBoardVOList}" var="vo">
   <li onclick="setClass(this,2);getValue('${vo.boardId}');" id="sub_${vo.boardId}">${vo.boardName}</li>
   </c:forEach>
   </ul>
   </c:forEach>
  </div>

</div>
  <div align="center">
  <input type="button" style="font-weight:bolder;padding:0;border:0; background: url(/baf/jsp/bbs/images/search_btn.png) no-repeat;width:45px;height:25px;font-size:10pt;cursor:hand;" value="发 帖" onclick="addtopic();" />
  </div>
<!--  
  <div align="center" style="margin-top:20px; background-color:#EFF7FF;">
  <div style="width:80%;" align="left">
  <b>请选择版块</b><span style="float:right"><input style="background-color:orange;width:50px;padding:0;border:0;" type="button" value="确 定" onclick="addtopic();"/></span>
  </div>
  <div style="height:10px"></div>
  <div style="width:90%;min-height:300px;border:1px solid black;background-color:white;" align="left">

  <c:forEach items="${boardList}" var="boardVO">

   <p style="margin-left:0px;margin-top:0;margin-bottom:0;" onclick="showDiv('${boardVO.boardId}');">${boardVO.boardName} </p>
   <div id="${boardVO.boardId}" style="display:none" >
      <table width="100%">
      <c:forEach items="${boardVO.childBoardVOList}" var="vo">
      <tr>
       <td width="10%"></td>
      <td width="90%" onclick="setColor(this,'${vo.boardId}');">
      <p style="margin-top:0;margin-bottom:0;font-size:15px">${vo.boardName} </p>  
      </td>
     
      </tr>
      </c:forEach>
      </table>
</div>
 
</c:forEach>
 

</div>
  </div>-->
  </body>
</html>
