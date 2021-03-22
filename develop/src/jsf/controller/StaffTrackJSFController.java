package net.stafftrack.ui.web.jsf.controller ;


import java.io.IOException ;
import java.io.PrintStream ;
import java.io.Serializable ;
import java.io.UnsupportedEncodingException ;
import java.lang.reflect.Method ;
import java.text.MessageFormat;
import java.util.ArrayList ;
import java.util.Calendar ;
import java.util.Enumeration ;
import java.util.HashMap ;
import java.util.HashSet ;
import java.util.Hashtable ;
import java.util.Iterator ;
import java.util.List ;
import java.util.Locale;
import java.util.Map ;
import java.util.ResourceBundle;
import java.util.StringTokenizer ;

import javax.faces.application.ConfigurableNavigationHandler ;
import javax.faces.application.FacesMessage ;
import javax.faces.application.NavigationCase ;
import javax.faces.context.FacesContext ;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.Cookie ;
import javax.servlet.http.HttpServletRequest ;
import javax.servlet.http.HttpServletResponse ;
import javax.servlet.http.HttpSession ;

import org.apache.commons.lang.StringUtils ;
import org.apache.commons.logging.Log ;
import org.apache.commons.logging.LogFactory ;
import org.primefaces.PrimeFaces ;
import org.primefaces.context.RequestContext ;

import net.stafftrack.fw.exception.ExceptionContext ;
import net.stafftrack.fw.security.bl.UserContext ;
import net.stafftrack.fw.security.exception.NotAuthorizedSecurityException;
import net.stafftrack.fw.security.ui.WebSecurityManager;
import net.stafftrack.fw.ui.web.jsf.ui.Event ;
import net.stafftrack.fw.ui.web.util.UAgentInfo ;
import net.stafftrack.ui.web.jsf.util.tags.StafftrackLinkTag;
import net.stafftrack.ui.web.jsf.util.tags.StafftrackLinkTagRenderer;
import net.stafftrack.ui.web.util.AttributeKeys ;
import net.stafftrack.ui.web.util.MenuLinkItemBean ;
import net.stafftrack.ui.web.util.StafftrackUrl;


public abstract class StaffTrackJSFController
    implements Serializable
{
    /**
     *
     */
    private static final long serialVersionUID = 1L ;

    @Inject
    @Named( "stnWebSecurityManager" )
    protected WebSecurityManager      webSecurityManager      = null;

    protected transient final Log logger = LogFactory.getLog( this.getClass() ) ;
    protected final String className = this.getClass().getSimpleName() ;
    protected boolean isInitialized = false ;
    protected boolean useResponsive = Boolean.FALSE ;
    protected boolean hasPrintMenuLink = true;
    protected boolean hasBackMenuLink = true;

    protected HttpSession session = null ;

    protected UAgentInfo userAgentInfo = null ;
    protected Long aorId = null ;
    protected Long amrId = null ;
    protected Long officeId = null ;

    protected String serverName = null ;

    //protected String mode = null ;

    protected UserContext userContext = null ;

    protected String requestURL = null ;

	private ResourceBundle bundle = null;

    // protected ArrayList<UIMessage> errorMessages = new ArrayList<UIMessage>() ;

    public WebSecurityManager getWebSecurityManager()
    {
        return webSecurityManager;
    }

    public void setWebSecurityManager(WebSecurityManager webSecurityManager)
    {
        this.webSecurityManager = webSecurityManager;
    }

    public void preRenderView()
    {
        if ( !isPostback() )
        {
            final HttpServletRequest  request  = getRequest( ) ;
            final HttpServletResponse response = getResponse( ) ;

            List<MenuLinkItemBean> menuActions = getMenuActions( request, response ) ;
            saveMenuActions( request, menuActions ) ;

            //String menuLink = getMenuLink( request, response ) ;
            //saveMenuLink( request, menuLink ) ;

            List<MenuLinkItemBean> breadcrumb = getBreadcrumb( request, response ) ;
            saveBreadcrumb( request, breadcrumb ) ;

            //Add print menu action?
            if (hasPrintMenuLink)
            {
                String tijTarget = (String) request.getAttribute( "tijTarget" ) ;
                StringBuffer javaScript = new StringBuffer("window.open('");
                if (tijTarget != null || (userContext != null && userContext.isUseLastPageRequestURLForPrintPage()) )
                {
                    javaScript.append(tijTarget);
                    javaScript.append("&print=true");
                }
                else
                {
                    StringBuffer url = request.getRequestURL();
                    url.append("?");
                    url.append(request.getQueryString());
                    url.append("&print=true");
                    javaScript.append(response.encodeURL(url.toString()));
                }
                javaScript.append("', 'print', 'toolbar=0, menubar=0, scrollbars=yes,resizable=yes,')");
                
                generateMenuLinkItem(request,
                         response,
                         menuActions,
                         "#",
                         javaScript.toString().trim(),
                         "Print Page");
            }
            if (hasBackMenuLink)
            {
                generateMenuLinkItem(request,
                         response,
                         menuActions,
                         "#",
                         "history.back();return false;",
                         "Back");
            }

            getSession().removeAttribute( "JSFFlash" ) ;
        }
    }

    public void postAddToView()
    {
        //  this is after the component has been added to the view but before it's rendered
        //    the preRenderView is called after this
    }

    public abstract void initialize()
        throws Exception;

    public ExceptionContext initExceptionContext( String application, String activityDesc, Throwable exc )
    {
        ExceptionContext exceptionContext = null  ;

        HttpServletRequest req = getRequest() ;
        exceptionContext = new ExceptionContext() ;
        exceptionContext.setApplication( application );
        exceptionContext.setActivityDesc( activityDesc );
        exceptionContext.setCreatedDate( Calendar.getInstance().getTime() );
        exceptionContext.setErrorMessage( exc.getMessage() );
        exceptionContext.setException( exc );
        exceptionContext.setExceptionType( exc.getClass().getSimpleName() );
        exceptionContext.setIsAjax( getFacesContext().getPartialViewContext().isAjaxRequest() ? "Yes" : "No" );
        exceptionContext.setRemoteAddr( req.getRemoteAddr() );
        exceptionContext.setUri( (String)req.getServletPath() );
        exceptionContext.setUserAgent( getUserAgentInfo().getUserAgent() );

        return exceptionContext;
    }

    public Method getMethod( String methodName, Class theClass )
    {
        Method m = null ;

        try
        {
            m = theClass.getMethod( methodName, (Class[])null ) ;
        }
        catch (NoSuchMethodException nsme)
        {

        }

        return m ;
    }


    protected void printParameters( HttpServletRequest request )
    {
        String ustr = null ;
        String n = null ;
        String[] v = null ;

		Enumeration<String> params = request.getParameterNames() ;

        while ( params.hasMoreElements() )
        {
			n = params.nextElement() ;
            v = request.getParameterValues( n ) ;
            for ( int i = 0; i < v.length; i++ )
            {
                String str = v[i] ;
                // parse query args (URLENCODING) to Unicode as UTF8
                byte p[] ;
                try
                {
                    p = str.getBytes( "8859_1" ) ;
                    ustr = new String( p, 0, p.length, "UTF-8" ) ;
                }
                catch (UnsupportedEncodingException e)
                {
                    ustr = "** exception **" ;
                }


                if ( this.logger.isDebugEnabled() )
                {
                    this.logger.debug( "name='" + n + "' <" ) ;
                    this.logger.debug( ustr ) ;
                    this.logger.debug( ">" ) ;
                }
            }
        }
    }


	/**
	 * Get cookie from browser.
	 *
	 * @param name : name of cookie
	 */
	public Cookie getCookie( String name )
	{
		Cookie cookie = null ;

		Map<String, Object> cookies = getFacesContext().getExternalContext().getRequestCookieMap() ;
		if ( cookies.containsKey( name ) )
			cookie = (Cookie) cookies.get( name ) ;

		return cookie ;
	}

	/**
	 * Get cookie to store information.
	 *
	 * @param name
	 *            : name of cookie
	 * @param request
	 *            : HTTPServlet request containing cookies
	 */
	public Cookie getCookie( String name, HttpServletRequest request )
	{
		Cookie[] cookies = request.getCookies() ;

		return getCookie( name, cookies ) ;
	}


    /**
     * Get cookie to store information.
     *
     * @param name
     *            : name of cookie
     * @param cookies
     *            : client cookies
     */
    Cookie getCookie( String name, Cookie[] cookies )
    {

        if ( cookies != null )
        {
            for ( int i = 0; i < cookies.length; i++ )
            {
                Cookie cookie = cookies[i] ;
                if ( cookie.getName().equals( name ) )
                {
                    return cookie ;
                }
            }
        }

        return new Cookie( name, "" ) ;
    }


    void showCookie( PrintStream out, Cookie cookie )
        throws IOException
    {
        Map<String, String> map = getCookieValues( cookie ) ;
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator() ;
        while ( iter.hasNext() )
        {
			Map.Entry<String, String> e = iter.next() ;
            String k = e.getKey() ;
            out.println( "<" + k + ">" + (String)e.getValue() + "</" + k + ">\n" ) ;
        }
    }


    public Map<String, String> getCookieValues( Cookie cookie )
        throws IOException
    {
        // saved as key1=val1&key2=val2&...
        StringTokenizer st = new StringTokenizer( cookie.getValue(), "&" ) ;
        Map<String, String> map = new HashMap<String, String>() ;
        while ( st.hasMoreTokens() )
        {
            String pair = st.nextToken() ;
            int index = pair.indexOf( '=' ) ;
            if ( index == -1 || index == 0 )
            {
                continue ;
            }
            String k = pair.substring( 0, index ) ;
            String v = pair.substring( index + 1 ) ;
            map.put( k, v ) ;
        }
        return map ;
    }

	public void deleteCookie( String name, HttpServletRequest request, HttpServletResponse response )
	{
	    Cookie cookie = getCookie( name, request ) ;
	    cookie.setValue( "" ) ;
	    cookie.setMaxAge( 0 ) ;
	    cookie.setPath( request.getContextPath() ) ;
	    response.addCookie( cookie ) ;
	}

	public void deleteCookie( Cookie cookie, HttpServletResponse response )
	{
	    cookie.setMaxAge( 0 ) ;
	    cookie.setValue( "" );
	    cookie.setPath( "/" );
	    response.addCookie( cookie ) ;
	}

	/**
	 *   This method is a convenience method that uses the built-in JSF navigation handler to go
	 *   to an outcome.  This follows the resolution chain of JSF which allows a specific file to be
	 *   specified or a navigation rule in faces-config.xml.
	 */
    public void navigate( String outcome )
		throws IOException
	{
		ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler)getFacesContext().getApplication().getNavigationHandler() ;

		nav.performNavigation( outcome ) ;
	}

	protected NavigationCase getNavigationCase( String fromAction, String outcome )
	{
	    FacesContext facesContext = getFacesContext() ;

        ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler)facesContext.getApplication().getNavigationHandler() ;
        return nav.getNavigationCase(facesContext, fromAction, outcome) ;
	}

    public String redirect( String url )
        throws IOException
    {
        getFacesContext().getExternalContext().redirect( url ) ;

        return url ;
    }


    public boolean isInitialized( )
    {
        return isInitialized ;
    }


    public void setInitialized( boolean isInitialized )
    {
        this.isInitialized = isInitialized ;
    }


    /**
     * Copy parameter key/value pairs into cookie. Skips "op" and "name" parameters.
     */
	void setCookieValues( Cookie cookie, Map<String, String> cookieValues )
        throws IOException
    {

		Iterator<Map.Entry<String, String>> iter = null ;

		StringBuilder newvalue = new StringBuilder();
		iter = cookieValues.entrySet().iterator() ;
		while ( iter.hasNext() )
		{
			Map.Entry<String, String> e = iter.next() ;
			newvalue.append( "&" ) ;
			newvalue.append( e.getKey() ) ;
			newvalue.append( "=" ) ;
			newvalue.append( e.getValue() ) ;
		}

		cookie.setValue( newvalue.toString() ) ;
	}


    protected Throwable getRootException( Throwable e )
    {
        Throwable root = e ;

        while ( root.getCause() != null && root != root.getCause() )
        {
            root = root.getCause() ;
        }
        return root ;
    }


    public void addError( String componentId, String errorText )
    {
        if ( this.logger.isInfoEnabled() )
            this.logger.debug( "::addError starting" ) ;

        FacesMessage msg = new FacesMessage( FacesMessage.SEVERITY_ERROR, errorText, errorText ) ;
        getFacesContext().addMessage( componentId, msg ) ;
		getFacesContext().validationFailed() ;

		if ( componentId != null )
		{
		    getPrimeFacesContext().executeScript("addErrorIndicator('#" + componentId.replace(":", "\\\\:") + "');" ) ;
		}

        if ( this.logger.isInfoEnabled() )
            this.logger.debug( "::addError ending" ) ;
    }


    public void addError( String componentId, String errorText, String errorDetails )
    {
        if ( this.logger.isInfoEnabled() )
            this.logger.debug( "::addError starting" ) ;

        FacesMessage msg = new FacesMessage( FacesMessage.SEVERITY_ERROR, errorText, errorDetails ) ;
        getFacesContext().addMessage( componentId, msg ) ;
		getFacesContext().validationFailed() ;

        if ( componentId != null )
        {
            getPrimeFacesContext().executeScript("addErrorIndicator('#" + componentId.replace(":", "\\\\:") + "');" ) ;
        }

        if ( this.logger.isInfoEnabled() )
            this.logger.debug( "::addError ending" ) ;
    }


    public void addNotification( String componentId, String notificationText )
    {
        if ( this.logger.isInfoEnabled() )
            this.logger.debug( "::addNotification starting" ) ;

        FacesMessage msg = new FacesMessage( FacesMessage.SEVERITY_INFO, notificationText, "" ) ;
        getFacesContext().addMessage( componentId, msg ) ;

        if ( this.logger.isInfoEnabled() )
            this.logger.debug( "::addNotification ending" ) ;
    }


    public void addNotification( String componentId, String notificationText, String notificationDetails )
    {
        if ( this.logger.isInfoEnabled() )
            this.logger.debug( "::addNotification starting" ) ;

        FacesMessage msg = new FacesMessage( FacesMessage.SEVERITY_INFO, notificationText, notificationDetails ) ;
        getFacesContext().addMessage( componentId, msg ) ;

        if ( this.logger.isInfoEnabled() )
            this.logger.debug( "::addNotification ending" ) ;
    }


    public void addWarning( String componentId, String warningText )
    {
        if ( this.logger.isInfoEnabled() )
            this.logger.debug( "::addWarning starting" ) ;

        FacesMessage msg = new FacesMessage( FacesMessage.SEVERITY_WARN, warningText, "" ) ;
        getFacesContext().addMessage( componentId, msg ) ;

        if ( this.logger.isInfoEnabled() )
            this.logger.debug( "::addWarning ending" ) ;
    }


    public void addWarning( String componentId, String warningText, String warningDetails )
    {
        if ( this.logger.isInfoEnabled() )
            this.logger.debug( "::addWarning starting" ) ;

        FacesMessage msg = new FacesMessage( FacesMessage.SEVERITY_WARN, warningText, warningDetails ) ;
        getFacesContext().addMessage( componentId, msg ) ;

        if ( this.logger.isInfoEnabled() )
            this.logger.debug( "::addWarning ending" ) ;
    }

    public void markFieldInvalid( String componentId )
    {
        if ( this.logger.isInfoEnabled() )
            this.logger.debug( "::markFieldInvalid starting" ) ;

        getFacesContext().validationFailed() ;

        if ( componentId != null )
        {
            getPrimeFacesContext().executeScript("addErrorIndicator('#" + componentId.replace(":", "\\\\:") + "');" ) ;
        }

        if ( this.logger.isInfoEnabled() )
            this.logger.debug( "::markFieldInvalid ending" ) ;
    }

/*
    public boolean validateForm( )
        throws Exception
    {
        boolean valid = true ;

        return valid ;
    }
*/


    public FacesContext getFacesContext( )
    {
        return FacesContext.getCurrentInstance() ;
    }


	public PrimeFaces getPrimeFacesContext( )
	{
		return PrimeFaces.current() ;
	}


	/**
	 * @deprecated  replaced by {@link #getPrimeFacesContext()}
	 */
	@Deprecated
    public RequestContext getRequestContext( )
    {
        return RequestContext.getCurrentInstance() ;
    }


    public HttpServletRequest getRequest( )
    {
        return (HttpServletRequest)getFacesContext().getExternalContext().getRequest() ;
    }


    public HttpServletResponse getResponse( )
    {
        return (HttpServletResponse)getFacesContext().getExternalContext().getResponse() ;
    }


    public HttpSession getSession( )
    {
        return getRequest().getSession() ;
    }


    public HashMap<String, Object> getFlash()
    {
        HashMap<String, Object> f = null ;
        HttpSession s = getSession( true ) ;

        f = (HashMap<String, Object>)s.getAttribute( "JSFFlash" ) ;
        if ( f == null )
        {
            f = new HashMap<String, Object>() ;
            //f = getFacesContext().getExternalContext().getFlash() ;
            s.setAttribute( "JSFFlash", f );
        }

        return f ;
    }


    public Object getFlashValue( String key )
    {
        return getFlash().get( key ) ;
    }


    public void setFlashValue( String key, Object value )
    {
        getFlash().put( key, value ) ;
    }

    /*
     * http://stackoverflow.com/questions/11194112/understand-flash-scope-in-jsf2
     */
    public void setEvent( String name, Object value )
    {
        //System.out.println( "Faces version: " + getFacesContext().getClass().getPackage().getImplementationVersion() );

        HashMap<String, Object> f = getFlash() ;
        f.put( "event", new Event( name, value ) ) ;
    }


    /*
     * http://stackoverflow.com/questions/11194112/understand-flash-scope-in-jsf2
     */
    public Event getEvent( )
    {
        //System.out.println( "Faces version: " + getFacesContext().getClass().getPackage().getImplementationVersion() );

        HashMap<String, Object> f = getFlash() ;
        return (Event)f.get( "event" );
    }

    public HttpSession getSession( boolean create )
    {
        return getRequest().getSession( create ) ;
    }


    public String getClientIPAddress( )
    {
        String ipAddress = getRequest().getHeader( "X-FORWARDED-FOR" ) ;

        if ( ipAddress == null )
        {
            ipAddress = getRequest().getRemoteAddr() ;
        }

        return ipAddress ;
    }


    public String getRequestURL( )
    {
        if ( requestURL == null )
            requestURL = getRequest().getScheme( ) + "://" + getRequest().getServerName( ) + ":" + getRequest().getServerPort( ) + getRequest().getContextPath( ) ;

        return requestURL ;
    }


	/**
	 * Get the specified header from the HTTP Request.
	 *
	 * @param name : name of request header
	 */
	public String getRequestHeader( String name )
	{
		String value = null ;

		Map<String, String> headers = getFacesContext().getExternalContext().getRequestHeaderMap() ;
		if ( headers.containsKey( name ) )
			value = headers.get( name ) ;

		return value ;
	}


	/**
	 * Get the specified header from the HTTP Request.
	 *
	 * @param name : name of request header
	 */
	public Map<String, String> getRequestHeaderMap( )
	{
		return getFacesContext().getExternalContext().getRequestHeaderMap() ;
	}


    public void setRequestURL( String requestURL )
    {
        this.requestURL = requestURL ;
    }

    public boolean isPostback( )
    {
        return getFacesContext().isPostback() ;
    }

    protected void addViewMetric(String pageName, String title, String parms, boolean useBeacon)
    {
        if ( pageName.charAt(0) != '/' )
        {
            pageName = "/" + pageName ;
        }
        pageName = StringUtils.replace(pageName, " ", "_") ;
        if ( parms != null && parms.length() > 0 )
        {
            pageName = pageName + "?" + parms ;
        }
        if ( useBeacon )
        {
            getPrimeFacesContext().executeScript("addViewMetric( 'pageview', '" + pageName + "','" + title + "', true);" ) ;
        }
        else
        {
            getPrimeFacesContext().executeScript("addViewMetric( 'pageview', '" + pageName + "','" + title + "');" ) ;
        }
    }

    protected void addEventMetric(String category, String action, String label)
    {
        getPrimeFacesContext().executeScript("addEventMetric( '" + category + "', '" + action + "','" + label + "');" ) ;
    }


    public Long getAorId( )
    {
        return aorId ;
    }

    public void setAorId( Long aorId )
    {
        this.aorId = aorId ;
    }

    public Long getAmrId( )
	{
		return amrId ;
	}

	public void setAmrId( Long amrId )
	{
		this.amrId = amrId ;
	}

	public Long getOfficeId( )
	{
		return officeId ;
	}

	public void setOfficeId( Long officeId )
	{
		this.officeId = officeId ;
	}

	public String getServerName( )
    {
        return serverName;
    }


    public void setServerName( String serverName )
    {
        this.serverName = serverName;
    }


    public UserContext getUserContext( )
    {
		if ( userContext == null )
		{
			userContext = getSessionVariable( UserContext.class, AttributeKeys.USER_CONTEXT ) ;
		}
        return userContext;
    }


    public void setUserContext( UserContext userContext )
    {
        this.userContext = userContext;
    }


    public UAgentInfo getUserAgentInfo( )
    {
        //if ( userAgentInfo == null )
            userAgentInfo = new UAgentInfo( getRequest().getHeader("user-agent"), getRequest().getHeader("Accept") ) ;

        return userAgentInfo ;
    }


    public void setUserAgentInfo( UAgentInfo userAgentInfo )
    {
        this.userAgentInfo = userAgentInfo ;
    }


    public boolean isMobile( )
    {
        UAgentInfo uai = getUserAgentInfo() ;

        return uai == null ? false : uai.isMobilePhone() ;
        //return Boolean.TRUE ;
    }


    public boolean getUseResponsive( )
    {
        return useResponsive ;
    }


    public void setUseResponsive( boolean useResponsive )
    {
        this.useResponsive = useResponsive ;
    }

    public boolean isHasPrintMenuLink()
    {
        return hasPrintMenuLink;
    }

    public void setHasPrintMenuLink(boolean hasPrintMenuLink)
    {
        this.hasPrintMenuLink = hasPrintMenuLink;
    }

    public boolean isHasBackMenuLink()
    {
        return hasBackMenuLink;
    }

    public void setHasBackMenuLink(boolean hasBackMenuLink)
    {
        this.hasBackMenuLink = hasBackMenuLink;
    }

    protected void saveMenuActions( HttpServletRequest request, List<MenuLinkItemBean> menuActions )
    {
        request.setAttribute( AttributeKeys.MENU_ACTIONS_LIST, menuActions ) ;
    }

    protected List<MenuLinkItemBean> getMenuActions( HttpServletRequest request, HttpServletResponse response)
    {
        return new ArrayList<MenuLinkItemBean>() ;
    }

    protected void saveMenuLink(HttpServletRequest request, String menuLink )
    {
        request.setAttribute( AttributeKeys.LINK_MENU, menuLink ) ;
    }

    protected String getMenuLink(HttpServletRequest request, HttpServletResponse response)
    {
        return null ;
    }

    protected void saveBreadcrumb( HttpServletRequest request, List<MenuLinkItemBean> breadcrumb )
    {
        request.setAttribute( AttributeKeys.LINK_ITEMS_LIST, breadcrumb ) ;
    }

    protected List<MenuLinkItemBean> getBreadcrumb(HttpServletRequest request, HttpServletResponse response)
    {
        return null ;
    }

    public void noOp()
    {
        logger.info(this.className + "::noOp starting");
    }

    protected void openDialog( String outcome )
    {
    	getPrimeFacesContext().dialog().openDynamic( outcome );
    }

    protected void openDialog( String outcome, Map<String, Object> options, Map<String, List<String>> params )
    {
    	getPrimeFacesContext().dialog().openDynamic( outcome, options, params );
    }

    protected void closeDialog( Object value )
    {
    	getPrimeFacesContext().dialog().closeDynamic( value ) ;
    }


	public void scrollTo( String id )
	{
		getPrimeFacesContext().scrollTo( id ) ;
	}


    /*
     *     Resource from the Application's default bundle (faces-config.xml <application><message-bundle>)
     */
	public String getResourceMsg(String key){
		return getBundle().getString(key);
	}

	public String getResourceMsg(String key, String defaultValue){
		return getBundle().containsKey( key ) ? getBundle().getString(key) : defaultValue ;
	}


	public ResourceBundle getBundle(){
		if(bundle==null){
			FacesContext facesContext = getFacesContext();
			String messageBundleName = facesContext.getApplication().getMessageBundle();
			Locale locale = facesContext.getViewRoot().getLocale();
			bundle = ResourceBundle.getBundle(messageBundleName, locale);
		}
		return bundle;
	}

	public String getResourceMsg(String key,Object... arguments){
		return MessageFormat.format(getResourceMsg(key), arguments);
	}

	public String getResourceMsg(String key, String defaultValue, Object... arguments){
		return MessageFormat.format(getResourceMsg(key, defaultValue), arguments);
	}


	/*
	 *     Resource bundles from a bundle that is not the Application's default (faces-config.xml <application><message-bundle>)
	 */
    public ResourceBundle getBundle(String messageBundleName)
    {
        FacesContext facesContext = getFacesContext();
        Locale locale = facesContext.getViewRoot().getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle(messageBundleName, locale);
        return bundle;
    }

    public String getResourceMsg(ResourceBundle bundle, String key)
    {
        return bundle.getString(key);
    }

    public String getResourceMsg(ResourceBundle bundle, String key, String defaultValue)
    {
        return bundle.containsKey(key) ? bundle.getString(key) : defaultValue;
    }

    public String getResourceMsg(ResourceBundle bundle, String key, Object... arguments)
    {
        return MessageFormat.format(getResourceMsg(bundle, key), arguments);
    }

    public String getResourceMsg(ResourceBundle bundle, String key, String defaultValue, Object... arguments)
    {
        return MessageFormat.format(getResourceMsg(bundle, key, defaultValue), arguments);
    }


    /**
     * Generates a MenuLinkItem and places it in the ArrayList if the user is authorized.
     *
     * @param request
     * @param response
     * @param menuActionsList   The generated MenuLinkItem is added to this ArrayList, if authorized.
     * @param securedResource   The resource this link is to.  Use a constant from
     *  @see net.stafftrack.fw.security.bl.constants.SecuredResources
     * @param systemOperation   The operation this link will perform.  Use a constant from
     *  @see net.stafftrack.fw.security.bl.constants.SystemOperations
     * @param link              The link - should be a constant from <domain>WebConstants with a name
     * in the format <link_name>_URL.  The URL should be context relative starting with a /.
     * @param linkLabel         The link label - should be a constant from <domain>WebConstants with a name
     * in the format <link_name>_LINK_TEXT
     */
    public void generateMenuLinkItem(HttpServletRequest request, HttpServletResponse response,
        List<MenuLinkItemBean> menuActionsList, Long securedResource, Long systemOperation, String link, String linkLabel)
    {
        // MenuLinkItemBean mb;
        try
        {
            if ( webSecurityManager.isAuthorized( securedResource, systemOperation, request ) )
            {
                generateMenuLinkItem( request, response, menuActionsList, link, linkLabel );
            }
            else
            {
                generateMenuLinkItem( request, response, menuActionsList, "", linkLabel );
            }

        }
        catch (NotAuthorizedSecurityException e)
        {
            generateMenuLinkItem( request, response, menuActionsList, "", linkLabel );
        }
        catch (Exception e)
        {
            if ( logger.isErrorEnabled( ) )
            {
                logger.error( "generateMenuLinkItem exception " + e.getMessage( ) );
            }
        }
    }

    /**
     * Generates a MenuLinkItem and places it in the ArrayList.
     *
     * @param request
     * @param response
     * @param menuActionsList   The generated MenuLinkItem is added to this ArrayList, if authorized.
     * @param link              The link - should be a constant from <domain>WebConstants with a name
     * in the format <link_name>_URL.  The URL should be context relative starting with a /.
     * @param linkLabel         The link label - should be a constant from <domain>WebConstants with a name
     * in the format <link_name>_LINK_TEXT
     */
    protected void generateMenuLinkItem(HttpServletRequest request, HttpServletResponse response,
        List<MenuLinkItemBean> menuActionsList, String link, String linkLabel)
    {
        MenuLinkItemBean mb;
        try
        {
            mb = new MenuLinkItemBean( response.encodeURL( link ), linkLabel, "" );
            menuActionsList.add( mb );
        }
        catch (Exception e)
        {
            if ( logger.isErrorEnabled( ) )
            {
                logger.error( "generateMenuLinkItem exception " + e.getMessage( ) );
            }
        }
    }

    /**
     * Generates a MenuLinkItem and places it in the ArrayList.
     *
     * @param request
     * @param response
     * @param menuActionsList   The generated MenuLinkItem is added to this ArrayList, if authorized.
     * @param link              The link - should be a constant from <domain>WebConstants with a name
     * in the format <link_name>_URL.  The URL should be context relative starting with a /.
     * @param onClick           Javascript for onClick event (save and delete).
     * @param linkLabel         The link label - should be a constant from <domain>WebConstants with a name
     * in the format <link_name>_LINK_TEXT
*/
    protected void generateMenuLinkItem(HttpServletRequest request, HttpServletResponse response,
        List<MenuLinkItemBean> menuActionsList, String link, String onClick, String linkLabel)
    {
        MenuLinkItemBean mb;
        try
        {
            mb = new MenuLinkItemBean( response.encodeURL( link ), linkLabel, onClick );
            menuActionsList.add( mb );
        }
        catch (Exception e)
        {
            if ( logger.isErrorEnabled( ) )
            {
                logger.error( "generateMenuLinkItem exception " + e.getMessage( ) );
            }
        }
    }


	/**
	 * Adds a MenuLinkItemBean, typically used to represent an action link, to the
	 * menuActionsList where the link includes an onClick event.
	 *
	 * @param request
	 * @param response
	 * @param menuActionsList  The generated MenuLinkItem is added to this ArrayList, if authorized.
	 * @param securedResource  The resource this link is to.  Use a constant from
	 * 	@see net.stafftrack.fw.security.bl.constants.SecuredResources
	 * @param systemOperation  The operation this link will perform.  Use a constant from
	 * 	@see net.stafftrack.fw.security.bl.constants.SystemOperations
	 * @param link				The link - should be a constant from <domain>WebConstants with a name
	 * in the format <link_name>_URL.  The URL should be context relative starting with a /.
	 * @param onClick			Javascript for onClick event (save and delete).
	 * @param linkLabel			The link label - should be a constant from <domain>WebConstants with a name
	 * in the format <link_name>_LINK_TEXT
	 */
	public void generateMenuLinkItem( HttpServletRequest request, HttpServletResponse response,
									  List<MenuLinkItemBean> menuActionsList, Long securedResource, Long systemOperation,
									  String link, String onClick, String linkLabel )
	{
		try
		{
			if ( webSecurityManager.isAuthorized( securedResource, systemOperation, request ) )
			{
				generateMenuLinkItem( request, response, menuActionsList, link, onClick, linkLabel ) ;
			}
		}
		catch (NotAuthorizedSecurityException e)
		{
			// generateMenuLinkItem(request, response, menuActionsList, "", linkLabel);
			logger.error( "not authorized exceptiongenerateMenuLinkItem exception " + e.getMessage() ) ;
		}
		catch (Exception e)
		{
			if ( logger.isErrorEnabled() )
			{
				logger.error( "generateMenuLinkItem exception " + e.getMessage() ) ;
			}
		}
	}


    /**
     * Support for checking multiple resources and multiple operations.
     *
     * @param request
     * @param response
     * @param menuActionsList
     * @param resourceOperations
     * @param link
     * @param linkLabel
     */
    public void generateMenuLinkItemInMultipleResources(HttpServletRequest request, HttpServletResponse response,
        List<MenuLinkItemBean> menuActionsList, Hashtable<Long, HashSet<Long>> resourceOperations, String link,
        String onClick, String linkLabel)
    {
        boolean isAuthorized = false;
        try
        {
            // webSecurityManager.isAuthorized(securedResource, systemOperation,
            // request)
            for (Long securedResource : resourceOperations.keySet( ))
            {
                for (Long systemOperation : resourceOperations.get( securedResource ))
                {
                    try
                    {
                        isAuthorized = getWebSecurityManager().isAuthorized( securedResource, systemOperation, request );
                    }
                    catch (NotAuthorizedSecurityException e)
                    {
                        isAuthorized = false;
                    }
                }
                if ( isAuthorized )
                    break;
            }
            if ( isAuthorized )
            {
                generateMenuLinkItem( request, response, menuActionsList, link, onClick, linkLabel );
            }
            else
            {
                generateMenuLinkItem( request, response, menuActionsList, "", linkLabel );
            }

        }
        catch (NotAuthorizedSecurityException e)
        {
            generateMenuLinkItem( request, response, menuActionsList, "", linkLabel );
        }
        catch (Exception e)
        {
           if ( logger.isErrorEnabled( ) )
           {
                logger.error( "generateMenuLinkItem exception " + e.getMessage( ) );
           }
        }
    }

    protected String getEncodedUrl(HttpServletResponse response, StafftrackLinkTag link)
    {
        StafftrackLinkTagRenderer renderer = new StafftrackLinkTagRenderer( ) ;
        String url = renderer.getTargetURL( link ) ;
        return response.encodeURL( url ) ;
    }

    protected String getEncodedUrl(HttpServletResponse response, StafftrackUrl url)
    {
        return url.getEncodedUrl( response ) ;
    }

	@SuppressWarnings("unchecked")
	public <T> T getSessionVariable( Class<T> type, String varName )
	{
		T sessionObj = (T)getSession().getAttribute( varName ) ;
		return sessionObj ;
	}

	@SuppressWarnings("unchecked")
	public <T> T getSessionVariable( Class<T> type, String varName, Object defaultValue )
	{
		T sessionObj = (T)getSession().getAttribute( varName ) ;
		if ( sessionObj == null )
			sessionObj = (T)defaultValue ;

		return sessionObj ;
	}
}
