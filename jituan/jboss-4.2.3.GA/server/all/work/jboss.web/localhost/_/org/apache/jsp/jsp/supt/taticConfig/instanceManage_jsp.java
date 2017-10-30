package org.apache.jsp.jsp.supt.taticConfig;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class instanceManage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/jsp/common/allTag.jsp");
    _jspx_dependants.add("/WEB-INF/custom-tag.tld");
  }

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
      out.write("<script type='text/javascript' src='/js/prototype.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/js/commonjs.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/js/validator.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/dwr/engine.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/dwr/util.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/dwr/interface/taticConfigAction.js'></script>\r\n");

	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0");

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
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/main.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/imgurl.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/cb2.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/js/tab/webfx.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/js/tab-view/css/tab-view.css\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/tab-view/js/ajax.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/tab-view/js/tab-view.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"STYLESHEET\" type=\"text/css\" href=\"/js/dhtmlxtree/dhtmlxtree.css\">\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/dhtmlxtree/dhtmlxcommon.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/dhtmlxtree/dhtmlxtree.js\"></script>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>OSS接口平台</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" topmargin=\"0\" >\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"1\"   style=\"FONT-SIZE: 13px;table-layout:fixed\" cellpadding=\"5\" cellspacing=\"0\" bgcolor=\"#FFFFFF\"  height=\"98%\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td width=\"25%\" >\r\n");
      out.write("  <span><font color=\"red\" >(系统->接口->策略组)结构树</font></span>\r\n");
      out.write("   <div id=\"show_tree\" style=\"width:100%;height:99%;overflow:hidden;border :0px solid Silver;\"></div>\r\n");
      out.write("  </td>\r\n");
      out.write("    <td valign=\"top\" width=\"75%\" >\r\n");
      out.write("     <div id=\"queryResultList\" style=\"PADDING-RIGHT:0px;\"></div>\r\n");
      out.write("     <br>\r\n");
      out.write("      <font color=\"red\">温馨提示：1.单击左边树上的接口名，进行接口与策略组关系设置；2.单击左边叶子节点策略组名称，进行策略实例配置；</font>\r\n");
      out.write("  </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<script>\r\n");
      out.write("  /*实列化dhtmlxtree树型对象*/\r\n");
      out.write("    var tree = new dhtmlXTreeObject(\"show_tree\", \"100%\", \"100%\", 0);\r\n");
      out.write("    tree.setImagePath(\"/js/dhtmlxtree/imgs/\");\r\n");
      out.write("    tree.enableCheckBoxes(0);\r\n");
      out.write("    //tree.setOnDblClickHandler(queryList);\r\n");
      out.write("    tree.setOnClickHandler(queryList);\r\n");
      out.write("    tree.setXMLAutoLoading(\"/supt/taticConfigAction.do?method=showIfaceTree\");\r\n");
      out.write("    tree.loadXML(\"/supt/taticConfigAction.do?method=showIfaceTree&id=0\");\r\n");
      out.write("    //tree.setImageArrays(\"plus\", \"plus2.gif\", \"plus3.gif\", \"plus4.gif\", \"plus.gif\", \"plus5.gif\");\r\n");
      out.write("    //tree.setImageArrays(\"minus\", \"minus2.gif\", \"minus3.gif\", \"minus4.gif\", \"minus.gif\", \"minus5.gif\");\r\n");
      out.write("    //tree.setStdImages(\"book.gif\", \"books_open.gif\", \"books_close.gif\");\r\n");
      out.write("function queryList(id){\r\n");
      out.write("    var type=splitType(id);\r\n");
      out.write("    if(type==\"taticgroup\"){//表示是策略组配置实例\r\n");
      out.write("       var cimpFaceId=splitValue(tree.getParentId(id));\r\n");
      out.write("       var taticgoupid=splitValue(id);\r\n");
      out.write("        var applicationId=splitValue(tree.getParentId(tree.getParentId(id)));\r\n");
      out.write("       initQueryResultList(cimpFaceId,taticgoupid,applicationId);\r\n");
      out.write("    }else if(type==\"iface\"){//表示是接口\r\n");
      out.write("        var cimpFaceId=splitValue(id);\r\n");
      out.write("        var applicationId=splitValue(tree.getParentId(id));\r\n");
      out.write("        initIfaceGroupResultList(cimpFaceId,applicationId);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function initQueryResultList(cimpFaceId,taticgoupid,applicationId){\r\n");
      out.write("\t\tDWRUtil.useLoadingMessage('数据读取中...');\r\n");
      out.write("\t\tvar formObj={};\r\n");
      out.write("\t\tformObj.cimpFaceId=cimpFaceId;\r\n");
      out.write("\t\tformObj.taticgoupid=taticgoupid;\r\n");
      out.write("\t\tformObj.applicationId=applicationId;\r\n");
      out.write("\t\ttaticConfigAction.getInstanceList(formObj,showResultList);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function initIfaceGroupResultList(cimpFaceId,applicationId){\r\n");
      out.write("        DWRUtil.useLoadingMessage('数据读取中...');\r\n");
      out.write("\t\tvar formObj={};\r\n");
      out.write("\t\tformObj.cimpFaceId=cimpFaceId;\r\n");
      out.write("\t\tformObj.applicationId=applicationId;\r\n");
      out.write("\t\ttaticConfigAction.getIfaceGroupList(formObj,showResultList);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function showResultList(str){\r\n");
      out.write("\t\t$('queryResultList').innerHTML = str;\r\n");
      out.write("}\r\n");
      out.write("function splitValue(id){\r\n");
      out.write("  var ids=id.split(\"|\");\r\n");
      out.write("  var idvalue=\"\";\r\n");
      out.write("  if(ids.length>=2){\r\n");
      out.write("     idvalue=ids[0];\r\n");
      out.write("  }else {\r\n");
      out.write("     idvalue=id;\r\n");
      out.write("  }\r\n");
      out.write("  return idvalue;\r\n");
      out.write("}\r\n");
      out.write("function splitType(id){\r\n");
      out.write("  var ids=id.split(\"|\");\r\n");
      out.write("  var idvalue=\"\";\r\n");
      out.write("  if(ids.length>=2){\r\n");
      out.write("     idvalue=ids[1];\r\n");
      out.write("  }\r\n");
      out.write("  return idvalue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function toAdd(taticgoupid,cimpFaceId,applicationId){\r\n");
      out.write("  var  returnval=window.showModalDialog(\"/supt/taticConfigAction.do?method=toAddInstance&taticgoupid=\"+taticgoupid+\"&cimpFaceId=\"+cimpFaceId+\"&applicationId=\"+applicationId+\"&d=\"+new Date(),window,\"scroll:yes;status:no;help:0;resizable:0;dialogWidth:800px;dialogHeight:400px\");\r\n");
      out.write("  if(returnval==\"true\"){\r\n");
      out.write("      initQueryResultList(cimpFaceId,taticgoupid,applicationId);\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function delInstance(){\r\n");
      out.write("  if(!confirm(\"您确认要删除选中的记录吗？\")){\r\n");
      out.write("        return false;\r\n");
      out.write("   }\r\n");
      out.write("  var ids=getSelectCheckboxValue(\"queryListForm\",\"checkid\",\"|\");\r\n");
      out.write("  taticConfigAction.delTaticInstance(ids,goBack);\r\n");
      out.write("}\r\n");
      out.write("function goBack(s){\r\n");
      out.write("  if(s==\"\"){\r\n");
      out.write("     alert(\"删除操作成功！\");\r\n");
      out.write("   var taticgoupid=queryListForm.taticgoupid.value;\r\n");
      out.write("   var cimpFaceId=queryListForm.cimpFaceId.value;\r\n");
      out.write("   var applicationId=queryListForm.applicationId.value;\r\n");
      out.write("   initQueryResultList(cimpFaceId,taticgoupid,applicationId);\r\n");
      out.write("  }else{\r\n");
      out.write("\t    alert(s);\r\n");
      out.write("\t  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function getDetail(rowrecordid){\r\n");
      out.write("   var taticgoupid=queryListForm.taticgoupid.value;\r\n");
      out.write("   var cimpFaceId=queryListForm.cimpFaceId.value;\r\n");
      out.write("   var applicationId=queryListForm.applicationId.value;\r\n");
      out.write("    var  returnval=window.showModalDialog(\"/supt/taticConfigAction.do?method=toAddInstance&taticgoupid=\"+taticgoupid+\"&cimpFaceId=\"+cimpFaceId+\"&applicationId=\"+applicationId+\"&rowrecordid=\"+rowrecordid+\"&d=\"+new Date(),window,\"scroll:yes;status:no;help:0;resizable:0;dialogWidth:800px;dialogHeight:400px\");\r\n");
      out.write("  if(returnval==\"true\"){\r\n");
      out.write("      initQueryResultList(cimpFaceId,taticgoupid,applicationId);\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function toAddIfaceGroup(cimpFaceId){\r\n");
      out.write("    var  returnval=window.showModalDialog(\"/supt/taticConfigAction.do?method=selectTaticGroupInit&cimpFaceId=\"+cimpFaceId+\"&d=\"+new Date(),window,\"scroll:yes;status:no;help:0;resizable:0;dialogWidth:800px;dialogHeight:400px\");\r\n");
      out.write("    if(returnval==\"true\"){\r\n");
      out.write("      initIfaceGroupResultList(cimpFaceId,\"\");\r\n");
      out.write("      tree.refreshItem(cimpFaceId+\"|iface\");\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function delIfaceGroup(cimpFaceId){\r\n");
      out.write("   if(!confirm(\"您确认要删除选中的记录吗？\")){\r\n");
      out.write("        return false;\r\n");
      out.write("   }\r\n");
      out.write("   var ids=getSelectCheckboxValue(\"queryListForm\",\"checkid\",\"|\");\r\n");
      out.write("   taticConfigAction.delIfaceGroup(ids,function(s){\r\n");
      out.write("       if(s==\"\"){\r\n");
      out.write("         alert(\"删除操作成功！\");\r\n");
      out.write("         tree.refreshItem(cimpFaceId+\"|iface\");\r\n");
      out.write("         initIfaceGroupResultList(cimpFaceId,\"\");\r\n");
      out.write("      }else{\r\n");
      out.write("\t    alert(s);\r\n");
      out.write("\t  }\r\n");
      out.write("   });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function updateIfaceGroup(cimpFaceId){\r\n");
      out.write("   var ifaceGroupIds=queryListForm.ifaceGroupId;\r\n");
      out.write("   var prioritys=queryListForm.priority;\r\n");
      out.write("   var ifaceGroupId=\"\";\r\n");
      out.write("   var priority=\"\";\r\n");
      out.write("   for(var i=0;i<ifaceGroupIds.length;i++){\r\n");
      out.write("      if(prioritys[i].value==\"\"){\r\n");
      out.write("        alert(\"优先级不能为空\");\r\n");
      out.write("        return;\r\n");
      out.write("      }\r\n");
      out.write("      if(ifaceGroupId==\"\"){\r\n");
      out.write("        ifaceGroupId=ifaceGroupIds[i].value;\r\n");
      out.write("        priority=prioritys[i].value;\r\n");
      out.write("      }else{\r\n");
      out.write("        ifaceGroupId=ifaceGroupId+\"|\"+ifaceGroupIds[i].value;\r\n");
      out.write("        priority=priority+\"|\"+prioritys[i].value;\r\n");
      out.write("      }\r\n");
      out.write("   }\r\n");
      out.write("   var formObj={};\r\n");
      out.write("\tformObj.ifaceGroupId=ifaceGroupId;\r\n");
      out.write("\tformObj.priority=priority;\r\n");
      out.write("\ttaticConfigAction.updateIfaceGroup(formObj,function(s){\r\n");
      out.write("\t  if(s==\"\"){\r\n");
      out.write("\t    alert(\"修改操作成功\");\r\n");
      out.write("\t    tree.refreshItem(cimpFaceId+\"|iface\");\r\n");
      out.write("\t  }else{\r\n");
      out.write("\t    alert(s);\r\n");
      out.write("\t  }\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
