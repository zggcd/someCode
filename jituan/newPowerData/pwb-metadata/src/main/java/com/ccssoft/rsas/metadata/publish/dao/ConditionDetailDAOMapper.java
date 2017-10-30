package com.ccssoft.rsas.metadata.publish.dao;

import java.util.List;
import java.util.Map;

import com.ccssoft.rsas.metadata.publish.model.ConditionDetailVO;

public interface ConditionDetailDAOMapper {
	
	int addConditionDetail(ConditionDetailVO cDetail);
	
	int delConditionDetail(Map<String,String> params);
	
	int delPublishConditionDetail(String  fduPublishID);
	
	List<ConditionDetailVO> getConditionDetail(Map<String,String> params);
	
	ConditionDetailVO getConditionDetailVO(Map<String,String> params);

}