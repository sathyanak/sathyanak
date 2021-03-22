
package jsf.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;

import model.valueobjects.LtHolidaysVO;

@ManagedBean(name="ltFederalHolidayssController")
@ViewScoped
public class LtFederalHolidayssController implements Serializable
{
	
	private static final long serialVersionUID = -6456372369406368990L;


	
	protected List<LtHolidaysVO> holidaysList = new ArrayList<LtHolidaysVO>();
	protected String viewAllMode;
	protected String statusType;
	protected Date holidayDate;

	public Date getHolidayDate() {
		return holidayDate;
	}

	public void setHolidayDate(Date holidayDate) {
		this.holidayDate = holidayDate;
	}

	private int PAGE_SIZE = 20;
	private int pageNumber = 0;

	private static final String ACTIVE = "A";
	private static final String INACTIVE = "I";

	
	

	public LtFederalHolidayssController() {
		super();

		
	}

	@PostConstruct
    public void init(){
         
		//Initialise the Liset of Objects;
		System.out.println ("gggggg");
		for (int i=0;i < 5; i++)
			holidaysList.add(new LtHolidaysVO("Sathyan", new Long(i)));
		
    }
	

	public String onAddLtFederalHolidays() throws Exception
	{
		String view = null;
	
		openDetailsForm();

		

		return view;
	}
	
	
	public void openDetailsForm() throws Exception
	{
		

		Map<String, List<String>> paramMap = new HashMap<String, List<String>>();
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("width", "675px");
		options.put("height", "300px");
		options.put("closable", false);
		options.put("draggable", false);
		options.put("resizable", false);
		options.put("contentWidth", "675px");
		options.put("contentHeight", "300px");

	
	
		openDialog("ltFederalHolidaysDetails", options, paramMap);

		
	}
	
	
	 public FacesContext getFacesContext( )
	    {
	        return FacesContext.getCurrentInstance() ;
	    }


		public PrimeFaces getPrimeFacesContext( )
		{
			return PrimeFaces.current() ;
		}
		
		
	
	
	   protected void openDialog( String outcome, Map<String, Object> options, Map<String, List<String>> params )
	    {
	    	getPrimeFacesContext().dialog().openDynamic( outcome, options, params );
	    }
	   
	   
	

	public List<LtHolidaysVO> getHolidaysList()
	{
		return holidaysList;
	}

	public void setHolidaysList(List<LtHolidaysVO> holidaysList)
	{
		this.holidaysList = holidaysList;
	}

	public String getStatusType()
	{
		return statusType;
	}

	public void setStatusType(String statusType)
	{
		this.statusType = statusType;
	}

	public String isViewAllMode()
	{
		return viewAllMode;
	}

	public void setViewAllMode(String viewAllMode)
	{
		this.viewAllMode = viewAllMode;
	}

	

	
	

}