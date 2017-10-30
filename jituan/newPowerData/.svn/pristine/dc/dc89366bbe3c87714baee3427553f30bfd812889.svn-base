package com.ccssoft.rsas.metadata.relationitem.dao;

import java.util.List;
import java.util.Map;

import com.ccssoft.rsas.metadata.relationitem.model.RelationItemVO;

public interface RelationItemDAOMapper {
	
	int addRelationItem(RelationItemVO relationItem);
	
	int updateRelationItem(RelationItemVO relationItem);
	
	int delRelationItem(String fduRelationItemID);
	
	int delRelationDefineItems(String relationID);
	
	int delOjbectRelationItems(Map<String,String> params);
	
	RelationItemVO getRelationItem(String fduRelationItemID);
	
	List<RelationItemVO> getRelationItems(String relationID);
}