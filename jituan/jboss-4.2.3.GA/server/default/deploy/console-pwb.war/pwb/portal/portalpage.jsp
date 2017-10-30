<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Portal - jQuery EasyUI</title>
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
	  // 路径配置
        require.config({
            paths: {
                echarts: '../../../echarts-2.2.7/echarts-2.2.7/echarts-2.2.7/build/dist'
            }
        });
        
        // 使用
        require(
            [
                'echarts',
                'echarts/chart/bar', // 使用柱状图就加载bar模块，按需加载
				'echarts/chart/line',
                'echarts/chart/bar',
				'echarts/chart/scatter',
				'echarts/chart/k',
				'echarts/chart/pie',
				'echarts/chart/radar',
				'echarts/chart/force',
				'echarts/chart/chord',
				'echarts/chart/gauge',
				'echarts/chart/funnel',
				'echarts/chart/eventRiver',
				'echarts/chart/venn',
				'echarts/chart/treemap',
				'echarts/chart/tree',
				'echarts/chart/wordCloud',
				'echarts/chart/heatmap',
				'echarts/chart/map'
            ],
            function (ec) {
                // 基于准备好的dom，初始化echarts图表
                var myChart = ec.init(document.getElementById('main')); 
				 var myChartx = ec.init(document.getElementById('main2')); 
               var  option = {
    backgroundColor: '#1b1b1b',
    color: ['gold','aqua','lime'],
    title : {
        text: '模拟迁徙',
        subtext:'数据纯属虚构',
        x:'center',
        textStyle : {
            color: '#fff'
        }
    },
    tooltip : {
        trigger: 'item',
        formatter: '{b}'
    },
    legend: {
        orient: 'vertical',
        x:'left',
        data:['北京 Top10', '上海 Top10', '广州 Top10','深圳 Top10'],
        selectedMode: 'single',
        selected:{
            '上海 Top10' : false,
            '广州 Top10' : false
        },
        textStyle : {
            color: '#fff'
        }
    },
    toolbox: {
        show : true,
        orient : 'vertical',
        x: 'right',
        y: 'center',
        feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: false},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    dataRange: {
        min : 0,
        max : 100,
        calculable : true,
        color: ['#ff3333', 'orange', 'yellow','lime','aqua'],
        textStyle:{
            color:'#fff'
        }
    },
    series : [
        {
            name: '全国',
            type: 'map',
            roam: true,
            hoverable: false,
            mapType: 'china',
            itemStyle:{
                normal:{
                    borderColor:'rgba(100,149,237,1)',
                    borderWidth:0.5,
                    areaStyle:{
                        color: '#1b1b1b'
                    }
                }
            },
            data:[],
            markLine : {
                smooth:true,
                symbol: ['none', 'circle'],  
                symbolSize : 1,
                itemStyle : {
                    normal: {
                        color:'#fff',
                        borderWidth:1,
                        borderColor:'rgba(30,144,255,0.5)'
                    }
                },
                data : [
                    [{name:'北京'},{name:'包头'}],
                    [{name:'北京'},{name:'北海'}],
                    [{name:'北京'},{name:'广州'}],
                    [{name:'北京'},{name:'郑州'}],
                    [{name:'北京'},{name:'长春'}],
                    [{name:'北京'},{name:'长治'}],
                    [{name:'北京'},{name:'重庆'}],
                    [{name:'北京'},{name:'长沙'}],
                    [{name:'北京'},{name:'成都'}],
                    [{name:'北京'},{name:'常州'}],
                    [{name:'北京'},{name:'丹东'}],
                    [{name:'北京'},{name:'大连'}],
                    [{name:'北京'},{name:'东营'}],
                    [{name:'北京'},{name:'延安'}],
                    [{name:'北京'},{name:'福州'}],
                    [{name:'北京'},{name:'海口'}],
                    [{name:'北京'},{name:'呼和浩特'}],
                    [{name:'北京'},{name:'合肥'}],
                    [{name:'北京'},{name:'杭州'}],
                    [{name:'北京'},{name:'哈尔滨'}],
                    [{name:'北京'},{name:'舟山'}],
                    [{name:'北京'},{name:'银川'}],
                    [{name:'北京'},{name:'衢州'}],
                    [{name:'北京'},{name:'南昌'}],
                    [{name:'北京'},{name:'昆明'}],
                    [{name:'北京'},{name:'贵阳'}],
                    [{name:'北京'},{name:'兰州'}],
                    [{name:'北京'},{name:'拉萨'}],
                    [{name:'北京'},{name:'连云港'}],
                    [{name:'北京'},{name:'临沂'}],
                    [{name:'北京'},{name:'柳州'}],
                    [{name:'北京'},{name:'宁波'}],
                    [{name:'北京'},{name:'南京'}],
                    [{name:'北京'},{name:'南宁'}],
                    [{name:'北京'},{name:'南通'}],
                    [{name:'北京'},{name:'上海'}],
                    [{name:'北京'},{name:'沈阳'}],
                    [{name:'北京'},{name:'西安'}],
                    [{name:'北京'},{name:'汕头'}],
                    [{name:'北京'},{name:'深圳'}],
                    [{name:'北京'},{name:'青岛'}],
                    [{name:'北京'},{name:'济南'}],
                    [{name:'北京'},{name:'太原'}],
                    [{name:'北京'},{name:'乌鲁木齐'}],
                    [{name:'北京'},{name:'潍坊'}],
                    [{name:'北京'},{name:'威海'}],
                    [{name:'北京'},{name:'温州'}],
                    [{name:'北京'},{name:'武汉'}],
                    [{name:'北京'},{name:'无锡'}],
                    [{name:'北京'},{name:'厦门'}],
                    [{name:'北京'},{name:'西宁'}],
                    [{name:'北京'},{name:'徐州'}],
                    [{name:'北京'},{name:'烟台'}],
                    [{name:'北京'},{name:'盐城'}],
                    [{name:'北京'},{name:'珠海'}],
                    [{name:'上海'},{name:'包头'}],
                    [{name:'上海'},{name:'北海'}],
                    [{name:'上海'},{name:'广州'}],
                    [{name:'上海'},{name:'郑州'}],
                    [{name:'上海'},{name:'长春'}],
                    [{name:'上海'},{name:'重庆'}],
                    [{name:'上海'},{name:'长沙'}],
                    [{name:'上海'},{name:'成都'}],
                    [{name:'上海'},{name:'丹东'}],
                    [{name:'上海'},{name:'大连'}],
                    [{name:'上海'},{name:'福州'}],
                    [{name:'上海'},{name:'海口'}],
                    [{name:'上海'},{name:'呼和浩特'}],
                    [{name:'上海'},{name:'合肥'}],
                    [{name:'上海'},{name:'哈尔滨'}],
                    [{name:'上海'},{name:'舟山'}],
                    [{name:'上海'},{name:'银川'}],
                    [{name:'上海'},{name:'南昌'}],
                    [{name:'上海'},{name:'昆明'}],
                    [{name:'上海'},{name:'贵阳'}],
                    [{name:'上海'},{name:'兰州'}],
                    [{name:'上海'},{name:'拉萨'}],
                    [{name:'上海'},{name:'连云港'}],
                    [{name:'上海'},{name:'临沂'}],
                    [{name:'上海'},{name:'柳州'}],
                    [{name:'上海'},{name:'宁波'}],
                    [{name:'上海'},{name:'南宁'}],
                    [{name:'上海'},{name:'北京'}],
                    [{name:'上海'},{name:'沈阳'}],
                    [{name:'上海'},{name:'秦皇岛'}],
                    [{name:'上海'},{name:'西安'}],
                    [{name:'上海'},{name:'石家庄'}],
                    [{name:'上海'},{name:'汕头'}],
                    [{name:'上海'},{name:'深圳'}],
                    [{name:'上海'},{name:'青岛'}],
                    [{name:'上海'},{name:'济南'}],
                    [{name:'上海'},{name:'天津'}],
                    [{name:'上海'},{name:'太原'}],
                    [{name:'上海'},{name:'乌鲁木齐'}],
                    [{name:'上海'},{name:'潍坊'}],
                    [{name:'上海'},{name:'威海'}],
                    [{name:'上海'},{name:'温州'}],
                    [{name:'上海'},{name:'武汉'}],
                    [{name:'上海'},{name:'厦门'}],
                    [{name:'上海'},{name:'西宁'}],
                    [{name:'上海'},{name:'徐州'}],
                    [{name:'上海'},{name:'烟台'}],
                    [{name:'上海'},{name:'珠海'}],
                    [{name:'广州'},{name:'北海'}],
                    [{name:'广州'},{name:'郑州'}],
                    [{name:'广州'},{name:'长春'}],
                    [{name:'广州'},{name:'重庆'}],
                    [{name:'广州'},{name:'长沙'}],
                    [{name:'广州'},{name:'成都'}],
                    [{name:'广州'},{name:'常州'}],
                    [{name:'广州'},{name:'大连'}],
                    [{name:'广州'},{name:'福州'}],
                    [{name:'广州'},{name:'海口'}],
                    [{name:'广州'},{name:'呼和浩特'}],
                    [{name:'广州'},{name:'合肥'}],
                    [{name:'广州'},{name:'杭州'}],
                    [{name:'广州'},{name:'哈尔滨'}],
                    [{name:'广州'},{name:'舟山'}],
                    [{name:'广州'},{name:'银川'}],
                    [{name:'广州'},{name:'南昌'}],
                    [{name:'广州'},{name:'昆明'}],
                    [{name:'广州'},{name:'贵阳'}],
                    [{name:'广州'},{name:'兰州'}],
                    [{name:'广州'},{name:'拉萨'}],
                    [{name:'广州'},{name:'连云港'}],
                    [{name:'广州'},{name:'临沂'}],
                    [{name:'广州'},{name:'柳州'}],
                    [{name:'广州'},{name:'宁波'}],
                    [{name:'广州'},{name:'南京'}],
                    [{name:'广州'},{name:'南宁'}],
                    [{name:'广州'},{name:'南通'}],
                    [{name:'广州'},{name:'北京'}],
                    [{name:'广州'},{name:'上海'}],
                    [{name:'广州'},{name:'沈阳'}],
                    [{name:'广州'},{name:'西安'}],
                    [{name:'广州'},{name:'石家庄'}],
                    [{name:'广州'},{name:'汕头'}],
                    [{name:'广州'},{name:'青岛'}],
                    [{name:'广州'},{name:'济南'}],
                    [{name:'广州'},{name:'天津'}],
                    [{name:'广州'},{name:'太原'}],
                    [{name:'广州'},{name:'乌鲁木齐'}],
                    [{name:'广州'},{name:'温州'}],
                    [{name:'广州'},{name:'武汉'}],
                    [{name:'广州'},{name:'无锡'}],
                    [{name:'广州'},{name:'厦门'}],
                    [{name:'广州'},{name:'西宁'}],
                    [{name:'广州'},{name:'徐州'}],
                    [{name:'广州'},{name:'烟台'}],
                    [{name:'广州'},{name:'盐城'}]
                ],
            },
            geoCoord: {
                '上海': [121.4648,31.2891],
                '东莞': [113.8953,22.901],
                '东营': [118.7073,37.5513],
                '中山': [113.4229,22.478],
                '临汾': [111.4783,36.1615],
                '临沂': [118.3118,35.2936],
                '丹东': [124.541,40.4242],
                '丽水': [119.5642,28.1854],
                '乌鲁木齐': [87.9236,43.5883],
                '佛山': [112.8955,23.1097],
                '保定': [115.0488,39.0948],
                '兰州': [103.5901,36.3043],
                '包头': [110.3467,41.4899],
                '北京': [116.4551,40.2539],
                '北海': [109.314,21.6211],
                '南京': [118.8062,31.9208],
                '南宁': [108.479,23.1152],
                '南昌': [116.0046,28.6633],
                '南通': [121.1023,32.1625],
                '厦门': [118.1689,24.6478],
                '台州': [121.1353,28.6688],
                '合肥': [117.29,32.0581],
                '呼和浩特': [111.4124,40.4901],
                '咸阳': [108.4131,34.8706],
                '哈尔滨': [127.9688,45.368],
                '唐山': [118.4766,39.6826],
                '嘉兴': [120.9155,30.6354],
                '大同': [113.7854,39.8035],
                '大连': [122.2229,39.4409],
                '天津': [117.4219,39.4189],
                '太原': [112.3352,37.9413],
                '威海': [121.9482,37.1393],
                '宁波': [121.5967,29.6466],
                '宝鸡': [107.1826,34.3433],
                '宿迁': [118.5535,33.7775],
                '常州': [119.4543,31.5582],
                '广州': [113.5107,23.2196],
                '廊坊': [116.521,39.0509],
                '延安': [109.1052,36.4252],
                '张家口': [115.1477,40.8527],
                '徐州': [117.5208,34.3268],
                '德州': [116.6858,37.2107],
                '惠州': [114.6204,23.1647],
                '成都': [103.9526,30.7617],
                '扬州': [119.4653,32.8162],
                '承德': [117.5757,41.4075],
                '拉萨': [91.1865,30.1465],
                '无锡': [120.3442,31.5527],
                '日照': [119.2786,35.5023],
                '昆明': [102.9199,25.4663],
                '杭州': [119.5313,29.8773],
                '枣庄': [117.323,34.8926],
                '柳州': [109.3799,24.9774],
                '株洲': [113.5327,27.0319],
                '武汉': [114.3896,30.6628],
                '汕头': [117.1692,23.3405],
                '江门': [112.6318,22.1484],
                '沈阳': [123.1238,42.1216],
                '沧州': [116.8286,38.2104],
                '河源': [114.917,23.9722],
                '泉州': [118.3228,25.1147],
                '泰安': [117.0264,36.0516],
                '泰州': [120.0586,32.5525],
                '济南': [117.1582,36.8701],
                '济宁': [116.8286,35.3375],
                '海口': [110.3893,19.8516],
                '淄博': [118.0371,36.6064],
                '淮安': [118.927,33.4039],
                '深圳': [114.5435,22.5439],
                '清远': [112.9175,24.3292],
                '温州': [120.498,27.8119],
                '渭南': [109.7864,35.0299],
                '湖州': [119.8608,30.7782],
                '湘潭': [112.5439,27.7075],
                '滨州': [117.8174,37.4963],
                '潍坊': [119.0918,36.524],
                '烟台': [120.7397,37.5128],
                '玉溪': [101.9312,23.8898],
                '珠海': [113.7305,22.1155],
                '盐城': [120.2234,33.5577],
                '盘锦': [121.9482,41.0449],
                '石家庄': [114.4995,38.1006],
                '福州': [119.4543,25.9222],
                '秦皇岛': [119.2126,40.0232],
                '绍兴': [120.564,29.7565],
                '聊城': [115.9167,36.4032],
                '肇庆': [112.1265,23.5822],
                '舟山': [122.2559,30.2234],
                '苏州': [120.6519,31.3989],
                '莱芜': [117.6526,36.2714],
                '菏泽': [115.6201,35.2057],
                '营口': [122.4316,40.4297],
                '葫芦岛': [120.1575,40.578],
                '衡水': [115.8838,37.7161],
                '衢州': [118.6853,28.8666],
                '西宁': [101.4038,36.8207],
                '西安': [109.1162,34.2004],
                '贵阳': [106.6992,26.7682],
                '连云港': [119.1248,34.552],
                '邢台': [114.8071,37.2821],
                '邯郸': [114.4775,36.535],
                '郑州': [113.4668,34.6234],
                '鄂尔多斯': [108.9734,39.2487],
                '重庆': [107.7539,30.1904],
                '金华': [120.0037,29.1028],
                '铜川': [109.0393,35.1947],
                '银川': [106.3586,38.1775],
                '镇江': [119.4763,31.9702],
                '长春': [125.8154,44.2584],
                '长沙': [113.0823,28.2568],
                '长治': [112.8625,36.4746],
                '阳泉': [113.4778,38.0951],
                '青岛': [120.4651,36.3373],
                '韶关': [113.7964,24.7028]
            }
        },
        {
            name: '北京 Top10',
            type: 'map',
            mapType: 'china',
            data:[],
            markLine : {
                smooth:true,
                effect : {
                    show: true,
                    scaleSize: 1,
                    period: 30,
                    color: '#fff',
                    shadowBlur: 10
                },
                itemStyle : {
                    normal: {
                        borderWidth:1,
                        lineStyle: {
                            type: 'solid',
                            shadowBlur: 10
                        }
                    }
                },
                data : [
                    [{name:'北京'}, {name:'上海',value:95}],
                    [{name:'北京'}, {name:'广州',value:90}],
                    [{name:'北京'}, {name:'大连',value:80}],
                    [{name:'北京'}, {name:'南宁',value:70}],
                    [{name:'北京'}, {name:'南昌',value:60}],
                    [{name:'北京'}, {name:'拉萨',value:50}],
                    [{name:'北京'}, {name:'长春',value:40}],
                    [{name:'北京'}, {name:'包头',value:30}],
                    [{name:'北京'}, {name:'重庆',value:20}],
                    [{name:'北京'}, {name:'常州',value:10}]
                ]
            },
            markPoint : {
                symbol:'emptyCircle',
                symbolSize : function (v){
                    return 10 + v/10
                },
                effect : {
                    show: true,
                    shadowBlur : 0
                },
                itemStyle:{
                    normal:{
                        label:{show:false}
                    },
                    emphasis: {
                        label:{position:'top'}
                    }
                },
                data : [
                    {name:'上海',value:95},
                    {name:'广州',value:90},
                    {name:'大连',value:80},
                    {name:'南宁',value:70},
                    {name:'南昌',value:60},
                    {name:'拉萨',value:50},
                    {name:'长春',value:40},
                    {name:'包头',value:30},
                    {name:'重庆',value:20},
                    {name:'常州',value:10}
                ]
            }
        },
        {
            name: '上海 Top10',
            type: 'map',
            mapType: 'china',
            data:[],
            markLine : {
                smooth:true,
                effect : {
                    show: true,
                    scaleSize: 1,
                    period: 30,
                    color: '#fff',
                    shadowBlur: 10
                },
                itemStyle : {
                    normal: {
                        borderWidth:1,
                        lineStyle: {
                            type: 'solid',
                            shadowBlur: 10
                        }
                    }
                },
                data : [
                    [{name:'上海'},{name:'包头',value:95}],
                    [{name:'上海'},{name:'昆明',value:90}],
                    [{name:'上海'},{name:'广州',value:80}],
                    [{name:'上海'},{name:'郑州',value:70}],
                    [{name:'上海'},{name:'长春',value:60}],
                    [{name:'上海'},{name:'重庆',value:50}],
                    [{name:'上海'},{name:'长沙',value:40}],
                    [{name:'上海'},{name:'北京',value:30}],
                    [{name:'上海'},{name:'丹东',value:20}],
                    [{name:'上海'},{name:'大连',value:10}]
                ]
            },
            markPoint : {
                symbol:'emptyCircle',
                symbolSize : function (v){
                    return 10 + v/10
                },
                effect : {
                    show: true,
                    shadowBlur : 0
                },
                itemStyle:{
                    normal:{
                        label:{show:false}
                    },
                    emphasis: {
                        label:{position:'top'}
                    }
                },
                data : [
                    {name:'包头',value:95},
                    {name:'昆明',value:90},
                    {name:'广州',value:80},
                    {name:'郑州',value:70},
                    {name:'长春',value:60},
                    {name:'重庆',value:50},
                    {name:'长沙',value:40},
                    {name:'北京',value:30},
                    {name:'丹东',value:20},
                    {name:'大连',value:10}
                ]
            }
        },
        {
            name: '广州 Top10',
            type: 'map',
            mapType: 'china',
            data:[],
            markLine : {
                smooth:true,
                effect : {
                    show: true,
                    scaleSize: 1,
                    period: 30,
                    color: '#fff',
                    shadowBlur: 10
                },
                itemStyle : {
                    normal: {
                        borderWidth:1,
                        lineStyle: {
                            type: 'solid',
                            shadowBlur: 10
                        }
                    }
                },
                data : [
                    [{name:'广州'},{name:'福州',value:95}],
                    [{name:'广州'},{name:'太原',value:90}],
                    [{name:'广州'},{name:'长春',value:80}],
                    [{name:'广州'},{name:'重庆',value:70}],
                    [{name:'广州'},{name:'西安',value:60}],
                    [{name:'广州'},{name:'成都',value:50}],
                    [{name:'广州'},{name:'常州',value:40}],
                    [{name:'广州'},{name:'北京',value:30}],
                    [{name:'广州'},{name:'北海',value:20}],
                    [{name:'广州'},{name:'海口',value:10}]
                ]
            },
            markPoint : {
                symbol:'emptyCircle',
                symbolSize : function (v){
                    return 10 + v/10
                },
                effect : {
                    show: true,
                    shadowBlur : 0
                },
                itemStyle:{
                    normal:{
                        label:{show:false}
                    },
                    emphasis: {
                        label:{position:'top'}
                    }
                },
                data : [
                    {name:'福州',value:95},
                    {name:'太原',value:90},
                    {name:'长春',value:80},
                    {name:'重庆',value:70},
                    {name:'西安',value:60},
                    {name:'成都',value:50},
                    {name:'常州',value:40},
                    {name:'北京',value:30},
                    {name:'北海',value:20},
                    {name:'海口',value:10}
                ]
            }
        }
    ]
};

var optionx = {
    tooltip : {
        show: true,
        trigger: 'item'
    },
    legend: {
        data:['邮件营销','联盟广告','直接访问','搜索引擎']
    },
    toolbox: {
        show : true,
        feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: false},
            magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    calculable : true,
    xAxis : [
        {
            type : 'category',
            data : ['周一','周二','周三','周四','周五','周六','周日']
        }
    ],
    yAxis : [
        {
            type : 'value'
        }
    ],
    series : [
        {
            name:'邮件营销',
            type:'bar',
            itemStyle: {        // 系列级个性化样式，纵向渐变填充
                normal: {
                    barBorderColor:'red',
                    barBorderWidth: 5,
                    color : (function (){
                        var zrColor = require('zrender/tool/color');
                        return zrColor.getLinearGradient(
                            0, 400, 0, 300,
                            [[0, 'green'],[1, 'yellow']]
                        )
                    })()
                },
                emphasis: {
                    barBorderWidth: 5,
                    barBorderColor:'green',
                    color: (function (){
                        var zrColor = require('zrender/tool/color');
                        return zrColor.getLinearGradient(
                            0, 400, 0, 300,
                            [[0, 'red'],[1, 'orange']]
                        )
                    })(),
                    label : {
                        show : true,
                        position : 'top',
                        formatter : "{a} {b} {c}",
                        textStyle : {
                            color: 'blue'
                        }
                    }
                }
            },
            data:[220, 232, 101, 234, 190, 330, 210]
        },
        {
            name:'联盟广告',
            type:'bar',
            stack: '总量',
            data:[120, '-', 451, 134, 190, 230, 110]
        },
        {
            name:'直接访问',
            type:'bar',
            stack: '总量',
            itemStyle: {                // 系列级个性化
                normal: {
                    barBorderWidth: 6,
                    barBorderColor:'tomato',
                    color: 'red'
                },
                emphasis: {
                    barBorderColor:'red',
                    color: 'blue'
                }
            },
            data:[
                320, 332, 100, 334,
                {
                    value: 390,
                    symbolSize : 10,   // 数据级个性化
                    itemStyle: {
                        normal: {
                            color :'lime'
                        },
                        emphasis: {
                            color: 'skyBlue'
                        }
                    }
                },
                330, 320
            ]
        },
        {
            name:'搜索引擎',
            type:'bar',
            barWidth: 40,                   // 系列级个性化，柱形宽度
            itemStyle: {
                normal: {                   // 系列级个性化，横向渐变填充
                    borderRadius: 5,
                    color : (function (){
                        var zrColor = require('zrender/tool/color');
                        return zrColor.getLinearGradient(
                            0, 0, 1000, 0,
                            [[0, 'rgba(30,144,255,0.8)'],[1, 'rgba(138,43,226,0.8)']]
                        )
                    })(),
                    label : {
                        show : true,
                        textStyle : {
                            fontSize : '20',
                            fontFamily : '微软雅黑',
                            fontWeight : 'bold'
                        }
                    }
                }
            },
            data:[
                620, 732, 
                {
                    value: 701,
                    itemStyle : { normal: {label : {position: 'inside'}}}
                },
                734, 890, 930, 820
            ],
            markLine : {
                data : [
                    {type : 'average', name : '平均值'},
                    {type : 'max'},
                    {type : 'min'}
                ]
            }
        }
    ]
};
                    
                // 为echarts对象加载数据 
                myChart.setOption(option); 
				myChartx.setOption(optionx); 
            }


			    
        );
		$(function(){
			$('#pp').portal({
				border:false,
				fit:true
	
			});
			//add();
			//chartsDragInPortalLayout("#horizontalBar","#horizontalBar_1","#pp");
			//chartsDragInPortalLayout("#bar","#bar_1","#pp");	
		});
		function addPanel()
		{
		    var p = $('<div/>').appendTo('body');
				p.panel({
					title:'Title',
					content:'<div style="padding:5px;">标题</div>',
					height:150,
					closable:true,
					collapsible:true
				});
				$('#pp').portal('add', {
					panel:p,
					columnIndex:0
				});
		}
		function add(){
			for(var i=0; i<3; i++){
				var p = $('<div/>').appendTo('body');
				p.panel({
					title:'Title'+i,
					content:'<div style="padding:5px;">Content'+(i+1)+'</div>',
					height:100,
					closable:true,
					collapsible:true
				});
				$('#pp').portal('add', {
					panel:p,
					columnIndex:i
				});
			}
			$('#pp').portal('resize');
		}
		function remove(){
			$('#pp').portal('remove',$('#pgrid'));
			$('#pp').portal('resize');
		}
		//图表选择
		function chartSelect()
		{
			 var p = $('<div/>').appendTo('body');
				p.panel({
					title:'新添加portallet',
					content:'<div style="padding:5px;">dsafdsafdsafd</div>',
					height:100,
					closable:true,
					collapsible:true
				});
				$('#pp').portal('add', {
					panel:p,
					columnIndex:0
				});
		}
		/*
$('#abc').draggable({
	proxy: function(source){
		var p = $('<div style="border:1px solid #ccc;width:80px"></div>');
		p.html($(source).html()).appendTo('body');
		return p;
	}
});*/
		function GetRandomNum(Min,Max)
{   
	var Range = Max - Min;   
	var Rand = Math.random();   
	return(Min + Math.round(Rand * Range));   
}   

//显示菜单
function showmenu(e)
{
	$('#mm').menu('show', {
		left: e.pageX,
		top: e.pageY
});
}
		
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
          <table id="portallayout" border="0" cellspacing="0" cellpadding="0" style="width:100%;height:100%; ">
		  
		   <tr><td class="portal-column-td" style="width:60%;">
			<div style="width:100%;">
				<div id="charts" title="图表"  collapsible="true" closable="true"   style="text-align:center;background:#f3eeaf;height:400px;padding:5px;">
				    <div  id="main" class="t-list" style="height:400px;"></div>
			    </div>
			    <div id="abc" title="Tutorials" collapsible="true" closable="true" style="height:400px;padding:5px;">
			    	<div  id="main2" class="t-list" style="height:400px;">
					</div>
			    </div>
			</div>
			</td>
			<td class="portal-column-td" style="width:40%;">
			<div style="width:100%;">
				<div title="Searching" iconCls="icon-search" closable="true" style="height:80px;padding:10px;">
					<input class="easyui-searchbox">
				</div>
				<div title="Graph" closable="true" style="height:200px;text-align:center;">
					<img height="160" src="http://echarts.baidu.com/gallery/data/thumb/effectScatter-map.png"></img>
				</div>
				<div id="pgrid" title="DataGrid"   class="easyui-panel" closable="true" style="width:100%;height:200px;">
					<table class="easyui-datagrid" style="width:650px;height:auto"
							fit="true" border="false"
							singleSelect="true"
							idField="itemid" url="datagrid_data.json">
						<thead>
							<tr>
								<th field="itemid" width="60">Item ID</th>
								<th field="productid" width="60">Product ID</th>
								<th field="listprice" width="80" align="right">List Price</th>
								<th field="unitcost" width="80" align="right">Unit Cost</th>
								<th field="attr1" width="120">Attribute</th>
								<th field="status" width="50" align="center">Status</th>
							</tr>
						</thead>
					</table>
				</div>
			</div>
			</td>
			</tr>
			</table>
		</div>
		</div>
		

</body>
</html>