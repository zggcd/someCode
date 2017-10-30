package com.ccssoft.rsas.metadata.sqlfunction.model;

import java.io.Serializable;
import java.util.List;

import com.ccssoft.rsas.metadata.funcparams.model.FuncParamsVO;

/**
 * <p>����:������Ԫ���ݶ���</p> 
 * <p>������ϵͳ����Ԫ����vO����</p> 
 * <p>��Ȩ: Copyright (c) 2007 </p>
 * <p>��˾: �������ͨ�ż������޹�˾</p>
 * @version 1.0
 * @author ������
 */
public class SQLFunctionVO implements Serializable
{

   private static final long serialVersionUID = 1L;
   private String functionID; //����ID
   private String funcName; //��������
   private String funcExpress; //�������ʽ
   private String funcCategory; //�������� C--�ַ������� M--��ѧ���� S--�ۺϺ��� D--���ں��� T--ϵͳת������
   private String funcType; //�������� S--ϵͳ��Ƕ�ĺ�������� U--�û��Զ���ĺ��������
   private int paramsCount; //�������еĲ�������
   private String className; //����������Ľ�������
   private String oracleExp; //Oracle�µı��ʽ
   private String sqlServerExp; //SQLServer�µı��ʽ
   private String db2Exp; //db2�µı��ʽ
   private String sybaseExp; //sybase�µı��ʽ
   private String informixExp; //informix�µı��ʽ
   private String desc;
   private List<FuncParamsVO> FuncParams; //������������

   public String getClassName()
   {
      return className;
   }

   public void setClassName(String className)
   {
      this.className = className;
   }

   public String getDb2Exp()
   {
      return db2Exp;
   }

   public void setDb2Exp(String db2Exp)
   {
      this.db2Exp = db2Exp;
   }

   public String getDesc()
   {
      return desc;
   }

   public void setDesc(String desc)
   {
      this.desc = desc;
   }

   /**
    * <p>�������� C--�ַ������� M--��ѧ���� S--�ۺϺ��� D--���ں��� T--ϵͳת������</p>
    * @return String
    */
   public String getFuncCategory()
   {
      return funcCategory;
   }

   /**
    * <p>�������� C--�ַ������� M--��ѧ���� S--�ۺϺ��� D--���ں��� T--ϵͳת������</p>
    * @param funcCategory String
    */
   public void setFuncCategory(String funcCategory)
   {
      this.funcCategory = funcCategory;
   }

   public String getFuncExpress()
   {
      return funcExpress;
   }

   public void setFuncExpress(String funcExpress)
   {
      this.funcExpress = funcExpress;
   }

   public String getFuncName()
   {
      return funcName;
   }

   public void setFuncName(String funcName)
   {
      this.funcName = funcName;
   }

   public String getFunctionID()
   {
      return functionID;
   }

   public void setFunctionID(String functionID)
   {
      this.functionID = functionID;
   }

   /**
    * <p>�������� S--ϵͳ��Ƕ�ĺ�������� U--�û��Զ���ĺ��������</p>
    * @return String
    */
   public String getFuncType()
   {
      return funcType;
   }

   /**
    * <p>�������� S--ϵͳ��Ƕ�ĺ�������� U--�û��Զ���ĺ��������</p>
    * @param funcType String
    */
   public void setFuncType(String funcType)
   {
      this.funcType = funcType;
   }

   public String getInformixExp()
   {
      return informixExp;
   }

   public void setInformixExp(String informixExp)
   {
      this.informixExp = informixExp;
   }

   public String getOracleExp()
   {
      return oracleExp;
   }

   public void setOracleExp(String oracleExp)
   {
      this.oracleExp = oracleExp;
   }

   public int getParamsCount()
   {
      return paramsCount;
   }

   public void setParamsCount(int paramsCount)
   {
      this.paramsCount = paramsCount;
   }

   public String getSqlServerExp()
   {
      return sqlServerExp;
   }

   public void setSqlServerExp(String sqlServerExp)
   {
      this.sqlServerExp = sqlServerExp;
   }

   public String getSybaseExp()
   {
      return sybaseExp;
   }

   public void setSybaseExp(String sybaseExp)
   {
      this.sybaseExp = sybaseExp;
   }

   public List<FuncParamsVO> getFuncParams()
   {
      return this.FuncParams;
   }

   public void setFuncParams(List<FuncParamsVO> funcParams)
   {
      this.FuncParams = funcParams;
   }

}
