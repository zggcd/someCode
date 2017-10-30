package com.ccssoft.rsas.metadata.fieldobject.model;

import java.io.Serializable;

import com.ccssoft.rsas.metadata.cube.model.CubeVO;
import com.ccssoft.rsas.metadata.link.model.LinkVO;

/**
 * <p>����:���ͳ�Ʒ���ϵͳԪ���ݶ���</p> 
 * <p>�������������Ϣ��ͼ����</p> 
 * <p>��Ȩ: Copyright (c) 2007 </p>
 * <p>��˾: �������ͨ�ż������޹�˾</p>
 * @version 1.0
 * @author ������
 */
public class FieldObjectVO implements Serializable
{

   private static final long serialVersionUID = 1L;

   private String fieldID;//  �����ID
   private String fieldObjectName;//   ��������� 
   private String linkID;//   ��������ԴID 
   private String cubeID;//   ��������ID
   private String tableName;//   ��ʹ�õı��� 
   private String tableCaption;//   ��ʹ�õı�������
   private String fieldType;//   ��������� D--ά���� M--������ T--��SQL�Զ����ɵ��򣬲��ڿ������ʾ
   private String fieldName;//   �ֶ���
   private String dataType;//   �ֶ���������   C--�ַ��� N--��ֵ��  D--������
   private String filter;//   �������� 
   private String desc;//   ���� 
   
   private LinkVO link ;// ���ݿ�������Ϣ
   private CubeVO cube; //����������Ϣ
   
   public String getCubeID()
   {
      return cubeID;
   }

   public void setCubeID(String cubeID)
   {
      this.cubeID = cubeID;
      if(this.cubeID == null) this.cubeID = "";
   }

   /**
    * <p>�ֶ���������   C--�ַ��� N--��ֵ��  D--������</p>
    * @return String
    */
   public String getDataType()
   {
      return dataType;
   }

   /**
    * <p>�ֶ���������   C--�ַ��� N--��ֵ��  D--������</p>
    * @param dataType String
    */
   public void setDataType(String dataType)
   {
      this.dataType = dataType;
      if(this.dataType == null) this.dataType = "";
   }

   public String getDesc()
   {
      return desc;
   }

   public void setDesc(String desc)
   {
      this.desc = desc;
   }

   public String getFieldID()
   {
      return fieldID;
   }

   public void setFieldID(String fieldID)
   {
      this.fieldID = fieldID;
      if(this.fieldID == null) this.fieldID = "";
   }

   public String getFieldName()
   {
      return fieldName;
   }

   public void setFieldName(String fieldName)
   {
      this.fieldName = fieldName;
      if(this.fieldName == null) this.fieldName = "";
   }

   /**
    *<p> ��������� D--ά���� M--������ T--��SQL�Զ����ɵ��򣬲��ڿ������ʾ</p>
    * @return String
    */
   public String getFieldType()
   {
      return fieldType;
   }

   /**
    * <p> ��������� D--ά���� M--������ T--��SQL�Զ����ɵ��򣬲��ڿ������ʾ</p>
    * @param fieldType String
    */
   public void setFieldType(String fieldType)
   {
      this.fieldType = fieldType;
      if(this.fieldType == null) this.fieldType = "";
   }

   public String getFilter()
   {
      return filter;
   }

   public void setFilter(String filter)
   {
      this.filter = filter;
      if(this.filter == null) this.filter = "";
   }

   public String getLinkID()
   {
      return linkID;
   }

   public void setLinkID(String linkID)
   {
      this.linkID = linkID;
      if(this.linkID == null) this.linkID = "";
   }

   public String getFieldObjectName()
   {
      return fieldObjectName;
   }

   public void setFieldObjectName(String fieldObjectName)
   {
      this.fieldObjectName = fieldObjectName;
      if(this.fieldObjectName == null) this.fieldObjectName = "";
   }

   public String getTableCaption()
   {
      return tableCaption;
   }

   public void setTableCaption(String tableCaption)
   {
      this.tableCaption = tableCaption;
      if(this.tableCaption == null) this.tableCaption = "";
   }

   public String getTableName()
   {
      return tableName;
   }

   public void setTableName(String tableName)
   {
      this.tableName = tableName;
      if(this.tableName == null) this.tableName = "";
   }

   public CubeVO getCube()
   {
      return cube;
   }

   public void setCube(CubeVO cube)
   {
      this.cube = cube;
   }

   public LinkVO getLink()
   {
      return link;
   }

   public void setLink(LinkVO link)
   {
      this.link = link;
   }

}
