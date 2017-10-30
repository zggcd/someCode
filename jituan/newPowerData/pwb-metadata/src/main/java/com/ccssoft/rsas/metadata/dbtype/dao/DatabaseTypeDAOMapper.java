package com.ccssoft.rsas.metadata.dbtype.dao;

import java.util.List;

import com.ccssoft.rsas.metadata.dbtype.model.DatabaseTypeVO;


public interface DatabaseTypeDAOMapper {
	
	int addDbType(DatabaseTypeVO Dbtypevo);
	
	int updateDbType(DatabaseTypeVO Dbtypevo);
	
	int delDbType(String dbTypeID);
	
	DatabaseTypeVO getDbType(String dbTypeID);
	
	List<DatabaseTypeVO> getDbTypes();

}
