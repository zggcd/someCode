package com.ccssoft.rsas.metadata.dimension.bo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.metadata.dimension.dao.DimensionDAOMapper;
import com.ccssoft.rsas.metadata.dimension.model.DimensionVO;

@Component("pwb_dimensionBOImpl")
public class DimensionBOImpl implements IDimensionBO{
	
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addDimension(DimensionVO dimension) {
		DimensionDAOMapper dimensionDao = metaDataSqlSessionTemplate.getMapper(DimensionDAOMapper.class);
		dimensionDao.addDimension(dimension);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateDimension(DimensionVO dimension) {
		DimensionDAOMapper dimensionDao = metaDataSqlSessionTemplate.getMapper(DimensionDAOMapper.class);
		dimensionDao.updateDimension(dimension);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateHierarchyCount(int hierarchyCount, String dimensionID) {
		DimensionDAOMapper dimensionDao = metaDataSqlSessionTemplate.getMapper(DimensionDAOMapper.class);
		Map params = new HashMap();
		params.put("hierarchyCount", hierarchyCount);
		params.put("ID", dimensionID);
		dimensionDao.updateHierarchyCount(params);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateDimensionOptimizedSign(String fduDimensionID, int fdiAutoOptimized) {
		DimensionDAOMapper dimensionDao = metaDataSqlSessionTemplate.getMapper(DimensionDAOMapper.class);
		Map params = new HashMap();
		params.put("autoOptimized", fdiAutoOptimized);
		params.put("ID", fduDimensionID);
		dimensionDao.updateDimensionOptimizedSign(params);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delDimension(String fduDimensionID) {
		DimensionDAOMapper dimensionDao = metaDataSqlSessionTemplate.getMapper(DimensionDAOMapper.class);
		dimensionDao.delDimension(fduDimensionID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public DimensionVO getDimension(String fduDimensionID) {
		DimensionDAOMapper dimensionDao = metaDataSqlSessionTemplate.getMapper(DimensionDAOMapper.class);
		DimensionVO vo = dimensionDao.getDimension(fduDimensionID);
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<DimensionVO> getDimensions() {
		DimensionDAOMapper dimensionDao = metaDataSqlSessionTemplate.getMapper(DimensionDAOMapper.class);
		List<DimensionVO> vos = dimensionDao.getDimensions();
		return vos;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<DimensionVO> getCubeDimensions(String cubeID) {
		DimensionDAOMapper dimensionDao = metaDataSqlSessionTemplate.getMapper(DimensionDAOMapper.class);
		List<DimensionVO> vos = dimensionDao.getCubeDimensions(cubeID);
		return vos;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int recordsStat(String sql) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<DimensionVO> isUse(String fduDimensionID) {
		// TODO Auto-generated method stub
		return null;
	}

}
