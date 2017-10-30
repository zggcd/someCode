package com.ccssoft.rsas.metadata.memberproperty.bo;

import java.util.List;

import com.ccssoft.rsas.metadata.memberproperty.model.MemberPropertyVO;

public interface IMemberPropertyBO {
	
	public int addProperty(MemberPropertyVO property);
	
	public int updateProperty(MemberPropertyVO property);
	
	public int delProperty(String fduPropertyID);
	
	public int delMemberPropertys(String fduMemberID);
	
	public MemberPropertyVO getProperty(String fduPropertyID);
	
	public List<MemberPropertyVO> getPropertys(String fduMemberID);

}
