package org.apache.jsp.business.resMge.pwMge.fsuMge.map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.springframework.web.context.*;
import com.regaltec.baf.framework.common.IBusiness;
import com.regaltec.baf.org.user.common.valueobj.UserVO;
import com.regaltec.common.util.Constant;
import com.regaltec.baf.org.user.ui.control.UserLoginBean;
import com.regaltec.baf.module.common.valueobj.ElementVO;
import com.regaltec.baf.external.rig.right.bi.IOperateRightBI;

public final class map_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	
	String orgId = "";
	String personCenterX =  "";
	String personCenterY =  "";
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
	String userId = "";
	String maxOR = "";
	if(userVO != null){
		orgId = userVO.getUnitId();
	}
	hashtable.put("rightFactorCode", Constant.RIGHTFACTOR_CODE_ORG);
	hashtable.put("currentThread", Thread.currentThread().getName());
	hashtable.put("ServletContext",sc);
	hashtable.put("orgId", orgId.split(","));		
	List<HashMap<String, Object>> list = (List<HashMap<String, Object>>)  business.invoke("bus_alarmActiveBI", "findOrgXY", hashtable);
	if(list != null && !list.isEmpty()){
		HashMap<String, Object> map = list.get(0);
		personCenterX = (String)map.get("X");
		personCenterY = (String)map.get("Y");
	}

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\" />\r\n");
      out.write("  <meta http-equiv=\"Cache-Control\" content=\"no-store\" />\r\n");
      out.write("  <meta http-equiv=\"Pragma\" content=\"no-cache\" />\r\n");
      out.write("  <meta http-equiv=\"Expires\" content=\"0\" />\r\n");
      out.write("  <title>地图</title>\r\n");
      out.write(" <style type=\"text/css\">\r\n");
      out.write("\t\tbody, html,#allmap {width: 100%;height: 100%;overflow: hidden;margin:0;font-family:\"微软雅黑\";}\r\n");
      out.write("\t\t.anchorBL{display:none}\r\n");
      out.write("\t\t.BMap_scaleCtrl{display:block}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://api.map.baidu.com/api?v=2.0&ak=GVjmmVYGXD46FX56mYwzjdlF\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://api.map.baidu.com/library/TextIconOverlay/1.2/src/TextIconOverlay_min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/business/resMge/pwMge/fsuMge/map/MarkerClusterer.js\"></script>\r\n");
      out.write("  </head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"allmap\"></div> \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar personCenterX = \"");
      out.print(personCenterX);
      out.write("\";\r\n");
      out.write("\tvar personCenterY = \"");
      out.print(personCenterY);
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("\t// 百度地图API功能\r\n");
      out.write("\tvar map = new BMap.Map(\"allmap\");\r\n");
      out.write("\t//BMAP_PERSPECTIVE_MAP 三维  BMAP_SATELLITE_MAP：卫星\r\n");
      out.write("\tif(personCenterX != \"\" && personCenterY != \"\"){\r\n");
      out.write("\t\tmap.centerAndZoom(new BMap.Point(personCenterX,personCenterY),10);\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tmap.centerAndZoom(new BMap.Point(107.30968,35.572893),5);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tmap.enableScrollWheelZoom();  // 开启鼠标滚轮缩放 \r\n");
      out.write("\tmap.enableKeyboard();         // 开启键盘控制 \r\n");
      out.write("\tmap.enableContinuousZoom();   // 开启连续缩放效果 \r\n");
      out.write("\tmap.enableInertialDragging(); // 开启惯性拖拽效果\r\n");
      out.write("\r\n");
      out.write("\tmap.addControl(new BMap.NavigationControl()); //添加标准地图控件(左上角的放大缩小左右拖拽控件)\r\n");
      out.write("\tmap.addControl(new BMap.ScaleControl());      //添加比例尺控件(左下角显示的比例尺控件)\r\n");
      out.write("\tmap.addControl(new BMap.OverviewMapControl()); \r\n");
      out.write("\t\r\n");
      out.write("\tvar mapType = new BMap.MapTypeControl({mapTypes: [BMAP_NORMAL_MAP,BMAP_HYBRID_MAP]});\r\n");
      out.write("\tmap.addControl(mapType); \r\n");
      out.write("\t\r\n");
      out.write("\tvar stCtrl = new BMap.PanoramaControl(); //构造全景控件\r\n");
      out.write("\tstCtrl.setOffset(new BMap.Size(40, 60));\r\n");
      out.write("\tmap.addControl(stCtrl);//添加全景控件\r\n");
      out.write("\t\r\n");
      out.write("\t//给地图添加右键菜单\r\n");
      out.write("\tvar menuMap = new BMap.ContextMenu();\r\n");
      out.write("\tvar txtMenuItem = [\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\ttext:'显示铁塔',\r\n");
      out.write("\t\t\tcallback:function(){\r\n");
      out.write("\t\t\t\tmarkerClusterer = null;\r\n");
      out.write("\t\t\t\tmarkerClusterer = new BMapLib.MarkerClusterer(map, {markers:markers});\r\n");
      out.write("\t\t\t\tmarkerClusterer._createClusters();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\ttext:'隐藏铁塔',\r\n");
      out.write("\t\t\tcallback:function(){markerClusterer.clearMarkers();}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t];\r\n");
      out.write("\tfor(var i=0; i < txtMenuItem.length; i++){\r\n");
      out.write("\t\tmenuMap.addItem(new BMap.MenuItem(txtMenuItem[i].text,txtMenuItem[i].callback,100));\r\n");
      out.write("\t}\r\n");
      out.write("\tmap.addContextMenu(menuMap);\r\n");
      out.write("\t\r\n");
      out.write("\tfunction addMouseOverHandler(label,marker){\r\n");
      out.write("\t\tmarker.addEventListener(\"mouseover\",function(e){\r\n");
      out.write("\t\t\tlabel.setStyle({\"display\":\"\"});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction addMouseOutHandler(label,marker){\r\n");
      out.write("\t\tmarker.addEventListener(\"mouseout\",function(e){\r\n");
      out.write("\t\t\tlabel.setStyle({\"display\":\"none\"});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tvar markers = new Array();\r\n");
      out.write("\tvar markerClusterer = null;\r\n");
      out.write("\tfunction fixedPointPosition(nameArr,xArr,yArr){\r\n");
      out.write("\t\tclearMarker();\r\n");
      out.write("\t\tvar point = null;\r\n");
      out.write("\t\tif(xArr != null && xArr.length>0){\r\n");
      out.write("\t\t\tfor(var i=0;i<xArr.length;i++){\r\n");
      out.write("\t\t\t\tif(xArr[i]&&yArr[i]){\r\n");
      out.write("\t\t\t\t\t//创建新图标\r\n");
      out.write("\t\t\t\t\tvar pt = new BMap.Point(xArr[i],yArr[i]); //图标的坐标\r\n");
      out.write("\t\t\t\t\tvar myIcon = new BMap.Icon(\"image/tower.png\", new BMap.Size(32,32)); //生成图标和大小\r\n");
      out.write("\t\t\t\t\tvar marker2 = new BMap.Marker(pt,{icon:myIcon});  // 创建图标\r\n");
      out.write("\t\t\t\t\tvar label = new BMap.Label(nameArr[i],{offset:new BMap.Size(20,-10)});// 创建标注\r\n");
      out.write("\t\t\t\t\tlabel.setStyle({\"display\":\"none\"});\r\n");
      out.write("\t\t\t\t\tmarker2.setLabel(label);  // 将标注添加到地图中\r\n");
      out.write("\t\t\t\t\tmap.addOverlay(marker2);  \r\n");
      out.write("\t\t\t\t\taddMouseOverHandler(label,marker2);\r\n");
      out.write("\t\t\t\t\taddMouseOutHandler(label,marker2);\r\n");
      out.write("\t\t\t\t\t//alert(i);\r\n");
      out.write("\t\t\t\t\tif(i==0){\r\n");
      out.write("\t\t\t\t\t\tpoint = pt;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tmarkers.push(marker2);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(markers != null && markers.length>0){\r\n");
      out.write("\t\t\t\tmarkerClusterer = new BMapLib.MarkerClusterer(map, {markers:markers});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tmap.centerAndZoom(point, 12); \r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//清除marker\r\n");
      out.write("\tfunction clearMarker(){\r\n");
      out.write("\t\tif(markers != null && markers.length>0){\r\n");
      out.write("\t\t\tif(markerClusterer != null)\r\n");
      out.write("\t\t\t\tmarkerClusterer.clearMarkers();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tmarkers = [];\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getClass(tagName,className){\r\n");
      out.write("\t\r\n");
      out.write("\t    if(document.getElementsByClassName){        \r\n");
      out.write("\t    \treturn document.getElementsByClassName(className);\r\n");
      out.write("\t    }else{       \r\n");
      out.write("\t    \tvar tags=document.getElementsByTagName(tagName);\r\n");
      out.write("\t        var tagArr=[];\r\n");
      out.write("\t        for(var i=0;i < tags.length; i++)\r\n");
      out.write("\t        {\r\n");
      out.write("\t            if(tags[i].className == className)\r\n");
      out.write("\t            {\r\n");
      out.write("\t                tagArr[tagArr.length] = tags[i];\r\n");
      out.write("\t            }\r\n");
      out.write("\t        }\r\n");
      out.write("\t        return tagArr;\r\n");
      out.write("\t    }\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction setImg(){\r\n");
      out.write("\t\tvar divArr = getClass(\"div\",\" anchorBL\");\r\n");
      out.write("\t\tif(divArr != null){\r\n");
      out.write("\t\t\tfor(var i=0;i<divArr.length;i++){\r\n");
      out.write("\t\t\t\t\tdivArr[i].innerHTML = \"<img style='border:none;width:77px;height:32px' src='/baf/images/mapLogo.png'>\";\r\n");
      out.write("\t\t\t\t\tdivArr[i].style.display=\"block\";\r\n");
      out.write("\t\t\t\t\t//map.removeEventListener(\"tilesloaded\", setImg);   \r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tmap.addEventListener(\"tilesloaded\",setImg);\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write(" \r\n");
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
