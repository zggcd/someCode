package com.ccssoft.rsas.nsg.util;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 *xml工具类
 */
public class XMLUtil {
	public static final String DEFAULT_XML_DECLARATION_WITH_UTF8 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
	public static final String DEFAULT_XML_DECLARATION_WITH_GBK = "<?xml version=\"1.0\" encoding=\"GBK\"?>";
	
	/**
	 *  从异常来看，很明显是因为字节数组中存在 Unicode: 0x0,而这个字节在Xml中被认为是非法字符。
		对于一些经过编码或加、解密的字符串中，很容易会出现这个 0x0,
		特别是在加、解密中，经常会涉及到字符填充，而填充物通常是 0x0，
		需对于0x00-0x20 都会引起一定的问题，又因为这些字符不可见，因此用通常的编辑器进行编辑的时候找不到问题所在。
	 * @param in
	 * @return String 去除了隐藏字符的XML字符串
	 */
    public static  String stripNonValidXMLCharacters(String in) { 
        StringBuffer out = new StringBuffer(); 	
        char v; 								
        if (in == null || ("".equals(in))) return "";	
        for (int i = 0; i < in.length(); i++) { 
            v = in.charAt(i); 		// NOTE: No IndexOutOfBoundsException caught here; it should not happen. 
            if ((v == 0x9) || 
                (v == 0xA) || 
                (v == 0xD) || 
                ((v >= 0x20) && (v <= 0xD7FF)) || 
                ((v >= 0xE000) && (v <= 0xFFFD)) || 
                ((v >= 0x10000) && (v <= 0x10FFFF))) 
                out.append(v); 
        } 
        return out.toString(); 
    } 
    
    
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
     * 使用dom4j+xpath获取指定路径单个节点
     * @param document  org.dom4j.Document
     * @param nodePath  节点路径  形如“/root/Parameters/SerialNo”
     * @return org.dom4j.Node 
     */
    public  static  org.dom4j.Node getSingleNode(org.dom4j.Document document, String nodePath){
  	  if(null == document){
  		  return null;
  	  }
  	  if(StringUtils.isBlank(nodePath)){
  		  return null;
  	  }
  	   org.dom4j.Node node = document.selectSingleNode(nodePath);
       return node;
    }
    
    @SuppressWarnings("unchecked")
	public static List<Element> getNodeList(org.dom4j.Document document, String nodePath){
    	if(null == document){
    		  return null;
    	  }
    	  if(StringUtils.isBlank(nodePath)){
    		  return null;
    	  }
    	  List<Element> nodeList = document.selectNodes(nodePath);
    	  return nodeList;
    }
    
    /**
     * 用dom4j+xpath获取指定路径单个节点值
     * @param document org.dom4j.Document
     * @param nodePath 节点路径  形如“/root/Parameters/SerialNo”
     * @return String 
     */
    public static  String getSingleNodeValue(org.dom4j.Document document, String nodePath){
    	 org.dom4j.Node node = getSingleNode(document, nodePath);
    	 if(null == node){
    		 return "";
    	 }
    	 return StringUtils.trimToEmpty(node.getText());
    }
    
    
    /**
     * 用dom4j+xpath获取指定路径单个节点值
     * @param xmlStr String 
     * @param nodePath 节点路径  形如“/root/Parameters/SerialNo”
     * @return String 
     */
    public static  String getSingleNodeValue(String xmlStr, String nodePath)throws Exception{
     org.dom4j.Document document = getDocument(xmlStr);
     if(null == document){
    	 return "";
     }
   	 org.dom4j.Node node = getSingleNode(document, nodePath);
   	 if(null == node){
   		 return "";
   	 }
   	 return StringUtils.trimToEmpty(node.getText());
   }
    
	public static String format(String str) {
		SAXReader reader = new SAXReader();
		StringReader in = new StringReader(str);
		Document doc;
		StringWriter out = null;
		try {
			doc = reader.read(in);
			OutputFormat formater = OutputFormat.createPrettyPrint();
			// formater = OutputFormat.createCompactFormat();
			formater.setEncoding("UTF-8");
			out = new StringWriter();
			XMLWriter writer = new XMLWriter(out, formater);
			writer.write(doc);
			writer.close();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return out.toString();
	}
    
    public static void main(String[] args) throws Exception {
		/*String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
				      "<SERVICE>"+
					   "<IFMRequest Serial=\"Thu Aug 12 14:00:57 CST 2004\" version=\"1.0\">"+
						  "<Parameters>"+
							"<SerialNo>工单编号</SerialNo>"+
							"<State>执行结果</State>"+
					        "<AlarmId>告警ID</AlarmId>"+
					        "<ArchiveType>归档类型（1:竣工；0:撤单）</ArchiveType>"+
						  "</Parameters>"+
					    "</IFMRequest>"+
				      "</SERVICE>";  */ 
		//String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><SERVICE><IFMRequest Serial=\"Thu Aug 12 14:00:57 CST 2004\" version=\"1.0\"><Parameters><SerialNo>aaaaa</SerialNo><State>0</State><AlarmId>12068</AlarmId><ArchiveType>1</ArchiveType></Parameters></IFMRequest></SERVICE>";
		String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root><DEV emsId=\"2001101\" resSyncType=\"OLT\" devIp=\"172.26.43.7\" collectTime=\"2014-09-19 18:01:15\" ><DEV emsId=\"2001101\" resSyncType=\"ONU\" oltId=\"172.26.43.7\" ></DEV></DEV></root>";
		//@SuppressWarnings("unused")
		//StringReader read = new StringReader(xmlStr);
	    
		//@SuppressWarnings("unused")
		//SAXReader saxreader = new SAXReader();
	    /*Document document = saxreader.read(read);
		System.out.println("####AlarmId="+ getSingleNodeValue(document, "/SERVICE/IFMRequest/Parameters/AlarmId"));
		*/
	    
	    Document document =getDocument(xmlStr);
	    //System.out.println("####AlarmId="+ getSingleNodeValue(document, "/SERVICE/IFMRequest/Parameters/AlarmId"));
	    //System.out.println("####AlarmId="+ getNodeList(document, "/SERVICE/IFMRequest/Parameters/AlarmId"));
	      //System.out.println("底层DEVLIST="+ getNodeList(document, "/root/DEV/DEV"));
	  System.out.println("node="+getNodeList(document,"/root/DEV").get(0).attributeValue("emsId"));
	    
	}

}
