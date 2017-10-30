package com.ccssoft.rsas.common.tool;

import java.security.MessageDigest;

public class Md5
{
   static String byteHEX(byte ib)
   {
      char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
      char[] ob = new char[2];
      ob[0] = Digit[(ib >>> 4) & 0X0F];
      ob[1] = Digit[ib & 0X0F];
      String s = new String(ob);
      return s;
   }

   /**
    * ��ȡMD5ֵ
    * @param original String
    * @return String
    */
   public static String getMD5(String original)
   {
      byte[] originalByte = original.getBytes();
      byte[] toDigest = null;
      String digestHexStr = "";

      try
      {
         MessageDigest md = MessageDigest.getInstance("MD5");
         md.update(originalByte);
         toDigest = md.digest();
         for (int i = 0; i < 16; i++)
         {
            digestHexStr += byteHEX(toDigest[i]);
         }
         return digestHexStr;

      }
      catch (java.security.NoSuchAlgorithmException nsae)
      {
         nsae.toString();
      }
      return digestHexStr;

   }
}
