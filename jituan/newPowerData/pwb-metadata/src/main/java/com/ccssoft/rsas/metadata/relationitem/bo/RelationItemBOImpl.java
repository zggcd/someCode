package com.ccssoft.rsas.metadata.relationitem.bo;

import java.util.ArrayList;
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
import com.ccssoft.rsas.metadata.relationitem.dao.RelationItemDAOMapper;
import com.ccssoft.rsas.metadata.relationitem.model.RelationItemVO;

@Component("pwb_relationItemBOImpl")
public class RelationItemBOImpl implements IRelationItemBO{
	
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addRelationItem(RelationItemVO relationItem) {
		RelationItemDAOMapper relationItemDao = metaDataSqlSessionTemplate.getMapper(RelationItemDAOMapper.class);
		relationItemDao.addRelationItem(relationItem);
		
		if(relationItem!=null && relationItem.getFilterID()!=null && relationItem.getFiltervo()!=null){
			FilterDAOMapper filterDao = metaDataSqlSessionTemplate.getMapper(FilterDAOMapper.class);
			FilterVO filtervo = relationItem.getFiltervo();
			filterDao.addFilter(filtervo);
		}
		
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateRelationItem(RelationItemVO relationItem) {
		RelationItemDAOMapper relationItemDao = metaDataSqlSessionTemplate.getMapper(RelationItemDAOMapper.class);
		relationItemDao.updateRelationItem(relationItem);
		
		if(relationItem!=null && relationItem.getFiltervo()!=null){
			FilterDAOMapper filterDao = metaDataSqlSessionTemplate.getMapper(FilterDAOMapper.class);
			FilterVO filtervo = relationItem.getFiltervo();
			filterDao.updateFilter(filtervo);
		}
		
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delRelationItem(String fduRelationItemID) {
		RelationItemDAOMapper relationItemDao = metaDataSqlSessionTemplate.getMapper(RelationItemDAOMapper.class);
		RelationItemVO relationItemvo = relationItemDao.getRelationItem(fduRelationItemID);
		relationItemDao.delRelationItem(fduRelationItemID);
		
		if(relationItemvo!=null && relationItemvo.getFilterID()!=null){
			FilterDAOMapper filterDao = metaDataSqlSessionTemplate.getMapper(FilterDAOMapper.class);
			filterDao.delFilter(relationItemvo.getFilterID());
		}
		
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delRelationDefineItems(String relationID) {
		FilterDAOMapper filterDao = metaDataSqlSessionTemplate.getMapper(FilterDAOMapper.class);
		filterDao.delRelationFilters(relationID);
		
		RelationItemDAOMapper relationItemDao = metaDataSqlSessionTemplate.getMapper(RelationItemDAOMapper.class);
		relationItemDao.delRelationDefineItems(relationID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delOjbectRelationItems(String ownerObjID, String ownerObjType) {
		FilterDAOMapper filterDao = metaDataSqlSessionTemplate.getMapper(FilterDAOMapper.class);
		Map<String,String> filterParams = new HashMap<String,String>();
		filterParams.put("ownerObjID", ownerObjID);
		filterParams.put("ownerObjType", ownerObjType);
		filterDao.delOjbectRelationFilters(filterParams);
		
		RelationItemDAOMapper relationItemDao = metaDataSqlSessionTemplate.getMapper(RelationItemDAOMapper.class);
		Map<String,String> params = new HashMap<String,String>();
		params.put("ownerObjID", ownerObjID);
		params.put("ownerObjType", ownerObjType);
		relationItemDao.delOjbectRelationItems(params);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public RelationItemVO getRelationItem(String fduRelationItemID) {
		RelationItemDAOMapper relationItemDao = metaDataSqlSessionTemplate.getMapper(RelationItemDAOMapper.class);
		RelationItemVO vo = relationItemDao.getRelationItem(fduRelationItemID);
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<RelationItemVO> getRelationItems(String relationID) {
		RelationItemDAOMapper relationItemDao = metaDataSqlSessionTemplate.getMapper(RelationItemDAOMapper.class);
		List<RelationItemVO> vos = relationItemDao.getRelationItems(relationID);
		List<RelationItemVO> itemList = new ArrayList<RelationItemVO>();
		if (vos != null && vos.size() > 0){
			FilterDAOMapper filterDao = metaDataSqlSessionTemplate.getMapper(FilterDAOMapper.class);
			for (int i = 0; i < vos.size(); i++){
				RelationItemVO itemvo = (RelationItemVO) vos.get(i);
				FilterVO filterVO = filterDao.getFilter(itemvo.getFilterID());
				itemvo.setFiltervo(filterVO);
				itemList.add(itemvo);
			}
		}
		
		return itemList;
	}

}
