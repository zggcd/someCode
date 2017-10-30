package com.ccssoft.rsas.metadata.publish.model;

import java.io.Serializable;
import java.util.List;

import com.ccssoft.rsas.metadata.condition.model.ConditionVO;
import com.ccssoft.rsas.metadata.publishprocparams.model.PublishProcParamsVO;


/**
 * <p>标题:报表工具元数据对象</p> 
 * <p>描述:报表发布视图对象</p> 
 * <p>版权: Copyright (c) 2007 </p>
 * <p>公司: 广州瑞达通信技术有限公司</p>
 * &version 1.0
 * &author 曾俊佳
 */
public class PublishVO implements Serializable
{

   private static final long serialVersionUID = 1L;
   private String publishID;//发布视图ID 
   private String publishName;//发布视图名称
   private String reportID;//发布的报表ID
   private int rowCount;//条件行数
   private int colCount;//条件列数
   private int cellGridSize;//画布精度 0--精细 cllDelicate； 1--标准 cllStandard；2--粗放 cllRough
   private int cellRowCount;//单元格行数
   private int cellColCount;//单元格列数
   private int pageLayout; //0--嵌入式布局 1--上下布局 2--左右布局
   private int controlLayout;//控件排列方式 0 水平摆 1 垂直摆放
   private int labelLayout;//标签摆放形式 0--水平摆放 1--垂直摆放
   private String desc;//
   private List publishConditions;//报表发布条件
   
   /**
    * <p>画布精度 0--精细 cllDelicate； 1--标准 cllStandard；2--粗放 cllRough</p>
    * @return int
    */
   public int getCellGridSize()
   {
      return cellGridSize;
   }
   
   /**
    * <p>画布精度 0--精细 cllDelicate； 1--标准 cllStandard；2--粗放 cllRough</p>
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
    * <p>控件排列方式 0 水平摆 1 垂直摆放</p>
    * @return int
    */
   public int getControlLayout()
   {
      return controlLayout;
   }

   /**
    * <p>控件排列方式 0 水平摆 1 垂直摆放</p>
    * @param controlLayout int
    */
   public void setControlLayout(int controlLayout)
   {
      this.controlLayout = controlLayout;
   }

   /**
    * <p>0--标签摆放形式:水平摆放 1--垂直摆放</p>
    * @return int
    */
   public int getLabelLayout()
   {
      return labelLayout;
   }

   /**
    * <p>0--标签摆放形式:水平摆放 1--垂直摆放</p>
    * @param labelLayout int
    */
   public void setLabelLayout(int labelLayout)
   {
      this.labelLayout = labelLayout;
   }

   /**
    * <p>面布局方式 0--嵌入式布局 1--上下布局 2--左右布局</p>
    * @return int
    */
   public int getPageLayout()
   {
      return pageLayout;
   }

   /**
    * <p>面布局方式0--嵌入式布局 1--上下布局 2--左右布局</p>
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
    * 根据ConditionID获取对应的ConditionDetailVO
    * @param conID
    * @return
    *王智 2010-06-09
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
    * 根据ConditionID获取对应的ConditionVO
    * @param conID
    * @return
    *王智 2010-06-09
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
    * 根据ConditionID获取对应的PublishProcParamsVO
    * @param conID
    * @return
    *王智 2010-06-09
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
    * 根据ConditionID获取对应的PublishProcParamsVO
    * @param conID
    * @return
    *王智 2010-06-09
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
