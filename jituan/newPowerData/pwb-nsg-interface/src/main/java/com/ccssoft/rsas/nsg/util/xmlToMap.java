package com.ccssoft.rsas.nsg.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class xmlToMap {

    public static Map Dom2Map(Element e) {
        Map map = new HashMap();
        List list = e.elements();
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Element iter = (Element) list.get(i);
                List mapList = new ArrayList();

                if (iter.elements().size() > 0) {
                    Map m = Dom2Map(iter);
                    if (map.get(iter.getName()) != null) {
                        Object obj = map.get(iter.getName());
                        if (!obj.getClass().getName().equals("java.util.ArrayList")) {
                            mapList = new ArrayList();
                            mapList.add(obj);
                            mapList.add(m);
                        }
                        if (obj.getClass().getName().equals("java.util.ArrayList")) {
                            mapList = (List) obj;
                            mapList.add(m);
                        }
                        map.put(iter.getName(), mapList);
                    } else
                        map.put(iter.getName(), m);
                } else {
                    if (map.get(iter.getName()) != null) {
                        Object obj = map.get(iter.getName());
                        if (!obj.getClass().getName().equals("java.util.ArrayList")) {
                            mapList = new ArrayList();
                            mapList.add(obj);
                            mapList.add(iter.getText());
                        }
                        if (obj.getClass().getName().equals("java.util.ArrayList")) {
                            mapList = (List) obj;
                            mapList.add(iter.getText());
                        }
                        map.put(iter.getName(), mapList);
                    } else
                        map.put(iter.getName(), iter.getText());
                }
            }
        } else
            map.put(e.getName(), e.getText());
        return map;
    }

    public static Map<String, Object> Dom2Map(Document doc) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (doc == null)
            return map;
        Element root = doc.getRootElement();
        for (Iterator iterator = root.elementIterator(); iterator.hasNext();) {
            Element e = (Element) iterator.next();
            // System.out.println(e.getName());
            List list = e.elements();
            if (list.size() > 0) {
                map.put(e.getName(), Dom2Map(e));
            } else
                map.put(e.getName(), e.getText());
        }
        return map;
    }

    public static void main(String[] args) {
        String res =
                "<?xml version=\"1.0\" encoding=\"utf-8\"?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><soapenv:Body><ns2:queryUserByUNorIPResponse xmlns:ns2=\"http://broad.operate.common.soap.aaa.huawei.com\"><ns2:return><ns1:sequenceNo xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\">201305201233450001</ns1:sequenceNo><ns1:resultCode xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\">0</ns1:resultCode><ns1:serviceLevel xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\">1</ns1:serviceLevel><ns1:status xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\">1</ns1:status><ns1:subState xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\">1</ns1:subState><ns1:serviceStop xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\">20140521235959</ns1:serviceStop><ns1:areaid xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\">-1</ns1:areaid><ns1:QOS xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\"></ns1:QOS><ns1:loginName xmlns:ns1=\"http://broad.bean.soap.aaa.huawei.com/xsd\">aaa@-1</ns1:loginName></ns2:return> </ns2:queryUserByUNorIPResponse></soapenv:Body></soapenv:Envelope>";

        try {
            // 将xml直接转成map
            org.dom4j.Document doc = DocumentHelper.parseText(res);
            Map map2 = xmlToMap.Dom2Map(doc);
            System.out.println(map2.toString());
            // 获取节点值
            Map map3 = (Map) map2.get("Body");
            System.out.println(map3.toString());
            Map map4 = (Map) map3.get("queryUserByUNorIPResponse");
            System.out.println(map4.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
