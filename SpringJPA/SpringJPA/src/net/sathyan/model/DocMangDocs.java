package net.sathyan.model;

import net.sathyan.model.BaseDocMangDocs;

import java.sql.Blob;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This is the object class that relates to the DOC_MANG_DOCS table.
 * Any customizations belong here.
 */
public class DocMangDocs  
{
	static Log log = LogFactory.getLog(DocMangDocs.class);
/*[CONSTRUCTOR MARKER BEGIN]*/
	public DocMangDocs () {}

	

	public DocMangDocs (java.lang.Long associateDocumentId, java.sql.Blob doc) {
		super();
		setAssociateDocumentId(associateDocumentId);
		setDoc(doc);
		
	}
	
	public DocMangDocs (java.lang.Long associateDocumentId) {
		super();
		setAssociateDocumentId(associateDocumentId);
		
		
	}

	private java.sql.Blob doc;
	private java.lang.Long associateDocumentId;
	
	public java.sql.Blob getDoc() {
		return doc;
	}

	public void setDoc(java.sql.Blob doc) {
		this.doc = doc;
	}

	public java.lang.Long getAssociateDocumentId() {
		return associateDocumentId;
	}

	public void setAssociateDocumentId(java.lang.Long associateDocumentId) {
		this.associateDocumentId = associateDocumentId;
	}

	
}