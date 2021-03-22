

package net.sathyan.jpa.dao;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.sathyan.model.NewsFeeds;

/**
 * Repository : NewsFeeds.
 */

@Repository
public interface NewsFeedsJpaRepository
    extends StaffTrackRepository<NewsFeeds, Long>
{
	
	List<NewsFeeds> findByNewsFeedType(String newsFeedType);	
	
	@Query("SELECT n FROM NewsFeeds n Order By n.headline ")
	List<NewsFeeds> findOrderedNewsFeed();
	
	@Query(value="SELECT head_line, APPROVED_USER_ID FROM News_Feeds n Order By n.headline ", nativeQuery=true)
	List<NewsFeeds> findNewFeedNative();
	
		
	
}
