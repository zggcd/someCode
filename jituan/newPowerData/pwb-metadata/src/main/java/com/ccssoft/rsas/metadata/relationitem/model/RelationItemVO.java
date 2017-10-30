package com.ccssoft.rsas.metadata.relationitem.model;

import java.io.Serializable;

import com.ccssoft.rsas.metadata.filter.model.FilterVO;


/**
 * <p>����:���ͳ�Ʒ���ϵͳԪ����ģ��</p> 
 * <p>����:������ϵ����vo����</p> 
 * <p>��Ȩ: Copyright (c) 2007 </p>
 * <p>��˾: �������ͨ�ż������޹�˾</p>
 * &version 1.0
 * &author ������
 */

public class RelationItemVO implements Serializable
{

   private static final long serialVersionUID = 1L;
   private String relationItemID; //������ϵԪ��ID
   private String relationID; //������ϵID
   private String parentItemID; //��ϵԪ�ظ�ID
   private String itemType; //������ϵ����    F -- �������� S -- �߼����� C -- ������

   private String filterID; //���õĹ�������ID
   private String logicSymbol; //�߼���ϵ���� AND --�߼���  OR --�߼��� 
   private int itemOrder; //�����������
   private String expression; //�������ʽ
   private String expressDesc;//���ʽ����
   private int level; //�����������ڵĲ�

   private FilterVO filtervo; //������������
   
   /**
    * <p>�������ʽ</p>
    * @return String
    */
   public String getExpression()
   {
      if(this.expression == null) this.expression = "";
      return this.expression;
   }
   
   /**
    * <p>�������ʽ</p>
    * @param expression String
    */
   public void setExpression(String expression)
   {
     
      this.expression = expression;
   }

   public String getFilterID()
   {
      return this.filterID;
   }

   public void setFilterID(String filterID)
   {
      this.filterID = filterID;
   }

   public int getItemOrder()
   {
      return this.itemOrder;
   }

   public void setItemOrder(int itemOrder)
   {
      this.itemOrder = itemOrder;
   }

   /**
    *  <p>������ϵ����    F -- �������� S -- �߼����� C -- ������</p>
    * @return String
    */
   public String getItemType()
   {
      return this.itemType;
   }

   /**
    * <p>������ϵ����    F -- �������� S -- �߼����� C -- ������</p>
    * @param itemType String
    */
   public void setItemType(String itemType)
   {
      this.itemType = itemType;
   }
   
   /**
    * <p>�����������ڵĲ�</p>
    * @return int
    */
   public int getLevel()
   {
      return this.level;
   }
   
   /**
    * <p>�����������ڵĲ�</p>
    * @param level int
    */
   public void setLevel(int level)
   {
      this.level = level;
   }

   /**
    * <p>�߼���ϵ���� AND --�߼���  OR --�߼��� </p>
    * @return String
    */

   public String getLogicSymbol()
   {
      return this.logicSymbol;
   }

   /**
    * <p>�߼���ϵ���� AND --�߼���  OR --�߼��� </p>
    * @param logicSymbol String
    */
   public void setLogicSymbol(String logicSymbol)
   {
      this.logicSymbol = logicSymbol;
   }

   public String getParentItemID()
   {
      if(this.parentItemID == null) this.parentItemID = "";
      return this.parentItemID;
   }

   public void setParentItemID(String parentItemID)
   {
      this.parentItemID = parentItemID;
   }

   public String getRelationID()
   {
      if(this.relationID == null) this.relationID = "";
      return this.relationID;
   }

   public void setRelationID(String relationID)
   {
      this.relationID = relationID;
   }

   public String getRelationItemID()
   {
      return this.relationItemID;
   }

   public void setRelationItemID(String relationItemID)
   {
      this.relationItemID = relationItemID;
   }

   public FilterVO getFiltervo()
   {
      return this.filtervo;
   }

   public void setFiltervo(FilterVO filtervo)
   {
      this.filtervo = filtervo;
   }

   public String getExpressDesc()
   {
      if(this.expressDesc == null) this.expressDesc = "";
      return this.expressDesc;
   }

   public void setExpressDesc(String expressDesc)
   {
      this.expressDesc = expressDesc;
   }

}
