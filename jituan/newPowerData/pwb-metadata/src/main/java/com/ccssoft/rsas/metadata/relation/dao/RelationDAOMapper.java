package com.ccssoft.rsas.metadata.relation.dao;

import java.util.List;
import java.util.Map;

import com.ccssoft.rsas.metadata.relation.model.RelationVO;

public interface RelationDAOMapper {
	
	int addRelation(RelationVO relation);
	
	int updateRelation(RelationVO relation);
	
	int delRelation(String fduRelationID);
	
	int delObjectRelation(Map<String,String> params);
	
	RelationVO getRelation(String relationID);
	
	RelationVO getOjbectRelation(Map<String,String> params);
	
	List<RelationVO> getRelations(String ownerObjType);
	
	List<RelationVO> QueryAllRelations();

}