package com.ccssoft.rsas.metadata.cube.model;

import java.io.Serializable;
import java.util.List;

import com.ccssoft.rsas.metadata.cubedefine.model.CubeDefineVO;
import com.ccssoft.rsas.metadata.fieldobject.model.FieldsVO;
import com.ccssoft.rsas.metadata.link.model.LinkVO;
import com.ccssoft.rsas.metadata.relation.model.RelationVO;
import com.ccssoft.rsas.metadata.table.model.TableVO;



/**
 * <p>标题:报表工具元数据对象</p> 
 * <p>描述：立方元数据对象</p> 
 * <p>版权: Copyright (c) 2007 </p>
 * <p>公司: 广州瑞达通信技术有限公司</p>
 * @version 1.0
 * @author 曾俊佳
 */
public class CubeVO implements Serializable
{

   private static final long serialVersionUID = 1L;

   private String ID; //立方ID
   private String name; //立方名称
   private String desc; //立方描述
   private String linkID; //描述
   private String relationID;//关联关系ID
   private List<CubeDefineVO> CubeDefines; //立方定义
   private LinkVO link; //数据库连接信息
   private RelationVO relation; //关联关系信息
   private List<TableVO> tables;//引数据库的表
   private List<FieldsVO> fields;// 域对象集合
   private List measureTables ;//度量table集合
   
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

   public String getDesc()
   {
      return this.desc;
   }

   public void setDesc(String desc)
   {
      this.desc = desc;
   }

   public String getID()
   {
      return this.ID;
   }

   public void setID(String id)
   {
      this.ID = id;
   }

   public String getLinkID()
   {
      return this.linkID;
   }

   public void setLinkID(String linkID)
   {
      this.linkID = linkID;
   }

   public String getName()
   {
      return this.name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public List getCubeDefines()
   {
      return this.CubeDefines;
   }

   public void setCubeDefines(List cubeDefines)
   {
      this.CubeDefines = cubeDefines;
   }

   public LinkVO getLink()
   {
      return this.link;
   }

   public void setLink(LinkVO link)
   {
      this.link = link;
   }

   public List getTables()
   {
      return tables;
   }

   public void setTables(List tables)
   {
      this.tables = tables;
   }

   public List getFields()
   {
      return fields;
   }

   public void setFields(List fields)
   {
      this.fields = fields;
   }

   public List getMeasureTables()
   {
      return measureTables;
   }

   public void setMeasureTables(List measureTables)
   {
      this.measureTables = measureTables;
   }

}
