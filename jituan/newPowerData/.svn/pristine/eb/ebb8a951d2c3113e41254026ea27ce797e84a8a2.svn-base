package com.ccssoft.rsas.nsg.dom;

import java.util.Map;

import org.dom4j.DocumentHelper;

import com.ccssoft.rsas.nsg.util.ResultSet;
import com.ccssoft.rsas.nsg.util.XMLUtil;
import com.ccssoft.rsas.nsg.util.xmlToMap;

public class BOSSDom {
    
    /**
     * <p>实时查询用户宽带信息接口</p>
     * @return
     */
    public ResultSet s1267QryL(){
        ResultSet resultSet = new ResultSet();
        String oldServer = "sQryKdInfoL";          //功能类型  固定值：sQryKdInfoL
        String loginNo = "";            //操作工号
        String qryType = "";            //查询类型          1、根据登录账号查询(宽带账号）2、根据证件号码查询 3、根据联系人号码查询
        String oprValue = "";           //查询条件            根据上面QRY_TYPE不同传值不同
        
        StringBuilder sb = new StringBuilder();
        sb.append(XMLUtil.DEFAULT_XML_DECLARATION_WITH_UTF8);
        sb.append("<ROOT>");
        sb.append("<OLD_SERVER>").append(oldServer).append("</OLD_SERVER>");
        sb.append("<LOGIN_NO>").append(loginNo).append("</LOGIN_NO>");
        sb.append("<QRY_TYPE>").append(qryType).append("</QRY_TYPE>");
        sb.append("<OPR_VALUE>").append(oprValue).append("</OPR_VALUE>");
        sb.append("</ROOT>");
        String inputXML = sb.toString();
        System.out.println(inputXML);
        
        //call resultXML
        String resultXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<ROOT>"
                + "<RETURN_CODE>0</RETURN_CODE>"
                + "<RETURN_MSG>成功</RETURN_MSG>"
                + "<OUT_DATA>"
                + "  <PHONE_NO>13602454573</PHONE_NO>"
                + "  <ITEL_ACCOUNT>sn020</ITEL_ACCOUNT>"
                + "  <STAND_ADDRESS>四川成都郫县移动无线音乐基地</STAND_ADDRESS>"
                + "</OUT_DATA>"
                + "</ROOT>";
        try{
            org.dom4j.Document doc = DocumentHelper.parseText(resultXML);
            Map<String, Object> map2 = xmlToMap.Dom2Map(doc);
            System.out.println(map2.toString());
            Map<String, Object> map3 = (Map<String, Object>) map2.get("OUT_DATA");
            System.out.println(map3.toString());
            resultSet.putObjectValue("/ROOT/OUT_DATA", map3);
            resultSet.putObjectValue("/ROOT", map2);
        }catch(Exception e){
            System.out.println(e.toString());
        }

        return resultSet;
    }
    
    /**
     * <p>实时查询宽带明细信息接口</p>
     * @return
     */
    public ResultSet sQryGdWindMsgL(){
        ResultSet resultSet = new ResultSet();
        String provinceGroup = "10008";          //省份代码  固定值：10008
        String qryType = "1";            //查询类型          固定值：1
        String loginNo = "";            //操作工号
        String phoneNo = "";           //查询条件            209号码
        StringBuilder sb = new StringBuilder();
        sb.append(XMLUtil.DEFAULT_XML_DECLARATION_WITH_UTF8);
        sb.append("<ROOT>");
        sb.append("<PROVINCE_GROUP>").append(provinceGroup).append("</PROVINCE_GROUP>");
        sb.append("<QRY_TYPE>").append(qryType).append("</QRY_TYPE>");
        sb.append("<LOGIN_NO>").append(loginNo).append("</LOGIN_NO>");
        sb.append("<PHONE_NO>").append(phoneNo).append("</PHONE_NO>");
        sb.append("</ROOT>");
        String inputXML = sb.toString();
        
        //call resultXML
        
        String resultXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                + "<ROOT>"
                + "  <RETURN_CODE>0</RETURN_CODE>"
                + "  <RETURN_MSG>成功</RETURN_MSG>"
                + "  <OUT_DATA>"
                + "    <KD_PHONE_NO>209209209</KD_PHONE_NO>"
                + "    <ID_NO>10000</ID_NO>"
                + "    <RUN_CODE>0</RUN_CODE>"
                + "    <REGION_ID>192</REGION_ID>"
                + "    <ID_ICCID>141323213</ID_ICCID>"
                + "    <ID_TYPE/>"
                + "    <CUST_NAME>移动无线音乐基地</CUST_NAME>"
                + "    <CUST_ADDRESS>百草路0000号</CUST_ADDRESS>"
                + "    <ENTER_NO>136****</ENTER_NO>"
                + "    <ITEL_ACCOUNT>136****</ITEL_ACCOUNT>"
                + "    <ATTR_NAME>1</ATTR_NAME>"
                + "    <ENTER_DATE>2000-12-10 12:10:00</ENTER_DATE>"
                + "    <LINK_NUM>5</LINK_NUM>"
                + "    <ENTER_TYPE>2</ENTER_TYPE>"
                + "    <AREA_NAME>CD</AREA_NAME>"
                + "    <BIND_WIDTH>100M</BIND_WIDTH>"
                + "    <DOMAIN_NAME/>"
                + "    <STAND_ADDRESS/>"
                + "    <EXTERN_ADDRESS>百草路159号</EXTERN_ADDRESS>"
                + "    <ADDRESS_ID>101</ADDRESS_ID>"
                + "    <BUILDADDRESS_ID/>"
                + "    <MODE_BEGINTIME>2000-12-10 12:10:00</MODE_BEGINTIME>"
                + "    <MODE_ENDTIME>2016-12-10 12:10:00</MODE_ENDTIME>"
                + "    <MODE_NAME1>de</MODE_NAME1>"
                + "    <MODE_BEGINTIME1/>"
                + "    <MODE_ENDTIME1/>"
                + "    <DEAL_FLAG>Y</DEAL_FLAG>"
                + "    <GD_ID>10000</GD_ID>"
                + "    <CONTRACT_NO_01>12112121</CONTRACT_NO_01>"
                + "    <TAX_NUM>121212121</TAX_NUM>"
                + "    <CON_PHONENO2/>"
                + "    <HOPE_DATE>2016-12-10 12:10:00</HOPE_DATE>"
                + "    <IS_PRE_OPEN>0</IS_PRE_OPEN>"
                + "    <IS_PRE_CFM>0</IS_PRE_CFM>"
                + "    <REGION_ID>1</REGION_ID>"
                + "    <REGION_NAME>成都</REGION_NAME>"
                + "    <PAY_TYPE>YF</PAY_TYPE>"
                + "    <OPEN_GROUP>移动营业厅101</OPEN_GROUP>"
                + "    <OPEN_LOGIN_NO/>    <BRAND_ID/>    <BRAND_NAME/>    <EFFECT_FAMILY_PROD/>"
                + "    <EFFECT_FP_BEGINTIME/>    <NEXT_FAMILY_PROD/>    <NEXT_FP_BEGINTIME/>"
                + "    <EFFECT_PROD_PRCID>12121</EFFECT_PROD_PRCID>"
                + "  </OUT_DATA>"
                + "</ROOT>";
        
        try{
            org.dom4j.Document doc = DocumentHelper.parseText(resultXML);
            Map<String, Object> map2 = xmlToMap.Dom2Map(doc);
            System.out.println(map2.toString());
            Map<String, Object> map3 = (Map<String, Object>) map2.get("OUT_DATA");
            System.out.println(map3.toString());
            
            resultSet.putObjectValue("/ROOT/OUT_DATA", map3);
            resultSet.putObjectValue("/ROOT", map2);
            
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return resultSet;
    }
}
