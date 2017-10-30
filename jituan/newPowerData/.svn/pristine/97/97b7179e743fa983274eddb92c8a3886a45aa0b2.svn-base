package com.ccssoft.rsas.nsg.util;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.xpath.DefaultXPath;

/**
 * <p>soap-xml解析工具类</p>
 * <p>创建日期：2016年7月27日 上午10:48:09</p>
 * @author tanghuajie
 */
public class SOAPXMLUtil {
        
    public static final String DEFAULT_XML_DECLARATION_WITH_UTF8 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
    public static final String DEFAULT_XML_DECLARATION_WITH_GBK = "<?xml version=\"1.0\" encoding=\"GBK\"?>";
    
    /**
     * 
     * <p>String->Document</p>
     * @param xmlStr
     * @return
     * @throws Exception
     */
    public  static  org.dom4j.Document getDocument(String xmlStr)throws Exception{
        if (StringUtils.isBlank(xmlStr)) {
                        return null;
                }
        StringReader read = new StringReader(xmlStr);
        SAXReader saxreader = new SAXReader();
        Document document =  saxreader.read(read);
        return document;  
    }
    
    /**
     * 
     * <p>获取soap-xml节点</p>
     * @param document
     * @param nodePath  //ns1:combined_bind_info/ns1:*  或    //ns1:* 取所有ns1命名空间下节点
     * @param uris      nodepath所需的命名空间         uris.put("ns2", "http://broad.operate.common.soap.aaa.huawei.com");
     * @return
     */
    @SuppressWarnings("unchecked")
    public static List<Element> getNodeList(org.dom4j.Document document, String nodePath, Map<String, String> uris) throws Exception {
    if(null == document){
              return null;
      }
      if(StringUtils.isBlank(nodePath)){
              return null;
      }
      DefaultXPath xpath = new DefaultXPath(nodePath);
      if(!uris.isEmpty() && uris.size()>0){
          xpath.setNamespaceURIs(uris);
      }
      List<Element> nodeList = xpath.selectNodes(document);
      return nodeList;
    }
    
    /**
     * 
     * <p>获取soap-xml单节点的值</p>
     * @param document
     * @param nodePath   //ns2:queryUserResponse/ns2:return/ns1:combined_bind_info/ns1:bind_type
     * @param uris      nodepath所需的命名空间     uris.put("ns2", "http://broad.operate.common.soap.aaa.huawei.com");
     * @return
     * @throws Exception
     */
    public static  String getSingleNodeValue(org.dom4j.Document document, String nodePath, Map<String, String> uris) throws Exception{
        List<Element> node = getNodeList(document, nodePath, uris);
        if(null == node){
                return "";
        }
        if(node.size()>0){
            Element e = node.get(0);
            return StringUtils.trimToEmpty(e.getText());
        }else{
            return "";
        }
   }
    
    /**
     * 
     * <p>获取多个节点的值</p>
     * @param document
     * @param nodePath          //ns1:combined_bind_info/ns1:*  或    //ns1:* 取所有ns1命名空间下节点
     * @param uris   nodepath所需的命名空间         uris.put("ns2", "http://broad.operate.common.soap.aaa.huawei.com");
     * @return map
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public static List<Map<String, String>> getNodeListValue(org.dom4j.Document document, String nodePath, Map<String, String> uris) throws Exception {
      boolean flag = true;
      List<Map<String, String>> resultList = new ArrayList<Map<String, String>>();
      List<Element> nodeList = getNodeList(document, nodePath, uris);
      if(!nodeList.isEmpty() && nodeList.size()>0){
          Map<String, String> map1 = new HashMap<String, String>();
          for(int i=0; i<nodeList.size() ; i++){
              Element e = nodeList.get(i);
              Iterator ter = e.elementIterator();
              if(ter.hasNext()){
                  Map<String, String> map2 = new HashMap<String, String>();
                  while(ter.hasNext()){
                      Element el = (Element)ter.next();
                      map2.put(el.getName(), el.getTextTrim());
                  }
                  flag = false;
                  resultList.add(map2);
              }
             if(flag){
                  map1.put(e.getName(), e.getTextTrim());
              }
          }     
          if(!map1.isEmpty()){
              resultList.add(map1);
          }
      }else{
          return null;
      }
      return resultList;
    }
    
    
    public static void main(String[] args) throws Exception {
        String resultXML = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                + "<soapenv:Body>"
                + "<ns2:queryUserResponse xmlns:ns2=\"http://broad.operate.common.soap.aaa.huawei.com\">"
                + "<ns2:return xsi:type=\"ns1:QueryUserResponseBean\" xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\" "
                + "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
                + "<ns1:version>01</ns1:version>"
                + "<ns1:servtype>1</ns1:servtype>"
                + "<ns1:reqtype>115</ns1:reqtype>"
                + "<ns1:sequence>2014021987110312</ns1:sequence>"
                + "<ns1:priority>01</ns1:priority>"
                + "<ns1:reqtime>20140219103913</ns1:reqtime>"
                + "<ns1:continued>0</ns1:continued>"
                + "<ns1:ret_code>0</ns1:ret_code>"
                + "<ns1:ret_msg>操作成功。</ns1:ret_msg>"
                + "<ns1:user_name>luye@-1</ns1:user_name>"
                + "<ns1:service_level>1</ns1:service_level>"
                + "<ns1:master_session>2</ns1:master_session>"
                + "<ns1:area_id>1</ns1:area_id>"
                + "<ns1:limit_flag>0</ns1:limit_flag>"
                + "<ns1:limit_port/>"
                + "<ns1:access_right/>"
                + "<ns1:template_id>1</ns1:template_id>"
                + "<ns1:bind_flag>1</ns1:bind_flag>"
                + "<ns1:combined_bind_info>"
                + "<ns1:bind_type>20</ns1:bind_type>"
                + "<ns1:nas_node_id/>"
                + "<ns1:nas_ip_address/>"
                + "<ns1:nas_identify/>"
                + "<ns1:nas_port_id/>"
                + "<ns1:vlan_id>-1</ns1:vlan_id>"
                + "<ns1:cvlan_id>1</ns1:cvlan_id>"
                + "</ns1:combined_bind_info>"
                + "</ns2:return>"
                + "</ns2:queryUserResponse>"
                + "</soapenv:Body>"
                + "</soapenv:Envelope>";
        
        try{
            
            Document doc = SOAPXMLUtil.getDocument(resultXML);
            Map<String, String> uris = new HashMap<String, String>();
//      uris.put("soapenv", "http://schemas.xmlsoap.org/soap/envelope/");
            uris.put("ns2", "http://broad.operate.common.soap.aaa.huawei.com");
            uris.put("ns1", "http://broad.bean.soap.aaa.huawei.com/xsd");
            List<Element> list = SOAPXMLUtil.getNodeList(doc, "//ns1:*", uris);
            System.out.println("节点数 :"+list.size());
            for(Element node: list){
                System.out.println(node.getName()+":"+node.getTextTrim());
            }
//      String nopath = "//soapenv:Envelope/soapenv:Body/ns2:queryUserResponse/ns2:return/ns1:combined_bind_info/ns1:bind_type";
            String nopath = "//ns2:queryUserResponse/ns2:return/ns1:combined_bind_info/ns1:bind_type";
            String value = SOAPXMLUtil.getSingleNodeValue(doc, nopath, uris);
            System.out.println("value:"+value);
            
            List<Map<String, String>> listmap = SOAPXMLUtil.getNodeListValue(doc, "//ns1:*", uris);
            if(listmap!=null){
                System.out.println("map:"+listmap.toString());
            }
        }catch(Exception e){
            System.out.print(e.toString());
        }
        
    }
    
}
