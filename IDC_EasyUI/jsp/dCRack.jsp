<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!-- 导入公共资源库 -->
<%@ include file="/pwb/include/common.jspf"%>
<%@ include file="/pwb/include/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>机架管理</title>
<script type="text/javascript">
	
</script>
</head>
<body>
<style type="text/css">
		.table-bordered {
			margin: 5px 5px 5px 5px;
			border-collapse: collapse;  
	     	border: none;
	     	font-size:12px;
			width : 95%;
		}
		.table-bordered>tbody>tr>td, .table-bordered>tbody>tr>th, .table-bordered>tfoot>tr>td, .table-bordered>tfoot>tr>th, .table-bordered>thead>tr>td, .table-bordered>thead>tr>th {
		    border: 1px solid #ddd;
		    padding: 8px;
		} 
	</style>
	<form id="form" action="/rack?save" method="post" data-options="novalidate:true">
		<input type="hidden" name="id" id="id" value="${rackPage.id }" />
		<input type="hidden" name="areaid" id="areaid" value="${rackPage.areaid }" />
		<input type="hidden" name="roomid" id="roomid" value="${rackPage.roomid }" />
		<fieldset style="border-color:#F7F7F7;margin: 15px 15px " >
	        <legend>机架基本信息</legend>
			<c:choose>
				<c:when test="${pageType=='query' }">
					<table align="center"  style="margin: 5px auto;text-align: center;" class="table-bordered">
						<tr>
							<td width="15%" >机架编码:</td>
							<td width="30%">${rackPage.no }</td>
							<td width="15%" >机架名称:</td>
							<td width="30%">${rackPage.name }</td>
						</tr>
					 	<tr>
							<td width="15%" >所属分公司:</td>
							<td>${rackPage.parentareaname }</td>
							
							<td width="15%" >所属IDC中心:</td>
							<td>${rackPage.areaName }</td>
						</tr>
						<tr>
							
							<td width="15%" >所属机房:</td>
							<td  >${rackPage.roomName }</td>
							<td width="15%" >业务状态:</td>
							<td  >${rackPage.serviceStatusName }</td>
						</tr>
						<tr>
							<td width="15%" >机架列号:</td>
							<td  >${rackPage.colno }</td>
							<td width="15%" >机架行号:</td>
							<td  >${rackPage.rowno }</td>
						</tr>
						<tr>
							<td width="15%" >机房X坐标:</td>
							<td  >${rackPage.xposition }</td>
							<td width="15%" >机房Y坐标:</td>
							<td  >${rackPage.yposition }</td>
						</tr>
						
						<tr>
							<td width="15%" >机架类型:</td>
							<td  >${rackPage.typeName }</td>
							<td width="15%" >机架所属权:</td>
							<td  >${rackPage.ownertypename }</td>
						</tr>
						<tr>
							<td width="15%" >机架容量:</td>
							<td  >${rackPage.capacity }</td>
							<td width="15%" >维护状态:</td>
							<td  >${rackPage.maintstatusName }</td>
						</tr>
						<tr>
							<td width="15%" >电源相位:</td>
							<td  >${rackPage.power }</td>
							<td width="15%" >维护信息:</td>
							<td>${rackPage.maintenanceDept }</td>
						</tr>
					</table>
				</c:when>
				<c:otherwise>
					<table align="center"  style="margin: 5px auto;" class="table-bordered">
						<c:if test="${rackPage.id!=null }">
							<tr>
								<td width="15%" style="text-align: center">机架编码:<strong  style="color: red;">*</strong></td>
								<td><input class="easyui-textbox" type="text" id="no"
									name="no" data-options=" readonly:true,required:true" value="${rackPage.no }"></input></td>
								<td width="15%" style="text-align: center">机架名称:<strong  style="color: red;">*</strong></td>
								<td><input class="easyui-textbox" type="text" id="name"
									name="name" data-options="required:true,readonly:true" value="${rackPage.name }"></input></td>
							</tr>
						</c:if>
						 <tr>
							<td width="15%" style="text-align: center">所属IDC中心:</td>
							<td>
								<%-- <input type="hidden"
								id="areaid" name="areaid" data-options="editable:false,readonly:true"
								value="${rackPage.areaid }">
								</input> --%>
								<input class="easyui-textbox" type="text"
								id="areaName" name="areaName" data-options="editable:false,readonly:true"
								value="${rackPage.areaName }">
								</input>
							</td>
							<td width="15%" style="text-align: center">所属机房:<strong  style="color: red;">*</strong></td>
							<td width="30%" >
							<input class="easyui-textbox" id="roomName" name="roomName"
								data-options="required:true,editable: false", value=${rackPage.roomName }>
								
							</td>
						</tr>
						<tr>
							<td width="15%" style="text-align: center">机架类型:<strong  style="color: red;">*</strong></td>
							<td width="30%" ><input class="easyui-combobox" type="text" id="typeid"
								name="typeid" data-options="panelHeight:'200px',editable:false,required:true,url:'/racktype/find_RacktypeList',valueField:'id',textField:'name'" value="${rackPage.typeid }"></input>
							</td>
							<td width="15%" style="text-align: center">机架所属权:<strong  style="color: red;">*</strong></td>
							<td width="30%" ><input class="easyui-combobox" type="text" id="ownertype"
								name="ownertype" data-options="panelHeight:'auto',required:true,editable:false,url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_OWNERTYPE',valueField:'itemCode',textField:'itemName'" value="${rackPage.ownertype }"></input>
							</td>
						</tr>
						<tr>
							<td width="15%" style="text-align: center">机架列号:<strong  style="color: red;">*</strong></td>
							<td width="30%"><input class="easyui-combobox" style="width: 180px;" type="text" id="colno" name="colno" value="${rackPage.colno }"
								data-options="panelHeight:'150px',
								valueField:'id',
								required:true,
								textField:'upsname',
								url:'/dCRack/cols?roomid='+'${rackPage.roomid }', 
								editable:false"/>
						
							</td>
							<td width="15%" style="text-align: center">机架行号:<strong  style="color: red;">*</strong></td>
							<td width="30%">
							<input class="easyui-combobox"  type="text" id="rowno" name="rowno"
									data-options="
									panelHeight:'150px',
									required:true,
									valueField:'id',
									textField:'upsname',
									url:'/dCRack/rows?roomid='+'${rackPage.roomid }', 
									editable:false" 
									value="${rackPage.rowno }"/></td>
<%-- 							<td width="15%" style="text-align: center">机架行号:<strong  style="color: red;">*</strong></td>
							<td width="30%" ><input class="easyui-numberbox" type="text" id="rowno"
								name="rowno" data-options="required:true,min:0, precision:0" value="${rackPage.rowno }"></input></td>
							<td width="15%" style="text-align: center">机架列号:<strong  style="color: red;">*</strong></td>
							<td width="30%" ><input class="easyui-numberbox" type="text" id="colno" name="colno"
								data-options="required:true,min:0, precision:0" value="${rackPage.colno }"></input></td> --%>
						</tr>
						<tr>
							<td width="15%" style="text-align: center">行别名:</td>
							<td width="30%" ><input class="easyui-textbox" type="text" id="rowname" name="rowname"
								data-options="" value="${rackPage.rowname }"></input></td>
							<td width="15%" style="text-align: center">列别名:</td>
							<td width="30%" ><input class="easyui-textbox" type="text" id="colname"
								name="colname" data-options="" value="${rackPage.colname }"></input></td>
						</tr>
						<tr>
							<td width="15%" style="text-align: center">机房X坐标:</td>
							<td width="30%" ><input class="easyui-numberbox" type="text" id="xposition"
								name="xposition" data-options="min:0, precision:2" value="${rackPage.xposition }"></input></td>
							<td width="15%" style="text-align: center">机房Y坐标:</td>
							<td width="30%" ><input class="easyui-numberbox" type="text" id="yposition"
								name="yposition" data-options="min:0, precision:2" value="${rackPage.yposition }"></input></td>
						</tr>
						<tr>
							<td width="15%" style="text-align: center">机架容量:<strong  style="color: red;">*</strong></td>
							<td width="30%" ><input class="easyui-numberbox" type="text" id="capacity"
								name="capacity" data-options="required:true,min:0, precision:0" value="${rackPage.capacity }"></input>
							</td>
							<td width="15%" style="text-align: center">维护信息:</td>
							<td><input class="easyui-textbox" type="text"
								id="maintenanceDept" name="maintenanceDept" data-options="multiline:true"
								value="${rackPage.maintenanceDept }"></input></td>
						</tr>
						<tr>
							<td width="15%" style="text-align: center">电源相位:</td>
							<td width="30%" ><input class="easyui-textbox" type="text" id="power"
								name="power" data-options="" value="${rackPage.power }"></input></td>
							<td width="15%" style="text-align: center">合作模式:</td>
							<td width="30%" ><input class="easyui-combobox" type="text" id="bmodel"
								name="bmodel" data-options="editable:false,panelHeight:'auto',url:'/baseController?getDictList&dictionaryCode=IDD_IDC_ROOM_COOPERATIONMODEL',valueField:'itemCode',textField:'itemName'" value="${rackPage.bmodel }"></input>
							</td>
						</tr>
						<c:if test="${rackPage.id != null }">
							<tr>
								<td width="15%" style="text-align: center">业务状态:<strong  style="color: red;">*</strong></td>
								<td width="30%" >
								<input class="easyui-combobox" id="serviceStatus" name="serviceStatus"
									 value="${rackPage.serviceStatus }"
									 data-options=" editable:false,
									 required:true,
									 panelHeight:'auto',
									 url:'/baseController?getDictList&dictionaryCode=IDD_IDC_RACK_SERVICSTATUS',
									 valueField:'itemCode',
									 textField:'itemName',
									 prompt:'--请选择--',
									 loadFilter:function(data){  
									    var dataresult = [];  
									    for(var i in data) { 
									        if(data[i].itemName=='空闲可用' || data[i].itemName=='空闲'){  
									            dataresult.push(data[i]);  
									        }  
									        if(data[i].itemName=='自用'){  
									            dataresult.push(data[i]);  
									        }  
									        if(data[i].itemName=='损坏'){  
									            dataresult.push(data[i]);  
									        }  
									    }  
									    return dataresult;  
									  } 
									 ">
								</td>
							</tr>
						</c:if>
					</table>
				</c:otherwise>
			</c:choose>
		</fieldset>
		<fieldset style="border-color:#F7F7F7;margin: 15px 15px " >
	        <legend>机架电源属性 </legend>
	        <c:choose>
				<c:when test="${pageType=='query' }">
					<table align="center"  style="margin: 5px auto;text-align: center" class="table-bordered">
						<%-- <tr>
							<td width="15%" >A路额定电流:</td>
							<td width="30%" >${rackPage.ratedcurrenta }</td>
							<td width="15%" >A路电源开关:</td>
							<td width="30%" >${rackPage.switcha }</td>
						</tr>
						<tr>
		
							<td width="15%" >A路电源相位:</td>
							<td  >${rackPage.phasea }</td>
							<td width="15%" >B路额定电流:</td>
							<td  >${rackPage.ratedcurrentb }</td>
						</tr>
						<tr>
							<td width="15%" >B路电源开关:</td>
							<td  >${rackPage.switchb }</td>
							<td width="15%" >B路电源相位:</td>
							<td  >${rackPage.phaseb }</td>
						</tr> --%>
						<tr>
							<td width="15%" >列头柜电力容量:</td>
							<td  width="30%"  >${rackPage.rowcabinetpower }</td>
							<td width="15%" >机架电力容量:</td>
							<td  width="30%"  >${rackPage.rackpower }</td>
						</tr>
						<tr>
							<td width="15%" >电流(A):</td>
							<td width="30%" >${rackPage.electricity }</td>
							<td width="15%" >电压(V):</td>
							<td  width="30%">${rackPage.electricvoltage }</td>
						</tr>
						<tr>
							<td width="15%" >功率(KW):</td>
							<td width="30%" >${rackPage.electricpower }</td>
							<td width="15%" ></td>
							<td width="30%" ></td>
						</tr>
					</table>
				</c:when>
				<c:otherwise>
					<table align="center"  style="margin: 5px auto;" class="table-bordered">
						<%-- <tr>
							<td width="15%" style="text-align: center">A路额定电流:</td>
							<td width="30%" ><input class="easyui-textbox" type="text"
								id="ratedcurrenta" name="ratedcurrenta" data-options=""
								value="${rackPage.ratedcurrenta }"></input></td>
							<td width="15%" style="text-align: center">A路电源开关:</td>
							<td width="30%" ><input class="easyui-textbox" type="text" id="switcha"
								name="switcha" data-options="" value="${rackPage.switcha }"></input>
							</td>
						</tr>
						<tr>
		
							<td width="15%" style="text-align: center">A路电源相位:</td>
							<td width="30%" ><input class="easyui-textbox" type="text" id="phasea"
								name="phasea" data-options="" value="${rackPage.phasea }"></input>
							</td>
							<td width="15%" style="text-align: center">B路额定电流:</td>
							<td width="30%" ><input class="easyui-textbox" type="text"
								id="ratedcurrentb" name="ratedcurrentb" data-options=""
								value="${rackPage.ratedcurrentb }"></input></td>
						</tr>
						<tr>
							<td width="15%" style="text-align: center">B路电源开关:</td>
							<td width="30%" ><input class="easyui-textbox" type="text" id="switchb"
								name="switchb" data-options="" value="${rackPage.switchb }"></input>
							</td>
							<td width="15%" style="text-align: center">B路电源相位:</td>
							<td width="30%" ><input class="easyui-textbox" type="text" id="phaseb"
								name="phaseb" data-options="" value="${rackPage.phaseb }"></input>
							</td>
							
						</tr> --%>
						<tr>
							<td width="15%" style="text-align: center">列头柜电力容量:</td>
							<td width="30%" ><input class="easyui-numberbox" type="text" id="rowcabinetpower"
								name="rowcabinetpower" data-options="min:0, precision:0" value="${rackPage.rowcabinetpower }"></input>
							</td>
							<td width="15%" style="text-align: center">机架电力容量:</td>
							<td width="30%" ><input class="easyui-numberbox" type="text"
								id="rackpower" name="rackpower" data-options="min:0, precision:0"
								value="${rackPage.rackpower }"></input></td>
						</tr>
						<tr>
							<td style="text-align: center" >电流(A):</td>
							<td  ><input class="easyui-numberbox" type="text"
									id="electricity" name="electricity" data-options="min:0,precision:2"
									value="${rackPage.electricity }"></input></td>
							<td  style="text-align: center">电压(V):</td>
							<td  >
							<input class="easyui-numberbox" type="text"
									id="electricvoltage" name="electricvoltage" data-options="min:0,precision:2"
									value="${rackPage.electricvoltage }"></input></td>
						</tr>
						<tr>
							<td  style="text-align: center">功率(KW):</td>
							<td>
								<input class="easyui-numberbox" type="text"
									id="electricpower" name="electricpower" data-options="min:0,precision:2"
									value="${rackPage.electricpower }"></input></td>
						</tr>
					</table>
				</c:otherwise>
			</c:choose>
		</fieldset>
		<fieldset style="border-color:#F7F7F7;margin: 15px 15px " >
	        <legend>机架资产信息 </legend>
	        <c:choose>
				<c:when test="${pageType=='query' }">
					<table align="center"  style="margin: 5px auto;text-align: center" class="table-bordered">
						<tr>
							<td width="15%" >固定资产编号:</td>
							<td width="30%" >${rackPage.assetCode }</td>
							<td width="15%" style="border:none;"></td>
							<td width="30%" style="border:none;" ></td>
							
						</tr>
					</table>					
				</c:when>
				<c:otherwise>
					<table align="center"  style="margin: 5px auto;" class="table-bordered">
						<tr>
							<td width="15%" style="text-align: center">固定资产编号:</td>
							<td width="30%" ><input class="easyui-textbox" type="text" name="assetCode"
								id="assetCode" data-options="" value="${rackPage.assetCode }"></input>
							</td>
							<td width="15%" style="border:none;"></td>
							<td width="30%" style="border:none;" ></td>
							
						</tr>
					</table>
				</c:otherwise>
			</c:choose>
		</fieldset>
		<c:if test="${show==null && pageType !='query' }">
		<div id="dlg-buttons" style="text-align: center;">
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-ok" onclick="save()" style="width:90px">保存</a> 
				<c:if test="${rackPage.id==null }">
			        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-undo" onclick="doFormReSet()" style="width:90px">重置</a>
		        </c:if>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-cancel" onclick="doFormCancel()" style="width:90px">取消</a>
		</div>
		</c:if>
	</form>
</body>
</html>