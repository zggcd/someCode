package com.ccssoft.rsas.metadata.fieldobject.model;

import java.io.Serializable;
import java.util.List;

/**
 * <p>标题:瑞达统计分析系统元数据对象</p> 
 * <p>描述：域对象fields视图对象</p> 
 * <p>版权: Copyright (c) 2007 </p>
 * <p>公司: 广州瑞达通信技术有限公司</p>
 * @version 1.0
 * @author 曾俊佳
 */
public class FieldsVO implements Serializable
{
   private static final long serialVersionUID = 1L;
   private String sql;
   private String linkID;
   private List FiledTables;

   public List getFiledTables()
   {
      return FiledTables;
   }

   public void setFiledTables(List filedTables)
   {
      FiledTables = filedTables;
   }

   public String getSql()
   {
      return sql;
   }

   public void setSql(String sql)
   {
      this.sql = sql;
   }

   public String getLinkID()
   {
      return linkID;
   }

   public void setLinkID(String linkID)
   {
      this.linkID = linkID;
   }

}
