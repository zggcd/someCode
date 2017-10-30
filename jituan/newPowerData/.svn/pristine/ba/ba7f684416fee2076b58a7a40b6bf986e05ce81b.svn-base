package com.ccssoft.rsas.metadata.measure.dao;

import java.util.List;
import java.util.Map;

import com.ccssoft.rsas.metadata.measure.model.MeasureVO;

public interface MeasureDAOMapper {
	
	int addMeasure(MeasureVO measurevo);
	
	int updateMeasure(MeasureVO measurevo);
	
	int delMeasure(String MeasureID);
	
	int delMeasureByTable(Map<String,String> params);
	
	MeasureVO getMeasure(String MeasureID);
	
	List<MeasureVO> getSQLMeasure(String fdcfacttablecaption);
	
	List<MeasureVO> getMeasures(Map<String, String> params);
	
	List<MeasureVO> queryFactTableMeasures(String factTableName);
	
	List<MeasureVO> queryCubeMeasures(String fduCubeID);
}