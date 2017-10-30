package com.ccssoft.rsas.common;

import java.io.Serializable;
import java.util.HashMap;

public class GlobalVariants implements Serializable {
   private static final long serialVersionUID = 4084508903018352275L;

   public static String KEY_LOGINNAME = "LOGINNAME";
   
 //ȫ�ֱ������棬����һ���޷���͸�������̵�ȫ�ֱ��������¼����ҪעҪ��ʱ���
   private static HashMap globalVariants = new HashMap();
   
   
   public static void putGlobalVariant(String key, String value) {
       globalVariants.put(key, value);
   }
    
   public static Object getGlobalVariant(String key) {
       return globalVariants.get(key);
   }
   
   public static void removeGlobalVariant(String key) {
       globalVariants.remove(key);
   }
}
