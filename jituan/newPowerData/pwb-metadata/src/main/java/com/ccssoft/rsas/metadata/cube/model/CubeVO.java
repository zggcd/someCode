package com.ccssoft.rsas.metadata.cube.model;

import java.io.Serializable;
import java.util.List;

import com.ccssoft.rsas.metadata.cubedefine.model.CubeDefineVO;
import com.ccssoft.rsas.metadata.fieldobject.model.FieldsVO;
import com.ccssoft.rsas.metadata.link.model.LinkVO;
import com.ccssoft.rsas.metadata.relation.model.RelationVO;
import com.ccssoft.rsas.metadata.table.model.TableVO;



/**
 * <p>����:������Ԫ���ݶ���</p> 
 * <p>����������Ԫ���ݶ���</p> 
 * <p>��Ȩ: Copyright (c) 2007 </p>
 * <p>��˾: �������ͨ�ż������޹�˾</p>
 * @version 1.0
 * @author ������
 */
public class CubeVO implements Serializable
{

   private static final long serialVersionUID = 1L;

   private String ID; //����ID
   private String name; //��������
   private String desc; //��������
   private String linkID; //����
   private String relationID;//������ϵID
   private List<CubeDefineVO> CubeDefines; //��������
   private LinkVO link; //���ݿ�������Ϣ
   private RelationVO relation; //������ϵ��Ϣ
   private List<TableVO> tables;//�����ݿ�ı�
   private List<FieldsVO> fields;// ����󼯺�
   private List measureTables ;//����table����
   
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
