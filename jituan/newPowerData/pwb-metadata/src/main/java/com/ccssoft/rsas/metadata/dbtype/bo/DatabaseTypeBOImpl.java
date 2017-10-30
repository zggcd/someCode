package com.ccssoft.rsas.metadata.dbtype.bo;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.metadata.dbtype.dao.DatabaseTypeDAOMapper;
import com.ccssoft.rsas.metadata.dbtype.model.DatabaseTypeVO;


@Component("pwb_databaseTypeBOImpl")
public class DatabaseTypeBOImpl implements IDatabaseTypeBO{
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addDbType(DatabaseTypeVO Dbtypevo) {
		DatabaseTypeDAOMapper databaseTypeDAO = metaDataSqlSessionTemplate.getMapper(DatabaseTypeDAOMapper.class);
		databaseTypeDAO.addDbType(Dbtypevo);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateDbType(DatabaseTypeVO Dbtypevo) {
		DatabaseTypeDAOMapper databaseTypeDAO = metaDataSqlSessionTemplate.getMapper(DatabaseTypeDAOMapper.class);
		databaseTypeDAO.updateDbType(Dbtypevo);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delDbType(String dbTypeID) {
		DatabaseTypeDAOMapper databaseTypeDAO = metaDataSqlSessionTemplate.getMapper(DatabaseTypeDAOMapper.class);
		databaseTypeDAO.delDbType(dbTypeID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public DatabaseTypeVO getDbType(String dbTypeID) {
		DatabaseTypeDAOMapper databaseTypeDAO = metaDataSqlSessionTemplate.getMapper(DatabaseTypeDAOMapper.class);
		DatabaseTypeVO vo = databaseTypeDAO.getDbType(dbTypeID);
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<DatabaseTypeVO> getDbTypes() {
		DatabaseTypeDAOMapper databaseTypeDAO = metaDataSqlSessionTemplate.getMapper(DatabaseTypeDAOMapper.class);
		List<DatabaseTypeVO> vos = databaseTypeDAO.getDbTypes();
		return vos;
	}

}
