package com.ccssoft.rsas.metadata.publish.bo;

import java.util.List;

import com.ccssoft.rsas.metadata.publish.model.ConditionDetailVO;

public interface IConditionDetailBO {
	
	public int addConditionDetail(ConditionDetailVO cDetail);
	
	public int delConditionDetail(String fduPublishID ,String fduPublishConditionID, String fduConditionID);
	
	public int delPublishConditionDetail(String  fduPublishID);
	
	public List<ConditionDetailVO> getConditionDetail(String fduPublishID ,String  fduPublishConditionID);
	
	public ConditionDetailVO getConditionDetailVO(String fduCondtionId,String  fduPublishConditionID);

}
