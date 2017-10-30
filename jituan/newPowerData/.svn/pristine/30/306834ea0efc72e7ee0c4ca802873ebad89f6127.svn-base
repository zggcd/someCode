package com.ccssoft.rsas.metadata.fieldobject.model;

import java.io.Serializable;

import com.ccssoft.rsas.metadata.cube.model.CubeVO;
import com.ccssoft.rsas.metadata.link.model.LinkVO;

/**
 * <p>标题:瑞达统计分析系统元数据对象</p> 
 * <p>描述：域对象信息视图对象</p> 
 * <p>版权: Copyright (c) 2007 </p>
 * <p>公司: 广州瑞达通信技术有限公司</p>
 * @version 1.0
 * @author 曾俊佳
 */
public class FieldObjectVO implements Serializable
{

   private static final long serialVersionUID = 1L;

   private String fieldID;//  域对象ID
   private String fieldObjectName;//   域对象名称 
   private String linkID;//   所属数据源ID 
   private String cubeID;//   所属立方ID
   private String tableName;//   域使用的表名 
   private String tableCaption;//   域使用的表中文名
   private String fieldType;//   域对象类型 D--维度域 M--度量域 T--由SQL自动生成的域，不在框架中显示
   private String fieldName;//   字段名
   private String dataType;//   字段数据类型   C--字符型 N--数值型  D--日期型
   private String filter;//   过滤条件 
   private String desc;//   描述 
   
   private LinkVO link ;// 数据库连接信息
   private CubeVO cube; //所属立方信息
   
   public String getCubeID()
   {
      return cubeID;
   }

   public void setCubeID(String cubeID)
   {
      this.cubeID = cubeID;
      if(this.cubeID == null) this.cubeID = "";
   }

   /**
    * <p>字段数据类型   C--字符型 N--数值型  D--日期型</p>
    * @return String
    */
   public String getDataType()
   {
      return dataType;
   }

   /**
    * <p>字段数据类型   C--字符型 N--数值型  D--日期型</p>
    * @param dataType String
    */
   public void setDataType(String dataType)
   {
      this.dataType = dataType;
      if(this.dataType == null) this.dataType = "";
   }

   public String getDesc()
   {
      return desc;
   }

   public void setDesc(String desc)
   {
      this.desc = desc;
   }

   public String getFieldID()
   {
      return fieldID;
   }

   public void setFieldID(String fieldID)
   {
      this.fieldID = fieldID;
      if(this.fieldID == null) this.fieldID = "";
   }

   public String getFieldName()
   {
      return fieldName;
   }

   public void setFieldName(String fieldName)
   {
      this.fieldName = fieldName;
      if(this.fieldName == null) this.fieldName = "";
   }

   /**
    *<p> 域对象类型 D--维度域 M--度量域 T--由SQL自动生成的域，不在框架中显示</p>
    * @return String
    */
   public String getFieldType()
   {
      return fieldType;
   }

   /**
    * <p> 域对象类型 D--维度域 M--度量域 T--由SQL自动生成的域，不在框架中显示</p>
    * @param fieldType String
    */
   public void setFieldType(String fieldType)
   {
      this.fieldType = fieldType;
      if(this.fieldType == null) this.fieldType = "";
   }

   public String getFilter()
   {
      return filter;
   }

   public void setFilter(String filter)
   {
      this.filter = filter;
      if(this.filter == null) this.filter = "";
   }

   public String getLinkID()
   {
      return linkID;
   }

   public void setLinkID(String linkID)
   {
      this.linkID = linkID;
      if(this.linkID == null) this.linkID = "";
   }

   public String getFieldObjectName()
   {
      return fieldObjectName;
   }

   public void setFieldObjectName(String fieldObjectName)
   {
      this.fieldObjectName = fieldObjectName;
      if(this.fieldObjectName == null) this.fieldObjectName = "";
   }

   public String getTableCaption()
   {
      return tableCaption;
   }

   public void setTableCaption(String tableCaption)
   {
      this.tableCaption = tableCaption;
      if(this.tableCaption == null) this.tableCaption = "";
   }

   public String getTableName()
   {
      return tableName;
   }

   public void setTableName(String tableName)
   {
      this.tableName = tableName;
      if(this.tableName == null) this.tableName = "";
   }

   public CubeVO getCube()
   {
      return cube;
   }

   public void setCube(CubeVO cube)
   {
      this.cube = cube;
   }

   public LinkVO getLink()
   {
      return link;
   }

   public void setLink(LinkVO link)
   {
      this.link = link;
   }

}
