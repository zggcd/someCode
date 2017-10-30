package com.ccssoft.rsas.metadata.funcparams.bo;

import java.util.List;

import com.ccssoft.rsas.metadata.funcparams.model.FuncParamsVO;

public interface IFuncParamsBO {
	
	public int addFuncParams(FuncParamsVO funcParams);
	
	public int updateFuncParams(FuncParamsVO funcParams);
	
	public int delFuncParams(String fduFunctionID,int fdiParamsNO);
	
	public FuncParamsVO getFuncParams(String fduFunctionID,int fdiParamsNO);
	
	public int delAllFuncParams(String functionID);
	
	public List<FuncParamsVO> getFuncParamss(String functionID);

}
