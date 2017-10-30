define(function(require){
    'use strict'
    require("Vue")
    require("jquery")
    require("Polyfill")
    return Vue.extend({
        el: '#userinfo',
        data : function(){
            return {
                infos : []
            }
        },
        ready : function(){
            this.userInfo("",[])
        },
        methods : {
            userInfo : function (url,param) {
                $.ajax({
                    url : url,
                    data : param,
                    success : function(data){
                        data = [{"CONTACTOR":"客户姓名data","CUSTOMER_LEVEL":"客户等级data","PRODUCT_TYPE":"产品data","ID":"定单号data","BROAD_BAND_ID":"宽带账号data","INSTALL_ADDRESS_NEW":"装机地址data"}];
                        this.infos = data;
                    }.bind(this)
                })
            }
        }   
    })
}
    