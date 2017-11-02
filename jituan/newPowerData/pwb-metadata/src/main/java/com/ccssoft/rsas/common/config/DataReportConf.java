package com.ccssoft.rsas.common.config;

public class DataReportConf
{
   private String databaseDriver;
   private String databaseURL;
   private String loginUserName;
   private String loginPassword;
   private int maxLinkNumber;
   private int minLinkNumber;
   private int defaultLinkNumber;
   private String DataReportDatabaseType;
   
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
   public String getLoginUserName()
   {
      return loginUserName;
   }
   public void setLoginUserName(String loginUserName)
   {
      this.loginUserName = loginUserName;
   }
   public String getLoginPassword()
   {
      return loginPassword;
   }
   public void setLoginPassword(String loginPassword)
   {
      this.loginPassword = loginPassword;
   }
   public int getMaxLinkNumber()
   {
      return maxLinkNumber;
   }
   public void setMaxLinkNumber(int maxLinkNumber)
   {
      this.maxLinkNumber = maxLinkNumber;
   }
   public int getMinLinkNumber()
   {
      return minLinkNumber;
   }
   public void setMinLinkNumber(int minLinkNumber)
   {
      this.minLinkNumber = minLinkNumber;
   }
   public int getDefaultLinkNumber()
   {
      return defaultLinkNumber;
   }
   public void setDefaultLinkNumber(int defaultLinkNumber)
   {
      this.defaultLinkNumber = defaultLinkNumber;
   }
   public String getDataReportDatabaseType()
   {
      return DataReportDatabaseType;
   }
   public void setDataReportDatabaseType(String dataReportDatabaseType)
   {
      DataReportDatabaseType = dataReportDatabaseType;
   }
}