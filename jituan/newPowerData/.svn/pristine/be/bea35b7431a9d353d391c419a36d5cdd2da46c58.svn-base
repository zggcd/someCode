package com.ccssoft.rsas.t;


import org.dom4j.Document;

import com.ccssoft.rsas.nsg.control.HuaweiControl;
import com.ccssoft.rsas.nsg.util.XMLUtil;


public class test1 {
	
	public static void te() throws Exception{
		HuaweiControl a=new HuaweiControl();
//		String aa=a.queryUserByUNorIP();
//		System.out.println(aa);
		String x1="<?xml version=\"1.0\" encoding=\"UTF-8\"?><root><DEV emsId=\"2001101\" resSyncType=\"OLT\" devIp=\"172.26.43.7\" collectTime=\"2014-09-19 18:01:15\" ><DEV emsId=\"2001101\" resSyncType=\"ONU\" oltId=\"172.26.43.7\" ></DEV></DEV></root>";
		Document document =XMLUtil.getDocument(x1);
		String a1=XMLUtil.getSingleNodeValue(document, "/root/DEV");
		System.out.println(a1);
	}

	public static void main(String[] args)  {
			try {
				te();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

}
