/***************************************
 * @���� �޽���
 * @����ʱ�� 2007-11-13
 * @��������: 
 * @�޸ļ�¼:
 * 		�޸�ʱ�䣺YYYY-MM-DD    �޸��ˣ�XXX
 *		�޸�ԭ�����ݣ�
 ***************************************/
package com.ccssoft.rsas.common.factory;

import java.util.Map;

/***************************************
 * @���� BO���󹤳��࣬�����������룺��������obejctType/BO����ӳ�伯��
 * ��objectType��������������BOʵ������������ֱ��Ӧ�����������̬��������
 * ���ڲ���BOʵ��ǰ�������ȵ���setObjectMaps��̬�������ú�ӳ�伯�ϡ�
 * @��˾ �������ͨ�ż������޹�˾
 * @���� �޽���
 * @����ʱ�� 2007-11-13
 ***************************************/
public class ObjectFactory
{
   private static Map objectMaps = null;

   /***************************************
    * ���ö�������obejctType/BO����ӳ�伯��
    * @param objectMaps ��������obejctType/BO����ӳ�伯��
    ***************************************/
   public static void setObjectMaps(Map objectMaps)
   {
      ObjectFactory.objectMaps = objectMaps;
   }

   /***************************************
    * ����BOʵ���Ĺ�������
    * @param objectType ��������
    * @return BOʵ��
    * @throws InstantiationException
    * @throws IllegalAccessException
    * @throws ClassNotFoundException
    ***************************************/
   public static Object getObject(String objectType) throws InstantiationException,
         IllegalAccessException, ClassNotFoundException
   {
      if(ObjectFactory.objectMaps != null)
      {
         if(ObjectFactory.objectMaps.containsKey(objectType))
         {
            String boClassName = (String) ObjectFactory.objectMaps.get(objectType);
            return Class.forName(boClassName).newInstance();
         }
         else
         {
            return null;
         }
      }
      else
      {
         return null;
      }
   }
}
