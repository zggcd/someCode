package com.ccssoft.rsas.metadata.publish.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ccssoft.rsas.metadata.condition.model.ConditionVO;
import com.ccssoft.rsas.metadata.publishprocparams.model.PublishProcParamsVO;


/**
 * <p>����:������Ԫ���ݶ���</p> 
 * <p>����:������������VO����</p> 
 * <p>��Ȩ: Copyright (c) 2007 </p>
 * <p>��˾: �������ͨ�ż������޹�˾</p>
 * &version 1.0
 * &author ������
 */
public class PublishConditionVO implements Serializable
{

   private static final long serialVersionUID = 1L;

   private String publishConditionID;//��������ID
   private String publishID;//������ͼID
   private String conditionID;//ɸѡ����ID
   private int startRow;//�������ڿ�ʼ��
   private int startCol;//�������ڿ�ʼ��
   private int endRow;//�������ڽ�����
   private int endCol;//�������ڽ�����
   private int columnWidth;//���������еĿ�Ȱٷֱ�
   private int labCellCount;//������ǩ��ռ�ĵ�Ԫ����
   private int prerequisite;//�Ƿ��ѡ����
   private int isCommonUse; //�Ƿ�������
   private String searchKind;//���ҷ�ʽ E -- ��ȷ����  B -- ģ������  LB -- ��ģ��  RB -- ��ģ��  IN -- ����
   private int   controlOrder;//�ؼ��ڵ�Ԫ���е����
   private int intervalCell;//����ˮƽ�ڷż������
   private List conditions;//��ѯ��������
   private List BindParamList;//�󶨲�����
   private List conditionDetails ;//����Ĭ��ֵ
   private int isMultiSelect;//�Ƿ��ѡ����
   
   public List getConditionDetails()
   {
      return conditionDetails;
   }

   public void setConditionDetails(List conditionDetails)
   {
      this.conditionDetails = conditionDetails;
   }

   public List getBindParamList()
   {
      return BindParamList;
   }

   public void setBindParamList(List bindParamList)
   {
      BindParamList = bindParamList;
   }

   public List getConditions()
   {
      return conditions;
   }

   public void setConditions(List conditions)
   {
      this.conditions = conditions;
   }

   public int getLabCellCount()
   {
      return labCellCount;
   }

   public void setLabCellCount(int labCellCount)
   {
      this.labCellCount = labCellCount;
   }

   public int getColumnWidth()
   {
      return columnWidth;
   }

   public void setColumnWidth(int columnWidth)
   {
      this.columnWidth = columnWidth;
   }

   public String getConditionID()
   {
      return conditionID;
   }

   public void setConditionID(String conditionID)
   {
      this.conditionID = conditionID;
   }

   public int getEndCol()
   {
      return endCol;
   }

   public void setEndCol(int endCol)
   {
      this.endCol = endCol;
   }

   public int getEndRow()
   {
      return endRow;
   }

   public void setEndRow(int endRow)
   {
      this.endRow = endRow;
   }

   public int getPrerequisite()
   {
      return prerequisite;
   }

   public void setPrerequisite(int prerequisite)
   {
      this.prerequisite = prerequisite;
   }

   public String getPublishConditionID()
   {
      return publishConditionID;
   }

   public void setPublishConditionID(String publishConditionID)
   {
      this.publishConditionID = publishConditionID;
   }

   public String getPublishID()
   {
      return publishID;
   }

   public void setPublishID(String publishID)
   {
      this.publishID = publishID;
   }

   /**
    * <p> E -- ��ȷ����  B -- ģ������  LB -- ��ģ��  RB -- ��ģ��  IN -- ����</p>
    * @return String
    */
   public String getSearchKind()
   {
      if(this.searchKind==null)
         searchKind="";
      return searchKind;
   }

   /**
    * <p> E -- ��ȷ����  B -- ģ������  LB -- ��ģ��  RB -- ��ģ��  IN -- ����</p>
    * @param searchKind String
    */
   public void setSearchKind(String searchKind)
   {
      this.searchKind = searchKind;
   }

   public int getStartCol()
   {
      return startCol;
   }

   public void setStartCol(int startCol)
   {
      this.startCol = startCol;
   }

   public int getStartRow()
   {
      return startRow;
   }

   public void setStartRow(int startRow)
   {
      this.startRow = startRow;
   }

   public int getIsCommonUse()
   {
      return isCommonUse;
   }

   public void setIsCommonUse(int isCommonUse)
   {
      this.isCommonUse = isCommonUse;
   }
   
   public int getControlOrder()
   {
      return controlOrder;
   }

   public void setControlOrder(int controlOrder)
   {
      this.controlOrder = controlOrder;
   }

   public int getIntervalCell()
   {
      return intervalCell;
   }

   public void setIntervalCell(int intervalCell)
   {
      this.intervalCell = intervalCell;
   }

   public int getIsMultiSelect()
   {
      return isMultiSelect;
   }

   public void setIsMultiSelect(int isMultiSelect)
   {
      this.isMultiSelect = isMultiSelect;
   }
   /**
    * ����ConditionID��ȡ��Ӧ��ConditionDetailVO
    * @param conID
    * @return
    *���� 2010-06-09
    */
   public ConditionDetailVO getConditionDetailVO(String conID){
	   ConditionDetailVO result =null;
	   for (int i =0;getConditionDetails()!=null && i<getConditionDetails().size();i++){
		   ConditionDetailVO conDet =(ConditionDetailVO) getConditionDetails().get(i);
		   if (conDet.getConditionID().equalsIgnoreCase(conID)){
			   result =conDet;
			   break;
		   }
	   }
	   return result;
   }
   /**
    * ����ConditionID��ȡ��Ӧ��ConditionVO
    * @param conID
    * @return
    *���� 2010-06-09
    */
   public ConditionVO getConditionVO(String conID){
	   ConditionVO result =null;
	   for (int i =0;getConditions()!=null && i<getConditions().size();i++){
		   ConditionVO con =(ConditionVO) getConditions().get(i);
		   if (con.getConditionID().equalsIgnoreCase(conID)){
			   result =con;
			   break;
		   }
	   }
	   return result;
   }
   
   /**
    * ����ConditionID��ȡ��Ӧ��PublishProcParamsVO
    * @param conID
    * @return
    *���� 2010-06-09
    */
   
   public PublishProcParamsVO getPublishProcParamsVO(String conID){

	   PublishProcParamsVO result =null;
	   for (int i =0;getBindParamList()!=null && i<getBindParamList().size();i++){
		   PublishProcParamsVO param =(PublishProcParamsVO) getBindParamList().get(i);
		   if (param.getConditionID().equalsIgnoreCase(conID)){
			   result =param;
			   break;
		   }
	   }
	   return result;
   
   }
   
   /**
    * ����ConditionID��ȡ��Ӧ��PublishProcParamsVO
    * @param conID
    * @return
    *���� 2010-06-09
    */
   
   public List<PublishProcParamsVO> getListPublishProcParamsVO(String conID){

	   List<PublishProcParamsVO> result =new ArrayList<PublishProcParamsVO>();
	   for (int i =0;getBindParamList()!=null && i<getBindParamList().size();i++){
		   PublishProcParamsVO param =(PublishProcParamsVO) getBindParamList().get(i);
		   if (param.getConditionID().equalsIgnoreCase(conID)){
			   result.add(param) ;
		   }
	   }
	   return result;
   
   }

}
