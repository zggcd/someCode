<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>工单详情</title>
<style type="text/css">
table {
	border-collapse: collapse;
}
table, th, td {
	border-color: blue;
	font-size: 12px;
	padding: 5px;
}
</style>
</head>
<body>
	<x:parse xml="${requestScope.xml}" var="document" />
	<table border="1" cellpadding="3" cellspacing="0" width="100%">
		<tr>
			<th colspan="4">工单基本信息</th>
		</tr>
		<tr>
			<td>工单编号</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/WSID" /></td>
			<td>工单类型</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/WSTYPECODE" /></td>
		</tr>
		<tr>
			<td>工单提示信息</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/WSINFOHINT" /></td>
		</tr>
		<tr>
			<td>申告时间</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/BEGINTIME" /></td>
			<td>完成时间</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/ENDTIME" /></td>
		</tr>
		<tr>
			<td>状态</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/STATUS" /></td>
			<td>紧急程序</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/URGEDEGREE" /></td>
		</tr>
	</table>
	<br />
	<table border="1" cellpadding="3" cellspacing="0" width="100%">
		<tr>
			<th colspan="6">工单处理过程信息</th>
		</tr>
		<tr>
			<td>任务名称</td>
			<td>任务生成时间</td>
			<td>处理人</td>
			<td>接单时间</td>
			<td>处理时间</td>
			<td>备注</td>
		</tr>
		<x:forEach var="handleInfo" select="$document/interfacemsg/result/sheetDetailInfo/handleInfoList/handleInfo">
		<tr>
			<td><x:out select="$handleInfo/TASKNAME" /></td>
			<td><x:out select="$handleInfo/TASKCREATETIME" /></td>
			<td><x:out select="$handleInfo/HANDLEPERSON" /></td>
			<td><x:out select="$handleInfo/TASKRECEIVETIME" /></td>
			<td><x:out select="$handleInfo/HANDLETIME" /></td>
			<td><x:out select="$handleInfo/HANDLEDETAIL" /></td>
		</tr>
		</x:forEach>
	</table>
	<br />
	<table border="1" cellpadding="3" cellspacing="0" width="100%">
		<tr>
			<th colspan="4">工单申告信息</th>
		</tr>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/WSTYPECODE = '交换专业故障'">
		<tr>
			<td>故障单号</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/WSID" /></td>
			<td>申告人</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/APPLYER" /></td>
		</tr>
		<tr>
			<td>申告时间</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/APPLYTIME" /></td>
			<td>申告组织机构</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/APPLYUNIT" /></td>
		</tr>
		<tr>
			<td>故障类型</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_TROUBLETYPE" /></td>
		</tr>
		<tr>
			<td>故障方向</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_INTLCALLTROUBLEDIRECT" /></td>
		</tr>
		<tr>
			<td>主叫电话号码</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_CALLINGPHONENUM" /></td>
			<td>主叫号码属地</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_CALLINGPHONENUMDOMAIN" /></td>
		</tr>
		<tr>
			<td>发端长途局信息</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_CALLINGTRUNKEXCHANGE" /></td>
			<td>受端长途局信息</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_CALLEDTRUNKEXCHANGE" /></td>
		</tr>
		<tr>
			<td>故障描述</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/TROUBLEDESCR" /></td>
		</tr>
		<tr>
			<td>初步分析处理</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/CCFXHJDCL" /></td>
		</tr>
		<tr>
			<td>是否影响业务</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/IFINFLBUSI" /></td>
			<td>故障发生时间</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/HAPPENTIME" /></td>
		</tr>
		<tr>
			<td>是否主动发现</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/IFFIRSTFOUND" /></td>
			<td>故障来源</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/TROUBLESOURCE" /></td>
		</tr>
		</x:if>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/WSTYPECODE = '移动专业故障'">
		<tr>
			<td>客户类型</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/CUSTTYPE" /></td>
		</tr>
		<tr>
			<td>故障单号</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/WSID" /></td>
			<td>申告人</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/APPLYER" /></td>
		</tr>
		<tr>
			<td>申告时间</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/APPLYTIME" /></td>
			<td>申告组织机构</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/APPLYUNIT" /></td>
		</tr>
		<tr>
			<td>故障对象</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/TROUBLEOBJ" /></td>
			<td>移动网</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/NETWORK" /></td>
		</tr>
		<tr>
			<td>申告大类</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/APPLYCLASS" /></td>
			<td>申告小类</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/APPLYCLASSSMALL" /></td>
		</tr>
		<tr>
			<td>故障描述</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/TROUBLEDESCR" /></td>
		</tr>
		<tr>
			<td>初步分析处理</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/CCFXHJDCL" /></td>
		</tr>
		<tr>
			<td>是否影响业务</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/IFINFLBUSI" /></td>
			<td>故障发生时间</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/HAPPENTIME" /></td>
		</tr>
		<tr>
			<td>是否主动发现</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/IFFIRSTFOUND" /></td>
			<td>故障来源</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/TROUBLESOURCE" /></td>
		</tr>
		</x:if>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/WSTYPECODE = '传输专业故障'">
		<tr>
			<td>故障段落</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/TROUBLEPARA" /></td>
			<td>故障来源</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/TROUBLESOURCE" /></td>
		</tr>
		<tr>
			<td>故障描述</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/TROUBLEDESCR" /></td>
		</tr>
		<tr>
			<td>故障影响</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/TROUBLEINFL" /></td>
		</tr>
		<tr>
			<td>发生时间</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/HAPPENTIME" /></td>
			<td>是否主动发现</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/IFFIRSTFOUND" /></td>
		</tr>
		</x:if>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/WSTYPECODE = '数据专业故障'">
		<tr>
			<td>故障类型</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_TROUBLETYPE" /></td>
		</tr>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_TROUBLETYPE = '链路故障'">
		<tr>
			<td>网络名称</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/SPECLEVEL" /></td>
			<td>电路名称</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_TRANSCIRCODE" /></td>
		</tr>
		<tr>
			<td>A端设备</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_DEVICEA" /></td>
			<td>A端端口</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_PORTA" /></td>
		</tr>
		<tr>
			<td>Z端设备</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_DEVICEZ" /></td>
			<td>Z端端口</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_PORTZ" /></td>
		</tr>
		<tr>
			<td>A端IP</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_IPA" /></td>
			<td>Z端IP</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_IPZ" /></td>
		</tr>
		<tr>
			<td>A端设备端口告警和协议层信息</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_DEVALMANDPRTCLINFA" /></td>
			<td>Z端设备端口告警和协议层信息</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_DEVALMANDPRTCLINFZ" /></td>
		</tr>
		<tr>
			<td>电路带宽</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/BANDWIDTH" /></td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		</x:if>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_TROUBLETYPE = '设备故障'">
		<tr>
			<td>网络名称</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/SPECLEVEL" /></td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>设备名称</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_DEVNAME" /></td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>设备型号</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_DEVMODEL" /></td>
			<td>板卡位置</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_CARDPOS" /></td>
		</tr>
		<tr>
			<td>板卡类型</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_CARDMODEL" /></td>
			<td>板卡序列号</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_CARDSN" /></td>
		</tr>
		<tr>
			<td>告警类型</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_ALARMTYPE" /></td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>厂商告警信息</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_VENDORALARM" /></td>
		</tr>
		</x:if>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_TROUBLETYPE = '网络攻击'">
		<tr>
			<td>网络名称</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/SPECLEVEL" /></td>
			<td>被攻击IP地址</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_ATTACKEDIP" /></td>
		</tr>
		<tr>
			<td>发起攻击IP地址</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_ATTACKINGIP" /></td>
			<td>攻击流量</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_ATTACKFLOW" /></td>
		</tr>
		<tr>
			<td>被攻击省</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_NETATTACKINGPROV" /></td>
			<td>网内网外</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_NETTYPE" /></td>
		</tr>
		<tr>
			<td>城域网（IDC）名称</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_IDCNAME" /></td>
			<td>AS号</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_ASNO" /></td>
		</tr>
		<tr>
			<td>用户名称</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_CUSTNAME" /></td>
			<td>对应主机应用</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_CUSTNAME" /></td>
		</tr>
		<tr>
			<td>申告运营商</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_ISPNAME" /></td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		</x:if>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_TROUBLETYPE = '钓鱼网站'">
		<tr>
			<td>网络名称</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/SPECLEVEL" /></td>
			<td>网站URL链接</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_PHISHINGSITEURL" /></td>
		</tr>
		<tr>
			<td>网站IP地址</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_PHISHINGSITEIP" /></td>
			<td>网站所在省</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_PHISHINGSITEPROV" /></td>
		</tr>
		<tr>
			<td>申告单位</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/APPLYUNIT" /></td>
			<td>影响用户</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_INFLCUST" /></td>
		</tr>
		</x:if>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_TROUBLETYPE = '网站访问'">
		<tr>
			<td>网络名称</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/SPECLEVEL" /></td>
			<td>客户类型</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_CUSTTYPE" /></td>
		</tr>
		<tr>
			<td>客户名称</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/CUSTNAME" /></td>
			<td>被访问IP地址</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_VISITEDIP" /></td>
		</tr>
		<tr>
			<td>被访问URL</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_VISITEDURL" /></td>
			<td>访问源IP地址</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_VISITINGIP" /></td>
		</tr>
		<tr>
			<td>问题类别</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_VISITTROUBLETYPE" /></td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		</x:if>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_TROUBLETYPE = '设备脱网'">
		<tr>
			<td>网络名称</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/SPECLEVEL" /></td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>脱网设备</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_OFFLINEDEV" /></td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		</x:if>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/AP_TROUBLETYPE = '其他'">
		<tr>
			<td>故障对象</td>
			<td>&nbsp;</td>
			<td>是否主动发现</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/IFFIRSTFOUND" /></td>
		</tr>
		<tr>
			<td>故障来源</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/TROUBLESOURCE" /></td>
			<td>数据网</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/SPECLEVEL" /></td>
		</tr>
		</x:if>
		<tr>
			<td>故障现象</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/TROUBLEDESCR" /></td>
		</tr>
		<tr>
			<td>故障发生时间</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/HAPPENTIME" /></td>
		</tr>
		<tr>
			<td>故障来源</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/TROUBLESOURCE" /></td>
			<td>是否主动发现</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/IFFIRSTFOUND" /></td>
		</tr>
		<tr>
			<td>初步分析处理</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/CCFXHJDCL" /></td>
		</tr>
		</x:if>
	</table>
	<br />
	<table border="1" cellpadding="3" cellspacing="0" width="100%">
		<tr>
			<th colspan="4">工单受理派单信息</th>
		</tr>
		<tr>
			<td>受理人</td>
			<td>处理组织机构</td>
			<td>受理时间</td>
			<td>受理详细信息</td>
		</tr>
		<x:forEach var="dispatchInfo" select="$document/interfacemsg/result/sheetDetailInfo/dispatchInfoList/dispatchInfo">
		<tr>
			<td><x:out select="$dispatchInfo/OPERATOR" /></td>
			<td><x:out select="$dispatchInfo/PROVINCENAME" /></td>
			<td><x:out select="$dispatchInfo/OPERTIME" /></td>
			<td><x:out select="$dispatchInfo/OPERDETAIL" /></td>
		</tr>
		</x:forEach>
	</table>
	<br />
	<table border="1" cellpadding="3" cellspacing="0" width="100%">
		<tr>
			<th colspan="6">工单处理信息</th>
		</tr>
		<tr>
			<td>处理人</td>
			<td>处理时间</td>
			<td>处理过程</td>
		</tr>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/WSTYPECODE = '交换专业故障'">
			<x:forEach var="dealInfo" select="$document/interfacemsg/result/sheetDetailInfo/dealInfoList/dealInfo">
			<tr>
				<td><x:out select="$dealInfo/DEALER" /></td>
				<td><x:out select="$dealInfo/DEALTIME" /></td>
				<td>
					<x:if select="$dealInfo/DEALFLAG = '反馈'">
						反馈信息：<x:out select="$dealInfo/DEALFEEDBACK" />
						<br />
						姓名工号：<x:out select="$dealInfo/CONTACT" />
						<br />
						联系电话：
						<x:out select="$dealInfo/CONTACTTEL" />
					</x:if>
					<x:if select="$dealInfo/DEALFLAG = '回单'">
						回单：
						<br />
						是否本区间障碍：<x:out select="$dealInfo/IFMYZONE" />
						<x:if select="$dealInfo/IFMYZONE = '是'">
							<br />
							姓名工号：<x:out select="$dealInfo/CONTACT" />
							<br />
							联系电话：<x:out select="$dealInfo/CONTACTTEL" />
							<br />
							业务恢复时间：<x:out select="$dealInfo/BUSIRECOVERTIME" />
							<br />
							故障恢复时间：<x:out select="$dealInfo/RECOVERTIME" />
							<br />
							故障原因和处理办法：<x:out select="$dealInfo/TROUBLEREASONSUM" />
							<br />
							故障段落：<x:out select="$dealInfo/FIRSTRESPER" />
							<br />
							故障类型：<x:out select="$dealInfo/CL_TROUBLETYPE" />
							<br />
							所属本地网：<x:out select="$dealInfo/LOCALNETWORK" />
						</x:if>
					</x:if>
				</td>
			</tr>
			</x:forEach>
		</x:if>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/WSTYPECODE = '移动专业故障'">
			<x:forEach var="dealInfo" select="$document/interfacemsg/result/sheetDetailInfo/dealInfoList/dealInfo">
			<tr>
				<td><x:out select="$dealInfo/DEALER" /></td>
				<td><x:out select="$dealInfo/DEALTIME" /></td>
				<td>
					<x:if select="$dealInfo/DEALFLAG = '反馈'">
						反馈信息：<x:out select="$dealInfo/DEALFEEDBACK" />
						<br />
						姓名工号：<x:out select="$dealInfo/CONTACT" />
						<br />
						联系电话：
						<x:out select="$dealInfo/CONTACTTEL" />
					</x:if>
					<x:if select="$dealInfo/DEALFLAG = '回单'">
						回单：
						<br />
						故障原因：<x:out select="$dealInfo/TROUBLEREASON" />
						<br />
						处理结果：<x:out select="$dealInfo/DEALSOLUTION" />
						<br />
						是否本区间障碍：<x:out select="$dealInfo/IFMYZONE" />
						<x:if select="$dealInfo/IFMYZONE = '是'">
						<br />
						业务恢复时间：<x:out select="$dealInfo/BUSIRECOVERTIME" />
						<br />
						姓名工号：<x:out select="$dealInfo/CONTACT" />
						<br />
						联系电话：
						<x:out select="$dealInfo/CONTACTTEL" />
						</x:if>
					</x:if>
				</td>
			</tr>
			</x:forEach>
		</x:if>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/WSTYPECODE = '传输专业故障'">
			<x:forEach var="dealInfo" select="$document/interfacemsg/result/sheetDetailInfo/dealInfoList/dealInfo">
			<tr>
				<td><x:out select="$dealInfo/DEALER" /></td>
				<td><x:out select="$dealInfo/DEALTIME" /></td>
				<td>
					<x:if select="$dealInfo/DEALFLAG = '反馈'">
						反馈信息：<x:out select="$dealInfo/DEALFEEDBACK" />
						<br />
						姓名工号：<x:out select="$dealInfo/CONTACT" />
						<br />
						联系电话：
						<x:out select="$dealInfo/CONTACTTEL" />
					</x:if>
					<x:if select="$dealInfo/DEALFLAG = '回单'">
						回单：
						<br />
						是否本区间障碍：<x:out select="$dealInfo/IFMYZONE" />
						<x:if select="$dealInfo/IFMYZONE = '是'">
							<br />
							传输网类型：<x:out select="$dealInfo/SPECLEVEL" />
							<br />
							业务恢复时间：<x:out select="$dealInfo/BUSIRECOVERTIME" />
							<br />
							故障恢复时间：<x:out select="$dealInfo/RECOVERTIME" />
							<br />
							一级干线光缆：<x:out select="$dealInfo/FIBRE1" />
							<br />
							补充说明：<x:out select="$dealInfo/OTHERFWS" />
							<br />
							故障所在省份：<x:out select="$dealInfo/TROUBLEPROV" />
							<br />
							故障段落：<x:out select="$dealInfo/TROUBLEPARA" />
							<br />
							故障类型：<x:out select="$dealInfo/TROUBLETYPELARGE" />
							<br />
							故障子类型：<x:out select="$dealInfo/TROUBLETYPESMALL" />
							<br />
							故障原因：<x:out select="$dealInfo/REASONSUMMARY" />
							<br />
							所有影响系统名称：<x:out select="$dealInfo/TROUBLEINFL" />
						</x:if>
					</x:if>
				</td>
			</tr>
			</x:forEach>
		</x:if>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/WSTYPECODE = '数据专业故障'">
			<x:forEach var="dealInfo" select="$document/interfacemsg/result/sheetDetailInfo/dealInfoList/dealInfo">
			<tr>
				<td><x:out select="$dealInfo/DEALER" /></td>
				<td><x:out select="$dealInfo/DEALTIME" /></td>
				<td>
					<x:if select="$dealInfo/DEALFLAG = '反馈'">
						反馈信息：<x:out select="$dealInfo/DEALFEEDBACK" />
						<br />
						姓名工号：<x:out select="$dealInfo/CONTACT" />
						<br />
						联系电话：
						<x:out select="$dealInfo/CONTACTTEL" />
					</x:if>
					<x:if select="$dealInfo/DEALFLAG = '回单'">
						回单：
						<br />
						是否本区间障碍：<x:out select="$dealInfo/IFMYZONE" />
						<x:if select="$dealInfo/IFMYZONE = '是'">
							<br />
							故障段落：<x:out select="FIRSTRESPER"/>
							<br />
							故障原因详细描述：<x:out select="$dealInfo/TROUBLEREASONSUM" />
							<br />
							备注或建议：<x:out select="$dealInfo/ARCHIVENOTE" />
							<br />
							备用资源还原情况：<x:out select="$dealInfo/BACKUPRES" />
							<br />
							业务恢复时间：<x:out select="$dealInfo/BUSIRECOVERTIME" />
							<br />
							故障恢复时间：<x:out select="$dealInfo/RECOVERTIME" />
						</x:if>
					</x:if>
				</td>
			</tr>
			</x:forEach>
		</x:if>
	</table>
	<br />
	<table border="1" cellpadding="3" cellspacing="0" width="100%">
		<tr>
			<th colspan="4">工单结单信息</th>
		</tr>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/WSTYPECODE = '交换专业故障'">
		<tr>
			<td>业务恢复时间</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/RECOVERTIME" /></td>
			<td>故障恢复时间</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/RECOVERTIME" /></td>
		</tr>
		<tr>
			<td>故障原因和处理办法</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/TROUBLEREASONSUM" /></td>
		</tr>
		<tr>
			<td>故障段落</td>
			<td>&nbsp;</td>
			<td>所属本地网</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/LOCALNETWORK" /></td>
		</tr>
		<tr>
			<td>故障类型</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/CL_TROUBLETYPE" /></td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		</x:if>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/WSTYPECODE = '移动专业故障'">
		<tr>
			<td>故障第一责任人</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/FIRSTRESPER" /></td>
		</tr>
		<tr>
			<td>业务恢复时间</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/RECOVERTIME" /></td>
			<td>故障恢复时间</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/RECOVERTIME" /></td>
		</tr>
		<tr>
			<td>确认结果</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/CONFIRMRESULT" /></td>
		</tr>
		<tr>
			<td>确认详细信息</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/CONFIRMDETAIL" /></td>
		</tr>
		<tr>
			<td>故障类型</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/TROUBLETYPE" /></td>
		</tr>
		<tr>
			<td>故障端</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/TROUBLEPOINT" /></td>
			<td>故障原因</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/TROUBLEREASON" /></td>
		</tr>
		<tr>
			<td>故障原因描述</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/TROUBLEREASONDESCR" /></td>
		</tr>
		<tr>
			<td>结单详细信息</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/ARCHIVEDETAIL" /></td>
		</tr>
		</x:if>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/WSTYPECODE = '传输专业故障'">
		<tr>
			<td>传输网类型</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/SPECLEVEL" /></td>
			<td>故障发生时间</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/HAPPENTIME" /></td>
		</tr>
		<tr>
			<td>业务恢复时间</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/BUSIRECOVERTIME" /></td>
			<td>故障恢复时间</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/RECOVERTIME" /></td>
		</tr>
		<tr>
			<td>一级干线光缆</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/FIBRE1" /></td>
			<td>补充说明</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/OTHERFWS" /></td>
		</tr>
		<tr>
			<td>二级干线光缆</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/FIBRE2" /></td>
			<td>&nbsp;</td>
			<td></td>
		</tr>
		<tr>
			<td>一干波分</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/WAVE1" /></td>
			<td>补充说明</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/OTHERFWS" /></td>
		</tr>
		<tr>
			<td>二干波分</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/WAVE2" /></td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>故障所在省份</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/TROUBLEPROV" /></td>
			<td>故障段落</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/TROUBLEPARA" /></td>
		</tr>
		<tr>
			<td>故障类型</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/TROUBLETYPELARGE" /></td>
			<td>故障子类型</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/TROUBLETYPESMALL" /></td>
		</tr>
		<tr>
			<td>故障原因</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/REASONSUMMARY" /></td>
		</tr>
		<tr>
			<td>所有影响系统名称</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/applyInfo/TROUBLEINFL" /></td>
		</tr>
		<tr>
			<td>设备厂商</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/RELMANU" /></td>
		</tr>
		<tr>
			<td>故障影响</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/TROUBLEAFFECT" /></td>
		</tr>
		<tr>
			<td>故障第一责任人</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/RECOVERTIME" /></td>
		</tr>
		<tr>
			<td>处理结果</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/DEALSUMMARY" /></td>
		</tr>
		</x:if>
		<x:if select="$document/interfacemsg/result/sheetDetailInfo/BasicInfo/WSTYPECODE = '数据专业故障'">
		<tr>
			<td>业务恢复时间</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/RECOVERTIME" /></td>
			<td>故障段落</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>故障恢复时间</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/RECOVERTIME" /></td>
			<td>故障类型</td>
			<td><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/FIRSTRESPER" /></td>
		</tr>
		<tr>
			<td>故障原因和处理办法</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/TROUBLEREASONSUM" /></td>
		</tr>
		<tr>
			<td>备注或建议</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/ARCHIVENOTE" /></td>
		</tr>
		<tr>
			<td>备用资源还原情况</td>
			<td colspan="3"><x:out select="$document/interfacemsg/result/sheetDetailInfo/finishInfo/BACKUPRES" /></td>
		</tr>
		</x:if>
	</table>
	<br />
	<table border="1" cellpadding="3" cellspacing="0" width="100%">
		<tr>
			<th colspan="10">工单挂起解挂情况</th>
		</tr>
		<tr>
			<td>申请时间</td>
			<td>申请人</td>
			<td>挂起类型</td>
			<td>申请原因</td>
			<td>申请时长</td>
			<td>批准时长</td>
			<td>挂起时间</td>
			<td>解挂时间</td>
			<td>挂起时长</td>
			<td>状态</td>
		</tr>
		<x:forEach var="hangupInfo" select="$document/interfacemsg/result/sheetDetailInfo/hangupInfoList/hangupInfo">
		<tr>
			<td><x:out select="$hangupInfo/APPLYTIME" /></td>
			<td><x:out select="$hangupInfo/APPLYER" /></td>
			<td><x:out select="$hangupInfo/HANGUPTYPE" /></td>
			<td><x:out select="$hangupInfo/APPLYREASON" /></td>
			<x:if select="$hangupInfo/APPLYGAP = '-1'">
				<td>无限时间</td>
			</x:if>
			<x:if select="$hangupInfo/APPLYGAP != '-1'">
				<td><x:out select="$hangupInfo/APPLYGAP" /></td>
			</x:if>
			<x:if select="$hangupInfo/SANCGAP = '-1'">
				<td>无限时间</td>
			</x:if>
			<x:if select="$hangupInfo/SANCGAP != '-1'">
				<td><x:out select="$hangupInfo/SANCGAP" /></td>
			</x:if>
			<td><x:out select="$hangupInfo/HANGUPSTARTTIME" /></td>
			<td><x:out select="$hangupInfo/HANGUPENDTIME" /></td>
			<td><x:out select="$hangupInfo/HANGUPGAP" /></td>
			<x:if select="$hangupInfo/STATUS = 'END'">
				<td>挂起结束</td>
			</x:if>
			<x:if select="$hangupInfo/STATUS != 'END'">
				<td><x:out select="$hangupInfo/STATUS" /></td>
			</x:if>
		</tr>
		</x:forEach>
	</table>
	<br />
	<table border="1" cellpadding="3" cellspacing="0" width="100%">
		<tr>
			<th>附件信息</th>
		</tr>
		<tr>
			<td>附件名称</td>
		</tr>
		<x:forEach var="attachInfo" select="$document/interfacemsg/result/sheetDetailInfo/attachInfoList/FILE">
		<tr>
			<td><x:out select="$attachInfo/FILE_NAME" /></td>
		</tr>
		</x:forEach>
	</table>
</body>
</html>