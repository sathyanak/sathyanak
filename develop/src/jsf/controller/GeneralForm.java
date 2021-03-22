package jsf.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;

import net.sathyan.valueobjects.EmployeeVO;

@ManagedBean(name = "general")
@ViewScoped
public class GeneralForm implements Serializable {

	private static final long serialVersionUID = -2776725772598162198L;

	private String action = "add"; // Add or Edit
	private String newsFeedType = ""; // O- Office, N - National, B- Brands
	private Long newsFeedId;
	
	private EmployeeVO empVo;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getNewsFeedType() {
		return newsFeedType;
	}

	public void setNewsFeedType(String newsFeedType) {
		this.newsFeedType = newsFeedType;
	}

	public Long getNewsFeedId() {
		return newsFeedId;
	}

	public void setNewsFeedId(Long newsFeedId) {
		this.newsFeedId = newsFeedId;
	}

	public EmployeeVO getEmpVo() {
		return empVo;
	}

	public void setEmpVo(EmployeeVO empVo) {
		this.empVo = empVo;
	}

	public String getPageHeader() {
		return pageHeader;
	}

	public void setPageHeader(String pageHeader) {
		this.pageHeader = pageHeader;
	}

	public List getOffices() {
		return offices;
	}

	public void setOffices(List offices) {
		this.offices = offices;
	}

	public List getBrands() {
		return brands;
	}

	public void setBrands(List brands) {
		this.brands = brands;
	}

	public List getVisiblity() {
		return visiblity;
	}

	public void setVisiblity(List visiblity) {
		this.visiblity = visiblity;
	}

	private String pageHeader;

	private List offices;
	private List brands;
	private List visiblity;

	@PostConstruct
	public void init() {

		// set Page HEader
		pageHeader = "add".contentEquals(action) ? "Add " : "Edit";
		
		empVo = new EmployeeVO("Swapna", "Suresh", 35, "Mediator", new Float( 90.2));

		if ("O".contentEquals(newsFeedType))
			pageHeader = pageHeader + " Office News";

		// Load Offices

		// Load Brands

		// Load visibility

		// Load the object
		if ("add".contentEquals(action)) {

		} else {

		}
	}

	public void onSave() {
		
		FacesMessage msg = new FacesMessage( FacesMessage.SEVERITY_ERROR, "This is a first Error", "This is a first Error" ) ;
		FacesContext.getCurrentInstance().addMessage( "msg", msg ) ;
		
//		msg = new FacesMessage( FacesMessage.SEVERITY_ERROR, "This is a first Error", "This is a second error" ) ;
//		FacesContext.getCurrentInstance().addMessage( "msg", msg ) ;
//		
//		FacesContext facesContext = FacesContext.getCurrentInstance();
//        Locale locale = facesContext.getViewRoot().getLocale();
//        ResourceBundle bundle = ResourceBundle.getBundle("net.stafftrack.resources.CrmActivityMessages", locale);
//		
//		msg = new FacesMessage( FacesMessage.SEVERITY_ERROR, "This is a first Error", bundle.getString("crmActivity") ) ;
//		FacesContext.getCurrentInstance().addMessage( "msg", msg ) ;
//		
		 PrimeFaces.current().executeScript( "addErrorIndicator('#" + "msg".replace(":", "\\\\:") + "');"  );
		
		EmployeeVO test = this.empVo;
		
		 
	        

		System.out.println("Saved");
	}

	public Long getSecuredResourceId() {
		return -1L;
	}

}
