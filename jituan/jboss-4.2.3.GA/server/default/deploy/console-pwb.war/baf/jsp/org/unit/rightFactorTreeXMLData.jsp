<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.rig.factor.common.valueobj.DataRightFactorVO"%>
<%@ page import="com.regaltec.baf.rig.factor.common.valueobj.DataRightFactorTypeVO"%>
<%@page import="com.regaltec.baf.ui.UIDataHandler"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String factorTypeId = request.getParameter("id");
	if (factorTypeId == null || factorTypeId.equals("0")){
		factorTypeId = "";
	}
	
	PrintWriter outs = null;
	StringBuffer buf = null;
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
		
		outs = response.getWriter();
		buf = new StringBuffer();
		buf.append("<?xml version='1.0' encoding='GBK'?>\n");
		if (!factorTypeId.equalsIgnoreCase("")) {
			buf.append("<tree id=\""+factorTypeId+"\">\n");
		} else {
			buf.append("<tree id=\"0\">\n");
		}
		String child = "";
		String open = " open=\"true\" call=\"1\" select=\"1\" ";
		int k = 0;
		
		if (!factorTypeId.equalsIgnoreCase("")) {
			//��ȡ��Ȩ������������Ϣ
			Hashtable hashtable = new Hashtable();
			hashtable.put("factorTypeId", (Object) factorTypeId);
			hashtable.put("ServletContext", sc);
			Hashtable retHashtable = (Hashtable) business.invoke("baf_factorTypeBI", "getFactorTypeById", hashtable);
			DataRightFactorTypeVO factorTypeVO = (DataRightFactorTypeVO) retHashtable.get("getFactorTypeById");
			hashtable.put("factorTypeId",factorTypeId);
			hashtable = (Hashtable) business.invoke("baf_dataRightFactorBI","getRightFactorByTypeId", hashtable);
			List rlist = null;			
			if (factorTypeVO == null) {
				buf.append("</tree>\n");				
				return;
			}else{
				if(hashtable!=null){
					rlist = (List)hashtable.get("getRightFactorByTypeId");				
					if(rlist!=null && rlist.size()>0){
						buf = new StringBuffer();
						buf.append("<?xml version='1.0' encoding='GBK'?>\n");
						buf.append("<tree id=\""+factorTypeId+"\">\n");
						for(int j=0;j<rlist.size();j++){
							DataRightFactorVO rvo = (DataRightFactorVO)rlist.get(j);
							buf.append("<item text=\""+rvo.getRightFactorName()+"\" id=\""+rvo.getRightFactorId()+"\" child=\"0\"");
							buf.append(" im0 =\"book.gif\" im1 =\"book.gif\" im2=\"book.gif\" ");
							buf.append(" tooltip=\""+rvo.getRightFactorName()+"\" >\n");
							buf.append("<userdata name=\"type\">R</userdata>\n");
							buf.append("<userdata name=\"isLeaf\">Y</userdata>\n");
							buf.append("<userdata name=\"url\"></userdata>\n");
							buf.append("<userdata name=\"linktarget\"></userdata>\n");
							buf.append("<userdata name=\"domainname\"></userdata>\n");
							buf.append("<userdata name=\"applicationCode\"></userdata>\n</item>\n");					
						}
						buf.append("</tree>\n");
						return;
					}
				}
			}
		}
		
		Hashtable hash = new Hashtable();
		hash.put("parentFactorTypeId", (Object)factorTypeId);
		//����Ȩ�޿��ƣ�Ŀǰû��userId����ʱ����
		String userId = "";
		hash.put("userId",userId);
		hash.put("ServletContext", sc);
		hash = (Hashtable) business.invoke("baf_factorTypeBI","getChildren", hash);
		List list = null;
		if(hash!=null){
			list = (List) hash.get("getChildren");		
			if(list!=null && list.size()>0){
				for (int i = 0; i < list.size(); i++) {
					DataRightFactorTypeVO vo = (DataRightFactorTypeVO) list.get(i);
					k++;
					String isLeaf = vo.getIsLeaf();			
					if("N".equalsIgnoreCase(isLeaf)){
						//����Ҷ�ӽڵ�
						child = "1";
					}else{
						//��Ҷ�ӽڵ�	������û��Ȩ������			
						if("L".equalsIgnoreCase(isLeaf)){
							child = "0";
							isLeaf = "Y";
						}else if("Y".equalsIgnoreCase(isLeaf)){
							//��Ҷ�ӽڵ㣬������Ȩ������
							child = "1";					
						}
					}
									
					buf.append("<item text=\""+vo.getFactorTypeName()+"\" id=\""+vo.getFactorTypeId()+"\" child=\""+child+"\"");			
					if (factorTypeId.equalsIgnoreCase("")){
						if(k == 1){
							buf.append(open);
						}else{
							buf.append(" open=\"true\" ");
						}
					}
					buf.append(" im0 =\"books_close.gif\" im1 =\"books_close.gif\" im2=\"books_close.gif\" ");
					buf.append(" tooltip=\""+vo.getFactorTypeName()+"\" >\n");
					
					buf.append("<userdata name=\"type\">T</userdata>\n");
					buf.append("<userdata name=\"isLeaf\">"+isLeaf+"</userdata>\n");
					buf.append("<userdata name=\"url\"></userdata>\n");
					buf.append("<userdata name=\"linktarget\"></userdata>\n");
					buf.append("<userdata name=\"domainname\"></userdata>\n");
					buf.append("<userdata name=\"applicationCode\"></userdata>\n</item>\n");
				}
			}
		}
		if ((list == null ||  list.size() == 0 ) && factorTypeId.equals("")){
		    buf.append("<item text=\"�Ҽ���������������\" id=\"null\" call=\"1\" />");	 
		 }
		buf.append("</tree>\n");		
	} catch (Exception e) {
		e.printStackTrace();
	} finally{
		outs.write(buf.toString());
		outs.close();
	}
%>

