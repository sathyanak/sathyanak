package jsf.controller;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct ;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import model.valueobjects.AssociatePayRates;

@ManagedBean(name = "mainPayRatesController")
@ViewScoped
public class MainPayRatesController  implements Serializable
{
   
	 /**
		 * 
		 */
	
	protected boolean showDialog;
	protected String showDialogStr;
	
	  public boolean isShowDialog() {
		return showDialog;
	}

	public void setShowDialog(boolean showDialog) {
		this.showDialog = showDialog;
	}

	public String getShowDialogStr() {
		return showDialogStr;
	}

	public void setShowDialogStr(String showDialogStr) {
		this.showDialogStr = showDialogStr;
	}

	protected Long amrId = null ;
	    protected Long officeId = null ;
	    
	    
		public Long getAmrId() {
			return amrId;
		}

		public void setAmrId(Long amrId) {
			this.amrId = amrId;
		}

		public Long getOfficeId() {
			return officeId;
		}

		public void setOfficeId(Long officeId) {
			this.officeId = officeId;
		}

		private static final long serialVersionUID = 1L;
		protected Long displayedPayRateId = null;
	    protected String displayedPayRateStatus = null;
	    protected AssociatePayRates selectedAssociatePayRates = null ;
	    
		protected Long userRoleId = null;
	    private boolean hasNewValues = false;
	    private boolean hasApprovalChanges = false;
	    
	    private boolean dOApproved = false;
		private boolean sDOApproved = false;
		private boolean paApproved = false;
			
		private boolean disableDOApproval = false;
		private boolean disableSDOApproval= false;
		private boolean disableSMApproval= false;
		
		private boolean disableEditableFields = false;

		private String comment = "";

		private String stPayFromDB = "";
		private String otPayFromDB = "";
		private String dtPayFromDB = "";
		private String effectiveWkFromDB = "";
		private String effectiveYrFromDB = "";
	    
	    private Long editedOT ;

	 
	    public MainPayRatesController()
	    {
	        super() ;

	       
	    }

	    @PostConstruct
	    public void postConstruct( )
	    {
	        
	    }

	    public String onAddAssociatePayRates()
	            throws Exception
	        {
	           

	           
	            openDetailsForm( ) ;

	         
	            return null ;
	        }
	    
	    
	    public void openDetailsForm( )
	            throws Exception
	        {
	           
	            Map<String, List<String>> paramMap = new HashMap<String, List<String>>();
	            Map<String,Object> options = new HashMap<String, Object>();
	            options.put( "modal", true ) ;
	            options.put( "width", "880px" );
	            
	            if (getDisplayedPayRateId() != null)
	            	options.put( "height", "420px" ) ;
	            else
	            	options.put( "height", "250px" ) ;
	            
	            options.put( "closable", false ) ;
	            options.put( "draggable", false ) ;
	            options.put( "resizable", false ) ;
	            options.put( "contentWidth", "880px" ) ;
	            
	            if (getDisplayedPayRateId() != null)
	            	options.put( "contentHeight", "420px" ) ;
	            else
	            	options.put( "contentHeight", "250px" ) ;
	            
	            options.put("includeViewParams", true);
	         
	           
	    		
	    		
	    		
	    		List<String> amrIdvalue = new ArrayList<String>();
	    		amrIdvalue.add(getAmrId().toString()) ;
	    		paramMap.put("associateMasterRecordId", amrIdvalue);
	    		
	    		List<String> officeIdvalue = new ArrayList<String>();
	    		officeIdvalue.add(getOfficeId().toString()) ;
	    		paramMap.put("officeId", officeIdvalue);
	    		
	    	
	        }

	    
	    @PostConstruct
	    public void init(){
	         
	    	selectedAssociatePayRates  = new AssociatePayRates();
	    	
	    	selectedAssociatePayRates.setDtPay(new BigDecimal("10.06"));
	    	selectedAssociatePayRates.setOtPay(new BigDecimal("18.06"));
	    	selectedAssociatePayRates.setStPay(new BigDecimal("11.06"));
	    	
	    	setShowDialog(true);
	    	setShowDialogStr("Y");
	    	
	    	HttpServletRequest request =  (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest() ;
	    	request.setAttribute("DISPLAY_ASSOC_PAY_RATE_TILE", "Y");
	    	
	    	//officeId = 100L;
	    }
		
	    public Long getEditedOT()
		{
			return editedOT;
		}

		public void setEditedOT(Long editedOT)
		{
			this.editedOT = editedOT;
		}

		

		public Long getDisplayedPayRateId()
		{
	    	return displayedPayRateId;
		}

		public void setDisplayedPayRateId(Long displayedPayRateId)
		{
			this.displayedPayRateId = displayedPayRateId;
		}

		public Long getUserRoleId()
		{
			return userRoleId;
		}

		public void setUserRoleId(Long userRoleId)
		{
			this.userRoleId = userRoleId;
		}

		public String getDisplayedPayRateStatus()
		{
			return displayedPayRateStatus;
		}

		public void setDisplayedPayRateStatus(String displayedPayRateStatus)
		{
			this.displayedPayRateStatus = displayedPayRateStatus;
		}

		public boolean isHasNewValues()
		{
			return hasNewValues;
		}

		public void setHasNewValues(boolean hasNewValues)
		{
			this.hasNewValues = hasNewValues;
		}

		public boolean isHasApprovalChanges()
		{
			return hasApprovalChanges;
		}

		public void setHasApprovalChanges(boolean hasApprovalChanges)
		{
			this.hasApprovalChanges = hasApprovalChanges;
		}

		public boolean isdOApproved()
		{
			return dOApproved;
		}

		public void setdOApproved(boolean dOApproved)
		{
			this.dOApproved = dOApproved;
		}

		public boolean issDOApproved()
		{
			return sDOApproved;
		}

		public void setsDOApproved(boolean sDOApproved)
		{
			this.sDOApproved = sDOApproved;
		}

		public boolean isPaApproved()
		{
			return paApproved;
		}

		public void setPaApproved(boolean paApproved)
		{
			this.paApproved = paApproved;
		}

		public boolean isDisableDOApproval()
		{
			return disableDOApproval;
		}

		public void setDisableDOApproval(boolean disableDOApproval)
		{
			this.disableDOApproval = disableDOApproval;
		}

		public boolean isDisableSDOApproval()
		{
			return disableSDOApproval;
		}

		public void setDisableSDOApproval(boolean disableSDOApproval)
		{
			this.disableSDOApproval = disableSDOApproval;
		}

		public boolean isDisableSMApproval()
		{
			return disableSMApproval;
		}

		public void setDisableSMApproval(boolean disableSMApproval)
		{
			this.disableSMApproval = disableSMApproval;
		}

		public boolean isDisableEditableFields()
		{
			return disableEditableFields;
		}

		public void setDisableEditableFields(boolean disableEditableFields)
		{
			this.disableEditableFields = disableEditableFields;
		}

		public String getComment()
		{
			
				return comment;
		}

		public void setComment(String comment)
		{
			this.comment = comment;
		}

		public String getStPayFromDB()
		{
			return stPayFromDB;
		}

		public void setStPayFromDB(String stPayFromDB)
		{
			this.stPayFromDB = stPayFromDB;
		}

		public String getOtPayFromDB()
		{
			return otPayFromDB;
		}

		public void setOtPayFromDB(String otPayFromDB)
		{
			this.otPayFromDB = otPayFromDB;
		}

		public String getDtPayFromDB()
		{
			return dtPayFromDB;
		}

		public void setDtPayFromDB(String dtPayFromDB)
		{
			this.dtPayFromDB = dtPayFromDB;
		}

		public String getEffectiveWkFromDB()
		{
			return effectiveWkFromDB;
		}

		public void setEffectiveWkFromDB(String effectiveWkFromDB)
		{
			this.effectiveWkFromDB = effectiveWkFromDB;
		}

		public String getEffectiveYrFromDB()
		{
			return effectiveYrFromDB;
		}

		public void setEffectiveYrFromDB(String effectiveYrFromDB)
		{
			this.effectiveYrFromDB = effectiveYrFromDB;
		}


		public void onSave()
	    {
			System.out.println(getSelectedAssociatePayRates().toString());
	    	
	    }
		


	    public String onSaveAssociatePayRates() throws Exception
		{
			String view = null;
			boolean isFormValid = false;

			System.out.println(getSelectedAssociatePayRates().toString());

			isFormValid = true;
			if (isFormValid)
			{
				saveAssociatePayRates(getSelectedAssociatePayRates());
				
			}
			
			return view;
		}
	    
	    public AssociatePayRates getSelectedAssociatePayRates() {
			return selectedAssociatePayRates;
		}

		public void setSelectedAssociatePayRates(AssociatePayRates selectedAssociatePayRates) {
			this.selectedAssociatePayRates = selectedAssociatePayRates;
		}

		public boolean saveAssociatePayRates( AssociatePayRates associatePayRates )
	        throws Exception
	    {
	        
				return true;
	       
	        
	    }
   

}

  
    
   

    
   
	
