package com.ccssoft.rsas.metadata.relation.bo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.metadata.relation.dao.RelationDAOMapper;
import com.ccssoft.rsas.metadata.relation.model.RelationVO;
import com.ccssoft.rsas.metadata.relationitem.dao.RelationItemDAOMapper;
import com.ccssoft.rsas.metadata.relationitem.model.RelationItemVO;

@Component("pwb_relationBOImpl")
public class RelationBOImpl implements IRelationBO{
	
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addRelation(RelationVO relation) {
		RelationDAOMapper relationDao = metaDataSqlSessionTemplate.getMapper(RelationDAOMapper.class);
		relationDao.addRelation(relation);
		
		List<RelationItemVO> itemList = relation.getRelationItems();
		if( itemList != null && itemList.size() > 0){
			RelationItemDAOMapper relationItemDao = metaDataSqlSessionTemplate.getMapper(RelationItemDAOMapper.class);
			for(int i = 0 ; i < itemList.size(); i++ ){
				RelationItemVO relationItem = (RelationItemVO)itemList.get(i);
				relationItemDao.addRelationItem(relationItem);
			}
		}
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateRelation(RelationVO relation) {
		RelationDAOMapper relationDao = metaDataSqlSessionTemplate.getMapper(RelationDAOMapper.class);
		relationDao.updateRelation(relation);
		
		RelationItemDAOMapper relationItemDao = metaDataSqlSessionTemplate.getMapper(RelationItemDAOMapper.class);
		relationItemDao.delRelationDefineItems(relation.getRelationID());
		List<RelationItemVO> itemList = relation.getRelationItems();
		if( itemList != null && itemList.size() > 0){
			for(int i = 0 ; i < itemList.size(); i++ ){
				RelationItemVO relationItem = (RelationItemVO)itemList.get(i);
				relationItemDao.addRelationItem(relationItem);
			}
		}
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delRelation(String fduRelationID) {
		RelationDAOMapper relationDao = metaDataSqlSessionTemplate.getMapper(RelationDAOMapper.class);
		relationDao.delRelation(fduRelationID);
		
		RelationItemDAOMapper relationItemDao = metaDataSqlSessionTemplate.getMapper(RelationItemDAOMapper.class);
		relationItemDao.delRelationDefineItems(fduRelationID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delObjectRelation(String ownerObjID, String ownerObjType) {
		RelationItemDAOMapper relationItemDao = metaDataSqlSessionTemplate.getMapper(RelationItemDAOMapper.class);
		Map<String,String> itemParams = new HashMap<String,String>();
		itemParams.put("ownerObjID", ownerObjID);
		itemParams.put("ownerObjType", ownerObjType);
		relationItemDao.delOjbectRelationItems(itemParams);
		
		RelationDAOMapper relationDao = metaDataSqlSessionTemplate.getMapper(RelationDAOMapper.class);
		Map<String,String> params = new HashMap<String,String>();
		params.put("ownerObjID", ownerObjID);
		params.put("ownerObjType", ownerObjType);
		relationDao.delObjectRelation(params);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public RelationVO getRelation(String relationID) {
		RelationDAOMapper relationDao = metaDataSqlSessionTemplate.getMapper(RelationDAOMapper.class);
		RelationVO vo = relationDao.getRelation(relationID);
		
		if(vo!=null){
			RelationItemDAOMapper relationItemDao = metaDataSqlSessionTemplate.getMapper(RelationItemDAOMapper.class);
			List<RelationItemVO> itemList = relationItemDao.getRelationItems(relationID);
			vo.setRelationItems(itemList);
		}
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public RelationVO getOjbectRelation(String ownerObjID, String ownerObjType) {
		RelationDAOMapper relationDao = metaDataSqlSessionTemplate.getMapper(RelationDAOMapper.class);
		Map<String,String> params = new HashMap<String,String>();
		params.put("ownerObjID", ownerObjID);
		params.put("ownerObjType", ownerObjType);
		RelationVO vo = relationDao.getOjbectRelation(params);
		
		if(vo!=null){
			RelationItemDAOMapper relationItemDao = metaDataSqlSessionTemplate.getMapper(RelationItemDAOMapper.class);
			List<RelationItemVO> itemList = relationItemDao.getRelationItems(vo.getRelationID());
			vo.setRelationItems(itemList);
		}
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<RelationVO> getRelations(String ownerObjType) {
		RelationDAOMapper relationDao = metaDataSqlSessionTemplate.getMapper(RelationDAOMapper.class);
		List<RelationVO> vos = relationDao.getRelations(ownerObjType);
		
		List<RelationVO> relationList = new ArrayList<RelationVO>();
		if(vos!=null && vos.size()>0){
			RelationItemDAOMapper relationItemDao = metaDataSqlSessionTemplate.getMapper(RelationItemDAOMapper.class);
			for (int i = 0 ;  i < vos.size(); i++){
				RelationVO relation = (RelationVO) vos.get(i);
				if(relation != null){
					List<RelationItemVO> itemList = relationItemDao.getRelationItems(relation.getRelationID());
					relation.setRelationItems(itemList);
					relationList.add(relation);
				}
			}
		}
		return relationList;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<RelationVO> QueryAllRelations() {
		RelationDAOMapper relationDao = metaDataSqlSessionTemplate.getMapper(RelationDAOMapper.class);
		List<RelationVO> vos = relationDao.QueryAllRelations();
		return vos;
	}

}
