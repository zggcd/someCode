package com.ccssoft.rsas.metadata.cube.dao;

import java.util.List;

import com.ccssoft.rsas.metadata.cube.model.CubeVO;

public interface CubeDAOMapper {

	int addCube(CubeVO cubevo);
	
	int updateCube(CubeVO cubevo);
	
	int delCube(String cubeID);
	
	CubeVO getCube(String cubeID);
	
	List<CubeVO> getCubes();
}