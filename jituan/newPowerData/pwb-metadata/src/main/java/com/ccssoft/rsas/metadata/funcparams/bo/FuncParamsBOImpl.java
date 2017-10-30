package com.ccssoft.rsas.metadata.funcparams.bo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.metadata.funcparams.dao.FuncParamsDAOMapper;
import com.ccssoft.rsas.metadata.funcparams.model.FuncParamsVO;

@Component("pwb_funcParamsBOImpl")
public class FuncParamsBOImpl implements IFuncParamsBO{
	
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addFuncParams(FuncParamsVO funcParams) {
		FuncParamsDAOMapper funcParamsDao = metaDataSqlSessionTemplate.getMapper(FuncParamsDAOMapper.class);
		funcParamsDao.addFuncParams(funcParams);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateFuncParams(FuncParamsVO funcParams) {
		FuncParamsDAOMapper funcParamsDao = metaDataSqlSessionTemplate.getMapper(FuncParamsDAOMapper.class);
		funcParamsDao.updateFuncParams(funcParams);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delFuncParams(String fduFunctionID, int fdiParamsNO) {
		FuncParamsDAOMapper funcParamsDao = metaDataSqlSessionTemplate.getMapper(FuncParamsDAOMapper.class);
		Map params = new HashMap();
		params.put("functionID",fduFunctionID);
		params.put("paramsNO", fdiParamsNO);
		funcParamsDao.delFuncParams(params);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public FuncParamsVO getFuncParams(String fduFunctionID, int fdiParamsNO) {
		FuncParamsDAOMapper funcParamsDao = metaDataSqlSessionTemplate.getMapper(FuncParamsDAOMapper.class);
		Map params = new HashMap();
		params.put("functionID",fduFunctionID);
		params.put("paramsNO", fdiParamsNO);
		FuncParamsVO vo = funcParamsDao.getFuncParams(params);
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delAllFuncParams(String functionID) {
		FuncParamsDAOMapper funcParamsDao = metaDataSqlSessionTemplate.getMapper(FuncParamsDAOMapper.class);
		funcParamsDao.delAllFuncParams(functionID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<FuncParamsVO> getFuncParamss(String functionID) {
		FuncParamsDAOMapper funcParamsDao = metaDataSqlSessionTemplate.getMapper(FuncParamsDAOMapper.class);
		List<FuncParamsVO> vos = funcParamsDao.getFuncParamss(functionID);
		return vos;
	}

}
