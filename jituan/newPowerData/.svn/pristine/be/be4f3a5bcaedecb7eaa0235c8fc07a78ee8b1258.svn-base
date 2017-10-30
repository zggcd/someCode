package com.ccssoft.rsas.metadata.link.bo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccssoft.rsas.metadata.dbtype.dao.DatabaseTypeDAOMapper;
import com.ccssoft.rsas.metadata.dbtype.model.DatabaseTypeVO;
import com.ccssoft.rsas.metadata.link.dao.LinkDAOMapper;
import com.ccssoft.rsas.metadata.link.model.LinkVO;
import com.ccssoft.rsas.metadata.table.dao.TableDAOMapper;
import com.ccssoft.rsas.metadata.table.model.TableVO;

@Component("pwb_linkBOImpl")
public class LinkBOImpl implements ILinkBO{
	@Resource
    private SqlSessionTemplate metaDataSqlSessionTemplate; // 源数据数据源会话模板

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int addLink(LinkVO link) {
		LinkDAOMapper linkDao = metaDataSqlSessionTemplate.getMapper(LinkDAOMapper.class);
		linkDao.addLink(link);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateLink(LinkVO link) {
		LinkDAOMapper linkDao = metaDataSqlSessionTemplate.getMapper(LinkDAOMapper.class);
		linkDao.updateLink(link);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delLink(String fduLinkID) {
		LinkDAOMapper linkDao = metaDataSqlSessionTemplate.getMapper(LinkDAOMapper.class);
		linkDao.delLink(fduLinkID);
		return 1;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public LinkVO getLink(String fduLinkID) {
		LinkDAOMapper linkDao = metaDataSqlSessionTemplate.getMapper(LinkDAOMapper.class);
		LinkVO vo = linkDao.getLink(fduLinkID);
		return vo;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<LinkVO> getLinks() {
		LinkDAOMapper linkDao = metaDataSqlSessionTemplate.getMapper(LinkDAOMapper.class);
		List<LinkVO> vos = linkDao.getLinks();
		List<LinkVO> linkVOlist = new ArrayList<LinkVO>();
		if(vos!=null && vos.size()>0){
			DatabaseTypeDAOMapper databaseTypeDAO = metaDataSqlSessionTemplate.getMapper(DatabaseTypeDAOMapper.class);
			for(int i=0;i<vos.size();i++){
				LinkVO linkVO = vos.get(i);
				DatabaseTypeVO dbtypevo = databaseTypeDAO.getDbType(linkVO.getDatabaseTypeID());
				
				if(dbtypevo!=null){
					if(!("Spark".equalsIgnoreCase(dbtypevo.getName()))){
						String url = dbtypevo.getJdbcURL();
						url = url.replaceAll("%HOST%", linkVO.getHost());
						url = url.replaceAll("%PORT%", Integer.toString(linkVO
								.getPort()));
						url = url.replaceAll("%DB%", linkVO.getDatabaseName());
						dbtypevo.setJdbcURL(url);
					}
					
					linkVO.setDatabaseType(dbtypevo);
					
					if("Spark".equalsIgnoreCase(dbtypevo.getName())){
						TableDAOMapper tableDao = metaDataSqlSessionTemplate.getMapper(TableDAOMapper.class);
						Map<String, String> paramMap = new HashMap<String, String>();
						paramMap.put("objectID", linkVO.getLinkID());
						paramMap.put("objectType", "L");
						List<TableVO> tableList = tableDao.getTables(paramMap);
						linkVO.setDbTable(tableList);
					}
				}
				
				linkVOlist.add(linkVO);
			}
		}
		
		return linkVOlist;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public List<LinkVO> isUse(String fduLinkID) {
		// TODO Auto-generated method stub
		return null;
	}

}
