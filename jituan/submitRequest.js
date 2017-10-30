var setting = {
		view: {
			selectedMulti: false
		},
		check: {
			enable: true
		},
			data: {
				simpleData: {
					enable: true
				}
			},
			callback: {
				onCheck: onCheck
			}
		};

		//var nodes = { id:1, pId:0, name:"北京市", value:"0101"}

		var zNodes =[{ id:1, pId:0, name:"全国", value:"01",open:true},
		             { id:11, pId:1, name:"北京市", value:"0101"},
		             { id:110, pId:11, name:"所有地市", value:"010101,010102"},
		             { id:111, pId:11, name:"北京市辖区", value:"010101"},
		             { id:112, pId:11, name:"县", value:"010102"},
		             { id:12, pId:1, name:"天津市", value:"0102"},
		             { id:120, pId:12, name:"所有地市", value:"010201,010202"},
		             { id:121, pId:12, name:"天津市辖区", value:"010201"},
		             { id:122, pId:12, name:"县", value:"010202"},
		             { id:13, pId:1, name:"河北省", value:"0103"},
		             { id:130, pId:13, name:"所有地市", value:"010301,010302,010303,010304.010305,010306,010307,010308,010309,010310,010311"},
		             { id:131, pId:13, name:"石家庄市", value:"010301"},
		             { id:132, pId:13, name:"唐山市", value:"010302"},
		             { id:133, pId:13, name:"秦皇岛市", value:"010303"},
		             { id:134, pId:13, name:"邯郸市", value:"010304"},
		             { id:135, pId:13, name:"邢台市", value:"010305"},
		             { id:136, pId:13, name:"保定市", value:"010306"},
		             { id:137, pId:13, name:"衡水市", value:"010307"},
		             { id:138, pId:13, name:"张家口市", value:"010308"},
		             { id:139, pId:13, name:"承德市", value:"010309"},
		             { id:1310, pId:13, name:"沧州市", value:"010310"},
		             { id:1311, pId:13, name:"廊坊市", value:"010311"},
		             { id:14, pId:1, name:"湖北省", value:"0104"},
		             { id:140, pId:14, name:"所有地市", value:"010401,010402,010403,010404.010405,010406,010407,010408,010409,010410,010411,010412,010413,010414,010415,010416,010417,010418"},
		             { id:141, pId:14, name:"武汉市", value:"010401"},
		             { id:142, pId:14, name:"黄石市", value:"010402"},
		             { id:143, pId:14, name:"十堰市", value:"010403"},
		             { id:144, pId:14, name:"宜昌市", value:"010404"},
		             { id:145, pId:14, name:"襄阳市", value:"010405"},
		             { id:146, pId:14, name:"鄂州市", value:"010406"},
		             { id:147, pId:14, name:"荆门市", value:"010407"},
		             { id:148, pId:14, name:"荆州市", value:"010408"},
		             { id:149, pId:14, name:"咸宁市", value:"010409"},
		             { id:1410, pId:14, name:"随州市", value:"010410"},
		             { id:1411, pId:14, name:"恩施土家族苗族自治州", value:"010411"},
		             { id:1412, pId:14, name:"省直辖县级行政区划", value:"010412"},
		             { id:1413, pId:14, name:"仙桃市", value:"010413"},
		             { id:1414, pId:14, name:"潜江市", value:"010414"},
		             { id:1415, pId:14, name:"天门市", value:"010415"},
		             { id:1416, pId:14, name:"神农架林区", value:"010416"},
		             { id:1417, pId:14, name:"孝感市", value:"010417"},
		             { id:1418, pId:14, name:"黄冈市", value:"010418"},
		             { id:15, pId:1, name:"安徽省", value:"0105"},
		             { id:151, pId:15, name:"所有地市", value:"010501,010502,010503,010504,010505,010506,010507,010508,010509,010510,010511,010512,010513,010514,010515,010516"},
		             { id:151, pId:15, name:"芜湖市", value:"010501"},
		             { id:152, pId:15, name:"淮南市", value:"010502"},
		             { id:153, pId:15, name:"马鞍山市", value:"010503"},
		             { id:154, pId:15, name:"淮北市", value:"010504"},
		             { id:155, pId:15, name:"铜陵市", value:"010505"},
		             { id:156, pId:15, name:"安庆市", value:"010506"},
		             { id:157, pId:15, name:"黄山市", value:"010507"},
		             { id:158, pId:15, name:"滁州市", value:"010508"},
		             { id:159, pId:15, name:"阜阳市", value:"010509"},
		             { id:1510, pId:15, name:"宿州市", value:"010510"},
		             { id:1511, pId:15, name:"六安市", value:"010511"},
		             { id:1512, pId:15, name:"亳州市", value:"010512"},
		             { id:1513, pId:15, name:"池州市", value:"010513"},
		             { id:1514, pId:15, name:"宣城市", value:"010514"},
		             { id:1515, pId:15, name:"合肥市", value:"010515"},
		             { id:1516, pId:15, name:"蚌埠市", value:"010516"},
		             { id:16, pId:1, name:"福建省", value:"0106"},
		             { id:160, pId:16, name:"所有地市", value:"010601,010602,010603,010604,010605,010606,010607,010608,010609"},
		             { id:161, pId:16, name:"福州市", value:"010601"},
		             { id:162, pId:16, name:"厦门市", value:"010602"},
		             { id:163, pId:16, name:"泉州市", value:"010603"},
		             { id:164, pId:16, name:"漳州市", value:"010604"},
		             { id:165, pId:16, name:"龙岩市", value:"010605"},
		             { id:166, pId:16, name:"宁德市", value:"010606"},
		             { id:167, pId:16, name:"莆田市", value:"010607"},
		             { id:168, pId:16, name:"三明市", value:"010608"},
		             { id:169, pId:16, name:"南平市", value:"010609"},
		             { id:17, pId:1, name:"江西省", value:"0107"},
		             { id:170, pId:17, name:"所有地市", value:"010701,010702,010703,010704,010705,010706,010707,010708,010709,010710,010711"},
		             { id:171, pId:17, name:"南昌市", value:"010701"},
		             { id:172, pId:17, name:"景德镇市", value:"010702"},
		             { id:173, pId:17, name:"萍乡市", value:"010703"},
		             { id:174, pId:17, name:"九江市", value:"010704"},
		             { id:175, pId:17, name:"新余市", value:"010705"},
		             { id:176, pId:17, name:"鹰潭市", value:"010706"},
		             { id:177, pId:17, name:"赣州市", value:"010707"},
		             { id:178, pId:17, name:"抚州市", value:"010708"},
		             { id:179, pId:17, name:"上饶市", value:"010709"},
		             { id:1710, pId:17, name:"吉安市", value:"010710"},
		             { id:1711, pId:17, name:"宜春市", value:"010711"},
		             { id:18, pId:1, name:"山东省", value:"0108"},
		             { id:180, pId:18, name:"所有地市", value:"010801,010802,010803,010804,010805,010806,010807,010808,010809,010810,010811,010812,010813,010814,010815,010816,010817"},
		             { id:181, pId:18, name:"青岛市", value:"010801"},
		             { id:182, pId:18, name:"淄博市", value:"010802"},
		             { id:183, pId:18, name:"枣庄市", value:"010803"},
		             { id:184, pId:18, name:"东营市", value:"010804"},
		             { id:185, pId:18, name:"烟台市", value:"010805"},
		             { id:186, pId:18, name:"潍坊市", value:"010806"},
		             { id:187, pId:18, name:"济宁市", value:"010807"},
		             { id:188, pId:18, name:"泰安市", value:"010808"},
		             { id:189, pId:18, name:"日照市", value:"010809"},
		             { id:1810, pId:18, name:"莱芜市", value:"010810"},
		             { id:1811, pId:18, name:"德州市", value:"010811"},
		             { id:1812, pId:18, name:"聊城市", value:"010812"},
		             { id:1813, pId:18, name:"滨州市", value:"010813"},
		             { id:1814, pId:18, name:"菏泽市", value:"010814"},
		             { id:1815, pId:18, name:"济南市", value:"010815"},
		             { id:1816, pId:18, name:"威海市", value:"010816"},
		             { id:1817, pId:18, name:"临沂市", value:"010817"},
		             { id:19, pId:1, name:"河南省", value:"0109"},
		             { id:190, pId:19, name:"所有地市", value:"010901,010902,010903,010904,010905,010906,010907,010908,010909,010910,010911,010912,010913,010914,010915,010916,010917,010918,010919"},
		             { id:191, pId:19, name:"开封市", value:"010901"},
		             { id:192, pId:19, name:"洛阳市", value:"010902"},
		             { id:193, pId:19, name:"平顶山市", value:"010903"},
		             { id:194, pId:19, name:"安阳市", value:"010904"},
		             { id:195, pId:19, name:"鹤壁市", value:"010905"},
		             { id:196, pId:19, name:"新乡市", value:"010906"},
		             { id:197, pId:19, name:"焦作市", value:"010907"},
		             { id:198, pId:19, name:"濮阳市", value:"010908"},
		             { id:199, pId:19, name:"许昌市", value:"010909"},
		             { id:1910, pId:19, name:"南阳市", value:"010910"},
		             { id:1911, pId:19, name:"信阳市", value:"010911"},
		             { id:1912, pId:19, name:"郑州市", value:"010912"},
		             { id:1913, pId:19, name:"漯河市", value:"010913"},
		             { id:1914, pId:19, name:"三门峡市", value:"010914"},
		             { id:1915, pId:19, name:"商丘市", value:"010915"},
		             { id:1916, pId:19, name:"周口市", value:"010916"},
		             { id:1917, pId:19, name:"驻马店市", value:"010917"},
		             { id:1918, pId:19, name:"省直辖县级行政区划", value:"010918"},
		             { id:1919, pId:19, name:"济源市", value:"010919"},
		             { id:110, pId:1, name:"海南省", value:"0110"},
		             { id:111, pId:1, name:"重庆市", value:"0111"},
		             { id:1110, pId:111, name:"所有地市", value:"011101,011102"},
		             { id:1111, pId:111, name:"重庆市辖区", value:"011101"},
		             { id:1112, pId:111, name:"县", value:"011102"},
		             { id:112, pId:1, name:"四川省", value:"0112"},
		             { id:1120, pId:112, name:"所有地市", value:"011201,011202,011203,011204,011205,011206,011207,011208,011209,011210,011211,011212,011213,011214,011215,011216,011217,011218,011219,011220,011221"},
		             { id:1121, pId:112, name:"成都市", value:"011201"},
		             { id:1122, pId:112, name:"自贡市", value:"011202"},
		             { id:1123, pId:112, name:"攀枝花市", value:"011203"},
		             { id:1124, pId:112, name:"德阳市", value:"011204"},
		             { id:1125, pId:112, name:"绵阳市", value:"011205"},
		             { id:1126, pId:112, name:"广元市", value:"011206"},
		             { id:1127, pId:112, name:"遂宁市", value:"011207"},
		             { id:1128, pId:112, name:"内江市", value:"011208"},
		             { id:1129, pId:112, name:"乐山市", value:"011209"},
		             { id:11210, pId:112, name:"南充市", value:"011210"},
		             { id:11211, pId:112, name:"眉山市", value:"011211"},
		             { id:11212, pId:112, name:"宜宾市", value:"011212"},
		             { id:11213, pId:112, name:"广安市", value:"011213"},
		             { id:11214, pId:112, name:"达州市", value:"011214"},
		             { id:11215, pId:112, name:"资阳市", value:"011215"},
		             { id:11216, pId:112, name:"泸州市", value:"011216"},
		             { id:11217, pId:112, name:"雅安市", value:"011217"},
		             { id:11218, pId:112, name:"巴中市", value:"011218"},
		             { id:11219, pId:112, name:"阿坝藏族羌族自治州", value:"011219"},
		             { id:11220, pId:112, name:"甘孜藏族自治州", value:"011220"},
		             { id:11221, pId:112, name:"凉山彝族自治州", value:"011221"},
		             { id:113, pId:1, name:"贵州省", value:"0113"},
		             { id:1130, pId:113, name:"所有地市", value:"011301,011302,011303,011304,011305,011306,011307,011308,011309"},
		             { id:1131, pId:113, name:"贵阳市", value:"011301"},
		             { id:1132, pId:113, name:"六盘水市", value:"011302"},
		             { id:1133, pId:113, name:"遵义市", value:"011303"},
		             { id:1134, pId:113, name:"安顺市", value:"011304"},
		             { id:1135, pId:113, name:"铜仁地区", value:"011305"},
		             { id:1136, pId:113, name:"黔西南布依族苗族自治州", value:"011306"},
		             { id:1137, pId:113, name:"黔东南苗族侗族自治州", value:"011307"},
		             { id:1138, pId:113, name:"黔南布依族苗族自治州", value:"011308"},
		             { id:1139, pId:113, name:"毕节地区", value:"011309"},
		             { id:114, pId:1, name:"云南省", value:"0114"},
		             { id:1140, pId:114, name:"所有地市", value:"011401,011402,011403,011404,011405,011406,011407,011408,011409,011410,011411,011412,011413,011414,011415,011416"},
		             { id:1141, pId:114, name:"昆明市", value:"011401"},
		             { id:1142, pId:114, name:"曲靖市", value:"011402"},
		             { id:1143, pId:114, name:"玉溪市", value:"011403"},
		             { id:1144, pId:114, name:"保山市", value:"011404"},
		             { id:1145, pId:114, name:"昭通市", value:"011405"},
		             { id:1146, pId:114, name:"丽江市", value:"011406"},
		             { id:1147, pId:114, name:"普洱市", value:"011407"},
		             { id:1148, pId:114, name:"红河哈尼族彝族自治州", value:"011408"},
		             { id:1149, pId:114, name:"西双版纳傣族自治州", value:"011409"},
		             { id:11410, pId:114, name:"德宏傣族景颇族自治州", value:"011410"},
		             { id:11411, pId:114, name:"迪庆藏族自治州", value:"011411"},
		             { id:11412, pId:114, name:"临沧市", value:"011412"},
		             { id:11413, pId:114, name:"楚雄彝族自治州", value:"011413"},
		             { id:11414, pId:114, name:"文山壮族苗族自治州", value:"011414"},
		             { id:11415, pId:114, name:"大理白族自治州", value:"011415"},
		             { id:11416, pId:114, name:"怒江傈僳族自治州", value:"011416"},
		             { id:115, pId:1, name:"西藏自治区", value:"0115"},
		             { id:1150, pId:115, name:"所有地市", value:"011501,011502,011503,011504,011505,011506,011507"},
		             { id:1151, pId:115, name:"昌都地区", value:"011501"},
		             { id:1152, pId:115, name:"山南地区", value:"011502"},
		             { id:1153, pId:115, name:"日喀则地区", value:"011503"},
		             { id:1154, pId:115, name:"那曲地区", value:"011504"},
		             { id:1155, pId:115, name:"阿里地区", value:"011505"},
		             { id:1156, pId:115, name:"林芝地区", value:"011506"},
		             { id:1157, pId:115, name:"拉萨市", value:"011507"},
		             { id:116, pId:1, name:"湖南省", value:"0116"},
		             { id:1160, pId:116, name:"所有地市", value:"011601,011602,011603,011604,011605,011606,011607,011608,011609,011610,011611,011612,011613,011614"},
		             { id:1161, pId:116, name:"长沙市", value:"011601"},
		             { id:1162, pId:116, name:"株洲市", value:"011602"},
		             { id:1163, pId:116, name:"湘潭市", value:"011603"},
		             { id:1164, pId:116, name:"衡阳市", value:"011604"},
		             { id:1165, pId:116, name:"邵阳市", value:"011605"},
		             { id:1166, pId:116, name:"岳阳市", value:"011606"},
		             { id:1167, pId:116, name:"张家界市", value:"011607"},
		             { id:1168, pId:116, name:"益阳市", value:"011608"},
		             { id:1169, pId:116, name:"郴州市", value:"011609"},
		             { id:11610, pId:116, name:"怀化市", value:"011610"},
		             { id:11611, pId:116, name:"娄底市", value:"011611"},
		             { id:11612, pId:116, name:"湘西土家族苗族自治州", value:"011612"},
		             { id:11613, pId:116, name:"常德市", value:"011613"},
		             { id:11614, pId:116, name:"永州市", value:"011614"},
		             { id:117, pId:1, name:"广东省", value:"0117"},
		             { id:1170, pId:117, name:"所有地市", value:"011701,011702,011703,011704,011705,011706,011707,011708,011709,011710,011711,011712,011713,011714,011715,011716,011717,011718,011719,011720,011721"},
		             { id:1171, pId:117, name:"广州市", value:"011701"},
		             { id:1172, pId:117, name:"韶关市", value:"011702"},
		             { id:1173, pId:117, name:"深圳市", value:"011703"},
		             { id:1174, pId:117, name:"珠海市", value:"011704"},
		             { id:1175, pId:117, name:"汕头市", value:"011705"},
		             { id:1176, pId:117, name:"佛山市", value:"011706"},
		             { id:1177, pId:117, name:"湛江市", value:"011707"},
		             { id:1178, pId:117, name:"茂名市", value:"011708"},
		             { id:1179, pId:117, name:"肇庆市", value:"011709"},
		             { id:11710, pId:117, name:"惠州市", value:"011710"},
		             { id:11711, pId:117, name:"梅州市", value:"011711"},
		             { id:11712, pId:117, name:"河源市", value:"011712"},
		             { id:11713, pId:117, name:"阳江市", value:"011713"},
		             { id:11714, pId:117, name:"清远市", value:"011714"},
		             { id:11715, pId:117, name:"东莞市", value:"011715"},
		             { id:11716, pId:117, name:"中山市", value:"011716"},
		             { id:11717, pId:117, name:"潮州市", value:"011717"},
		             { id:11718, pId:117, name:"揭阳市", value:"011718"},
		             { id:11719, pId:117, name:"云浮市", value:"011719"},
		             { id:11720, pId:117, name:"江门市", value:"011720"},
		             { id:11721, pId:117, name:"汕尾市", value:"011721"},
		             { id:118, pId:1, name:"广西壮族自治区", value:"0118"},
		             { id:1180, pId:118, name:"所有地市", value:"011801,011802,011803,011804,011805,011806,011807,011808,011809,011810,011811,011812,011813,011814"},
		             { id:1181, pId:118, name:"南宁市", value:"011801"},
		             { id:1182, pId:118, name:"柳州市", value:"011802"},
		             { id:1183, pId:118, name:"桂林市", value:"011803"},
		             { id:1184, pId:118, name:"梧州市", value:"011804"},
		             { id:1185, pId:118, name:"北海市", value:"011805"},
		             { id:1186, pId:118, name:"防城港市", value:"011806"},
		             { id:1187, pId:118, name:"钦州市", value:"011807"},
		             { id:1188, pId:118, name:"百色市", value:"011808"},
		             { id:1189, pId:118, name:"贵港市", value:"011809"},
		             { id:11810, pId:118, name:"玉林市", value:"011810"},
		             { id:11811, pId:118, name:"贺州市", value:"011811"},
		             { id:11812, pId:118, name:"河池市", value:"011812"},
		             { id:11813, pId:118, name:"来宾市", value:"011813"},
		             { id:11814, pId:118, name:"崇左市", value:"011814"},
		             { id:119, pId:1, name:"黑龙江省", value:"0119"},
		             { id:1190, pId:119, name:"所有地市", value:"011901,011902,011903,011904,011905,011906,011907,011908,011909,011910,011911,011912,011913"},
		             { id:1191, pId:119, name:"齐齐哈尔市", value:"011901"},
		             { id:1192, pId:119, name:"哈尔滨市", value:"011902"},
		             { id:1193, pId:119, name:"鸡西市", value:"011903"},
		             { id:1194, pId:119, name:"鹤岗市", value:"011904"},
		             { id:1195, pId:119, name:"双鸭山市", value:"011905"},
		             { id:1196, pId:119, name:"大庆市", value:"011906"},
		             { id:1197, pId:119, name:"伊春市", value:"011907"},
		             { id:1198, pId:119, name:"佳木斯市", value:"011908"},
		             { id:1199, pId:119, name:"七台河市", value:"011909"},
		             { id:11910, pId:119, name:"牡丹江市", value:"011910"},
		             { id:11911, pId:119, name:"黑河市", value:"011911"},
		             { id:11912, pId:119, name:"绥化市", value:"011912"},
		             { id:11913, pId:119, name:"大兴安岭地区", value:"011913"},
		             { id:120, pId:1, name:"甘肃省", value:"0120"},
		             { id:1200, pId:120, name:"所有地市", value:"012001,012002,012003,012004,012005,012006,012007,012008,012009,012010,012011,012012,012013,012014"},
		             { id:1201, pId:120, name:"兰州市", value:"012001"},
		             { id:1202, pId:120, name:"嘉峪关市", value:"012002"},
		             { id:1203, pId:120, name:"金昌市", value:"012003"},
		             { id:1204, pId:120, name:"武威市", value:"012004"},
		             { id:1205, pId:120, name:"张掖市", value:"012005"},
		             { id:1206, pId:120, name:"平凉市", value:"012006"},
		             { id:1207, pId:120, name:"酒泉市", value:"012007"},
		             { id:1208, pId:120, name:"庆阳市", value:"012008"},
		             { id:1209, pId:120, name:"陇南市", value:"012009"},
		             { id:12010, pId:120, name:"临夏回族自治州", value:"012010"},
		             { id:12011, pId:120, name:"甘南藏族自治州", value:"012011"},
		             { id:12012, pId:120, name:"白银市", value:"012012"},
		             { id:12013, pId:120, name:"天水市", value:"012013"},
		             { id:12014, pId:120, name:"定西市", value:"012014"},
		             { id:121, pId:1, name:"青海省", value:"0121"},
		             { id:1210, pId:121, name:"所有地市", value:"012101,012102,012103,012104,012105,012106,012107,012108,012109"},
		             { id:1211, pId:121, name:"西宁市", value:"012101"},
		             { id:1212, pId:121, name:"海东地区", value:"012102"},
		             { id:1213, pId:121, name:"海北藏族自治州", value:"012103"},
		             { id:1214, pId:121, name:"黄南藏族自治州", value:"012104"},
		             { id:1215, pId:121, name:"海南藏族自治州", value:"012105"},
		             { id:1216, pId:121, name:"果洛藏族自治州", value:"012106"},
		             { id:1217, pId:121, name:"玉树藏族自治州", value:"012107"},
		             { id:1218, pId:121, name:"格尔木市", value:"012108"},
		             { id:1219, pId:121, name:"海西蒙古族藏族自治州", value:"012109"},
		             { id:123, pId:1, name:"上海市", value:"0123"},
		             { id:1230, pId:123, name:"所有地市", value:"012301,012302"},
		             { id:1231, pId:123, name:"上海市辖区", value:"012301"},
		             { id:1232, pId:123, name:"县", value:"012302"},
		             { id:124, pId:1, name:"江苏省", value:"0124"},
		             { id:1240, pId:124, name:"所有地市", value:"012401,012402,012403,012404,012405,012406,012407,012408,012409,012410,012411,012412,012413"},
		             { id:1241, pId:124, name:"镇江市", value:"012401"},
		             { id:1242, pId:124, name:"宿迁市", value:"012402"},
		             { id:1243, pId:124, name:"南京市", value:"012403"},
		             { id:1244, pId:124, name:"无锡市", value:"012404"},
		             { id:1245, pId:124, name:"徐州市", value:"012405"},
		             { id:1246, pId:124, name:"常州市", value:"012406"},
		             { id:1247, pId:124, name:"苏州市", value:"012407"},
		             { id:1248, pId:124, name:"南通市", value:"012408"},
		             { id:1249, pId:124, name:"连云港市", value:"012409"},
		             { id:12410, pId:124, name:"淮安市", value:"012410"},
		             { id:12411, pId:124, name:"盐城市", value:"012411"},
		             { id:12412, pId:124, name:"扬州市", value:"012412"},
		             { id:12413, pId:124, name:"泰州市", value:"012413"},
		             { id:125, pId:1, name:"浙江省", value:"0125"},
		             { id:1250, pId:125, name:"所有地市", value:"012501,012502,012503,012504,012505,012506,012507,012508,012509,012510,012511"},
		             { id:1251, pId:125, name:"杭州市", value:"012501"},
		             { id:1252, pId:125, name:"宁波市", value:"012502"},
		             { id:1253, pId:125, name:"温州市", value:"012503"},
		             { id:1254, pId:125, name:"嘉兴市", value:"012504"},
		             { id:1255, pId:125, name:"湖州市", value:"012505"},
		             { id:1256, pId:125, name:"绍兴市", value:"012506"},
		             { id:1257, pId:125, name:"金华市", value:"012507"},
		             { id:1258, pId:125, name:"衢州市", value:"012508"},
		             { id:1259, pId:125, name:"舟山市", value:"012509"},
		             { id:12510, pId:125, name:"台州市", value:"012510"},
		             { id:12511, pId:125, name:"丽水市", value:"012511"},
		             { id:126, pId:1, name:"山西省", value:"0126"},
		             { id:1260, pId:126, name:"所有地市", value:"012601,012602,012603,012604,012605,012606,012607,012608,012609,012610,012611"},
		             { id:1261, pId:126, name:"阳泉市", value:"012601"},
		             { id:1262, pId:126, name:"晋城市", value:"012602"},
		             { id:1263, pId:126, name:"朔州市", value:"012603"},
		             { id:1264, pId:126, name:"太原市", value:"012604"},
		             { id:1265, pId:126, name:"大同市", value:"012605"},
		             { id:1266, pId:126, name:"长治市", value:"012606"},
		             { id:1267, pId:126, name:"晋中市", value:"012607"},
		             { id:1268, pId:126, name:"运城市", value:"012608"},
		             { id:1269, pId:126, name:"忻州市", value:"012609"},
		             { id:12610, pId:126, name:"临汾市", value:"012610"},
		             { id:12611, pId:126, name:"吕梁市", value:"012611"},
		             { id:127, pId:1, name:"内蒙古自治区", value:"0127"},
		             { id:1270, pId:127, name:"所有地市", value:"012701,012702,012703,012704,012705,012706,012707,012708,012709,012710,012711,012712"},
		             { id:1271, pId:127, name:"乌海市", value:"012701"},
		             { id:1272, pId:127, name:"赤峰市", value:"012702"},
		             { id:1273, pId:127, name:"呼和浩特市", value:"012703"},
		             { id:1274, pId:127, name:"包头市", value:"012704"},
		             { id:1275, pId:127, name:"通辽市", value:"012705"},
		             { id:1276, pId:127, name:"鄂尔多斯市", value:"012706"},
		             { id:1277, pId:127, name:"呼伦贝尔市", value:"012707"},
		             { id:1278, pId:127, name:"巴彦淖尔市", value:"012708"},
		             { id:1279, pId:127, name:"乌兰察布市", value:"012709"},
		             { id:12710, pId:127, name:"兴安盟", value:"012710"},
		             { id:12711, pId:127, name:"锡林郭勒盟", value:"012711"},
		             { id:12712, pId:127, name:"阿拉善盟", value:"012712"},
		             { id:128, pId:1, name:"陕西省", value:"0128"},
		             { id:1280, pId:128, name:"所有地市", value:"012801,012802,012803,012804,012805,012806,012807,012808,012809,012810"},
		             { id:1281, pId:128, name:"铜川市", value:"012801"},
		             { id:1282, pId:128, name:"咸阳市", value:"012802"},
		             { id:1283, pId:128, name:"西安市", value:"012803"},
		             { id:1284, pId:128, name:"宝鸡市", value:"012804"},
		             { id:1285, pId:128, name:"渭南市", value:"012805"},
		             { id:1286, pId:128, name:"延安市", value:"012806"},
		             { id:1287, pId:128, name:"汉中市", value:"012807"},
		             { id:1288, pId:128, name:"榆林市", value:"012808"},
		             { id:1289, pId:128, name:"安康市", value:"012809"},
		             { id:12810, pId:128, name:"商洛市", value:"012810"},
		             { id:129, pId:1, name:"宁夏回族自治区", value:"0129"},
		             { id:1290, pId:129, name:"所有地市", value:"012901,012902,012903,012904,012905"},
		             { id:1291, pId:129, name:"石嘴山市", value:"012901"},
		             { id:1292, pId:129, name:"吴忠市", value:"012902"},
		             { id:1293, pId:129, name:"固原市", value:"012903"},
		             { id:1294, pId:129, name:"银川市", value:"012904"},
		             { id:1295, pId:129, name:"中卫市", value:"012905"},
		             { id:130, pId:1, name:"新疆维吾尔自治区", value:"0130"},
		             { id:1300, pId:130, name:"所有地市", value:"013001,013002,013003,013004,013005,013006,013007,013008,013009,013010,013011,013012,013013,013014,013015,013016,013017"},
		             { id:1301, pId:130, name:"克拉玛依市", value:"013001"},
		             { id:1302, pId:130, name:"吐鲁番地区", value:"013002"},
		             { id:1303, pId:130, name:"伊犁哈萨克自治州", value:"013003"},
		             { id:1304, pId:130, name:"奎屯市", value:"013004"},
		             { id:1305, pId:130, name:"石河子市", value:"013005"},
		             { id:1306, pId:130, name:"乌鲁木齐市", value:"013006"},
		             { id:1307, pId:130, name:"哈密地区", value:"013007"},
		             { id:1308, pId:130, name:"昌吉回族自治州", value:"013008"},
		             { id:1309, pId:130, name:"博尔塔拉蒙古自治州", value:"013009"},
		             { id:13010, pId:130, name:"巴音郭楞蒙古自治州", value:"013010"},
		             { id:13011, pId:130, name:"阿克苏地区", value:"013011"},
		             { id:13012, pId:130, name:"克孜勒苏柯尔克孜自治州", value:"013012"},
		             { id:13013, pId:130, name:"喀什地区", value:"013013"},
		             { id:13014, pId:130, name:"和田地区", value:"013014"},
		             { id:13015, pId:130, name:"塔城地区", value:"013015"},
		             { id:13016, pId:130, name:"阿勒泰地区", value:"013016"},
		             { id:13017, pId:130, name:"自治区直辖县级行政区划", value:"013017"},
		             { id:131, pId:1, name:"辽宁省", value:"0131"},
		             { id:1310, pId:131, name:"所有地市", value:"013101,013102,013103,013104,013105,013106,013107,013108,013109,013110,013111,013112,013113,013114"},
		             { id:1311, pId:131, name:"沈阳市", value:"013101"},
		             { id:1312, pId:131, name:"大连市", value:"013102"},
		             { id:1313, pId:131, name:"本溪市", value:"013103"},
		             { id:1314, pId:131, name:"丹东市", value:"013104"},
		             { id:1315, pId:131, name:"锦州市", value:"013105"},
		             { id:1316, pId:131, name:"阜新市", value:"013106"},
		             { id:1317, pId:131, name:"辽阳市", value:"013107"},
		             { id:1318, pId:131, name:"盘锦市", value:"013108"},
		             { id:1319, pId:131, name:"铁岭市", value:"013109"},
		             { id:13110, pId:131, name:"朝阳市", value:"013110"},
		             { id:13111, pId:131, name:"葫芦岛市", value:"013111"},
		             { id:13112, pId:131, name:"鞍山市", value:"013112"},
		             { id:13113, pId:131, name:"抚顺市", value:"013113"},
		             { id:13114, pId:131, name:"营口市", value:"013114"},
		             { id:132, pId:1, name:"吉林省", value:"0132"},
		             { id:1320, pId:132, name:"所有地市", value:"013201,013202,013203,013204,013205,013206,013207,013208,013209"},
		             { id:1321, pId:132, name:"长春市", value:"013201"},
		             { id:1322, pId:132, name:"吉林市", value:"013202"},
		             { id:1323, pId:132, name:"四平市", value:"013203"},
		             { id:1324, pId:132, name:"辽源市", value:"013204"},
		             { id:1325, pId:132, name:"白山市", value:"013205"},
		             { id:1326, pId:132, name:"松原市", value:"013206"},
		             { id:1327, pId:132, name:"通化市", value:"013207"},
		             { id:1328, pId:132, name:"白城市", value:"013208"},
		             { id:1329, pId:132, name:"延边朝鲜族自治州", value:"013209"}];
		
		function setCheck() {
			var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
			py = "",
			sy = "",
			pn = "",
			sn = "",
			type = { "Y":py + sy, "N":pn + sn};
			zTree.setting.check.chkboxType = type;
			
		}
		
//		function beforeClick(treeId, treeNode) {
//			if(!(treeNode.children) || treeNode.children.length<0){
//				alert(treeNode.value+"没有子节点");
//				var zTree = $.fn.zTree.getZTreeObj("treeDemo");
//				treeNode.icon = "../css/zTreeStyle/img/loading.gif";
//				zTree.updateNode(treeNode);
//				getChildDirByClick(treeNode, treeNode.value, treeNode.id);
//			}
//			getChildDirByClick(treeNode.value);
//		}
		
		var areas="";
		
		function onCheck(e, treeId, treeNode) {
			//checkAllParents(treeNode);
			//alert(treeNode.value);
			//$("#curDir").val("hdfs://shzxcluster01"+treeNode.value);  
			 var treeObj=$.fn.zTree.getZTreeObj("treeDemo");
	         checkedNodes=treeObj.getCheckedNodes(true);
	         var v="";
	         for(var i=0;i<checkedNodes.length;i++){
//	        	 if(!(checkedNodes[i].children) || checkedNodes[i].children.length<0){
//	        		 v+=checkedNodes[i].value + ",";
//	        		 
//	        	 }
	        	 v+=checkedNodes[i].value + ",";
	         }
	         areas = v;
//	         alert(areas);
		}

		$(document).ready(function(){
			$.fn.zTree.init($("#treeDemo"), setting, zNodes);
			setCheck();
			
		});		

function submitRequest() {
    var clearNullParams = function (parms) {
        for (var i = 0; i < parms.length;) {
            if (parms[i].value == null || parms[i].value.length < 1 || $.trim(parms[i]) == "") {
                parms.splice(i, 1);//浠庢暟缁勪腑鍒犻櫎鍊间负绌虹殑灞炴�
            } else {
                i++;//灞炴�鍊间笉涓虹┖鍒欓獙璇佷笅涓�釜
            }
        }
        return parms;
    };
    var indcvalues = "";
    $('#indc :selected').each(function(i, selected) {
    	indcvalues += $(selected).val() + ",";
    });
    $.ajax({
        type: "POST",
        url: $('#payForm').attr('action'),
        //data: clearNullParams($('#payForm').serializeArray()),
        data : {
        	"indc" : indcvalues,
        	"dataId" : $("#dataId").val(),
        	"areaId" : $("#areaId").val(),
			"area" : areas,
			"indcSet" : $("#indcSet").val(),
			"startdate" : $("#startdate").val(),
			"enddate" : $("#enddate").val(),
			"cycle" : $("#cycle").val(),
			"ws" : $("#ws").val(),
		},
        dataType: 'json',
        success: function (result) {
             var vo=result.message
             if(vo instanceof Array)
               $('#message').val(vo[0].indcID+" "+vo[0].indcValue);
             else
                $('#message').val(result.message);
             var req=result.req;
             $('#reqSeq').val(req);
         
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            $('#message').val('');
        }
    });
}

function submitRequestCem() {
    var clearNullParams = function (parms) {
        for (var i = 0; i < parms.length;) {
            if (parms[i].value == null || parms[i].value.length < 1 || $.trim(parms[i]) == "") {
                parms.splice(i, 1);
            } else {
                i++;
            }
        }
        return parms;
    };
    $.ajax({
        type: "POST",
        url: $('#payForm').attr('action'),
        data: clearNullParams($('#payForm').serializeArray()),
        dataType: 'json',
        async:true,
        success: function (result) {
            
             var vo=result.message;
             if(vo instanceof Array)
               $('#message').val(vo[0].indcID+" "+vo[0].indcValue);
             else
                $('#message').val(result.message);
             var req=result.req;
             $('#reqSeq').val(req);
         
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            $('#message').val('');
        }
    });
    $('#message').val("submit success!");
    alert("submit success!");
}


function submitRequestBatchCem() {
    var clearNullParams = function (parms) {
        for (var i = 0; i < parms.length;) {
            if (parms[i].value == null || parms[i].value.length < 1 || $.trim(parms[i]) == "") {
                parms.splice(i, 1);
            } else {
                i++;
            }
        }
        return parms;
    };
    $.ajax({
        type: "POST",
        url: $('#payForm').attr('action'),
        data: clearNullParams($('#payForm').serializeArray()),
        dataType: 'json',
        async:true,
        success: function (result) {
            
             var vo=result.message;
             if(vo instanceof Array)
               $('#message').val(vo[0].indcID+" "+vo[0].indcValue);
             else
                $('#message').val(result.message);
             var req=result.req;
             $('#reqSeq').val(req);
         
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            $('#message').val('');
        }
    });
    $('#message').val("submit success!");
    alert("submit success!");
}
function exportList() {
  $("#batch").html(""); 
  var str='';
  for(i=1;i<6;i++){
   str=str+'<tr class="table-control"><td><a href="javascript:batchExport(' + i + ')";>del</a></td></tr>';
   }
  $("#batch").append(str);
}
function batchExport(i) {
 alert(i);
}



