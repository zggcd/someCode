<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.framework.bp.BusinessDelegateImpl"%>
<%@ page import="com.regaltec.baf.module.common.valueobj.ModuleVO"%>
<%@ page import="com.regaltec.baf.module.common.valueobj.ElementVO"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String moduleId = request.getParameter("id");
	if (moduleId == null || moduleId.equals("0"))
		moduleId = "";
	
	PrintWriter outs = response.getWriter();
	StringBuffer xmlSource = new StringBuffer();
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc
				.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx
				.getBean("baf_businessDelegate");
		//IBusiness business =new BusinessDelegateImpl();	
		if (!moduleId.equalsIgnoreCase("")) {
			//��ȡ��ģ����Ϣ
			Hashtable hashtable = new Hashtable();
			hashtable.put("moduleId", (Object) moduleId);
			hashtable.put("ServletContext", sc);
			Hashtable retHashtable = (Hashtable) business
					.invoke("baf_moduleBI", "getModule", hashtable);			
			ModuleVO moduleVO = null;
			if (retHashtable != null)
				moduleVO = (ModuleVO) retHashtable.get("getModule");
			if (moduleVO != null) {
				if (moduleVO.getIsLeaf().equalsIgnoreCase("Y")) {
					//��Ҷ�ӽڵ㣬��ȡԪ����Ϣ
					Hashtable etable = new Hashtable();
					etable.put("moduleId", (Object)moduleId);
					etable.put("ServletContext", sc);
					Hashtable retETable = (Hashtable)business.invoke("baf_elementBI", "getElements", etable);
					List list = (List)retETable.get("getElements");
					PrintWriter eOut = response.getWriter();
					StringBuffer buf = new StringBuffer();
					buf.append("<?xml version='1.0' encoding='GBK'?>\n");
					buf.append("<tree id=\"");
					buf.append(moduleId);
					buf.append("\">\n");					
					int k = 0;
					for (int i = 0; i < list.size(); i++) {
						String child = "";						
						ElementVO vo = (ElementVO) list.get(i);
						if (!vo.getIsLeaf().equalsIgnoreCase("Y")) {
							child = " child =\"1\" ";
						}
						k++;
						buf.append("<item text=\"");
						buf.append(vo.getElementName());
						buf.append("\" id=\"");
						buf.append(vo.getElementId());
						buf.append("\"");
						buf.append(child);
						buf.append(" tooltip=\"");
						buf.append(vo.getElementName());
						buf.append("\" >\n");
						buf.append("<userdata name=\"parentID\">");
						buf.append(vo.getModuleId());
						buf.append("</userdata>\n");						
						buf.append("<userdata name=\"isLeaf\">");
						//buf.append("Y");
						buf.append(vo.getIsLeaf());
						buf.append("</userdata>\n");
						buf.append("<userdata name=\"moduleCode\">");
						buf.append(vo.getModuleCode());
						buf.append("</userdata>\n");
						buf.append("<userdata name=\"type\">");
						buf.append("E");
						buf.append("</userdata>\n</item>\n");
					}
					buf.append("</tree>\n");
					eOut.write(buf.toString());
					eOut.close();	
					return;
				}
				//����Ҷ�ӽڵ㣬ֱ�ӵ�����ȥȡ��ģ����Ϣ
			} else {
				//��IDΪԪ��ID Ԫ��û���¼�Ԫ�ء�
				//2009-08-11 add by lisihai Ԫ��Ҳ���¼�Ԫ��
				boolean oldVersion = false;
				if (oldVersion) {
					PrintWriter eOut = response.getWriter();
					StringBuffer buf = new StringBuffer();
					buf.append("<tree id=\"");
					buf.append(moduleId);
					buf.append("\">\n");
					buf.append("</tree>\n");
					eOut.write(buf.toString());
					eOut.close();
				} else {
					//��ȡ�¼�Ԫ��
					Hashtable etable = new Hashtable();
					etable.put("parentElementId", (Object)moduleId);
					etable.put("ServletContext", sc);
					Hashtable retETable = (Hashtable)business.invoke("baf_elementBI", "getChildren", etable);
					List list = (List)retETable.get("getChildren");
					PrintWriter eOut = response.getWriter();
					StringBuffer buf = new StringBuffer();
					buf.append("<?xml version='1.0' encoding='GBK'?>\n");
					buf.append("<tree id=\"");
					buf.append(moduleId);
					buf.append("\">\n");				
					int k = 0;
					for (int i = 0; i < list.size(); i++) {
						String child = "";
						ElementVO vo = (ElementVO) list.get(i);
						if (!vo.getIsLeaf().equalsIgnoreCase("Y")) {
							child = " child =\"1\" ";
						}
						k++;
						buf.append("<item text=\"");
						buf.append(vo.getElementName());
						buf.append("\" id=\"");
						buf.append(vo.getElementId());
						buf.append("\"");
						buf.append(child);
						buf.append(" tooltip=\"");
						buf.append(vo.getElementName());
						buf.append("\" >\n");
						buf.append("<userdata name=\"parentID\">");
						buf.append(vo.getModuleId());
						buf.append("</userdata>\n");						
						buf.append("<userdata name=\"isLeaf\">");
						buf.append(vo.getIsLeaf());
						buf.append("</userdata>\n");
						buf.append("<userdata name=\"moduleCode\">");
						buf.append(vo.getModuleCode());
						buf.append("</userdata>\n");	
						buf.append("<userdata name=\"type\">");
						buf.append("E");
						buf.append("</userdata>\n</item>\n");
					}
					buf.append("</tree>\n");
					eOut.write(buf.toString());
					eOut.close();	
				}				
				return;
			}
		}

		Hashtable hash = new Hashtable();
		hash.put("parentModuleId", moduleId);
		hash.put("ServletContext", sc);
		hash = (Hashtable) business.invoke("baf_moduleBI",
				"getChildren", hash);
		List list = (List) hash.get("getChildren");
		
		xmlSource.append("<?xml version='1.0' encoding='GBK'?>\n");
		if (!moduleId.equalsIgnoreCase("")) {
			xmlSource.append("<tree id=\"");
			xmlSource.append(moduleId);
			xmlSource.append("\">\n");
		} else {
			xmlSource.append("<tree id=\"0\">\n");
		}
		String open = " open=\"true\" call=\"1\"  select=\"1\" "; //		
		int k = 0;
		for (int i = 0; i < list.size(); i++) {
			String child = "";	//�������ýڵ��+�ţ�������¼���������Ϊchild=1
			
			ModuleVO vo = (ModuleVO) list.get(i);
			k++;
			//�ж�����ģ�����Ƿ���Ԫ�أ������Ԫ�أ�������child�����û��Ԫ��������
			if ("Y".equalsIgnoreCase(vo.getIsLeaf())) {
				//�����Ҷ�ӽڵ�
				Hashtable etable = new Hashtable();
				etable.put("moduleId", (Object)vo.getModuleId());
				etable.put("ServletContext", sc);
				Hashtable retETable = (Hashtable)business.invoke("baf_elementBI", "getElements", etable);
				List eList = (List)retETable.get("getElements");
				if (eList != null && eList.size() > 0) {
					child = " child =\"1\" ";
				}
			} else {
				//����Ҷ�ӽڵ�
				child = " child =\"1\" ";
			}			
			String isLeaf = vo.getIsLeaf();
			String ischild = "";
			if ("Y".equalsIgnoreCase(isLeaf) || "F".equalsIgnoreCase(isLeaf)) {  //��F����ʾֻ���û������˸��ڵ��Ȩ�ޣ���û����Ȩ�ޣ��ڵ����˵��ϵ����ģ�鲻������ҳ��
				//�����Ҷ�ӽڵ�
				ischild = "0";
			} else {
				//����Ҷ�ӽڵ�
				ischild = "1";
			}
//			if (!"Y".equalsIgnoreCase(vo.getIsLeaf()))
//				child = " child =\"1\" ";
			xmlSource.append("<item text=\"");
			xmlSource.append(vo.getModuleName());
			xmlSource.append("\" id=\"");
			xmlSource.append(vo.getModuleId());
			xmlSource.append("\"");
			xmlSource.append(child);
			if (k == 1 && moduleId.equalsIgnoreCase(""))
				xmlSource.append(open);
			//xmlSource.append(openNextNode);
			
			//�ж�ͼƬ�Ƿ����
			boolean iconExist = false;
			if(vo.getSmallIcon() != null){
				File file = new File(request.getRealPath("/")+"/baf/images/dhtmlxtree/"+vo.getSmallIcon());
				if(file.exists()){
					iconExist = true;
				}
			}
			if(vo.getSmallIcon() == null || iconExist==false){
				if( "1".equals(ischild)){
					xmlSource.append(" im0 =\"box.gif\" im1 =\"box.gif\" im2=\"box.gif\" ");
				}else{
					xmlSource.append(" im0 =\"titli02.gif\" im1 =\"titli02.gif\" im2=\"titli02.gif\" ");							
				}
			}else{
				xmlSource.append(" im0= \""+vo.getSmallIcon()+"\" im1= \""+vo.getSmallIcon()+"\" im2= \""+vo.getSmallIcon()+"\" ");
			}
			
			xmlSource.append(" tooltip=\"");
			xmlSource.append(vo.getModuleName());
			xmlSource.append("\" >\n");

			String tempType = "M";
			String url = vo.getModuleUrl();
			if (url == null)
				url = "/";
			url = url.replaceAll("&", "&amp;");

			if ("Y".equalsIgnoreCase(vo.getIsLeaf()))
				tempType = "M";
			xmlSource.append("<userdata name=\"type\">");
			xmlSource.append(tempType);
			xmlSource.append("</userdata>\n");
			xmlSource.append("<userdata name=\"isLeaf\">");
			xmlSource.append(vo.getIsLeaf());
			xmlSource.append("</userdata>\n");
			xmlSource.append("<userdata name=\"parentID\">");
			xmlSource.append(vo.getParentModuleId());
			xmlSource.append("</userdata>\n");				
			xmlSource.append("<userdata name=\"url\">");
			xmlSource.append(url);
			xmlSource.append("</userdata>\n");
			xmlSource.append("<userdata name=\"linktarget\">");
			xmlSource.append(vo.getLinkTarget());
			xmlSource.append("</userdata>\n");
			xmlSource.append("<userdata name=\"moduleCode\">");
			xmlSource.append(vo.getModuleCode());
			xmlSource.append("</userdata>\n");			
			xmlSource.append("<userdata name=\"domainname\">");
			//xmlSource.append(vo.getDomainName() );
			xmlSource.append("</userdata>\n");
		
			xmlSource.append("<userdata name=\"applicationCode\">");
			// xmlSource.append(vo.getApplicationCode());
			xmlSource.append("</userdata>\n</item>\n");
		}
		xmlSource.append("</tree>\n");
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		outs.write(xmlSource.toString());
		outs.close();
	}
%>

