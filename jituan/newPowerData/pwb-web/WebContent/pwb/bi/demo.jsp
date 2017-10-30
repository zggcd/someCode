<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<html>
<head>
<title>demo</title>
<%@ include file="/pwb/common/jsp/easyUIincluded.inc"%>
</head>

<body style="background-color: #EFF7FF; margin: 0px;">
	<nav style="background-color: #293c55; color: white;">
		<IMG style="padding-top: 5px; padding-left: 5px;"
			SRC="<%=request.getContextPath()%>/pwb/images/navicons/spotify.png" />
		<%
		    UserVO uservo = (UserVO) request.getAttribute("currentUser");
					if (null != uservo) {
						out.println("登录用户姓名：" + uservo.getUserName());
						out.println("登录用户账号：" + uservo.getLoginName());
						out.println("登录用户所属部门：" + uservo.getUnitNames());
					} else {
						out.println("你没有登录本系统");
					}
		%>
	</nav>
	<%=request.getLocale().toString()%>
	<%=request.getLocale().getLanguage()%>
	<%=request.getLocale().getCountry()%>

	<p>窗口在屏幕自由托动</p>
	<div style="margin: 20px 0;">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			onclick="$('#w').window('open')">打开窗口</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			onclick="$('#w').window('close')">关闭窗口</a>
	</div>
	<div id="w" class="easyui-window" title="基本窗口"
		data-options="iconCls:'icon-save',closed:true"
		style="width: 500px; height: 200px; padding: 10px;">
		easyui是一种基于jQuery的用户界面插件集合。</br> easyui为创建现代化，互动，JavaScript应用程序，提供必要的功能。</br>

		使用easyui你不需要写很多代码，你只需要通过编写一些简单HTML标记，就可以定义用户界面。</br>

		easyui是个完美支持HTML5网页的完整框架。</br> easyui节省您网页开发的时间和规模。</br> easyui很简单但功能强大的。
	</div>

	<a class="easyui-linkbutton"
		href="<%=request.getContextPath()%>/userAction.do">spring事务测试</a>

	<table class="easyui-datagrid" title="基础表格样式"
		style="width: 900px; height: 650px"
		data-options="singleSelect:true,collapsible:true,url:'<%=request.getContextPath()%>/queryItems.do',method:'post',singleSelect:false, 
        pagination:true,
        rownumbers:true,pageSize:20,pageList:[15,20,30,50] ">
		<thead style="text-align: center;">
			<tr>
				<th data-options="field:'itemid',width:80"
					style="text-align: center;">Item ID</th>
				<th data-options="field:'itemname',width:100"
					style="text-align: center;">条目名称</th>
				<th data-options="field:'itemvalue',width:200,align:'right'"
					style="text-align: center;">条目值</th>
				<th data-options="field:'itemdesc',width:80,align:'right'"
					style="text-align: center;">条目描述</th>
				<th data-options="field:'dictionaryid',width:250"
					style="text-align: center;">字典ID</th>
				<th data-options="field:'isvalid',width:60,align:'center'"
					style="text-align: center;">是否有效</th>
			</tr>
		</thead>
	</table>

	<a href="javascript:void(0)" class="easyui-linkbutton"
		onclick="jq_alert()">警报提示框</a>
	<a href="javascript:void(0)" class="easyui-linkbutton"
		onclick="jq_Confirm()">确认提示框<a> <br /> <br />

			<form id="ff" method="post" action="/demo/submit.do">
				<table cellpadding="5">
					<tr>
						<td>姓名:</td>
						<td><input class="easyui-textbox" type="text" name="name"
							data-options="required:true"></input></td>
					</tr>
					<tr>
						<td>Email:</td>
						<td><input class="easyui-textbox" type="text" name="email"
							data-options="required:true,validType:'email'"></input></td>
					</tr>
					<tr>
						<td>学科:</td>
						<td><input class="easyui-textbox" type="text" name="subject"
							data-options="required:true"></input></td>
					</tr>
					<tr>
						<td>消息:</td>
						<td><input class="easyui-textbox" name="message"
							data-options="multiline:true" style="height: 60px"></input></td>
					</tr>
					<tr>
						<td>语言:</td>
						<td><select class="easyui-combobox" name="language"><option
									value="ar">Arabic</option>
								<option value="bg">Bulgarian</option>
								<option value="ca">Catalan</option>
								<option value="zh-cht">中国传统</option>
								<option value="cs">Czech</option>
								<option value="da">Danish</option>
								<option value="nl">Dutch</option>
								<option value="en" selected="selected">English</option>
								<option value="et">Estonian</option>
								<option value="fi">Finnish</option>
								<option value="fr">French</option>
								<option value="de">German</option>
								<option value="el">Greek</option>
								<option value="ht">Haitian Creole</option>
								<option value="he">Hebrew</option>
								<option value="hi">Hindi</option>
								<option value="mww">Hmong Daw</option>
								<option value="hu">Hungarian</option>
								<option value="id">Indonesian</option>
								<option value="it">Italian</option>
								<option value="ja">Japanese</option>
								<option value="ko">Korean</option>
								<option value="lv">Latvian</option>
								<option value="lt">Lithuanian</option>
								<option value="no">Norwegian</option>
								<option value="fa">Persian</option>
								<option value="pl">Polish</option>
								<option value="pt">Portuguese</option>
								<option value="ro">Romanian</option>
								<option value="ru">Russian</option>
								<option value="sk">Slovak</option>
								<option value="sl">Slovenian</option>
								<option value="es">Spanish</option>
								<option value="sv">Swedish</option>
								<option value="th">Thai</option>
								<option value="tr">Turkish</option>
								<option value="uk">Ukrainian</option>
								<option value="vi">Vietnamese</option></select></td>
					</tr>
					<tr>
						<td align="center" style="text-align: center; padding: 5px">
							<a href="javascript:void(0)" class="easyui-linkbutton"
							onclick="submitForm()">提交表单</a> <a href="javascript:void(0)"
							class="easyui-linkbutton" onclick="ajaxsubmit()">ajax异步提交</a> <a
							href="javascript:void(0)" class="easyui-linkbutton"
							onclick="clearForm()">重置</a>
						</td>
				</table>
			</form>
</body>
<script>
	//普通提交
	function submitForm() {
		('#ff').form('submit');
	}
	
	function clearForm() {
		$('#ff').form('clear');
	}
    //ajax异步提交
	function ajaxsubmit() {
		var data = $("#ff").serializeArray(); //将form表单封装成json
		$.ajax({
			type : "post", //提交方式使用Post方式请求
			url : "/demo/submit.do", //数据提交地址
			data : data, //提交参数，      
			dataType : 'json',
			success : function(result) { //回调函数，result，返回值
				if( true == result.sucess )
			    {
				    $.messager.alert("操作提示", "操作成功！<br>返回数据：" + result.data.name, "info");
			    }else
			    {
			    	$.messager.alert("操作提示", "操作失败成功！", "error");
			    }
				//alert("返回数据：" + result.data.name + result.data.email);
			},
			error : function(resut) {
				alert(resut);
			}
		});
	}

	function jq_alert() {
		$.messager.alert("操作提示", "操作成功！", "info");
		$.messager.alert("操作提示", "操作成功！", "error");
		$.messager.alert("操作提示", "操作成功！", "warning");
		$.messager.alert("操作提示", "您确定要执行操作吗！", "question");
	}
	$(function() {
		jq_Confirm();
	});

	function jq_Confirm() {
		$.messager.confirm("操作提示", "您确定要执行操作吗？", function(data) {
			if (data) {
				alert("确定");
			} else {
				alert("取消");
			}
		});
	}
</script>
</html>
