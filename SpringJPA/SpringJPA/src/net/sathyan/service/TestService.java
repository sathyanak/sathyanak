package net.sathyan.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sathyan.jpa.dao.GenericSpringRepository;
import net.sathyan.jpa.dao.NewsFeedApproversJpaRepository;
import net.sathyan.jpa.dao.NewsFeedsJpaRepository;
import net.sathyan.jpa.dao.RtPtrDeductionsJpaRepository;
import net.sathyan.model.NewsFeedApprovers;
import net.sathyan.model.NewsFeedVO;
import net.sathyan.model.NewsFeeds;

@Service("testService")
public class TestService {
	
	@Autowired
	private NewsFeedsJpaRepository newsFeedsJpaRepository;
	
	@Autowired
	private NewsFeedApproversJpaRepository newsFeedApproversJpaRepository;
	
	@Autowired
	private RtPtrDeductionsJpaRepository rtPtrDeductionsJpaRepository;
	
	@Autowired
	private GenericSpringRepository genericSpringRepository;
	
	public void test() {
		
		
		/**
		 * Ways to write JPA Queries
		 * 
		 * In the default repo use the Spring JPA built in queries FOR EX findByFirstName
		 * In the Entity use the named Query or NAtive Query and call the named query from the entiyManager or StafftrackJP Impl. 
		 * In the default repo use the @Query (NAtive or otherwise)
		 * If Complex Query, map the result set (defined in an entity) and then use it in the Impl.
		 * 
		 * 
		 */
		
		/*
		List<NewsFeeds> newsfeed = newsFeedsJpaRepository.findAll();
		
		List<NewsFeedApprovers> a = newsFeedApproversJpaRepository.findAll();
		
		//Built In Query with FindBy
		newsfeed = newsFeedsJpaRepository.findByNewsFeedType("O");
		
		//Call a Stored PROC
		newsFeedApproversJpaRepository.generataIncentivePayout(1L, 1L, "N");
		
		//Call a mapped Custom Result Set.
		List<NewsFeedVO> list = genericSpringRepository.findNewsFeed();
		
		List<NewsFeeds> simple = newsFeedsJpaRepository.findByNewsFeedType("N");
		
		
		//Call a JPQL Query
		List<NewsFeeds> orderedList = newsFeedsJpaRepository.findOrderedNewsFeed();
		
		//Call a native Query One Entity
		List<NewsFeeds> nativeList = newsFeedsJpaRepository.findOrderedNewsFeed();
		
		//List<DocMangDocs> dmd =  genericSpringRepository.findAllDocument();
		
		//T
		*/
		Float ans = rtPtrDeductionsJpaRepository.findReimbursementAmount("Regular", 131992L, -1L, -1L);
		
		Float billing = rtPtrDeductionsJpaRepository.findAssocLevelBilling(131992L, -1L, -1L);
		
		System.out.println("Sathyan");
    }

}
