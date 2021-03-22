
package net.sathyan.jpa.dao;

import java.util.List;

import net.sathyan.model.DocMangDocs;
import net.sathyan.model.NewsFeedVO;



public interface GenericSpringRepository
{
	List<NewsFeedVO> findNewsFeed();
	
	public List<DocMangDocs> findAllDocument();
}
