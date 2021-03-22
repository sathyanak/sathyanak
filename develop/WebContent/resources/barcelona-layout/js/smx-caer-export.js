// CAER DASHBOARD

var site_url = null;

function getServerURL()
{
	var cp = null ;
	if ( site_url === null )
	{
		if (!window.location.origin) 
		{
			window.location.origin = window.location.protocol + "//" + window.location.hostname + (window.location.port ? ':' + window.location.port: '');
		}
		site_url = window.location.origin + "/" ;
		//console.log( "getServerURL(...)  site_url=[" + site_url + "]" ) ;
		if (typeof getContextPath === "function")
		{
			cp = getContextPath() ;
			//console.log( "getServerURL()  contextPath=[" + cp + "]" ) ;
			if ( cp !== undefined && cp != null && cp.length > 0 )
				site_url += cp + "/";
		}
	}

	//console.log( "getServerURL(...)  URL=[" + site_url + "]" ) ;
	return site_url ;
}

