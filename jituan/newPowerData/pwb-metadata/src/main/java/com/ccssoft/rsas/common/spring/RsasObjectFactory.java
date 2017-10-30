package com.ccssoft.rsas.common.spring;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.ccssoft.rsas.common.spring.exception.BeanNotFoundException;
import com.ccssoft.rsas.common.spring.exception.SpringException;
import com.ccssoft.rsas.common.spring.exception.SpringInitException;
import com.ccssoft.rsas.common.tool.ServerUtil;

public class RsasObjectFactory
{
   public static final String SPRING_MAINFILE = "Application.xml";
   private static Map contextMap = new HashMap(); // ApplicationContext

   static
   {
      try
      {
         SAXBuilder sb = new SAXBuilder();
         String path = null;
         if (ServerUtil.isWebLogic())
         {// weblogic
            path = RsasObjectFactory.class.getResource("").getPath();
            int index = path.indexOf("WEB-INF");
            if (index > -1)
            {
               path = path.substring(0, index) + "WEB-INF/classes/";
               path = path.replaceAll("\\.\\/", "");
            }
         }
         else
         {// ����������
            path = RsasObjectFactory.class.getResource("/").getPath();
         }
         String xmlpath = path + SPRING_MAINFILE;
         xmlpath = xmlpath.replaceAll("%20", " ");
         System.out.println("[com.regaltec.rsas.common.spring.RsasObjectFactory.java]-->xmlpath:" + xmlpath);
         Document doc = sb.build(xmlpath);
         Element root = doc.getRootElement();
         List list = root.getChildren("FileMap");

         for (int i = 0; i < list.size(); i++)
         {
            Element element = (Element) list.get(i);
            String key = element.getAttributeValue("key");
            String filename = element.getAttributeValue("name");
            filename = path + filename;
            filename = filename.replaceAll("%20", " ");
            try
            {
               // contextMap.put(key.toUpperCase(), new
               // FileSystemXmlApplicationContext(filename));
               // contextMap.put(key.toUpperCase(), new XmlBeanFactory(new
               // FileSystemResource(new FileInputStream(filename))));
               contextMap.put(key.toUpperCase(), new XmlBeanFactory(new FileSystemResource(filename)));
               System.out.println("load " + key + " config!");
            }
            catch (Exception ex)
            {
               if (ex instanceof BeanDefinitionStoreException)
               {

               }
               else if (ex instanceof FileNotFoundException)
               {

               }
               else
               {
                  System.err.println("load xml file error. name = [" + filename + " ]");
                  System.exit(1);
               }
            }
         }

      }
      catch (Exception e)
      {
         e.printStackTrace();
         // ��Websphere����ʹ��������ʽ
         try
         {
            SAXBuilder sb = new SAXBuilder();
            Document doc = sb.build(RsasObjectFactory.class.getResourceAsStream("/Application.xml"));
            Element root = doc.getRootElement();
            List list = root.getChildren("FileMap");

            for (int i = 0; i < list.size(); i++)
            {
               Element element = (Element) list.get(i);
               String key = element.getAttributeValue("key");
               String filename = element.getAttributeValue("name");
               try
               {
                  contextMap.put(key.toUpperCase(), new XmlBeanFactory(new ClassPathResource(filename)));
                  System.out.println("load " + key + " config!");
               }
               catch (Exception ex)
               {
                  ex.printStackTrace();
                  if (ex instanceof BeanDefinitionStoreException)
                  {

                  }
                  else if (ex instanceof FileNotFoundException)
                  {

                  }
                  else
                  {
                     System.err.println("load xml file error. name = [" + filename + " ]");
                     System.exit(1);
                  }
               }
            }
         }
         catch (Exception ex)
         {
            ex.printStackTrace();
         }
      }
   }

   /**
    * ��һ�ּ��ط�ʽ
    */
   // InputStream is = new FileInputStream("beans.xml");
   // XmlBeanFactory factory = new XmlBeanFactory(is);
   /**
    * �ڶ��ּ��ط�ʽ
    */
   // ClassPathResource res = new ClassPathResource("beans.xml");
   // XmlBeanFactory factory = new XmlBeanFactory(res);
   /**
    * �����ּ��ط�ʽ,ͬʱ���ض�������ļ�
    */
   // ClassPathXmlApplicationContext appContext = new
   // ClassPathXmlApplicationContext(
   // new String[] {"applicationContext.xml", "applicationContext-part2.xml"});
   // BeanFactory factory = (BeanFactory) appContext;
   public static Object getBean(String databasetype, String beanName) throws SpringException
   {
      if (contextMap == null || !contextMap.containsKey(databasetype.toUpperCase()))
         throw new SpringInitException("Spring Init Exception. databasetype = [ " + databasetype + " ]");

      // ApplicationContext ac = (ApplicationContext)
      // contextMap.get(databasetype.toUpperCase());
      // Object obj = ac.getBean(beanName);

      BeanFactory bf = (BeanFactory) contextMap.get(databasetype.toUpperCase());
      Object obj = bf.getBean(beanName);

      if (obj == null)
         throw new BeanNotFoundException("Bean not Found. name = [" + beanName + " ]");

      return obj;
   }

   public static void main(String[] args)
   {

   }
}
