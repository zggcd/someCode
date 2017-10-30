/***************************************
 * @���� �޽���
 * @����ʱ�� 2007-11-6
 * @��������: ��������
 * @�޸ļ�¼:
 ***************************************/
package com.ccssoft.rsas.common.log;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.util.Properties;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.jdom.JDOMException;

/***************************************
 * @���� ��־�࣬��־�����ʽ�������ļ�log4j.properties��
 * ������Ϣ�ĵ�ErrorMsg.xml��·��Ĭ������Ϊ��Ŀ��Ŀ¼,Ҳ��
 * ͨ������loadConfigFile��������
 * @��˾ �������ͨ�ż������޹�˾
 * @���� �޽���
 * @����ʱ�� 2007-11-6
 ***************************************/
public class RLogger
{
   private static Logger logger = null;//��־��¼��

   /**
    * Ϊ����RLogger��ʹ�ã��������ʽ�ļ�·��Ԥ��
    * ���ú�Ĭ��ֵ
    */
   static
   {

      Properties properties = new Properties();
      try
      {
         properties.load(RLogger.class.getResourceAsStream("/log4j.properties"));
      }
      catch(IOException e)
      {
         e.printStackTrace();
      }
      PropertyConfigurator.configure(properties);//������־�����ʽ�ļ�
      RLogger.logger = Logger.getLogger("");//�����־��¼��,��Ϊ����Ϊ���ַ�����������־���ʱ���ܼ�¼������·����

   }
      
   /***************************************
    * ������־��ʽ����ļ��ʹ�����ļ�
    * @param propPath ��־��ʽ����ļ�·��
    * @param docPath ������ļ�·��
    * @throws IOException 
    * @throws JDOMException 
    ***************************************/
   public static void loadConfigFile(String propPath, String docPath) throws JDOMException, IOException
   {
      PropertyConfigurator.configure(propPath);
      ErrorNumberParser.loadErrorMsgDocument(docPath);
   }
   
   /***************************************
    * ������־��ʽ����ļ�
    * @param propPath ��־��ʽ����ļ�·��
    * @throws JDOMException
    ***************************************/
   public static void loadConfigFile(String propPath)
   {
      PropertyConfigurator.configure(propPath);
   }
   
   /***************************************
    * ֱ�Ӽ�¼������Ϣ����ʹ����Ϣ����
    * @param debugInfo ������Ϣ
    ***************************************/
   public static void logDebug(String debugInfo)
   {
      RLogger.logger.debug(debugInfo);
   }

   /***************************************
    * ֱ�Ӽ�¼��ʾ��Ϣ����ʹ����Ϣ����
    * @param info ��ʾ��Ϣ
    ***************************************/
   public static void logInfo(String info)
   {
      RLogger.logger.info(info);
   }

   /***************************************
    * ֱ�Ӽ�¼������Ϣ����ʹ����Ϣ����
    * @param warnInfo ������Ϣ
    ***************************************/
   public static void logWarn(String warnInfo)
   {
      RLogger.logger.warn(warnInfo);
   }

   /***************************************
    * ֱ�Ӽ�¼������Ϣ����ʹ����Ϣ����
    * @param errorInfo ������Ϣ
    ***************************************/
   public static void logError(String errorInfo)
   {
      RLogger.logger.error(errorInfo);
   }
   
   /**
    * *************************************
    * ���쳣��Ϣ��¼����־�ļ�
    * @param Exception
    **************************************
    */
   public static void logError(Exception ex)
   {
      StringWriter temp = new StringWriter();
      PrintWriter s = new PrintWriter(temp);
      ex.printStackTrace(s);
      RLogger.logError(temp.toString());
   }
   /**
    * *************************************
    * ���쳣��Ϣ��¼����־�ļ�
    * @param Exception
    **************************************
    */
   public static void logError(Throwable throwable,String info)
   {
      StringWriter temp = new StringWriter();
      PrintWriter p = new PrintWriter(temp);
      p.println(new java.util.Date() + ": " + info);
      throwable.printStackTrace(p);
      RLogger.logError(temp.toString());
   }
   /***************************************
    * ֱ�Ӽ�¼����������Ϣ����ʹ����Ϣ����
    * @param fatalInfo ������Ϣ
    ***************************************/
   public static void logFatal(String fatalInfo)
   {
      RLogger.logger.fatal(fatalInfo);
   }

   /***************************************
    * ʹ����Ϣ���ţ���¼��ʾ��Ϣ
    * @param infoNO ��ʾ��Ϣ����
    ***************************************/
   public static void info(String infoNO)
   {
      RLogger.logger.info(ErrorNumberParser.parseInfoNumber(infoNO));
   }

   /***************************************
    * ʹ����Ϣ���ţ���¼��ʾ��Ϣ
    * @param infoNO ��ʾ��Ϣ����
    * @param input ��ʾ��Ϣ������Ĳ���
    ***************************************/
   public static void info(String infoNO, String input)
   {
      RLogger.logger.info(ErrorNumberParser.parseInfoNumber(infoNO, input));
   }

   /***************************************
    * ʹ����Ϣ���ţ���¼��ʾ��Ϣ
    * @param infoNO ��ʾ��Ϣ����
    * @param input ��ʾ��Ϣ������Ĳ�������
    ***************************************/
   public static void info(String infoNO, String[] input)
   {
      RLogger.logger.info(ErrorNumberParser.parseInfoNumber(infoNO, input));
   }

   /***************************************
    * ʹ����Ϣ���ţ���¼������Ϣ
    * @param warnNO ������Ϣ����
    ***************************************/
   public static void warn(String warnNO)
   {
      RLogger.logger.warn(ErrorNumberParser.parseWarnNumber(warnNO));
   }

   /***************************************
    * ʹ����Ϣ���ţ���¼������Ϣ
    * @param warnNO ������Ϣ����
    * @param input ������Ϣ������Ĳ���
    ***************************************/
   public static void warn(String warnNO, String input)
   {
      RLogger.logger.warn(ErrorNumberParser.parseWarnNumber(warnNO, input));
   }

   /***************************************
    * ʹ����Ϣ���ţ���¼������Ϣ
    * @param warnNO ������Ϣ����
    * @param input ������Ϣ������Ĳ���������
    ***************************************/
   public static void warn(String warnNO, String[] input)
   {
      RLogger.logger.warn(ErrorNumberParser.parseWarnNumber(warnNO, input));
   }

   /***************************************
    * ʹ����Ϣ���ţ���¼������Ϣ
    * @param errorNO ������Ϣ����
    ***************************************/
   public static void error(String errorNO)
   {
      RLogger.logger.error(ErrorNumberParser.parseErrorNumber(errorNO));
   }

   /***************************************
    * ʹ����Ϣ���ţ���¼������Ϣ
    * @param errorNO ������Ϣ����
    * @param input ������Ϣ������Ĳ���
    ***************************************/
   public static void error(String errorNO, String input)
   {
      RLogger.logger.error(ErrorNumberParser.parseErrorNumber(errorNO, input));
   }

   /***************************************
    * ʹ����Ϣ���ţ���¼������Ϣ
    * @param errorNO ������Ϣ����
    * @param input ������Ϣ������Ĳ���������
    ***************************************/
   public static void error(String errorNO, String[] input)
   {
      RLogger.logger.error(ErrorNumberParser.parseErrorNumber(errorNO, input));
   }
   /***************************************
    * ��ȡ�ռǼ���
    * ���� 2009-05-22
    ***************************************/
   public static Level getLevel(){
      //return RLogger.logger.getRoot().getLevel();
      return Logger.getRootLogger().getLevel();
   }
  
}
