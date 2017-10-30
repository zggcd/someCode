package com.ccssoft.rsas.metadata.sqlfunction.model;

import java.io.Serializable;
import java.util.List;

import com.ccssoft.rsas.metadata.funcparams.model.FuncParamsVO;

/**
 * <p>标题:报表工具元数据对象</p> 
 * <p>描述：系统函数元数据vO对象</p> 
 * <p>版权: Copyright (c) 2007 </p>
 * <p>公司: 广州瑞达通信技术有限公司</p>
 * @version 1.0
 * @author 曾俊佳
 */
public class SQLFunctionVO implements Serializable
{

   private static final long serialVersionUID = 1L;
   private String functionID; //函数ID
   private String funcName; //函数名称
   private String funcExpress; //函数表达式
   private String funcCategory; //函数归类 C--字符串函数 M--数学函数 S--聚合函数 D--日期函数 T--系统转换函数
   private String funcType; //函数类型 S--系统内嵌的函数或变量 U--用户自定义的函数或变量
   private int paramsCount; //函数具有的参数个数
   private String className; //函数或变量的解释类名
   private String oracleExp; //Oracle下的表达式
   private String sqlServerExp; //SQLServer下的表达式
   private String db2Exp; //db2下的表达式
   private String sybaseExp; //sybase下的表达式
   private String informixExp; //informix下的表达式
   private String desc;
   private List<FuncParamsVO> FuncParams; //函数参数集合

   public String getClassName()
   {
      return className;
   }

   public void setClassName(String className)
   {
      this.className = className;
   }

   public String getDb2Exp()
   {
      return db2Exp;
   }

   public void setDb2Exp(String db2Exp)
   {
      this.db2Exp = db2Exp;
   }

   public String getDesc()
   {
      return desc;
   }

   public void setDesc(String desc)
   {
      this.desc = desc;
   }

   /**
    * <p>函数归类 C--字符串函数 M--数学函数 S--聚合函数 D--日期函数 T--系统转换函数</p>
    * @return String
    */
   public String getFuncCategory()
   {
      return funcCategory;
   }

   /**
    * <p>函数归类 C--字符串函数 M--数学函数 S--聚合函数 D--日期函数 T--系统转换函数</p>
    * @param funcCategory String
    */
   public void setFuncCategory(String funcCategory)
   {
      this.funcCategory = funcCategory;
   }

   public String getFuncExpress()
   {
      return funcExpress;
   }

   public void setFuncExpress(String funcExpress)
   {
      this.funcExpress = funcExpress;
   }

   public String getFuncName()
   {
      return funcName;
   }

   public void setFuncName(String funcName)
   {
      this.funcName = funcName;
   }

   public String getFunctionID()
   {
      return functionID;
   }

   public void setFunctionID(String functionID)
   {
      this.functionID = functionID;
   }

   /**
    * <p>函数类型 S--系统内嵌的函数或变量 U--用户自定义的函数或变量</p>
    * @return String
    */
   public String getFuncType()
   {
      return funcType;
   }

   /**
    * <p>函数类型 S--系统内嵌的函数或变量 U--用户自定义的函数或变量</p>
    * @param funcType String
    */
   public void setFuncType(String funcType)
   {
      this.funcType = funcType;
   }

   public String getInformixExp()
   {
      return informixExp;
   }

   public void setInformixExp(String informixExp)
   {
      this.informixExp = informixExp;
   }

   public String getOracleExp()
   {
      return oracleExp;
   }

   public void setOracleExp(String oracleExp)
   {
      this.oracleExp = oracleExp;
   }

   public int getParamsCount()
   {
      return paramsCount;
   }

   public void setParamsCount(int paramsCount)
   {
      this.paramsCount = paramsCount;
   }

   public String getSqlServerExp()
   {
      return sqlServerExp;
   }

   public void setSqlServerExp(String sqlServerExp)
   {
      this.sqlServerExp = sqlServerExp;
   }

   public String getSybaseExp()
   {
      return sybaseExp;
   }

   public void setSybaseExp(String sybaseExp)
   {
      this.sybaseExp = sybaseExp;
   }

   public List<FuncParamsVO> getFuncParams()
   {
      return this.FuncParams;
   }

   public void setFuncParams(List<FuncParamsVO> funcParams)
   {
      this.FuncParams = funcParams;
   }

}
