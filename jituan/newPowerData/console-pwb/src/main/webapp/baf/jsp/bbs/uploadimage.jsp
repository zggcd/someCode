<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%
  String picUrl = request.getParameter("Picurl");
  System.out.println(picUrl); 
  String  step = request.getParameter("step"); 
   System.out.println(step); 
  String defaultPic ="${pageContext.request.contextPath}/baf/jsp/bbs/images/man.GIF";
 
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" >
<head>
<title></title>
<link href="${pageContext.request.contextPath}/baf/jsp/bbs/css/main.css" type="text/css" rel="Stylesheet" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/baf/jsp/bbs/js/jquery1.2.6.pack.js"></script>
    <script  type="text/javascript" src="${pageContext.request.contextPath}/baf/jsp/bbs/js/ui.core.packed.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/baf/jsp/bbs/js/ui.draggable.packed.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/baf/jsp/bbs/js/CutPic.js"></script>
    <script type="text/javascript">

    </script>
</head>
<body >
<table align="center" style="width:284px;height:355px">
<tr><td valign="top">
     <div class="left">
        
         <!--Step 2-->
         <div id="Step2Container" >                             
                   <div id="Canvas" class="uploaddiv">
                   
                            <div id="ImageDragContainer">                               
                               <img id="ImageDrag" class="imagePhoto" src="${pageContext.request.contextPath}<%=picUrl %>" style="border-width:0px;" />                                                        
                            </div>
                            <div id="IconContainer">                               
                               <img id="ImageIcon" class="imagePhoto" src="${pageContext.request.contextPath}<%=picUrl%>" style="border-width:0px;" />                                                        
                            </div>                          
                    </div>
                    <div class="uploaddiv">
                       <table>
                            <tr>
                                <td id="Min">
                                        <img alt="缩小" src="${pageContext.request.contextPath}/baf/jsp/bbs/images/_c.gif" onmouseover="this.src='${pageContext.request.contextPath}/baf/jsp/bbs/images/_c.gif';" onmouseout="this.src='${pageContext.request.contextPath}/baf/jsp/bbs/images/_h.gif';" id="moresmall" class="smallbig" />
                                </td>
                                <td>
                                    <div id="bar">
                                        <div class="child">
                                        </div>
                                    </div>
                                </td>
                                <td id="Max">
                                        <img alt="放大" src="${pageContext.request.contextPath}/baf/jsp/bbs/images/c.gif" onmouseover="this.src='${pageContext.request.contextPath}/baf/jsp/bbs/images/c.gif';" onmouseout="this.src='${pageContext.request.contextPath}/baf/jsp/bbs/images/h.gif';" id="morebig" class="smallbig" />
                                </td>
                            </tr>
                        </table>
                    </div>
                    <form action="${pageContext.request.contextPath}/zoomImage" method="post">
                    <input type="hidden" name="picture" value="${pageContext.request.contextPath}<%=picUrl%>"/>
                     <input name="txt_width" type="hidden" value="1" id="txt_width" />
                     <input name="txt_height" type="hidden" value="1" id="txt_height" />
                      <input name="txt_top" type="hidden" value="82" id="txt_top" />
                       <input name="txt_left" type="hidden" value="73" id="txt_left" />
                       <input name="txt_DropWidth" type="hidden" value="120" id="txt_DropWidth" />
                        <input name="txt_DropHeight" type="hidden" value="120" id="txt_DropHeight" />
                         <input name="txt_Zoom" type="hidden" id="txt_Zoom" />
                    <div class="uploaddiv">
                        <input type="submit" name="btn_Image" value="保存头像" id="btn_Image" />
                    </div> 
                    </form>          
                   
         </div>
     
     </div>
    </td></tr>
</table>
</body>
</html>