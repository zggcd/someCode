package com.ccssoft.rsas.metadata.dimension.dao;

import java.util.List;
import java.util.Map;

import com.ccssoft.rsas.metadata.dimension.model.DimensionVO;

public interface DimensionDAOMapper {

	int addDimension(DimensionVO dimension);
	
	int updateDimension(DimensionVO dimension);
	
	int updateHierarchyCount(Map params);
	
	int updateDimensionOptimizedSign(Map params);
	
	int delDimension(String fduDimensionID);
	
	DimensionVO getDimension(String fduDimensionID);
	
	List<DimensionVO> getDimensions();
	
	List<DimensionVO> getCubeDimensions(String cubeID);
	
	int recordsStat(String sql);
	
	List<DimensionVO> isUse(String fduDimensionID);
}