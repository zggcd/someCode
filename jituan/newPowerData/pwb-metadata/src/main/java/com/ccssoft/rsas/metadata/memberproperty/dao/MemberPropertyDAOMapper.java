package com.ccssoft.rsas.metadata.memberproperty.dao;

import java.util.List;

import com.ccssoft.rsas.metadata.memberproperty.model.MemberPropertyVO;

public interface MemberPropertyDAOMapper {
	
	int addProperty(MemberPropertyVO property);
	
	int updateProperty(MemberPropertyVO property);
	
	int delProperty(String fduPropertyID);
	
	int delMemberPropertys(String fduMemberID);
	
	MemberPropertyVO getProperty(String fduPropertyID);
	
	List<MemberPropertyVO> getPropertys(String fduMemberID);

}
