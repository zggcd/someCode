package com.ccssoft.rsas.metadata.publish.model;

import java.io.Serializable;
import java.util.List;

import com.ccssoft.rsas.metadata.condition.model.ConditionVO;
import com.ccssoft.rsas.metadata.publishprocparams.model.PublishProcParamsVO;


/**
 * <p>����:������Ԫ���ݶ���</p> 
 * <p>����:��������ͼ����</p> 
 * <p>��Ȩ: Copyright (c) 2007 </p>
 * <p>��˾: �������ͨ�ż������޹�˾</p>
 * &version 1.0
 * &author ������
 */
public class PublishVO implements Serializable
{

   private static final long serialVersionUID = 1L;
   private String publishID;//������ͼID 
   private String publishName;//������ͼ����
   private String reportID;//�����ı���ID
   private int rowCount;//��������
   private int colCount;//��������
   private int cellGridSize;//�������� 0--��ϸ cllDelicate�� 1--��׼ cllStandard��2--�ַ� cllRough
   private int cellRowCount;//��Ԫ������
   private int cellColCount;//��Ԫ������
   private int pageLayout; //0--Ƕ��ʽ���� 1--���²��� 2--���Ҳ���
   private int controlLayout;//�ؼ����з�ʽ 0 ˮƽ�� 1 ��ֱ�ڷ�
   private int labelLayout;//��ǩ�ڷ���ʽ 0--ˮƽ�ڷ� 1--��ֱ�ڷ�
   private String desc;//
   private List publishConditions;//����������
   
   /**
    * <p>�������� 0--��ϸ cllDelicate�� 1--��׼ cllStandard��2--�ַ� cllRough</p>
    * @return int
    */
   public int getCellGridSize()
   {
      return cellGridSize;
   }
   
   /**
    * <p>�������� 0--��ϸ cllDelicate�� 1--��׼ cllStandard��2--�ַ� cllRough</p>
    * @param int
    */
   public void setCellGridSize(int cellGridSize)
   {
      this.cellGridSize = cellGridSize;
   }

   public int getColCount()
   {
      return colCount;
   }

   public void setColCount(int colCount)
   {
      this.colCount = colCount;
   }

   public String getDesc()
   {
      return desc;
   }

   public void setDesc(String desc)
   {
      this.desc = desc;
   }

   public List getPublishConditions()
   {
      return publishConditions;
   }

   public void setPublishConditions(List publishConditions)
   {
      this.publishConditions = publishConditions;
   }

   public String getPublishID()
   {
      return publishID;
   }

   public void setPublishID(String publishID)
   {
      this.publishID = publishID;
   }

   public String getPublishName()
   {
      return publishName;
   }

   public void setPublishName(String publishName)
   {
      this.publishName = publishName;
   }

   public String getReportID()
   {
      return reportID;
   }

   public void setReportID(String reportID)
   {
      this.reportID = reportID;
   }

   public int getRowCount()
   {
      return rowCount;
   }

   public void setRowCount(int rowCount)
   {
      this.rowCount = rowCount;
   }

   /**
    * <p>�ؼ����з�ʽ 0 ˮƽ�� 1 ��ֱ�ڷ�</p>
    * @return int
    */
   public int getControlLayout()
   {
      return controlLayout;
   }

   /**
    * <p>�ؼ����з�ʽ 0 ˮƽ�� 1 ��ֱ�ڷ�</p>
    * @param controlLayout int
    */
   public void setControlLayout(int controlLayout)
   {
      this.controlLayout = controlLayout;
   }

   /**
    * <p>0--��ǩ�ڷ���ʽ:ˮƽ�ڷ� 1--��ֱ�ڷ�</p>
    * @return int
    */
   public int getLabelLayout()
   {
      return labelLayout;
   }

   /**
    * <p>0--��ǩ�ڷ���ʽ:ˮƽ�ڷ� 1--��ֱ�ڷ�</p>
    * @param labelLayout int
    */
   public void setLabelLayout(int labelLayout)
   {
      this.labelLayout = labelLayout;
   }

   /**
    * <p>�沼�ַ�ʽ 0--Ƕ��ʽ���� 1--���²��� 2--���Ҳ���</p>
    * @return int
    */
   public int getPageLayout()
   {
      return pageLayout;
   }

   /**
    * <p>�沼�ַ�ʽ0--Ƕ��ʽ���� 1--���²��� 2--���Ҳ���</p>
    * @param pageLayout int
    */
   public void setPageLayout(int pageLayout)
   {
      this.pageLayout = pageLayout;
   }

   public int getCellColCount()
   {
      return cellColCount;
   }

   public void setCellColCount(int cellColCount)
   {
      this.cellColCount = cellColCount;
   }

   public int getCellRowCount()
   {
      return cellRowCount;
   }

   public void setCellRowCount(int cellRowCount)
   {
      this.cellRowCount = cellRowCount;
   }
   /**
    * ����ConditionID��ȡ��Ӧ��ConditionDetailVO
    * @param conID
    * @return
    *���� 2010-06-09
    */
   public ConditionDetailVO getConditionDetailVO(String conID){
	   ConditionDetailVO result =null;
	   List list =getPublishConditions();
	   for(int i =0;list !=null&& i<list.size();i++){
		   PublishConditionVO pubCon =(PublishConditionVO) list.get(i);
		   result =pubCon.getConditionDetailVO(conID);
		   if (result !=null) break;
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
	   List list =getPublishConditions();
	   for(int i =0;list !=null&& i<list.size();i++){
		   PublishConditionVO pubCon =(PublishConditionVO) list.get(i);
		   result =pubCon.getConditionVO(conID);
		   if (result !=null) break;
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
	   List list =getPublishConditions();
	   for(int i =0;list !=null&& i<list.size();i++){
		   PublishConditionVO pubCon =(PublishConditionVO) list.get(i);
		   result =pubCon.getPublishProcParamsVO(conID);
		   if (result !=null) break;
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
	   List<PublishProcParamsVO> result =null;
	   List list =getPublishConditions();
	   for(int i =0;list !=null&& i<list.size();i++){
		   PublishConditionVO pubCon =(PublishConditionVO) list.get(i);
		   result =pubCon.getListPublishProcParamsVO(conID);
		   if (result !=null&&result.size()>=1) break;
	   }
	   return result;
   }

}
