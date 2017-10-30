package com.ccssoft.rsas.metadata.table.bo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.metadata.table.dao.TableDAOMapper;
import com.ccssoft.rsas.metadata.table.model.TableVO;

@Component("pwb_tableBOImpl")
public class TableBOImpl implements ITableBO{
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addTable(TableVO dbtablevo) {
		TableDAOMapper tableDao = metaDataSqlSessionTemplate.getMapper(TableDAOMapper.class);
		tableDao.addTable(dbtablevo);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateTable(TableVO dbtablevo) {
		TableDAOMapper tableDao = metaDataSqlSessionTemplate.getMapper(TableDAOMapper.class);
		tableDao.updateTable(dbtablevo);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delTable(String tableID) {
		TableDAOMapper tableDao = metaDataSqlSessionTemplate.getMapper(TableDAOMapper.class);
		tableDao.delTable(tableID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delObjectTable(String objectID,String objectType) {
		TableDAOMapper tableDao = metaDataSqlSessionTemplate.getMapper(TableDAOMapper.class);
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("objectID", objectID);
		paramMap.put("objectType", objectType);
		tableDao.delObjectTable(paramMap);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public TableVO getTable(String tableID) {
		TableDAOMapper tableDao = metaDataSqlSessionTemplate.getMapper(TableDAOMapper.class);
		TableVO vo = tableDao.getTable(tableID);
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<TableVO> getTables(String objectID, String objectType) {
		TableDAOMapper tableDao = metaDataSqlSessionTemplate.getMapper(TableDAOMapper.class);
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("objectID", objectID);
		paramMap.put("objectType", objectType);
		List<TableVO> vos = tableDao.getTables(paramMap);
		return vos;
	}

}
