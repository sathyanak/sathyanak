package net.sathyan.model;

import java.io.Serializable;
import java.math.BigDecimal;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Persistent class for entity stored in table "RT_PTR_DEDUCTIONS"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="RT_PTR_DEDUCTIONS", schema="PROD" )
// Define named queries here
public class RtPtrDeductions
    implements Serializable, Cloneable
{

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="RT_PTR_DEDUCTION_ID", nullable=false)
    @SequenceGenerator( name = "RtPtrDeductionssSeq", schema="PROD", sequenceName = "RT_PTR_DEDUCTIONS_SEQ", allocationSize = 1, initialValue = 1 )
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "RtPtrDeductionssSeq" )
    private Long       rtPtrDeductionId ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS
    //----------------------------------------------------------------------
    @Column(name="SCHED_WEEK_PAYROLL_ID")
    private Long       schedWeekPayrollId ;

    @Column(name="OFFICE_ID")
    private Long       officeId     ;

    @Column(name="IS_MID_WK_TRANSMIT", length=1)
    private String     isMidWkTransmit ;

    @Column(name="MID_WEEK_DATA_ID")
    private Long       midWeekDataId ;

    @Column(name="SCHED_WEEK_ID")
    private Long       schedWeekId  ;

    @Column(name="WEEK_NO")
    private Long       weekNo       ;

    @Column(name="YEAR_NO")
    private Long       yearNo       ;

    @Column(name="DEDUCTION_TYPE", length=30)
    private String     deductionType ;

    @Column(name="WORK_ORDER_NUMBER", length=14)
    private String     workOrderNumber ;

    @Column(name="WORK_ORDER_REFERENCE", length=30)
    private String     workOrderReference ;

    @Column(name="DEDUCTIONS_COUNT")
    private Long       deductionsCount ;

    @Column(name="PAY_AMOUNT")
    private BigDecimal       payAmount    ;

    @Column(name="BILL_AMOUNT")
    private BigDecimal       billAmount   ;

    @Column(name="SHARED_PAYROLL_GROUP_ID")
    private Long       sharedPayrollGroupId ;

    @Column(name="SPG_TRANSMIT_MAPPING_ID")
    private Long       spgTransmitMappingId ;    

    @Column(name="LT_DEDUCT_BILL_TYPE_DESC", length=30)
    private String     ltDeductBillTypeDesc ;

    @Column(name="SCHED_WEEK_PAYROLL_PTR_ID")
    private Long       schedWeekPayrollPtrId ;
    
    @Column(name="IS_HHC", length=1)
    private String     isHhc ;

    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public RtPtrDeductions() {
        super();
    }

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setRtPtrDeductionId( Long rtPtrDeductionId ) {
        this.rtPtrDeductionId = rtPtrDeductionId ;
    }
    public Long getRtPtrDeductionId() {
        return this.rtPtrDeductionId;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : SCHED_WEEK_PAYROLL_ID ( NUMBER )
    public void setSchedWeekPayrollId( Long schedWeekPayrollId ) {
        this.schedWeekPayrollId = schedWeekPayrollId;
    }
    public Long getSchedWeekPayrollId() {
        return this.schedWeekPayrollId;
    }

    //--- DATABASE MAPPING : OFFICE_ID ( NUMBER )
    public void setOfficeId( Long officeId ) {
        this.officeId = officeId;
    }
    public Long getOfficeId() {
        return this.officeId;
    }

    //--- DATABASE MAPPING : IS_MID_WK_TRANSMIT ( CHAR )
    public void setIsMidWkTransmit( String isMidWkTransmit ) {
        this.isMidWkTransmit = isMidWkTransmit;
    }
    public String getIsMidWkTransmit() {
        return this.isMidWkTransmit;
    }

    //--- DATABASE MAPPING : MID_WEEK_DATA_ID ( NUMBER )
    public void setMidWeekDataId( Long midWeekDataId ) {
        this.midWeekDataId = midWeekDataId;
    }
    public Long getMidWeekDataId() {
        return this.midWeekDataId;
    }

    //--- DATABASE MAPPING : SCHED_WEEK_ID ( NUMBER )
    public void setSchedWeekId( Long schedWeekId ) {
        this.schedWeekId = schedWeekId;
    }
    public Long getSchedWeekId() {
        return this.schedWeekId;
    }

    //--- DATABASE MAPPING : WEEK_NO ( NUMBER )
    public void setWeekNo( Long weekNo ) {
        this.weekNo = weekNo;
    }
    public Long getWeekNo() {
        return this.weekNo;
    }

    //--- DATABASE MAPPING : YEAR_NO ( NUMBER )
    public void setYearNo( Long yearNo ) {
        this.yearNo = yearNo;
    }
    public Long getYearNo() {
        return this.yearNo;
    }

    //--- DATABASE MAPPING : DEDUCTION_TYPE ( VARCHAR2 )
    public void setDeductionType( String deductionType ) {
        this.deductionType = deductionType;
    }
    public String getDeductionType() {
        return this.deductionType;
    }

    //--- DATABASE MAPPING : WORK_ORDER_NUMBER ( VARCHAR2 )
    public void setWorkOrderNumber( String workOrderNumber ) {
        this.workOrderNumber = workOrderNumber;
    }
    public String getWorkOrderNumber() {
        return this.workOrderNumber;
    }

    //--- DATABASE MAPPING : WORK_ORDER_REFERENCE ( VARCHAR2 )
    public void setWorkOrderReference( String workOrderReference ) {
        this.workOrderReference = workOrderReference;
    }
    public String getWorkOrderReference() {
        return this.workOrderReference;
    }

    //--- DATABASE MAPPING : DEDUCTIONS_COUNT ( NUMBER )
    public void setDeductionsCount( Long deductionsCount ) {
        this.deductionsCount = deductionsCount;
    }
    public Long getDeductionsCount() {
        return this.deductionsCount;
    }

    //--- DATABASE MAPPING : PAY_AMOUNT ( NUMBER )
    public void setPayAmount( BigDecimal payAmount ) {
        this.payAmount = payAmount;
    }
    public BigDecimal getPayAmount() {
        return this.payAmount;
    }

    //--- DATABASE MAPPING : BILL_AMOUNT ( NUMBER )
    public void setBillAmount( BigDecimal billAmount ) {
        this.billAmount = billAmount;
    }
    public BigDecimal getBillAmount() {
        return this.billAmount;
    }

    //--- DATABASE MAPPING : SHARED_PAYROLL_GROUP_ID ( NUMBER )
    public void setSharedPayrollGroupId( Long sharedPayrollGroupId ) {
        this.sharedPayrollGroupId = sharedPayrollGroupId;
    }
    public Long getSharedPayrollGroupId() {
        return this.sharedPayrollGroupId;
    }

    //--- DATABASE MAPPING : SPG_TRANSMIT_MAPPING_ID ( NUMBER )
    public void setSpgTransmitMappingId( Long spgTransmitMappingId ) {
        this.spgTransmitMappingId = spgTransmitMappingId;
    }
    public Long getSpgTransmitMappingId() {
        return this.spgTransmitMappingId;
    }
    
    //--- DATABASE MAPPING : LT_DEDUCT_BILL_TYPE_DESC ( VARCHAR2 )
    public void setLtDeductBillTypeDesc( String ltDeductBillTypeDesc ) {
        this.ltDeductBillTypeDesc = ltDeductBillTypeDesc;
    }
    public String getLtDeductBillTypeDesc() {
        return this.ltDeductBillTypeDesc;
    }
    
    //--- DATABASE MAPPING : SCHED_WEEK_PAYROLL_PTR_ID ( NUMBER )
    public void setSchedWeekPayrollPtrId( Long schedWeekPayrollPtrId ) {
        this.schedWeekPayrollPtrId = schedWeekPayrollPtrId;
    }
    public Long getSchedWeekPayrollPtrId() {
        return this.schedWeekPayrollPtrId;
    }
    
    //--- DATABASE MAPPING : IS_HHC ( CHAR )
    public void setIsHhc( String isHhc ) {
        this.isHhc = isHhc;
    }
    public String getIsHhc() {
        return this.isHhc;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(rtPtrDeductionId);
        sb.append("]:"); 
        sb.append(schedWeekPayrollId);
        sb.append("|");
        sb.append(officeId);
        sb.append("|");
        sb.append(isMidWkTransmit);
        sb.append("|");
        sb.append(midWeekDataId);
        sb.append("|");
        sb.append(schedWeekId);
        sb.append("|");
        sb.append(weekNo);
        sb.append("|");
        sb.append(yearNo);
        sb.append("|");
        sb.append(deductionType);
        sb.append("|");
        sb.append(workOrderNumber);
        sb.append("|");
        sb.append(workOrderReference);
        sb.append("|");
        sb.append(deductionsCount);
        sb.append("|");
        sb.append(payAmount);
        sb.append("|");
        sb.append(billAmount);
        sb.append("|");
        sb.append(sharedPayrollGroupId);
        sb.append("|");
        sb.append(spgTransmitMappingId);
        sb.append("|");
        sb.append(ltDeductBillTypeDesc);
        sb.append("|");
        sb.append(schedWeekPayrollPtrId);
        sb.append("|");
        sb.append(isHhc);
        return sb.toString(); 
    } 



    //----------------------------------------------------------------------
    // clone METHOD
    //----------------------------------------------------------------------
    public RtPtrDeductions clone()
        throws CloneNotSupportedException
    {
        RtPtrDeductions clone = (RtPtrDeductions)super.clone();

        return clone;
    }
}
