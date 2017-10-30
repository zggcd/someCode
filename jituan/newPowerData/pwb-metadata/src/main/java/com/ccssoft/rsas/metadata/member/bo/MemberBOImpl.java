package com.ccssoft.rsas.metadata.member.bo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.metadata.member.dao.MemberDAOMapper;
import com.ccssoft.rsas.metadata.member.model.MemberVO;
import com.ccssoft.rsas.metadata.memberproperty.dao.MemberPropertyDAOMapper;
import com.ccssoft.rsas.metadata.memberproperty.model.MemberPropertyVO;

@Component("pwb_memberBOImpl")
public class MemberBOImpl implements IMemberBO{
	
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addMember(MemberVO member) {
		MemberDAOMapper memberDao = metaDataSqlSessionTemplate.getMapper(MemberDAOMapper.class);
		memberDao.addMember(member);
		
		if (member.getMpropertys() != null && member.getMpropertys().size() > 0){
			MemberPropertyDAOMapper memberPropertyDao = metaDataSqlSessionTemplate.getMapper(MemberPropertyDAOMapper.class);
			List<MemberPropertyVO> mplist = member.getMpropertys();
			for (int i = 0; i < mplist.size(); i++){
				memberPropertyDao.addProperty(mplist.get(i));
			}
		}
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateMember(MemberVO member) {
		MemberDAOMapper memberDao = metaDataSqlSessionTemplate.getMapper(MemberDAOMapper.class);
		memberDao.updateMember(member);
		
		if (member.getMpropertys() != null && member.getMpropertys().size() > 0){
			MemberPropertyDAOMapper memberPropertyDao = metaDataSqlSessionTemplate.getMapper(MemberPropertyDAOMapper.class);
			List<MemberPropertyVO> mplist = member.getMpropertys();
			for (int i = 0; i < mplist.size(); i++){
				memberPropertyDao.updateProperty(mplist.get(i));
			}
		}
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delMember(String fduMemberID) {
		MemberDAOMapper memberDao = metaDataSqlSessionTemplate.getMapper(MemberDAOMapper.class);
		memberDao.delMember(fduMemberID);
		
		MemberPropertyDAOMapper memberPropertyDao = metaDataSqlSessionTemplate.getMapper(MemberPropertyDAOMapper.class);
		memberPropertyDao.delMemberPropertys(fduMemberID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delMembers(String ownerID) {
		MemberDAOMapper memberDao = metaDataSqlSessionTemplate.getMapper(MemberDAOMapper.class);
		List<MemberVO> mlist = memberDao.getMembers(ownerID);
		if (mlist != null && mlist.size() > 0){
			MemberPropertyDAOMapper memberPropertyDao = metaDataSqlSessionTemplate.getMapper(MemberPropertyDAOMapper.class);
			 for (int n = 0; n < mlist.size(); n++){
				 MemberVO member = (MemberVO) mlist.get(n);
				 memberPropertyDao.delMemberPropertys(member.getMemberID());
			 }
		}
		
		memberDao.delMembers(ownerID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public MemberVO getMember(String memberID) {
		MemberDAOMapper memberDao = metaDataSqlSessionTemplate.getMapper(MemberDAOMapper.class);
		MemberVO vo = memberDao.getMember(memberID);
		
		MemberPropertyDAOMapper memberPropertyDao = metaDataSqlSessionTemplate.getMapper(MemberPropertyDAOMapper.class);
		List<MemberPropertyVO> plist = memberPropertyDao.getPropertys(memberID);
		if (vo != null && plist != null && plist.size() > 0){
			vo.setMpropertys(plist);
		}
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<MemberVO> getMembersByOwnerType(String ownerID, String ownerType) {
		MemberDAOMapper memberDao = metaDataSqlSessionTemplate.getMapper(MemberDAOMapper.class);
		Map<String,String> params = new HashMap<String,String>();
		params.put("ownerID", ownerID);
		params.put("ownerType", ownerType);
		List<MemberVO> vos = memberDao.getMembersByOwnerType(params);
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		if (vos != null && vos.size() > 0){
			MemberPropertyDAOMapper memberPropertyDao = metaDataSqlSessionTemplate.getMapper(MemberPropertyDAOMapper.class);
			for (int i = 0; i < vos.size(); i++){
				MemberVO membervo = vos.get(i);
				if (membervo != null){
					List<MemberPropertyVO> mlist = memberPropertyDao.getPropertys(membervo.getMemberID());

	                if (mlist != null && mlist.size() > 0){
	                   membervo.setMpropertys(mlist);
	                }
	                memberList.add(membervo);
				}
			}
		}
		return memberList;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<MemberVO> getMembers(String ownerID) {
		MemberDAOMapper memberDao = metaDataSqlSessionTemplate.getMapper(MemberDAOMapper.class);
		List<MemberVO> vos = memberDao.getMembers(ownerID);
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		if (vos != null && vos.size() > 0){
			MemberPropertyDAOMapper memberPropertyDao = metaDataSqlSessionTemplate.getMapper(MemberPropertyDAOMapper.class);
			for (int i = 0; i < vos.size(); i++){
				MemberVO membervo = vos.get(i);
				if (membervo != null){
					List<MemberPropertyVO> mlist = memberPropertyDao.getPropertys(membervo.getMemberID());

	                if (mlist != null && mlist.size() > 0){
	                   membervo.setMpropertys(mlist);
	                }
	                memberList.add(membervo);
				}
			}
		}
		return memberList;
	}

}
