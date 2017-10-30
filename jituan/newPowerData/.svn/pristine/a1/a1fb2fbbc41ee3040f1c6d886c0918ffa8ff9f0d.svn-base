package com.ccssoft.rsas.metadata.measure.bo;

import java.util.List;

import com.ccssoft.rsas.metadata.measure.model.MeasureVO;

public interface IMeasureBO {
	
	public int addMeasure(MeasureVO measurevo);
	
	public int updateMeasure(MeasureVO measurevo);
	
	public int delMeasure(String MeasureID);
	
	public int delMeasureByTable(String fdcfacttablecaption,String fdcfieldname);
	
	public MeasureVO getMeasure(String MeasureID);
	
	public List<MeasureVO> getSQLMeasure(String fdcfacttablecaption);
	
	public List<MeasureVO> getMeasures(String factTableName,String linkID);
	
	public List<MeasureVO> queryFactTableMeasures(String factTableName);
	
	public List<MeasureVO> queryCubeMeasures(String fduCubeID);

}
