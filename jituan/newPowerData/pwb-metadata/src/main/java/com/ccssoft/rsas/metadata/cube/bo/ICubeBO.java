package com.ccssoft.rsas.metadata.cube.bo;

import java.util.List;

import com.ccssoft.rsas.metadata.cube.model.CubeVO;

public interface ICubeBO {
	
	public int addCube(CubeVO cubevo);
	
	public int updateCube(CubeVO cubevo);
	
	public int delCube(String cubeID);
	
	public CubeVO getCube(String cubeID);
	
	public List<CubeVO> getCubes();

}
