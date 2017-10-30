package com.ccssoft.rsas.common.config;

/************************************************************
 * @����: ������
 * @����ʱ��: 2007-11-6
 * @��������:
 * @�޸ļ�¼�� �޸�ʱ�䣺2007-11-19 �޸��ˣ��޽��� �޸�ԭ�����ݣ����ӷ���getCommandMap /
 ************************************************************/
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;

import com.ccssoft.rsas.common.config.configparser.Config;

/************************************************
 * ����: ������ ����ʱ��: 2007-11-6 ����: ��ȡ����������Ϣ
 ************************************************/
public class RunTimeParameterConf
{
   /************************************************
    * ��������������listener������Ϣ ����˵���� ����ֵ˵����
    * 
    * @throws ValidationException
    * @throws MarshalException
    * @throws IOException
    ************************************************/
   public static ListenerConf getListenerconf(String filePath) throws MarshalException, ValidationException,
         IOException
   {
      Reader fr = null;
      ListenerConf listenerConf = new ListenerConf();
      try
      {
         fr = new FileReader(filePath);
         Config config = (Config) Config.unmarshal(fr);
         listenerConf.setDebug(config.getRunTimeParameter().getDebug());
         listenerConf.setApplicationServerQueue(config.getRunTimeParameter().getListener().getApplicationServerQueue());
         listenerConf.setAgentServerQueue(config.getRunTimeParameter().getListener().getAgentServerQueue());
         listenerConf.setConnectionFactory(config.getRunTimeParameter().getListener().getConnectionFactory());
         listenerConf.setContextFactory(config.getRunTimeParameter().getListener().getContextFactory());
         listenerConf.setMaxRequestNumber(config.getRunTimeParameter().getListener().getMaxRequestNumber());
         listenerConf.setMessageLiveTime(config.getRunTimeParameter().getListener().getMessageLiveTime());
         listenerConf.setMetedataServerQueue(config.getRunTimeParameter().getListener().getMetedataServerQueue());
         listenerConf.setDataReportServerQueue(config.getRunTimeParameter().getListener().getDataReportServerQueue());
         listenerConf.setPort(config.getRunTimeParameter().getListener().getPort());
         listenerConf.setProviderURL(config.getRunTimeParameter().getListener().getProviderURL());
      }
      finally
      {
         if (fr != null)
         {
            fr.close();
         }
      }
      return listenerConf;
   }

   /************************************************
    * ��������������listener������Ϣ ����˵���� ����ֵ˵����
    * 
    * @throws ValidationException
    * @throws MarshalException
    * @throws IOException
    ************************************************/
   public static ListenerConf getWebAppconf(InputStream input) throws MarshalException, ValidationException,
         IOException
   {
      Reader fr = null;
      ListenerConf listenerConf = new ListenerConf();
      try
      {
         fr = new InputStreamReader(input);
         Config config = (Config) Config.unmarshal(fr);
         // listenerConf.setDebug(config.getRunTimeParameter().getDebug());
         // listenerConf.setApplicationServerQueue(config.getRunTimeParameter().getWebApplication().getWebAppQueue());
         // listenerConf.setConnectionFactory(config.getRunTimeParameter().getWebApplication().getConnectionFactory());
         // listenerConf.setContextFactory(config.getRunTimeParameter().getWebApplication().getContextFactory());
         // listenerConf.setMessageLiveTime(config.getRunTimeParameter().getWebApplication().getMessageLiveTime());
         // listenerConf.setMetedataServerQueue(config.getRunTimeParameter().getWebApplication().getMetedataServerQueue());
         // listenerConf.setPort(config.getRunTimeParameter().getWebApplication().getgetPort());
         // listenerConf.setProviderURL(config.getRunTimeParameter().getWebApplication().getProviderURL());
         listenerConf.setWebAppURL(config.getRunTimeParameter().getWebApplication().getWebAppURL());
         
         //2011-04-25,pph
         if (config.getRunTimeParameter().getWebApplication().getAppURLCount() > 0) {
            List appURLs = new ArrayList();
            for (int i = 0; i < config.getRunTimeParameter().getWebApplication().getAppURLCount(); i++) {
               String url = config.getRunTimeParameter().getWebApplication().getAppURL(i).getURL();
               appURLs.add(url);
            }
         }
      }
      finally
      {
         if (fr != null)
         {
            fr.close();
         }
      }
      return listenerConf;
   }

   /************************************************
    * ��������������listener������Ϣ ����˵���� ����ֵ˵����
    * 
    * @throws ValidationException
    * @throws MarshalException
    * @throws IOException
    ************************************************/
   public static ListenerConf getWebAppconf(String filePath) throws MarshalException, ValidationException, IOException
   {
      Reader fr = null;
      ListenerConf listenerConf = new ListenerConf();
      try
      {
         fr = new FileReader(filePath);
         Config config = (Config) Config.unmarshal(fr);
         // listenerConf.setDebug(config.getRunTimeParameter().getDebug());
         // listenerConf.setApplicationServerQueue(config.getRunTimeParameter().getWebApplication().getWebAppQueue());
         // listenerConf.setConnectionFactory(config.getRunTimeParameter().getWebApplication().getConnectionFactory());
         // listenerConf.setContextFactory(config.getRunTimeParameter().getWebApplication().getContextFactory());
         // listenerConf.setMessageLiveTime(config.getRunTimeParameter().getWebApplication().getMessageLiveTime());
         // listenerConf.setMetedataServerQueue(config.getRunTimeParameter().getWebApplication().getMetedataServerQueue());
         // listenerConf.setPort(config.getRunTimeParameter().getWebApplication().getgetPort());
         listenerConf.setWebAppURL(config.getRunTimeParameter().getWebApplication().getWebAppURL());

         //2011-04-25,pph
         if (config.getRunTimeParameter().getWebApplication().getAppURLCount() > 0) {
            List appURLs = new ArrayList();
            for (int i = 0; i < config.getRunTimeParameter().getWebApplication().getAppURLCount(); i++) {
               String url = config.getRunTimeParameter().getWebApplication().getAppURL(i).getURL();
               appURLs.add(url);
            }
         }
      }
      finally
      {
         if (fr != null)
         {
            fr.close();
         }
      }
      return listenerConf;
   }

   /************************************************
    * ��������������Metadata������Ϣ ����˵���� ����ֵ˵����
    * 
    * @throws ValidationException
    * @throws MarshalException
    * @throws IOException
    ************************************************/
   static MetadataConf metadataConf = null;

   public static MetadataConf getMetadata(String filePath) throws MarshalException, ValidationException, IOException
   {
      if (metadataConf == null)
      {

         Reader fr = new FileReader(filePath);
         System.out.println(filePath);
         metadataConf = new MetadataConf();

         Config config = (Config) Config.unmarshal(fr);
         metadataConf.setDebug(config.getRunTimeParameter().getDebug());
         metadataConf.setDatabaseDriver(config.getRunTimeParameter().getMetadata().getDatabaseDriver());
         metadataConf.setDatabaseURL(config.getRunTimeParameter().getMetadata().getDatabaseURL());
         metadataConf.setDefaultLinkNumber(config.getRunTimeParameter().getMetadata().getDefaultLinkNumber());
         
         String loginPwd=config.getRunTimeParameter().getMetadata().getLoginPassword();
         int enType = config.getRunTimeParameter().getEncryptType();
         if (enType == 1)
         {// 0-������,1-DESPlus����
            try
            {
               DESPlus desPlus = new DESPlus("rsas");
               loginPwd = desPlus.decrypt(loginPwd);
            }
            catch (Exception e)
            {
               e.printStackTrace();
            }
         }
         metadataConf.setLoginPassword(loginPwd);
         
         metadataConf.setLoginUserName(config.getRunTimeParameter().getMetadata().getLoginUserName());
         metadataConf.setMaxLinkNumber(config.getRunTimeParameter().getMetadata().getMaxLinkNumber());
         metadataConf.setMaxThread(config.getRunTimeParameter().getMetadata().getMaxThread());
         metadataConf.setMinLinkNumber(config.getRunTimeParameter().getMetadata().getMinLinkNumber());
         metadataConf.setMetadataDatabaseType(config.getRunTimeParameter().getMetadata().getMetadataDatabaseType());

         fr.close();
      }
      return metadataConf;
   }

   /**
    * <p>���غ���getMetadata</p>
    * 
    * @param input
    * @return
    * @throws MarshalException
    * @throws ValidationException
    * @throws IOException
    ************************************** 
    */
   public static MetadataConf getMetadata(InputStream input) throws MarshalException, ValidationException, IOException
   {
      if (metadataConf == null)
      {

         Reader fr = new InputStreamReader(input);
         // char[] cbuf = new char[8192];
         // int len = 0;
         // while( (len =fr.read(cbuf)) >= 0)
         // {
         // System.out.println(new String(cbuf,0,len));
         // }
         // fr.reset();
         metadataConf = new MetadataConf();

         Config config = (Config) Config.unmarshal(fr);
         metadataConf.setDebug(config.getRunTimeParameter().getDebug());
         metadataConf.setWriteLog(config.getRunTimeParameter().getWriteLog());
         metadataConf.setDatabaseDriver(config.getRunTimeParameter().getMetadata().getDatabaseDriver());
         metadataConf.setDatabaseURL(config.getRunTimeParameter().getMetadata().getDatabaseURL());
         metadataConf.setDefaultLinkNumber(config.getRunTimeParameter().getMetadata().getDefaultLinkNumber());

         String loginPwd=config.getRunTimeParameter().getMetadata().getLoginPassword();
         int enType = config.getRunTimeParameter().getEncryptType();
         if (enType == 1)
         {// 0-������,1-DESPlus����
            try
            {
               DESPlus desPlus = new DESPlus("rsas");
               loginPwd = desPlus.decrypt(loginPwd);
            }
            catch (Exception e)
            {
               e.printStackTrace();
            }
         }
         metadataConf.setLoginPassword(loginPwd);
         
         metadataConf.setLoginUserName(config.getRunTimeParameter().getMetadata().getLoginUserName());
         metadataConf.setMaxLinkNumber(config.getRunTimeParameter().getMetadata().getMaxLinkNumber());
         metadataConf.setMaxThread(config.getRunTimeParameter().getMetadata().getMaxThread());
         metadataConf.setMinLinkNumber(config.getRunTimeParameter().getMetadata().getMinLinkNumber());
         metadataConf.setMetadataDatabaseType(config.getRunTimeParameter().getMetadata().getMetadataDatabaseType());

         fr.close();
      }
      return metadataConf;
   }

   /************************************************
    * ��������������Application������Ϣ ����˵���� ����ֵ˵����
    * 
    * @throws ValidationException
    * @throws MarshalException
    * @throws IOException
    ************************************************/
   static ApplicationConf appConf = null;
   
   public static ApplicationConf getApplication(String filePath) throws MarshalException, ValidationException,
         IOException
   {
      Reader fr = new FileReader(filePath);
      Config config = (Config) Config.unmarshal(fr);
      if (appConf  == null) {
         appConf = new ApplicationConf();
      }
      appConf.setDebug(config.getRunTimeParameter().getDebug());
      appConf.setDatabaseDriver(config.getRunTimeParameter().getApplication().getDatabaseDriver());
      appConf.setDatabaseURL(config.getRunTimeParameter().getApplication().getDatabaseURL());
      appConf.setLoginPassword(config.getRunTimeParameter().getApplication().getLoginPassword());
      appConf.setLoginUserName(config.getRunTimeParameter().getApplication().getLoginUserName());
      appConf.setMaxThread(config.getRunTimeParameter().getApplication().getMaxThread());
      appConf.setTemplateCache(config.getRunTimeParameter().getApplication().getTemplateCache());
      appConf.setImageCache(config.getRunTimeParameter().getApplication().getImageCache());
      appConf.setDataCache(config.getRunTimeParameter().getApplication().getDataCache());
      appConf.setReportCache(config.getRunTimeParameter().getApplication().getReportCache());
      appConf.setVirtualLimit(config.getRunTimeParameter().getApplication().getVirtualLimit());

      fr.close();
      return appConf;
   }
   
   /**
    * <p>���غ���getMetadata</p>
    * 
    * @param input
    * @return
    * @throws MarshalException
    * @throws ValidationException
    * @throws IOException
    ************************************** 
    */
   public static ApplicationConf getApplication(InputStream input) throws MarshalException, ValidationException, IOException
   {
      if (appConf  == null) {
         appConf = new ApplicationConf();
      }
      Reader fr = new InputStreamReader(input);
      Config config = (Config) Config.unmarshal(fr);
      
      appConf.setDebug(config.getRunTimeParameter().getDebug());
      appConf.setDatabaseDriver(config.getRunTimeParameter().getApplication().getDatabaseDriver());
      appConf.setDatabaseURL(config.getRunTimeParameter().getApplication().getDatabaseURL());
      appConf.setLoginPassword(config.getRunTimeParameter().getApplication().getLoginPassword());
      appConf.setLoginUserName(config.getRunTimeParameter().getApplication().getLoginUserName());
      appConf.setMaxThread(config.getRunTimeParameter().getApplication().getMaxThread());
      appConf.setTemplateCache(config.getRunTimeParameter().getApplication().getTemplateCache());
      appConf.setImageCache(config.getRunTimeParameter().getApplication().getImageCache());
      appConf.setDataCache(config.getRunTimeParameter().getApplication().getDataCache());
      appConf.setReportCache(config.getRunTimeParameter().getApplication().getReportCache());
      appConf.setVirtualLimit(config.getRunTimeParameter().getApplication().getVirtualLimit());
      
      return appConf;
   }

   /************************************************
    * ��������������Agent������Ϣ ����˵���� ����ֵ˵����
    * 
    * @throws ValidationException
    * @throws MarshalException
    * @throws IOException
    ************************************************/
   public static AgentConf getAgent(String filePath) throws MarshalException, ValidationException, IOException
   {
      Reader fr = new FileReader(filePath);
      Config config = (Config) Config.unmarshal(fr);
      AgentConf agentConf = new AgentConf();
      agentConf.setDatabaseDriver(config.getRunTimeParameter().getAgent().getDatabaseDriver());
      agentConf.setDatabaseURL(config.getRunTimeParameter().getAgent().getDatabaseURL());
      agentConf.setLoginPassword(config.getRunTimeParameter().getAgent().getLoginPassword());
      agentConf.setLoginUserName(config.getRunTimeParameter().getAgent().getLoginUserName());
      agentConf.setMaxThread(config.getRunTimeParameter().getAgent().getMaxThread());
      agentConf.setDebug(config.getRunTimeParameter().getDebug());
      agentConf.setProcessWaitingTime(config.getRunTimeParameter().getAgent().getProcessWaitingTime());
      agentConf.setSocketPort(config.getRunTimeParameter().getAgent().getSocketPort());
      agentConf.setMaxProcess(config.getRunTimeParameter().getAgent().getMaxProcess());
      agentConf.setMaxMemory(config.getRunTimeParameter().getAgent().getMaxMemory());
      agentConf.setFTPLoginName(config.getRunTimeParameter().getAgent().getFTPLoginName());
      agentConf.setFTPPassword(config.getRunTimeParameter().getAgent().getFTPPassword());
      agentConf.setFTPPort(config.getRunTimeParameter().getAgent().getFTPPort());
      agentConf.setFTPRoot(config.getRunTimeParameter().getAgent().getFTPRoot());
      agentConf.setFTPServer(config.getRunTimeParameter().getAgent().getFTPServer());

      fr.close();
      return agentConf;
   }

   /************************************************
    * ��������������DataReport������Ϣ ����˵���� ����ֵ˵����
    * 
    * @throws ValidationException
    * @throws MarshalException
    * @throws IOException
    ************************************************/
   public static DataReportConf getDataReport(InputStream input) throws MarshalException, ValidationException,
         IOException
   {
      Reader fr = null;
      DataReportConf drConf = new DataReportConf();
      try
      {
         fr = new InputStreamReader(input);
         Config config = (Config) Config.unmarshal(fr);

         drConf.setDatabaseDriver(config.getRunTimeParameter().getDataReport().getDatabaseDriver());
         drConf.setDatabaseURL(config.getRunTimeParameter().getDataReport().getDatabaseURL());
         drConf.setDataReportDatabaseType(config.getRunTimeParameter().getDataReport().getDataReportDatabaseType());
         drConf.setDefaultLinkNumber(config.getRunTimeParameter().getDataReport().getDefaultLinkNumber());

         String loginPwd=config.getRunTimeParameter().getDataReport().getLoginPassword();
         int enType = config.getRunTimeParameter().getEncryptType();
         if (enType == 1)
         {// 0-������,1-DESPlus����
            try
            {
               DESPlus desPlus = new DESPlus("rsas");
               loginPwd = desPlus.decrypt(loginPwd);
            }
            catch (Exception e)
            {
               e.printStackTrace();
            }
         }
         drConf.setLoginPassword(loginPwd);
         
         drConf.setLoginUserName(config.getRunTimeParameter().getDataReport().getLoginUserName());
         drConf.setMaxLinkNumber(config.getRunTimeParameter().getDataReport().getMaxLinkNumber());
         drConf.setMinLinkNumber(config.getRunTimeParameter().getDataReport().getMinLinkNumber());
      }
      finally
      {
         if (fr != null)
         {
            fr.close();
         }
      }
      return drConf;
   }

   /************************************************
    * ��������������DataReport������Ϣ ����˵���� ����ֵ˵����
    * 
    * @throws ValidationException
    * @throws MarshalException
    * @throws IOException
    ************************************************/
   public static DataReportConf getDataReport(String filePath) throws MarshalException, ValidationException,
         IOException
   {
      DataReportConf drConf = null;
      Reader fr = new FileReader(filePath);
      Config config = (Config) Config.unmarshal(fr);
      if (config.getRunTimeParameter().getDataReport() != null)
      {
         drConf = new DataReportConf();
         drConf.setDatabaseDriver(config.getRunTimeParameter().getDataReport().getDatabaseDriver());
         drConf.setDatabaseURL(config.getRunTimeParameter().getDataReport().getDatabaseURL());
         drConf.setDataReportDatabaseType(config.getRunTimeParameter().getDataReport().getDataReportDatabaseType());
         drConf.setDefaultLinkNumber(config.getRunTimeParameter().getDataReport().getDefaultLinkNumber());

         String loginPwd=config.getRunTimeParameter().getDataReport().getLoginPassword();
         int enType = config.getRunTimeParameter().getEncryptType();
         if (enType == 1)
         {// 0-������,1-DESPlus����
            try
            {
               DESPlus desPlus = new DESPlus("rsas");
               loginPwd = desPlus.decrypt(loginPwd);
            }
            catch (Exception e)
            {
               e.printStackTrace();
            }
         }
         drConf.setLoginPassword(loginPwd);
         
         drConf.setLoginUserName(config.getRunTimeParameter().getDataReport().getLoginUserName());
         drConf.setMaxLinkNumber(config.getRunTimeParameter().getDataReport().getMaxLinkNumber());
         drConf.setMinLinkNumber(config.getRunTimeParameter().getDataReport().getMinLinkNumber());
      }
      return drConf;
   }

   /************************************************
    * ��������������IntegrationLayer������Ϣ ����˵���� ����ֵ˵����
    * 
    * @throws ValidationException
    * @throws MarshalException
    * @throws IOException
    ************************************************/
   public static IntegrationLayerConf getIntegrationLayer(InputStream input) throws MarshalException,
         ValidationException, IOException
   {
      Reader fr = null;
      IntegrationLayerConf ilConf = new IntegrationLayerConf();
      try
      {
         fr = new InputStreamReader(input);
         Config config = (Config) Config.unmarshal(fr);

         ilConf = new IntegrationLayerConf();
         ilConf.setDatabaseDriver(config.getRunTimeParameter().getIntegrationLayer().getDatabaseDriver());
         ilConf.setDatabaseURL(config.getRunTimeParameter().getIntegrationLayer().getDatabaseURL());
         ilConf.setIntegrationDatabaseType(config.getRunTimeParameter().getIntegrationLayer()
               .getIntegrationDatabaseType());
         ilConf.setDefaultLinkNumber(config.getRunTimeParameter().getIntegrationLayer().getDefaultLinkNumber());
         ilConf.setLoginPassword(config.getRunTimeParameter().getIntegrationLayer().getLoginPassword());
         ilConf.setLoginUserName(config.getRunTimeParameter().getIntegrationLayer().getLoginUserName());
         ilConf.setMaxLinkNumber(config.getRunTimeParameter().getIntegrationLayer().getMaxLinkNumber());
         ilConf.setMinLinkNumber(config.getRunTimeParameter().getIntegrationLayer().getMinLinkNumber());
      }

      finally
      {
         if (fr != null)
         {
            fr.close();
         }
      }
      return ilConf;
   }

   /************************************************
    * ��������������IntegrationLayer������Ϣ ����˵���� ����ֵ˵����
    * 
    * @throws ValidationException
    * @throws MarshalException
    * @throws IOException
    ************************************************/
   public static IntegrationLayerConf getIntegrationLayer(String filePath) throws MarshalException,
         ValidationException, IOException
   {
      IntegrationLayerConf ilConf = null;
      Reader fr = null;
      try
      {
         fr = new FileReader(filePath);
         Config config = (Config) Config.unmarshal(fr);
         if (config.getRunTimeParameter().getIntegrationLayer() != null)
         {
            ilConf = new IntegrationLayerConf();
            ilConf.setDatabaseDriver(config.getRunTimeParameter().getIntegrationLayer().getDatabaseDriver());
            ilConf.setDatabaseURL(config.getRunTimeParameter().getIntegrationLayer().getDatabaseURL());
            ilConf.setIntegrationDatabaseType(config.getRunTimeParameter().getIntegrationLayer()
                  .getIntegrationDatabaseType());
            ilConf.setDefaultLinkNumber(config.getRunTimeParameter().getIntegrationLayer().getDefaultLinkNumber());
            ilConf.setLoginPassword(config.getRunTimeParameter().getIntegrationLayer().getLoginPassword());
            ilConf.setLoginUserName(config.getRunTimeParameter().getIntegrationLayer().getLoginUserName());
            ilConf.setMaxLinkNumber(config.getRunTimeParameter().getIntegrationLayer().getMaxLinkNumber());
            ilConf.setMinLinkNumber(config.getRunTimeParameter().getIntegrationLayer().getMinLinkNumber());
         }
      }
      finally
      {
         try
         {
            if (fr != null)
            {
               fr.close();
            }
         }
         catch (Exception e)
         {
            e.printStackTrace();
         }
      }
      return ilConf;
   }
   
   /************************************************
    * ��������������IntegrationLayer������Ϣ ����˵���� ����ֵ˵����
    * 
    * @throws ValidationException
    * @throws MarshalException
    * @throws IOException
    ************************************************/
   public static CollectionLayerConf getCollectionLayer(InputStream input) throws MarshalException,
         ValidationException, IOException
   {
      Reader fr = null;
      CollectionLayerConf clConf = null;
      try
      {
         fr = new InputStreamReader(input);
         Config config = (Config) Config.unmarshal(fr);

         clConf = new CollectionLayerConf();
         clConf.setDatabaseDriver(config.getRunTimeParameter().getCollectionLayer().getDatabaseDriver());
         clConf.setDatabaseURL(config.getRunTimeParameter().getCollectionLayer().getDatabaseURL());
         clConf.setCollectionDatabaseType(config.getRunTimeParameter().getCollectionLayer()
               .getCollectionDatabaseType());
         clConf.setDefaultLinkNumber(config.getRunTimeParameter().getCollectionLayer().getDefaultLinkNumber());
         clConf.setLoginPassword(config.getRunTimeParameter().getCollectionLayer().getLoginPassword());
         clConf.setLoginUserName(config.getRunTimeParameter().getCollectionLayer().getLoginUserName());
         clConf.setMaxLinkNumber(config.getRunTimeParameter().getCollectionLayer().getMaxLinkNumber());
         clConf.setMinLinkNumber(config.getRunTimeParameter().getCollectionLayer().getMinLinkNumber());
      }

      finally
      {
         if (fr != null)
         {
            fr.close();
         }
      }
      return clConf;
   }
   
   /************************************************
    * ��������������IntegrationLayer������Ϣ ����˵���� ����ֵ˵����
    * 
    * @throws ValidationException
    * @throws MarshalException
    * @throws IOException
    ************************************************/
   public static CollectionLayerConf getCollectionLayer(String filePath) throws MarshalException,
         ValidationException, IOException
   {
      Reader fr = null;
      CollectionLayerConf clConf = null;
      try
      {
         fr = new FileReader(filePath);
         Config config = (Config) Config.unmarshal(fr);

         clConf = new CollectionLayerConf();
         clConf.setDatabaseDriver(config.getRunTimeParameter().getCollectionLayer().getDatabaseDriver());
         clConf.setDatabaseURL(config.getRunTimeParameter().getCollectionLayer().getDatabaseURL());
         clConf.setCollectionDatabaseType(config.getRunTimeParameter().getCollectionLayer()
               .getCollectionDatabaseType());
         clConf.setDefaultLinkNumber(config.getRunTimeParameter().getCollectionLayer().getDefaultLinkNumber());
         clConf.setLoginPassword(config.getRunTimeParameter().getCollectionLayer().getLoginPassword());
         clConf.setLoginUserName(config.getRunTimeParameter().getCollectionLayer().getLoginUserName());
         clConf.setMaxLinkNumber(config.getRunTimeParameter().getCollectionLayer().getMaxLinkNumber());
         clConf.setMinLinkNumber(config.getRunTimeParameter().getCollectionLayer().getMinLinkNumber());
      }

      finally
      {
         if (fr != null)
         {
            fr.close();
         }
      }
      return clConf;
   }

   /************************************************
    * ������������ȡClassMap ����˵���� content xml�ĵ� objectType objectType���� ����ֵ˵����
    * ����һ��classmapֵ
    * 
    * @throws IOException
    * @throws ValidationException
    * @throws MarshalException
    ************************************************/
   public static Map getObjectMap(String filePath) throws IOException, MarshalException, ValidationException
   {
      Reader fr = new FileReader(filePath);
      Config config = (Config) Config.unmarshal(fr);
      int i = config.getObjectFactory().getObjectMaps().getObjectMapCount();

      Map map = new HashMap();
      for (int j = 0; j < i; j++)
      {
         map.put(config.getObjectFactory().getObjectMaps().getObjectMap(j).getObjectType().toString(), config
               .getObjectFactory().getObjectMaps().getObjectMap(j).getClassMap());
      }

      fr.close();
      return map;
   }

   /***************************************
    * ��ȡCommand/��Ϣ��������ӳ�伯��
    * 
    * @param configFilePath ϵͳ�����ļ�·��
    * @return
    * @throws MarshalException
    * @throws ValidationException
    * @throws IOException
    ***************************************/
   public static Map getCommandMap(String configFilePath) throws MarshalException, ValidationException, IOException
   {
      Reader reader = new FileReader(configFilePath);
      Config config = (Config) Config.unmarshal(reader);
      int commandNum = config.getCommandMaps().getCommandMapCount();

      Map cmdMap = new HashMap();
      for (int i = 0; i < commandNum; i++)
      {
         cmdMap.put(config.getCommandMaps().getCommandMap(i).getCommandType().toString(), config.getCommandMaps()
               .getCommandMap(i).getServerType().toString());
      }

      reader.close();
      return cmdMap;
   }

   public static MetadataConf getMetadataConf()
   {
      return metadataConf;
   }

}
