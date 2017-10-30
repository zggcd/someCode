package com.ccssoft.rsas.metadata.publish.bo;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.metadata.publish.dao.PublishDAOMapper;
import com.ccssoft.rsas.metadata.publish.model.PublishVO;

@Component("pwb_publishBOImpl")
public class PublishBOImpl implements IPublishBO{
	
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addPublish(PublishVO publish) {
		PublishDAOMapper publishDao = metaDataSqlSessionTemplate.getMapper(PublishDAOMapper.class);
		publishDao.addPublish(publish);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updatePublish(PublishVO publish) {
		PublishDAOMapper publishDao = metaDataSqlSessionTemplate.getMapper(PublishDAOMapper.class);
		publishDao.updatePublish(publish);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delPublish(String fduPublishID) {
		PublishDAOMapper publishDao = metaDataSqlSessionTemplate.getMapper(PublishDAOMapper.class);
		publishDao.delPublish(fduPublishID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delReportPublish(String fdureportid) {
		PublishDAOMapper publishDao = metaDataSqlSessionTemplate.getMapper(PublishDAOMapper.class);
		publishDao.delReportPublish(fdureportid);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public PublishVO getPublish(String fduPublishID) {
		PublishDAOMapper publishDao = metaDataSqlSessionTemplate.getMapper(PublishDAOMapper.class);
		PublishVO vo = publishDao.getPublish(fduPublishID);
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<PublishVO> getReportPublish(String fduReportID) {
		PublishDAOMapper publishDao = metaDataSqlSessionTemplate.getMapper(PublishDAOMapper.class);
		List<PublishVO> vos = publishDao.getReportPublish(fduReportID);
		return vos;
	}

}
