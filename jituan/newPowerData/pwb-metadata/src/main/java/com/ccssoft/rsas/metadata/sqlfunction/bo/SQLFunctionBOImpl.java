package com.ccssoft.rsas.metadata.sqlfunction.bo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.metadata.funcparams.dao.FuncParamsDAOMapper;
import com.ccssoft.rsas.metadata.funcparams.model.FuncParamsVO;
import com.ccssoft.rsas.metadata.sqlfunction.dao.SQLFunctionDAOMapper;
import com.ccssoft.rsas.metadata.sqlfunction.model.SQLFunctionVO;

@Component("pwb_SQLFunctionBOImpl")
public class SQLFunctionBOImpl implements ISQLFunctionBO{
	
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addFunction(SQLFunctionVO function) {
		SQLFunctionDAOMapper SQLFunctionDao = metaDataSqlSessionTemplate.getMapper(SQLFunctionDAOMapper.class);
		SQLFunctionDao.addFunction(function);
		
		FuncParamsDAOMapper funcParamsDao = metaDataSqlSessionTemplate.getMapper(FuncParamsDAOMapper.class);
		funcParamsDao.delAllFuncParams(function.getFunctionID());
		List<FuncParamsVO> plist = function.getFuncParams();
		for (int i = 0; plist != null && i < plist.size(); i++){
           FuncParamsVO fpov = (FuncParamsVO) plist.get(i);
           funcParamsDao.addFuncParams(fpov);
        }
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateFunction(SQLFunctionVO function) {
		SQLFunctionDAOMapper SQLFunctionDao = metaDataSqlSessionTemplate.getMapper(SQLFunctionDAOMapper.class);
		SQLFunctionDao.updateFunction(function);
		
		FuncParamsDAOMapper funcParamsDao = metaDataSqlSessionTemplate.getMapper(FuncParamsDAOMapper.class);
		funcParamsDao.delAllFuncParams(function.getFunctionID());
		List<FuncParamsVO> plist = function.getFuncParams();
		for (int i = 0; plist != null && i < plist.size(); i++){
           FuncParamsVO fpov = (FuncParamsVO) plist.get(i);
           funcParamsDao.addFuncParams(fpov);
        }
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delFunction(String fduFunctionID) {
		SQLFunctionDAOMapper SQLFunctionDao = metaDataSqlSessionTemplate.getMapper(SQLFunctionDAOMapper.class);
		SQLFunctionDao.delFunction(fduFunctionID);
		
		FuncParamsDAOMapper funcParamsDao = metaDataSqlSessionTemplate.getMapper(FuncParamsDAOMapper.class);
		funcParamsDao.delAllFuncParams(fduFunctionID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public SQLFunctionVO getFunction(String fduFunctionID) {
		SQLFunctionDAOMapper SQLFunctionDao = metaDataSqlSessionTemplate.getMapper(SQLFunctionDAOMapper.class);
		SQLFunctionVO vo = SQLFunctionDao.getFunction(fduFunctionID);
		
		if(vo!=null){
			FuncParamsDAOMapper funcParamsDao = metaDataSqlSessionTemplate.getMapper(FuncParamsDAOMapper.class);
			List<FuncParamsVO> pvo = funcParamsDao.getFuncParamss(fduFunctionID);
			vo.setFuncParams(pvo);
		}
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<SQLFunctionVO> getFunctions() {
		SQLFunctionDAOMapper SQLFunctionDao = metaDataSqlSessionTemplate.getMapper(SQLFunctionDAOMapper.class);
		List<SQLFunctionVO> vos = SQLFunctionDao.getFunctions();
		List<SQLFunctionVO> volist = new ArrayList<SQLFunctionVO>();
		if(vos!=null && vos.size()>0){
			FuncParamsDAOMapper funcParamsDao = metaDataSqlSessionTemplate.getMapper(FuncParamsDAOMapper.class);
			for(int i=0;i<vos.size();i++){
				SQLFunctionVO fvo = vos.get(i);
				List<FuncParamsVO> pvo = funcParamsDao.getFuncParamss(fvo.getFunctionID());
				fvo.setFuncParams(pvo);
				volist.add(fvo);
			}
		}
		return volist;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public SQLFunctionVO getFunctionByDBType(String fduFunctionID, String databaseTypeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
