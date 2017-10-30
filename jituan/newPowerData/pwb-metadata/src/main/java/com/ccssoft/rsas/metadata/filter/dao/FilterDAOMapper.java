package com.ccssoft.rsas.metadata.filter.dao;

import java.util.List;
import java.util.Map;

import com.ccssoft.rsas.metadata.filter.model.FilterVO;

public interface FilterDAOMapper {
	
	int addFilter(FilterVO filter);
	
	int updateFilter(FilterVO filter);
	
	int delFilter(String fduFilterID);
	
	int delRelationFilters(String relationID);
	
	FilterVO getFilter(String fduFilterID);
	
	List<FilterVO> getFilters();
	
	int delOjbectRelationFilters(Map<String,String> params);

}