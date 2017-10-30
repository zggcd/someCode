package org.apache.jsp.business.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.regaltec.baf.external.org.organization.bi.IOrganizationBI;
import com.regaltec.baf.org.organization.common.valueobj.OrganizationVO;
import org.apache.commons.lang.StringUtils;
import java.util.*;
import java.io.*;
import org.springframework.web.context.*;
import com.regaltec.baf.framework.common.IBusiness;
import com.regaltec.baf.org.organization.common.valueobj.OrgTreeVO;
import com.regaltec.baf.org.user.common.valueobj.UserVO;
import com.regaltec.common.util.Constant;
import com.regaltec.baf.org.user.ui.control.UserLoginBean;
import com.regaltec.business.resMge.twMge.towerMge.common.valueobj.Tower;
import com.regaltec.business.resMge.twMge.platMge.common.valueobj.Plat;
import com.regaltec.business.resMge.roomMge.common.valueobj.Room;
import com.regaltec.business.resMge.siteMge.common.valueobj.Station;

public final class itowerTree_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=GBK");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");
	String objectId = request.getParameter("id");
	String unitids = request.getParameter("fullunitids");
	if (objectId == null || objectId.equals("0"))
		objectId = "";
	
	String queryFlag = request.getParameter("queryFlag");
	String isQuerySta = request.getParameter("isQuerySta");
	int flag = 0;
	if (queryFlag != null && !"".equalsIgnoreCase(queryFlag)) {
		flag = Integer.parseInt(queryFlag);
	}
	
	PrintWriter printOut = response.getWriter();
	StringBuilder builder = new StringBuilder();
	try {
		response.setContentType("text/xml; charset=GBK");
		ServletContext sc = session.getServletContext();
		WebApplicationContext ctx = (WebApplicationContext) sc.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
		IBusiness business = (IBusiness) ctx.getBean("baf_businessDelegate");
		Hashtable hashtable = new Hashtable();
		//获取当前登录用户对象
		UserLoginBean loginBean = (UserLoginBean)session.getAttribute("userLoginBean");
		UserVO userVO = null;
		if(loginBean!=null){
			userVO = loginBean.getCurrentUser();
		}
 		if(null!=userVO.getLeaderId()&&!userVO.getLeaderId().equals("")){
 			if(userVO.getLeaderId().equals("1001")||userVO.getLeaderId().equals("1002")||userVO.getLeaderId().equals("1003")){
 				hashtable.put("userType", userVO.getLeaderId());
 			}
 		}
		hashtable.put("orgid", objectId);
		if(userVO!=null){
			hashtable.put("user", userVO);
		}		
		hashtable.put("rightFactorCode", Constant.RIGHTFACTOR_CODE_ORG);
		hashtable.put("currentThread", Thread.currentThread().getName());
		hashtable.put("ServletContext",sc);
		Hashtable retHashtable = (Hashtable) business.invoke("baf_organizationBI", "selectNextObject", hashtable);
		List orgTreeList = null;
		List<Station> stationList = null;
		List<Tower> itowerList = null;
		List<Plat> platList = null;
		List<Room> roomList = null;
		if(StringUtils.isNotBlank(objectId)){
			stationList = (List<Station>) business.invoke(
				"bus_StationBI", "findStationList", hashtable);
		}
		if(flag ==1 || flag==2){
			itowerList = (List<Tower>) business.invoke(
				"bus_towerBI", "findItowerList", hashtable);
		}
		if(flag==2){
			hashtable.put("itowerId", objectId);
			platList = (List<Plat>) business.invoke(
				"bus_platBI", "findPlatList", hashtable);
		}
		if(flag==3){
			hashtable.put("areaId", objectId);
			roomList = (List<Room>) business.invoke(
				"bus_roomBI", "findRoomList", hashtable);
		}
		builder.append("<?xml version='1.0' encoding='GBK'?>\n");
		builder.append("<tree id=\"");
		/*如果查询节点参数objectId为空,则认为查询树的顶点,此时xml的tree id属性应为0,否则为objectId*/
		if(objectId == null ||  "".equals(objectId)){
		   builder.append("0");
		}
		else{
		   builder.append(objectId);
		}
		builder.append("\">\n");
		if (retHashtable != null){
			orgTreeList = (List) retHashtable.get("selectNextObject");
			if (orgTreeList != null){
				int k = 0;
			    for (int i=0;i<orgTreeList.size();i++) {
			    	OrgTreeVO vo = (OrgTreeVO)orgTreeList.get(i);
			    	if(("0".equals(isQuerySta) && vo.getObjecttypeid().equals("7")) || vo.getObjecttypeid().equals("9") || vo.getObjecttypeid().equals("13")){
			    		continue;
			    	}
			    	k++;
				 	builder.append("<item text=\"");
					builder.append(vo.getObjectname());
					builder.append("\" id=\"");
					builder.append(vo.getObjectid());
					builder.append("\" ");
					if(  "O".equalsIgnoreCase(vo.getObjectcategory()))
					{
					   builder.append(" im0 =\"department.gif\" im1 =\"department.gif\" im2=\"department.gif\" ");
					}
					else if(  "P".equalsIgnoreCase(vo.getObjectcategory()))
					{
					   builder.append(" im0 =\"position.gif\" im1 =\"position.gif\" im2=\"position.gif\" ");
					}
					else if( "E".equalsIgnoreCase(vo.getObjectcategory()))
					{
					    builder.append(" im0 =\"person.gif\" im1 =\"person.gif\" im2=\"person.gif\" ");
					}
					
					builder.append(" child = \"1\" ");
					//if( "2".equalsIgnoreCase(vo.getObjecttypeid())|| "1".equalsIgnoreCase(vo.getObjecttypeid()) ){
					
					if(k==1 && objectId.equals("")){
					   builder.append(" select = \"1\" ");
					   builder.append(" call = \"1\" ");
					   builder.append(" open = \"1\" "); 
					}
					
					if( !objectId.equals("") && unitids != null && unitids.indexOf(vo.getObjectid())> 0)
					{
					   builder.append(" select = \"1\" ");
					   builder.append(" call = \"1\" ");
					   builder.append(" open = \"1\" "); 
					}
					
					builder.append(" >\n");
						
					String treeCode = vo.getTreecode();
					builder.append("<userdata name=\"objectType\">");
					builder.append("<![CDATA[");
					if(StringUtils.isNotBlank(treeCode)){
						if(treeCode.length()==4){
							builder.append("GROUP");
						}else if(treeCode.length()==8){
							builder.append("PROVINCE");
						}else if(treeCode.length()==12){
							builder.append("CITY");
						}else if(treeCode.length()==16){
							builder.append("SITE");
						}
					}
					builder.append("]]>");
					builder.append("</userdata>\n");
					if(treeCode.length()==16){
						builder.append("<userdata name=\"countryId\">");
						builder.append("<![CDATA[");
						builder.append(vo.getObjectid());
						builder.append("]]>");
						builder.append("</userdata>\n");
						
						builder.append("<userdata name=\"cityId\">");
						builder.append("<![CDATA[");
						builder.append(vo.getParentobjectid());
						builder.append("]]>");
						builder.append("</userdata>\n");
						
						IOrganizationBI orgBi = (IOrganizationBI) ctx.getBean("ext_baf_organizationBI");
			            Hashtable param = new Hashtable();
			            param.put("orgid", vo.getParentobjectid());
			            param = orgBi.selectByPrimaryKey(param);
			            OrganizationVO organizationVO = (OrganizationVO) param.get("selectByPrimaryKey");
						builder.append("<userdata name=\"provinceId\">");
						builder.append("<![CDATA[");
						builder.append(organizationVO.getParentorgid());
						builder.append("]]>");
						builder.append("</userdata>\n");
					}
					
												
					builder.append("<userdata name=\"objectCategory\">");
					builder.append("<![CDATA[");
					builder.append(vo.getObjectcategory());
					builder.append("]]>");
					builder.append("</userdata>\n");
					
					builder.append("<userdata name=\"treecode\">");
					builder.append("<![CDATA[");
					builder.append(vo.getTreecode());
					builder.append("]]>");
					builder.append("</userdata>\n");
					
					builder.append("<userdata name=\"objectTypeId\">");
					builder.append("<![CDATA[");
					builder.append(vo.getObjecttypeid());
					builder.append("]]>");
					builder.append("</userdata>\n");
					
					builder.append("</item>\n");
				}	
		  	}
	 	}
	 	if (stationList != null && !stationList.isEmpty()) {
			int k = 0;
			for (Station vo : stationList) {
				k++;
				builder.append("<item text=\"");
				builder.append(vo.getName());
				builder.append("\" id=\"");
				builder.append(vo.getId());
				builder.append("\" ");
				builder.append(" im0 =\"position.gif\" im1 =\"position.gif\" im2=\"position.gif\" ");

				builder.append(" child = \"1\" ");
				if (k == 1 && objectId.equals("")) {
					builder.append(" select = \"1\" ");
					builder.append(" call = \"1\" ");
					builder.append(" open = \"1\" ");
				}

				builder.append(" >\n");

				builder.append("<userdata name=\"objectType\">");
				builder.append("<![CDATA[");
				builder.append("STATION");
				builder.append("]]>");
				builder.append("</userdata>\n");
				
				builder.append("<userdata name=\"countryId\">");
				builder.append("<![CDATA[");
				builder.append(vo.getCountyid());
				builder.append("]]>");
				builder.append("</userdata>\n");
				
				builder.append("<userdata name=\"cityId\">");
				builder.append("<![CDATA[");
				builder.append(vo.getCityid());
				builder.append("]]>");
				builder.append("</userdata>\n");
				
				builder.append("<userdata name=\"provinceId\">");
				builder.append("<![CDATA[");
				builder.append(vo.getProvinceid());
				builder.append("]]>");
				builder.append("</userdata>\n");

				builder.append("</item>\n");
			}
		}
	 	if (itowerList != null && !itowerList.isEmpty()) {
			int k = 0;
			for (Tower vo : itowerList) {
				k++;
				builder.append("<item text=\"");
				builder.append(vo.getName());
				builder.append("\" id=\"");
				builder.append(vo.getId());
				builder.append("\" ");
				builder.append(" im0 =\"Tower18.png\" im1 =\"Tower18.png\" im2=\"Tower18.png\" ");

				builder.append(" child = \"1\" ");
				if (k == 1 && objectId.equals("")) {
					builder.append(" select = \"1\" ");
					builder.append(" call = \"1\" ");
					builder.append(" open = \"1\" ");
				}

				builder.append(" >\n");

				builder.append("<userdata name=\"objectType\">");
				builder.append("<![CDATA[");
				builder.append("ITOWER");
				builder.append("]]>");
				builder.append("</userdata>\n");
				
				builder.append("<userdata name=\"countryId\">");
				builder.append("<![CDATA[");
				builder.append(vo.getCountyid());
				builder.append("]]>");
				builder.append("</userdata>\n");
				
				builder.append("<userdata name=\"cityId\">");
				builder.append("<![CDATA[");
				builder.append(vo.getCityid());
				builder.append("]]>");
				builder.append("</userdata>\n");
				
				builder.append("<userdata name=\"provinceId\">");
				builder.append("<![CDATA[");
				builder.append(vo.getProvinceid());
				builder.append("]]>");
				builder.append("</userdata>\n");
				
				builder.append("<userdata name=\"stationId\">");
				builder.append("<![CDATA[");
				builder.append(vo.getSiteid());
				builder.append("]]>");
				builder.append("</userdata>\n");

				builder.append("</item>\n");
			}
		}
		if (platList != null && !platList.isEmpty()) {
			int k = 0;
			for (Plat vo : platList) {
				k++;
				builder.append("<item text=\"");
				builder.append(vo.getName());
				builder.append("\" id=\"");
				builder.append(vo.getId());
				builder.append("\" ");
				builder.append(" im0 =\"basis.gif\" im1 =\"basis.gif\" im2=\"basis.gif\" ");

				builder.append(" child = \"1\" ");
				if (k == 1 && objectId.equals("")) {
					builder.append(" select = \"1\" ");
					builder.append(" call = \"1\" ");
					builder.append(" open = \"1\" ");
				}

				builder.append(" >\n");
				
				builder.append("<userdata name=\"countryId\">");
				builder.append("<![CDATA[");
				builder.append(vo.getAreaid());
				builder.append("]]>");
				builder.append("</userdata>\n");
				
				builder.append("<userdata name=\"itowerId\">");
				builder.append("<![CDATA[");
				builder.append(vo.getItowerid());
				builder.append("]]>");
				builder.append("</userdata>\n");
				
				builder.append("<userdata name=\"stationId\">");
				builder.append("<![CDATA[");
				builder.append(vo.getStationid());
				builder.append("]]>");
				builder.append("</userdata>\n");
				

				builder.append("<userdata name=\"objectType\">");
				builder.append("<![CDATA[");
				builder.append("PLAT");
				builder.append("]]>");
				builder.append("</userdata>\n");
				
				builder.append("</item>\n");
			}
		}
		if (roomList != null && !roomList.isEmpty()) {
			int k = 0;
			for (Room vo : roomList) {
				k++;
				builder.append("<item text=\"");
				builder.append(vo.getRoomname());
				builder.append("\" id=\"");
				builder.append(vo.getId());
				builder.append("\" ");
				builder.append(" im0 =\"room18.png\" im1 =\"room18.png\" im2=\"room18.png\" ");

				builder.append(" child = \"1\" ");
				if (k == 1 && objectId.equals("")) {
					builder.append(" select = \"1\" ");
					builder.append(" call = \"1\" ");
					builder.append(" open = \"1\" ");
				}

				builder.append(" >\n");

				builder.append("<userdata name=\"objectType\">");
				builder.append("<![CDATA[");
				builder.append("ROOM");
				builder.append("]]>");
				builder.append("</userdata>\n");
				
				builder.append("<userdata name=\"countryId\">");
				builder.append("<![CDATA[");
				builder.append(vo.getCountyid());
				builder.append("]]>");
				builder.append("</userdata>\n");
				
				builder.append("<userdata name=\"cityId\">");
				builder.append("<![CDATA[");
				builder.append(vo.getCityid());
				builder.append("]]>");
				builder.append("</userdata>\n");
				
				builder.append("<userdata name=\"provinceId\">");
				builder.append("<![CDATA[");
				builder.append(vo.getProvinceid());
				builder.append("]]>");
				builder.append("</userdata>\n");

				builder.append("</item>\n");
			}
		}
	 	builder.append("</tree>\n");
	}catch (Exception e) {
		e.printStackTrace();
	}finally{
		printOut.write(builder.toString());
		printOut.close();
	}

      out.write("\r\n");
      out.write("\r\n");
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
