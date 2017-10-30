<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="com.ccssoft.rsas.pwb.portal.model.PdwPortalLayout" %>
<%@ page import="com.ccssoft.rsas.pwb.portal.model.PdwPortalLayoutPanel" %>
<%@ page import="com.ccssoft.rsas.pwb.portal.model.PdwPortalPortletRelation" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Portal - jQuery EasyUI</title>
<% 
PdwPortalLayout pdwPortalLayout=null;
List<PdwPortalLayoutPanel> portalLayoutPanelLst=null;
List<PdwPortalPortletRelation> pdwPortalPortletRelationLst=null;
Map<String,Object> results = (Map<String,Object>)request.getAttribute("results");
if(results!=null){
    pdwPortalLayout=(PdwPortalLayout)results.get("pdwPortalLayout");
    portalLayoutPanelLst=(List<PdwPortalLayoutPanel>)results.get("portalLayoutPanelLst");
    pdwPortalPortletRelationLst=(List<PdwPortalPortletRelation>)results.get("pdwPortalPortletRelationLst");
}%>
<%@ include file="/pwb/common/jsp/easyUIincluded.inc" %> 
	<style type="text/css">
		.title{
			font-size:16px;
			font-weight:bold;
			padding:20px 10px;
			background:#eee;
			overflow:hidden;
			border-bottom:1px solid #ccc;
		}
		.t-list{
			padding:5px;
		}
		.tt-inner{
			display:inline-block;
			line-height:12px;
			padding-top:5px;
		}
		.img_main{
			padding-top:6px;
			border:0;
		}
		.img_gray{
				    padding:5px;
					vertical-align: middle;
				    border:0;
				    margin-top: 5px;
					 /*
				    -webkit-filter: grayscale(100%); 
			        -moz-filter: grayscale(100%); 
                    -ms-filter: grayscale(100%); 
                    -o-filter: grayscale(100%); 
                    filter: grayscale(100%); 
                    filter: gray; 
					*/
		 }
		 .img_color{
				    padding:5px;
					 vertical-align: middle;
				     border:0;
				     margin-top: 5px;
				     -webkit-filter: grayscale(0%); 
			        -moz-filter: grayscale(0%); 
                    -ms-filter: grayscale(0%); 
                    -o-filter: grayscale(0%); 
                    filter: grayscale(0%); 
                    filter: none; 
                    /* For IE 8 */
                    -ms-filter: "progid:DXImageTransform.Microsoft.Shadow(Strength=4, Direction=135, Color='#000000')";
                    /* For IE 5.5 - 7 */
                    filter: progid:DXImageTransform.Microsoft.Shadow(Strength=4, Direction=135, Color='#000000');
					
		} 
	</style>
     <script type="text/javascript" src="<%=request.getContextPath()%>/pwb/common/easyui/jquery.portal-extend.js"></script>

	 <script src="<%=request.getContextPath()%>/pwb/common/echarts/dist/echarts.js"></script>
	<script>
	$(function(){
		$('#pp').portal({
			border:false,
			fit:true

		});
		//add();
		//chartsDragInPortalLayout("#horizontalBar","#horizontalBar_1","#pp");
		//chartsDragInPortalLayout("#bar","#bar_1","#pp");	
	});
	</script>
</head>
<body class="easyui-layout">

	   <div id="mm" class="easyui-menu">
			<div>图表设置</div>
			<div>数据源设置</div>
			<div data-options="iconCls:'icon-search'">搜索</div>
			<div>帮助</div>
		</div>
		<!--顶部区域开始-->
		<div  data-options="region:'north',border:false" class="title" border="false" style="    height: 40px; background-color: #293c55;color: white;padding:0px;">
			<img src="images/wolft.png" style="height:40px;margin-left: 20px;
	    margin-right: 10px;float: left"/><span    style=" POSITION: absolute;
	    top: 10px;
	    left: 40px;">图表布局设计器</span> <div style="padding-left: 200px;padding-top: 8px;">
			<a href="#" onclick="addPanel()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a>
			
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save'">保存</a>
	
		</div>
		</div>
	
	
	<!--中部面区域开始 -->
	
	<div data-options="region:'center'" style="width:100%;height:100%; ">
				<div id="pp" fit="true" style="position:relative;height:100%;">
				<table id="portallayout" border="0" cellspacing="0" cellpadding="0" style="width:100%;height:100%;">
				
				<%for(int Layout=0;Layout<pdwPortalLayout.getLayoutRows().intValue();Layout++){%><tr>
				<%for(int row=1;row<=pdwPortalLayout.getLayoutRows().intValue();row++){
				    for(int i=0;i<portalLayoutPanelLst.size();i++){
					    if(row== portalLayoutPanelLst.get(i).getPanelRow().intValue()){%><td style="width:<%= portalLayoutPanelLst.get(i).getPanelWidth()%>;" class="portal-column-td" colspan="<%= portalLayoutPanelLst.get(i).getPanelColspns().intValue()%>" rowspan="<%= portalLayoutPanelLst.get(i).getPanelRowspns().intValue()%>">
					     <div  style="width:100%;">
					     	<%for(int panel=0;panel<pdwPortalPortletRelationLst.size();panel++){
                                 if(Integer.parseInt(pdwPortalPortletRelationLst.get(panel).getPanelId())==Integer.parseInt(portalLayoutPanelLst.get(i).getPanelId())){%>
                                    <div id="<%=pdwPortalPortletRelationLst.get(panel).getPortletInstanceId()%>" class="easyui-panel" title="My Panel" 
                                         style="width:500px;height:150px;padding:10px;background:#fafafa;"
                                         data-options="iconCls:'icon-save',closable:true,
                                         collapsible:true,tools:[{iconCls:'icon-edit',
						                 handler:function(e){ 
							             $('#portletConfig').window('open'); 
										 $('#portletConfig').attr('pbodyId','<%=pdwPortalPortletRelationLst.get(panel).getPortletInstanceId()%>');
									 }}]" >
                                         <p>panel content.</p>
                                         <p>panel content.</p>
                                   </div>
                                <%}}%> 
                         </div>
				         </td><%}}}%>
				</tr><%}%>
				
				</table>
				</div>
				</div>
	


</body>
</html>