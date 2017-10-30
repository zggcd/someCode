package com.ccssoft.rsas.metadata.memberproperty.bo;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.metadata.memberproperty.dao.MemberPropertyDAOMapper;
import com.ccssoft.rsas.metadata.memberproperty.model.MemberPropertyVO;

@Component("pwb_memberPropertyBOImpl")
public class MemberPropertyBOImpl implements IMemberPropertyBO{
	
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addProperty(MemberPropertyVO property) {
		MemberPropertyDAOMapper memberPropertyDao = metaDataSqlSessionTemplate.getMapper(MemberPropertyDAOMapper.class);
		memberPropertyDao.addProperty(property);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateProperty(MemberPropertyVO property) {
		MemberPropertyDAOMapper memberPropertyDao = metaDataSqlSessionTemplate.getMapper(MemberPropertyDAOMapper.class);
		memberPropertyDao.updateProperty(property);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delProperty(String fduPropertyID) {
		MemberPropertyDAOMapper memberPropertyDao = metaDataSqlSessionTemplate.getMapper(MemberPropertyDAOMapper.class);
		memberPropertyDao.delProperty(fduPropertyID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delMemberPropertys(String fduMemberID) {
		MemberPropertyDAOMapper memberPropertyDao = metaDataSqlSessionTemplate.getMapper(MemberPropertyDAOMapper.class);
		memberPropertyDao.delMemberPropertys(fduMemberID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public MemberPropertyVO getProperty(String fduPropertyID) {
		MemberPropertyDAOMapper memberPropertyDao = metaDataSqlSessionTemplate.getMapper(MemberPropertyDAOMapper.class);
		MemberPropertyVO vo = memberPropertyDao.getProperty(fduPropertyID);
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<MemberPropertyVO> getPropertys(String fduMemberID) {
		MemberPropertyDAOMapper memberPropertyDao = metaDataSqlSessionTemplate.getMapper(MemberPropertyDAOMapper.class);
		List<MemberPropertyVO> vos = memberPropertyDao.getPropertys(fduMemberID);
		return vos;
	}

}
