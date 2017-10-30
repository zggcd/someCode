package com.ccssoft.rsas.metadata.measure.bo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.metadata.measure.dao.MeasureDAOMapper;
import com.ccssoft.rsas.metadata.measure.model.MeasureVO;

@Component("pwb_measureBOImpl")
public class MeasureBOImpl implements IMeasureBO{
	
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addMeasure(MeasureVO measurevo) {
		MeasureDAOMapper measureDao = metaDataSqlSessionTemplate.getMapper(MeasureDAOMapper.class);
		measureDao.addMeasure(measurevo);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateMeasure(MeasureVO measurevo) {
		MeasureDAOMapper measureDao = metaDataSqlSessionTemplate.getMapper(MeasureDAOMapper.class);
		measureDao.updateMeasure(measurevo);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delMeasure(String MeasureID) {
		MeasureDAOMapper measureDao = metaDataSqlSessionTemplate.getMapper(MeasureDAOMapper.class);
		measureDao.delMeasure(MeasureID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delMeasureByTable(String fdcfacttablecaption, String fdcfieldname) {
		MeasureDAOMapper measureDao = metaDataSqlSessionTemplate.getMapper(MeasureDAOMapper.class);
		Map<String,String> params = new HashMap<String,String>();
		params.put("factTableCaption", fdcfacttablecaption);
		params.put("fieldName", fdcfieldname);
		measureDao.delMeasureByTable(params);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public MeasureVO getMeasure(String MeasureID) {
		MeasureDAOMapper measureDao = metaDataSqlSessionTemplate.getMapper(MeasureDAOMapper.class);
		MeasureVO vo = measureDao.getMeasure(MeasureID);
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<MeasureVO> getSQLMeasure(String fdcfacttablecaption) {
		MeasureDAOMapper measureDao = metaDataSqlSessionTemplate.getMapper(MeasureDAOMapper.class);
		List<MeasureVO> vos = measureDao.getSQLMeasure(fdcfacttablecaption);
		return vos;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<MeasureVO> getMeasures(String factTableName, String linkID) {
		MeasureDAOMapper measureDao = metaDataSqlSessionTemplate.getMapper(MeasureDAOMapper.class);
		Map<String, String> params = new HashMap<String,String>();
		params.put("factTableName", factTableName);
		params.put("linkID", linkID);
		List<MeasureVO> vos = measureDao.getMeasures(params);
		return vos;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<MeasureVO> queryFactTableMeasures(String factTableName) {
		MeasureDAOMapper measureDao = metaDataSqlSessionTemplate.getMapper(MeasureDAOMapper.class);
		List<MeasureVO> vos = measureDao.queryFactTableMeasures(factTableName);
		return vos;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<MeasureVO> queryCubeMeasures(String fduCubeID) {
		// TODO Auto-generated method stub
		return null;
	}

}
