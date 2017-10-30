package com.ccssoft.rsas.metadata.fieldobject.bo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.metadata.fieldobject.dao.FieldObjectDAOMapper;
import com.ccssoft.rsas.metadata.fieldobject.model.FieldObjectVO;

@Component("pwb_fieldObjectBOImpl")
public class FieldObjectBOImpl implements IFieldObjectBO{
	
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addFieldObject(FieldObjectVO fieldObject) {
		FieldObjectDAOMapper fieldObjectDao = metaDataSqlSessionTemplate.getMapper(FieldObjectDAOMapper.class);
		fieldObjectDao.addFieldObject(fieldObject);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateFieldObject(FieldObjectVO fieldObject) {
		FieldObjectDAOMapper fieldObjectDao = metaDataSqlSessionTemplate.getMapper(FieldObjectDAOMapper.class);
		fieldObjectDao.updateFieldObject(fieldObject);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delFieldObject(String fduFieldID) {
		FieldObjectDAOMapper fieldObjectDao = metaDataSqlSessionTemplate.getMapper(FieldObjectDAOMapper.class);
		fieldObjectDao.delFieldObject(fduFieldID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delFieldObjects(String[] fduFieldIDs) {
		
		StringBuffer sbuffer = new StringBuffer();
	    for(int i = 0 ; fduFieldIDs != null && i < fduFieldIDs.length ;i++){
	       if(sbuffer.length() == 0){
	          sbuffer.append("'" + fduFieldIDs[i] + "'");
	       }else{
	          sbuffer.append(",'" + fduFieldIDs[i] + "'");
	       }
	    }
	    Map<String,Object> mp = new HashMap<String,Object>();
		mp.put("fieldIDLst","("+sbuffer.toString()+")");
		FieldObjectDAOMapper fieldObjectDao = metaDataSqlSessionTemplate.getMapper(FieldObjectDAOMapper.class);
		fieldObjectDao.delFieldObjects(mp);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delFields(String condition) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delFields(String tableName, String fieldType) {
		FieldObjectDAOMapper fieldObjectDao = metaDataSqlSessionTemplate.getMapper(FieldObjectDAOMapper.class);
		Map<String,String> params = new HashMap<String,String>();
		params.put("tableName", tableName);
		params.put("fieldType", fieldType);
		fieldObjectDao.delFields(params);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delFieldsByqueryid(String tableCaption, String fieldType) {
		FieldObjectDAOMapper fieldObjectDao = metaDataSqlSessionTemplate.getMapper(FieldObjectDAOMapper.class);
		Map<String,String> params = new HashMap<String,String>();
		params.put("tableCaption", tableCaption);
		params.put("fieldType", fieldType);
		fieldObjectDao.delFieldsByqueryid(params);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delCubeFieldObjects(String fduCubeID) {
		FieldObjectDAOMapper fieldObjectDao = metaDataSqlSessionTemplate.getMapper(FieldObjectDAOMapper.class);
		fieldObjectDao.delCubeFieldObjects(fduCubeID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public FieldObjectVO getFieldObject(String fduFieldID) {
		FieldObjectDAOMapper fieldObjectDao = metaDataSqlSessionTemplate.getMapper(FieldObjectDAOMapper.class);
		FieldObjectVO vo = fieldObjectDao.getFieldObject(fduFieldID);
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<FieldObjectVO> getCubeFieldObjects(String fduCubeID) {
		FieldObjectDAOMapper fieldObjectDao = metaDataSqlSessionTemplate.getMapper(FieldObjectDAOMapper.class);
		List<FieldObjectVO> vos = fieldObjectDao.getCubeFieldObjects(fduCubeID);
		return vos;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public boolean isExist(String fieldID) {
		FieldObjectDAOMapper fieldObjectDao = metaDataSqlSessionTemplate.getMapper(FieldObjectDAOMapper.class);
		FieldObjectVO vo = fieldObjectDao.isExist(fieldID);
		boolean isExist = false;
		if(vo!=null){
			isExist = true;
		}
		return isExist;
	}

}
