package com.ccssoft.rsas.metadata.cube.bo;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.metadata.cube.dao.CubeDAOMapper;
import com.ccssoft.rsas.metadata.cube.model.CubeVO;

@Component("pwb_cubeBOImpl")
public class CubeBOImpl implements ICubeBO{
	
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addCube(CubeVO cubevo) {
		CubeDAOMapper cubeDao = metaDataSqlSessionTemplate.getMapper(CubeDAOMapper.class);
		cubeDao.addCube(cubevo);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateCube(CubeVO cubevo) {
		CubeDAOMapper cubeDao = metaDataSqlSessionTemplate.getMapper(CubeDAOMapper.class);
		cubeDao.updateCube(cubevo);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delCube(String cubeID) {
		CubeDAOMapper cubeDao = metaDataSqlSessionTemplate.getMapper(CubeDAOMapper.class);
		cubeDao.delCube(cubeID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public CubeVO getCube(String cubeID) {
		CubeDAOMapper cubeDao = metaDataSqlSessionTemplate.getMapper(CubeDAOMapper.class);
		CubeVO vo = cubeDao.getCube(cubeID);
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<CubeVO> getCubes() {
		CubeDAOMapper cubeDao = metaDataSqlSessionTemplate.getMapper(CubeDAOMapper.class);
		List<CubeVO> vos = cubeDao.getCubes();
		return vos;
	}

}
