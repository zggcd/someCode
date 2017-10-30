
 <%
 com.regaltec.baf.profile.theme.ui.control.SkinBean skinBean = (com.regaltec.baf.profile.theme.ui.control.SkinBean)session.getAttribute("skinBean"); 
  if( null != skinBean)
  {
	if ("DEFAULT".equals(skinBean.getSkin()) || "classic".equals(skinBean.getSkin())){ %>
	   <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/pwb/common/easyui/themes/gray/easyui.css" />
	<% }else if ("blueSky".equals(skinBean.getSkin())){%>
	     <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/pwb/common/easyui/themes/default/easyui.css" />
	<%}
    }else{%>
	  <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/pwb/common/easyui/themes/gray/easyui.css" />
 <%}%>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/pwb/common/easyui/themes/icon.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/pwb/common/easyui/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/pwb/common/easyui/jquery.easyui.min.js"></script>
<%
    String locale = request.getLocale().toString();
    if( "zh_CN".equals(locale))
    {%>
    
    <script type="text/javascript" src="<%=request.getContextPath()%>/pwb/common/easyui/locale/easyui-lang-zh_CN.js"></script>
    <%}else{%>
    
<%}%>