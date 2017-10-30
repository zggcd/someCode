package com.ccssoft.rsas.metadata.publish.bo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.metadata.publish.dao.ConditionDetailDAOMapper;
import com.ccssoft.rsas.metadata.publish.model.ConditionDetailVO;

@Component("pwb_conditionDetailBOImpl")
public class ConditionDetailBOImpl implements IConditionDetailBO{
	
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addConditionDetail(ConditionDetailVO cDetail) {
		ConditionDetailDAOMapper conditionDetailDao = metaDataSqlSessionTemplate.getMapper(ConditionDetailDAOMapper.class);
		conditionDetailDao.addConditionDetail(cDetail);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delConditionDetail(String fduPublishID, String fduPublishConditionID, String fduConditionID) {
		ConditionDetailDAOMapper conditionDetailDao = metaDataSqlSessionTemplate.getMapper(ConditionDetailDAOMapper.class);
		Map<String,String> params = new HashMap<String,String>();
		params.put("fduconditionid", fduConditionID);
		params.put("fdupublishconditionid", fduPublishConditionID);
		params.put("fdupublishid", fduPublishID);
		conditionDetailDao.delConditionDetail(params);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delPublishConditionDetail(String fduPublishID) {
		ConditionDetailDAOMapper conditionDetailDao = metaDataSqlSessionTemplate.getMapper(ConditionDetailDAOMapper.class);
		conditionDetailDao.delPublishConditionDetail(fduPublishID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<ConditionDetailVO> getConditionDetail(String fduPublishID, String fduPublishConditionID) {
		ConditionDetailDAOMapper conditionDetailDao = metaDataSqlSessionTemplate.getMapper(ConditionDetailDAOMapper.class);
		Map<String,String> params = new HashMap<String,String>();
		params.put("fdupublishconditionid", fduPublishConditionID);
		params.put("fdupublishid", fduPublishID);
		List<ConditionDetailVO> vos = conditionDetailDao.getConditionDetail(params);
		return vos;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public ConditionDetailVO getConditionDetailVO(String fduCondtionId, String fduPublishConditionID) {
		ConditionDetailDAOMapper conditionDetailDao = metaDataSqlSessionTemplate.getMapper(ConditionDetailDAOMapper.class);
		Map<String,String> params = new HashMap<String,String>();
		params.put("fdupublishconditionid", fduPublishConditionID);
		params.put("fduconditionid", fduCondtionId);
		ConditionDetailVO vo = conditionDetailDao.getConditionDetailVO(params);
		return vo;
	}

}
