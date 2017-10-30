package com.ccssoft.rsas.metadata.fieldobject.dao;

import java.util.List;
import java.util.Map;

import com.ccssoft.rsas.metadata.fieldobject.model.FieldObjectVO;

public interface FieldObjectDAOMapper {
	
	int addFieldObject(FieldObjectVO fieldObject);
	
	int updateFieldObject(FieldObjectVO fieldObject);
	
	int delFieldObject(String fduFieldID);
	
	int delFieldObjects(Map<String,Object> fduFieldIDs);
	
	int delFields(String condition);
	
	int delFields(Map<String,String> params);
	
	int delFieldsByqueryid(Map<String,String> params);
	
	int delCubeFieldObjects(String fduCubeID);
	
	FieldObjectVO getFieldObject(String fduFieldID);
	
	List<FieldObjectVO> getCubeFieldObjects(String fduCubeID);
	
	FieldObjectVO isExist(String fieldID);

}