
package jsf.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct ;
//import javax.ejb.EJB ;
//import javax.enterprise.context.Conversation ;
//import javax.enterprise.context.ConversationScoped ;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



@ManagedBean(name = "attendancePolicyController")
@ViewScoped
public class AttendancePolicyController //extends BaseCRUDController 
	implements Serializable
{
    protected static final Log log ;

    static { log = LogFactory.getLog(AttendancePolicyController.class); } // get a logger

    //@EJB
    //private NewsFeedsService newsFeedsService = null ;

     private int PAGE_SIZE = 20 ;
    private int pageNumber = 0 ;
    
    private String officeId;
    private java.lang.Double attendancePolicyMaxPoints;
    private Long attendancePolicyPeriod;
    private java.lang.Double points1;
    private java.lang.Double points2;
    private Double weightToCredit;
    private Long daysWithNoVioltn;
    
    private ArrayList officeWarningPointBean;
    
    //  Injected error messages
    @ManagedProperty(value = "#{msgs}")
    private Map<String, String> i18nText ;
    //private ResourceBundle i18nText ;

    //@Inject
    //private Conversation conversation;

    public AttendancePolicyController()
    {
        super() ;

        if  ( log.isDebugEnabled() )
        {
            log.debug( "constructor ending" ) ;
        }
    }

  /*  public ResourceBundle getI18nText( )
    {
    	if ( i18nText == null )
    	{
    		i18nText = ResourceBundle.getBundle( "i18n.AttendancePolicyMessages", getFacesContext().getViewRoot().getLocale()) ;
    	}
        return i18nText ;
    }
    
    public String getI18nText( String key )
    {
    	if (i18nText == null)
		{
			i18nText = ResourceBundle.getBundle("i18n.AttendancePolicyMessages", getFacesContext().getViewRoot().getLocale());
		}
		return i18nText.toString();
    }*/
    
    public void setOfficeWarningPointBean()
	{
	
	}
    
    public Double getWeightToCredit() {
		return weightToCredit;
	}

	public void setWeightToCredit(Double weightToCredit) {
		this.weightToCredit = weightToCredit;
	}

	public Long getDaysWithNoVioltn() {
		return daysWithNoVioltn;
	}

	public void setDaysWithNoVioltn(Long daysWithNoVioltn) {
		this.daysWithNoVioltn = daysWithNoVioltn;
	}

	public Map<String, String> getI18nText( )
    {
        return i18nText ;
    }

	public java.lang.Double getPoints1() {
		return points1;
	}

	public void setPoints1(java.lang.Double points1) {
		this.points1 = points1;
	}

	public java.lang.Double getPoints2() {
		return points2;
	}

	public void setPoints2(java.lang.Double points2) {
		this.points2 = points2;
	}

	public String getI18nText( String key )
    {
        return getI18nText().get( key ) ;
    }

    public void setI18nText( Map<String, String> i18nTextNew )
    {
        this.i18nText = i18nTextNew ;
    }

    
    @PostConstruct
    public void postConstruct( )
    {
       //    setUserContext( (UserContext)getSession().getAttribute(AttributeKeys.USER_CONTEXT) ) ;
    }

  /*  private boolean startConversation()
    {
        if ( conversation != null
        &&   conversation.isTransient() )
        {
            conversation.setTimeout( 24 * 60 * 60 * 1000 );
            conversation.begin() ;
            return true ;
        }
        else
        {
            return false ;
        }
    }

    public boolean endConversation()
    {
        if ( conversation != null
        &&  !conversation.isTransient() )
        {
            conversation.end() ;
            return true ;
        }
        else
        {
            return false ;
        }
    }*/

   

    public Long getAttendancePolicyPeriod() {
		return attendancePolicyPeriod;
	}

	public void setAttendancePolicyPeriod(Long attendancePolicyPeriod) {
		this.attendancePolicyPeriod = attendancePolicyPeriod;
	}

	public String getOfficeId() {
		return officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}

	
	
	/*public NewsFeedsService getNewsFeedsService( )
    {
        return newsFeedsService ;
    }

    public void setNewsFeedsService( NewsFeedsService newsFeedsService )
    {
        this.newsFeedsService = newsFeedsService ;
    }
*/

    public java.lang.Double getAttendancePolicyMaxPoints() {
		return attendancePolicyMaxPoints;
	}

	public void setAttendancePolicyMaxPoints(java.lang.Double attendancePolicyMaxPoints) {
		this.attendancePolicyMaxPoints = attendancePolicyMaxPoints;
	}

	

    public void openDetailsForm( ) throws Exception
    {
        if  ( log.isDebugEnabled() )
        {
            log.debug( "openDetailsForm starting" ) ;
        }

        Map<String, List<String>> paramMap = new HashMap<String, List<String>>();
        Map<String,Object> options = new HashMap<String, Object>();
        options.put( "modal", true ) ;
      //  if ( getUseResponsive() )
     //       options.put( "width", 300 ) ;
   //     else
            options.put( "width", 650 ) ;
        options.put( "height", "350px" ) ;
        options.put( "closable", true ) ;
        options.put( "draggable", false ) ;
        options.put( "resizable", false ) ;
    //    if ( getUseResponsive() )
    //        options.put( "contentWidth", 265 ) ;
    //    else
            options.put( "contentWidth", 645 ) ;
        options.put( "contentHeight", "350px" ) ;

     //   List cidValues = Arrays.asList( conversation.getId().toString() ) ;
    //    paramMap.put( "cid", cidValues ) ;
        //getRequestContext().
    //    openDialog( "newsFeedsDetails", options, paramMap ) ;

        if  ( log.isDebugEnabled() )
        {
            log.debug( "openDetailsForm ending" ) ;
        }
    }

    public boolean validateForm() throws Exception
    {
        boolean valid = true ;

        //  comment out the following line and uncomment the ones following for more real validation
     //   valid = super.validateForm() ;
/*
								    
		//  make sure createdUserId has a value 
        if ( StringUtils.isEmpty( getSelectedNewsFeeds().getCreatedUserId() ) )
        {
            valid = false ;
            addError( "createdUserId", getI18nText( "newsFeeds.createdUserId.required.error" ) ) ;
        }
		    
		//  make sure createdDate has a value 
        if ( StringUtils.isEmpty( getSelectedNewsFeeds().getCreatedDate() ) )
        {
            valid = false ;
            addError( "createdDate", getI18nText( "newsFeeds.createdDate.required.error" ) ) ;
        }
		    
		//  make sure updatedUserId has a value 
        if ( StringUtils.isEmpty( getSelectedNewsFeeds().getUpdatedUserId() ) )
        {
            valid = false ;
            addError( "updatedUserId", getI18nText( "newsFeeds.updatedUserId.required.error" ) ) ;
        }
		    
		//  make sure updatedDate has a value 
        if ( StringUtils.isEmpty( getSelectedNewsFeeds().getUpdatedDate() ) )
        {
            valid = false ;
            addError( "updatedDate", getI18nText( "newsFeeds.updatedDate.required.error" ) ) ;
        }
	*/
        return valid ;
    }
    
    public void openAddNationalNewsDialog() throws Exception
	{
		/*if (logger.isDebugEnabled())
		{
			logger.debug("::openAddNationalNewsDialog initiated...");
		}*/
		Map<String, List<String>> paramMap = new HashMap<String, List<String>>();
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", true);

		options.put("width", 1150);
		options.put("height", "430px");
				
		options.put("closable", false);
		options.put("draggable", false);
		options.put("resizable", false);
		options.put("contentWidth", 1145);
		options.put("contentHeight", "100%");

		//openDialog("/../xxxxx.xhtml", options, paramMap);
		
	/*	if (logger.isDebugEnabled())
		{
			logger.debug("::openAddNationalNewsDialog finished...");
		}*/
	}
    
    public String onCancel() throws Exception
	{
		String view = null;
		try
		{
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return view;
	}
    
    public String onSaveAttendancePolicy( ) throws Exception
    {
        boolean isFormValid = false ;
        String view = null;
       // HttpServletResponse response = getResponse();
		try
    	{
	        isFormValid = validateForm( ) ;
	        if ( isFormValid )
	        {
	        	//save
	           
        		/*StafftrackLinkTag link = new StafftrackLinkTag();
    			link = new StafftrackLinkTag();
    			link.setOutcome(getPageFrom());
    			link.setOfficeId(getOfficeId().toString());
    			String returnURL = redirect(getEncodedUrl(response, link));*/
	        }
    	}
        catch (Exception e)
		{
			/*if (e instanceof StafftrackValidationException)
			{
				StafftrackValidationException validation = (StafftrackValidationException) e;
				String exceptionMessage = validation.getErrorList() != null && validation.getErrorList().size() > 0
						? validation.getErrorList().get(0).toString() : e.getMessage();
				addError(null, exceptionMessage);
			}
			else
			{
				addError(null, e.getMessage());
			}*/
		}
        return view;        
    }
    
}