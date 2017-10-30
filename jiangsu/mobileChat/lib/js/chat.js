var moreMenu = document.getElementById("moreMenu");
var content = document.getElementsByTagName('ul')[0];
var scroll = document.getElementById('content');
var to_btn = document.getElementById("to_btn");
var to_chat = document.getElementById("to_chat");
var loading = document.getElementById("loading");
var logout = document.getElementById("logout");
var footer = document.getElementById("footer");
var speak = document.getElementById("footer-say");
var fsend = document.getElementById("footer-send");
var title = document.getElementById("title");
var pMes = content.getElementsByTagName('p');
var to = '';
var BOSH_SERVICE = 'http://132.228.169.172:7070/http-bind/';
var OPTS = {};
var connection = null;
var d = dialog({
    content: '请稍侯...',
    quickClose: true
});
var flag = true;

// function log(mes){
// 	content.innerHTML +="<p id='mes'>" + mes + "</p>";
// 	scroll.scrollTop = scroll.scrollHeight;
// 	//content.removeChild(content.getElementsByTagName('p')[0]);
// }

function log_out(){
	var out = confirm("会话结束?");
	if (out == true){
		connection.disconnect('out');
		to_btn.style.display = "block";
		to_chat.style.display = "none";
		flag = true;
		title.innerHTML = "在线客服";
	}
}

function onConnect(status, condition){
    if (status == Strophe.Status.CONNECTING) {
		loading.style.display = "block";
		logout.style.display = "none";
		footer.style.display = "block";
    } else if (status == Strophe.Status.CONNFAIL || status == Strophe.Status.AUTHFAIL) {
		title.innerHTML = "在线客服 - 连接失败";
		loading.style.display = "none";
		logout.style.display = "none";
		footer.style.display = "block";
    } else if (status == Strophe.Status.DISCONNECTING) {
		//log("断开连接中...");
    } else if (status == Strophe.Status.DISCONNECTED) {
		title.innerHTML = "会话已结束...";
		footer.style.display = "block";
		logout.style.display = "none";
		content.innerHTML +="<li><span style='float:left;margin-right:48px;'>会话已结束</span></li>";
		scroll.scrollTop = scroll.scrollHeight;
    } else if (status == Strophe.Status.CONNECTED || status === Strophe.Status.ATTACHED) {
    	var sid = connection._proto.sid;
		OPTS.customHeaders = {"X-Requested-With": sid};
		flag = false;
		if(d){
			d.close().remove();
		}
    	d = dialog({
		    content: '正在请求客服人员...',
		    quickClose: true
		}).showModal();
		connection.addHandler(onMessage, null, 'message', null, null,  null); 
		connection.addHandler(onService, null, 'presence', null, null, null, {matchBare: true});
		connection.send($pres().tree());
		var service = 'x@queue.' + $('#domain').get(0).value;
		var serviceRegion = $('#serviceRegion').get(0).value;
		var serviceData = $('#serviceData').get(0).value;
		var clientName = $('#clientName').get(0).value;
		if ($('#isclient').get(0).checked) {
			connection.send($pres({to: service}).c('queue', null, 'request').c('serviceRegion', null, serviceRegion).c('serviceData', null, serviceData).c('clientName', null, clientName).tree());
		} else {
			connection.send($pres({to: service}).c('queue', null, 'signin').c('serviceType', null, 'myservice').tree());
		}
	}
}

function onService(p) {
	var q = $('queue', p).text();
	// queue标签内容文本为status, 手机端发出请求后收到的回应
	if (q == 'status') {
		var s = $('status', p).text();
		var from = p.getAttribute('from');
		// status=0表示已分配到坐席, from属性值就是分配到的坐席id
		to = from;
		if (s == 0) {
			if(d){
				d.close().remove();
			}
			loading.style.display = "none";
			logout.style.display = "block";
			footer.style.display = "none";
			var agentName =$('agentName', p).text()
			title.innerHTML = "在线客服 - "+ agentName;
			content.innerHTML +="<p id='mes'>" + getNowFormatDate() + "</p>";	
			content.innerHTML +="<li><span style='float:left;margin-right:48px;'>您好，在线客服 "+ agentName +" ,很高兴为您服务</span></li>";
			scroll.scrollTop = scroll.scrollHeight;
		}else if(s == 1){
			if(d){
				d.close().remove();
			}
			footer.style.display = "block";	
			content.innerHTML +="<li><span style='float:left;margin-right:48px;'>客服忙，请稍侯...</span></li>";
			scroll.scrollTop = scroll.scrollHeight;
		}else{
			if(d){
				d.close().remove();
			}
			footer.style.display = "block";
			s = s - 1;
			content.innerHTML +="<li><span style='float:left;margin-right:48px;'>客服忙，前面有"+ s +"人在等待，请稍侯...</span></li>";
			scroll.scrollTop = scroll.scrollHeight;
		}
	}
	// queue标签内容文本为callin, 坐席端有请求分配到本坐席
	else if (q == 'callin') {
		loading.style.display = "none";
		logout.style.display = "block";
		footer.style.display = "none";
		var txt = '新请求: ' + p.getAttribute('from');
		content.innerHTML +="<p id='mes'>" + getNowFormatDate() + "</p>";	
		content.innerHTML +="<li><span style='float:left;margin-right:48px;'>您好，在线客服 "+ txt +" ,很高兴为您服务</span></li>";
		scroll.scrollTop = scroll.scrollHeight;
	}
	return true;
}

function onMessage(msg) {
    var type = msg.getAttribute('type');
    var elems = msg.getElementsByTagName('body');
    if (type == "chat" && elems.length > 0) {
  		var body = elems[0];
		content.innerHTML +="<p id='mes'>" + getNowFormatDate() + "</p>";	
  		content.innerHTML +="<li><span style='float:left;margin-right:48px;'>"+ Strophe.getText(body) +"</span></li>";
		scroll.scrollTop = scroll.scrollHeight;
    }
    return true;
}

function sendMessage() {
	var text = $('#message').get(0);
    var message = text.value;
    if(message && to){
		var reply = $msg({
		    to: to,
		    type: 'chat'
		}).cnode(Strophe.xmlElement('body', message)).up();
		connection.send(reply);	
		content.innerHTML +="<p id='mes'>" + getNowFormatDate() + "</p>";		
  		content.innerHTML +="<li><span style='float:right;background:#A6D4F2;margin-left:48px;'>"+ message +"</span></li>";
		text.value = '';
		scroll.scrollTop = scroll.scrollHeight;
    }
}

function getNowFormatDate() {
    var date = new Date();
    var seperator1 = "-";
    var seperator2 = ":";
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
            + " " + date.getHours() + seperator2 + date.getMinutes()
            + seperator2 + date.getSeconds();
    return currentdate;
}

$(document).ready(function () {
	$('#show').bind('click', function () {
		moreMenu.style.display="block";
	});
	$('#show-say').bind('click', function () {
		moreMenu.style.display="block";
	});
	$('#hide').bind('click', function () {
		moreMenu.style.display="none";
	});
	$('#pic').bind('click', function () {
		alert('图片');
		moreMenu.style.display="none";
	});
	$('#photo').bind('click', function () {
		alert('拍照');
		moreMenu.style.display="none";
	});
	$('#more').bind('click', function () {
		alert('更多');
		moreMenu.style.display="none";
	});
	$('#send').bind('click', function () {
		sendMessage();
    });
    $('#change').bind('click', function () {
		speak.style.display="block";
		fsend.style.display="none";
	});
    $('#change-say').bind('click', function () {
		speak.style.display="none";
		fsend.style.display="block";
	});
    $('#say-btn').bind('click', function () {
		alert('按住说话');
	});
    $('#back').bind('click', function () {
		history.back();
	});
    $('#logout').bind('click', function () {
		log_out();
	});
    $('#go').bind('click', function () {
		var fulljid = $('#jid').get(0).value + '@' + $('#domain').get(0).value;
	    if ($('#isclient').get(0).checked) {
	    	fulljid =  fulljid;
	    }
	    to_btn.style.display = "none";
		to_chat.style.display = "block";

		connection = new Strophe.Connection(BOSH_SERVICE, OPTS);
		connection.connect(fulljid, $('#pass').get(0).value, onConnect);
    });
});