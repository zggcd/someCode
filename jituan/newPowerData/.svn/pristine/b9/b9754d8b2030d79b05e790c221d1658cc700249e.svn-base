package com.ccssoft.rsas.metadata.relation.bo;

import java.util.List;

import com.ccssoft.rsas.metadata.relation.model.RelationVO;

public interface IRelationBO {
	
	public int addRelation(RelationVO relation);
	
	public int updateRelation(RelationVO relation);
	
	public int delRelation(String fduRelationID);
	
	public int delObjectRelation(String ownerObjID, String ownerObjType);
	
	public RelationVO getRelation(String relationID);
	
	public RelationVO getOjbectRelation(String ownerObjID, String ownerObjType);
	
	public List<RelationVO> getRelations(String ownerObjType);
	
	public List<RelationVO> QueryAllRelations();

}
