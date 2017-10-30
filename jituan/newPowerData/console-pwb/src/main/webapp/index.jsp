<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.framework.bp.BusinessDelegateImpl"%>
<%@ page import="com.regaltec.baf.module.common.valueobj.ModuleVO"%>
<%@ page import="com.regaltec.baf.module.common.valueobj.ElementVO"%>
<%@ page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@ page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%@page import="com.regaltec.common.util.StringHelper"%>
<%@page import="com.regaltec.baf.dict.dictionary.common.valueobj.DictionaryItemVO"%>
<%@page import="com.regaltec.baf.dict.dictionary.bo.IDictionaryItemBO"%>
<%@page import="com.regaltec.baf.taskmanage.common.SpringUtil"%>
<%
   	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String urlPath="";
	try {
	 IDictionaryItemBO dicBO = SpringUtil.getBean("baf_dictionaryItemBO",
				IDictionaryItemBO.class);
		String isSHLogin="";
		DictionaryItemVO vo = dicBO.getItemByDictCodeAndItemCode("IDD_SYS", "SYS_SSO_SWITCH");
			if (vo != null) {
				String itemValue = vo.getItemValue();
				if (itemValue != null && !"".equals(itemValue)) {
					isSHLogin=itemValue;
				}
			}
			String SHurl="";
		DictionaryItemVO vo1 = dicBO.getItemByDictCodeAndItemCode("IDD_SYS", "SYS_SHURL");
			if (vo1 != null) {
				String itemValue1 = vo1.getItemValue();
				if (itemValue1 != null && !"".equals(itemValue1)) {
					SHurl=itemValue1;
				}
			}
        String customUrl="";	
        DictionaryItemVO vo2 = dicBO.getItemByDictCodeAndItemCode("IDD_SYS", "SYS_CUSTOM_LOGIN_URL");
			if (vo2 != null) {
				String itemValue2 = vo2.getItemValue();
				if (itemValue2 != null && !"".equals(itemValue2)) {
					customUrl=itemValue2;
				}
			}
		if("Y".equals(isSHLogin)){
 	       urlPath=SHurl;
 	     }else{
 	        if("".equals(customUrl)||"Y".equals(customUrl)){
 	            urlPath ="baf/jsp/uiframe/login.xhtml";
 	        }else{
 	            urlPath=request.getContextPath()+customUrl;
 	        }
 	       
 	     }
	} catch (Exception e) {
		e.printStackTrace();
	}
%>
<meta http-equiv="Refresh" content="0;  url=<%=urlPath %>"> 
