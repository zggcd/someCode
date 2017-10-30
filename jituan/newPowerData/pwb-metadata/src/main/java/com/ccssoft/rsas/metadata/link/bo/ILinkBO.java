package com.ccssoft.rsas.metadata.link.bo;

import java.util.List;

import com.ccssoft.rsas.metadata.link.model.LinkVO;

public interface ILinkBO {
	
	public int addLink(LinkVO link);
	
	public int updateLink(LinkVO link);
	
	public int delLink(String fduLinkID);
	
	public LinkVO getLink(String fduLinkID);
	
	public List<LinkVO> getLinks();
	
	public List<LinkVO> isUse(String fduLinkID);

}
