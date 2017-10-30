package com.ccssoft.rsas.metadata.measure.model;

import java.util.List;

import com.ccssoft.rsas.metadata.link.model.LinkVO;
import com.ccssoft.rsas.metadata.member.model.MemberVO;
import com.ccssoft.rsas.metadata.relation.model.RelationVO;

/**
 * <p>标题:报表工具元数据对象</p> 
 * <p>描述： 度量视图对象</p> 
 * <p>版权: Copyright (c) 2007 </p>
 * <p>公司: 广州瑞达通信技术有限公司</p>
 * @version 1.0
 * @author 曾俊佳
 */
public class MeasureVO implements java.io.Serializable
{

   public static final long serialVersionUID = 1L;

   private String measureID; // 度量ID
   private String measureName; //度量名称
   private String linkID; //连接对象ID
   private String relationID; //过滤条件
   private String measureType; //度量类型 度量类型分为：D--数据对象 C--计算对象,T--由SQL自动生成的域
   private String sumStyle; //度量汇总性质 G -- 全加型 H -- 半加型
   private String factTableName; //事实表名
   private String factTableCaption; //事实表名称
   private String fieldName; //引用字段名
   private int virtualFact; //是否虚拟事实表
   private int composeStyle; //命名组合方式 1 -- PREFIX 作为名称的前 2 -- POSTFIX 作为名称的后缀 3 -- REPLACE 替换掉虚拟表名
   private int ruleType; //规则类型 1 -- DATE 日期类型 2 -- CODE 代码类型 3 -- CONST常量
   private String dateFormat; //日期规则的格式
   private String desc; //描述
   private LinkVO link; //数据库链接信息
   private RelationVO relation; //关联关系对象
   private List<MemberVO> MeasureMember;//度量的成员集合
   
   /**
    * <p>命名组合方式 1 -- PREFIX 作为名称的前 2 -- POSTFIX 作为名称的后缀 3 -- REPLACE 替换掉虚拟表名</p>
    * @return int
    */
   public int getComposeStyle()
   {
      return this.composeStyle;
   }
   /**
    * <p>命名组合方式 1 -- PREFIX 作为名称的前 2 -- POSTFIX 作为名称的后缀 3 -- REPLACE 替换掉虚拟表名</p>
    * @param composeStyle int
    */
   public void setComposeStyle(int composeStyle)
   {
      this.composeStyle = composeStyle;
   }

   public String getDateFormat()
   {
      return this.dateFormat;
   }

   public void setDateFormat(String dateFormat)
   {
      this.dateFormat = dateFormat;
   }

   public String getDesc()
   {
      return this.desc;
   }

   public void setDesc(String desc)
   {
      this.desc = desc;
   }

   public String getFactTableCaption()
   {
      return this.factTableCaption;
   }

   public void setFactTableCaption(String factTableCaption)
   {
      this.factTableCaption = factTableCaption;
   }

   public String getFactTableName()
   {
      return this.factTableName;
   }

   public void setFactTableName(String factTableName)
   {
      this.factTableName = factTableName;
   }

   public String getFieldName()
   {
      if(this.fieldName == null) this.fieldName = "";
      return this.fieldName;
   }

   public void setFieldName(String fieldName)
   {
      this.fieldName = fieldName;
   }

   public LinkVO getLink()
   {
      return this.link;
   }

   public void setLink(LinkVO link)
   {
      this.link = link;
   }

   public String getLinkID()
   {
      return this.linkID;
   }

   public void setLinkID(String linkID)
   {
      this.linkID = linkID;
   }

   public String getMeasureID()
   {
      return this.measureID;
   }

   public void setMeasureID(String measureID)
   {
      this.measureID = measureID;
   }

   public String getMeasureName()
   {
      if(this.measureName == null) this.measureName = "";
      return this.measureName;
   }

   public void setMeasureName(String measureName)
   {
      this.measureName = measureName;
   }

   /**
    * <p>度量类型分为：D--数据对象 C--计算对象 T--由SQL自动生成的域</p>
    * @return String
    */
   public String getMeasureType()
   {
      return this.measureType;
   }

   /**
    * <p>度量类型分为：D--数据对象 C--计算对象 T--由SQL自动生成的域</p>
    * @param measureType String
    */
   public void setMeasureType(String measureType)
   {
      this.measureType = measureType;
   }

   public RelationVO getRelation()
   {
      return this.relation;
   }

   public void setRelation(RelationVO relation)
   {
      this.relation = relation;
   }

   public String getRelationID()
   {
      return this.relationID;
   }

   public void setRelationID(String relationID)
   {
      this.relationID = relationID;
   }

   /**
    * <p>规则类型 1 -- DATE 日期类型 2 -- CODE 代码类型 3 -- CONST常量</p>
    * @return int
    */
   public int getRuleType()
   {
      return this.ruleType;
   }

   /**
    * <p>规则类型 1 -- DATE 日期类型 2 -- CODE 代码类型 3 -- CONST常量</p>
    * @param ruleType int
    */
   public void setRuleType(int ruleType)
   {
      this.ruleType = ruleType;
   }

   /**
    * <p>度量汇总性质类型 G -- 全加型 H -- 半加型</p>
    * @return String
    */
   public String getSumStyle()
   {
      return this.sumStyle;
   }

   /**
    *  <p>度量汇总性质类型 G -- 全加型 H -- 半加型</p>
    * @param sumStyle String
    */
   public void setSumStyle(String sumStyle)
   {
      this.sumStyle = sumStyle;
   }

   public int getVirtualFact()
   {
      return this.virtualFact;
   }

   public void setVirtualFact(int virtualFact)
   {
      this.virtualFact = virtualFact;
   }

   public List<MemberVO> getMeasureMember()
   {
      return this.MeasureMember;
   }

   public void setMeasureMember(List<MemberVO> measureMember)
   {
      this.MeasureMember = measureMember;
   }

}
