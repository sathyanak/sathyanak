package net.sathyan.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.cdi.Eager ;
import org.springframework.stereotype.Repository ;

import net.sathyan.model.RtPtrAttendanceBonus;

/**
 * Repository : RtPtrAttendanceBonus.
 */
@Repository
@Eager
public interface RtPtrAttendanceBonusJpaRepository
    extends StaffTrackRepository<RtPtrAttendanceBonus, Long>
{
	//For the Hours, Pay, Bill
	@Query(value="SELECT sum(hours), sum (pay_amount) FROM RT_PTR_ATTENDANCE_BONUS WHERE description in ('Pay and Bill (CPU)', 'Pay Only') "
			+ " and sched_Week_payroll_id = ? and spg_transmit_mapping_id = ? and is_bonus = 'N' "
			+ " and mid_Week_data_id = ? ", nativeQuery=true)
	public Float findCpuHoursAndPay(String deductionType, Long swpId, Long spgId, Long mwtId);
	
	//For the Hours, Pay, Bill
	@Query(value="SELECT sum(hours), sum (bill_amount) FROM RT_PTR_ATTENDANCE_BONUS WHERE description in ('Pay and Bill (CPU)', 'Bill Only') "
			+ " and sched_Week_payroll_id = ? and spg_transmit_mapping_id = ? and is_bonus = 'N'"
			+ " and mid_Week_data_id = ? ", nativeQuery=true)
	public Float findCpuHoursAndBill(String deductionType, Long swpId, Long spgId, Long mwtId);
	
	
	//For the Hours, Pay, Bill
	@Query(value="SELECT sum(hours), sum (pay_amount) FROM RT_PTR_ATTENDANCE_BONUS WHERE description in ('Pay and Bill (Hourly)', 'Pay Only') "
			+ " and sched_Week_payroll_id = ? and spg_transmit_mapping_id = ? and is_bonus = 'N' "
			+ " and mid_Week_data_id = ? ", nativeQuery=true)
	public Float findRegHoursAndPay(String deductionType, Long swpId, Long spgId, Long mwtId);
	
	//For the Hours, Pay, Bill
	@Query(value="SELECT sum(hours), sum (bill_amount) FROM RT_PTR_ATTENDANCE_BONUS WHERE description in ('Pay and Bill (Hourly)', 'Bill Only') "
			+ " and sched_Week_payroll_id = ? and spg_transmit_mapping_id = ? and is_bonus = 'N' "
			+ " and mid_Week_data_id = ? ", nativeQuery=true)
	public Float findRegHoursAndBill(String deductionType, Long swpId, Long spgId, Long mwtId);
	
	
	@Query(value="SELECT sum(bill_amount) FROM RT_PTR_DEDUCTIONS WHERE deduction_type <> 'MultiStep (Billing)' "
			+ " and sched_Week_payroll_id = ? and spg_transmit_mapping_id = ? and is_bonus = 'N' "
			+ " and mid_Week_data_id = ? ", nativeQuery=true)
	public Float findAssocLevelBilling(Long swpId, Long spgId, Long mwtId);
}
