package com.ccssoft.rsas.metadata.sqlfunction.dao;

import java.util.List;

import com.ccssoft.rsas.metadata.sqlfunction.model.SQLFunctionVO;

public interface SQLFunctionDAOMapper {
	
	int addFunction(SQLFunctionVO function);
	
	int updateFunction(SQLFunctionVO function);
	
	int delFunction(String fduFunctionID);
	
	SQLFunctionVO getFunction(String fduFunctionID);
	
	List<SQLFunctionVO> getFunctions();
	
	SQLFunctionVO getFunctionByDBType(String fduFunctionID, String databaseTypeId);

}
