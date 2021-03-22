package jsf.controller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean(name = "resumeController")
@ViewScoped
public class ResumeController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected Long aorId;
	
	
	public void initialize() throws Exception
	{
		
		 System.out.println("PPPPP  ");

	}
	

	public Long getAorId() {
		return aorId;
	}


	public void setAorId(Long aorId) {
		this.aorId = aorId;
	}


	public StreamedContent getFile() {
		 StreamedContent download;
		
		 try {
			StreamedContent file;
			 File file1 = new File( "C:\\Sathyan\\Sathyan\\Personal\\Folio.txt");
			 InputStream fis = new FileInputStream(file1);
			 download = new DefaultStreamedContent(fis, "text/plain" , "test.txt" );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
	    
		return download;
	}

	public void handleFileUpload(FileUploadEvent event) {
		
	    
	      System.out.println("PPPPP  ");
        FacesMessage msg = new FacesMessage("Successful", event.getFile().getFileName() + " is uploaded.");
    
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	 

}
