package com.ccssoft.rsas.metadata.cubedefine.bo;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.metadata.cubedefine.dao.CubeDefineDAOMapper;
import com.ccssoft.rsas.metadata.cubedefine.model.CubeDefineVO;


@Component("pwb_cubeDefineBOImpl")
public class CubeDefineBOImpl implements ICubeDefineBO{
	
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addCubeDefine(CubeDefineVO cubedefinevo) {
		CubeDefineDAOMapper cubeDefineDao = metaDataSqlSessionTemplate.getMapper(CubeDefineDAOMapper.class);
		cubeDefineDao.addCubeDefine(cubedefinevo);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateCubeDefine(CubeDefineVO cubedefinevo) {
		CubeDefineDAOMapper cubeDefineDao = metaDataSqlSessionTemplate.getMapper(CubeDefineDAOMapper.class);
		cubeDefineDao.updateCubeDefine(cubedefinevo);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delCubeDefine(String cubeDefineID) {
		CubeDefineDAOMapper cubeDefineDao = metaDataSqlSessionTemplate.getMapper(CubeDefineDAOMapper.class);
		cubeDefineDao.delCubeDefine(cubeDefineID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delAllCubeDefine(String cubeID) {
		CubeDefineDAOMapper cubeDefineDao = metaDataSqlSessionTemplate.getMapper(CubeDefineDAOMapper.class);
		cubeDefineDao.delAllCubeDefine(cubeID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public CubeDefineVO getCubeDefine(String cubeDefineID) {
		CubeDefineDAOMapper cubeDefineDao = metaDataSqlSessionTemplate.getMapper(CubeDefineDAOMapper.class);
		CubeDefineVO vo = cubeDefineDao.getCubeDefine(cubeDefineID);
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<CubeDefineVO> getCubeDefines(String cubeId) {
		CubeDefineDAOMapper cubeDefineDao = metaDataSqlSessionTemplate.getMapper(CubeDefineDAOMapper.class);
		List<CubeDefineVO> vos = cubeDefineDao.getCubeDefines(cubeId);
		return vos;
	}

}
