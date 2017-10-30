package org.apache.jsp.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class player_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>声音警告</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<object id=\"wmplayer\" width=\"0\" height=\"0\"\r\n");
      out.write("\t\t\tclassid=\"CLSID:6BF52A52-394A-11d3-B153-00C04F79FAA6\"\r\n");
      out.write("\t\t\ttype=\"application/x-oleobject\" >\r\n");
      out.write("\t\t\t<param name=\"SendPlayStateChangeEvents\" value=\"true\">\r\n");
      out.write("\t\t\t<param name=\"autoStart\" value=\"true\">\r\n");
      out.write("\t\t\t<param name=\"uiMode\" value=\"invisible\">\r\n");
      out.write("\t\t\t<param name=\"playCount\" value=\"1\">\r\n");
      out.write("\t\t\t<param name=\"volume\" value=\"100\">\r\n");
      out.write("\t\t</object>\r\n");
      out.write("\t\t<input type=\"button\" name =\"循环播放\" onclick='setSoundPlayer (\"start\",\"receive.wav\",\"loop\");'/>\r\n");
      out.write("\t\t<input type=\"button\" name =\"一次播放\" onclick='setSoundPlayer (\"start\",\"receive.wav\",\"once\");'/>\r\n");
      out.write("\t\t<input type=\"button\" name =\"停止\" onclick='setSoundPlayer (\"stop\",\"\",\"\");'/>\r\n");
      out.write("\t\t<input type=\"button\" name =\"静音\" onclick='setSoundPlayer (\"mute\",\"\",\"\");'/>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar pWmplayerInterval;\r\n");
      out.write("\t\tfunction setSoundPlayer(stat,wavFileName,loopMode) {\r\n");
      out.write("\t\t\t//  控制播放器函数 ，参数如下\r\n");
      out.write("\t\t\t//stat :    start--开始  stop --停止 mute-- 静音\r\n");
      out.write("\t\t\t//loopMode : loop--循环; once --只播放一次\r\n");
      out.write("\t\t\t//wavFileName :  声音文件名，全部制定放在 /web/sound/\r\n");
      out.write("\t\t\tif(stat==\"start\") {\r\n");
      out.write("\t\t\t\twmplayer.settings.mute = false;\r\n");
      out.write("\t\t\t\twmplayer.url=\"/sound/\"+ wavFileName;\r\n");
      out.write("\t\t\t\tif(loopMode==\"loop\") {\r\n");
      out.write("\t\t\t\t\tif(pWmplayerInterval!=null) clearInterval(pWmplayerInterval);\r\n");
      out.write("\t\t\t\t\tpWmplayerInterval=setInterval(\"wmplayer.controls.play()\",1000);\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\twmplayer.controls.play();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} else if(stat==\"stop\") {\r\n");
      out.write("\t\t\t\tif (wmplayer.controls.isavailable('stop')) {\r\n");
      out.write("\t\t\t\t\twmplayer.controls.stop();\r\n");
      out.write("\t\t\t\t\tif(pWmplayerInterval!=null) clearInterval(pWmplayerInterval);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} else if(stat==\"mute\") {\r\n");
      out.write("\t\t\t\twmplayer.settings.mute = !wmplayer.settings.mute;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tparent.openCheckLoop();\r\n");
      out.write("\t</script>\r\n");
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
