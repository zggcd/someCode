package com.ccssoft.rsas.nsg.dom;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

import com.ccssoft.rsas.nsg.util.ResultSet;
import com.ccssoft.rsas.nsg.util.SOAPXMLUtil;
import com.ccssoft.rsas.nsg.util.XMLUtil;
import com.ccssoft.rsas.nsg.util.xmlToMap;

public class HuaWeiDom {

    /**
     * 根据用户名或在线 IP查询用户信息接口
     */
    public ResultSet queryUserByUNorIP() {
        ResultSet result = new ResultSet();
        String sequenceNo = "";
        String srcDeviceType = "";
        String srcDeviceId = "";
        String loginName = "";
        String ipAddress = "";
        String userPort = "";

        StringBuilder req = new StringBuilder();

        // req.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        req.append(XMLUtil.DEFAULT_XML_DECLARATION_WITH_UTF8);
        req.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:bro=\"http:// broad.operate.common.soap.aaa.huawei.com\" xmlns:xsd=\"http://broad.bean.soap.aaa.huawei.com/xsd\">");
        req.append("<soapenv:Header/>");
        req.append("<soapenv:Body>");
        req.append("<bro:queryUserByUNorIP>");
        req.append("<bro:queryUserByUNorIPBean>");
        // 设置参数值
        req.append("<xsd:sequenceNo>").append(sequenceNo).append("</xsd:sequenceNo>");
        req.append("<xsd:srcDeviceType>").append(srcDeviceType).append("</xsd:srcDeviceType>");
        req.append("<xsd:srcDeviceId>").append(srcDeviceId).append("</xsd:srcDeviceId>");
        req.append("<xsd:loginName>").append(loginName).append("</xsd:loginName>");
        req.append("<xsd:ipAddress>").append(ipAddress).append("</xsd:ipAddress>");
        req.append("<xsd:userPort>").append(userPort).append("</xsd:userPort>");

        req.append("</bro:queryUserByUNorIPBean>");
        req.append("</bro:queryUserByUNorIP>");
        req.append("</soapenv:Body>");
        req.append("</soapenv:Envelope>");
        // 以上为请求报文

        String res =
                "<?xml version=\"1.0\" encoding=\"utf-8\"?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><soapenv:Body><ns2:queryUserByUNorIPResponse xmlns:ns2=\"http://broad.operate.common.soap.aaa.huawei.com\"><ns2:return><ns1:sequenceNo xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\">201305201233450001</ns1:sequenceNo><ns1:resultCode xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\">0</ns1:resultCode><ns1:serviceLevel xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\">1</ns1:serviceLevel><ns1:status xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\">1</ns1:status><ns1:subState xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\">1</ns1:subState><ns1:serviceStop xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\">20140521235959</ns1:serviceStop><ns1:areaid xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\">-1</ns1:areaid><ns1:QOS xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\"></ns1:QOS><ns1:loginName xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\">aaa@-1</ns1:loginName></ns2:return> </ns2:queryUserByUNorIPResponse></soapenv:Body></soapenv:Envelope>";

        try {
            // 将xml直接转成map
            Map<String, Object> map = new HashMap<String, Object>();
            org.dom4j.Document doc = DocumentHelper.parseText(res);
            map = xmlToMap.Dom2Map(doc);
            result.setResultSet(map);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // map.put("sequenceNo", "201305201233450001");
        // map.put("resultCode", "0");
        // map.put("serviceLevel", "1");
        // map.put("status", 1);
        // map.put("substate", 1);
        // map.put("serviceStop", "20140521235959");
        // map.put("areaid", "-1");
        // map.put("", "");
        // map.put("loginName", "aaa@-1");

        return result;

    }

    /**QuerySubscriberCDR
     * 查询用户上网信息接口
     */
    public ResultSet QuerySubscriberCDR() {
        ResultSet result = new ResultSet();
        String CommandId = "QuerySubscriberCDR";// 固定检查为QuerySubscriberCDR
        String Version = "1";// 固定检查为1
        String TransactionId = null;// 固定检查为”null”
        String SequenceId = "1";// 固定检查为1
        String RequestType = "Event";// 固定检查为Event,区分大小写，由xsd文件限制。
        String SerialNo = "";
        String Domain = "";
        String AccessType = "";
        String StartTime = "";
        String EndTime = "";

        StringBuilder req = new StringBuilder();
        req.append(XMLUtil.DEFAULT_XML_DECLARATION_WITH_UTF8);
        req.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:bus=\"http:// www.huawei.com/bme/aaainterface/cbs/businessmgrmsg\" xmlns:com=\"http://www.huawei.com/bme/ aaainterface/common\" xmlns:bus1=\"http://www.huawei.com/bme/aaainterface/cbs/businessmgr\">");
        req.append("<soapenv:Header/>");
        req.append("<soapenv:Body>");
        req.append("<bus:QuerySubscriberCDRRequestMsg>");
        req.append("<RequestHeader>");
        // 设置参数值
        req.append("<com:CommandId>").append(CommandId).append("</com:CommandId>");
        req.append("<com:Version>").append(Version).append("</com:Version>");
        req.append("<com:TransactionId>").append(TransactionId).append("</com:TransactionId>");
        req.append("<com:SequenceId>").append(SequenceId).append("</com:SequenceId>");
        req.append("<com:RequestType>Event</com:RequestType>");
        req.append("<com:SerialNo>").append(SerialNo).append("</com:SerialNo>");
        req.append("</RequestHeader>");
        req.append("<QuerySubscriberCDRRequest>");
        req.append("<bus1:Domain>").append(Domain).append("</bus1:Domain>");
        req.append("<bus1:AccessType>").append(AccessType).append("</bus1:AccessType>");
        req.append("<bus1:StartTime>").append(StartTime).append("</bus1:StartTime>");
        req.append("<bus1:EndTime>").append(EndTime).append("</bus1:EndTime>");

        req.append("</QuerySubscriberCDRRequest>");
        req.append("</bus:QuerySubscriberCDRRequestMsg>");
        req.append("</soapenv:Body>");
        req.append("</soapenv:Envelope>");

        String res =
                "<?xml version=\"1.0\" encoding=\"utf-8\"?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><soapenv:Body> <ns3:QuerySubscriberCDRResultMsg xmlns:ns3=\"http://www.huawei.com/bme/aaainterface/cbs/businessmgrmsg\"><ResultHeader><ns1:CommandId xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/common\">QuerySubscriberCDR</ns1:CommandId><ns1:Version xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/common\">1</ns1:Version><ns1:TransactionId xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/common\">null</ns1:TransactionId><ns1:SequenceId xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/common\">1</ns1:SequenceId><ns1:ResultCode xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/common\">405000000</ns1:ResultCode><ns1:ResultDesc xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/common\">查询用户上网信 息成功。</ns1:ResultDesc></ResultHeader><QuerySubscriberCDRResult><CDRInfo xmlns=\"http://www.huawei.com/bme/aaainterface/cbs/businessmgr\"><SubscriberID>test@-1</SubscriberID><AccessType>4</AccessType><CalledStationID/><CallingStationID/><UserIpAddr/><BeginTime>20111201000000</BeginTime>"
                        + "<EndTime>20111202000000</EndTime><TimeLength>0</TimeLength> <InputBytes>0</InputBytes><OutputBytes>0</OutputBytes><NASIdentifier/>ZJNBO-MC-CMNET-BRAS42-BLDGME6<NASIdentifier/><NASIPAddr>221.131.204.233</NASIPAddr><NASPortID>slot=4;subslot=2;port=4;vlanid=1350;vlanid2=1892;</NASPortID></CDRInfo><CDRInfo xmlns=\"http://www.huawei.com/bme/aaainterface/cbs/businessmgr\"><SubscriberID>test@-1</SubscriberID><AccessType>4</AccessType><CalledStationID/><CallingStationID/><UserIpAddr/><BeginTime>20111201000000</BeginTime><EndTime>20111202000000</EndTime><TimeLength>0</TimeLength><InputBytes>0</InputBytes><OutputBytes>0</OutputBytes><NASIdentifier/>ZJLSH-MC-CMNET-BRAS08-JY_ME60<NASIdentifier/><NASIPAddr>221.131.226.237</NASIPAddr><NASPortID>slot=5;subslot=2;port=25;vlanid=1031;vlanid2=1044;</NASPortID></CDRInfo> </QuerySubscriberCDRResult> </ns3:QuerySubscriberCDRResultMsg> </soapenv:Body> </soapenv:Envelope>";

        try {
            Map<String, Object> map = new HashMap<String, Object>();
            org.dom4j.Document doc = DocumentHelper.parseText(res);
            map = xmlToMap.Dom2Map(doc);
            result.setResultSet(map);
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 查询在线用户统计信息接口
     */

    public ResultSet QueryOnlineGroupSubscriber() {
        ResultSet result = new ResultSet();
        String CommandId = "QueryOnlineGroupSubscriber";// 固定检查为QueryOnlineGroupSubscriber
        String Version = "1";// 固定检查为1
        String TransactionId = null;// 固定检查为”null”
        String SequenceId = "1";// 固定检查为1
        String RequestType = "Event";// 固定检查为Event
        String SerialNo = "";
        String Domain = "";

        StringBuilder req = new StringBuilder();
        req.append(XMLUtil.DEFAULT_XML_DECLARATION_WITH_UTF8);
        req.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:bus=\"http:// www.huawei.com/bme/aaainterface/cbs/businessmgrmsg\" xmlns:com=\"http://www.huawei.com/bme/ aaainterface/common\" xmlns:bus1=\"http://www.huawei.com/bme/aaainterface/cbs/businessmgr\">");
        req.append("<soapenv:Header/>");
        req.append("<soapenv:Body>");
        req.append("<bus:QueryOnlineGroupSubscriberRequestMsg>");
        req.append("<RequestHeader>");
        // 设置参数值
        req.append("<com:CommandId>").append(CommandId).append("</com:CommandId>");
        req.append("<com:Version>").append(Version).append("</com:Version>");
        req.append("<com:TransactionId>").append(TransactionId).append("</com:TransactionId>");
        req.append("<com:SequenceId>").append(SequenceId).append("</com:SequenceId>");
        req.append("<com:RequestType>").append(RequestType).append("</com:RequestType>");
        req.append("<com:SerialNo>").append(SerialNo).append("</com:SerialNo>");
        req.append("</RequestHeader>");
        req.append("<QueryOnlineGroupSubscriberRequest>");
        req.append("<bus1:Domain>").append(Domain).append("</bus1:Domain>");
        req.append("</QueryOnlineGroupSubscriberRequest>");
        req.append("</bus:QueryOnlineGroupSubscriberRequestMsg>");
        req.append("</soapenv:Body>");
        req.append("</soapenv:Envelope>");

        String res =
                "<?xml version=\"1.0\" encoding=\"utf-8\"?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><soapenv:Body><ns3:QueryOnlineGroupSubscriberResultMsg xmlns:ns3=\"http://www.huawei.com/bme/aaainterface/cbs/businessmgrmsg\"><ResultHeader><ns1:CommandId xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/ common\">QueryOnlineGroupSubscriber</ns1:CommandId>"
                        + "<ns1:Version xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/common\">1</ns1:Version><ns1:TransactionId xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/common\">null</ns1:TransactionId><ns1:SequenceId xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/common\">1</ns1:SequenceId><ns1:ResultCode xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/common\">405000000</ns1:ResultCode><ns1:ResultDesc xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/common\">查询在线用户统 计信息成功。</ns1:ResultDesc></ResultHeader><QueryOnlineGroupSubscriberResult><ns2:OnlineCount xmlns:ns2=\"http://www.huawei.com/bme/aaainterface/cbs/businessmgr\">0</ns2:OnlineCount></QueryOnlineGroupSubscriberResult></ns3:QueryOnlineGroupSubscriberResultMsg></soapenv:Body> </soapenv:Envelope>";

        try {
            Map<String, Object> map = new HashMap<String, Object>();
            org.dom4j.Document doc = DocumentHelper.parseText(res);
            map = xmlToMap.Dom2Map(doc);
            result.setResultSet(map);
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 查询用户模板信息接口
     */
    public ResultSet QueryTemplateInfo() {
        ResultSet result = new ResultSet();
        String CommandId = "QueryTemplateInfo";// 固定值
        String Version = "1";// 固定检查为1
        String TransactionId = null;// 固定检查为”null”
        String SequenceId = "1";// 固定检查为1
        String RequestType = "Event";// 固定检查为Event
        String SerialNo = "";

        StringBuilder req = new StringBuilder();
        req.append(XMLUtil.DEFAULT_XML_DECLARATION_WITH_UTF8);
        req.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:bus=\"http:// www.huawei.com/bme/aaainterface/cbs/businessmgrmsg\" xmlns:com=\"http://www.huawei.com/bme/ aaainterface/common\">");
        req.append("<soapenv:Header/>");
        req.append("<soapenv:Body>");
        req.append("<bus:QueryTemplateInfoRequestMsg>");
        req.append("<RequestHeader>");
        // 设置参数
        req.append("<com:CommandId>QueryTemplateInfo</com:CommandId>");
        req.append("<com:Version>").append(Version).append("</com:Version>");
        req.append("<com:TransactionId>").append(TransactionId).append("</com:TransactionId>");
        req.append("<com:SequenceId>").append(SequenceId).append("</com:SequenceId>");
        req.append("<com:RequestType>").append(RequestType).append("</com:RequestType>");
        req.append("<com:SerialNo>").append(SerialNo).append("</com:SerialNo>");

        req.append("</RequestHeader>");
        req.append("<QueryTemplateInfoRequest/>");
        req.append("</bus:QueryTemplateInfoRequestMsg>");
        req.append("</soapenv:Body>");
        req.append("</soapenv:Envelope>");

        String res =
                "<?xml version=\"1.0\" encoding=\"utf-8\"?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:bus=\"http://www.huawei.com/bme/aaainterface/cbs/businessmgrmsg\" xmlns:com=\"http://www.huawei.com/bme/aaainterface/common\"><soapenv:Header/><soapenv:Body><bus:QueryTemplateInfoRequestMsg><RequestHeader><com:CommandId>QueryTemplateInfo</com:CommandId>"
                        + "<com:Version>1</com:Version><com:TransactionId>null</com:TransactionId><com:SequenceId>1</com:SequenceId><com:RequestType>Event</com:RequestType><com:SerialNo>1</com:SerialNo></RequestHeader><QueryTemplateInfoRequest/></bus:QueryTemplateInfoRequestMsg></soapenv:Body></soapenv:Envelope>";
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            org.dom4j.Document doc = DocumentHelper.parseText(res);
            map = xmlToMap.Dom2Map(doc);
            result.setResultSet(map);
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 查询业务信息接口
     */
    public ResultSet QueryServiceInfo() {
        ResultSet result = new ResultSet();
        String CommandId = "QueryServiceInfo";// 固定值
        String Version = "1";// 固定检查为1
        String TransactionId = null;// 固定检查为”null”
        String SequenceId = "1";// 固定检查为1
        String RequestType = "Event";// 固定检查为Event
        String SerialNo = "";

        StringBuilder req = new StringBuilder();
        req.append(XMLUtil.DEFAULT_XML_DECLARATION_WITH_UTF8);
        req.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:bus=\"http:// www.huawei.com/bme/aaainterface/cbs/businessmgrmsg\" xmlns:com=\"http://www.huawei.com/bme/ aaainterface/common\">");
        req.append("<soapenv:Header/>");
        req.append("<soapenv:Body>");
        req.append("<bus:QueryServiceInfoRequestMsg>");
        req.append("<RequestHeader>");
        // 设置参数值
        req.append("<com:CommandId>QueryTemplateInfo</com:CommandId>");
        req.append("<com:Version>").append(Version).append("</com:Version>");
        req.append("<com:TransactionId>").append(TransactionId).append("</com:TransactionId>");
        req.append("<com:SequenceId>").append(SequenceId).append("</com:SequenceId>");
        req.append("<com:RequestType>").append(RequestType).append("</com:RequestType>");
        req.append("<com:SerialNo>").append(SerialNo).append("</com:SerialNo>");

        req.append("</RequestHeader>");
        req.append("<QueryServiceInfoRequest/>");
        req.append("</bus:QueryServiceInfoRequestMsg>");
        req.append("</soapenv:Body>");
        req.append("</soapenv:Envelope>");

        String res =
                "<?xml version=\"1.0\" encoding=\"utf-8\"?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><soapenv:Body><ns3:QueryServiceInfoResultMsg xmlns:ns3=\"http://www.huawei.com/bme/aaainterface/cbs/businessmgrmsg\"> <ResultHeader><ns1:CommandId xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/common\">QueryServiceInfo</ns1:CommandId><ns1:Version xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/common\">1</ns1:Version><ns1:TransactionId xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/common\">null</ns1:TransactionId><ns1:SequenceId xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/common\">1</ns1:SequenceId><ns1:ResultCode xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/common\">405000000</ns1:ResultCode><ns1:ResultDesc xmlns:ns1=\"http://www.huawei.com/bme/aaainterface/common\">查询业务信息成 功。</ns1:ResultDesc></ResultHeader><QueryServiceInfoResult><ServiceInfo xmlns=\"http://www.huawei.com/bme/aaainterface/cbs/businessmgr\"><ServiceID>1</ServiceID><ServiceName>service1</ServiceName></ServiceInfo><ServiceInfo xmlns=\"http://www.huawei.com/bme/aaainterface/cbs/businessmgr\"><ServiceID>2</ServiceID><ServiceName>service2</ServiceName></ServiceInfo>"
                        + "</QueryServiceInfoResult></ns3:QueryServiceInfoResultMsg></soapenv:Body></soapenv:Envelope>";

        try {
            Map<String, Object> map = new HashMap<String, Object>();
            org.dom4j.Document doc = DocumentHelper.parseText(res);
            map = xmlToMap.Dom2Map(doc);
            result.setResultSet(map);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 根据账号查询历史上线失败原因接口
     */
    public ResultSet QueryLoginFailure() {
        ResultSet result = new ResultSet();
        String CommandId = "QueryLoginFailure";// 固定值
        String Version = "1";// 固定检查为1
        String TransactionId = null;// 固定检查为”null”
        String SequenceId = "1";// 固定检查为1
        String RequestType = "";
        String loginName = "";
        String startTime = "";
        String endTime = "";
        String returnAmount = "";

        StringBuilder req = new StringBuilder();
        req.append(XMLUtil.DEFAULT_XML_DECLARATION_WITH_UTF8);
        req.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:aaas=\"http:// www.huawei.com/aaa/service/broadband/AAAService_CNCommon\">");
        req.append("<soapenv:Header/>");
        req.append("<soapenv:Body>");
        req.append("<aaas:QueryLoginFailureRequest>");
        // 设置参数值
        req.append("<messageHeader>");
        req.append("<commandId>").append(CommandId).append("</commandId>");
        req.append("<com:Version>").append(Version).append("</com:Version>");
        req.append("<com:TransactionId>").append(TransactionId).append("</com:TransactionId>");
        req.append("<com:SequenceId>").append(SequenceId).append("</com:SequenceId>");
        req.append("<requestType>").append(RequestType).append("</requestType>");
        req.append("</messageHeader>");
        req.append("<messageBody>");
        req.append("<loginName>").append(loginName).append("</loginName>");
        req.append("<startTime>").append(startTime).append("</startTime>");
        req.append("<endTime>").append(endTime).append("</endTime>");
        req.append("<returnAmount>").append(returnAmount).append("</returnAmount>");
        req.append("</messageBody>");

        req.append("</aaas:QueryLoginFailureRequest>");
        req.append("</soapenv:Body>");
        req.append("</soapenv:Envelope>");

        String res =
                "<?xml version=\"1.0\" encoding=\"utf-8\"?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><soapenv:Body><ns1:QueryLoginFailureResult xmlns:ns1=\"http://www.huawei.com/aaa/service/broadband/AAAService_CNCommon\"><messageHeader><commandId>QueryLoginFailure</commandId><version>1</version><transactionId>1</transactionId><sequenceId>1211</sequenceId><resultCode>0</resultCode><resultDesc>操作成功。</resultDesc>"
                        + "</messageHeader><messageBody><loginFailureRecords><loginFailureRecord><loginName>aaa</loginName><loginTime>20120622000001</loginTime><nasIP>10.10.10.10</nasIP><nasPortID>1234</nasPortID><rejectCode>1</rejectCode><callingStationID>00-E0-4C-86-75-45</callingStationID><calledStationID>ABCDEFG</calledStationID></loginFailureRecord></loginFailureRecords></messageBody></ns1:QueryLoginFailureResult></soapenv:Body></soapenv:Envelope>";
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            org.dom4j.Document doc = DocumentHelper.parseText(res);
            map = xmlToMap.Dom2Map(doc);
            result.setResultSet(map);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 
     * <p>根据用户名查询用户模板信息接口</p>
     * @return
     */
    public ResultSet userTemplateQuery() {
        ResultSet resultSet = new ResultSet();
        String sequenceNo = "";
        String srcDeviceType = "";
        String srcDeviceId = "";
        String loginName = "";
        StringBuilder sb = new StringBuilder();
        sb.append(XMLUtil.DEFAULT_XML_DECLARATION_WITH_UTF8);
        sb.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" " + "xmlns:aaa=\"http:// www.example.org/AAAInterface_CNUnicom/\">  ");
        sb.append("<soapenv:Header/>");
        sb.append("<soapenv:Body>");
        sb.append("<aaa:userTemplateQuery>");
        sb.append("<userTemplateBean>");
        sb.append("<sequenceNo>").append(sequenceNo).append("</sequenceNo>");
        sb.append("<srcDeviceType>").append(srcDeviceType).append("</srcDeviceType>");
        sb.append("<srcDeviceId>").append(srcDeviceId).append("</srcDeviceId>");
        sb.append("<loginName>").append(loginName).append("</loginName>");
        sb.append("</userTemplateBean>");
        sb.append("</aaa:userTemplateQuery>");
        sb.append("</soapenv:Body>");
        sb.append("</soapenv:Envelope>");
        String inputXML = sb.toString();

        // call -> resultxml
        try {
            String resultxml =
                    "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">" + "<soapenv:Body>" + "<ns1:userTemplateQueryResponse xmlns:ns1=\"http://www.example.org/AAAInterface_CNUnicom/\">" + "<return><sequenceNo>201205062212345678</sequenceNo>"
                            + "<resultCode>0</resultCode><templateName>aaa</templateName>" + "</return></ns1:userTemplateQueryResponse>" + "</soapenv:Body></soapenv:Envelope>";
            org.dom4j.Document doc = DocumentHelper.parseText(resultxml);
            Map<String, Object> map1 = xmlToMap.Dom2Map(doc);
            System.out.println(map1.toString());
            Map<String, Object> map2 = (Map<String, Object>) map1.get("Body");
            System.out.println(map2.toString());
            Map<String, Object> map3 = (Map<String, Object>) map2.get("userTemplateQueryResponse");
            System.out.println(map3.toString());
            Map<String, Object> map4 = (Map<String, Object>) map3.get("return");
            System.out.println(map4.toString());
            resultSet.putObjectValue("/Body/userTemplateQueryResponse/return", map4);
        } catch (Exception e) {
            System.out.print("" + e.toString());
        }
        return resultSet;
    }

    /**
     * 
     * <p>查询用户接口</p>
     * @return
     */
    public ResultSet queryUser() {
        ResultSet resultSet = new ResultSet();
        String version = "";
        String servtype = "";
        String reqtype = "";
        String sequence = "";
        String priority = "";
        String reqtime = "";
        String continued = "";
        String user_name = "";

        StringBuilder sb = new StringBuilder();
        sb.append(XMLUtil.DEFAULT_XML_DECLARATION_WITH_UTF8);
        sb.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" " + "xmlns:bro=\"http://broad.operate.common.soap.aaa.huawei.com\" " + "xmlns:xsd=\"http://broad.bean.soap.aaa.huawei.com/xsd\">");
        sb.append("<soapenv:Header/>");
        sb.append("<soapenv:Body>");
        sb.append("<bro:queryUser>");
        sb.append("<bro:queryUserBean>");
        sb.append("<xsd:version>").append(version).append("</xsd:version>");
        sb.append("<xsd:servtype>").append(servtype).append("</xsd:servtype>");
        sb.append("<xsd:reqtype>").append(reqtype).append("</xsd:reqtype>");
        sb.append("<xsd:sequence>").append(sequence).append("</xsd:sequence>");
        sb.append("<xsd:priority>").append(priority).append("</xsd:priority>");
        sb.append("<xsd:reqtime>").append(reqtime).append("</xsd:reqtime>");
        sb.append("<xsd:continued>").append(continued).append("</xsd:continued>");
        sb.append("<xsd:user_name>").append(user_name).append("</xsd:user_name>");
        sb.append("</bro:queryUserBean>");
        sb.append("</bro:queryUser>");
        sb.append("</soapenv:Body>");
        sb.append("</soapenv:Envelope>");
        String inputXML = sb.toString();

        // call ->resultxml
        try {
            String resultxml =
                    "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">" + "<soapenv:Body>" + "<ns2:queryUserResponse xmlns:ns2=\"http://broad.operate.common.soap.aaa.huawei.com\">"
                            + "<ns2:return xsi:type=\"ns1:QueryUserResponseBean\" xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\" " + "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" + "<ns1:version>01</ns1:version>" + "<ns1:servtype>1</ns1:servtype>" + "<ns1:reqtype>115</ns1:reqtype>"
                            + "<ns1:sequence>2014021987110312</ns1:sequence>" + "<ns1:priority>01</ns1:priority>" + "<ns1:reqtime>20140219103913</ns1:reqtime>" + "<ns1:continued>0</ns1:continued>" + "<ns1:ret_code>0</ns1:ret_code>" + "<ns1:ret_msg>操作成功。</ns1:ret_msg>" + "<ns1:user_name>luye@-1</ns1:user_name>"
                            + "<ns1:service_level>1</ns1:service_level>" + "<ns1:master_session>2</ns1:master_session>" + "<ns1:area_id>1</ns1:area_id>" + "<ns1:limit_flag>0</ns1:limit_flag>" + "<ns1:limit_port/>" + "<ns1:access_right/>" + "<ns1:template_id>1</ns1:template_id>" + "<ns1:bind_flag>1</ns1:bind_flag>"
                            + "<ns1:combined_bind_info>" + "<ns1:bind_type>20</ns1:bind_type>" + "<ns1:nas_node_id/>" + "<ns1:nas_ip_address/>" + "<ns1:nas_identify/>" + "<ns1:nas_port_id/>" + "<ns1:vlan_id>-1</ns1:vlan_id>" + "<ns1:cvlan_id>1</ns1:cvlan_id>" + "</ns1:combined_bind_info>" + "</ns2:return>"
                            + "</ns2:queryUserResponse>" + "</soapenv:Body>" + "</soapenv:Envelope>";

            org.dom4j.Document doc = DocumentHelper.parseText(resultxml);
            Map<String, Object> map1 = xmlToMap.Dom2Map(doc);
            System.out.println(map1.toString());
            Map<String, Object> map2 = (Map<String, Object>) map1.get("Body");
            System.out.println(map2.toString());
            Map<String, Object> map3 = (Map<String, Object>) map2.get("queryUserResponse");
            System.out.println(map3.toString());
            Map<String, Object> map4 = (Map<String, Object>) map3.get("return");
            System.out.println(map4.toString());
            HashMap<String, Object> map5 = (HashMap<String, Object>) map4.get("combined_bind_info");
            
            resultSet.putObjectValue("/Body/queryUserResponse/return/combined_bind_info", map5);
            resultSet.putObjectValue("/Body/queryUserResponse/return", map4);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resultSet;
    }

    /**
     * 
     * <p>查询上线失败原因接口</p>
     * @return
     */
    public ResultSet queryAccessFail() {
        ResultSet resultSet = new ResultSet();
        String version = "";
        String servtype = "";
        String reqtype = "";
        String sequence = "";
        String priority = "";
        String reqtime = "";
        String continued = "";
        String user_name = "";
        String start_time = "";
        String end_time = "";

        StringBuilder sb = new StringBuilder();
        sb.append(XMLUtil.DEFAULT_XML_DECLARATION_WITH_UTF8);
        sb.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" " + "xmlns:bro=\"http://broad.operate.common.soap.aaa.huawei.com\" " + "xmlns:xsd=\"http://broad.bean.soap.aaa.huawei.com/xsd\">");
        sb.append("<soapenv:Header/>");
        sb.append("<soapenv:Body>");
        sb.append("<bro:queryAccessFail>");
        sb.append("<bro:QueryAccessFailBean>");
        sb.append("<xsd:version>").append(version).append("</xsd:version>");
        sb.append("<xsd:servtype>").append(servtype).append("</xsd:servtype>");
        sb.append("<xsd:reqtype>").append(reqtype).append("</xsd:reqtype>");
        sb.append("<xsd:sequence>").append(sequence).append("</xsd:sequence>");
        sb.append("<xsd:priority>").append(priority).append("</xsd:priority>");
        sb.append("<xsd:reqtime>").append(reqtime).append("</xsd:reqtime>");
        sb.append("<xsd:continued>").append(continued).append("</xsd:continued>");
        sb.append("<xsd:user_name>").append(user_name).append("</xsd:user_name>");
        sb.append("<xsd:start_time>").append(start_time).append("</xsd:start_time>");
        sb.append("<xsd:end_time>").append(end_time).append("</xsd:end_time>");
        sb.append("</bro:QueryAccessFailBean>");
        sb.append("</bro:queryAccessFail>");
        sb.append("</soapenv:Body>");
        sb.append("</soapenv:Envelope>");

        // call->resultxml
        try {
            String resultxml =
                    "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">" + "<soapenv:Body>" + "<ns2:queryAccessFailResponse xmlns:ns2=\"http://broad.operate.common.soap.aaa.huawei.com\">" + "<ns2:return xsi:type=\"ns1:QueryAccessFailResponseBean\" "
                            + "xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\" " + "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" + "<ns1:version>01</ns1:version><ns1:servtype>1</ns1:servtype>" + "<ns1:reqtype>116</ns1:reqtype><ns1:sequence>201301040123456789</ns1:sequence>"
                            + "<ns1:priority>0</ns1:priority><ns1:reqtime>20130107145939</ns1:reqtime>" + "<ns1:continued>0</ns1:continued><ns1:ret_code>0</ns1:ret_code>" + "<ns1:ret_msg>操作成功。</ns1:ret_msg><ns1:user_name>13812345678@-1</ns1:user_name>"
                            + "<ns1:login_time>20130103220902</ns1:login_time><ns1:nasip>170465341</ns1:nasip>" + "<ns1:nasportid>15</ns1:nasportid><ns1:innererrcode>157</ns1:innererrcode>" + "<ns1:innererrreason>端口限制检查，绑定BRAS节点号失败</ns1:innererrreason>" + "<ns1:rejectcode>8</ns1:rejectcode>"
                            + "<ns1:rejectdesc>账号不允许通过该端口或终端接入</ns1:rejectdesc>" + "</ns2:return>" + "</ns2:queryAccessFailResponse>" + "</soapenv:Body>" + "</soapenv:Envelope>";

            org.dom4j.Document doc = DocumentHelper.parseText(resultxml);
            Map<String, Object> map1 = xmlToMap.Dom2Map(doc);
            System.out.println(map1.toString());
            Map<String, Object> map2 = (Map<String, Object>) map1.get("Body");
            System.out.println(map2.toString());
            Map<String, Object> map3 = (Map<String, Object>) map2.get("queryAccessFailResponse");
            System.out.println(map3.toString());
            Map<String, Object> map4 = (Map<String, Object>) map3.get("return");
            System.out.println(map4.toString());
            resultSet.putObjectValue("/Body/queryAccessFailResponse/return", map4);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return resultSet;
    }

    /**
     * 
     * <p>查询在线会话接口</p>
     * @return
     */
    public ResultSet queryUserSession() {
        ResultSet resultSet = new ResultSet();
        String version = "";
        String servtype = "";
        String reqtype = "";
        String sequence = "";
        String priority = "";
        String reqtime = "";
        String continued = "";
        String user_name = "";
        String account_number = "";
        String userip = "";
        String userPort = "";

        StringBuilder sb = new StringBuilder();
        sb.append(XMLUtil.DEFAULT_XML_DECLARATION_WITH_UTF8);
        sb.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" " + "xmlns:bro=\"http://broad.operate.common.soap.aaa.huawei.com\" " + "xmlns:xsd=\"http://broad.bean.soap.aaa.huawei.com/xsd\">");
        sb.append("<soapenv:Header/>");
        sb.append("<soapenv:Body>");
        sb.append("<bro:queryUserSession>");
        sb.append("<bro:queryUserSessionBean>");
        sb.append("<xsd:version>").append(version).append("</xsd:version>");
        sb.append("<xsd:servtype>").append(servtype).append("</xsd:servtype>");
        sb.append("<xsd:reqtype>").append(reqtype).append("</xsd:reqtype>");
        sb.append("<xsd:sequence>").append(sequence).append("</xsd:sequence>");
        sb.append("<xsd:priority>").append(priority).append("</xsd:priority>");
        sb.append("<xsd:reqtime>").append(reqtime).append("</xsd:reqtime>");
        sb.append("<xsd:continued>").append(continued).append("</xsd:continued>");
        sb.append("<xsd:user_name>").append(user_name).append("</xsd:user_name>");
        sb.append("<xsd:account_number>").append(account_number).append("</xsd:account_number>");
        sb.append("<xsd:userip>").append(userip).append("</xsd:userip>");
        sb.append("<xsd:userPort>").append(userPort).append("<xsd:userPort>");
        sb.append("</bro:queryUserSessionBean>");
        sb.append("</bro:queryUserSession>");
        sb.append("</soapenv:Body>");
        sb.append("</soapenv:Envelope>");

        // CALL->resultxml
        try {
            String resultxml =
                    "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">" + "<soapenv:Body>" + "<ns2:queryUserSessionResponse xmlns:ns2=\"http://broad.operate.common.soap.aaa.huawei.com\">" + "<ns2:return xsi:type=\"ns1:QueryUserSessionResponseBean\" "
                            + "xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\" " + "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" + "<ns1:version>1</ns1:version><ns1:servtype>1</ns1:servtype>" + "<ns1:reqtype>117</ns1:reqtype><ns1:sequence>1</ns1:sequence>"
                            + "<ns1:priority>1</ns1:priority><ns1:reqtime>20130107153226</ns1:reqtime>" + "<ns1:continued>1</ns1:continued><ns1:ret_code>0</ns1:ret_code>" + "<ns1:ret_msg>操作成功。</ns1:ret_msg>" + "<ns1:online_infos>" + "<ns1:user_name>penghj</ns1:user_name><ns1:userip>10.40.54.254</ns1:userip>"
                            + "<ns1:isnip>10.44.60.137</ns1:isnip><ns1:nasportid/>" + "<ns1:serstarttime>20111206223649</ns1:serstarttime><ns1:accutime>0</ns1:accutime>" + "<ns1:acctsessionid>123134567</ns1:acctsessionid><ns1:inputvolumn>0</ns1:inputvolumn>" + "<ns1:outputvolumn>0</ns1:outputvolumn>"
                            + "</ns1:online_infos>" + "<ns1:online_infos>" + "<ns1:user_name>penghj</ns1:user_name><ns1:userip>-1</ns1:userip>" + "<ns1:isnip>170465341</ns1:isnip><ns1:nasportid/>" + "<ns1:serstarttime>20111206223649</ns1:serstarttime><ns1:accutime>0</ns1:accutime>"
                            + "<ns1:acctsessionid>123134</ns1:acctsessionid><ns1:inputvolumn>0</ns1:inputvolumn>" + "<ns1:outputvolumn>0</ns1:outputvolumn><ns1:natipaddress>1.1.1.1</ns1:natipaddress>" + "<ns1:hwnatstartport>0</ns1:hwnatstartport><ns1:hwnatendport>0</ns1:hwnatendport>" + "</ns1:online_infos>"
                            + "</ns2:return>" + "</ns2:queryUserSessionResponse>" + "</soapenv:Body>" + "</soapenv:Envelope>";
            org.dom4j.Document doc = DocumentHelper.parseText(resultxml);
            Map<String, Object> map1 = xmlToMap.Dom2Map(doc);
            System.out.println(map1.toString());
            Map<String, Object> map2 = (Map<String, Object>) map1.get("Body");
            System.out.println(map2.toString());
            Map<String, Object> map3 = (Map<String, Object>) map2.get("queryUserSessionResponse");
            System.out.println(map3.toString());
            Map<String, Object> map4 = (Map<String, Object>) map3.get("return");
            System.out.println(map4.toString());
            
            List<Map<String, Object>> listmap5 = (List<Map<String, Object>>) map4.get("online_infos");
            if(listmap5.size()>0){
                for(int i=0; i<listmap5.size(); i++){
                    resultSet.putObjectValue("/Body/queryUserSessionResponse/return/online_infos_"+i, listmap5.get(i));
                }
                resultSet.putObjectValue("/online_infos_num", listmap5.size());
            }
            resultSet.putObjectValue("/Body/queryUserSessionResponse/return", map4);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resultSet;
    }

    /**
     * 
     * <p>用户信息查询接口</p>
     * @return
     */
    public ResultSet UDRQueryRequest() {
        ResultSet resultSet =  new ResultSet();
        String eventID = "";
        String sourceIP = "";
        String sourcePort = "";
        String startTime = "";
        String endTime = "";
        String destinationURL = "";
        String destinationIP = "";
        String destinationPort = "";

        StringBuilder sb = new StringBuilder();
        sb.append(XMLUtil.DEFAULT_XML_DECLARATION_WITH_UTF8);
        sb.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" " + "xmlns:bro=\"http://soap.bqm.aaa.huawei.com\" " + "xmlns:xsd=\"http:// soap.bqm.aaa.huawei.com/bean\">");
        sb.append("<soapenv:Header/>");
        sb.append("<soapenv:Body>");
        sb.append("<bro:UDRNotifyRequest>");
        sb.append("<bro:UDRQueryRequest>");
        sb.append("<xsd:eventID>").append(eventID).append("</xsd:eventID>");
        sb.append("<xsd: sourceIP >").append(sourceIP).append("</xsd: sourceIP >");
        sb.append("<xsd:sourcePort >").append(sourcePort).append("</xsd:sourcePort >");
        sb.append("<xsd:startTime >").append(startTime).append("</xsd:startTime >");
        sb.append("<xsd:endTime >").append(endTime).append("</xsd:endTime >");
        sb.append("<xsd:destinationURL >").append(destinationURL).append("</xsd:destinationURL >");
        sb.append("<xsd:destinationIP >").append(destinationIP).append("</xsd:destinationIP >");
        sb.append("<xsd:destinationPort >").append(destinationPort).append("</xsd:destinationPort >");
        sb.append("</bro:UDRQueryRequest>");
        sb.append("</bro:UDRNotifyRequest>");
        sb.append("</soapenv:Body>");
        sb.append("</soapenv:Envelope>");

        // call->resultxml
        try {
            String resultxml =
                    "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">" + "<soapenv:Body>" + "<ns2:UDRQueryResponse xmlns:ns2=\"http://broad.operate.common.soap.aaa.huawei.com\">" + "<ns2:return xsi:type=\"ns1:IPAccountQueryResponseBean\" "
                            + "xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\" " + "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" + "<ns1:eventID >2011-03-22-16-21-50-00001</ns1:eventID>" + "<ns1:acceptResult >0</ns1:acceptResult>" + "</ns2:return>" + "</ns2:UDRQueryResponse>" + "</soapenv:Body>"
                            + "</soapenv:Envelope>";

            org.dom4j.Document doc = DocumentHelper.parseText(resultxml);
            Map<String, Object> map1 = xmlToMap.Dom2Map(doc);
            System.out.println(map1.toString());
            Map<String, Object> map2 = (Map<String, Object>) map1.get("Body");
            System.out.println(map2.toString());
            Map<String, Object> map3 = (Map<String, Object>) map2.get("UDRQueryResponse");
            System.out.println(map3.toString());
            Map<String, Object> map4 = (Map<String, Object>) map3.get("return");
            System.out.println(map4.toString());
            
            resultSet.putObjectValue("/Body/UDRQueryResponse/return", map4);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return resultSet;
    }
}
