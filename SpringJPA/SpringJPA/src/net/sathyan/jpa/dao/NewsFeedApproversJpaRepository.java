

package net.sathyan.jpa.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import net.sathyan.model.NewsFeedApprovers;

/**
 * Repository : NewsFeedApprovers.
 */
@Repository
public interface NewsFeedApproversJpaRepository
    extends StaffTrackRepository<NewsFeedApprovers, BigDecimal>
{
		public List<NewsFeedApprovers> findByNewsFeedType(String newsFeedType);		
		public List<NewsFeedApprovers> findByNewsFeedTypeAndApproverUserId(String newsFeedType, Long approverUserId);
		
		//Example to call a Stored PROC.
		@Procedure("PROC_GEN_CPU_INCENTIVE_PAYOUT")
		void generataIncentivePayout(Long officeId, Long schedWeekId, String isMW);
		
}
