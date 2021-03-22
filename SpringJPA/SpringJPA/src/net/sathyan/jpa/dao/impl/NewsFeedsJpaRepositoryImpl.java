package net.sathyan.jpa.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import net.sathyan.jpa.dao.GenericSpringRepository;
import net.sathyan.model.DocMangDocs;
import net.sathyan.model.NewsFeedVO;
import net.sathyan.model.NewsFeeds;

@Repository
public class NewsFeedsJpaRepositoryImpl 
extends StaffTrackRepositoryImpl<NewsFeeds, Long>
implements GenericSpringRepository  {

	@Override
	public List<NewsFeedVO> findNewsFeed() {
		StringBuilder selectSQL = null;
		List resultsList = null;
		try
		{
			String sql = "SELECT  news_Feed_Id as id, story as content FROM   news_feeds where news_feed_id = ?param ";
			
			Map hm = new HashMap<String, Object>();				
			hm.put("param", 1L);
			
			resultsList = executeNativeQueryMapResults(sql, hm, "findNewsFeedMapping");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			selectSQL = null;
		}
		return resultsList;
	}

	
	@Override
	public List<DocMangDocs> findAllDocument() {
		StringBuilder selectSQL = null;
		List resultsList = null;
		try
		{
			String sql = " SELECT " +
					" a.associate_document_id AS associateDocumentId, " + 
					" document as doc" +
					" FROM " + 
					"  doc_mang_docs              a, " + 
					" associate_documents        b, " + 
					" office_documents d, " + 
					" associate_office_records   c " + 
					" WHERE " + 
					" a.associate_document_id = b.associate_document_id " + 
					" AND b.associate_office_record_id = c.associate_office_record_id " + 
					" AND b.office_document_id = d.office_document_id " + 
					" AND c.office_id  = d.office_id " + 
					" AND document is not null " + 
					" AND Length(document) > 0 " + 
					" AND d.is_active = 'Y' " + 
					" AND b.is_archived = 'N' " + 
					" AND d.office_id = 666 "; 
			
			Map hm = new HashMap<String, Object>();				
			//hm.put("param", 1L);
			
			resultsList = executeNativeQueryMapResults(sql, hm, "assocDoc");
			
			return resultsList;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			selectSQL = null;
		}
		return resultsList;
	}
	
	


}
