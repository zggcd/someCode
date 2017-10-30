package com.ccssoft.rsas.metadata.relation.model;

import java.io.Serializable;
import java.util.List;

import com.ccssoft.rsas.metadata.relationitem.model.RelationItemVO;

/**
 * <p>����:������Ԫ���ݶ���</p> 
 * <p>�����������������֮��Ĺ�ϵ����Ԫ���ݶ���</p> 
 * <p>��Ȩ: Copyright (c) 2007 </p>
 * <p>��˾: �������ͨ�ż������޹�˾</p>
 * @version 1.0
 * @author ������
 */
public class RelationVO implements Serializable
{

   private static final long serialVersionUID = 1L;

   private String relationID;//������ϵID
   private String ownerObjID;//��������ID
   private String ownerObjType;//�������ͷֱ�Ϊ:D--ά���� M--�������� C--���� B--��Ա P--���� Q--��ѯ I--��ѯԪ�� L--���۶��� T--ָ����� W--Ԥ��
   private String desc;//��ע

   private List<RelationItemVO> RelationItems;//������ϵ����

   public String getDesc()
   {
      return this.desc;
   }

   public void setDesc(String desc)
   {
      this.desc = desc;
   }

   /**
    * @param ownerObjID String �������ͷֱ�Ϊ��D--ά���� M--�������� C--���� B--��Ա P--���� Q--��ѯ I--��ѯԪ��
    */
   public String getOwnerObjType()
   {
      return this.ownerObjType;
   }

   /**
    * <p>�������ͷֱ�Ϊ��D--ά���� M--�������� C--���� B--��Ա P--���� Q--��ѯ I--��ѯԪ��</p>
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
