package org.apache.jsp.jsp.systask;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Collection;
import java.util.Iterator;
import com.regaltec.blocimp.domain.SysServiceConfig;

public final class sysTaskMananger_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=GBK");
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
      out.write("<script type='text/javascript' src='/dwr/engine.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/dwr/util.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/dwr/interface/sysTaskAction.js'></script>\r\n");

   response.setHeader("Cache-Control","no-store"); //HTTP 1.1
   response.setHeader("Pragma","no-cache");        //HTTP 1.0
   response.setDateHeader ("Expires", 0);          //防止被proxy server cache

   Collection runningTaskCol = (Collection) request.getAttribute("runningTaskList");
   Collection stopTaskCol = (Collection) request.getAttribute("stopTaskList");
   
   String tabIndex = (String)request.getAttribute("tabIndex");
   if (tabIndex==null || tabIndex.length()==0)
      tabIndex = "0";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>后台服务管理</title>\r\n");
      out.write("<script src=\"/js/frameservice.js\"></script>\r\n");
      out.write("<script src=\"/js/tab/tabpane.js\" type=text/javascript></script> \r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/main.css\" type=\"text/css\"> \r\n");
      out.write("<link id=webfx-tab-style-sheet href=\"/js/tab/webfx.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<style>\r\n");
      out.write(".dyntable{\r\n");
      out.write("\tfont-size: 9pt;\r\n");
      out.write("\tword-break:break-all;\r\n");
      out.write("\tcursor: default;\r\n");
      out.write("\tBORDER: black 1px solid;\r\n");
      out.write("\tbackground-color:#FFFFFF;\r\n");
      out.write("\tborder-collapse:collapse;\r\n");
      out.write("\tborder-Color:#999999;\r\n");
      out.write("\talign:center;\r\n");
      out.write("\twidth:90%;\r\n");
      out.write("\tborder:0\r\n");
      out.write("}\r\n");
      out.write(".dyntitle{\r\n");
      out.write("   background-color:#C4FF9B;\r\n");
      out.write("   color:#3300FF;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".inputtext{\r\n");
      out.write("    border-color: #99AFEC; \r\n");
      out.write("\t border-width: 1;     \r\n");
      out.write("\t border-style: inset;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("   \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#f0f0f0\" text=\"#000000\" leftmargin=\"0\" style=\"overflow:auto\" topmargin=\"0\">\r\n");
      out.write("<br>\r\n");
      out.write("<form name=\"form1\" method=\"post\" action=\"\">\r\n");
      out.write("<input type=\"hidden\" name=\"serviceId\" value=\"\">\r\n");
      out.write("  <table width=\"90%\" border=\"0\" align=\"center\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>\r\n");
      out.write("      \t\r\n");
      out.write("        <div class=\"tab_aTab\" id=\"tabPane1\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t   tp1 = new WebFXTabPane( document.getElementById( \"tabPane1\" ) );\r\n");
      out.write("\t\t   function stopService(serviceId) {\r\n");
      out.write("\t\t   \t\tsysTaskAction.stopTask(serviceId,callbackStopService);\r\n");
      out.write("\t\t   }\r\n");
      out.write("\t\t   function callbackStopService(serviceId) {\r\n");
      out.write("\t\t   \t\tdocument.form1.serviceId.value=serviceId;\r\n");
      out.write("\t\t   \t\tdocument.form1.action=\"/sys/sysTaskAction.do?method=initRunningAndStopTaskIndex\";\r\n");
      out.write("\t\t   \t\tdocument.form1.submit();\r\n");
      out.write("\t\t   }\r\n");
      out.write("\t\t</script>\r\n");
      out.write("      <div class=\"tab_aTab\" id=\"tabPage1\" marginwidth=\"0\" marginheight=\"0\" topmargin=\"0\">\r\n");
      out.write("        <div align=left  class=tab><table align=left cellpadding=0 cellspacing=0 ><tr><td class=\"tabpaneleft\" ></td><td class=\"tabpanebg\" width=\"120\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/main_01/ico_fellow.gif\" width=\"18\">已启动</td><td class=\"tabpaneright\"></td></tr></table></div>\r\n");
      out.write("\t    <script type=\"text/javascript\">\r\n");
      out.write("\t    \ttp1.addTabPage( document.getElementById( \"tabPage1\" ) );\r\n");
      out.write("\t    \tfunction callbackStopTask(obj) {\r\n");
      out.write("\t    \t\tobj.disabled = true;\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    </script>\r\n");
      out.write("\t    \r\n");
      out.write("          <table class=\"table\" style=\"FONT-SIZE: 13px\"\r\n");
      out.write("            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box\r\n");
      out.write("            pcolor=\"#BCC8F5\">\r\n");
      out.write("            <TR class=\"titletr\">\r\n");
      out.write("              <TD height=\"23\" align=\"cneter\" width=\"10%\" nowrap>序号</TD>\r\n");
      out.write("              <TD height=\"23\" align=\"cneter\" width=\"25%\" nowrap>已启动服务名称</TD>  \r\n");
      out.write("              <TD height=\"23\" align=\"cneter\" width=\"50%\" nowrap>已启动服务CLASS</TD>\r\n");
      out.write("              <TD height=\"23\" align=\"cneter\" width=\"5%\" nowrap>默认启动</TD>\r\n");
      out.write("              <TD height=\"23\" align=\"cneter\" width=\"5%\" nowrap>只启动一次</TD>\r\n");
      out.write("              <TD height=\"23\" align=\"cneter\" width=\"5%\" nowrap>操作</TD>\r\n");
      out.write("            </TR>\r\n");

   if (runningTaskCol!=null && runningTaskCol.size()>0)
   {
      int startCounter = 0;
      Iterator startIter = runningTaskCol.iterator();      
      while (startIter.hasNext())
      {         
    	 SysServiceConfig vo = (SysServiceConfig)startIter.next();
    	 String serviceId = vo.getServiceId();
         String serviceName = vo.getServiceName();
         String serviceClass = vo.getServiceClass();
         String startDefault = vo.getStartDefault();
         String startRunonce = vo.getStartRunonce();
         startCounter++;

      out.write("      \r\n");
      out.write("            <TR>\r\n");
      out.write("              <TD class=\"data_Td_char\" align=\"center\" height=\"23\">");
      out.print(startCounter);
      out.write("</TD>\r\n");
      out.write("              <TD class=\"data_Td_char\" align=\"left\" height=\"23\">");
      out.print(serviceName);
      out.write("</TD>\r\n");
      out.write("              <TD class=\"data_Td_char\" align=\"left\" height=\"23\">");
      out.print(serviceClass);
      out.write("</TD>\r\n");
      out.write("              <TD class=\"data_Td_char\" align=\"left\" height=\"23\">");
      out.print(startDefault);
      out.write("&nbsp;</TD>\r\n");
      out.write("              <TD class=\"data_Td_char\" align=\"left\" height=\"23\">");
      out.print(startRunonce);
      out.write("</TD>\r\n");
      out.write("              <TD class=\"data_Td_char\" align=\"center\" height=\"23\"><input type=\"button\" onclick=\"stopService('");
      out.print(serviceId);
      out.write("');this.disabled=true;\" value=\"停止\"></TD>\r\n");
      out.write("            </TR>\r\n");

      }
   }

      out.write("\t\r\n");
      out.write("          </table>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"tab_aTab\" id=\"tabPage2\" marginwidth=\"0\" marginheight=\"0\" topmargin=\"0\">           \r\n");
      out.write("        <div align=left  class=tab><table align=left cellpadding=0 cellspacing=0  style=\"font-size:13px\"><tr><td class=\"tabpaneleft\" ></td><td class=\"tabpanebg\" width=\"120\">未启动</td><td class=\"tabpaneright\"></td></tr></table></div>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("        \ttp1.addTabPage( document.getElementById( \"tabPage2\" ) );\r\n");
      out.write("        \tfunction startService(serviceId) {\r\n");
      out.write("\t\t   \t\tsysTaskAction.startTask(serviceId,callbackStartService);\r\n");
      out.write("\t\t   }\r\n");
      out.write("\t\t   function callbackStartService(serviceId) {\r\n");
      out.write("\t\t    \tdocument.form1.serviceId.value=serviceId;\r\n");
      out.write("\t\t   \t\tdocument.form1.action=\"/sys/sysTaskAction.do?method=initRunningAndStopTaskIndex\";\r\n");
      out.write("\t\t   \t\tdocument.form1.submit();\r\n");
      out.write("\t\t   }\r\n");
      out.write("        </script>\r\n");
      out.write("          <table class=\"table\" style=\"FONT-SIZE: 13px\"\r\n");
      out.write("            cellspacing=0 bordercolordark=#ffffff cellpadding=1 width=100% bordercolorlight=#D7D7D7 border=1 frame=box\r\n");
      out.write("            pcolor=\"#BCC8F5\">\r\n");
      out.write("            <TR class=\"titletr\">\r\n");
      out.write("              <TD height=\"23\" align=\"cneter\" width=\"10%\" nowrap>序号</TD>\r\n");
      out.write("              <TD height=\"23\" align=\"cneter\" width=\"25%\" nowrap>未启动服务名称</TD>  \r\n");
      out.write("              <TD height=\"23\" align=\"cneter\" width=\"50%\" nowrap>未启动服务CLASS</TD>\r\n");
      out.write("              <TD height=\"23\" align=\"cneter\" width=\"5%\" nowrap>默认启动</TD>\r\n");
      out.write("              <TD height=\"23\" align=\"cneter\" width=\"5%\" nowrap>只启动一次</TD>\r\n");
      out.write("              <TD height=\"23\" align=\"cneter\" width=\"5%\" nowrap>操作</TD>\r\n");
      out.write("            </TR>\r\n");

   if (stopTaskCol!=null && stopTaskCol.size()>0)
   {
      int terminateCounter = 0;
      Iterator terminateIter = stopTaskCol.iterator();      
      while (terminateIter.hasNext())
      {         
    	  SysServiceConfig vo = (SysServiceConfig)terminateIter.next();
    	  String serviceId = vo.getServiceId();
    	  String serviceName = vo.getServiceName();
          String serviceClass = vo.getServiceClass();
          String startDefault = vo.getStartDefault();
          String startRunonce = vo.getStartRunonce();
          terminateCounter++;

      out.write("      \r\n");
      out.write("            <TR>\r\n");
      out.write("              <TD class=\"data_Td_char\" align=\"center\" height=\"23\">");
      out.print(terminateCounter);
      out.write("</TD>\r\n");
      out.write("              <TD class=\"data_Td_char\" align=\"left\" height=\"23\">");
      out.print(serviceName);
      out.write("</TD>\r\n");
      out.write("              <TD class=\"data_Td_char\" align=\"left\" height=\"23\">");
      out.print(serviceClass);
      out.write("</TD>\r\n");
      out.write("              <TD class=\"data_Td_char\" align=\"left\" height=\"23\">");
      out.print(startDefault);
      out.write("&nbsp;</TD>\r\n");
      out.write("              <TD class=\"data_Td_char\" align=\"left\" height=\"23\">");
      out.print(startRunonce);
      out.write("</TD>\r\n");
      out.write("              <TD class=\"data_Td_char\" align=\"center\" height=\"23\"><input type=\"button\" onclick=\"javascript:startService('");
      out.print(serviceId);
      out.write("');this.disabled=true;\" value=\"启动\"></TD>\r\n");
      out.write("            </TR>\r\n");

      }
   }

      out.write("\t\r\n");
      out.write("          </table>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("     </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</form>\r\n");
      out.write("<script language=\"javascript\"> \r\n");
      out.write("  var tabIndex = \"");
      out.print(tabIndex);
      out.write("\";\r\n");
      out.write("  tp1.setSelectedIndex(tabIndex);\r\n");
      out.write("  \r\n");
      out.write("  function ev_exit()\r\n");
      out.write("  {\r\n");
      out.write("     history.back();\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  /*实例公共服务对象*/\r\n");
      out.write("  var  fs = new frameService();\r\n");
      out.write("\r\n");
      out.write("  /*初始化工具区域，为创建按钮作准备*/\r\n");
      out.write("  /*\r\n");
      out.write("  fs.initbutton();\r\n");
      out.write("  fs.showtoolbar(); \r\n");
      out.write("  */\r\n");
      out.write("  /*创建各种操作按钮*/\r\n");
      out.write("  fs.hidetoolbar();\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
