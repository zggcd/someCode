package com.ccssoft.rsas.metadata.member.model;

import java.io.Serializable;
import java.util.List;

import com.ccssoft.rsas.metadata.memberproperty.model.MemberPropertyVO;
import com.ccssoft.rsas.metadata.sqlfunction.model.SQLFunctionVO;


/**
 * <p>标题:报表工具元数据对象</p> 
 * <p>描述：对象成员元数据VO对象</p> 
 * <p>版权: Copyright (c) 2007 </p>
 * <p>公司: 广州瑞达通信技术有限公司</p>
 * @version 1.0
 * @author 曾俊佳
 */
public class MemberVO implements Serializable
{

   private static final long serialVersionUID = 1L;
   private String memberID ;  //成员ID
   private String memberName ;//成员名称
   private String ownerID;// 成员所属对象ID
   private String ownerType;// 所属对象类型 D--维对象 M--度量对象
   private String primaryField;// 引用的关键字段
   private String dataType;// 关键字段数据类型 C -- 字符型N -- 数值型 D -- 日期型
   private String captionField;// 引用的名称或标题字段
   private String parentField;// 引用的父字段
   private String tableName;// 引用的维表名
   private String dateFormat;//日期格式
   private String funcID;// 计算函数ID
   private String expression; //表达式
   private int    isSumHalf;//是否半加型度量
   private int    memberOrder;// 序号
   private String desc;// 描述
   private SQLFunctionVO function; //计算函数对象
   private List<MemberPropertyVO> mpropertys ;//成员属性集合

   
   public String getMemberID()
   {
      return this.memberID;
   }

   public void setMemberID(String memberID)
   {
      this.memberID = memberID;
   }

   public String getMemberName()
   {
      return this.memberName;
   }

   public void setMemberName(String memberName)
   {
      this.memberName = memberName;
   }

   public String getCaptionField()
   {
      return this.captionField;
   }

   public void setCaptionField(String captionField)
   {
      this.captionField = captionField;
      if(this.captionField == null) this.captionField = "";
   }

   /**
    * <p>关键字段数据类型 C -- 字符型N -- 数值型 D -- 日期型</p>
    * @return String
    */
   public String getDataType()
   {
      return this.dataType;
   }

   /**
    *  <p>关键字段数据类型 C -- 字符型N -- 数值型 D -- 日期型</p>
    * @param dataType String
    */
   public void setDataType(String dataType)
   {
      this.dataType = dataType;
   }

   public String getDesc()
   {
      if(this.desc == null||this.desc.equalsIgnoreCase(" ")) this.desc = "";
      return this.desc;
   }

   public void setDesc(String desc)
   {
      this.desc = desc;
   }

   

   public String getFuncID()
   {
      return this.funcID;
   }

   public void setFuncID(String funcID)
   {
      this.funcID = funcID;
   }

   public SQLFunctionVO getFunction()
   {
      return this.function;
   }

   public void setFunction(SQLFunctionVO function)
   {
      this.function = function;
   }

 
   public int getMemberOrder()
   {
      return this.memberOrder;
   }

   public void setMemberOrder(int memberOrder)
   {
      this.memberOrder = memberOrder;
   }

   public List<MemberPropertyVO> getMpropertys()
   {
      return mpropertys;
   }

   public void setMpropertys(List<MemberPropertyVO> mpropertys)
   {
      this.mpropertys = mpropertys;
   }

   public String getOwnerID()
   {
      return this.ownerID;
   }

   public void setOwnerID(String ownerID)
   {
      this.ownerID = ownerID;
   }

   /**
    * <p>所属对象类型 D--维对象 M--度量对象</p>
    * @return String
    */
   public String getOwnerType()
   {
      return this.ownerType;
   }

   /**
    * <p>所属对象类型 D--维对象 M--度量对象</p>
    * @param ownerType String
    */
   public void setOwnerType(String ownerType)
   {
      this.ownerType = ownerType;
   }

   public String getParentField()
   {
      return this.parentField;
   }

   public void setParentField(String parentField)
   {
      this.parentField = parentField;
   }

  
   public String getPrimaryField()
   {
      return this.primaryField;
   }

   public void setPrimaryField(String primaryField)
   {
      this.primaryField = primaryField;
   }

   public String getTableName()
   {
      return this.tableName;
   }

   public void setTableName(String tableName)
   {
      if(this.tableName == null) this.tableName ="";
      this.tableName = tableName;
   }

   public String getDateFormat()
   {
      return dateFormat;
   }

   public void setDateFormat(String dateFormat)
   {
      this.dateFormat = dateFormat;
   }

   public String getExpression()
   {
      return expression;
   }

   public void setExpression(String expression)
   {
      this.expression = expression;
   }

   public int getIsSumHalf()
   {
      return isSumHalf;
   }

   public void setIsSumHalf(int isSumHalf)
   {
      this.isSumHalf = isSumHalf;
   }

}
