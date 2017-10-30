package com.ccssoft.rsas.metadata.link.model;

import java.util.List;

import com.ccssoft.rsas.metadata.dbtype.model.DatabaseTypeVO;
import com.ccssoft.rsas.metadata.table.model.TableVO;

/**
 * <p>标题:报表工具元数据对象</p> 
 * <p>描述:数据源元数据对象</p> 
 * <p>版权: Copyright (c) 2007 </p>
 * <p>公司: 广州瑞达通信技术有限公司</p>
 * @version 1.0
 * @author 曾俊佳
 */

public class LinkVO implements java.io.Serializable
{

   private static final long serialVersionUID = 1L;

   private String host; //数据库服务器的IP或名称

   private int port;   //数据库端口

   private String databaseName; //连接数据库的名称（不适于Oracle）

   private String SID; //数据库服务的SID（仅适用于Oracle）

   private String userName; //连接数据库的用户名

   private String password; // 连接数据库的口令

   private String linkID; //数据源ID

   private String LinkName;  //数据源名称

   private int linkType; //保留字段，目前暂时不使用。字段所代表的含义：1--表示连接关系数据库系统，使用自身的Server提取数据 2--表示连接其他厂家的Server，使用厂商的OLAP Server
   
   private String databaseTypeID; //数据库类型ID
   
   private String desc; //描述
   
   private int setMode;
   
   private String URL;

   private DatabaseTypeVO databaseType; //数据源类型
   
   private List<TableVO> dbTable;

   public List<TableVO> getDbTable() {
	return dbTable;
}

public void setDbTable(List<TableVO> dbTable) {
	this.dbTable = dbTable;
}

public String getDatabaseName()
   {
      return this.databaseName;
   }

   public void setDatabaseName(String databaseName)
   {
      this.databaseName = databaseName;
   }

   public DatabaseTypeVO getDatabaseType()
   {
      return this.databaseType;
   }

   public void setDatabaseType(DatabaseTypeVO databaseType)
   {
      this.databaseType = databaseType;
   }

   public String getDatabaseTypeID()
   {
      return this.databaseTypeID;
   }

   public void setDatabaseTypeID(String databaseTypeID)
   {
      this.databaseTypeID = databaseTypeID;
   }

   public String getDesc()
   {
      return this.desc;
   }

   public void setDesc(String desc)
   {
      this.desc = desc;
   }

   public String getHost()
   {
      return this.host;
   }

   public void setHost(String host)
   {
      this.host = host;
   }

   public String getLinkID()
   {
      return this.linkID;
   }

   public void setLinkID(String linkID)
   {
      this.linkID = linkID;
   }

   public String getLinkName()
   {
      return this.LinkName;
   }

   public void setLinkName(String linkName)
   {
      this.LinkName = linkName;
   }
   /**
    * <p>保留字段，目前暂时不使用。字段所代表的含义：1--表示连接关系数据库系统，使用自身的Server提取数据 2--表示连接其他厂家的Server，使用厂商的OLAP Server</p>
    * @return int
    */
   public int getLinkType()
   {
      return this.linkType;
   }
   
   /**
    * <p>保留字段，目前暂时不使用。字段所代表的含义：1--表示连接关系数据库系统，使用自身的Server提取数据 2--表示连接其他厂家的Server，使用厂商的OLAP Server</p>
    * @param linkType int
    */
   public void setLinkType(int linkType)
   {
      this.linkType = linkType;
   }

   public String getPassword()
   {
      return this.password;
   }

   public void setPassword(String password)
   {
      this.password = password;
   }

   public int getPort()
   {
      return this.port;
   }

   public void setPort(int port)
   {
      this.port = port;
   }

   public String getSID()
   {
      return this.SID;
   }

   public void setSID(String sid)
   {
      this.SID = sid;
   }

   public String getUserName()
   {
      return this.userName;
   }

   public void setUserName(String userName)
   {
      this.userName = userName;
   }

   public void setSetMode(int setMode)
   {
	   this.setMode = setMode;
   }
   
   public int getSetMode()
   {
	   return this.setMode;
   }
   
   public void setURL(String URL)
   {
	   this.URL = URL;
   }
   
   public String getURL()
   {
	   return this.URL;
   }

}
