<%@ page contentType="text/html;charset=UTF-8" %>
<script type="text/javascript" src="${request.contextPath}/baf/js/jQuery/jquery-1.7.js"></script>
 <script type='text/javascript' src='${request.contextPath}/baf/jsp/bbs/js/dropdown.js'></script>
<link rel="stylesheet" type="text/css" href="${request.contextPath}/baf/jsp/bbs/css/css.css"/>
<script type="text/javascript">
	function init() {
		var urlInfo=window.location.href;  
			   var len=urlInfo.length;
			   var offset=urlInfo.indexOf("?");
			   var paramsInfo=urlInfo.substr(offset+1,len)
			   var params=paramsInfo.split("&")
			   for(var i = 0; i < params.length; i++ ) {
			   		if(params[i].split("=")[0] == 'navId') {
			   			var id = params[i].split("=")[1];
			   			document.getElementById(id).className = "current";
			   		}
			   }
	}
	
	function userInfo(){
	    window.location.href="<%=request.getContextPath()%>/bbsIndex.do?method=getUserInfo";
	}
	
	$(function(){
            setInterval("reflash();",1000*10);   
		
			$.ajax({
			url:'${request.contextPath}/bbsIndex.do?method=getBoardList',
			type:'post',
			dataType:'json',
			success:function(data){
			    var ul_temp=$("<ul></ul>");
			    var li_dom=$("<li></li>");
			    var ul_dom=$("#navA");
			    var div_dom=$("#navB");
				for(var i=0;i<data.length;i++){
				  var str="<a href='#'  rel='"+data[i].boardId+"'><span style='font-size:14px;color:#FFFFFF;'><b>"+data[i].boardName+"<b></span></a>";
				  li_dom.clone().html(str).appendTo(ul_dom);
				}
				cssdropdown.startchrome("navMenu");
				for(var n=0;n<data.length;n++){
				  var list=data[n].childBoardVOList;
				  var obj=ul_temp.clone();
				  obj.attr("id",data[n].boardId);
				  obj.addClass("dropMenu");
				  for(var j=0;j<list.length;j++){
				     var text="<a href='${pageContext.request.contextPath}/baf/jsp/bbs/bbsTopic.xhtml?boardId="+list[j].boardId+" '>"+list[j].boardName+"</a>";
				     li_dom.clone().html(text).appendTo(obj);
				  }
				  var end_li=$("<li class='end'></li>");
				  obj.append(end_li);
                  
				  div_dom.append(obj);
				}
			
				
				
			}
		});
	});
	
	function reflash(){
	  		$.ajax({
			url:'${request.contextPath}/bbsIndex.do?method=countReplyNum',
			type:'post',
			dataType:'json',
			success:function(count){
				$("#countReplyNum").text(count);
			}
		});
		
		$.ajax({
			url:'${request.contextPath}/bbsIndex.do?method=getUserPoint',
			type:'post',
			dataType:'json',
			success:function(count){
				$("#userInfoVoPoint").text(count);
			}
		});
	}
</script>


<div style="background:url(${pageContext.request.contextPath}/baf/jsp/bbs/images/gonggaobg.png) 0 0 repeat-x; text-align: center; color:red; font-weight:bold; line-height:29px;"></div>

<div class="wrap">
<div id="header">
<div id="head" class="cc"> <a href="#" ><img src="${pageContext.request.contextPath}/baf/jsp/bbs/images/logo.png"  border="0" class="fl" title="" /></a> 
<span class="fr" style="width: 200px;margin-top:65px;margin-right: 10px;height: 20px;" >
<a href="#" onclick="window.location.href='${request.contextPath}/baf/jsp/bbs/myTopicReply.xhtml'" ><font style="" >回复提醒(<span style="color: red;" id="countReplyNum">10</span>)</font></a>
&nbsp;| <a href="#" onclick="window.location.href='${request.contextPath}/bbsIndex.do?method=getUserInfo';" ><font style="" >个人信息</font></a> | <font>积分:<span id="userInfoVoPoint">560</span></font>
</span>

</div>


<div id="navMenu">
<ul id="navA">
		<li class="" id="nav_index_1" ><a id="nav_key_up_79" href="${pageContext.request.contextPath}/bbsIndex.do?method=index&navId=nav_index_1"  title="" ><b><span style="font-size:14px;color:#FFFFFF;" >论坛</span></b></a></li>
		<li id="nav_index_3"><a id="nav_key_up_122" href="${pageContext.request.contextPath}/baf/jsp/bbs/myTopic.xhtml?boardName=我的帖子&navId=nav_index_3" title="我的帖子" ><b><span style="font-size:14px;color:#FFFFFF;" >我的帖子</span></b></a></li>
		<li id="nav_index_4"><a id="nav_key_up_122" href="${request.contextPath}/baf/jsp/bbs/searchTopic.xhtml?boardName=搜索&amp;navId=nav_index_4" title="" ><b><span style="font-size:14px;color:#FFFFFF;" >搜索</span></b></a></li>
</ul>
<div id="navMenu_r"></div>
</div>


</div>
</div>

<div id="navB"> 

</div>
	  



