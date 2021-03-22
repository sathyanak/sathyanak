//	Stafftrack customizations in JSF
function addErrorIndicator( s )
{
	$( s ).addClass('ui-state-error') ;
}

function removeErrorIndicator( s )
{
	$( s ).removeClass('ui-state-error') ;
}

function _sm_showBusyStatus( evt )
{ 
	try 
	{ 
		if ( evt.defaultPrevented == false  || evt.isDefaultPrevented() == false )
		{
			PF('ajaxStatus').trigger('start');
		}
	} 
	catch(e)
	{
		alert('Error while submitting') ; 
	} 
}

function _sm_hideBusyStatus( evt )
{
	PF('ajaxStatus').trigger('complete');
}

function _sm_closeActionMenus()
{
	PF('actions-panel').hide() ;
	PF('sideActionsMenu').deactivate($('li.action-item')) ;
}