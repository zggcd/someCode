package com.ccssoft.rsas.metadata.filter.bo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.metadata.filter.dao.FilterDAOMapper;
import com.ccssoft.rsas.metadata.filter.model.FilterVO;

@Component("pwb_filterBOImpl")
public class FilterBOImpl implements IFilterBO{
	
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addFilter(FilterVO filter) {
		FilterDAOMapper filterDao = metaDataSqlSessionTemplate.getMapper(FilterDAOMapper.class);
		filterDao.addFilter(filter);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateFilter(FilterVO filter) {
		FilterDAOMapper filterDao = metaDataSqlSessionTemplate.getMapper(FilterDAOMapper.class);
		filterDao.updateFilter(filter);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delFilter(String fduFilterID) {
		FilterDAOMapper filterDao = metaDataSqlSessionTemplate.getMapper(FilterDAOMapper.class);
		filterDao.delFilter(fduFilterID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delRelationFilters(String relationID) {
		FilterDAOMapper filterDao = metaDataSqlSessionTemplate.getMapper(FilterDAOMapper.class);
		filterDao.delRelationFilters(relationID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public FilterVO getFilter(String fduFilterID) {
		FilterDAOMapper filterDao = metaDataSqlSessionTemplate.getMapper(FilterDAOMapper.class);
		FilterVO vo = filterDao.getFilter(fduFilterID);
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<FilterVO> getFilters() {
		FilterDAOMapper filterDao = metaDataSqlSessionTemplate.getMapper(FilterDAOMapper.class);
		List<FilterVO> vos = filterDao.getFilters();
		return vos;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delOjbectRelationFilters(String ownerObjID, String ownerObjType) {
		FilterDAOMapper filterDao = metaDataSqlSessionTemplate.getMapper(FilterDAOMapper.class);
		Map<String,String> params = new HashMap<String,String>();
		params.put("ownerObjID", ownerObjID);
		params.put("ownerObjType", ownerObjType);
		filterDao.delOjbectRelationFilters(params);
		return 1;
	}

}
