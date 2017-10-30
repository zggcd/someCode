<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.net.InetAddress"%>
<%@ page import="org.springframework.web.context.*"%>
<%@ page import="com.regaltec.baf.framework.common.IBusiness"%>
<%@ page import="com.regaltec.baf.framework.bp.BusinessDelegateImpl"%>
<%@ page import="com.regaltec.baf.module.common.valueobj.ModuleVO"%>
<%@ page import="com.regaltec.baf.module.common.valueobj.ElementVO"%>
<%@ page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@ page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>

<%@ page import="com.regaltec.baf.dict.dictionary.common.valueobj.DictionaryItemVO"%>
<%@page import="com.regaltec.common.util.StringHelper"%>
<%@ page import="com.regaltec.common.parameter.SystemParameter"%>

<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");

     String ip = null;
	 try
     {
           InetAddress addr = InetAddress.getLocalHost();
           ip=addr.getHostAddress().toString();//获得本机IP
           //String address=addr.getHostName().toString();//获得本机名称
     }catch(Exception e)
     {
            e.printStackTrace();
     }
	String moduleId = request.getParameter("id");
	if (moduleId == null || moduleId.equals("0")){
		moduleId = "";
	}
	PrintWriter outs = null;
	StringBuilder buf = null;
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
		
		outs = response.getWriter();
		buf = new StringBuilder();
		buf.append("<?xml version='1.0' encoding='GBK'?>\n");
		if (!moduleId.equalsIgnoreCase("")) {
			buf.append("<tree id=\""+moduleId+"\">\n");
		} else {
			buf.append("<tree id=\"0\">\n");
		}
		String child = "";
		String open = " open=\"true\" call=\"1\" select=\"1\" ";
		int k = 0;		

		Hashtable hash = new Hashtable();
		hash.put("parentModuleId", moduleId);
		hash.put("ServletContext", sc);
		//获取当前登录用户对象
		UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
		UserVO userVO = null;
		if(loginBean!=null){
			userVO = loginBean.getCurrentUser();
		}
		if(userVO != null){
			hash.put("user",userVO);
		}
		
		hash = (Hashtable) business.invoke("baf_moduleBI","getChildrenByUser", hash);
		List list = null;
		if(hash!=null){
			list = (List) hash.get("getChildrenByUser");
		}
		
		if(list!=null && list.size()>0){
			for (int i = 0; i < list.size(); i++) {
				ModuleVO vo = (ModuleVO) list.get(i);
				k++;
				//判断是否显示在导航页中
				if("N".equalsIgnoreCase(vo.getIsShowedInNav())){
					continue;
				}
				//PDA模块不显示在导航栏
                if("PDA".equalsIgnoreCase(vo.getClientType())){
					continue;
				}
				String isLeaf = vo.getIsLeaf();
				if ("Y".equalsIgnoreCase(isLeaf) || "F".equalsIgnoreCase(isLeaf)) {  //”F“表示只给用户授予了父节点的权限，而没有子权限，在导航菜单上点击该模块不链接新页面
					//如果是叶子节点
					child = "0";
				} else {
					//不是叶子节点
					child = "1";
				}			
				buf.append("<item text=\""+vo.getModuleName()+"\" id=\""+vo.getModuleId()+"\" child=\""+child+"\"");			
				if (k == 1 && moduleId.equalsIgnoreCase("")){
					buf.append(open);
				}
				
				//判断图片是否存在
				boolean iconExist = false;
				if(vo.getSmallIcon() != null){
					File file = new File(request.getRealPath("/")+"/baf/images/dhtmlxtree/"+vo.getSmallIcon());
					if(file.exists()){
						iconExist = true;
					}
				}
				if(vo.getSmallIcon() == null || iconExist==false){
					if( "1".equals(child)){
						buf.append(" im0 =\"box.gif\" im1 =\"box.gif\" im2=\"box.gif\" ");
					}else{
						buf.append(" im0 =\"titli02.gif\" im1 =\"titli02.gif\" im2=\"titli02.gif\" ");							
					}
				}else{
					buf.append(" im0= \""+vo.getSmallIcon()+"\" im1= \""+vo.getSmallIcon()+"\" im2= \""+vo.getSmallIcon()+"\" ");
				}
				
				buf.append(" tooltip=\""+vo.getModuleName()+"\" >\n");
				String tempType = "M";
				String url = vo.getModuleUrl();
				
				//上海客保添加给功能模块更换成字典配置链接，实现根据不同字典配置跳转到不同的页面 2014-9-10
				//获取开关
				String isOpen="";
				Hashtable<String,Object> syshashtable = new Hashtable<String, Object>();
				syshashtable.put("itemCode", "SYS_ISOPEN_SERVERCHANGE");
				syshashtable.put("ServletContext", sc);	
				syshashtable = (Hashtable) business.invoke("baf_commonBI","getParameterValue", syshashtable);
				if (syshashtable != null) {
					isOpen = (String) syshashtable.get("getParameterValue");
				}
				if("Y".equals(isOpen)){
					Hashtable param = new Hashtable();
					param.put("dictionaryCode", "IDD_SERVERCHANGE");
					param.put("ServletContext", sc);
					param = (Hashtable) business.invoke("baf_dictionaryItemBI","getAllItemsByDictCode", param);
					String mId=vo.getModuleId();
					
					String serverIp=mId+"-"+ip;//拼接成 Id-ip  id：模块Id，ip：服务器的ip
					if(param!=null){
						List<DictionaryItemVO> relist=(List<DictionaryItemVO>)param.get("getAllItemsByDictCode");
						if(null!=relist&&relist.size()>0){
							for(int j=0;j<relist.size();j++){
								DictionaryItemVO itemvo=relist.get(j);
								String itemCode=itemvo.getItemCode();
								if(serverIp.equals(itemCode)&&
									!"".equals(StringHelper.convertStringNull(itemvo.getItemValue()))){
									url=itemvo.getItemValue();//如果和字典配置的匹配，就使用字典配置的url代替模块的url
									break;	
								}
							}
						}
					}	
				}
					
				
				if ("Y".equalsIgnoreCase(vo.getIsLeaf())){
					tempType = "M";
				}
				buf.append("<userdata name=\"type\">"+tempType+"</userdata>\n");
				buf.append("<userdata name=\"isLeaf\">"+vo.getIsLeaf()+"</userdata>\n");
				buf.append("<userdata name=\"url\"><![CDATA["+url+"]]></userdata>\n");
				buf.append("<userdata name=\"linktarget\">"+vo.getLinkTarget()+"</userdata>\n");
				buf.append("<userdata name=\"domainname\"></userdata>\n");
				buf.append("<userdata name=\"applicationId\">"+StringHelper.convertStringNull(vo.getApplicationId())+"</userdata>\n");
			    if(  vo.getModuleDesc() != null )
			    {
			    	buf.append("<userdata name=\"desc\"><![CDATA["+vo.getModuleDesc()+"]]></userdata>\n");
			    }
			    buf.append("</item>\n");
			}
		}
		
		buf.append("</tree>\n");		
	} catch (Exception e) {
		e.printStackTrace();
	} finally{
		outs.write(buf.toString());
		outs.close();
	}
%>

