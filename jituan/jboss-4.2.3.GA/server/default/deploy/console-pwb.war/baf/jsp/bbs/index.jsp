<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isELIgnored="false" %>    

<!doctype html>
<html>
<head>
<meta charset="UTF-8" />
<title>装维技术论坛</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/baf/jsp/bbs/css/pw_core.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/baf/jsp/bbs/css/mian.css">
<script src="${pageContext.request.contextPath}/baf/jsp/bbs/js/jquery-1.4.2.min.js" type="text/javascript"></script>

<style type="">
	a:hover{ text-decoration:underline;color: #0162f4;}
</style>
<script type="text/javascript">
    function reformat(date){

      return date=date.substr(6,4)+"-"+date.substr(0,5);
    }

    setInterval(refresh_1, 600000); //每十分钟局部刷新一次

    function refresh_1(){

	 var url="${request.contextPath}/bbsIndex.do?method=refresh";
	 $.ajax({
        type: "POST",
        url: url,
        async:false, 
        success: function(data,textStatus) {
          var returndata = data; 
          var str="";
          var newlist=returndata.top_new;
          var excellentlist=returndata.top_Excellent;
          var visitMorelist=returndata.top_visitMore;
          var replyMorelist=returndata.top_replyMore;
          var menlist=returndata.activeList;
      
          
          //最新帖子
          for(var i=0;i<newlist.length;i++){
            str+="<li>";
            str+="<span class='icon_up' ></span>";
            str+="<a href='${pageContext.request.contextPath}/baf/jsp/bbs/bbsComments.xhtml?topicId="
                                                                                                    +newlist[i].topicId
                                                                                                    +"&type=visi' title='"
                                                                                                    +newlist[i].title+"'>"
                                                                                                    +newlist[i].title+"</a>";
            str+="<span class='fr'>"
                 +newlist[i].userName+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				 +reformat(newlist[i].createTime)+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				 +newlist[i].visitTotal+"/"
				 +newlist[i].revertTotal+"&nbsp;&nbsp;&nbsp;</span>"
            str+="</li>";
          }
          $("#topNew").html("");
          $("#topNew").html(str);
          str="";
          //精华帖子
          for(var i=0;i<excellentlist.length;i++){
            str+="<li>";
            str+="<span class='icon_up' ></span>";
            str+="<a href='${pageContext.request.contextPath}/baf/jsp/bbs/bbsComments.xhtml?topicId="
                                                                                                    +excellentlist[i].topicId
                                                                                                    +"&type=visi' title='"
                                                                                                    +excellentlist[i].title+"'>"
                                                                                                    +excellentlist[i].title+"</a>";
            str+="<span class='fr'>"
                 +excellentlist[i].userName+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				 +reformat(excellentlist[i].createTime)+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				 +excellentlist[i].visitTotal+"/"
				 +excellentlist[i].revertTotal+"&nbsp;&nbsp;&nbsp;</span>"
            str+="</li>";
          }
          $("#excellent").html("");
          $("#excellent").html(str);
          str="";
          // 人气最旺帖子
          for(var i=0;i<visitMorelist.length;i++){
            str+="<li>";
            str+="<span class='icon_up' ></span>";
            str+="<a href='${pageContext.request.contextPath}/baf/jsp/bbs/bbsComments.xhtml?topicId="
                                                                                                    +visitMorelist[i].topicId
                                                                                                    +"&type=visi' title='"
                                                                                                    +visitMorelist[i].title+"'>"
                                                                                                    +visitMorelist[i].title+"</a>";
            str+="<span class='fr'>"
                 +visitMorelist[i].userName+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				 +reformat(visitMorelist[i].createTime)+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				 +visitMorelist[i].visitTotal+"/"
				 +visitMorelist[i].revertTotal+"&nbsp;&nbsp;&nbsp;</span>"
            str+="</li>";
          }
          $("#visitMore").html("");
          $("#visitMore").html(str);
          str="";
          
          // 回复最多的帖子
          for(var i=0;i<replyMorelist.length;i++){
            str+="<li>";
            str+="<span class='icon_up' ></span>";
            str+="<a href='${pageContext.request.contextPath}/baf/jsp/bbs/bbsComments.xhtml?topicId="
                                                                                                    +replyMorelist[i].topicId
                                                                                                    +"&type=visi' title='"
                                                                                                    +replyMorelist[i].title+"'>"
                                                                                                    +replyMorelist[i].title+"</a>";
            str+="<span class='fr'>"
                 +replyMorelist[i].userName+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				 +reformat(replyMorelist[i].createTime)+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				 +replyMorelist[i].visitTotal+"/"
				 +replyMorelist[i].revertTotal+"&nbsp;&nbsp;&nbsp;</span>"
            str+="</li>";
          }
          $("#replyMore").html("");
          $("#replyMore").html(str);
          str="";
          
          //活跃会员
           for(var i=0;i<menlist.length;i++){
                 str+="<li>";
                 str+="<span class='icon_up' ></span>";
                 str+="<span class='fr'><font color='red'>("+menlist[i].topicNum+"/"+menlist[i].reportNum+")</font></span>"+menlist[i].fullName+"</li>";
           }
          $("#actMenber").html("");
          $("#actMenber").html(str);
        }
     });
	}

// tab切换
function tab2(id,id2,con,con1)
{
	var oId = document.getElementById(id);
	var oId2 = document.getElementById(id2);
	var aCon = oId.getElementsByTagName(con);
	var aCon2 = oId2.childNodes;
	var i=0;
	var aTmp=[];
	for(i=0;i<aCon2.length;i++){
		if(aCon2[i].nodeType==1 && aCon2[i].tagName){
			aTmp.push(aCon2[i]);
		}
	}
	for(i=0;i<aCon.length;i++){
		aCon[i].index=i;
		aCon[i].onmouseover=function(){
			for(i=0;i<aCon.length;i++){
				aCon[i].className="";
				aTmp[i].style.display="none";
			}
			aCon[this.index].className="on";
			aTmp[this.index].style.display="block";	
		};
		
	}
}
	function init() {
		var urlInfo=window.location.href;  
			   var len=urlInfo.length;
			   var offset=urlInfo.indexOf("?");
			   var paramsInfo=urlInfo.substr(offset+1,len);
			   var params=paramsInfo.split("&")
			   for(var i = 0; i < params.length; i++ ) {
			   		if(params[i].split("=")[0] == 'navId') {
			   			var id = params[i].split("=")[1];
			   			document.getElementById(id).className = "current";
			   		}
			   }
	}

	function setDisplay(id) {
		
		if(document.getElementById("display_flag_"+id).title=='1'){
			document.getElementById("board_"+id).style.display = 'none';
			document.getElementById("img_1_"+id).src = '<%=request.getContextPath()%>/baf/jsp/bbs/images/cate_fold.gif';
			document.getElementById("display_flag_"+id).title='0';
		}
		else{
			document.getElementById("board_"+id).style.display = 'block';
			document.getElementById("img_1_"+id).src = '<%=request.getContextPath()%>/baf/jsp/bbs/images/cate_open.gif';
			document.getElementById("display_flag_"+id).title='1';
		}
		
	}
	
	function addtopic(){
	  var url="${pageContext.request.contextPath}/bbsIndex.do?method=getAllBoard";
	  window.showModalDialog(url,window,"location:no;help:no;scroll:no;dialogWidth:600px;dialogHeight:450px;center:yes" );  
	}
	
	
	
</script>
<style type="text/css">


</style>
</head>
<body >
<div align="center"> 
      <%@include file="/baf/jsp/bbs/top.jsp" %>
</div>

<div class="tac mb5"></div>
<div class="main-wrap">
<div id="main">

<div id="infobox" class="cc mb10" Style="margin-bottom:3px">

<input type="button" style="font-weight:bolder;padding:0;border:0;color:#FFFFFF; background: url(/baf/jsp/bbs/images/post.png) no-repeat;width:75px;height:30px;font-size:12pt;cursor:hand;" value="发  帖"  onclick="addtopic();"/>

	<ul class="pw_ulC fr">
    	<li>今日<em>${todayTopicNum}</em></li>
        <li>昨日<em>${yesterdayAnswerNum}</em></li>
        <li>最高日<em>${maxTopicNumForDay}</em></li>
        <li>帖子<em>${totalAllTopicNum}</em></li>
        <li class="none">会员<em>${memberNum}</em></li>
    </ul>
</div>


<div id="pw_content" class="mb10" >
         <div class="pr" id="ID"> 
        <div class="newInfor"> 
          <table width="958" border="0" cellspacing="0" cellpadding="0">
            <tr> 
              <td width="698"> <DIV id="entmt"> 
                  <DIV id="entmt_tit" class="tit"> 
                    <H2 class="on">最新帖子</H2>
                    <H2>精华帖子</H2>
                    <H2>人气最旺帖子</H2>
                    <H2>回复最多帖子</H2>
                  </DIV>
				<DIV id="entmt_con" class="con"> 
				<DIV id="followall_mod2" class="followall_mod"> 
					<div class="ali_hot_left_one"> 
					<ul id="topNew">
					 	<c:forEach items="${top_new}" var="topic" varStatus="s">
					      <li >
					        <span class="icon_up" ></span>
					        <a href="${pageContext.request.contextPath}/baf/jsp/bbs/bbsComments.xhtml?topicId=${topic.topicId}&type=visi" title="${topic.title}">${topic.title}</a>
					        <span class="fr">
					       	  ${topic.userName}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					          <fmt:formatDate pattern="yyyy-MM-dd" value="${topic.createTime}"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					          ${topic.visitTotal}/${topic.revertTotal}&nbsp;&nbsp;&nbsp;
					        </span>
					      </li>
					    </c:forEach>
					</ul>
					</div>
 				</DIV>

<DIV style="DISPLAY: none" id="followall_mod3" class="followall_mod"> 
<div class="ali_hot_left_one"> 
<ul id="excellent">
<c:forEach items="${top_Excellent}" var="topic" varStatus="s">
   <li >
   <span class="icon_up" ></span>
   <a href="${pageContext.request.contextPath}/baf/jsp/bbs/bbsComments.xhtml?topicId=${topic.topicId}&type=visi" title="${topic.title}">${topic.title}</a>
   <span class="fr">
  	  ${topic.userName}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     <fmt:formatDate pattern="yyyy-MM-dd" value="${topic.createTime}"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     ${topic.visitTotal}/${topic.revertTotal}&nbsp;&nbsp;&nbsp;
   </span>
   </li>
  </c:forEach>
</ul>
</div>


</DIV>
<DIV style="DISPLAY: none" id="followall_mod4" class="followall_mod"> 
<div class="ali_hot_left_one"> 
<ul id="visitMore">
	<c:forEach items="${top_visitMore}" var="topic" varStatus="s">
       <li>
       <span class="icon_up" ></span>
       <a href="${pageContext.request.contextPath}/baf/jsp/bbs/bbsComments.xhtml?topicId=${topic.topicId}&type=visi" title="${topic.title}">${topic.title}</a>
       <span class="fr">
       	  ${topic.userName}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <fmt:formatDate pattern="yyyy-MM-dd" value="${topic.createTime}"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          ${topic.visitTotal}/${topic.revertTotal}&nbsp;&nbsp;&nbsp;
        </span>
       </li>
    </c:forEach>
</ul>
</div>


</DIV>
<DIV style="DISPLAY: none" id="followall_mod4a" class="followall_mod"> 
<div class="ali_hot_left_one"> 
<ul id="replyMore">
<c:forEach items="${top_replyMore}" var="topic" varStatus="s">
     <li>
     <span class="icon_up" ></span>
     <a href="${pageContext.request.contextPath}/baf/jsp/bbs/bbsComments.xhtml?topicId=${topic.topicId}&type=visi" title="${topic.title}">${topic.title}</a>
	 <span class="fr">
    	  ${topic.userName}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       <fmt:formatDate pattern="yyyy-MM-dd" value="${topic.createTime}"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       ${topic.visitTotal}/${topic.revertTotal}&nbsp;&nbsp;&nbsp;
     </span>
     </li>
  </c:forEach>
</ul>
</div>

</DIV>
</DIV>
<SCRIPT type=text/javascript>tab2("entmt_tit","entmt_con","h2","div");</SCRIPT>
</DIV>

</td>

<td width="259" valign="top">

<div class="ali_hot_list_md">
<div class="hB"><B>活跃会员</B><span class="fr"><font color='red'>(发帖/回帖)</font></span></div>
<div class="ali_hot_left_tags">
<ul id="actMenber">
<c:forEach items="${activeList}" var="menber" varStatus="s">
     <li ><span class="icon_up" ></span><span class="fr"><font color='red'>(${menber.topicNum}/${menber.reportNum})</font></span>${menber.fullName}</li>
  </c:forEach>
</ul>
</div>
</div>

</td>
</tr>
</table>
</div>
</div>
<div id="cloudwind_index_top"></div>
<div id="cloudwind_index_tpl_keyword"></div>
<!-- 顶级版块DIV开始 -->
<c:forEach items="${boardList}" var="boardVO">
<div id="t_1" class="t">
          <div class="h" style="height:15px;"><a class="closeicon fr cp" onclick="setDisplay('${boardVO.boardId}')"><img src="${pageContext.request.contextPath}/baf/jsp/bbs/images/cate_fold.gif" alt="展开收起" width="9" height="10" id="img_1_${boardVO.boardId}" /></a> 
            <span class="fr mr10">分栏版主:&nbsp;&nbsp;${boardVO.managerNames}</span> 
            <span class="fl ml10"><h3 class="cateT" ><span class="mr10">${boardVO.boardName}</span></h3></span></div>
        <div class="tTable" id="board_${boardVO.boardId}" > <span id="display_flag_${boardVO.boardId}" title="1" style="display:none;"></span>
          <TABLE style="TABLE-LAYOUT: fixed" width="100%">
            <TBODY id=cate_132 class=across>
            <c:forEach items="${boardVO.boardVOList}" var="voList">
	              <TR class="tr3 "> 
	              	<c:forEach items="${voList}" var="vo">
		                <TH id=fid_2 class=new height=40> <H2 class="forumT mr10"><a href="${pageContext.request.contextPath}/baf/jsp/bbs/bbsTopic.xhtml?boardId=${vo.boardId}" ><FONT 
		      color=red >${vo.boardName}</FONT></a></H2>
		                  <SPAN class="s2 mr10">(今日${vo.todayTotalTopicNum})</SPAN> <P class=fNum><SPAN class=mr10>主题:${vo.totalTopics}</SPAN>帖子:${vo.totalTopicNum}</P>
		                  <P class=fNum>最后发帖时间:<fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${vo.lastSendTopicTime}"/>
		                    </P></TH>
	                </c:forEach>
	              </TR>
              </c:forEach>
              
            </TBODY>
          </TABLE>
        </div>
</div>
</c:forEach>
<!-- 顶级版块DIV结束 -->

</div>

<div id="cloudwind_index_bottom"></div>

</div>
<div align="center"> 
        <%@include file="/baf/jsp/bbs/down.jsp" %>
        </div>
</div>
</body></html>






