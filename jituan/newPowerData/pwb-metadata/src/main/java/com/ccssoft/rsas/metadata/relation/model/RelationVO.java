package com.ccssoft.rsas.metadata.relation.model;

import java.io.Serializable;
import java.util.List;

import com.ccssoft.rsas.metadata.relationitem.model.RelationItemVO;

/**
 * <p>标题:报表工具元数据对象</p> 
 * <p>描述：报表过滤条件之间的关系描述元数据对象</p> 
 * <p>版权: Copyright (c) 2007 </p>
 * <p>公司: 广州瑞达通信技术有限公司</p>
 * @version 1.0
 * @author 曾俊佳
 */
public class RelationVO implements Serializable
{

   private static final long serialVersionUID = 1L;

   private String relationID;//关联关系ID
   private String ownerObjID;//所属对象ID
   private String ownerObjType;//对象类型分别为:D--维对象 M--度量对象 C--立方 B--成员 P--属性 Q--查询 I--查询元素 L--结论对象 T--指标对象 W--预警
   private String desc;//备注

   private List<RelationItemVO> RelationItems;//关联关系内容

   public String getDesc()
   {
      return this.desc;
   }

   public void setDesc(String desc)
   {
      this.desc = desc;
   }

   /**
    * @param ownerObjID String 对象类型分别为：D--维对象 M--度量对象 C--立方 B--成员 P--属性 Q--查询 I--查询元素
    */
   public String getOwnerObjType()
   {
      return this.ownerObjType;
   }

   /**
    * <p>对象类型分别为：D--维对象 M--度量对象 C--立方 B--成员 P--属性 Q--查询 I--查询元素</p>
    * @return String
    */
   public void setOwnerObjType(String ownerObjType)
   {
      this.ownerObjType = ownerObjType;
   }

   public String getRelationID()
   {
      return this.relationID;
   }

   public void setRelationID(String relationID)
   {
      this.relationID = relationID;
   }

  
   public String getOwnerObjID()
   {
      return this.ownerObjID;
   }

   public void setOwnerObjID(String ownerObjID)
   {
      this.ownerObjID = ownerObjID;
   }

   public List<RelationItemVO> getRelationItems()
   {
      return this.RelationItems;
   }

   public void setRelationItems(List<RelationItemVO> relationItems)
   {
      this.RelationItems = relationItems;
   }

}
