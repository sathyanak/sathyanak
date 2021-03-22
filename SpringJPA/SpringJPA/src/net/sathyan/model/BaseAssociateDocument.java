package net.sathyan.model;

import java.io.Serializable;


/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * @hibernate.class
 * table="ASSOCIATE_DOCUMENTS"
 *
 * @hibernate.class
 *  table="ASSOCIATE_DOCUMENTS"
 */
public abstract class BaseAssociateDocument  implements Serializable {

	public static String PROP_LT_ASSOC_DOCUMENT_STATUS = "ltAssocDocumentStatus";
	public static String PROP_ARCHIVED_USER_ID = "archivedUserId";
	public static String PROP_ARCHIVED_DATE = "archivedDate";
	public static String PROP_USER_IP_ADDRESS = "userIpAddress";
	public static String PROP_MANAGER_IS_TRUTHFULLNESS = "managerIsTruthfullness";
	public static String PROP_ASSOCIATE_OFFICE_RECORD = "associateOfficeRecord";
	public static String PROP_IS_CONSENT = "isConsent";
	public static String PROP_CAN_PROCESS_BG_CHECK = "canProcessBgCheck";
	public static String PROP_DOCUMENT_DATE = "documentDate";
	public static String PROP_CREATED_USER_ID = "createdUserId";
	public static String PROP_SERVER_IP_ADDRESS = "serverIpAddress";
	public static String PROP_SIGNATURE = "signature";
	public static String PROP_ASSOCIATE_DOCUMENT_ID = "associateDocumentId";
	public static String PROP_IS_ARCHIVED = "isArchived";
	public static String PROP_OFFICE_DOCUMENT = "officeDocument";
	public static String PROP_MANAGER_SIGNATURE = "managerSignature";
	public static String PROP_CREATED_DATE = "createdDate";
	public static String PROP_UPDATED_USER_ID = "updatedUserId";
	public static String PROP_MANAGER_IS_CONSENT = "managerIsConsent";
	public static String PROP_DOCUMENT_NOTE = "documentNote";
	public static String PROP_IS_APPLICANT_ENTERED = "isApplicantEntered";
	public static String PROP_IS_TRUTHFULLNESS = "isTruthfullness";


	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long _associateDocumentId;

	// timestamp
	private java.util.Date _updatedDate;

	// fields
	/*
	 * @hibernate.property
	 * column="DOCUMENT_DATE"
	 * length="7"
	 */
	private java.util.Date _documentDate;
	/*
	 * @hibernate.property
	 * column="DOCUMENT_NOTE"
	 * length="4000"
	 */
	private java.lang.String _documentNote;
	/*
	 * @hibernate.property
	 * column="CREATED_USER_ID"
	 * length="10"
	 * not-null="true"
	 */
	private java.lang.Long _createdUserId;
	/*
	 * @hibernate.property
	 * column="CREATED_DATE"
	 * length="7"
	 * not-null="true"
	 */
	private java.util.Date _createdDate;
	/*
	 * @hibernate.property
	 * column="UPDATED_USER_ID"
	 * length="10"
	 * not-null="true"
	 */
	private java.lang.Long _updatedUserId;
	/*
	 * @hibernate.property
	 * column="ARCHIVED_USER_ID"
	 * length="10"
	 */
	private java.lang.Long _archivedUserId;
	/*
	 * @hibernate.property
	 * column="IS_ARCHIVED"
	 * length="1"
	 * not-null="true"
	 */
	private java.lang.String _isArchived;
	private java.lang.String _canProcessBgCheck;
	/*
	 * @hibernate.property
	 * column="ARCHIVED_DATE"
	 * length="7"
	 */
	private java.util.Date _archivedDate;
	private java.lang.String _isConsent;
	private java.lang.String _signature;
	private java.lang.String _isTruthfullness;
	private java.lang.String _isApplicantEntered;
	private java.lang.String _managerIsConsent;
	private java.lang.String _managerSignature;
	private java.lang.String _managerIsTruthfullness;
	private java.lang.String _userIpAddress;
	private java.lang.String _serverIpAddress;

	

	// collections
	/*
	 * @hibernate.set
	 * lazy="true"
	 * inverse="true"
	 * @hibernate.collection-key
	 * column="ASSOCIATE_DOCUMENT_ID"
	 * @hibernate.collection-one-to-many
	 * class="net.stafftrack.hbn.associate.hrevents.documents.data.valueobjects.AssociateDrugTest"
	 */
	private java.util.Set _associateDrugTest;
	/*
	 * @hibernate.set
	 * lazy="true"
	 * inverse="true"
	 * @hibernate.collection-key
	 * column="ASSOCIATE_DOCUMENT_ID"
	 * @hibernate.collection-one-to-many
	 * class="net.stafftrack.hbn.associate.hrevents.documents.data.valueobjects.AssociateI9"
	 */
	private java.util.Set _associateI9;
	/*
	 * @hibernate.set
	 * lazy="true"
	 * inverse="true"
	 * @hibernate.collection-key
	 * column="ASSOCIATE_DOCUMENT_ID"
	 * @hibernate.collection-one-to-many
	 * class="net.stafftrack.hbn.associate.hrevents.documents.data.valueobjects.AssociateW4"
	 */
	private java.util.Set _associateW4;
	/*
	 * @hibernate.set
	 * lazy="true"
	 * inverse="true"
	 * @hibernate.collection-key
	 * column="ASSOCIATE_DOCUMENT_ID"
	 * @hibernate.collection-one-to-many
	 * class="net.stafftrack.hbn.associate.hrevents.documents.data.valueobjects.AssociateBgCheck"
	 */
	private java.util.Set _associateBgCheck;
	/*
	 * @hibernate.set
	 * lazy="true"
	 * inverse="true"
	 * @hibernate.collection-key
	 * column="ASSOCIATE_DOCUMENT_ID"
	 * @hibernate.collection-one-to-many
	 * class="net.stafftrack.hbn.associate.masterrecord.data.valueobjects.AssociateWorkHistory"
	 */
	private java.util.Set _associateWorkHistory;
	/*
	 * @hibernate.set
	 * lazy="true"
	 * inverse="true"
	 * @hibernate.collection-key
	 * column="ASSOCIATE_DOCUMENT_ID"
	 * @hibernate.collection-one-to-many
	 * class="net.stafftrack.hbn.associate.masterrecord.data.valueobjects.AssociateReferenceChecks"
	 */
	private java.util.Set _associateReferenceChecks;
	private java.util.Set _associateWotc;


	// constructors
	public BaseAssociateDocument () {}

	/**
	 * Constructor for primary key
	 */
	public BaseAssociateDocument (java.lang.Long _associateDocumentId) {
		this.setAssociateDocumentId(_associateDocumentId);
	}

	/**
	 * Constructor for required fields
	 */
	public BaseAssociateDocument (
		java.lang.Long _associateDocumentId,
		
		java.lang.Long _createdUserId,
		java.util.Date _createdDate,
		java.lang.Long _updatedUserId,
		java.lang.String _isArchived,
		java.lang.String _canProcessBgCheck,
		java.lang.String _isConsent,
		java.lang.String _isTruthfullness,
		java.lang.String _isApplicantEntered,
		java.lang.String _managerIsConsent,
		java.lang.String _managerIsTruthfullness) {

		this.setAssociateDocumentId(_associateDocumentId);
	
		this.setCreatedUserId(_createdUserId);
		this.setCreatedDate(_createdDate);
		this.setUpdatedUserId(_updatedUserId);
		this.setIsArchived(_isArchived);
		this.setCanProcessBgCheck(_canProcessBgCheck);
		this.setIsConsent(_isConsent);
		this.setIsTruthfullness(_isTruthfullness);
		this.setIsApplicantEntered(_isApplicantEntered);
		this.setManagerIsConsent(_managerIsConsent);
		this.setManagerIsTruthfullness(_managerIsTruthfullness);
	}



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="sequence"
     *  column="ASSOCIATE_DOCUMENT_ID"
     */
	public java.lang.Long getAssociateDocumentId () {
		return _associateDocumentId;
	}

	/**
	 * Set the unique identifier of this class
	 * @param _associateDocumentId the new ID
	 */
	public void setAssociateDocumentId (java.lang.Long _associateDocumentId) {
		this._associateDocumentId = _associateDocumentId;
		this.hashCode = Integer.MIN_VALUE;
	}


	/**
	 * Return the value associated with the column: UPDATED_DATE
	 */
	public java.util.Date getUpdatedDate () {
		return _updatedDate;
	}

	/**
	 * Set the value related to the column: UPDATED_DATE
	 * @param _updatedDate the UPDATED_DATE value
	 */
	public void setUpdatedDate (java.util.Date _updatedDate) {
		this._updatedDate = _updatedDate;
	}


	/**
	 * Return the value associated with the column: DOCUMENT_DATE
	 */
	public java.util.Date getDocumentDate () {
		return _documentDate;
	}

	/**
	 * Set the value related to the column: DOCUMENT_DATE
	 * @param _documentDate the DOCUMENT_DATE value
	 */
	public void setDocumentDate (java.util.Date _documentDate) {
		this._documentDate = _documentDate;
	}


	/**
	 * Return the value associated with the column: DOCUMENT_NOTE
	 */
	public java.lang.String getDocumentNote () {
		return _documentNote;
	}

	/**
	 * Set the value related to the column: DOCUMENT_NOTE
	 * @param _documentNote the DOCUMENT_NOTE value
	 */
	public void setDocumentNote (java.lang.String _documentNote) {
		this._documentNote = _documentNote;
	}


	/**
	 * Return the value associated with the column: CREATED_USER_ID
	 */
	public java.lang.Long getCreatedUserId () {
		return _createdUserId;
	}

	/**
	 * Set the value related to the column: CREATED_USER_ID
	 * @param _createdUserId the CREATED_USER_ID value
	 */
	public void setCreatedUserId (java.lang.Long _createdUserId) {
		this._createdUserId = _createdUserId;
	}


	/**
	 * Return the value associated with the column: CREATED_DATE
	 */
	public java.util.Date getCreatedDate () {
		return _createdDate;
	}

	/**
	 * Set the value related to the column: CREATED_DATE
	 * @param _createdDate the CREATED_DATE value
	 */
	public void setCreatedDate (java.util.Date _createdDate) {
		this._createdDate = _createdDate;
	}


	/**
	 * Return the value associated with the column: UPDATED_USER_ID
	 */
	public java.lang.Long getUpdatedUserId () {
		return _updatedUserId;
	}

	/**
	 * Set the value related to the column: UPDATED_USER_ID
	 * @param _updatedUserId the UPDATED_USER_ID value
	 */
	public void setUpdatedUserId (java.lang.Long _updatedUserId) {
		this._updatedUserId = _updatedUserId;
	}


	/**
	 * Return the value associated with the column: ARCHIVED_USER_ID
	 */
	public java.lang.Long getArchivedUserId () {
		return _archivedUserId;
	}

	/**
	 * Set the value related to the column: ARCHIVED_USER_ID
	 * @param _archivedUserId the ARCHIVED_USER_ID value
	 */
	public void setArchivedUserId (java.lang.Long _archivedUserId) {
		this._archivedUserId = _archivedUserId;
	}


	/**
	 * Return the value associated with the column: IS_ARCHIVED
	 */
	public java.lang.String getIsArchived () {
		return _isArchived;
	}

	/**
	 * Set the value related to the column: IS_ARCHIVED
	 * @param _isArchived the IS_ARCHIVED value
	 */
	public void setIsArchived (java.lang.String _isArchived) {
		this._isArchived = _isArchived;
	}


	/**
	 * Return the value associated with the column: CAN_PROCESS_BG_CHECK
	 */
	public java.lang.String getCanProcessBgCheck () {
		return _canProcessBgCheck;
	}

	/**
	 * Set the value related to the column: CAN_PROCESS_BG_CHECK
	 * @param _canProcessBgCheck the CAN_PROCESS_BG_CHECK value
	 */
	public void setCanProcessBgCheck (java.lang.String _canProcessBgCheck) {
		this._canProcessBgCheck = _canProcessBgCheck;
	}


	/**
	 * Return the value associated with the column: ARCHIVED_DATE
	 */
	public java.util.Date getArchivedDate () {
		return _archivedDate;
	}

	/**
	 * Set the value related to the column: ARCHIVED_DATE
	 * @param _archivedDate the ARCHIVED_DATE value
	 */
	public void setArchivedDate (java.util.Date _archivedDate) {
		this._archivedDate = _archivedDate;
	}


	/**
	 * Return the value associated with the column: IS_CONSENT
	 */
	public java.lang.String getIsConsent () {
		return _isConsent;
	}

	/**
	 * Set the value related to the column: IS_CONSENT
	 * @param _isConsent the IS_CONSENT value
	 */
	public void setIsConsent (java.lang.String _isConsent) {
		this._isConsent = _isConsent;
	}


	/**
	 * Return the value associated with the column: SIGNATURE
	 */
	public java.lang.String getSignature () {
		return _signature;
	}

	/**
	 * Set the value related to the column: SIGNATURE
	 * @param _signature the SIGNATURE value
	 */
	public void setSignature (java.lang.String _signature) {
		this._signature = _signature;
	}


	/**
	 * Return the value associated with the column: IS_TRUTHFULNESS
	 */
	public java.lang.String getIsTruthfullness () {
		return _isTruthfullness;
	}

	/**
	 * Set the value related to the column: IS_TRUTHFULNESS
	 * @param _isTruthfullness the IS_TRUTHFULNESS value
	 */
	public void setIsTruthfullness (java.lang.String _isTruthfullness) {
		this._isTruthfullness = _isTruthfullness;
	}


	/**
	 * Return the value associated with the column: IS_APPLICANT_ENTERED
	 */
	public java.lang.String getIsApplicantEntered () {
		return _isApplicantEntered;
	}

	/**
	 * Set the value related to the column: IS_APPLICANT_ENTERED
	 * @param _isApplicantEntered the IS_APPLICANT_ENTERED value
	 */
	public void setIsApplicantEntered (java.lang.String _isApplicantEntered) {
		this._isApplicantEntered = _isApplicantEntered;
	}


	/**
	 * Return the value associated with the column: MANAGER_IS_CONSENT
	 */
	public java.lang.String getManagerIsConsent () {
		return _managerIsConsent;
	}

	/**
	 * Set the value related to the column: MANAGER_IS_CONSENT
	 * @param _managerIsConsent the MANAGER_IS_CONSENT value
	 */
	public void setManagerIsConsent (java.lang.String _managerIsConsent) {
		this._managerIsConsent = _managerIsConsent;
	}


	/**
	 * Return the value associated with the column: MANAGER_SIGNATURE
	 */
	public java.lang.String getManagerSignature () {
		return _managerSignature;
	}

	/**
	 * Set the value related to the column: MANAGER_SIGNATURE
	 * @param _managerSignature the MANAGER_SIGNATURE value
	 */
	public void setManagerSignature (java.lang.String _managerSignature) {
		this._managerSignature = _managerSignature;
	}


	/**
	 * Return the value associated with the column: MANAGER_IS_TRUTHFULNESS
	 */
	public java.lang.String getManagerIsTruthfullness () {
		return _managerIsTruthfullness;
	}

	/**
	 * Set the value related to the column: MANAGER_IS_TRUTHFULNESS
	 * @param _managerIsTruthfullness the MANAGER_IS_TRUTHFULNESS value
	 */
	public void setManagerIsTruthfullness (java.lang.String _managerIsTruthfullness) {
		this._managerIsTruthfullness = _managerIsTruthfullness;
	}


	/**
	 * Return the value associated with the column: USER_IP_ADDRESS
	 */
	public java.lang.String getUserIpAddress () {
		return _userIpAddress;
	}

	/**
	 * Set the value related to the column: USER_IP_ADDRESS
	 * @param _userIpAddress the USER_IP_ADDRESS value
	 */
	public void setUserIpAddress (java.lang.String _userIpAddress) {
		this._userIpAddress = _userIpAddress;
	}


	/**
	 * Return the value associated with the column: SERVER_IP_ADDRESS
	 */
	public java.lang.String getServerIpAddress () {
		return _serverIpAddress;
	}

	/**
	 * Set the value related to the column: SERVER_IP_ADDRESS
	 * @param _serverIpAddress the SERVER_IP_ADDRESS value
	 */
	public void setServerIpAddress (java.lang.String _serverIpAddress) {
		this._serverIpAddress = _serverIpAddress;
	}


	


	/**
	 * Return the value associated with the column: associateDrugTest
	 */
	public java.util.Set getAssociateDrugTest () {
		return this._associateDrugTest;
	}

	/**
	 * Set the value related to the column: associateDrugTest
	 * @param _associateDrugTest the associateDrugTest value
	 */
	public void setAssociateDrugTest (java.util.Set _associateDrugTest) {
		this._associateDrugTest = _associateDrugTest;
	}
	
	public void addToAssociateDrugTest (Object obj) {
		if (null == this._associateDrugTest) this._associateDrugTest = new java.util.HashSet();
		this._associateDrugTest.add(obj);
	}



	/**
	 * Return the value associated with the column: associateI9
	 */
	public java.util.Set getAssociateI9 () {
		return this._associateI9;
	}

	/**
	 * Set the value related to the column: associateI9
	 * @param _associateI9 the associateI9 value
	 */
	public void setAssociateI9 (java.util.Set _associateI9) {
		this._associateI9 = _associateI9;
	}
	
	public void addToAssociateI9 (Object obj) {
		if (null == this._associateI9) this._associateI9 = new java.util.HashSet();
		this._associateI9.add(obj);
	}



	/**
	 * Return the value associated with the column: associateW4
	 */
	public java.util.Set getAssociateW4 () {
		return this._associateW4;
	}

	/**
	 * Set the value related to the column: associateW4
	 * @param _associateW4 the associateW4 value
	 */
	public void setAssociateW4 (java.util.Set _associateW4) {
		this._associateW4 = _associateW4;
	}
	
	public void addToAssociateW4 (Object obj) {
		if (null == this._associateW4) this._associateW4 = new java.util.HashSet();
		this._associateW4.add(obj);
	}



	/**
	 * Return the value associated with the column: associateBgCheck
	 */
	public java.util.Set getAssociateBgCheck () {
		return this._associateBgCheck;
	}

	/**
	 * Set the value related to the column: associateBgCheck
	 * @param _associateBgCheck the associateBgCheck value
	 */
	public void setAssociateBgCheck (java.util.Set _associateBgCheck) {
		this._associateBgCheck = _associateBgCheck;
	}
	
	public void addToAssociateBgCheck (Object obj) {
		if (null == this._associateBgCheck) this._associateBgCheck = new java.util.HashSet();
		this._associateBgCheck.add(obj);
	}



	/**
	 * Return the value associated with the column: associateWorkHistory
	 */
	public java.util.Set getAssociateWorkHistory () {
		return this._associateWorkHistory;
	}

	/**
	 * Set the value related to the column: associateWorkHistory
	 * @param _associateWorkHistory the associateWorkHistory value
	 */
	public void setAssociateWorkHistory (java.util.Set _associateWorkHistory) {
		this._associateWorkHistory = _associateWorkHistory;
	}
	
	public void addToAssociateWorkHistory (Object obj) {
		if (null == this._associateWorkHistory) this._associateWorkHistory = new java.util.HashSet();
		this._associateWorkHistory.add(obj);
	}



	/**
	 * Return the value associated with the column: AssociateReferenceChecks
	 */
	public java.util.Set getAssociateReferenceChecks () {
		return this._associateReferenceChecks;
	}

	/**
	 * Set the value related to the column: AssociateReferenceChecks
	 * @param _associateReferenceChecks the AssociateReferenceChecks value
	 */
	public void setAssociateReferenceChecks (java.util.Set _associateReferenceChecks) {
		this._associateReferenceChecks = _associateReferenceChecks;
	}
	
	public void addToAssociateReferenceChecks (Object obj) {
		if (null == this._associateReferenceChecks) this._associateReferenceChecks = new java.util.HashSet();
		this._associateReferenceChecks.add(obj);
	}



	/**
	 * Return the value associated with the column: associateWotc
	 */
	public java.util.Set getAssociateWotc () {
		return this._associateWotc;
	}

	/**
	 * Set the value related to the column: associateWotc
	 * @param _associateWotc the associateWotc value
	 */
	public void setAssociateWotc (java.util.Set _associateWotc) {
		this._associateWotc = _associateWotc;
	}
	
	public void addToAssociateWotc (Object obj) {
		if (null == this._associateWotc) this._associateWotc = new java.util.HashSet();
		this._associateWotc.add(obj);
	}





	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getAssociateDocumentId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getAssociateDocumentId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}

}