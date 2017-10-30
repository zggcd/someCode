package com.ccssoft.rsas.metadata.publish.bo;

import java.util.List;

import com.ccssoft.rsas.metadata.publish.model.PublishVO;

public interface IPublishBO {
	
	public int addPublish(PublishVO publish);
	
	public int updatePublish(PublishVO publish);
	
	public int delPublish(String fduPublishID);
	
	public int delReportPublish(String fdureportid);
	
	public PublishVO getPublish(String fduPublishID);
	
	public List<PublishVO> getReportPublish(String fduReportID);

}
