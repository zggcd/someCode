package com.ccssoft.rsas.metadata.relationitem.bo;

import java.util.List;

import com.ccssoft.rsas.metadata.relationitem.model.RelationItemVO;

public interface IRelationItemBO {
	
	public int addRelationItem(RelationItemVO relationItem);
	
	public int updateRelationItem(RelationItemVO relationItem);
	
	public int delRelationItem(String fduRelationItemID);
	
	public int delRelationDefineItems(String relationID);
	
	public int delOjbectRelationItems(String ownerObjID, String ownerObjType);
	
	public RelationItemVO getRelationItem(String fduRelationItemID);
	
	public List<RelationItemVO> getRelationItems(String relationID);

}
