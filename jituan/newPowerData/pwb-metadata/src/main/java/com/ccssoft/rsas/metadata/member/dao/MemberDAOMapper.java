package com.ccssoft.rsas.metadata.member.dao;

import java.util.List;
import java.util.Map;

import com.ccssoft.rsas.metadata.member.model.MemberVO;

public interface MemberDAOMapper {
	
	int addMember(MemberVO member);
	
	int updateMember(MemberVO member);
	
	int delMember(String fduMemberID);
	
	int delMembers(String ownerID);
	
	MemberVO getMember(String memberID);
	
	List<MemberVO> getMembersByOwnerType(Map<String,String> params);
	
	List<MemberVO> getMembers(String ownerID);

}
