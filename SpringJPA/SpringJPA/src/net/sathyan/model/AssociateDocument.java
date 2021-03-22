/**
 * Created on ${date}
 * 
 * @author ${user}
 * 
 * @version $Revision$
 *  
 * $Log$
 * Revision 1.12  2011/06/24 13:24:09  timp
 * PRO I9 coding
 *
 * Revision 1.11  2011/06/10 07:10:14  nagaraj
 * added isappentered column
 *
 * Revision 1.10  2011/05/17 07:23:49  sathyan
 * Added isTruthfullness and Signiture
 *
 * Revision 1.9  2011/04/11 10:36:13  nagaraj
 * pro:hibernate
 *
 * Revision 1.8  2009/11/18 09:02:57  sathyan
 * 7148: Fixed
 *
 * Revision 1.7  2006/04/24 11:39:03  sathyan
 * X332: Merged
 *
 * Revision 1.6  2005/04/20 03:13:40  dans
 * added associateWotc to associateDocuments
 *
 * Revision 1.5  2004/05/17 11:18:59  sathyan
 * Added the new mapping for Lt_assoc_document_statuses and modified the mapping for Associate_documents
 *
 * Revision 1.4  2004/03/26 19:36:43  georgem
 * Changed PK names from comp_id to one they should have in the first place
 *
 * Revision 1.3  2004/03/25 08:44:28  dans
 * *** empty log message ***
 *
 * Revision 1.2  2004/03/25 03:45:54  georgem
 * Working on mapping files - not working yet
 *
 *
 */


package net.sathyan.model;
import java.sql.Blob;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This is the object class that relates to the ASSOCIATE_DOCUMENTS table.
 * Any customizations belong here.
 */
public class AssociateDocument extends BaseAssociateDocument
{
	static Log log = LogFactory.getLog(AssociateDocument.class);
/*[CONSTRUCTOR MARKER BEGIN]*/
	public AssociateDocument () {}

	/**
	 * Constructor for primary key
	 */
	public AssociateDocument (java.lang.Long _associateDocumentId) {
		super(_associateDocumentId);
	}
	
	public AssociateDocument (java.lang.Long _associateDocumentId, Blob document) {
		setAssociateDocumentId(_associateDocumentId);
		//setDocument(document);
	}


	/**
	 * Constructor for required fields
	 */
	public AssociateDocument (
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

		super (
			_associateDocumentId,
			
			_createdUserId,
			_createdDate,
			_updatedUserId,
			_isArchived,
			_canProcessBgCheck,
			_isConsent,
			_isTruthfullness,
			_isApplicantEntered,
			_managerIsConsent,
			_managerIsTruthfullness);
	}
/*[CONSTRUCTOR MARKER END]*/


	//Override - Set a default value to be returned when null
	public String getIsConsent() {
		String temp = super.getIsConsent(); 
		return (temp == null ? "N" : temp);
	}
	
	//Override - Set a default value to be returned when null
	public String getIsTruthfullness() {
		String temp = super.getIsTruthfullness(); 
		return (temp == null ? "N" : temp);
	}

	//Override - Set a default value to be returned when null
	public String getManagerIsConsent() {
		String temp = super.getManagerIsConsent(); 
		return (temp == null ? "N" : temp);
	}
	
	//Override - Set a default value to be returned when null
	public String getManagerIsTruthfullness() {
		String temp = super.getManagerIsTruthfullness(); 
		return (temp == null ? "N" : temp);
	}
	
	//Override - Set a default value to be returned when null
	public String getIsApplicantEntered() {
		String temp = super.getIsApplicantEntered(); 
		return (temp == null ? "N" : temp);
	}	
}