package com.ccssoft.rsas.metadata.member.bo;

import java.util.List;

import com.ccssoft.rsas.metadata.member.model.MemberVO;

public interface IMemberBO {
	
	public int addMember(MemberVO member);
	
	public int updateMember(MemberVO member);
	
	public int delMember(String fduMemberID);
	
	public int delMembers(String ownerID);
	
	public MemberVO getMember(String memberID);
	
	public List<MemberVO> getMembersByOwnerType(String ownerID, String ownerType);
	
	public List<MemberVO> getMembers(String ownerID);

}
