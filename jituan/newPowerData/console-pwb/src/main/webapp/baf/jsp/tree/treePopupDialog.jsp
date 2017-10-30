<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>treePopupDialog page</title>
    <meta HTTP-EQUIV="Pragma" CONTENT="no-cache"/> 
	<meta HTTP-EQUIV="Cache-Control" CONTENT="no-cache"/> 
    <script  src="<%=request.getContextPath()%>/baf/js/common/dhtmlxtree/dhtmlXCommon.js"></script>
	<script  src="<%=request.getContextPath()%>/baf/js/common/dhtmlxtree/dhtmlXTree.js"></script>
    <script type="text/javascript">
    	var  tree  = null;
    	function showTree() {
    		tree = new dhtmlXTreeObject("tree_boxes","100%","100%",0);
    		tree.setImagePath('/baf/images/dhtmlxtree/');
			tree.enableCheckBoxes(1);
			tree.setOnCheckHandler(window.dialogArguments._tree_setOnCheck_Handler);
			tree.loadXML(window.dialogArguments._loadXMLURL_tree);
			tree.setXMLAutoLoading(window.dialogArguments._XMLAutoLoadingURL_tree,window.dialogArguments._tree_CallBack_setChecked);
			window.dialogArguments._tree_obj = tree;
    	}
    	
    	function setValue() { 
    		window.dialogArguments._set_field_value();
    		window.setTimeout(window.close(),500);
    	}
    	
    </script>
  </head>
  
  <body onload="showTree();">
    <table>
    	<tr>
    		<td ><div id="tree_boxes"></div></td>
    	</tr>
    </table><br/>
    <center>
	    <input type="button" value="确 定" style="background-color: bule;" onclick="setValue();"/>
	    <input type="button" value="取 消" style="background-color: bule;" onclick="window.close();"/>
    </center>
  </body>
  
  <script type="text/javascript">

/***********  浏览器关闭窗口时会执行此方法 ********/
 window.onbeforeunload = function() { 
    //alert(1); 
    //unloadDestorySession();
    window.dialogArguments._keep_same_value();
}

</script>  

</html>
