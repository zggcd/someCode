 package com.ccssoft.rsas.metadata.filter.model;

import java.io.Serializable;

import com.ccssoft.rsas.metadata.sqlfunction.model.SQLFunctionVO;



/**
 * <p>����:������Ԫ���ݶ���</p> 
 * <p>�����������������Ԫ���ݶ���</p> 
 * <p>��Ȩ: Copyright (c) 2007 </p>
 * <p>��˾: �������ͨ�ż������޹�˾</p>
 * @version 1.0
 * @author ������
 */
public class FilterVO implements Serializable
{

   private static final long serialVersionUID = 1L;
   private String filterID;       //��������ID   
   private String filterName;     //������������
   private String dataType;       //���������������� C -- �ַ���N -- ��ֵ�� D -- ������
   private int    leftFilterType; //��߹����������� 0--OPER �ֹ���д������  1--FLD �����ֶ� 2--FUNC ���ú��� 3 -- ������having 4--���۹���fltRule
   private String leftOwner;      //���������
   private String leftOper;       //��߲�����
   private String leftFuncID;     //������ú���ID
   private String leftParams;     //��ߺ����������ʽ
   private String leftDesc;       //����ʽ����
   private int    operSymbol;     //��ϵ������
   private int    rightFilterType;//�ұ߹�����������
   private String rightOwner;     //�ұ�������
   private String rightOper;      //�ұ߲�����
   private String rightFuncID;    //�ұ����ú���ID
   private String rightParams;    //�ұߺ����������ʽ
   private String rightDesc;      //�ұ��ʽ����
   private String expression;     //���ʽ
   private String expressDesc;    //���ʽ����
   
   private SQLFunctionVO leftFunctionvo;//
   private SQLFunctionVO rightFunctionvo;//

   public String getExpressDesc()
   {
     if(this.expressDesc == null)  this.expressDesc = "";
       
     return this.expressDesc;
   }

   public void setExpressDesc(String expressDesc)
   {
      this.expressDesc = expressDesc;
   }

   public String getExpression()
   {
      if(this.expression == null) this.expression = "";
      return this.expression;
   }

   public void setExpression(String expression)
   {
      this.expression = expression;
   }

   public String getFilterID()
   {
      if(this.filterID == null) this.filterID = "";
      return this.filterID;
   }

   public void setFilterID(String filterID)
   {
      this.filterID = filterID;
   }

   public String getFilterName()
   {
      if(this.filterName == null) this.filterName = "";
      return this.filterName;
   }

   public void setFilterName(String filterName)
   {
      this.filterName = filterName;
   }

   public String getLeftDesc()
   {
      if(this.leftDesc == null) this.leftDesc = "";
      return this.leftDesc;
   }

   public void setLeftDesc(String leftDesc)
   {
      this.leftDesc = leftDesc;
   }

   /**
    * <p>��߹����������� 0--OPER �ֹ���д������  1--FLD �����ֶ� 2--FUNC ���ú��� 3 -- ������having</p>
    * @return int
    */
   public int getLeftFilterType()
   {
      
      return this.leftFilterType;
   }

   /**
    * <p>��߹����������� 0--OPER �ֹ���д������  1--FLD �����ֶ� 2--FUNC ���ú���</p>
    * @param leftFilterType int
    */
   public void setLeftFilterType(int leftFilterType)
   {
      this.leftFilterType = leftFilterType;
   }

   public String getLeftFuncID()
   {
      if(this.leftFuncID == null) this.leftFuncID = "";
      return this.leftFuncID;
   }

   public void setLeftFuncID(String leftFuncID)
   {
      this.leftFuncID = leftFuncID;
   }

   public String getLeftOper()
   {
      if(this.leftOper == null) this.leftOper = "";
      return this.leftOper;
   }

   public void setLeftOper(String leftOper)
   {
      this.leftOper = leftOper;
   }

   public String getLeftOwner()
   {
      if(this.leftOwner == null) this.leftOwner = "";
      return this.leftOwner;
   }

   public void setLeftOwner(String leftOwner)
   {
      
      this.leftOwner = leftOwner;
   }

   public String getLeftParams()
   {
      if(this.leftParams == null) this.leftParams = "";
      return this.leftParams;
   }

   public void setLeftParams(String leftParams)
   {
      this.leftParams = leftParams;
   }

   public int getOperSymbol()
   {
      return this.operSymbol;
   }

   public void setOperSymbol(int operSymbol)
   {
      this.operSymbol = operSymbol;
   }

   public String getRightDesc()
   {
      if(this.rightDesc == null) this.rightDesc = "";
      return this.rightDesc;
   }

   public void setRightDesc(String rightDesc)
   {
      this.rightDesc = rightDesc;
   }

   public int getRightFilterType()
   {
      return this.rightFilterType;
   }

   public void setRightFilterType(int rightFilterType)
   {
      this.rightFilterType = rightFilterType;
   }

   public String getRightFuncID()
   {
      if(this.rightFuncID == null) this.rightFuncID = "";
      return this.rightFuncID;
   }

   public void setRightFuncID(String rightFuncID)
   {
      this.rightFuncID = rightFuncID;
   }

   public String getRightOper()
   {
      if(this.rightOper == null) this.rightOper = "";
      return this.rightOper;
   }

   public void setRightOper(String rightOper)
   {
      
      this.rightOper = rightOper;
   }

   public String getRightOwner()
   {
      if(this.rightOwner == null) this.rightOwner = "";
      return this.rightOwner;
   }

   public void setRightOwner(String rightOwner)
   {
      this.rightOwner = rightOwner;
   }

   public String getRightParams()
   {
      if(this.rightParams == null) this.rightParams = "";
      return this.rightParams;
   }

   public void setRightParams(String rightParams)
   {
      this.rightParams = rightParams;
   }

   public SQLFunctionVO getLeftFunctionvo()
   {
      return this.leftFunctionvo;
   }

   public void setLeftFunctionvo(SQLFunctionVO leftFunctionvo)
   {
      
      this.leftFunctionvo = leftFunctionvo;
   }

   public SQLFunctionVO getRightFunctionvo()
   {
  
      return this.rightFunctionvo;
   }

   public void setRightFunctionvo(SQLFunctionVO rightFunctionvo)
   {
      this.rightFunctionvo = rightFunctionvo;
   }
  
   /**
    * <p>���������������� C -- �ַ���N -- ��ֵ�� D -- ������</p>
    * @return String 
    */
   public String getDataType()
   {
      return dataType;
   }

   /**
    * <p>���������������� C -- �ַ���N -- ��ֵ�� D -- ������</p>
    * @param dataType String
    */
   public void setDataType(String dataType)
   {
      this.dataType = dataType;
   }

}
