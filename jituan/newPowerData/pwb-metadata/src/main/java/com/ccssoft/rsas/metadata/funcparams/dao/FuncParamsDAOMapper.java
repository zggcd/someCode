package com.ccssoft.rsas.metadata.funcparams.dao;

import java.util.List;
import java.util.Map;

import com.ccssoft.rsas.metadata.funcparams.model.FuncParamsVO;

public interface FuncParamsDAOMapper {
	
	int addFuncParams(FuncParamsVO funcParams);
	
	int updateFuncParams(FuncParamsVO funcParams);
	
	int delFuncParams(Map params);
	
	FuncParamsVO getFuncParams(Map params);
	
	int delAllFuncParams(String functionID);
	
	List<FuncParamsVO> getFuncParamss(String functionID);

}
