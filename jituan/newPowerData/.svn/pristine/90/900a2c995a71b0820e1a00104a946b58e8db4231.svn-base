package com.ccssoft.rsas.metadata.cubedefine.model;

/**
 * <p>标题:报表工具元数据对象</p> 
 * <p>描述：立方定义元数据对象</p> 
 * <p>版权: Copyright (c) 2007 </p>
 * <p>公司: 广州瑞达通信技术有限公司</p>
 * @version 1.0
 * @author 曾俊佳
 */
import java.io.Serializable;

import com.ccssoft.rsas.metadata.dimension.model.DimensionVO;
import com.ccssoft.rsas.metadata.fieldobject.model.FieldObjectVO;
import com.ccssoft.rsas.metadata.measure.model.MeasureVO;

public class CubeDefineVO implements Serializable
{
   private static final long serialVersionUID = 1L;
   private String cubeDefineID; //立方定义ID
   private String cubeID; //立方ID
   private String ObjectType; //使用的对象的类型: D  -- 维度 M -- 度量
   private String ObjectID; //使用的对象ID
   private int defineOrder; //序号
   private String desc; //描述
   private DimensionVO demensionvo;// 维度对象 --根据使用对象类型赋值
   private MeasureVO mesurevo; // 维度对象 --根据使用对象类型赋值
   private FieldObjectVO  fieldObjVO; //域对象

   public String getCubeDefineID()
   {
      return cubeDefineID;
   }

   public void setCubeDefineID(String cubeDefineID)
   {
      this.cubeDefineID = cubeDefineID;
   }

   public String getCubeID()
   {
      return cubeID;
   }

   public void setCubeID(String cubeID)
   {
      this.cubeID = cubeID;
   }

   public String getDesc()
   {
      return desc;
   }

   public void setDesc(String desc)
   {
      this.desc = desc;
   }

   public String getObjectID()
   {
      return ObjectID;
   }

   public void setObjectID(String objectID)
   {
      ObjectID = objectID;
   }

   public int getDefineOrder()
   {
      return this.defineOrder;
   }

   public void setDefineOrder(int defineOrder)
   {
      this.defineOrder = defineOrder;
   }

   /**
    * <p>使用的对象的类型: D  -- 维度 M -- 度量</p>
    * @return String
    */
   public String getObjectType()
   {
      return ObjectType;
   }

   /**
    * <p>使用的对象的类型: D  -- 维度 M -- 度量</p>
    * @param objectType String
    */
   public void setObjectType(String objectType)
   {
      ObjectType = objectType;
   }

   public DimensionVO getDemensionvo()
   {
      return this.demensionvo;
   }

   public void setDemensionvo(DimensionVO demensionvo)
   {
      this.demensionvo = demensionvo;
   }

   public MeasureVO getMesurevo()
   {
      return this.mesurevo;
   }

   public void setMesurevo(MeasureVO mesurevo)
   {
      this.mesurevo = mesurevo;
   }

   public FieldObjectVO getFieldObjVO()
   {
      return fieldObjVO;
   }

   public void setFieldObjVO(FieldObjectVO fieldObjVO)
   {
      this.fieldObjVO = fieldObjVO;
   }

   
}
