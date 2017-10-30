package org.apache.jsp.ida40.module.reg.page.register;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.regaltec.ida40.common.SpringContextUtils;
import com.regaltec.ida40.reg.bo.IRegisterServiceBO;
import com.regaltec.baf.external.business.bi.IBusinessBI;
import com.regaltec.baf.business.common.valueobj.BusinessVO;
import com.regaltec.ida40.reg.model.RegService;
import com.regaltec.ida40.reg.xmlparser.XmlParser;
import org.apache.commons.lang.StringUtils;
import java.util.*;

public final class resourceInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	response.setHeader("Pragma","No-cache"); 
	response.setHeader("Cache-Control","no-cache"); 
	response.setDateHeader("Expires", 0); 
    //这些配置将来定义在数据字典里面(字典条目长度至需要3K字节长）
    String[] ddn={"NBID#电路编码","ELECWIDTH#带宽","ELECAID#甲端端口编号","ELECBID#乙端端口编号","BCCHANTYPE#业务类型","CURRENTSPEED#承诺速率","FINISHTIME#完工时间","MDFCELIANGINFOA#甲端测量室MDF信息","MDFCELIANGINFOB#乙端测量室MDF信息","MDFAINFO#甲端MDF信息","MDFBINFO#乙端MDF信息","MDFAINFO2#甲端第二对MDF信息","MDFBINFO2#乙端第二对MDF信息","OUTLINEAID#甲端外线编号","OUTLINEBID#乙端外线编号","NUMBEROFAPAIR#甲端电缆对数","NUMBEROFBPAIR#乙端电缆对数","AMODEM#甲端局端MODEM","BMODEM#乙端局端MODEM","COMMLINK#传输链路","UPDATEAEQU#通信范围维护等级","UPDATEBEQU#预占备注","UADATEATIME#更新时间","USERMODEMA #甲端用户端MODEM","USERMODEMB#乙端用户端MODEM","WEATHERIMPORUSER#是否主要用户(是否大用户)","USERGRADE#大用户等级","PVC#PVC信息","NPID#NP编号","NCEID#NCE编号","USERGROUP#53家集团用户ID","CHANGTUWAY#长途方向","VP1#本地等级","VP2#客户服务等级","USERNAMEA#甲端用户名","USERNAMEB#乙端用户名","USERPERSONA#甲端联系人","USERPERSONB#乙端联系人","USERTELEPHONEA#甲端联系电话","USERTELEPHONEB#乙端联系电话","USERADDRESSA#甲端用户地址","USERADDRESSB#乙端用户地址","WEATHERZHUBEI#是否主备","ZHUBEINUMBER#主备线路编号","WEATHERDAIWEI#是否代维","USERGROUPBH#电路维护等级","USERGROUPNAME#53家大用户名称","AJZBH#甲端局站编号","AJZMC#甲端局站名称","AXZQY#甲端局站行政区域","AGLQY#甲端局站管理区域","ASHQY#甲端局站市话区域","BJZBH#乙端局站编号","BJZMC#乙端局站名称","BXZQY#乙端局站行政区域","BGLQY#乙端局站管理区域","BSHQY#乙端局站市话区域","OUTLINEAIDTWO#甲端第二对外线编号","OUTLINEBIDTWO#乙端第二对外线编号","PDHZA#甲端频点（KHZ）","SJDBA#甲端衰减（dB）","BJZSA#甲端背景噪声（dbm）","DDJYA#甲端对地绝缘（mΩ）","XDJYA#甲端线对绝缘（mΩ）","PDHZB#乙端频点（KHZ）","SJDBB#乙端衰减（dB）","BJZSB#乙端背景噪声（dbm）","DDJYB#乙端对地绝缘（mΩ）","XDJYB#乙端线对绝缘（mΩ）","XLBZB#甲端线路备注","XLBZA#乙端线路备注","DLWHDJ#电路维护等级","KHFWDJ#客客维护等级","YWKTDJ#YWKTDJ","ZCWGSJ#ZCWGSJ"};
    String[] fenZuUser={"LINKID#网络编号","WEATHERCHUANWANG#是否串网","DDNELECID#相关DDN编号","EQUZPORT#接入端口编号","SPEED#通信速率","CURRENTSPEED#当前速率","FINISHTIME#完工时间","MJKWZ#局端MODEM框位置","M_SLOT#局端MODEM槽位","JDSB#CUG编号","YHDSB#用户设备类型","YHHLBH#用户环路编号","JHJHLBH#交换机环路编号","MDFHX#分组回线","OUTTWIREID#外线编号","MDFWZ#MDF位置","WIRESTATE#用户电缆","RWFS#入网方式","NUI#NUI编号","LJDH#联机电话","KXYW#可选业务","PVC#永久虚电路","CUG#闭合用户群","FXJF#反向计费","ZXNUI#专线NUI","HJCDX#呼叫重定向","HG#搜索群","DC#直接呼叫","VPN#虚拟专业网","GB#广播","FS#快速搜索","JFXXXS#计费信息现实","HJFZ#呼叫封阻","SLXS#速率协商","FZCDXS#分组长度协商","LLKZXS#流量控制协商","LJXD#逻辑信道","YJXDL#永久虚电路","CKCC#窗口尺寸","BCD#包长度","VIP#是否主要用户","YHDJ#用户等级","JM#局名","BYWLDZ#备用网络地址","ZYWLDZ#主用网络地址","WHETHERDELETE#是否删除","DELETETIME#删除时间","YHM#用户名","LXR#联系人","YHDZ#地址","LXRDH#电话","LSH#流水号","KHH#开户行","YHZH#银行帐号","FKFS#大用户等级","YB#邮编","BZ#备注","JZID#局站ID","USEREQU#用户端设备名","UPDATEEQU#用户端设备更换串号","UPDATEEQUDATE#用户端设备更换日期","EQUHARDVER#硬件版本","EQUSOFTVER#软件版本","MODIUSER#修改人","JZBH#局站编号","JZMC#局站名称","GLQY#管理区域","XZQY#行政区域","SHQY#市话区域"};
    String[] IPSEC={"LINE_ID#线路编号","USER_ID#客户编号","USER_NAME#客户名称","INSTALL_ADDRESS#安装地址","USER_TYPE#用户性质","USER_ LINKMAN#客户联系人","USER_PHONE#客户电话","ACCESS_NET_TYPE#入网方式","ISP#运营商","ISP_LINKMAN#运营商联系人","ISP_PHONE#运营商电话","MMN_MEMO#多媒体备注","DYNAMIC_ACCESS_USER_NAME#动态方式接入用户名","USER_FIX_IP#用户固定IP","USER_FIX_MASK#用户固定IP掩码","USER_FIX_GATEWAY#用户固定IP网关","USER_LAN_IP#用户内部局域网IP ","USER_LAN_MASK#用户内部局域网掩码","CUSTOMER_MANAGER#客户经理","MEMO#备注","HOSTNAME#主机名","DOMAIN_NAME#域名","SECRET_KEY#预共享密钥","NETWORK_MANAGER_ID#网管本地ID","PROTECT_NET_IP#对端保护网络IP","PROTECT_NET_MASK#对端保护网络掩码","PROTECT_NET_GATEWAY#对端网关IP地址","FINISH_TIME#全程完工时间","DEVICE_TYPE#设备型号","DEVICE_SEQUENCE#设备序列号","DN_INSTALLE_PERSON#数网安装人","DN_MEMO#数网备注"};
    //多业务结点用户
    String[] mbNode={"BBNO#BB编号","NBID#串网NB编号","WORKNO#工单编号","CIRCUITNO#电路编号","DIRECTION#方向","DKSPEED#端口速率","USERNAMEA#甲端用户名","USERNAMEB#乙端用户名","USERPERSONA#甲端用户联系人","USERPERSONB#乙端用户联系人","USERTELEA#甲端用户联系电话","USERTELEB#乙端用户联系电话","OUTLINEA#甲端专线编号","OUTLINEB#乙端专线编号","FINISHTIME#完工时间","PER#PER","SCR#SCR","MBS#MBS","QOS#QOS","APPNAME#甲端接入PP名称","FRUNI#FRUNI","FRUNIDLCI#FRUNIDLCI","LMI#LMI","CIR#CIR","EIR#EIR","FRATM#FRATM","FRATMDLCI#FRATMDLCI","IF1#甲端接入PPname IF","VCC#甲端接入PPname VCC","BPPNAME#上联PP name","IF2#上联PP name IF","VCC2#上联PP name VCC","PP15K#PP15K链路方式","CPPNAME#PP15K名称","IF3#PP15K IF","VCC3#PP15K VCC","ZPPNAME#乙端接入PP名称","IF4#乙端接入PP ACCESS SERVER IF","VCCDLCI#VCCDLCI","LMI4#乙端PP LMI","FRATM4#乙端PP FRATM","DLCI4#乙端PP DLCI","INTERFACE#乙端PP NETWORK IF","VCC4#乙端PP VCC","STATUS#状态","USERADDRA#甲端用户地址","USERADDRB#乙端用户地址","USERGRADE#用户等级"};
    //ATM用户
    String[]  ATM ={"PVCNO#PVC编号","BUSINESSKIND#业务种类","BUSINESSTYPE#业务类型","USERTYPE#用户类型","CIRCUITNO#电路编号","CASCADECIRCUITNO#串网电路编号","ACCESSTYPE#接入类型","USERNAME#用户名","ADDR#地址","BRANCHBUREAU#分局","REFPHONE#参考电话","CONTACTPERSON#联系人","CONTACTWAY#联系方式","DEVSOURCE#设备来源","TERMINALDEV#终端设备","MAINTAINMARK#代维标志","INTERFACESTANDARD#接口标准","GOLDENMARK#金卡标志","MEMO#备注","PORTSPEED#端口速率","PROTOCOLSPEED#协议速率","COMMUNICATIONMODE#通讯方式","SERVICELEVEL#服务等级","TRADEAGENCY#代理商","USERLEVEL#用户等级","COMMUNICATIONRANGE#通讯范围","CUSTOMERMARK#客户标识","CUSTOMERMANAGER#客户经理","QOS#QOS","SLA_LEVEL#SLA等级","ILDD#国际长途方向","JTNO#集团编号","OPERATORS#运行商","COUNTRY#国家","CITY#城市","CHARGEOFFACCOUNT#出帐户名","FR#FR","RELATEDRESTYPE#关联资源类型","RELATEDRESNO#关联资源编号","CORRELATIONPARAMETER#相关参数","USERPORTA#甲端用户端口","USERPORTB#乙端用户端口","CUSTOMERSERVLEV#客户服务等级","CIRCUITMAINTAINLEV#电路维护等级"};
    //全球眼(ICT业务)
    String[] QQYUSER= {"QQYNO#QQYNO编号","USERNAME#客户名称" ,"ADDRESS#客户地址","PERSON#法人" ,"TEL#联系电话","LINKNO#承载设备号","CHARACTER#客户类别","SPEED#速率","NETWORK#网络类别","USERIP#用户IP地址","GATEWAY#网关","CAMERA#视频设备类型","FLAT#接入平台" ,"ADD_TIME#完工时间"};

    //定制终端B2(商务领航信息版)
    String[]  IPMANNORMAL={"user_flag#用户标识","user_status#用户状态","broad_type#宽带类型","user_name#用户名称","user_address#用户地址","sub_bureau_code#分局","Post_no#邮政编码","access_Rate#入网速率","user_type#用户类型","contact_person#用户联系人","contact_tel#用户联系电话","broadband_account#宽带帐号","cooperation_type#合作模式","ont_port#ONT端口","obd#光分","obd_port#光分口","olt_port#Olt口","onu_id#ONU ID","onu_loid#ONU LOID","ftth_vlan#FTTH VLAN","is_netm#是否需要NetM调度","fibre_dist#光分线箱","mdu_port#MDU端口","mdu_vlan#MDU公客VLAN","mdu_upstream_olt#MDU上联OLT","mdu_upstream_olt_port#MDU上联OLT口","pon_vlan#PON商客VLAN","ponpop_name#PON/POP名","user_circuit#用户线路数据错","iptv_vlan#IPTV VLAN","itmsvoip_vlan#ITMS/VOIP VLAN","equipment_bureau_no#设备局号","equipment_no#设备号","ngn_device_no#NGN设备端口号","ftth_telephone_password#新FTTH电话密码"};
    //综资EPON
    String[]   EPON={"user_flag#用户标识","userstate#用户状态","broadband_access_type#宽带类型","user_name#用户名称","user_address#用户地址","sub_bureau_code#分局","Post_no#邮政编码","access_Rate#入网速率","user_type#用户类型","contact_person#用户联系人","contact_tel#用户联系电话","broadband_account#宽带帐号","cooperation_type#合作模式","ont_port#ONT端口","obd#光分","obd_port#光分口","olt_port#Olt口","onu_id#ONU ID","onu_loid#ONU LOID","ftth_vlan#FTTH VLAN","is_netm#是否需要NetM调度","fibre_dist#光分线箱","mdu_port#MDU端口","mdu_vlan#MDU公客VLAN","mdu_upstream_olt#MDU上联OLT","mdu_upstream_olt_port#MDU上联OLT口","pon_vlan#PON商客VLAN","ponpop_name#PON/POP名","user_circuit#用户线路数据错","iptv_vlan#IPTV VLAN","itmsvoip_vlan#ITMS/VOIP VLAN","equipment_bureau_no#设备局号","equipment_no#设备号","ngn_device_no#NGN设备端口号","ftth_telephone_password#新FTTH电话密码"}; 
    //网资
    String[]   netRes={"cir_flag_code#电路标记编号","main_circuit_net_type_code#主电路网络类型编号","service_grade_desc#客户服务等级","standby_cir_id#备用电路标识","service_status_id#客户服务状态","cir_route_detail#电路路由详情","cir_no#电路编号","standby_code#备用电路编号","cir_grade_des#电路服务等级","cir_id#电路标识","cir_name#电路名称","standby_cir_no#备用电路号码"};

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>资源信息</title>\r\n");
      out.write("<style>\r\n");
      out.write("#restable td{\r\n");
      out.write("\tborder-bottom: 1px dotted black;\r\n");
      out.write("\theight:23px;\r\n");
      out.write("\twidth:200px;\r\n");
      out.write("}\r\n");
      out.write("#restable th\r\n");
      out.write("{\r\n");
      out.write("  text-align:right;\r\n");
      out.write("  height:23px;\r\n");
      out.write("  font-weight: 500;\r\n");
      out.write("  color: rgb(78, 57, 185);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

  String specialtyId  =request.getParameter("specialtyId");
  String faultCode1 = request.getParameter("faultCode1");
  String nativenetId = request.getParameter("nativenetId");
  RegService  regserVo = null;
  IBusinessBI businessBI = null;
  try
  {
  	businessBI = SpringContextUtils.getBean("ext_baf_businessBI", IBusinessBI.class);
  	IRegisterServiceBO registerServiceBo = SpringContextUtils.getBean("regService", IRegisterServiceBO.class);
  	regserVo = registerServiceBo.getAllResInfo(faultCode1, nativenetId, specialtyId);
  }catch(Exception e)
  {
	 e.printStackTrace();
  }
  if( null == regserVo)
  {
	  out.println("获取资源信息失败！");
	  return;
  }
  else
  { 
	String xmlStr = new String(regserVo.getResourceInfo());
	if( null == xmlStr || xmlStr.length() < 1 )
	{
		out.println("获取资源信息失败！");
		return;
	}
	
	BusinessVO bvo = businessBI.selectBusinessByPrimaryKey(regserVo.getBusinessType());
	List<Map<String, String>> list = null;
	String[]  columns = null;
	if( null != bvo  && bvo.getExtField8() != null)
	{
		XmlParser xmlparser = new XmlParser();
		String ef8 = bvo.getExtField8();
		if( null != ef8 )
		{   //数据据资源
			if(ef8.indexOf("#DDN") > 0 || ef8.indexOf("#ATM") > 0 || ef8.indexOf("#QQYUSER") > 0 
					|| ef8.indexOf("#IPSEC") > 0  || ef8.indexOf("#IPMANNORMAL") > 0 
					|| ef8.indexOf("#FENZUUSER") > 0  || ef8.indexOf("#MBNODE") > 0) //获取数据资源
			{
				list = xmlparser.XMLToResourceInfo(xmlStr);
				String bType  = null;
				if( null != list && list.size() > 0 )
				{
					bType = list.get(0).get("businessType");  //业务类型
					if(  null != bType  && "DDN".equalsIgnoreCase(bType))  //数据资源类 DDN用户XML
					{  
						columns = ddn;
					}else if( null != bType && "MBNODE".equalsIgnoreCase(bType))//多业务结点用户
					{
						columns = mbNode;
					}else if( null != bType && "FENZUUSER".equalsIgnoreCase(bType))//分组用户
					{
						columns = fenZuUser;
					}else if( null != bType && "IPSEC".equalsIgnoreCase(bType))//IPSEC
					{
						columns = IPSEC;
					}else if( null != bType && "ATM".equalsIgnoreCase(bType))//ATM用户
					{
						columns = ATM;
					}
					else if( null != bType && "QQYUSER".equalsIgnoreCase(bType)) //全球眼(ICT业务)
					{
						columns = QQYUSER;
					}
					else if(  null != bType && "IPMANNORMAL".equalsIgnoreCase(bType))
					{
						columns = IPMANNORMAL;
					}
				}
			}else if( ef8.indexOf("#EPON") > 0) //获取综合资源  
			{
				Map<String,String> result = new HashMap<String,String> ();
				Map<String, Map<String,String>> maps = xmlparser.EponXMLToResourceInfo(xmlStr);
				if( null != maps && maps.size() > 0)
				{
					Iterator<String> it = maps.keySet().iterator();
					while(it.hasNext())
					{
						Map map = maps.get(it.next());
						if( null != map && map.size() > 0)
						{
							result.putAll(map);
						}
					}
				}
				if( result.size() > 0 )
				{
					list = new ArrayList<Map<String,String>>();
					list.add(result);
					columns = EPON;
				}
			}
			else if( ef8.indexOf("#NET|CDMA") > 0  ||  ef8.indexOf("#NET|CS") > 0 ||  ef8.indexOf("#NET|CR") > 0) //网络资源  
			{
				list = new ArrayList<Map<String,String>>();
				list = xmlparser.NetXMLparser(xmlStr);
				columns = netRes;
			}
		}
	}
	
	if( null != list && list.size() > 0)
	{
		
		Map<String, String>  map = list.get(0);  //返回多行数据时，只取第一行
		if( null != columns && columns.length > 0)
		{
			out.println("<center>");
			out.println("<table id='restable' border='0' style='border: none;font-size:13px;' frame='box'>");
			int i = 0 ;
			String colValue = null;
			for( String attr:columns)
			{   
				 String[] fieldNames = attr.split("#");
				 if( null != fieldNames && fieldNames.length == 2 )
				 {
					 colValue = map.get(fieldNames[0]); 
					 if( null == colValue || "null".equals(colValue) )
					 {
						 colValue = "";
					 }
					if( i%2 == 0 ) {out.print("<tr>");} 
					 out.print("<th>"+fieldNames[1]+"：</th><td>" +colValue+"</td>");
					 if( i > 0&& i%2 == 1 ) {out.print("</tr>");}
					i++;
				 }
			}
			out.println("</table>"); 
			out.println("</center>");
		}
    }
  }

      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
