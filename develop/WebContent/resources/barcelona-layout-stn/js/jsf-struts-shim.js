
var _sm_proxySetupInitialized = false ;
function _sm_initializeProxySetup( )
{
	if ( _sm_proxySetupInitialized == false )
	{
		_sm_proxySetupInitialized = true ;
		Object.prototype._sm_addGetterProxy = function(property, targetObject) {
			try
			{
				if ( property != null && property.length > 0 )
				{
				    Object.defineProperty(this, property, {
				        get: function() { v = targetObject[property]; return v }
				    } ) ;
			    }
		    }
		    catch ( e )
		    {
		    	alert( "Unable to define " + property + " " + e.message ) ;
		    }
		};
	}
}

function _sm_createProxiedForm( oldForm )
{
	newForm = document.createElement("form") ;
	newForm.name = oldForm.name + "Proxy" ;
	newForm.id = oldForm.name + "Proxy" ;
	newForm.action = oldForm.action ;
	if ( oldForm.method != undefined )
	{
		newForm.method = oldForm.method ;
	}
	newForm._proxiedForm = oldForm ;
	newForm.submit = function () { try { this._proxiedForm.submit(); } catch (e) {} ;  } ;
	Object.defineProperty(newForm, 'elements', {get: function() { v = oldForm['elements']; return v } } ) ;
	Object.defineProperty(newForm, 'length', {get: function() { return oldForm.length } } ) ;
    Object.defineProperty(newForm, 'action', {get: function() { return oldForm.action }, set: function(a){oldForm.action = a} } ) ;

	/*
	 *	Create a proxy property for each field in the original form
	 */
	jQuery(oldForm.elements).each( function (idx, elt) 
		{ 
			property = elt.name ;
			if ( property != null && property.length > 0 )
			{
				//console.log( "Defining Property " + property ) ;
				if ( newForm[elt.name] == undefined )
				{
				    Object.defineProperty(newForm, elt.name, {
				        get: function() { v = oldForm[elt.name]; return v }
					} ) ;
				}
		    }
		} ) ;

	/*
	 *	Create proxy functions for the Struts Validator functions that get created automatically
	 */
	try
	{
		if ( window[oldForm.name+'_integer'] )
		{
			window[newForm.name+'_integer'] = window[oldForm.name+'_integer'] ;
		}
		if ( window[oldForm.name+'_float'] )
		{
			window[newForm.name+'_float'] = window[oldForm.name+'_float'] ;
		}
		if ( window[oldForm.name+'_floatRange'] )
		{
			window[newForm.name+'_floatRange'] = window[oldForm.name+'_floatRange'] ;
		}
		if ( window[oldForm.name+'_threeFieldDate'] )
		{
			window[newForm.name+'_threeFieldDate'] = window[oldForm.name+'_threeFieldDate'] ;
		}
		if ( window[oldForm.name+'_minlength'] )
		{
			window[newForm.name+'_minlength'] = window[oldForm.name+'_minlength'] ;
		}
		if ( window[oldForm.name+'_maxlength'] )
		{
			window[newForm.name+'_maxlength'] = window[oldForm.name+'_maxlength'] ;
		}
		if ( window[oldForm.name+'_mask'] )
		{
			window[newForm.name+'_mask'] = window[oldForm.name+'_mask'] ;
		}
		if ( window[oldForm.name+'_required'] )
		{
			window[newForm.name+'_required'] = window[oldForm.name+'_required'] ;
		}
		if ( window[oldForm.name+'_intRange'] )
		{
			window[newForm.name+'_intRange'] = window[oldForm.name+'_intRange'] ;
		}
		if ( window[oldForm.name+'_email'] )
		{
			window[newForm.name+'_email'] = window[oldForm.name+'_email'] ;
		}
		if ( window[oldForm.name+'_sfwRequiredIf'] )
		{
			window[newForm.name+'_sfwRequiredIf'] = window[oldForm.name+'_sfwRequiredIf'] ;
		}
		if ( window[oldForm.name+'_emailList'] )
		{
			window[newForm.name+'_emailList'] = window[oldForm.name+'_emailList'] ;
		}
		
	}
	catch ( e )
	{
		alert( "Error creating proxy function : " + e.message ) ;
	}

	return newForm ;
}

function _sm_setHeaderWidths(  )
{
	var count = 0 ;
	try
	{
		jQuery("div.stnpanelheader").each( function() {
			var parentTag = jQuery( this ).parent().parent() ;
			var nextTR = parentTag.next( ) ;
			var width = 0 ;
			if ( nextTR.length > 0 )
			{
				width = jQuery(nextTR).find( "table" ).width() ;
			}
			else
			{	// Go looking for the next table in the DOM.
				var t2 = jQuery(parentTag).parent().closest("table") ;
				t2 = jQuery(t2).parent().closest("table") ;
				t2 = jQuery( "table", t2 )[1] ;
				width = jQuery(t2).width() ;
			}
			count += 1 ;
			jQuery(this).width( width ) ;
		} )
	}
	catch ( e )
	{
		alert( "Exception is _sm_setHeaderWidths :" + e.message ) ;
	}
	
	return count ;
}

var _stnPreviousAlert = null ;
var _stnIsAlerting    = false ;

function _sm_initializePage( )
{
	//_sm_setHeaderWidths( ) ;
	
	var focusElt = '#{requestScope[AttributeKeys.FOCUS_ELEMENT]}' ;
	frm = jQuery("form[action*='.do']")[0] ;
	if ( frm !== undefined && focusElt.length > 0 )
	{
		idx = focusElt.lastIndexOf( '.' ) ;
		focusElt = focusElt.substring( idx + 1 ) ;
		jQuery(frm[focusElt]).focus( ) ;
	}
	else
	{
		itemNumber = 0 ;
		while ( frm != null && (elt = frm.elements[itemNumber]) != null)
		{
			if ( !elt.disabled && elt.type != 'hidden')
			{
				elt.focus();
				break;
			}
			itemNumber += 1;
		}
	}
	
	//_sm_initializeProxySetup( ) ;
	_sm_setupProxyForm( ) ;
	
	//jQuery("#stBreadCrumb").prependTo( jQuery(".layout-main-content") ) ;
	/*
	jQuery("tr[bgcolor='#f0f0f0']").attr( "bgcolor", "transparent" ) ;
	jQuery("table[bgcolor='white']").attr( "bgcolor", "transparent" ) ;
	jQuery("table[bgcolor='#000000']").each( function() {
			jQuery(this).attr( "bgcolor", "transparent" ) ; 
			jQuery(this).parent().closest("table").each( function() { 
				jQuery(this).addClass( "tileContentPanel" ) ;
				jQuery( 'table:last-of-type', this ).addClass( "lastTable" ) ;
			} )
		} 
	);
	*/

	jQuery( '.layout-main-content-area table:first' ).addClass( "stnPanel" ) ;

	if ( strutsOnLoad )
	{
		strutsOnLoad( ) ;
	}

	if ( strutsAfterOnLoad )
	{
		strutsAfterOnLoad( ) ;
	}

	jQuery("form").submit( _sm_showBusyStatus ) ;

	//jQuery(".layout-main a:not([id~='actions-menu'])").click( _sm_showBusyStatus ) ;
	jQuery(".layout-main a:not([id~='actions-menu'])").each( 
			function ( i, e ) {
				if ( e.href != null 
				&&   ((e.href.indexOf( e.baseURI ) == 0 && e.href.indexOf( "#") == e.href.length - 1) || e.href.length == 0) 
				&&   e.onclick != null )
				{
					//
					//	Don't override the onClick handler because we're not doing a page transition.
					//	However, remove the href so the page doesn't jump onClick
					//
					e.removeAttribute( "href" ) ;
				}
				else
				{
					return ;
					/*
					$(e).click( _sm_showBusyStatus ) ;
					*/
					
					/*
					e.oldOnClick = e.onclick ;
					e.onclick = function() { 
						_sm_showBusyStatus(arguments[0]);
						if ( this.oldOnClick )
						{
							this.oldOnClick(arguments); 
						}
						_sm_hideBusyStatus(arguments[0]); 
					}
					e.addEventListener('loadend', function(e) {
						  console.log('Link load finished');
					});
					*/
					$(e).click( function( event ) {
							_sm_showBusyStatus( event ) ;

			                var target = event.target;
			                // When tracking the download, we're going to have
			                // the server echo back a cookie that will be set
			                // when the download Response has been received.
			                var dldId = ( new Date() ).getTime();
			                //debugger ;
			                // Update the URL that is *currently being requested*
			                // to contain the dldId. This will then be response
			                // cookie header.
			                var parmsExist = target.href.indexOf( "?" ) > 0 ;
			                
			                if ( parmsExist )
		                	{
			                	dldIdIndex = target.href.indexOf( "dldId=" ) ;
			                	if ( dldIdIndex > 0 )
		                		{	// The parameter already exists
			                		target.href = target.href.substr(0, dldIdIndex + 6) + dldId ;
		                		}
				                else
			                	{
				                	target.href += "&dldId=" + dldId ;
			                	}
		                	}
			                else
		                	{
			                	target.href += "?dldId=" + dldId ;
		                	}
			                
			                // The local cookie cache is defined in the browser
			                // as one large string; we need to search for the
			                // name-value pattern with the above ID.
			                var cookiePattern = new RegExp( ( "dldId=" + dldId ), "i" );
			                // Now, we need to start watching the local Cookies to
			                // see when the download ID has been updated by the
			                // response headers.
			                var cookieTimer = setInterval( checkCookies, 500 );
			                // I check the local cookies for an update.
			                function checkCookies() {
			                    // If the local cookies have been updated, clear
			                    // the timer and say thanks!
			                    if ( document.cookie.search( cookiePattern ) >= 0 ) {
			                        clearInterval( cookieTimer );
			                        _sm_hideBusyStatus( ) ;
			                        return( console.log( "Download complete!!" ) );
			                    }
			                    console.log( "File still downloading... (" + dldId  + ")", new Date().getTime() );
			                }							
						} // Anonymous function
					) ; // click
				}	// else
			}	// Anonymous function
		) ;		// Each
	jQuery(".layout-tabmenu-contents a").click( _sm_showBusyStatus ) ;
	$(window).bind("pageshow", function(event) {
	    if (event.originalEvent.persisted) {
	    	 _sm_hideBusyStatus( event ) ;
	    }
	});
	
	_stnPreviousAlert = window.alert ;
	//window.alert = _stnAlert ;
	return true ;
}

function _sm_setupProxyForm( )
{
	try
	{
		oldForm = jQuery("form[action*='.do']") ;
		if ( oldForm.length > 0 )
		{
			oldForm = oldForm[0] ;
			newForm = _sm_createProxiedForm( oldForm ) ;
			document.forms[0].parentNode.insertBefore( newForm , document.forms[0] ) ;
		}
	}
	catch ( e )
	{
		alert( "Error " + e ) ;
	}
}

jQuery(document).ready( _sm_initializePage ) ;
