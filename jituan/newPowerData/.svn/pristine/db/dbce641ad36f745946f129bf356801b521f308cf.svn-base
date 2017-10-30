package com.ccssoft.rsas.metadata.dimension.bo;

import java.util.List;

import com.ccssoft.rsas.metadata.dimension.model.DimensionVO;

public interface IDimensionBO {
	
	public int addDimension(DimensionVO dimension);
	
	public int updateDimension(DimensionVO dimension);
	
	public int updateHierarchyCount(int hierarchyCount, String dimensionID);
	
	public int updateDimensionOptimizedSign(String fduDimensionID,int fdiAutoOptimized);
	
	public int delDimension(String fduDimensionID);
	
	public DimensionVO getDimension(String fduDimensionID);
	
	public List<DimensionVO> getDimensions();
	
	public List<DimensionVO> getCubeDimensions(String cubeID);
	
	public int recordsStat(String sql);
	
	public List<DimensionVO> isUse(String fduDimensionID);

}
