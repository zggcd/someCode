package com.ccssoft.rsas.metadata.publishprocparams.bo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.metadata.publishprocparams.dao.PublishProcParamsDAOMapper;
import com.ccssoft.rsas.metadata.publishprocparams.model.PublishProcParamsVO;

@Component("pwb_publishProcParamsBOImpl")
public class PublishProcParamsBOImpl implements IPublishProcParamsBO{
	
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addPublishProcParams(PublishProcParamsVO publishProcParamsvo) {
		PublishProcParamsDAOMapper publishProcParamsDao = metaDataSqlSessionTemplate.getMapper(PublishProcParamsDAOMapper.class);
		publishProcParamsDao.addPublishProcParams(publishProcParamsvo);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updatePublishProcParams(PublishProcParamsVO publishProcParamsvo) {
		PublishProcParamsDAOMapper publishProcParamsDao = metaDataSqlSessionTemplate.getMapper(PublishProcParamsDAOMapper.class);
		publishProcParamsDao.updatePublishProcParams(publishProcParamsvo);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delPublishProcParams(String fdupublishid) {
		PublishProcParamsDAOMapper publishProcParamsDao = metaDataSqlSessionTemplate.getMapper(PublishProcParamsDAOMapper.class);
		publishProcParamsDao.delPublishProcParams(fdupublishid);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delBindPublishProcParamss(String fduPublishConditionID) {
		PublishProcParamsDAOMapper publishProcParamsDao = metaDataSqlSessionTemplate.getMapper(PublishProcParamsDAOMapper.class);
		publishProcParamsDao.delBindPublishProcParamss(fduPublishConditionID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public PublishProcParamsVO getPublishProcParams(String fduPublishID, String fduPublishConditionID,
			String fduConditionID) {
		PublishProcParamsDAOMapper publishProcParamsDao = metaDataSqlSessionTemplate.getMapper(PublishProcParamsDAOMapper.class);
		Map<String,String> params = new HashMap<String,String>();
		params.put("fduconditionid", fduConditionID);
		params.put("fdupublishconditionid", fduPublishConditionID);
		params.put("fdupublishid", fduPublishID);
		PublishProcParamsVO vo = publishProcParamsDao.getPublishProcParams(params);
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<PublishProcParamsVO> getBandPublishProcParamss(String fduPublishConditionID) {
		PublishProcParamsDAOMapper publishProcParamsDao = metaDataSqlSessionTemplate.getMapper(PublishProcParamsDAOMapper.class);
		List<PublishProcParamsVO> vos = publishProcParamsDao.getBandPublishProcParamss(fduPublishConditionID);
		return vos;
	}

}
