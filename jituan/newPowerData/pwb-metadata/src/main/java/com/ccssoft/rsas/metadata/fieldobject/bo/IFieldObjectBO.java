package com.ccssoft.rsas.metadata.fieldobject.bo;

import java.util.List;

import com.ccssoft.rsas.metadata.fieldobject.model.FieldObjectVO;

public interface IFieldObjectBO {
	
int addFieldObject(FieldObjectVO fieldObject);
	
	public int updateFieldObject(FieldObjectVO fieldObject);
	
	public int delFieldObject(String fduFieldID);
	
	public int delFieldObjects(String[] fduFieldIDs);
	
	public int delFields(String condition);
	
	public int delFields(String tableName, String fieldType);
	
	public int delFieldsByqueryid(String tableCaption, String fieldType);
	
	public int delCubeFieldObjects(String fduCubeID);
	
	public FieldObjectVO getFieldObject(String fduFieldID);
	
	public List<FieldObjectVO> getCubeFieldObjects(String fduCubeID);
	
	public boolean isExist(String fieldID);

}
