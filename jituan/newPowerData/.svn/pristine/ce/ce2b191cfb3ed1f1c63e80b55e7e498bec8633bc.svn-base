package com.ccssoft.rsas.metadata.publish.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ccssoft.rsas.metadata.condition.model.ConditionVO;
import com.ccssoft.rsas.metadata.publishprocparams.model.PublishProcParamsVO;


/**
 * <p>标题:报表工具元数据对象</p> 
 * <p>描述:报表发布条件表VO对象</p> 
 * <p>版权: Copyright (c) 2007 </p>
 * <p>公司: 广州瑞达通信技术有限公司</p>
 * &version 1.0
 * &author 曾俊佳
 */
public class PublishConditionVO implements Serializable
{

   private static final long serialVersionUID = 1L;

   private String publishConditionID;//发布条件ID
   private String publishID;//发布视图ID
   private String conditionID;//筛选条件ID
   private int startRow;//条件所在开始行
   private int startCol;//条件所在开始列
   private int endRow;//条件所在结束行
   private int endCol;//条件所在结束列
   private int columnWidth;//条件所在列的宽度百分比
   private int labCellCount;//条件标签所占的单元格数
   private int prerequisite;//是否必选条件
   private int isCommonUse; //是否常用条件
   private String searchKind;//查找方式 E -- 精确查找  B -- 模糊查找  LB -- 左模糊  RB -- 右模糊  IN -- 包含
   private int   controlOrder;//控件在单元格中的序号
   private int intervalCell;//控制水平摆放间隔距离
   private List conditions;//查询条件集合
   private List BindParamList;//绑定参数列
   private List conditionDetails ;//条件默认值
   private int isMultiSelect;//是否多选条件
   
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
    * <p> E -- 精确查找  B -- 模糊查找  LB -- 左模糊  RB -- 右模糊  IN -- 包含</p>
    * @return String
    */
   public String getSearchKind()
   {
      if(this.searchKind==null)
         searchKind="";
      return searchKind;
   }

   /**
    * <p> E -- 精确查找  B -- 模糊查找  LB -- 左模糊  RB -- 右模糊  IN -- 包含</p>
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
    * 根据ConditionID获取对应的ConditionDetailVO
    * @param conID
    * @return
    *王智 2010-06-09
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
    * 根据ConditionID获取对应的ConditionVO
    * @param conID
    * @return
    *王智 2010-06-09
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
    * 根据ConditionID获取对应的PublishProcParamsVO
    * @param conID
    * @return
    *王智 2010-06-09
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
    * 根据ConditionID获取对应的PublishProcParamsVO
    * @param conID
    * @return
    *王智 2010-06-09
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
