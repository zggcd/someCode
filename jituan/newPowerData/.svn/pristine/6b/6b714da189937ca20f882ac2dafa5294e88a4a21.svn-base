/***************************************
 * @���� �޽���
 * @����ʱ�� 2007-11-22
 * @��������:  
 * @�޸ļ�¼:
 * 		�޸�ʱ�䣺YYYY-MM-DD    �޸��ˣ�XXX
 *		�޸�ԭ�����ݣ�
 ***************************************/
package com.ccssoft.rsas.common.log;

import java.io.IOException;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

/***************************************
 * @���� ͨ������ţ���ѯ������Ϣ�ĵ�����ô���Ŷ�Ӧ�Ĵ�����Ϣ��
 * Ĭ�ϵĴ�����Ϣ�ĵ�ErrorMsg.xml·��Ϊ��Ŀ��Ŀ¼,Ҳ��ͨ������
 * ��������
 * @��˾ �������ͨ�ż������޹�˾
 * @���� �޽���
 * @����ʱ�� 2007-11-22 
 ***************************************/
public class ErrorNumberParser
{
   private static Document errorMsgDoc = null;

   /**
    * ����Ĭ�ϵĴ�����Ϣ�ĵ�
    */
   static
   {
      SAXBuilder sBuilder = new SAXBuilder();
      try
      {
         ErrorNumberParser.errorMsgDoc = sBuilder.build("ErrorMsg.xml");
      }
      catch (JDOMException e)
      {
         System.out.println("������Ϣ�ĵ�ErrorMsg.xml��������");
         e.printStackTrace();
      }
      catch (IOException e)
      {
         System.out.println("������Ϣ�ĵ�ErrorMsg.xml��ȡ����");
         e.printStackTrace();
      }
   }

   /***************************************
    * ���������Ϣ�ĵ�
    * @param docPath �ĵ�·��
    * @throws IOException 
    * @throws JDOMException 
    ***************************************/
   public static void loadErrorMsgDocument(String docPath) throws JDOMException, IOException
   {
      SAXBuilder sBuilder = new SAXBuilder();
      ErrorNumberParser.errorMsgDoc = sBuilder.build(docPath);
   }

   /***************************************
    * ���ݺ����ҵ���Ӧ����Ϣ
    * @param number ���󣨾��桢��ʾ�ȣ�����
    * @param elementName ���ڵ��µĶ��ӽڵ㣨����ڵ㣩������
    * @return ��Ӧ�Ĵ��󣨾��桢��ʾ�ȣ���Ϣ
    ***************************************/
   private static String parseNumber(String number, String elementName)
   {
      if (ErrorNumberParser.errorMsgDoc == null)
      {
         return null;
      }
      //ȡ�ø��ڵ�Log
      Element rootElement = ErrorNumberParser.errorMsgDoc.getRootElement();
      //ȡ�ô���ڵ�
      Element element = rootElement.getChild(elementName);
      //ȡ��С��ڵ�
      Element typeElement = element.getChild("Type" + number.substring(0, 2));
      Element msgElement = null;
      if (typeElement != null)
      {
         msgElement = typeElement.getChild("Msg" + number);
      }
      if (msgElement != null)
      {
         return msgElement.getAttributeValue("Msg");
      }
      else
      {
         return null;
      }
   }

   /***************************************
    * ��������ţ����ض�Ӧ�Ĵ�����Ϣ
    * @param errorNO �����
    * @return ������Ϣ
    ***************************************/
   public static String parseErrorNumber(String errorNO)
   {
      return parseNumber(errorNO, "Errors");
   }

   /***************************************
    * ��������ţ����ض�Ӧ�Ĵ�����Ϣ
    * @param errorNO �����
    * @param input ����Ĳ���,�滻������Ϣ�����%input%�ַ���
    * @return ������Ϣ
    ***************************************/
   public static String parseErrorNumber(String errorNO, String input)
   {
      return parseErrorNumber(errorNO).replaceAll("%input%", input);
   }

   /***************************************
    * ��������ţ����ض�Ӧ�Ĵ�����Ϣ
    * @param errorNO �����
    * @param input ����Ĳ���������,�ֱ��滻%input0%,%input1%,%input2%,...�ַ�����
    * ע���±���0��ʼ
    * @return ������Ϣ
    ***************************************/
   public static String parseErrorNumber(String errorNO, String[] input)
   {
      String regex = null;
      String tempMsg = parseErrorNumber(errorNO);
      for (int i = 0; i < input.length; i++)
      {
         regex = "%input";
         regex += i + "%";
         tempMsg = tempMsg.replaceAll(regex, input[i]);
      }
      return tempMsg;
   }

   /***************************************
    * ��������ţ����ض�Ӧ�ľ�����Ϣ
    * @param warnNO �����
    * @return ������Ϣ
    ***************************************/
   public static String parseWarnNumber(String warnNO)
   {
      return parseNumber(warnNO, "Warnings");
   }

   /***************************************
    * ��������ţ����ض�Ӧ�ľ�����Ϣ
    * @param warnNO �����
    * @param input ����Ĳ���,�滻������Ϣ�����%input%�ַ���
    * @return ������Ϣ
    ***************************************/
   public static String parseWarnNumber(String warnNO, String input)
   {
      return parseWarnNumber(warnNO).replaceAll("%input%", input);
   }

   /***************************************
    * ��������ţ����ض�Ӧ�ľ�����Ϣ
    * @param warnNO �����
    * @param input ����Ĳ���������,�ֱ��滻%input0%,%input1%,%input2%,...�ַ�����
    * ע���±���0��ʼ
    * @return ������Ϣ
    ***************************************/
   public static String parseWarnNumber(String warnNO, String[] input)
   {
      String regex = null;
      String tempMsg = parseWarnNumber(warnNO);
      for (int i = 0; i < input.length; i++)
      {
         regex = "%input";
         regex += i + "%";
         tempMsg = tempMsg.replaceAll(regex, input[i]);
      }
      return tempMsg;
   }

   /***************************************
    * ������ʾ�ţ����ض�Ӧ����ʾ��Ϣ
    * @param infoNO ��ʾ��
    * @return ��ʾ��Ϣ
    ***************************************/
   public static String parseInfoNumber(String infoNO)
   {
      return parseNumber(infoNO, "Informations");
   }

   /***************************************
    * ������ʾ�ţ����ض�Ӧ����ʾ��Ϣ
    * @param infoNO ��ʾ��
    * @param input ����Ĳ���,�滻��ʾ��Ϣ�����%input%�ַ���
    * @return ��ʾ��Ϣ
    ***************************************/
   public static String parseInfoNumber(String infoNO, String input)
   {
      return parseInfoNumber(infoNO).replaceAll("%input%", input);
   }

   /***************************************
    * ������ʾ�ţ����ض�Ӧ����ʾ��Ϣ
    * @param infoNO ��ʾ��
    * @param input ����Ĳ���������,�ֱ��滻%input0%,%input1%,%input2%,...�ַ�����
    * ע���±���0��ʼ
    * @return ��ʾ��Ϣ
    ***************************************/
   public static String parseInfoNumber(String infoNO, String[] input)
   {
      String regex = null;
      String tempMsg = parseInfoNumber(infoNO);
      for (int i = 0; i < input.length; i++)
      {
         regex = "%input";
         regex += i + "%";
         tempMsg = tempMsg.replaceAll(regex, input[i]);
      }
      return tempMsg;
   }

//   /***************************************
//    * ʹ������
//    * @param args
//    ***************************************/
//   public static void main(String args[])
//   {
//      System.out.println(parseErrorNumber("12002", new String[] { "XXX", "�ڴ�", "û������" }));
//   }

}
