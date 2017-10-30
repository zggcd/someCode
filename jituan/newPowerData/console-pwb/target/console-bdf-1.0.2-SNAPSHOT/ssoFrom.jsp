<%@ page contentType="text/html; charset=GBK"%>
<%@page import="com.regaltec.common.security.DES"%>
<%@page import="com.regaltec.common.util.Constant"%>
<%@page import="com.regaltec.baf.dict.dictionary.common.valueobj.DictionaryItemVO"%>
<%@page import="com.regaltec.baf.dict.dictionary.bo.IDictionaryItemBO"%>
<%@page import="com.regaltec.baf.org.user.bi.IUserBI"%>
<%@ page import="com.regaltec.baf.org.user.common.valueobj.UserVO"%>
<%@ page import="com.regaltec.baf.org.user.ui.control.UserLoginBean"%>
<%@ page import="java.util.Hashtable"%>
<%@ page import="com.regaltec.common.util.StringHelper"%>
<%@page import="com.regaltec.baf.taskmanage.common.SpringUtil"%>
<%
   String id=request.getHeader("iv-user");
   String ip="";
   //ÉèÖÃ¼ÓÃÜÃÜÔ¿
   try {
			//DES desId = new DES(Constant.SECRET_KEY);
            //id = desId.encrypt(id);
            IDictionaryItemBO dicBO = SpringUtil.getBean("baf_dictionaryItemBO",
				IDictionaryItemBO.class);		
		    DictionaryItemVO vo = dicBO.getItemByDictCodeAndItemCode("IDD_SYS", "SYS_SSO_IP");
			if (vo != null) {
				String itemValue = vo.getItemValue();
				if (itemValue != null && !"".equals(itemValue)) {
					ip=itemValue;
				}
			}
			IUserBI userBI = SpringUtil.getBean("baf_userBI",IUserBI.class);
		    Hashtable hashtable = new Hashtable();
            hashtable.put("loginName", StringHelper.convertStringNull(id));
            hashtable.put("password", "");
           
            Hashtable rehash =userBI.isValidUser(hashtable);
            UserVO uvo = null;
            if(rehash != null){
              Hashtable ret = (Hashtable)rehash.get("isValidUser");
              if(ret!=null){
                uvo = (UserVO)ret.get("user");
                UserLoginBean loginBean = new UserLoginBean();
	            loginBean.setCurrentUser(uvo);
	            loginBean.setStatus("1");
	            loginBean.setLoginStatus("loginSuccess");
	            session.setAttribute("userLoginBean", loginBean);
	          }
	      }
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			//response.sendRedirect(request.getContextPath()+ "/baf/jsp/uiframe/logout.xhtml");
		}
  //response.sendRedirect("/baf/jsp/uiframe/frame.xhtml?SHUserName="+id);
 %>


	<script  language= "javascript"  type= "text/javascript"> 

	   window.location.href=" http://<%=ip%><%=request.getContextPath()%>/baf/jsp/uiframe/frame.xhtml";
	
	</script>