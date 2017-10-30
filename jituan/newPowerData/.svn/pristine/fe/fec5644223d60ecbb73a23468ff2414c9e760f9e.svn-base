package com.ccssoft.rsas.common.user;

import com.regaltec.common.security.MD5;

/**
 * *************************************
 * @���� �����û������URL����
 * @��˾ �������ͨ�ż������޹�˾
 * @���� pph
 * @����ʱ�� Jan 6, 2010 
 **************************************
 */
public class User
{ 
   /**
    * �����û����봮
    * @param loginName
    * @return
    * @throws Exception
    */
   public String getUserCode(String loginName) throws Exception
   {
      MD5 md5 = new MD5();
      String ssoKey = "js025abcdefghijklm";
      String addparam = loginName + "&hashCode=" + md5.getMD5ofStr(loginName + ssoKey);
      
      return addparam;
   }
}
