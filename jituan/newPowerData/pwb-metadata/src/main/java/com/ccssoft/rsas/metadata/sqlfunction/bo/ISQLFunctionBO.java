package com.ccssoft.rsas.metadata.sqlfunction.bo;

import java.util.List;

import com.ccssoft.rsas.metadata.sqlfunction.model.SQLFunctionVO;

public interface ISQLFunctionBO {
	public int addFunction(SQLFunctionVO function);
	
	public int updateFunction(SQLFunctionVO function);
	
	public int delFunction(String fduFunctionID);
	
	public SQLFunctionVO getFunction(String fduFunctionID);
	
	public List<SQLFunctionVO> getFunctions();
	
	public SQLFunctionVO getFunctionByDBType(String fduFunctionID, String databaseTypeId);

}
