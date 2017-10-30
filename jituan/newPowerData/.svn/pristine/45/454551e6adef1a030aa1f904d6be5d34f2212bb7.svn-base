package com.ccssoft.rsas.metadata.relationitem.model;

import java.io.Serializable;

import com.ccssoft.rsas.metadata.filter.model.FilterVO;


/**
 * <p>标题:瑞达统计分析系统元数据模块</p> 
 * <p>描述:关联关系内容vo对象</p> 
 * <p>版权: Copyright (c) 2007 </p>
 * <p>公司: 广州瑞达通信技术有限公司</p>
 * &version 1.0
 * &author 曾俊佳
 */

public class RelationItemVO implements Serializable
{

   private static final long serialVersionUID = 1L;
   private String relationItemID; //关联关系元素ID
   private String relationID; //关联关系ID
   private String parentItemID; //关系元素父ID
   private String itemType; //关联关系类型    F -- 过滤条件 S -- 逻辑符号 C -- 子条件

   private String filterID; //引用的过滤条件ID
   private String logicSymbol; //逻辑关系类型 AND --逻辑与  OR --逻辑或 
   private int itemOrder; //过滤条件序号
   private String expression; //条件表达式
   private String expressDesc;//表达式描述
   private int level; //过滤条件所在的层

   private FilterVO filtervo; //过滤条件对象
   
   /**
    * <p>条件表达式</p>
    * @return String
    */
   public String getExpression()
   {
      if(this.expression == null) this.expression = "";
      return this.expression;
   }
   
   /**
    * <p>条件表达式</p>
    * @param expression String
    */
   public void setExpression(String expression)
   {
     
      this.expression = expression;
   }

   public String getFilterID()
   {
      return this.filterID;
   }

   public void setFilterID(String filterID)
   {
      this.filterID = filterID;
   }

   public int getItemOrder()
   {
      return this.itemOrder;
   }

   public void setItemOrder(int itemOrder)
   {
      this.itemOrder = itemOrder;
   }

   /**
    *  <p>关联关系类型    F -- 过滤条件 S -- 逻辑符号 C -- 子条件</p>
    * @return String
    */
   public String getItemType()
   {
      return this.itemType;
   }

   /**
    * <p>关联关系类型    F -- 过滤条件 S -- 逻辑符号 C -- 子条件</p>
    * @param itemType String
    */
   public void setItemType(String itemType)
   {
      this.itemType = itemType;
   }
   
   /**
    * <p>过滤条件所在的层</p>
    * @return int
    */
   public int getLevel()
   {
      return this.level;
   }
   
   /**
    * <p>过滤条件所在的层</p>
    * @param level int
    */
   public void setLevel(int level)
   {
      this.level = level;
   }

   /**
    * <p>逻辑关系类型 AND --逻辑与  OR --逻辑或 </p>
    * @return String
    */

   public String getLogicSymbol()
   {
      return this.logicSymbol;
   }

   /**
    * <p>逻辑关系类型 AND --逻辑与  OR --逻辑或 </p>
    * @param logicSymbol String
    */
   public void setLogicSymbol(String logicSymbol)
   {
      this.logicSymbol = logicSymbol;
   }

   public String getParentItemID()
   {
      if(this.parentItemID == null) this.parentItemID = "";
      return this.parentItemID;
   }

   public void setParentItemID(String parentItemID)
   {
      this.parentItemID = parentItemID;
   }

   public String getRelationID()
   {
      if(this.relationID == null) this.relationID = "";
      return this.relationID;
   }

   public void setRelationID(String relationID)
   {
      this.relationID = relationID;
   }

   public String getRelationItemID()
   {
      return this.relationItemID;
   }

   public void setRelationItemID(String relationItemID)
   {
      this.relationItemID = relationItemID;
   }

   public FilterVO getFiltervo()
   {
      return this.filtervo;
   }

   public void setFiltervo(FilterVO filtervo)
   {
      this.filtervo = filtervo;
   }

   public String getExpressDesc()
   {
      if(this.expressDesc == null) this.expressDesc = "";
      return this.expressDesc;
   }

   public void setExpressDesc(String expressDesc)
   {
      this.expressDesc = expressDesc;
   }

}
