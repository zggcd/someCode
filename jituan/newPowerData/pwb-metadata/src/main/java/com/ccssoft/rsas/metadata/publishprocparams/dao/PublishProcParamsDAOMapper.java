package com.ccssoft.rsas.metadata.publishprocparams.dao;

import java.util.List;
import java.util.Map;

import com.ccssoft.rsas.metadata.publishprocparams.model.PublishProcParamsVO;

public interface PublishProcParamsDAOMapper {
	
	int addPublishProcParams(PublishProcParamsVO publishProcParamsvo);
	
	int updatePublishProcParams(PublishProcParamsVO publishProcParamsvo);
	
	int delPublishProcParams(String fdupublishid);
	
	int delBindPublishProcParamss(String fduPublishConditionID);
	
	PublishProcParamsVO getPublishProcParams(Map<String,String> params);
	
	List<PublishProcParamsVO> getBandPublishProcParamss(String fduPublishConditionID);

}