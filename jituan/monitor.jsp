<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <title>装维工单实时监控</title>
    <link rel="stylesheet" href="lib/css/style_monitor.css">
</head>
<body id="monitor">
    <div id="info">
        <p class="tittxt"><b>全网装维工单实时监测</b><img class="img" src="lib/images/u276.png">当前时间：<div id="nowTime"></div></p>
        <table>
            <tr>
                <td><img src="lib/images/u282.png"></td>
                <td class="tit">当前工单总量</td>
                <td class="num">{{ sum1 }}</td>
            </tr>
            <tr>
                <td><img src="lib/images/u265.png"></td>
                <td class="tit">装维人员总数</td>
                <td class="num">{{ sum4 }}</td>
            </tr>
            <tr>
                <td><img src="lib/images/u220.png"></td>
                <td class="tit">装移机工单数量</td>
                <td class="num">{{ sum2 }}</td>
            </tr>
            <tr>
                <td><img src="lib/images/u294.png"></td>
                <td class="tit">保障工单总量</td>
                <td class="num">{{ sum3 }}</td>
            </tr>
        </table>
    </div>
    <div id="main"></div>
    <div id="right"></div>
    <div id="table">
        <div class="table_header_th">
            <div class="text_th">
                <p><span>省份</span></p>
            </div>
            <div class="text_th">
                <p><span>工单类型</span></p>
            </div>
            <div class="text_th">
                <p><span>产品</span></p>
            </div>
            <div class="text_th_last">
                <p><span>工单总数</span></p>
            </div>
        </div>
        <div class="ease">
            <div id="ease_data" class="showIn">
                <div class="table_body" v-for="rows in tables">
                    <div class="text_body">
                        <p><span>{{ rows.regionName }}</span></p>
                    </div>
                    <div class="text_body">
                        <p><span>{{ rows.orderTypename }}</span></p>
                    </div>
                    <div class="text_body">
                        <p><span>{{ rows.productTypename }}</span></p>
                    </div>
                    <div class="text_body_last">
                        <p><span>{{ this.toThousands(rows.orderSum) }}</span></p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script type="text/javascript" src="lib/script/echarts.min.js"></script>
    <script type="text/javascript" src="lib/script/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src='lib/script/Polyfill.js'></script>
    <script type="text/javascript" src='lib/script/vue.js'></script>
    <script type="text/javascript" src="lib/maps/china.js"></script>
    <script type="text/javascript">
        new Vue({
            el: '#monitor',
            data : function(){
                return {
                    tables : [],
                    sum1 : 0,
                    sum2 : 0,
                    sum3 : 0,
                    sum4 : 0,
                    pageCount : 0,
                    nowPage : 1,
                    cursor : 0,
                    tableHeig : 0
                }
            },
            created : function(){
                this.winHeight();
            },
            ready : function(){
                this.reloadwin(),
                this.timer(),
                //测试数据用
                this.table("/orderMonitor.do",{"nowPage":"1"})
                setInterval(
                    function(){
                        if(this.pageCount){
                            if(this.nowPage == this.pageCount){
                                this.nowPage = 0
                            }
                            this.nowPage = this.nowPage + 1;
                            this.table("/orderMonitor.do",{"nowPage":this.nowPage})
                        }
                    }.bind(this),10000
                )
                //this.table("/orderMonitor.do",[]),
            },
            methods : {
                table : function (url,param) {
                    $.ajax({
                        url : url,
                        data : param,
                        success : function(data){                         
                            if(!data.orderMonitor.length){
                                alert("数据异常！");
                                return false;
                            }
                            this.tables = data.orderMonitor;
                            this.sum1 = data.sum1;
                            this.sum2 = data.sum2;
                            this.sum3 = data.sum3;
                            this.sum4 = data.sum4;
                            this.pageCount = data.pageCount;
                            //this.tableHeig = data.orderMonitor.length;
                            //this.getMore();
                            data = eval(data.region) //JSON的字符串解析成JSON数据格式

                            //测试数据
                            //var data = [{name: '北京市', value: 79006184},{name: '天津市', value: 100060145},{name: '河北省', value: 1400847},{name: '山西省', value: 321849},{name: '内蒙古自治区', value: 5884},{name: '辽宁省', value: 3560},{name: '吉林省', value: 584},{name: '黑龙江省', value: 44},{name: '上海市', value: 21006145},{name: '江苏省', value: 6700614},{name: '浙江省', value: 18001844},{name: '安徽省', value: 22061849},{name: '福建省', value: 2000649},{name: '江西省', value: 5400604},{name: '山东省', value: 92006184},{name: '河南省', value: 1100843},{name: '湖北省', value: 270043},{name: '湖南省', value: 91084},{name: '广东省', value: 12000849},{name: '广西壮族自治区', value: 21006842},{name: '海南省', value: 1000042},{name: '重庆市', value: 21010844},{name: '四川省', value: 1501840},{name: '贵州省', value: 16000648},{name: '云南省', value: 1800084},{name: '西藏自治区', value: 1408044},{name: '陕西省', value: 1900615},{name: '甘肃省', value: 21},{name: '青海省', value: 21000641},{name: '宁夏回族自治区', value: 21000684},{name: '新疆维吾尔自治区', value: 360}];
                            
                            myChart.setOption({
                                backgroundColor: '#404a59',
                                tooltip : {
                                    trigger: 'item',
                                    formatter: function (params) {
                                        return params.name + ' : ' + params.value[2];
                                    }
                                },
                                geo: {
                                    map: 'china',
                                    label: {
                                        emphasis: {
                                            show: false
                                        }
                                    },
                                    roam: 'move',
                                    itemStyle: {
                                        normal: {
                                            areaColor: '#323c48',
                                            borderColor: '#111'
                                        },
                                        emphasis: {
                                            areaColor: '#2a333d'
                                        }
                                    }
                                },
                                series : [
                                    {
                                        type: 'effectScatter',
                                        coordinateSystem: 'geo',
                                        data: convertData(data),
                                        symbolSize: function (val) {
                                            if(val[2] > 10000000 )return 29;
                                            if(val[2] < 10000000 && val[2] > 1000000)return 25;
                                            if(val[2] < 1000000 && val[2] > 100000)return 21;
                                            if(val[2] < 100000 && val[2] > 10000)return 17;
                                            if(val[2] < 10000 && val[2] > 1000)return 13;
                                            if(val[2] < 1000 && val[2] > 100)return 9;
                                            if(val[2] < 100 )return 5;
                                        },
                                        showEffectOn: 'render',
                                        rippleEffect: {
                                            brushType: 'stroke'
                                        },
                                        hoverAnimation: true,
                                        label: {
                                            normal: {
                                                formatter: '{b}',
                                                position: 'right',
                                                show: true
                                            }
                                        },
                                        itemStyle: {
                                            normal: {
                                                color: '#f4e925',
                                                shadowBlur: 10,
                                                shadowColor: '#333'
                                            }
                                        },
                                        zlevel: 1
                                    }
                                ]
                            });
                        }.bind(this),
                        error : function() {
                            alert("数据加载错误！");  
                        }
                    })
                },
                winHeight : function(){
                    var main = document.getElementById('main');
                    var right = document.getElementById('right');
                    var h = document.documentElement.clientHeight;
                    main.style.height = h + "px";
                    right.style.height = h + "px";
                },
                //每隔8秒循环表格数据
                // getMore : function(){
                //     var i = 0;
                //     var cur = this.cursor;
                //     var heig = Math.floor(this.tableHeig / 10);
                //     function currPage(){
                //         return cur -= 400;
                //     }
                //     setInterval(
                //         function(){
                //             if(i > heig - 1){
                //                 i = 0;
                //                 cur = 0;
                //                 document.getElementById("ease_data").style.top = 0 + 'px';
                //             }else{
                //                 document.getElementById("ease_data").style.top = currPage() + 'px';
                //                 i++;
                //             }
                //         },8000
                //     );
                // },
                reloadwin : function(){
                    //每隔15分钟刷新
                    setInterval(
                        function(){
                            window.location.reload();
                        },900000
                    );
                },
                timer : function(){
                    //获取当前时间 
                    function current(){ 
                        var d=new Date(),str=''; 
                        str +=d.getFullYear()+'年'; 
                        str +=d.getMonth()+1+'月';  
                        str +=d.getDate()+'日'; 
                        str +=d.getHours()+'时'; 
                        str +=d.getMinutes()+'分'; 
                        str +=d.getSeconds()+'秒'; 
                        return str; 
                    } 
                    setInterval(
                        function(){
                            $("#nowTime").html(current)
                        },1000
                    );
                },
                toThousands : function(num) {
                    return (num || 0).toString().replace(/(\d)(?=(?:\d{3})+$)/g, '$1,');
                }
            }
        })

        var myChart = echarts.init(
            document.getElementById('main')
        );
        var geoCoordMap = {'北京市':[116.46,39.92],'天津市':[117.2,39.13],'河北省':[114.48,38.03],'山西省':[112.53,37.87],'内蒙古自治区':[111.65,40.82],'辽宁省':[123.38,41.8],'吉林省':[125.35,43.88],'黑龙江省':[126.63,45.75],'上海市':[121.48,31.22],'江苏省':[118.78,32.04],'浙江省':[120.19,30.26],'安徽省':[117.27,31.86],'福建省':[119.3,26.08],'江西省':[115.89,28.68],'山东省':[117,36.65],'河南省':[113.65,34.76],'湖北省':[114.31,30.52],'湖南省':[113,28.21],'广东省':[113.23,23.16],'广西壮族自治区':[108.33,22.84],'海南省':[110.35,20.02],'重庆市':[106.54,29.59],'四川省':[104.06,30.67],'贵州省':[106.71,26.57],'云南省':[102.73,25.04],'西藏自治区':[91.11,29.97],'陕西省':[108.95,34.27],'甘肃省':[103.73,36.03],'青海省':[101.74,36.56],'宁夏回族自治区':[106.27,38.47],'新疆维吾尔自治区':[87.68,43.77]};
        
        myChart.showLoading({
            text : '数据读取中...',
            textStyle : {
                fontSize : 20
            },
            zlevel: 1
        });

        var convertData = function (data) {
            var res = [];
            for (var i = 0; i < data.length; i++) {
                var geoCoord = geoCoordMap[data[i].name];
                if (geoCoord) {
                    res.push({
                        name: data[i].name,
                        value: geoCoord.concat(data[i].value)
                    });
                }
            }
            return res;
        };


       //$.get('').done(function (data) {       //测试数据用
       //$.get('/orderMonitor.do').done(function (data) {


     //   });
        myChart.hideLoading();
    </script>
</body>
</html>