var map = null;
var graphicLayer = null;
var mapDraw = null;
var orgCircle = null;
var myDrawingManagerObject = null
var playPath = null;
var ticketMarker = null; 
var currentCircle = null;
var sideForm = new SideForm();
var mainSearch = new MainSearch();
var circle;
var featureLayer;
var userLayer;
var ticketLayer;
function main(){
	//加载地图
	dojo.require("esri.map");
	dojo.require("esri.Color");
	dojo.require("esri.geometry.Point");	
	dojo.require("esri.graphic");
	dojo.require("esri.toolbars.draw");
	dojo.require("esri.symbols.PictureMarkerSymbol");
	dojo.require("esri.symbols.SimpleFillSymbol");	
	dojo.require("esri.symbols.SimpleLineSymbol");
	dojo.require("esri.symbols.CartographicLineSymbol");
	dojo.require("esri.dijit.Scalebar");
	dojo.require("esri.dijit.OverviewMap");
	dojo.require("esri.layers.GraphicsLayer");	
	dojo.require("esri.geometry.Polyline");
	dojo.require("esri.SpatialReference");
	
	dojo.require("esri.config");
	dojo.require("esri.layers.FeatureLayer");
	dojo.require("esri.InfoTemplate");
	dojo.require("esri.renderers.SimpleRenderer");
	dojo.require("esri.tasks.query");
	dojo.require("esri.geometry.Circle");
	dojo.require("esri.SpatialReference");
	dojo.require("esri.geometry.Extent");
  dojo.addOnLoad(init);
	mainSearch.init();
}
function init() {
	map = new esri.Map("allmap", {
					//basemap: "streets",
					wrapAround180: true,
					center: [106.556, 29.566],//重庆
				    zoom: 12
				});
	    
	var myTiledMapServiceLayer = new esri.layers.ArcGISTiledMapServiceLayer("http://cache1.arcgisonline.cn/ArcGIS/rest/services/ChinaOnlineCommunityOnlyENG/MapServer");
	map.addLayer(myTiledMapServiceLayer);	
	graphicLayer = new esri.layers.GraphicsLayer();
	map.addLayer(graphicLayer);
	map.on("load", function(evt){
    	initCirclePainter(map);
    	LayerManage();
    });
    var scalebar = new esri.dijit.Scalebar({
          map: map,
          attachTo: "bottom-center",
          scalebarUnit: "dual"
        });
    var overviewMapDijit = new esri.dijit.OverviewMap({
          map: map,
          attachTo: "bottom-right",
          visible: true
        });
    overviewMapDijit.startup();
    overviewMapDijit.hide();
	//drawPath();
	queryFeatureLayer();		
}

function queryFeatureLayer(){
	esri.config.defaults.io.proxyUrl = "/proxy/";
	featureLayer = new esri.layers.FeatureLayer("http://199.3.11.20:6080/arcgis/rest/services/MyUserService/MapServer/0",{
          outFields: ["USER_ID","TIME"]
        });
    var symbol = new esri.symbol.PictureMarkerSymbol("./img/Img_green.png", 35, 37);
    featureLayer.setSelectionSymbol(symbol); 
    featureLayer.on("mouse-over", function(evt){
    	if(evt.graphic.symbol)
    		showUserDetail(evt);
    });
    featureLayer.on("click", function(evt){
    	if(evt.graphic.symbol)
    		drawPath();
    });
    var nullSymbol = new esri.symbol.PictureMarkerSymbol().setWidth(0);
    featureLayer.setRenderer(new esri.renderer.SimpleRenderer(nullSymbol));
    map.addLayer(featureLayer);        
}

function drawPath(){
	if(playPath != null){
		playPath.setMap(null);
	}	
	graphicPathLayer = new esri.layers.GraphicsLayer();
	map.addLayer(graphicPathLayer);
	var url = "./data/path1.txt";
	getData(url,function(json){
		var locations = json.result.jsondata.location;
		var points = new Array();
		for(var i = 0; i < locations.length; i++){
			var point = new esri.geometry.Point(locations[i].lng, locations[i].lat, new esri.SpatialReference({ wkid: 4326 }));
			points.push(point);
		}
		var offset = {x:0, y:18};
		playPath = new PlayPath(points, {url:"./resource/images/dot.png", width:24, height:36, offset:offset}, "", 100);
		playPath.setMap(map);
		playPath.startPlay();
	});
}
function graphicsClickEvent(evt){
	if(evt.graphic.type == "ticket"){
		showTicketDetail(evt);
	}
	//if(evt.graphic.type == "user"){
	//	showUserDetail(evt);
	//}
}
function showTicket(data){	
	if(currentCircle)
		graphicLayer.remove(currentCircle);
	var point = new esri.geometry.Point(data.lng, data.lat, new esri.SpatialReference({ wkid: 4326 }));
    if(!ticketMarker){		
		var markerSymbols = new esri.symbol.PictureMarkerSymbol("./resource/images/dot.png", 24, 36);
		ticketMarker = new esri.Graphic(point, markerSymbols);
		graphicLayer.add(ticketMarker);
	}else{
		ticketMarker.setGeometry(point);
	}	
	ticketMarker.type = "ticket";
	ticketMarker.selfData = data;
	map.centerAt(point);
	clearUserMarkers();
	//map.disableMapNavigation();
	mapDraw.activate(esri.toolbars.Draw.CIRCLE);
	map.setMapCursor("crosshair");
    return;	
}

function showUserTaskInfo(loginName, sideForm){
	url = "./main/queryUserTaskList.gis?loginName="+loginName;
	getData(url,function(data){			
		if(data.status != "200 OK" || data.dataInfo.length < 1){
			if(sideForm.userTaskInfoD){
				sideForm.userTaskInfoD.remove();
			}
			return;
		}	
		var tmpl = template(function(){
			/*
			<div style="max-height:150px; overflow-y:auto;">
				<table class="table table-hover table-bordered">
					<tr>
	    				<th>BusinessType</th>
	    				<th>Working Sheet Code</th>
	    				<th>Task Sheet Code</th>
	    				<th>Working Hour</th>
	  				</tr>			  
					<<for(var i = 0 ,len = this.length ; i<len ; i++){>>
					<tr>
						<<if(this[i].businessId == "0001024"){>>				
					    	<td>Trouble Tickets</td>
					    	<td><a href="javascript:top.addNewTab('<<this[i].bilId>>', '<<'/ida40/module/sa/page/detail/billMainDetail.xhtml?billId='+this[i].bilId>>', '<<this[i].billSn>>')"><<this[i].billSn>></a></td>	
					    <<}else{>>
					    	<td>Open Tickets</td>
					    	<td><a href="javascript:top.addNewTab('<<this[i].bilId>>', '<<'/ida40/module/open/page/exterior/exteriorTransferDetail.xhtml?billIdParam='+this[i].bilId>>', '<<this[i].billSn>>')"><<this[i].billSn>></a></td>
					   	<<}>>				    	
					    <td><<this[i].taskSn>></td>
					    <td><<this[i].billLimit>>m</td>	
					</tr>			  
		          	<<}>>	          
				</table>
			</div>
			*/
		});
		var html = templateEngine(tmpl,data.dataInfo);
		if(sideForm.userTaskInfoD){
			sideForm.userTaskInfoD.remove();
		}
		sideForm.userTaskInfoD = dialog({
	    									title: 'Working Hour Task List',
	    									content: html,
	    									cancelValue: 'cancel',
	    									cancel: function () {}
										});		
		sideForm.userTaskInfoD.show();
	});
}

//控制右侧表单
function SideForm(){
	var self = this;
	this.statu = 0;
	this.bill = "";
	//this.target = $("#sideForm");
	this.operatorHeight = (function(){
		var h = $("body")[0].offsetHeight;
		h = h - 250;
		return h;
	})();
	this.target = (function(){
		var html = template(function(){
			/*
		      <div id="sideForm">
		        <div class="navbar">
		          <div class="navbar-inner">
		            <a href="javascript:;" class="close">&times;</a>
		            <a class="brand title" href="javascript:;">--</a>
		          </div>
		        </div>
		        <div class="list-warpper">
		          <span class="muted">Chose a person:</span>
		          <div class="list" style="overflow-y:auto;">
		            <div class="alert">Being loaded data...</div>
		          </div>
		          <span class="muted">remark:</span>
		          <textarea rows="3" name="remark"></textarea>
		          <button class="btn btn-large btn-block btn-submit" type="button">submit</button>
		        </div>
		      </div>
			*/
		});
		return $(html).appendTo("body");
	})();
	this.list = $("#sideForm .list");
	this.target.find(".list").css("height",this.operatorHeight);
	this.target.find(".close").bind("click",function(){
		self.close();
	});
	this.target.find(".btn-submit").bind("click",function(){
		self.submit();
	});	
	this.target.delegate(".media .label-amount","click",function(event){
		var loginName = $(this).context.id;
		showUserTaskInfo(loginName, self);		
		if(typeof(event.stopPropagation)==="function"){
			event.preventDefault()
		}else{
			window.event.returnValue = false
		}
		
	});
};
SideForm.prototype.submit = function(){
	var loginName = this.target.find("[name=loginName]:checked").val();
	var remark = this.target.find("[name=remark]").val();
	var bill = this.bill;
	dispatchBill(this.business_id, loginName, remark, this.bill);
};
SideForm.prototype.open = function(userData,bussinessData){
	var self = this;
	var businessId = bussinessData.deal_code;
	this.business_id = bussinessData.business_id;
	this.bill = bussinessData.ticket_id;
	this.target.fadeIn("fast",function(){
		self.statu = 1;
		self.target.find(".title").text(businessId);
		self.draw(userData.dataInfo);
	});
};
SideForm.prototype.close = function(json){
	this.statu = 0;
	this.target.fadeOut("fast");
	clearUserMarkers();
	map.disableMapNavigation();
	mapDraw.activate(esri.toolbars.Draw.CIRCLE);
	map.setMapCursor("crosshair");
	if(playPath != null){
		playPath.setMap(null);
	}
	if(this.userTaskInfoD){
		this.userTaskInfoD.remove();
	}
};
SideForm.prototype.draw = function(json){
		var tmpl = template(function(){
			/*
			<<for(var i = 0 ,len = this.length ; i<len ; i++){>>
	          <label class="media">
	            <div class="pull-left">
	               <input type="hidden" name="operator" value="<<this[i].mobile>>" />
	               <input type="radio" name="loginName" value="<<this[i].loginName>>"/>
	            </div>
	            <div class="media-body">
	              <div class="pull-right">
	            		<span class="label label-amount" title="Bill Amount" id="<<this[i].loginName>>"><i class="icon-white icon-tasks"></i> <<this[i].taskNum>></span>
	              </div>
	              <h4 class="media-heading"><<this[i].userName>></h4>
	              <p class="muted" title="Contactor Phone"><i class="icon icon-comment"></i> <<this[i].mobile>></p>
	              <p class="muted" title="Distance"><i class="icon icon-resize-horizontal"></i> <<this[i].distance>></p>
	            </div>
	          </label>
	          <<}>>
			*/
		});
		var html = templateEngine(tmpl,json);
		var target = $("#sideForm .list");
		target.empty().append(html);		
		return false;
}

//控制图层管理
var LayersVisible = {user: false, ticket: false};
function LayerManage(){
	userLayer = new esri.layers.ArcGISDynamicMapServiceLayer("http://199.3.11.20:6080/arcgis/rest/services/MyUserService/MapServer");
	ticketLayer = new esri.layers.ArcGISDynamicMapServiceLayer("http://199.3.11.20:6080/arcgis/rest/services/MyPubTicketService/MapServer");
	$("body").delegate(".layerMG","click",function(evt){		
		var self = this;
		var content = "<form action=''>"+
							"<input type='checkbox' value='user' checked=ture class='layer'/>"+
							"user"+
							"<br />"+
							"<input type='checkbox' value='ticket' checked=ture class='layer'/>"+
							"ticket"+
						"</form>";
		var d = dialog({
			align: 'top left',
			content: content,
			quickClose: true
		})
		d.addEventListener("show", function(){
			dialogShow.apply(self, []);
			var domElem = this.node;
			$(domElem).delegate("[type=checkbox]","click",function(){
				onlyCheckOne.apply(self,[this]);
			});
		});		
		d.show(this);		
	});
}

function dialogShow(){
			var list = $('.layer');
			for(var i = 0; i < list.length; i++){
				$(list[i]).attr("checked", LayersVisible[$(list[i]).val()]);
			}
		}

function onlyCheckOne(obj){
	var self = this;
	var objValue = $(obj).val();
	//按复选框的变动修改展示的图层
	if($(obj).attr("checked") == "checked"){
		//图层可见
		if(objValue == "user"){
			LayersVisible.user = true;
			map.addLayer(userLayer);
		}else{
			LayersVisible.ticket = true;
			map.addLayer(ticketLayer);
		}
	}else{
		//图层不可见
		if(objValue == "user"){
			LayersVisible.user = false;
			map.removeLayer(userLayer);
		}else{
			LayersVisible.ticket = false;
			map.removeLayer(ticketLayer);
		}
	}
};
//图层管理结束

//控制工单列表
function MainSearch(){
	this.datasetId = "pub_ticket_v"; 
	this.keyword = "";
	this.whereClause = ""; 
	this.geoType = "6"; 
	this.geometry = "";
	this.currPage = 0;
	this.pageSize = 8;
	this.pageCount = 0;
	this.target = $("#bar .list");
	this.pagination = $(".pagination");
}
MainSearch.prototype.search = function(){
	this.keyword = $(".keyword").val()
	this.init(1)
	return false
};
MainSearch.prototype.init = function(page){
	var self = this;
	this.currPage = page || 1;	
	var params = new QueryParam();
	params.startRecord = (this.currPage - 1) * this.pageSize;
	params.expectRecord = this.pageSize;
	var queryLayerParam = new QueryLayerParam();
	queryLayerParam.datasetId = this.datasetId;
	if(this.keyword){
		queryLayerParam.whereClause = "deal_code = '" + this.keyword + "'";
	}else{
		queryLayerParam.whereClause = this.whereClause;
	}
	params.queryLayerParams.push(queryLayerParam);	
	//var url = "./SpatialQueryAction.do?method=rectQuery&params=" + JSON.stringify(params);
	URL = "/data/工单数据.txt";
	SpatialQuery(url, this.currPage, this.pageSize, function(json){
	//getData(url,function(json){
		//json = json.result.jsondata;
		self.pageCount = json.pageCount;
		self.draw(json.results,self.target);
		self.setPageSize();
	});
	$("body").delegate(".btn-search","click",function(){
		mainSearch.search();
	})
	//$("body").delegate(".keyword","keyup",function(){
	//	mainSearch.search();
	//})
};
MainSearch.prototype.draw = function(json,target){
	var tmpl = template(function(){
		/*
          <div class="media">
            <div class="pull-left">
              <img class="media-object" src="./resource/images/dot.png">
            </div>
            <div class="media-body">
            	<div class="pull-right">
	              <<if(this.business_id == "0001024"){>>
	              	<span class="label label-info">saBill</span>
	              <<}else{>>
	              	<span class="label label-success">openBill</span>
	              <<}>>
	         	</div>
	         	<br>
	         	<div class="pull-right">	              
	              <<if(this.bill_status == "Processing"){>>
	              	<span class="label label-info">Waiting Dispatch</span>
	              <<}else{>>
	              	<span class="label label-success">Processing</span>
	              <<}>>
            	</div>
              <h4 class="media-heading"><<this.deal_code>></h4>
              <p class="muted" title="Contactor"><i class="icon icon-user"></i> <<this.user_link_man>></p>
              <p class="muted" title="Contactor Phone"><i class="icon icon-comment"></i> <<this.user_link_phone>></p>
              <p class="muted" title="Bill Serial Number"><i class="icon icon-file"></i> <<this.bill_sn>></p>
            </div>
          </div>
		*/
	});
	target.empty();
	if(!json){
		return target;
	}		
	//json.forEach(function(row){
	for(var i =0 ; i < json.length ; i++){
   		var row = json[i];
		var html = templateEngine(tmpl,row);
		(function(row,html){
			$(html).appendTo(target).bind("click",function(){
				target.find(".active").removeClass("active");
				$(this).addClass("active");
				showTicket(row);
				sideForm.close();
			});
		})(row,html)		
	};
	return target;
}
MainSearch.prototype.setPageSize = function(){
	var self = this;
	this.pagination.attr("currentpage",this.currPage)
	this.pagination.attr("pagecount",this.pageCount)
	this.pagination.pageSize(function(iPage){
			self.init(iPage);
	});
}

//单击工单，显示工单详细信息  障碍单：method = 1；开通单：method = 2
function showTicketDetail(e){
	var method = "2";
	var taskId = "9999";
	if(e.graphic.selfData.business_id == "0001024"){
		method = "1";
		taskId = "";
	}
	var url="./main/queryTicketDetail.gis?method="+method+"&billId="+e.graphic.symbol.selfData.ticket_id+"&taskId="+taskId;
	//url = "/data/ticketDetail.txt"
	getData(url,function(data){		
		addInfoWindow(e.graphic, data.dataInfo);
	});
}
//method, operateWay, operateSrc, loginName, nextOperator, nextOperatorUnitId, remark, billId
function dispatchBill(businessId, loginName, remark, billId){
	var method = "2";
	if(businessId == "0001024")
		method = "1";
	var operateWay = "GIS";
	var operateSrc = "IDA";
	var nextOperator = loginName;
	var nextOperatorUnitId = "";
	var url="./main/dispatch.gis?method="+method+"&operateWay="+operateWay+"&operateSrc="+operateSrc
			+"&loginName="+loginName+"&nextOperator="+nextOperator+"&nextOperatorUnitId="+nextOperatorUnitId
			+"&remark="+remark+"&billId="+billId;
	//alert(url);
	getData(url,function(data){
		if(data.status == "200 OK"){
			dialogTemp("dispatched ok!");
			mainSearch.init();
			sideForm.close();
			myDrawingManagerObject.close();
			map.clearOverlays();
			ticketMarker = null;
		}else{
			dialogTemp("dispatched fault!");
		}		
	});
}

function getInfoHTML(data){
		var html = "";
		//故障单详情模板
		if((data.billType != undefined) && data.billType == "snBill"){
			html = template(function(){
				/*
					<p>account info：<<this.dealCode>></p>
					<p>business type：snBill</p>
					<p>Bill Serial Number：<<this.billSn>></p>					
					<p>contact：<<this.customerName>></p>
					<p>contact number：<<this.userLinkPhone>></p>					
					<p>Reservation start time：<<this.bookingBeginTime>></p>
					<p>Reservation end time：<<this.bookingBeginTime>></p>
					<p>specialty type：<<this.specialtyIdLabel>></p>
					<p>city area：<<this.bureauName>></p>
					<p>address：<<this.contactAddr>></p>
				*/
			});
			html = templateEngine(html,data);
		//开通单情况
		}else if ((data.billType != undefined) && data.billType == "openBill"){
			html = template(function(){
				/*
					<p>account info：<<this.serviceNo>></p>
					<p>business type：openBill</p>
					<p>Bill Serial Number：<<this.billSn>></p>
					<p>contact：<<this.linkMan>></p>
					<p>contact number：<<this.linkPhone>></p>
					<p>Reservation start time：<<this.bookStartTime>></p>					
					<p>Reservation end time：<<this.bookEndTime>></p>
					<p>specialty type：<<this.specialtyName>></p>					
					<p>city area：<<this.bureauName>></p>					
					<p>address：<<this.instAddr>></p>
				*/
			});
			html = templateEngine(html,data);
		//人员信息
		}else{
			html = template(function(){
				/*
					<p>Operator：<<this.userName>></p>
					<p>department：<<this.bureauId>></p>
					<p>Mobile Phone：<<this.mobile>></p>
					<p>skill：<<this.remark>></p>
				*/
			});
			html = templateEngine(html,data);
		}
		return html;
	};
	
//###########################
	//弹出信息窗
	//###########################
	function addInfoWindow(graphic,data,offset){			
			var html = getInfoHTML(data);
			var title = data.billType || "user" + "detail"
			map.infoWindow.setTitle(title);
			map.infoWindow.setContent(html);
			map.infoWindow.resize(350, 200);
			map.infoWindow.show(graphic.geometry);
			//var  infoTemplate = new esri.InfoTemplate(title, html);
			//graphic.setInfoTemplate(infoTemplate);		
	}

//工号查工作量
function queryUserTaskNum(loginNames, callback){
	var url="./main/queryUserTaskNum.gis?loginNames="+loginNames; 
	//url = "/data/userTicketData.txt";
	getData(url,callback);
}

function showUserDetail(e){
	var url="./main/getUserInfo.gis?userId="+e.graphic.attributes.USER_ID;
	//url = "./data/userDetail.txt";
	getData(url,function(data){					
		addInfoWindow(e.graphic, data.dataInfo);
	});
}

function showUserPath(e){	
	playPath.setMap(null);	
	var p1 = new BMap.Point(106.555606, 29.555761, new esri.SpatialReference({ wkid: 4326 }));
	var p2 = new BMap.Point(e.target.point.lng, e.target.point.lat, new esri.SpatialReference({ wkid: 4326 }));	
	var url="./main/getDriverPath.gis?origin=29.555761,106.555606"+"&destination="+e.target.point.lat+","+e.target.point.lng+
			"&origin_region=重庆&destination_region=重庆";
	var points = new Array();
	getData(url,function(data){	
		var dataArr = data.split(";");
		for(var i = 0; i < dataArr.length; i++){
			var pointArr = dataArr[i].split(",");
			var point = new BMap.Point(pointArr[0], pointArr[1], new esri.SpatialReference({ wkid: 4326 }));
			points.push(point);
		}
		playPath.setPoints(points);
		playPath.setMap(map);
		playPath.startPlay();
	});
}

function getRoatResult(e){
	var path = e[0].getPath();
	var polyLine = e[0].getPolyline();
	var steps = new Array();
	for(var i = 0; i < e[0].getNumSteps(); i++){
		steps.push(e[0].getStep(i));
	}
	playPath.hideLine = polyLine;
	playPath.steps = steps;
	playPath.setPoints(path);
	playPath.setMap(map);
	playPath.startPlay();
}

function clearUserMarkers(){
	featureLayer.clearSelection();
	if(map.infoWindow.isShowing)
		map.infoWindow.hide();	
}

function getData(url,callback){
		$.ajax({
			url :url,
			data :"",
			success :function(data){
				if(typeof(data)==="string"){
					try{
						//data = JSON.parse(data);						
						data = (new Function("return "+data))();						
					}catch(e){
						alert(url + " says " + e.message);
					}
				}else{
					data = data.result.jsondata;
				}				
				callback && callback(data);
			},
			error :function(){
				//console.log(arguments)
				alert("To get the data anomalies！")
			}
		});
	};

function addGraphic(evt){
    var fillSymbol = new esri.symbol.SimpleFillSymbol(esri.symbol.SimpleFillSymbol.STYLE_SOLID,
						    new esri.symbol.SimpleLineSymbol(esri.symbol.SimpleLineSymbol.STYLE_SOLID,
						    new esri.Color([255,0,0]), 2),new esri.Color([255,255,0,0.25])
						  );
	var circle = new esri.Graphic(evt.geometry, fillSymbol);
	graphicLayer.remove(orgCircle);
	currentCircle = circle;
	orgCircle = circle;
    graphicLayer.add(circle);
    var query = new esri.tasks.Query();
    query.geometry = evt.geometry.getExtent();
    featureLayer.queryFeatures(query, selectInBuffer);
}
function selectInBuffer(response){
    var features = response.features;
    var inBuffer = [];
    for (var i = 0; i < features.length; i++) {
   		feature = features[i];
     	if(currentCircle.geometry.contains(features[i].geometry)){
         	inBuffer.push(features[i].attributes[featureLayer.objectIdField]);
       	}
   	}
  	var query = new esri.tasks.Query();
	query.objectIds = inBuffer;
    featureLayer.selectFeatures(query, esri.layers.FeatureLayer.SELECTION_NEW, function(results){
        if(results.length > 0){
        	var loginNames = "";
    		var center = ticketMarker.geometry;
    		for(var i =0; i < results.length; i++){
    			var lng = results[i].geometry.getLongitude();
    			var lat = results[i].geometry.getLatitude();
    			var length = (Math.sqrt((lng - center.x)*(lng - center.x) + 
    						(lat - center.y)*(lat - center.y)))*97868;
		    	length = length.toFixed(1);
		    	results[i].attributes.length = length;
		    	if(i == 0){
		    		loginNames = results[i].attributes.USER_ID;
		    	}else{
		    		loginNames = loginNames + "," + results[i].attributes.USER_ID;
		    	}		    		
    		}  
    		map.enableMapNavigation();
			mapDraw.deactivate();
			map.setMapCursor("default");
    		//renderUser(result);
			
			console.log(loginNames.split(",").length);
    		queryUserTaskNum(loginNames, function(userInfo){
    			bubbleSort(results);
    			console.log(results);
    			console.log(userInfo);
    			manageUserData1(results, userInfo);
    			sideForm.open(userInfo,ticketMarker.selfData);
    			//alert(userInfo);
    		});
        }else{
    		alert("No personnel in this area！");
    	}
    })  
}

function initCirclePainter(map){
	mapDraw = new esri.toolbars.Draw(map);	
    mapDraw.on("draw-complete", addGraphic);        
}

function bubbleSort(userGis){  
    for(var i = 0 ; i < userGis.length-1; i++) {  
        for(var j = 0; j < userGis.length-1-i; j++) {  
            if(parseInt(userGis[j].attributes.length) > parseInt(userGis[j+1].attributes.length))  
            {  
                var tmp = userGis[j].attributes.length; 
                userGis[j].attributes.length = userGis[j+1].attributes.length;  
                userGis[j+1].attributes.length = tmp;  
            }  
        }  
    }  
}  
//整理数用户数据，将距离加入
function manageUserData(userGis, userInfo){
	var center = ticketMarker.geometry;
	var dataInfo = new Array();
	for(var i = 0; i < userGis.length; i++){
		for(var j = 0; j < userInfo.dataInfo.length; j++){
			if(userInfo.dataInfo[j].loginName == userGis[i].attributes.USER_ID){
		    	dataInfo[i] = userInfo.dataInfo[j];
		    	dataInfo[i].distance = userGis[i].attributes.length;
			}
		}
	}	
	delete userInfo.dataInfo;
	userInfo.dataInfo = dataInfo;
}

//整理数用户数据，将距离加入
function manageUserData_bak(userGis, userInfo){
	var center = ticketMarker.geometry;
	for(var i = 0; i < userInfo.dataInfo.length; i++){
		for(var j = 0; j < userGis.length; j++){
			if(userInfo.dataInfo[i].loginName == userGis[j].attributes.USER_ID){
		    	userInfo.dataInfo[i].distance = userGis[j].attributes.length;
			}
		}
	}
}

function dialogTemp(message){
	var d = dialog({
	    title: 'message',
	    width: 400,
	    content: message,
	    ok: function () {}
	});
	d.show();
}

function template(tmpl) {
	var regEx = new RegExp("/\\*([\\S\\s]*)\\*/", "mg");
	tmpl = tmpl + "";
	var matches = tmpl.match(regEx) || [];
	var result = [];
	for (var i = 0; i < matches.length; i++) {
		result.push(matches[i].replace(regEx, "$1"));
	}
	return result.join("");
};
function templateEngine(html, options){
	var re = /<<([^>>]+)?>>/g, reExp = /(^( )?(if|for|else|switch|case|break|{|}))(.*)?/g, code = 'var r=[];\n', cursor = 0;
	var add = function(line, js) {
		js? (code += line.match(reExp) ? line + '\n' : 'r.push(' + line + ');\n') :
			(code += line != '' ? 'r.push("' + line.replace(/"/g, '\\"') + '");\n' : '');
		return add;
	}
	while(match = re.exec(html)) {
		add(html.slice(cursor, match.index))(match[1], true);
		cursor = match.index + match[0].length;
	}
	add(html.substr(cursor, html.length - cursor));
	code += 'return r.join("");';
	return new Function(code.replace(/[\r\t\n]/g, '')).apply(options);
}

QueryParam = function(){
    this.queryParameter = "";
    this.queryLayerParams = new Array();
    this.startRecord = 0;
    this.expectRecord = 30;
};

QueryLayerParam = function(){
    this.datasetId = "";
    this.selectClause = "";
    this.groupClause = "";
    this.sortClause = "";
    this.whereClause = "";
    this.returnCount = 1;
};
function SpatialQuery(url, currPage, pageSize, callback){
	$.ajax({
			url :url,
			data :"",
			success :function(resultSet){
				if(typeof(data)==="string"){					
					try{
						//data = JSON.parse(data);						
						data = (new Function("return "+data))();						
					}catch(e){
						alert(url + " says " + e.message);
					}
				}
				if (resultSet.totalCount > 0 && resultSet.recordSets) {
					resultSet.status = 0;
					resultSet.total = resultSet.totalCount;
		            for(var i = 0; i < resultSet.recordSets.length; i++) {
		                var recordset = resultSet.recordSets[i];
		                var returnFieldCaptions = recordset.returnFieldCaptions;
		                var records = recordset.records;
		                for(var j = 0; j < records.length; j++) {
		                    for(var k = returnFieldCaptions.length-1; k >= 0; k--) {
		                        records[j][returnFieldCaptions[k].toLowerCase()] = records[j].fieldValues.pop();
		                        if (returnFieldCaptions[k] === "GEOMETRY" && (typeof records[j][returnFieldCaptions[k]] === "string")) {
		                            records[j][returnFieldCaptions[k].toLowerCase()] = eval('(' + records[j][returnFieldCaptions[k]] + ')');
		                        }
		                    }
		                    delete records[j].fieldValues;
		                    records[j].datasetId = recordset.datasetId;
		                }
					}
					delete recordset.returnFieldCaptions;
					resultSet.results = resultSet.recordSets[0].records;
					resultSet.dataset = resultSet.recordSets[0].datasetId;
					resultSet.pageCount = Math.ceil(resultSet.totalCount/ pageSize);
		        }else{
		        	resultSet.results = null;
		        	resultSet.pageCount = 0;
		        }
		        resultSet.status = 0;
				resultSet.total = resultSet.totalCount;				
				delete resultSet.recordSets;
				delete resultSet.totalCount;
				delete resultSet.currentCount;
				resultSet.message = "ok";
				resultSet.pageSize = pageSize;				
				resultSet.currentPage = currPage;				
		        //console.log(resultSet);
				callback && callback(resultSet);
			},
			error :function(){
				//console.log(arguments)
				alert("To get the data anomalies！")
			}
		});
}