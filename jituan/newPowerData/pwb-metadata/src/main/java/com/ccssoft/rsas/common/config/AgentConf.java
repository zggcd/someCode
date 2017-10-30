package com.ccssoft.rsas.common.config;

public class AgentConf
{
   private String databaseDriver;
   private String databaseURL;
   private String loginUserName;
   private String loginPassword;
   private int maxThread;
   private int debug;
   private int processWaitingTime;
   private int socketPort;
   private int maxProcess;
   private int maxMemory;
   private String FTPServer;
   private String FTPLoginName;
   private String FTPPassword;
   private String FTPRoot;
   private int FTPPort;

   public int getMaxMemory()
   {
      return maxMemory;
   }

   public void setMaxMemory(int maxMemory)
   {
      this.maxMemory = maxMemory;
   }

   public int getMaxProcess()
   {
      return maxProcess;
   }

   public void setMaxProcess(int maxProcess)
   {
      this.maxProcess = maxProcess;
   }

   public int getSocketPort()
   {
      return socketPort;
   }

   public void setSocketPort(int socketPort)
   {
      this.socketPort = socketPort;
   }

   public int getProcessWaitingTime()
   {
      return processWaitingTime;
   }

   public void setProcessWaitingTime(int processWaitingTime)
   {
      this.processWaitingTime = processWaitingTime;
   }

   public String getDatabaseDriver()
   {
      return databaseDriver;
   }

   public void setDatabaseDriver(String databaseDriver)
   {
      this.databaseDriver = databaseDriver;
   }

   public String getDatabaseURL()
   {
      return databaseURL;
   }

   public void setDatabaseURL(String databaseURL)
   {
      this.databaseURL = databaseURL;
   }

   public String getLoginPassword()
   {
      return loginPassword;
   }

   public void setLoginPassword(String loginPassword)
   {
      this.loginPassword = loginPassword;
   }

   public String getLoginUserName()
   {
      return loginUserName;
   }

   public void setLoginUserName(String loginUserName)
   {
      this.loginUserName = loginUserName;
   }

   public int getMaxThread()
   {
      return maxThread;
   }

   public void setMaxThread(int maxThread)
   {
      this.maxThread = maxThread;
   }
   
   public int getDebug()
   {
      return debug;
   }

   public void setDebug(int debug)
   {
      this.debug = debug;
   }

   public String getFTPServer()
   {
      return FTPServer;
   }

   public void setFTPServer(String server)
   {
      FTPServer = server;
   }

   public String getFTPLoginName()
   {
      return FTPLoginName;
   }

   public void setFTPLoginName(String loginName)
   {
      FTPLoginName = loginName;
   }

   public String getFTPPassword()
   {
      return FTPPassword;
   }

   public void setFTPPassword(String password)
   {
      FTPPassword = password;
   }

   public String getFTPRoot()
   {
      return FTPRoot;
   }

   public void setFTPRoot(String root)
   {
      FTPRoot = root;
   }

   public int getFTPPort()
   {
      return FTPPort;
   }

   public void setFTPPort(int port)
   {
      FTPPort = port;
   }
}
