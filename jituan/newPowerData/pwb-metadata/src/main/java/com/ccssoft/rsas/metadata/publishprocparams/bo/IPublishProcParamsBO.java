package com.ccssoft.rsas.metadata.publishprocparams.bo;

import java.util.List;

import com.ccssoft.rsas.metadata.publishprocparams.model.PublishProcParamsVO;

public interface IPublishProcParamsBO {
	
	public int addPublishProcParams(PublishProcParamsVO publishProcParamsvo);
	
	public int updatePublishProcParams(PublishProcParamsVO publishProcParamsvo);
	
	public int delPublishProcParams(String fdupublishid);
	
	public int delBindPublishProcParamss(String fduPublishConditionID);
	
	public PublishProcParamsVO getPublishProcParams(String fduPublishID,String fduPublishConditionID, String fduConditionID);
	
	public List<PublishProcParamsVO> getBandPublishProcParamss(String fduPublishConditionID);

}
