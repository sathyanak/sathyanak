/*
 * Created on 2018-05-31 ( Time 17:33:07 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
// This Bean has a basic Primary Key (not composite)

package model.valueobjects;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.math.BigDecimal;
import java.util.Date;



/**
 * Persistent class for entity stored in table "ASSOCIATE_PAY_RATES"
 *
 * @author Telosys Tools Generator
 *
 */


public class AssociatePayRates
    implements Serializable, Cloneable
{

    private static final long serialVersionUID = 1L;

   
    private Long       associatePayRateId ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS
    //----------------------------------------------------------------------
   
    private Long       associateOfficeRecordId ;

   
    private BigDecimal stPay        ;

   
    private BigDecimal otPay        ;

   
    private BigDecimal dtPay        ;

  
    private Long       effWeekFrom  ;


    private Long       effYearFrom  ;

   
    private BigDecimal newStPay     ;

 
    private BigDecimal newOtPay     ;

  
    private BigDecimal newDtPay     ;

  
    private Long       newEffWeekFrom ;

  
    private Long       newEffYearFrom ;

  
    private String     status       ;

   
   
    private Date       inactivationEffDate ;

   
    private Long       doApprovalUserId ;

   
    private Date       doApprovalDate ;

  
    private String     doApprovalStatus ;

   
    private Long       sdoApprovalUserId ;

  
    private Date       sdoApprovalDate ;

  
    private String     sdoApprovalStatus ;

   
    private Long       paApprovalUserId ;

  
    private Date       paApprovalDate ;

   
    private String     paApprovalStatus ;

  
    private Long       createdUserId ;

    
    private Date       createdDate  ;

   
    private Long updatedUserId ;

   
    private Date       updatedDate  ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public AssociatePayRates() {
        super();
    }

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setAssociatePayRateId( Long associatePayRateId ) {
        this.associatePayRateId = associatePayRateId ;
    }
    public Long getAssociatePayRateId() {
        return this.associatePayRateId;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : ASSOCIATE_OFFICE_RECORD_ID ( NUMBER )
    public void setAssociateOfficeRecordId( Long associateOfficeRecordId ) {
        this.associateOfficeRecordId = associateOfficeRecordId;
    }
    public Long getAssociateOfficeRecordId() {
        return this.associateOfficeRecordId;
    }

    //--- DATABASE MAPPING : ST_PAY ( NUMBER )
    public void setStPay( BigDecimal stPay ) {
        this.stPay = stPay;
    }
    public BigDecimal getStPay() {
        return this.stPay;
    }

    //--- DATABASE MAPPING : OT_PAY ( NUMBER )
    public void setOtPay( BigDecimal otPay ) {
        this.otPay = otPay;
    }
    public BigDecimal getOtPay() {
        return this.otPay;
    }

    //--- DATABASE MAPPING : DT_PAY ( NUMBER )
    public void setDtPay( BigDecimal dtPay ) {
        this.dtPay = dtPay;
    }
    public BigDecimal getDtPay() {
        return this.dtPay;
    }

    //--- DATABASE MAPPING : EFF_WEEK_FROM ( NUMBER )
    public void setEffWeekFrom( Long effWeekFrom ) {
        this.effWeekFrom = effWeekFrom;
    }
    public Long getEffWeekFrom() {
        return this.effWeekFrom;
    }

    //--- DATABASE MAPPING : EFF_YEAR_FROM ( NUMBER )
    public void setEffYearFrom( Long effYearFrom ) {
        this.effYearFrom = effYearFrom;
    }
    public Long getEffYearFrom() {
        return this.effYearFrom;
    }

    //--- DATABASE MAPPING : NEW_ST_PAY ( NUMBER )
    public void setNewStPay( BigDecimal newStPay ) {
        this.newStPay = newStPay;
    }
    public BigDecimal getNewStPay() {
        return this.newStPay;
    }

    //--- DATABASE MAPPING : NEW_OT_PAY ( NUMBER )
    public void setNewOtPay( BigDecimal newOtPay ) {
        this.newOtPay = newOtPay;
    }
    public BigDecimal getNewOtPay() {
        return this.newOtPay;
    }

    //--- DATABASE MAPPING : NEW_DT_PAY ( NUMBER )
    public void setNewDtPay( BigDecimal newDtPay ) {
        this.newDtPay = newDtPay;
    }
    public BigDecimal getNewDtPay() {
        return this.newDtPay;
    }

    //--- DATABASE MAPPING : NEW_EFF_WEEK_FROM ( NUMBER )
    public void setNewEffWeekFrom( Long newEffWeekFrom ) {
        this.newEffWeekFrom = newEffWeekFrom;
    }
    public Long getNewEffWeekFrom() {
        return this.newEffWeekFrom;
    }

    //--- DATABASE MAPPING : NEW_EFF_YEAR_FROM ( NUMBER )
    public void setNewEffYearFrom( Long newEffYearFrom ) {
        this.newEffYearFrom = newEffYearFrom;
    }
    public Long getNewEffYearFrom() {
        return this.newEffYearFrom;
    }

    //--- DATABASE MAPPING : STATUS ( CHAR )
    public void setStatus( String status ) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }

    //--- DATABASE MAPPING : INACTIVATION_EFF_DATE ( DATE )
    public void setInactivationEffDate( Date inactivationEffDate ) {
        this.inactivationEffDate = inactivationEffDate;
    }
    public Date getInactivationEffDate() {
        return this.inactivationEffDate;
    }

    //--- DATABASE MAPPING : DO_APPROVAL_USER_ID ( NUMBER )
    public void setDoApprovalUserId( Long doApprovalUserId ) {
        this.doApprovalUserId = doApprovalUserId;
    }
    public Long getDoApprovalUserId() {
        return this.doApprovalUserId;
    }

    //--- DATABASE MAPPING : DO_APPROVAL_DATE ( DATE )
    public void setDoApprovalDate( Date doApprovalDate ) {
        this.doApprovalDate = doApprovalDate;
    }
    public Date getDoApprovalDate() {
        return this.doApprovalDate;
    }

    //--- DATABASE MAPPING : DO_APPROVAL_STATUS ( CHAR )
    public void setDoApprovalStatus( String doApprovalStatus ) {
        this.doApprovalStatus = doApprovalStatus;
    }
    public String getDoApprovalStatus() {
        return this.doApprovalStatus;
    }

    //--- DATABASE MAPPING : SDO_APPROVAL_USER_ID ( NUMBER )
    public void setSdoApprovalUserId( Long sdoApprovalUserId ) {
        this.sdoApprovalUserId = sdoApprovalUserId;
    }
    public Long getSdoApprovalUserId() {
        return this.sdoApprovalUserId;
    }

    //--- DATABASE MAPPING : SDO_APPROVAL_DATE ( DATE )
    public void setSdoApprovalDate( Date sdoApprovalDate ) {
        this.sdoApprovalDate = sdoApprovalDate;
    }
    public Date getSdoApprovalDate() {
        return this.sdoApprovalDate;
    }

    //--- DATABASE MAPPING : SDO_APPROVAL_STATUS ( CHAR )
    public void setSdoApprovalStatus( String sdoApprovalStatus ) {
        this.sdoApprovalStatus = sdoApprovalStatus;
    }
    public String getSdoApprovalStatus() {
        return this.sdoApprovalStatus;
    }

    //--- DATABASE MAPPING : PA_APPROVAL_USER_ID ( NUMBER )
    public void setPaApprovalUserId( Long paApprovalUserId ) {
        this.paApprovalUserId = paApprovalUserId;
    }
    public Long getPaApprovalUserId() {
        return this.paApprovalUserId;
    }

    //--- DATABASE MAPPING : PA_APPROVAL_DATE ( DATE )
    public void setPaApprovalDate( Date paApprovalDate ) {
        this.paApprovalDate = paApprovalDate;
    }
    public Date getPaApprovalDate() {
        return this.paApprovalDate;
    }

    //--- DATABASE MAPPING : PA_APPROVAL_STATUS ( CHAR )
    public void setPaApprovalStatus( String paApprovalStatus ) {
        this.paApprovalStatus = paApprovalStatus;
    }
    public String getPaApprovalStatus() {
        return this.paApprovalStatus;
    }

    //--- DATABASE MAPPING : CREATED_USER_ID ( NUMBER )
    public void setCreatedUserId( Long createdUserId ) {
        this.createdUserId = createdUserId;
    }
    public Long getCreatedUserId() {
        return this.createdUserId;
    }

    //--- DATABASE MAPPING : CREATED_DATE ( DATE )
    public void setCreatedDate( Date createdDate ) {
        this.createdDate = createdDate;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }

    //--- DATABASE MAPPING : UPDATED_USER_ID ( NUMBER )
    public void setUpdatedUserId( Long updatedUserId ) {
        this.updatedUserId = updatedUserId;
    }
    public Long getUpdatedUserId() {
        return this.updatedUserId;
    }

    //--- DATABASE MAPPING : UPDATED_DATE ( DATE )
    public void setUpdatedDate( Date updatedDate ) {
        this.updatedDate = updatedDate;
    }
    public Date getUpdatedDate() {
        return this.updatedDate;
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
        sb.append(associatePayRateId);
        sb.append("]:"); 
        sb.append(associateOfficeRecordId);
        sb.append("|");
        sb.append(stPay);
        sb.append("|");
        sb.append(otPay);
        sb.append("|");
        sb.append(dtPay);
        sb.append("|");
        sb.append(effWeekFrom);
        sb.append("|");
        sb.append(effYearFrom);
        sb.append("|");
        sb.append(newStPay);
        sb.append("|");
        sb.append(newOtPay);
        sb.append("|");
        sb.append(newDtPay);
        sb.append("|");
        sb.append(newEffWeekFrom);
        sb.append("|");
        sb.append(newEffYearFrom);
        sb.append("|");
        sb.append(status);
        sb.append("|");
        sb.append(inactivationEffDate);
        sb.append("|");
        sb.append(doApprovalUserId);
        sb.append("|");
        sb.append(doApprovalDate);
        sb.append("|");
        sb.append(doApprovalStatus);
        sb.append("|");
        sb.append(sdoApprovalUserId);
        sb.append("|");
        sb.append(sdoApprovalDate);
        sb.append("|");
        sb.append(sdoApprovalStatus);
        sb.append("|");
        sb.append(paApprovalUserId);
        sb.append("|");
        sb.append(paApprovalDate);
        sb.append("|");
        sb.append(paApprovalStatus);
        sb.append("|");
        sb.append(createdUserId);
        sb.append("|");
        sb.append(createdDate);
        sb.append("|");
        sb.append(updatedUserId);
        sb.append("|");
        sb.append(updatedDate);
        return sb.toString(); 
    } 



    //----------------------------------------------------------------------
    // clone METHOD
    //----------------------------------------------------------------------
    public AssociatePayRates clone()
        throws CloneNotSupportedException
    {
        AssociatePayRates clone = (AssociatePayRates)super.clone();

        return clone;
    }
    
    public String getStatusText()
	{
    	
			return null;
	}
    
}
