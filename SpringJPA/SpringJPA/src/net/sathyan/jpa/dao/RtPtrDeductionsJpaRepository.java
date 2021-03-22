package net.sathyan.jpa.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.cdi.Eager ;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository ;

import net.sathyan.model.RtPtrDeductions;

/**
 * Repository : RtPtrDeductions.
 */
@Repository
@Eager
public interface RtPtrDeductionsJpaRepository
    extends StaffTrackRepository<RtPtrDeductions, Long>
{
	//public List<RtPtrDeductions> getPtrDeductions(Long officeId, Long schedWkPayrollId, boolean isMidWkTransmit, Long midWkDataId, Long weekNo, Long yearNo, Long sharedPayGrpId);
	
	@Query(value="SELECT sum(pay_amount) FROM RT_PTR_DEDUCTIONS WHERE deduction_type = ? "
			+ " and sched_Week_payroll_id = ? and spg_transmit_mapping_id = ? "
			+ " and mid_Week_data_id = ? ", nativeQuery=true)
	public Float findReimbursementAmount(String deductionType, Long swpId, Long spgId, Long mwtId);
	
	@Query(value="SELECT sum(bill_amount) FROM RT_PTR_DEDUCTIONS WHERE deduction_type <> 'MultiStep (Billing)' "
			+ " and sched_Week_payroll_id = ? and spg_transmit_mapping_id = ? "
			+ " and mid_Week_data_id = ? ", nativeQuery=true)
	public Float findAssocLevelBilling(Long swpId, Long spgId, Long mwtId);
	
	}

	

}
