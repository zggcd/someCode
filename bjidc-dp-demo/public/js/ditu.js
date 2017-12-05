require.config({
        paths: {
            echarts: 'idc/public/echarts-2.2.7/build/dist'
        }
    });
    require(
            [
                'echarts',
                'echarts/chart/map'
            ],
            function (ec) {
                // 基于准备好的dom，初始化echarts图表
                var myChart = ec.init(document.getElementById('main'));
                var mapDate = {
                        '北京市静安IDC数据中心': [116.50,39.96],
                        '北京市兆维IDC数据中心': [116.57,39.94],
                        '北京市大郊亭IDC数据中心': [116.56,39.87],
                        '北京市东四IDC数据中心': [116.48,39.91],
                     	'北京市亦庄瀛海IDC数据中心': [116.44,40.02],
                        '北京市洋桥IDC数据中心': [116.33,39.82],
                        '北京市西二旗IDC数据中心':[116.31,40.02],
                        '北京市永丰IDC数据中心':[116.21,40.08],
                        '北京市马驹桥IDC数据中心':[116.68,39.72],
                        '北京市北七家IDC数据中心':[116.44,40.17],
                        '北京市润泽IDC数据中心':[116.58,39.58],
                        '北京市亦庄IDC数据中心':[116.48,39.70],
                        '北京市西单IDC数据中心': [116.35,39.92],
                        '北京市德外IDC数据中心': [116.29,39.95],
                        '静安1':[116.39,39.95],
                        '北京市中广亚IDC数据中心':[116.49,39.95],
	                    '北京市酒仙桥IDC数据中心':[116.59,39.95],
	                    '北京市数字大厦IDC数据中心':[116.50,39,50],
//                        '东城区': [116.40,39.98],
//                        '西城区': [116.27,39.92],
//                        '崇文区': [116.46,39.83],
//                        '宣武区': [116.25,39.87],
//                        '朝阳区': [116.63,39.99],
//                        '丰台区': [116.21,39.82],
//                        '石景山区':[116.02,39.95],
//                        '海淀区':[116.24,40.04],
//                        '房山区':[115.83,39.75],
//                        '门头沟区':[115.8,39.99],
//                        '通州区':[116.68,39.79],
//                        '顺义区':[116.65,40.13],
//                        '昌平区':[116.23,40.22],
//                        '大兴区':[116.38,39.64],
//                        '怀柔区':[116.63,40.72],
//                        '平谷区':[117.12,40.19],
//                        '密云县':[116.99,40.45],
//                        '延庆县':[116.10,40.51]
                    };
                
                var mapType = [
                    'china',
                    // 23个省
                    '广东', '青海', '四川', '海南', '陕西',
                    '甘肃', '云南', '湖南', '湖北', '黑龙江',
                    '贵州', '山东', '江西', '河南', '河北',
                    '山西', '安徽', '福建', '浙江', '江苏',
                    '吉林', '辽宁', '台湾',
                    // 5个自治区
                    '新疆', '广西', '宁夏', '内蒙古', '西藏',
                    // 4个直辖市
                    '北京', '天津', '上海', '重庆',
                    // 2个特别行政区
                    '香港', '澳门'
                ];
                var option = {
                    color: ['#ff7f50'],
                    title: {
                        text : '',
                        subtext : ''
                    },
                    legend: { 
						show:false,
						orient: 'vertical',  
						x:'left',  
						data:['机架','IP','端口'],
						selectedMode: 'single',
						
					},
                    tooltip : {  
//                  	showContent: false,
						trigger: 'item', 
						show:false,
						formatter: function (params,ticket,callback) {
							var res = '' + params[1];  
							var jijia = "";  
							var ip = ""; 
							var duankou = ""; 
							
							
							for(var i = 0; i <option.series[0].data.length; i++)  
							{  
								if(option.series[0].data[i].name == params[1])  
								{  
									jijia = option.series[0].data[i].value;  
								}  
  
							}  
							for(var j = 0; j <option.series[1].data.length; j++)  
							{  
								if(option.series[1].data[j].name == params[1])  
								{  
									ip = option.series[1].data[j].value;  
								}  
  
							} 
							for(var m = 0; m <option.series[2].data.length; m++)  
							{  
								if(option.series[2].data[m].name == params[1])  
								{  
									duankou = option.series[2].data[m].value;  
								}  
  
							} 
							
							res += '<br/>'+"机架:"+jijia+'<br/>'+"IP:"+ip+'<br/>'+"端口:"+duankou+'<br/>';  
                          
                         setTimeout(function (){  
                            // 仅为了模拟异步回调,每隔1000毫秒刷新一次  
                            callback(ticket, res);  
                        }, 100)  
                       return 'loading';  
							
						}  
					}, 
                    series : [
                        {
                            name: '机架',
                            type: 'map',
                            mapType: '北京',
                            hoverable: false,
                            selectedMode : 'single',
                            itemStyle: {
                                normal: {
                                    label: {
                                        show: false,
                                        textStyle: {
                                            color: 'rgba(255,255,255,0.7)',
                                            fontFamily:'Microsoft YaHei'
                                        },
//                                        formatter: '正常'
                                    },
                                    borderColor: 'rgba(255,255,255,0.8)',
                                    borderWidth: 1.5,
                                    areaStyle: {
                                        color: '#7e7a6e'
                                    }
                                },
                                emphasis:{
                                    borderColor: '#ffffff',
                                    borderWidth: 2.3,
                                    label: {
                                        show: false,
                                        textStyle: {
                                            color: '#ffffff',
                                            fontFamily:'Microsoft YaHei'
                                        }
                                    },
                                    areaStyle: {
                                        color: '#7e7a6e'
                                    }
                                }
                            },
                            data :rackData,
                            roam: false,
                            hoverable: true,
                           
                            markPoint : {
                            symbol:'emptyCircle',
							symbolSize : 5,      // 标注大小，半宽（半径）参数，当图形为方向或菱形则总宽度为symbolSize * 2
							tooltip : {  
//                  	showContent: false,
						trigger: 'item', 
						show:true,
						formatter: function (params,ticket,callback) {  
							var res = '' + params[1];  
							var jijia = "";  
							var ip = ""; 
							var duankou = ""; 
							
							
							for(var i = 0; i <option.series[0].data.length; i++)  
							{  
								if(option.series[0].data[i].name == params[1])  
								{  
									jijia = option.series[0].data[i].value;  
								}  
  
							}  
							for(var j = 0; j <option.series[1].data.length; j++)  
							{  
								if(option.series[1].data[j].name == params[1])  
								{  
									ip = option.series[1].data[j].value;  
								}  
  
							} 
							for(var m = 0; m <option.series[2].data.length; m++)  
							{  
								if(option.series[2].data[m].name == params[1])  
								{  
									duankou = option.series[2].data[m].value;  
								}  
  
							} 
							
							res += '<br/>'+"机架:"+jijia+'<br/>'+"IP:"+ip+'<br/>'+"端口:"+duankou+'<br/>';  
                          
                         setTimeout(function (){  
                            // 仅为了模拟异步回调,每隔1000毫秒刷新一次  
                            callback(ticket, res);  
                        }, 100)   
                       return 'loading';  
							
						}  
					}, 
					itemStyle: {
						normal: {
							borderColor: '#1e90ff',
							borderWidth: 1,            // 标注边线线宽，单位px，默认为1
							label: {
								show: false
							}
						},
						emphasis: {
							borderColor: '#87cefa',
							borderWidth: 1.5,
							label: {
								show: false
							}
						}
					},
                    data : rackData
                       },
                     geoCoord: mapDate
                        },
                        {
                            name: 'IP',
                            type: 'map',
                            mapType: '北京',
                            hoverable: false,
                            selectedMode : 'single',
                            itemStyle: {
                                normal: {
                                    label: {
                                        show: false,
                                        textStyle: {
                                            color: 'rgba(255,255,255,0.7)',
                                            fontFamily:'Microsoft YaHei'
                                        },
//                                        formatter: '正常'
                                    },
                                    borderColor: 'rgba(255,255,255,0.8)',
                                    borderWidth: 1.5,
                                    areaStyle: {
                                        color: '#7e7a6e'
                                    }
                                },
                                emphasis:{
                                    borderColor: '#ffffff',
                                    borderWidth: 2.3,
                                    label: {
                                        show: false,
                                        textStyle: {
                                            color: '#ffffff',
                                            fontFamily:'Microsoft YaHei'
                                        }
                                    },
                                    areaStyle: {
                                        color: 'transparent'
                                    }
                                }
                            },
                            data :ipData,
                            roam: false,
                            hoverable: true,
                           
                            markPoint : {
                                symbol:'emptyCircle',
								symbolSize : 5,      // 标注大小，半宽（半径）参数，当图形为方向或菱形则总宽度为symbolSize * 2
								tooltip : {  
//                  	showContent: false,
						trigger: 'item', 
						show:true,
						formatter: function (params,ticket,callback) {  
							var res = '' + params[1];  
							var jijia = "";  
							var ip = ""; 
							var duankou = ""; 
							
							
							for(var i = 0; i <option.series[0].data.length; i++)  
							{  
								if(option.series[0].data[i].name == params[1])  
								{  
									jijia = option.series[0].data[i].value;  
								}  
  
							}  
							for(var j = 0; j <option.series[1].data.length; j++)  
							{  
								if(option.series[1].data[j].name == params[1])  
								{  
									ip = option.series[1].data[j].value;  
								}  
  
							} 
							for(var m = 0; m <option.series[2].data.length; m++)  
							{  
								if(option.series[2].data[m].name == params[1])  
								{  
									duankou = option.series[2].data[m].value; 
								}  
  
							} 
							
							res += '<br/>'+"机架:"+jijia+'<br/>'+"IP:"+ip+'<br/>'+"端口:"+duankou+'<br/>';  
                          
                          setTimeout(function (){  
                            // 仅为了模拟异步回调,每隔1000毫秒刷新一次  
                            callback(ticket, res);  
                        }, 100)   
                        return 'loading';  
							
						}  
					}, 
					itemStyle: {
						normal: {
							borderColor: '#1e90ff',
							borderWidth: 1,            // 标注边线线宽，单位px，默认为1
							label: {
								show: false
							}
						},
						emphasis: {
							borderColor: '#87cefa',
							borderWidth: 1.5,
							label: {
								show: false
							}
						}
					},
                    data :ipData
                     },
                     geoCoord: mapDate
                        },
                        {
                            name: '端口',
                            type: 'map',
                            mapType: '北京',
                            hoverable: false,
                            selectedMode : 'single',
                            itemStyle: {
                                normal: {
                                    label: {
                                        show: false,
                                        textStyle: {
                                            color: 'rgba(255,255,255,0.7)',
                                            fontFamily:'Microsoft YaHei'
                                        },
//                                        formatter: '正常'
                                    },
                                    borderColor: 'rgba(255,255,255,0.8)',
                                    borderWidth: 1.5,
                                    areaStyle: {
                                        color: '#7e7a6e'
                                    }
                                },
                                emphasis:{
                                    borderColor: '#ffffff',
                                    borderWidth: 2.3,
                                    label: {
                                        show: false,
                                        textStyle: {
                                            color: '#ffffff',
                                            fontFamily:'Microsoft YaHei'
                                        }
                                    },
                                    areaStyle: {
                                        color: 'transparent'
                                    }
                                }
                            },
                            data :portData,
                            roam: false,
                            hoverable: true,
                 			 markPoint : {
                            symbol:'emptyCircle',
							symbolSize : 5,      // 标注大小，半宽（半径）参数，当图形为方向或菱形则总宽度为symbolSize * 2
							tooltip : {  
//                  	showContent: false,
						trigger: 'item', 
						show:true,
						formatter: function (params,ticket,callback) {  
							var res = '' + params[1];  
							var jijia = "";  
							var ip = ""; 
							var duankou = ""; 
							
							
							for(var i = 0; i <option.series[0].data.length; i++)  
							{  
								if(option.series[0].data[i].name == params[1])  
								{  
									jijia = option.series[0].data[i].value;  
								}  
  
							}  
							for(var j = 0; j <option.series[1].data.length; j++)  
							{  
								if(option.series[1].data[j].name == params[1])  
								{  
									ip = option.series[1].data[j].value;  
								}  
  
							} 
							for(var m = 0; m <option.series[2].data.length; m++)  
							{  
								if(option.series[2].data[m].name == params[1])  
								{  
									duankou = option.series[2].data[m].value;  
								}  
  
							} 
							
							res += '<br/>'+"机架:"+jijia+'<br/>'+"IP:"+ip+'<br/>'+"端口:"+duankou+'<br/>';  
                          
                          setTimeout(function (){  
                            // 仅为了模拟异步回调,每隔1000毫秒刷新一次  
                            callback(ticket, res);  
                        }, 100)  
                        return 'loading';  
							
						}  
					}, 
					itemStyle: {
						normal: {
							borderColor: '#1e90ff',
							borderWidth: 1,            // 标注边线线宽，单位px，默认为1
							label: {
								show: false
							}
						},
						emphasis: {
							borderColor: '#87cefa',
							borderWidth: 1.5,
							label: {
								show: false
							}
						}
					},
                      data : portData
                            },
                   geoCoord: mapDate
                        },
                    ]
                };
                // 为echarts对象加载数据
                myChart.setOption(option, true);
                console.log(option);
                console.log(mapDate);
//              myChart.chart.map.showTip({'name':'地名'})
                window.onresize = myChart.resize;
            }

    );
