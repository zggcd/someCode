package com.ccssoft.rsas.metadata.memberproperty.model;

import java.io.Serializable;

/**
 * <p>标题:报表工具元数据对象</p> 
 * <p>描述：成员属性对象元数据VO对象</p> 
 * <p>版权: Copyright (c) 2007 </p>
 * <p>公司: 广州瑞达通信技术有限公司</p>
 * @version 1.0
 * @author 曾俊佳
 */
public class MemberPropertyVO implements Serializable
{

   private static final long serialVersionUID = 1L;

   private String propetyID;//成员属性ID
   private String propetyName;//成员属性名称 
   private String memberID;//所属成员ID
   private String propertyField;//引用字段
   private String tableName;//引用表名
   private int levelLength;//父子维度每级成员编码的长度 
   private String nodeType;//离散维成员节点类型 G--分组；F--条件；V--内容值；A--手工调整过表达式
   private String minValue;//范围值的最小值
   private String maxValue;//范围值的最大值
   private String propertyValue;//文本值
   private String searchKind;//查找方式 E -- 精确查找,B -- 模糊查找,LB -- 左模糊,RB -- 右模糊,IN -- 包含,EE--<=及>=,BB-- <及>,BE--<及>=,EB--<=及>
   private String expression;//表达式
   private String parentID;//父成员属性ID
   private String desc;//描述

   public String getDesc()
   {
      return desc;
   }

   public void setDesc(String desc)
   {
      this.desc = desc;
   }

   public String getExpression()
   {
      return expression;
   }

   public void setExpression(String expression)
   {
      this.expression = expression;
   }

   public int getLevelLength()
   {
      return levelLength;
   }

   public void setLevelLength(int levelLength)
   {
      this.levelLength = levelLength;
   }

   public String getMaxValue()
   {
      return maxValue;
   }

   public void setMaxValue(String maxValue)
   {
      this.maxValue = maxValue;
   }

   public String getMemberID()
   {
      return memberID;
   }

   public void setMemberID(String memberID)
   {
      this.memberID = memberID;
   }

   public String getMinValue()
   {
      return minValue;
   }

   public void setMinValue(String minValue)
   {
      this.minValue = minValue;
   }
   
   /**
    * <p>离散维成员节点类型 G--分组；F--条件；V--内容值；A--手工调整过表达式</p>
    * @return String
    */
   public String getNodeType()
   {
      return nodeType;
   }
   
   /**
    * <p>离散维成员节点类型 G--分组；F--条件；V--内容值；A--手工调整过表达式</p>
    * @param String
    */
   public void setNodeType(String nodeType)
   {
      this.nodeType = nodeType;
   }

   public String getParentID()
   {
      return parentID;
   }

   public void setParentID(String parentID)
   {
      this.parentID = parentID;
   }

   public String getPropertyField()
   {
      return propertyField;
   }

   public void setPropertyField(String propertyField)
   {
      this.propertyField = propertyField;
   }

   public String getPropertyValue()
   {
      return propertyValue;
   }

   public void setPropertyValue(String propertyValue)
   {
      this.propertyValue = propertyValue;
   }

   public String getPropetyID()
   {
      return propetyID;
   }

   public void setPropetyID(String propetyID)
   {
      this.propetyID = propetyID;
   }

   public String getPropetyName()
   {
      return propetyName;
   }

   public void setPropetyName(String propetyName)
   {
      this.propetyName = propetyName;
   }
   
   /**
    * <p>查找方式 E -- 精确查找,B -- 模糊查找,LB -- 左模糊,RB -- 右模糊,IN -- 包含,EE--<=及>=,BB-- <及>,BE--<及>=,EB--<=及></p>
    * @return String
    */
   public String getSearchKind()
   {
      return searchKind;
   }
   
   /**
    * <p>查找方式 E -- 精确查找,B -- 模糊查找,LB -- 左模糊,RB -- 右模糊,IN -- 包含,EE--<=及>=,BB-- <及>,BE--<及>=,EB--<=及></p>
    * @param String
    */
   public void setSearchKind(String searchKind)
   {
      this.searchKind = searchKind;
   }

   public String getTableName()
   {
      return tableName;
   }

   public void setTableName(String tableName)
   {
      this.tableName = tableName;
   }

}
