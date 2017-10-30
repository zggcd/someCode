package com.ccssoft.rsas.metadata.funcparams.model;

import java.io.Serializable;

/**
 * <p>标题:报表工具元数据对象</p> 
 * <p>描述：函数参数元数据对象</p> 
 * <p>版权: Copyright (c) 2007 </p>
 * <p>公司: 广州瑞达通信技术有限公司</p>
 * @version 1.0
 * @author 曾俊佳
 */
public class FuncParamsVO implements Serializable
{

   private static final long serialVersionUID = 1L;
   public String functionID; //所属函数ID
   public int paramsNO; //参数序号
   public String dataType; //参数的数据类型
   public String desc; //描述
   public String linkID;//数据据连接ID
   public String objectType;
	
   public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

   public String getDataType()
   {
      return dataType;
   }

   public void setDataType(String dataType)
   {
      this.dataType = dataType;
   }

   public String getDesc()
   {
      return desc;
   }

   public void setDesc(String desc)
   {
      this.desc = desc;
   }

   public String getFunctionID()
   {
      return functionID;
   }

   public void setFunctionID(String functionID)
   {
      this.functionID = functionID;
   }

   public String getLinkID()
   {
      return linkID;
   }

   public void setLinkID(String linkID)
   {
      this.linkID = linkID;
   }

   public int getParamsNO()
   {
      return paramsNO;
   }

   public void setParamsNO(int paramsNO)
   {
      this.paramsNO = paramsNO;
   }

}
