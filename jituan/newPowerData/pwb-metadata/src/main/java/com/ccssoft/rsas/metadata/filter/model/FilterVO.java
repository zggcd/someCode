 package com.ccssoft.rsas.metadata.filter.model;

import java.io.Serializable;

import com.ccssoft.rsas.metadata.sqlfunction.model.SQLFunctionVO;



/**
 * <p>标题:报表工具元数据对象</p> 
 * <p>描述：报表过滤条件元数据对象</p> 
 * <p>版权: Copyright (c) 2007 </p>
 * <p>公司: 广州瑞达通信技术有限公司</p>
 * @version 1.0
 * @author 曾俊佳
 */
public class FilterVO implements Serializable
{

   private static final long serialVersionUID = 1L;
   private String filterID;       //过滤条件ID   
   private String filterName;     //过滤条件名称
   private String dataType;       //过滤条件数据类型 C -- 字符型N -- 数值型 D -- 日期型
   private int    leftFilterType; //左边过滤条件类型 0--OPER 手工填写操作数  1--FLD 引用字段 2--FUNC 引用函数 3 -- 度量的having 4--结论规则fltRule
   private String leftOwner;      //左边宿主名
   private String leftOper;       //左边操作数
   private String leftFuncID;     //左边引用函数ID
   private String leftParams;     //左边函数参数表达式
   private String leftDesc;       //左表达式描述
   private int    operSymbol;     //关系操作符
   private int    rightFilterType;//右边过滤条件类型
   private String rightOwner;     //右边宿主名
   private String rightOper;      //右边操作数
   private String rightFuncID;    //右边引用函数ID
   private String rightParams;    //右边函数参数表达式
   private String rightDesc;      //右表达式描述
   private String expression;     //表达式
   private String expressDesc;    //表达式描述
   
   private SQLFunctionVO leftFunctionvo;//
   private SQLFunctionVO rightFunctionvo;//

   public String getExpressDesc()
   {
     if(this.expressDesc == null)  this.expressDesc = "";
       
     return this.expressDesc;
   }

   public void setExpressDesc(String expressDesc)
   {
      this.expressDesc = expressDesc;
   }

   public String getExpression()
   {
      if(this.expression == null) this.expression = "";
      return this.expression;
   }

   public void setExpression(String expression)
   {
      this.expression = expression;
   }

   public String getFilterID()
   {
      if(this.filterID == null) this.filterID = "";
      return this.filterID;
   }

   public void setFilterID(String filterID)
   {
      this.filterID = filterID;
   }

   public String getFilterName()
   {
      if(this.filterName == null) this.filterName = "";
      return this.filterName;
   }

   public void setFilterName(String filterName)
   {
      this.filterName = filterName;
   }

   public String getLeftDesc()
   {
      if(this.leftDesc == null) this.leftDesc = "";
      return this.leftDesc;
   }

   public void setLeftDesc(String leftDesc)
   {
      this.leftDesc = leftDesc;
   }

   /**
    * <p>左边过滤条件类型 0--OPER 手工填写操作数  1--FLD 引用字段 2--FUNC 引用函数 3 -- 度量的having</p>
    * @return int
    */
   public int getLeftFilterType()
   {
      
      return this.leftFilterType;
   }

   /**
    * <p>左边过滤条件类型 0--OPER 手工填写操作数  1--FLD 引用字段 2--FUNC 引用函数</p>
    * @param leftFilterType int
    */
   public void setLeftFilterType(int leftFilterType)
   {
      this.leftFilterType = leftFilterType;
   }

   public String getLeftFuncID()
   {
      if(this.leftFuncID == null) this.leftFuncID = "";
      return this.leftFuncID;
   }

   public void setLeftFuncID(String leftFuncID)
   {
      this.leftFuncID = leftFuncID;
   }

   public String getLeftOper()
   {
      if(this.leftOper == null) this.leftOper = "";
      return this.leftOper;
   }

   public void setLeftOper(String leftOper)
   {
      this.leftOper = leftOper;
   }

   public String getLeftOwner()
   {
      if(this.leftOwner == null) this.leftOwner = "";
      return this.leftOwner;
   }

   public void setLeftOwner(String leftOwner)
   {
      
      this.leftOwner = leftOwner;
   }

   public String getLeftParams()
   {
      if(this.leftParams == null) this.leftParams = "";
      return this.leftParams;
   }

   public void setLeftParams(String leftParams)
   {
      this.leftParams = leftParams;
   }

   public int getOperSymbol()
   {
      return this.operSymbol;
   }

   public void setOperSymbol(int operSymbol)
   {
      this.operSymbol = operSymbol;
   }

   public String getRightDesc()
   {
      if(this.rightDesc == null) this.rightDesc = "";
      return this.rightDesc;
   }

   public void setRightDesc(String rightDesc)
   {
      this.rightDesc = rightDesc;
   }

   public int getRightFilterType()
   {
      return this.rightFilterType;
   }

   public void setRightFilterType(int rightFilterType)
   {
      this.rightFilterType = rightFilterType;
   }

   public String getRightFuncID()
   {
      if(this.rightFuncID == null) this.rightFuncID = "";
      return this.rightFuncID;
   }

   public void setRightFuncID(String rightFuncID)
   {
      this.rightFuncID = rightFuncID;
   }

   public String getRightOper()
   {
      if(this.rightOper == null) this.rightOper = "";
      return this.rightOper;
   }

   public void setRightOper(String rightOper)
   {
      
      this.rightOper = rightOper;
   }

   public String getRightOwner()
   {
      if(this.rightOwner == null) this.rightOwner = "";
      return this.rightOwner;
   }

   public void setRightOwner(String rightOwner)
   {
      this.rightOwner = rightOwner;
   }

   public String getRightParams()
   {
      if(this.rightParams == null) this.rightParams = "";
      return this.rightParams;
   }

   public void setRightParams(String rightParams)
   {
      this.rightParams = rightParams;
   }

   public SQLFunctionVO getLeftFunctionvo()
   {
      return this.leftFunctionvo;
   }

   public void setLeftFunctionvo(SQLFunctionVO leftFunctionvo)
   {
      
      this.leftFunctionvo = leftFunctionvo;
   }

   public SQLFunctionVO getRightFunctionvo()
   {
  
      return this.rightFunctionvo;
   }

   public void setRightFunctionvo(SQLFunctionVO rightFunctionvo)
   {
      this.rightFunctionvo = rightFunctionvo;
   }
  
   /**
    * <p>过滤条件数据类型 C -- 字符型N -- 数值型 D -- 日期型</p>
    * @return String 
    */
   public String getDataType()
   {
      return dataType;
   }

   /**
    * <p>过滤条件数据类型 C -- 字符型N -- 数值型 D -- 日期型</p>
    * @param dataType String
    */
   public void setDataType(String dataType)
   {
      this.dataType = dataType;
   }

}
