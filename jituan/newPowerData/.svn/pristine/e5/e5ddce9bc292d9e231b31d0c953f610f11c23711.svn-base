package com.ccssoft.rsas.metadata.publish.model;

import java.io.Serializable;

import com.ccssoft.rsas.metadata.bindalias.model.BindAliasVO;
import com.ccssoft.rsas.metadata.conditionsetvalue.model.ConditionSetValueVO;


/**
 * <p>标题:报表工具元数据对象</p> 
 * <p>描述:发布条件默认值VO对象</p> 
 * <p>版权: Copyright (c) 2007 </p>
 * <p>公司: 广州瑞达通信技术有限公司</p>
 * &version 1.0
 * &author 曾俊佳
 */
public class ConditionDetailVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String publishID; // 发布ID
	private String publishConditionID;// 发布条件ID
	private String conditionID; // 绑定的筛选条件
	private int paramOrder; // 序号
	private int isMultiSelect; // 是否多选
	private int prerequisite; // 是否必选条件
	private int groupIndex; // 是否必选的分组序号
	private String tableAlias; // 当直接SQL报表时，可以单独设置当前筛选对应表的别名
	private int isCommonUse; // 是否常用条件
	private String searchKind; // 查找方式 E -- 精确查找；B -- 模糊查找；LB -- 左模糊；RB --
								// 右模糊；IN -- 包含；EE--<=及>=；BB--
								// <及>；BE--<及>=；EB--<=及>
	private String businessCode; // 业务类型编码 BUSINESSCODE

	private java.lang.String fieldAlias; // 当直接SQL报表时，可以单独设置当前筛选对应字段的别名

	private ConditionSetValueVO consetValue;
	private BindAliasVO[] bindAlias;

	private int step; // 步长
	private String stepUnit; // 步长单位:偏移量单位，D：天；W:周；M：月；Q：季度；Y：年


   public String getBusinessCode()
   {
      return businessCode;
   }

   public void setBusinessCode(String businessCode)
   {
      this.businessCode = businessCode;
   }

   public String getConditionID()
   {
      return conditionID;
   }

   public void setConditionID(String conditionID)
   {
      this.conditionID = conditionID;
   }
   

   public int getGroupIndex()
   {
      return groupIndex;
   }

   public void setGroupIndex(int groupIndex)
   {
      this.groupIndex = groupIndex;
   }
   
   public void setTableAlias(String tableAlias)
   {   
	   this.tableAlias = tableAlias;
   }
   
   public String getTableAlias()
   {
	   return this.tableAlias;
   }

   public int getIsCommonUse()
   {
      return isCommonUse;
   }

   public void setIsCommonUse(int isCommonUse)
   {
      this.isCommonUse = isCommonUse;
   }

   public int getIsMultiSelect()
   {
      return isMultiSelect;
   }

   public void setIsMultiSelect(int isMultiSelect)
   {
      this.isMultiSelect = isMultiSelect;
   }

   public int getParamOrder()
   {
      return paramOrder;
   }

   public void setParamOrder(int paramOrder)
   {
      this.paramOrder = paramOrder;
   }

   public int getPrerequisite()
   {
      return prerequisite;
   }

   public void setPrerequisite(int prerequisite)
   {
      this.prerequisite = prerequisite;
   }

   public String getPublishConditionID()
   {
      return publishConditionID;
   }

   public void setPublishConditionID(String publishConditionID)
   {
      this.publishConditionID = publishConditionID;
   }

   public String getPublishID()
   {
      return publishID;
   }

   public void setPublishID(String publishID)
   {
      this.publishID = publishID;
   }
  
   /**
    * <p>查找方式 E -- 精确查找；B -- 模糊查找；LB -- 左模糊；RB -- 右模糊；IN -- 包含；EE--<=及>=；BB-- <及>；BE--<及>=；EB--<=及></p>
    * @return String
    */
   public String getSearchKind()
   {
      return searchKind;
   }

   /**
    * <p>查找方式 E -- 精确查找；B -- 模糊查找；LB -- 左模糊；RB -- 右模糊；IN -- 包含；EE--<=及>=；BB-- <及>；BE--<及>=；EB--<=及></p>
    * @param searchKind 
    */
   public void setSearchKind(String searchKind)
   {
      this.searchKind = searchKind;
   }

   public java.lang.String getFieldAlias() {
 	  return fieldAlias;
   }

   public void setFieldAlias(java.lang.String fieldAlias) {
	  this.fieldAlias = fieldAlias;
   }

public ConditionSetValueVO getConsetValue() {
	return consetValue;
}

public void setConsetValue(ConditionSetValueVO consetValue) {
	this.consetValue = consetValue;
}

public int getStep() {
	return step;
}

public void setStep(int step) {
	this.step = step;
}

public String getStepUnit() {
	return stepUnit;
}

	public void setStepUnit(String stepUnit) {
		this.stepUnit = stepUnit;
	}

	public BindAliasVO[] getBindAlias() {
		return bindAlias;
	}

	public void setBindAlias(BindAliasVO[] bindAlias) {
		this.bindAlias = bindAlias;
	}

}
