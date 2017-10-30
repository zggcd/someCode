package com.ccssoft.rsas.metadata.publish.dao;

import java.util.List;

import com.ccssoft.rsas.metadata.publish.model.PublishVO;

public interface PublishDAOMapper {
	
	int addPublish(PublishVO publish);
	
	int updatePublish(PublishVO publish);
	
	int delPublish(String fduPublishID);
	
	int delReportPublish(String fdureportid);
	
	PublishVO getPublish(String fduPublishID);
	
	List<PublishVO> getReportPublish(String fduReportID);

}