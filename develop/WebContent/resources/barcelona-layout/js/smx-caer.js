// CAER DASHBOARD

var site_url = null;

function getServerURL()
{
	var cp = null ;
	if ( site_url === null )
	{
		//path = window.location.pathname.substring(1).split("/") ;
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

function changeRangeButton( comp ){
	//console.log( "changeRangeButton() component: " + comp + " : " + $(comp).text() ) ;
	
	$(".button-range").removeClass("active");
	$(comp).addClass("active");
	
	$("#dateSelectForm\\:start_date_input, #dateSelectForm\\:end_date_input").val("");
	$("#start_date, #end_date").removeClass("md-inputwrapper-filled");	
	
	var range = getRange() * 1 ;
	var endDate = new Date();
	var startDate = new Date();
	startDate.setDate(endDate.getDate() + range ) ;  // range is actually negative, so add it instead of subtracting it
	
	var curr_date = startDate.getDate();
	var curr_month = startDate.getMonth();
	curr_month++;
	var curr_year = startDate.getFullYear();
	var start_date = curr_month + "/" + curr_date + "/" + curr_year ;
	$("#dateSelectForm\\:start_date_input").val(start_date) ;

	curr_date = endDate.getDate();
	curr_month = endDate.getMonth();
	curr_month++;
	curr_year = endDate.getFullYear();
	var end_date = curr_month + "/" + curr_date + "/" + curr_year ;
	$("#dateSelectForm\\:end_date_input").val(end_date) ;
	
	var fields = $('.bar--date-select .ui-inputfield');
	//console.log( "updating skins for .bar--date-select .ui-inputfield...found " + fields.length + " input fields" ) ;
	PrimeFaces.updateInputSkin('.bar--date-select .ui-inputfield');
	
	updateFilterDateChange([{name:"startDate",value:start_date}, {name:"endDate",value:end_date}]);

	//console.log( "dashboard.xhtml::changeRangeButton range: " + range + " start date: " + startDate + "  end date: " + endDate ) ;
	updateSourcesTable();
	updateAllCharts(1);
}

function tcSourceSelect( )
{
	console.log( "tcSourceSelect media code", $("#dashboardForm\\:talentCommunity-sources_hinput").val() ) ;

	updateTCCharts(1);
}

// Fusion Chart Functions
FusionCharts.ready(function () {
	//console.log( "FusionCharts is ready" ) ;
	setTimeout( loadSourcesCharts, 100);	
});

	function loadSourcesCharts()
	{
		//
		//  Sources
		//
		chartBarSources( "?range=-7&max=5" ) ;
		chartStackedSources( "?range=-7&offset=6" ) ;
		chartPieResponses( "?range=-7" ) ;
		chartMarimekkoResponses( "?range=-7" ) ;
		setTimeout( loadOfficesCharts, 100);	
	}

	function loadOfficesCharts()
	{
		//
		//  Offices
		//
		chartBarOffices( "?range=-7&max=5" ) ;
		setTimeout( loadJobCodesCharts, 100);	
	}

	function loadJobCodesCharts()
	{
		//
		//  Job Codes
		//
		chartPieJobs( "?range=-7&max=10" ) ;
		setTimeout( loadLocationCharts, 100);	
	}

	function loadLocationCharts()
	{
		//
		//  Locations
		//
		chartMapUsa( "?range=-7&country=1" ) ;
		chartMapCanada( "?range=-7&country=3" ) ;
		setTimeout( loadTCCharts, 100);	
	}

	function loadTCCharts()
	{
		//
		//  Talent Community
		//
		chartPieTalentCommunity( "?range=-7") ;
		chartZoomlineTalentCommunity( "?range=-7" ) ;
		setTimeout( loadWebsiteCharts, 100);	
	}

	function loadWebsiteCharts()
	{
		//
		//  Website
		//
		chartPieWebsite( "?range=-7" ) ;
		chartBarPageVisits( "?range=-7" ) ;
		chartBarWebsiteTotals( "?range=-7" ) ;
		setTimeout( loadDemographicsCharts, 100);	
	}

	function loadDemographicsCharts()
	{
		//
		//  Demographics
		//
		chartStackedDevices( "?column_name=device&range=-7" ) ;
		chartStackedBrowsers( "?column_name=browser&range=-7" ) ;
		chartPieGenders( "?range=-7" ) ;
		chartStackedEthnicities( "?column_name=ethnic&range=-7" ) ;
	}
	
function chartBarSources(dataSource){
	var serverURL = getServerURL() + "rest/chart/chart-bar-sources" + dataSource ;
	//console.log( "chartBarSources(...)  calling chartBarSources at " + serverURL ) ;
   	renderFusionChart("MSColumn2D","chart-bar-sources","350", serverURL);
}
function chartStackedSources(dataSource){
	var serverURL = getServerURL() + "rest/chart/chart-stacked-sources" + dataSource ;
	//console.log( "chartStackedSources(...)  calling chartStackedSources at " + serverURL ) ;
   	renderFusionChart("scrollstackedcolumn2d","chart-stacked-sources","350", serverURL);
}
function chartPieResponses(dataSource){
	var serverURL = getServerURL() + "rest/chart/chart-pie-multresponse" + dataSource ;
	//console.log( "chartPieResponses(...)  calling chartPieResponses at " + serverURL ) ;
   	renderFusionChart("pie2d","chart-pie-responses","300", serverURL);
}
function chartMarimekkoResponses(dataSource){
	var serverURL = getServerURL() + "rest/chart/chart-media-group-totals" + dataSource ;
	//console.log( "chartMarimekkoResponses(...)  calling chartMarimekkoResponses at " + serverURL ) ;
	renderFusionChart("marimekko","chart-marimekko-responses","400", serverURL);
}
function chartBarOffices(dataSource){
	var serverURL = getServerURL() + "rest/chart/chart-bar-offices" + dataSource ;
	//console.log( "chartBarOffices(...)  calling chartBarOffices at " + serverURL ) ;
	renderFusionChart("MSColumn2D","chart-bar-offices","350", serverURL);
}
function chartPieJobs(dataSource){
	var serverURL = getServerURL() + "rest/chart/chart-pie-jobs" + dataSource ;
	//console.log( "chartPieJobs(...)  calling chartPieJobs at " + serverURL ) ;
    renderFusionChart("pie2d","chart-pie-job-code","400", serverURL);
}
function chartMapUsa(dataSource){
	var serverURL = getServerURL() + "rest/chart/locations-totals" + dataSource ;
	//console.log( "chartMapUsa(...)  calling chartMapUsa at " + serverURL ) ;
    renderFusionChart("usa","chart-map-usa","500", serverURL);
}
function chartMapCanada(dataSource){
	var serverURL = getServerURL() + "rest/chart/locations-totals" + dataSource ;
	//console.log( "chartMapCanada(...)  calling chartMapCanada at " + serverURL ) ;
    renderFusionChart("canada","chart-map-canada","500", serverURL);
}
function chartPieTalentCommunity(dataSource){
	var serverURL = getServerURL() + "rest/chart/chart-pie-talent-community" + dataSource ;
	//console.log( "chartPieTalentCommunity(...)  calling chartPieTalentCommunity at " + serverURL ) ;
    renderFusionChart("pie2d","chart-pie-talent-community","400", serverURL);
}
function chartZoomlineTalentCommunity(dataSource){
	var serverURL = getServerURL() + "rest/chart/chart-zoomline-talent-community" + dataSource ;
	//console.log( "chartZoomlineTalentCommunity(...)  calling chartZoomlineTalentCommunity at " + serverURL ) ;
    renderFusionChart("zoomline","chart-zoomline-talent-community","400", serverURL);
}
function chartPieWebsite(dataSource){
	var serverURL = getServerURL() + "rest/chart/chart-pie-pages" + dataSource ;
	//console.log( "chartPieWebsite(...)  calling chartPieWebsite at " + serverURL ) ;
    renderFusionChart("pie2d","chart-pie-website","400", serverURL);
}
function chartBarPageVisits(dataSource){
	var serverURL = getServerURL() + "rest/chart/chart-bar-page-visits" + dataSource ;
	//console.log( "chartBarPageVisits(...)  calling chartBarPageVisits at " + serverURL ) ;
    renderFusionChart("scrollColumn2d","chart-bar-pagevisits-website","350", serverURL);
}
function chartBarWebsiteTotals(dataSource){
	var serverURL = getServerURL() + "rest/chart/chart-bar-website-totals" + dataSource ;
	//console.log( "chartBarWebsiteTotals(...)  calling chartBarWebsiteTotals at " + serverURL ) ;
    renderFusionChart("scrollColumn2d","chart-bar-pagetotals-website","350", serverURL);
}
function chartStackedDevices(dataSource){
	var serverURL = getServerURL() + "rest/chart/chart-stacked-demographics" + dataSource ;
	//console.log( "chartStackedDevices(...)  calling chartStackedDevices at " + serverURL ) ;
    renderFusionChart("scrollstackedcolumn2d","chart-stacked-devices","350", serverURL);
}
function chartStackedBrowsers(dataSource){
	var serverURL = getServerURL() + "rest/chart/chart-stacked-demographics" + dataSource ;
	//console.log( "chartStackedBrowsers(...)  calling chartStackedBrowsers at " + serverURL ) ;
    renderFusionChart("scrollstackedcolumn2d","chart-stacked-browsers","350", serverURL);
}
function chartPieGenders(dataSource){
	var serverURL = getServerURL() + "rest/chart/chart-pie-gender" + dataSource ;
	//console.log( "chartPieGenders(...)  calling chartPieGenders at " + serverURL ) ;
    renderFusionChart("multilevelpie","chart-pie-genders","400", serverURL);
}
function chartStackedEthnicities(dataSource){
	var serverURL = getServerURL() + "rest/chart/chart-stacked-demographics-ethnic" + dataSource ;
	//console.log( "chartStackedEthnicities(...)  calling chartStackedEthnicities at " + serverURL ) ;
    renderFusionChart("scrollstackedcolumn2d","chart-stacked-ethnicities","350", serverURL);
}
function renderFusionChart(type,renderAt,height,dataSource){
	new FusionCharts({
        type: type,
        renderAt: renderAt,
        width: '100%',
        height: height,
        dataFormat: 'jsonurl',
        dataSource: dataSource
    }).render();
}

// jQuery functions
$(document).ready(function() {

	$(document).on("click",".button-filter", function(){
		var id = $(this).attr("id").split(":");
		$(this).toggleClass("button-filter-open");
		$(".holder--filters[data-id="+id[1]+"]").slideToggle("fast");
	});	
	
	$(document).on("click",".state-back", function(){
	    $('.holder--states').fadeOut().promise().done(function () {
	    	$(".holder--us").fadeIn();
	    });
	});	
	
	$(document).on("click",".province-back", function(){
	    $('.holder--province').fadeOut().promise().done(function () {
	    	$(".holder--canada").fadeIn();
	    });
	});	

	// Range & Date Filters
	$(document).on("click",".button-date-filter", function(){
		handleGoButton();
	});

	// Sources Filters
	$(document).on( "change", "#dashboardForm\\:sources-job-code_input", function() {
		updateSourcesTable();
		updateSourceCharts(1);
	});
	$(document).on("click",".button-filter-sources", function(){
		updateSourcesTable();

		updateSourceCharts(1);
	});
	
	$(document).on("click",".reset-sources", function(){
		PF( "select-sources-office" ).selectValue("");
		PF('select-sources-office').filterInput[0].value = '' ;
		PF('select-sources-office').filter( null, 10 ) ;
		PF( "select-sources-job-code" ).selectValue("");
		PF("select-sources-country").selectValue("");
		PF("select-sources-state").selectValue("");
		PF("select-sources-device").selectValue("");
		PF("select-sources-browser").selectValue("");

		updateSourceCharts(1);
	});
	
	// Offices Filters
	$(document).on("click",".button-filter-offices", function(){
		updateOfficeCharts(1);
	});
	$(document).on("click",".reset-offices", function(){
		var officeSelectbox = PF("select-office-1")
		officeSelectbox.inputs.each(function() {$(this).prop('checked', false)}) ;
		officeSelectbox.checkboxes.each(function() {officeSelectbox.uncheck($(this))})
		officeSelectbox.filterInput[0].value = '' ;
		officeSelectbox.filter( null, 10 ) ;
		PF("select-offices-sources").input[0].value = "" ;
		PF("select-offices-sources").hinput[0].value = "" ;
		PF("select-offices-country").selectValue("");
		PF("select-offices-state").selectValue("");
		PF("select-offices-device").selectValue("");
		PF("select-offices-browser").selectValue("");
		PF("radio-offices-gender").buttons.each(function() {$(this).removeClass('ui-state-active')}) ;

		updateOfficeCharts(1);
	});
	
	// Job Codes Filters
	$(document).on( "change", "#dashboardForm\\:jobCodes-job-code_input", function() {
		updateJobCharts(1);
	});
	$(document).on("click",".button-filter-jobs", function(){
		updateJobCharts(1);
	});
	$(document).on("click",".reset-jobs", function(){
		PF( "select-jobCodes-office" ).selectValue("");
		PF('select-jobCodes-office').filterInput[0].value = '' ;
		PF('select-jobCodes-office').filter( null, 10 ) ;
		PF("select-jobCodes-sources").input[0].value = "" ;
		PF("select-jobCodes-sources").hinput[0].value = "" ;
		PF("select-jobCodes-country").selectValue("");
		PF("select-jobCodes-state").selectValue("");
		PF("select-jobCodes-device").selectValue("");
		PF("select-jobCodes-browser").selectValue("");
		PF("radio-jobCodes-gender").buttons.each(function() {$(this).removeClass('ui-state-active')}) ;

		updateJobCharts(1);
	});
	
	// Location Filters
	$(document).on("click",".button-search-locations", function(){

    	var range = getRange();
		var start_date = getStartDate();
		var end_date = getEndDate();

		var country = $("#dashboardForm\\:country_input").val(),
		 	state = $("#dashboardForm\\:state_input").val(),
			city = $("#dashboardForm\\:city").val(),
			sections = ["responses","registers","hires"];
			
		if(country === "" && city === "" && state === ""){
			alert("Select a Country, State or City to search");
		} else {
			$.each(sections, function( index, section ) {
	
		    	$.ajax({
			        type: "GET",
			        url: getServerURL() +"rest/chart/location-totals?section="+section+"&country="+country+"&state="+state+"&city="+city+"&range="+range+"&start_date="+start_date+"&end_date="+end_date,
			        dataType: "text",
			        success: function(data) {
						var val = jQuery.parseJSON(data);
				       	$(".data-locations-"+section+"-leader").html(val.top.leader);
				    	$(".data-locations-"+section+"-stats").html(val.top.total+" / "+val.top.per+"%");
		
			        }
			    });
			    
			});
			$(".holder--locations-search").fadeIn();
		    var chartPieLocations = getServerURL() +"rest/chart/chart-pie-locations?country="+country+"&state="+state+"&city="+city+"&range="+range+"&start_date="+start_date+"&end_date="+end_date;
	
			new FusionCharts({
			        type: 'pie2d',
			        renderAt: 'chart-pie-locations',
			        width: '100%',
			        height: '400',
			        dataFormat: 'jsonurl',
			        dataSource: chartPieLocations
			    }).render();
		}
	});
	
	// TC Filters
/*
	$(document).on( "change", "#dashboardForm\\:talentCommunity-sources", function() {
		updateTCCharts(1);
	});
*/
	// Pages Filters
	$(document).on( "change", "#dashboardForm\\:pages", function() {
		updatePagesCharts(1);
	});
	
	// Demographics Filters
	$(document).on("click",".button-filter-demographics", function(){
		updateDemoCharts(1);
	});
	
	// Export
	$(document).on("click",".action--export", function(){

		var start_date =  $("#dashboardForm\\:start_date_input").val();
		var end_date =  $("#dashboardForm\\:end_date_input").val();
		
		var table_name = $("#dashboardForm\\:table_name_input").val(),
			office_id = $("#dashboardForm\\:sources-office_input").val(),
			job_id = $("#dashboardForm\\:sources-job-code_input").val(),
			mediaId = $("#dashboardForm\\:sources_input").val(),
			country = $("#dashboardForm\\:sources-country_input").val(),
			state = $("#dashboardForm\\:sources-state_input").val(),
			device = $("#dashboardForm\\:sources-device_input").val(),
			browser = $("#dashboardForm\\:sources-browser_input").val(),
			gender = $("input[name=dashboardForm\\:sources-gender]:checked").val();
				
		if(mediaId === undefined){
			mediaId = "";
		}
		if(gender === undefined){
			gender = "";
		}
		if(start_date === "" || end_date === "" || table_name === ""){
			alert("Select a Start Date, End Date and Section to Export");
		} else {		
			$.ajax({
		        type: "GET",
		        url: getServerURL() +"rest/export/?table_name="+table_name+"&start_date="+start_date+"&end_date="+end_date+"&job_id="+job_id+"&offices="+office_id+"&mediaId="+mediaId+"&country="+country+"&state="+state+"&device="+device+"&browser="+browser+"&gender="+gender,
		        data: {
		            "id": 1,
		        },
		        dataType: "text",
		        success: function(data) {
					window.location = getServerURL() +"rest/export/?table_name="+table_name+"&start_date="+start_date+"&end_date="+end_date+"&job_id="+job_id+"&offices="+office_id+"&mediaId="+mediaId+"&country="+country+"&state="+state+"&device="+device+"&browser="+browser+"&gender="+gender;
		        }
		    });
	    }
	});
	
});

function updateSourcesTable(){
	
   	var range = getRange();
	var start_date = getStartDate();
	var end_date = getEndDate();
	
	var job_id = $("#dashboardForm\\:sources-job-code_input").val(),
		country = $("#dashboardForm\\:sources-country_input").val(),
		state = $("#dashboardForm\\:sources-state_input").val(),
		device = $("#dashboardForm\\:sources-device_input").val(),
		browser = $("#dashboardForm\\:sources-browser_input").val(),
		gender = $("input[name=dashboardForm\\:sources-gender]:checked").val();
	
	updateTable([{name:"range",value:range}, {name:"startDate",value:start_date}, {name:"endDate",value:end_date}, {name:"jobId",value:job_id},{name:"country",value:country},{name:"state",value:state},{name:"device",value:device},{name:"browser",value:browser},{name:"gender",value:gender}]);
	
}
	
//Function that gets invoked when entity is clicked.
function drillDownState(state) {
    $('.holder--us').fadeOut().promise().done(function () {
    	$(".holder--states").fadeIn();
    	
    	var range = getRange();
		var start_date = getStartDate();
		var end_date = getEndDate();
    	
    	$.ajax({
	        type: "GET",
	        url: getServerURL() + "rest/chart/state-totals?state="+state+"&range="+range+"&start_date="+start_date+"&end_date="+end_date,
	        dataType: "text",
	        success: function(data) {
            	$(".holder--state-icon").html('<div class="stateface stateface-'+state.toLowerCase()+'"></div>');
	           	formatState(data, "state");
	        }
	    });
    	
    });
}

function drillDownProvince(state) {
    $('.holder--canada').fadeOut().promise().done(function () {
    	$(".holder--province").fadeIn();
    	
    	var range = getRange();
		var start_date = getStartDate();
		var end_date = getEndDate();
    	
    	$.ajax({
	        type: "GET",
	        url: getServerURL() + "rest/chart/state-totals?state="+state+"&range="+range+"&start_date="+start_date+"&end_date="+end_date,
	        dataType: "text",
	        success: function(data) {						
            	$(".holder--province-icon").html('<div class="provincely provincely-'+state.toLowerCase()+'"></div>');
	           	formatState(data, "province");
	        }
	    });
    	
    });
}

function formatState(data, state){
	var val = jQuery.parseJSON(data);
		$(".data-"+state+"-name").html(val.top.state_name);
       	$(".data-"+state+"-registers-leader").html(val.top.registers);
    	$(".data-"+state+"-registers-stats").html(val.top.registers_per+"%");
        $(".data-"+state+"-hires-leader").html(val.top.hires);
    	$(".data-"+state+"-hires-stats").html(val.top.hires_per+"%");
       	$(".data-"+state+"-source-leader").html(val.top.source_leader);
    	$(".data-"+state+"-source-stats").html(val.top.source_total+" / "+val.top.source_per+"%");
        $(".data-"+state+"-office-leader").html(val.top.office_leader);
    	$(".data-"+state+"-office-stats").html(val.top.office_total+" / "+val.top.office_per+"%");
}

//expose to the window scope
window.drillDownState = drillDownState; 
window.drillDownProvince = drillDownProvince; 

// On Page Load
updateAllCharts(0);

// Helpers
function getRange(){

	var range = "-7";
	var text = $(".button-range.active .ui-button-text").text();
	
	if(text === "Last 7"){
		range = "-7";
	} else if (text === "Last 30"){
		range = "-30";
	} else if (text === "Last 90"){
		range = "-90";
	}
	
	return range;
}
function getStartDate()
{
	var start_date = "";
	if(!$(".button-range").hasClass("active")){
		start_date = $("#dateSelectForm\\:start_date_input").val();
	}
	
	return start_date;
}
function getEndDate()
{
	var end_date = "";
	if(!$(".button-range").hasClass("active")){
		end_date = $("#dateSelectForm\\:end_date_input").val();
	}
	
	return end_date;
}
function getOffices()
{
	var offices = [];
    $('[name=dashboardForm\\:office-1]:checked').each(function() {
    	offices.push($(this).val());
    });
    
    return offices.toString();
}

// Section Totals
function getTotals(type, sections, range, start_date, end_date, job_id, offices, mediaId, country, state, device, browser, gender){
	var id = 1;
	var serverURL = getServerURL() +"rest/chart/" ;
	//console.log( "getTotals(...) serverURL: " + serverURL + "   offices:[" + offices + "]" ) ;

	$.each(sections, function( index, section ) {
		$.ajax({
	        type: "GET",
	        url: serverURL +type+"-totals?section="+section+"&range="+range+"&start_date="+start_date+"&end_date="+end_date+"&job_id="+job_id+"&offices="+offices+"&mediaId="+mediaId+"&country="+country+"&state="+state+"&device="+device+"&browser="+browser+"&gender="+gender,
	        data: {
	            "id": id,
	        },
	        dataType: "text",
	        success: function(data) {
	        //console.log( "--------------------------" ) ;
	        //console.log( type + " data :[" + data + "]" ) ;
	        //console.log( "--------------------------" ) ;
	            var val = jQuery.parseJSON(data);
	            if(type === "job"){
	            	$(".data-"+type+"-"+section+"-leader").html(val.top.total);
	            	if ( val.top.per != undefined)
	            		$(".data-"+type+"-"+section+"-stats").html(val.top.per+"%");
	            } else {
	            	$(".data-"+type+"-"+section+"-leader").html(val.top.leader);
	            	if ( val.top.per != undefined)
	            		$(".data-"+type+"-"+section+"-stats").html(val.top.total+" / "+val.top.per+"%");
	            }
	        }
	    });
	});
}


function getAverages(range, start_date, end_date, job_id, offices, country, state, device, browser, gender){
	var id = 1;

	$.ajax({
        type: "GET",
        url: getServerURL() +"rest/chart/sources-averages?range="+range+"&start_date="+start_date+"&end_date="+end_date+"&job_id="+job_id+"&offices="+offices+"&country="+country+"&state="+state+"&device="+device+"&browser="+browser+"&gender="+gender,
        data: {
            "id": id,
        },
        dataType: "text",
        success: function(data) {
            var val = jQuery.parseJSON(data);
            $(".data-averages-registers").html(val.top.avg_registers);
            $(".data-averages-hires").html(val.top.avg_hires);
        }
    });
}

function getTimeTotals(sections, range, start_date, end_date, job_id, offices, country, state, device, browser, gender){
	var id = 1;

	$.each(sections, function( index, section ) {
		$.ajax({
	        type: "GET",
	        url: getServerURL() +"rest/chart/sources-time-totals?section="+section+"&range="+range+"&start_date="+start_date+"&end_date="+end_date+"&job_id="+job_id+"&offices="+offices+"&country="+country+"&state="+state+"&device="+device+"&browser="+browser+"&gender="+gender,
	        data: {
	            "id": id,
	        },
	        dataType: "text",
	        success: function(data) {
	            var val = jQuery.parseJSON(data);
  	            $(".data-"+section+"-time").html(val.top.total);
	        }
	    });
	});
}

function getTCTotals(type, sections, range, start_date, end_date, mediaId){
	var id = 1;

	$.each(sections, function( index, section ) {
        //console.log("TC Totals for mediaId " + mediaId + "  type " + type + " section " + section + "  range " + range + "  start_date " + start_date + "  end_date " + end_date + "  mediaId " + mediaId ) ;
		$.ajax({
	        type: "GET",
	        url: getServerURL() + "rest/chart/talent-community-totals?section="+section+"&range="+range+"&start_date="+start_date+"&end_date="+end_date+"&mediaId="+mediaId,
	        data: {
	            "id": id,
	        },
	        dataType: "text",
	        success: function(data) {
	            var val = jQuery.parseJSON(data);
	            //console.log("TC Totals for mediaId " + mediaId + "  type " + type + " section " + section + " parsed val.top.leader: " + val.top.leader + "  val.top.total " + val.top.total + " val.top.per " + val.top.per ) ;
  	            if(mediaId !== "" && type === "tcsource"){
  	            	$(".data-"+type+"-"+section+"-leader").html(val.top.leader);
	            	$(".data-"+type+"-"+section+"-total").html(val.top.total);
            		$(".data-"+type+"-"+section+"-per").html(val.top.per+"%");
            	} else if(type === "tc") {
	            	$(".data-"+type+"-"+section+"-leader").html(val.top.total);
            		$(".data-"+type+"-"+section+"-stats").html(val.top.per+"%");
               	}
	        }
	    });
	});
}

function getTCTime(type, range, start_date, end_date){
	var id = 1;

	$.ajax({
        type: "GET",
        url: getServerURL() + "rest/chart/talent-community-time-totals?range="+range+"&start_date="+start_date+"&end_date="+end_date,
        data: {
            "id": id,
        },
        dataType: "text",
        success: function(data) {
            var val = jQuery.parseJSON(data);
            $(".data-tc-time").html(val.top.total);
        }
    });
}

function getDemoTotals(type, sections, columnNames, range, start_date, end_date, mediaId, country, state){
	var id = 1;

	$.each(sections, function( index, section ) {
	
		$.each(columnNames, function( columnIndex, columnName ) {
	
			$.ajax({
		        type: "GET",
		        url: getServerURL() +"rest/chart/"+type+"-totals?section="+section+"&column_name="+columnName+"&range="+range+"&start_date="+start_date+"&end_date="+end_date+"&mediaId="+mediaId+"&country="+country+"&state="+state,
		        data: {
		            "id": id,
		        },
		        dataType: "text",
		        success: function(data) {
		            var val = jQuery.parseJSON(data);
		            if(type === "job"){
		            	$(".data-"+columnName+"-"+section+"-leader").html(val.top.total);
		            	$(".data-"+columnName+"-"+section+"-stats").html(val.top.per+"%");
		            } else {
		            	$(".data-"+columnName+"-"+section+"-leader").html(val.top.leader);
		            	$(".data-"+columnName+"-"+section+"-stats").html(val.top.total+" / "+val.top.per+"%");
		            }
		        }
		    });
		    
		});
	});
}

// Filter Refresh
function updateAllCharts(fc_update){
	
	updateSourceCharts(fc_update);
	updateOfficeCharts(fc_update);	
	updateJobCharts(fc_update);
	updateLocationsCharts(fc_update);
	updateTCCharts(fc_update);
	updatePagesCharts(fc_update);
	updateDemoCharts(fc_update);
}

function updateSourceCharts(fc_update){
	
	var range = getRange();
	var start_date = getStartDate();
	var end_date = getEndDate();
	
	var job_id = $("#dashboardForm\\:sources-job-code_input").val(),
		office_id = $("#dashboardForm\\:sources-office_input").val(),
		country = $("#dashboardForm\\:sources-country_input").val(),
		state = $("#dashboardForm\\:sources-state_input").val(),
		device = $("#dashboardForm\\:sources-device_input").val(),
		browser = $("#dashboardForm\\:sources-browser_input").val(),
		gender = $("input[name=dashboardForm\\:sources-gender]:checked").val();
			
		if(gender === undefined){
			gender = "";
		}
			
	getTotals("source", ["responses","registers","hires"], range, start_date, end_date, job_id, office_id, "", country, state, device, browser, gender);

	getTimeTotals(["responses","registers"], range, start_date, end_date, job_id, office_id, country, state, device, browser, gender);

	getAverages(range, start_date, end_date, job_id, office_id, country, state, device, browser, gender);

	if(fc_update == 1){
		var chartBarSourcesUrl = "?range="+range+"&start_date="+start_date+"&end_date="+end_date+"&job_id="+job_id+"&offices="+office_id+"&country="+country+"&state="+state+"&device="+device+"&browser="+browser+"&gender="+gender+"&max=5";
		chartBarSources(chartBarSourcesUrl);
		
		var chartStackedSourcesUrl = "?range="+range+"&start_date="+start_date+"&end_date="+end_date+"&job_id="+job_id+"&offices="+office_id+"&country="+country+"&state="+state+"&device="+device+"&browser="+browser+"&gender="+gender+"&offset=6";
		chartStackedSources(chartStackedSourcesUrl);
		
		var chartPieResponsesUrl = "?range="+range+"&start_date="+start_date+"&end_date="+end_date+"&job_id="+job_id+"&offices="+office_id+"&country="+country+"&state="+state+"&device="+device+"&browser="+browser+"&gender="+gender;
		chartPieResponses(chartPieResponsesUrl);
		
		var chartMarimekkoResponsesUrl = "?range="+range+"&start_date="+start_date+"&end_date="+end_date+"&job_id="+job_id+"&offices="+office_id+"&country="+country+"&state="+state+"&device="+device+"&browser="+browser+"&gender="+gender;
		chartMarimekkoResponses(chartMarimekkoResponsesUrl);
	}
}

function updateOfficeCharts(fc_update){

    var range = getRange();
	var start_date = getStartDate();
	var end_date = getEndDate();

	var offices = getOffices(),
		mediaId = $("#dashboardForm\\:offices-sources_hinput").val(),
		country = $("#dashboardForm\\:offices-country_input").val(),
		state = $("#dashboardForm\\:offices-state_input").val(),
		device = $("#dashboardForm\\:offices-device_input").val(),
		browser = $("#dashboardForm\\:offices-browser_input").val(),
		gender = $("input[name=dashboardForm\\:offices-gender]:checked").val();

		if(mediaId === undefined){
			mediaId = "";
		}
		if(gender === undefined){
			gender = "";
		}

	getTotals("offices", ["registers", "hires"], range, start_date, end_date, "", offices, mediaId, country, state, device, browser, gender);	

	if(fc_update == 1){
		var chartBarOfficesUrl = "?range="+range+"&start_date="+start_date+"&end_date="+end_date+"&offices="+offices+"&mediaId="+mediaId+"&state="+state+"&device="+device+"&browser="+browser+"&gender="+gender+"&max=5";
		chartBarOffices(chartBarOfficesUrl);
	}
}

function updateJobCharts(fc_update){

    var range = getRange();
	var start_date = getStartDate();
	var end_date = getEndDate();

	var job_id = $("#dashboardForm\\:jobCodes-job-code_input").val(),
		office_id = $("#dashboardForm\\:jobCodes-office_input").val(),
		mediaId = $("#dashboardForm\\:jobCodes-sources_input").val(),
		country = $("#dashboardForm\\:jobCodes-country_input").val(),
		state = $("#dashboardForm\\:jobCodes-state_input").val(),
		device = $("#dashboardForm\\:jobCodes-device_input").val(),
		browser = $("#dashboardForm\\:jobCodes-browser_input").val(),
		gender = $("input[name=dashboardForm\\:jobCodes-gender]:checked").val();
		
		if(mediaId === undefined){
			mediaId = "";
		}
		if(gender === undefined){
			gender = "";
		}

	getTotals("job", ["registers", "hires"], range, start_date, end_date, job_id, office_id, mediaId, country, state, device, browser, gender);	

	if(fc_update == 1){
		var chartPieJobsUrl = "?job_id="+job_id+"&offices="+office_id+"&range="+range+"&start_date="+start_date+"&end_date="+end_date+"&mediaId="+mediaId+"&country="+country+"&state="+state+"&device="+device+"&browser="+browser+"&gender="+gender+"&max=10";
		chartPieJobs(chartPieJobsUrl);
	}
}

function updateLocationsCharts(fc_update){

    var range = getRange();
	var start_date = getStartDate();
	var end_date = getEndDate();

	if(fc_update == 1){
		
		var chartMapUsaUrl = "?range="+range+"&start_date="+start_date+"&end_date="+end_date+"&country=1";
		chartMapUsa(chartMapUsaUrl);

		var chartMapCanadaUrl = "?range="+range+"&start_date="+start_date+"&end_date="+end_date+"&country=3";
		chartMapCanada(chartMapCanadaUrl);
	}
	
}

function updateTCCharts(fc_update){
	
	var range = getRange();
	var start_date = getStartDate();
	var end_date = getEndDate();

	getTCTotals("tc", ["responses","registers","hires"], range, start_date, end_date, "");
	getTCTime("tc", range, start_date, end_date);

	if(fc_update == 1){
	
		var chartPieTCUrl = "?range="+range+"&start_date="+start_date+"&end_date="+end_date;
		chartPieTalentCommunity(chartPieTCUrl);
	
		var mediaId =  $("#dashboardForm\\:talentCommunity-sources_input").val();
		if(mediaId === undefined){
			mediaId = "";
		}

		getTCTotals("tcsource", ["responses","registers","hires"], range, start_date, end_date, mediaId);
		
		
		var chartZoomlineTCUrl = "?range="+range+"&start_date="+start_date+"&end_date="+end_date;
		chartZoomlineTalentCommunity(chartZoomlineTCUrl);
	}
}

function updatePagesCharts(fc_update){
	
	var range = getRange();
	var start_date = getStartDate();
	var end_date = getEndDate();

	if(fc_update == 1){
	
		var chartsBarWebsiteTotalsUrl = "?range="+range+"&start_date="+start_date+"&end_date="+end_date;
		chartBarWebsiteTotals(chartsBarWebsiteTotalsUrl);

		var page =  $("#dashboardForm\\:pages_input").val();

		var chartPieWebsiteUrl = "?range="+range+"&start_date="+start_date+"&end_date="+end_date+"&page="+page;
		chartPieWebsite(chartPieWebsiteUrl);

		var chartBarPageVisitsUrl = "?range="+range+"&start_date="+start_date+"&end_date="+end_date;
		chartBarPageVisits(chartBarPageVisitsUrl);

	}
}

function updateDemoCharts(fc_update){

    var range = getRange();
	var start_date = getStartDate();
	var end_date = getEndDate();

	var mediaId = $("#dashboardForm\\:demographics-sources_input").val(),
		country = $("#dashboardForm\\:demographics-country_input").val();
		state = $("#dashboardForm\\:demographics-states_input").val();

	if(mediaId === undefined){
		mediaId = "";
	}

	getDemoTotals("demographics", ["responses", "registers", "hires"], ["device","browser"], range, start_date, end_date, mediaId, country, state);	
	getDemoTotals("demographics", ["registers", "hires"], ["gender","ethnic"], range, start_date, end_date, mediaId, country, state);	

	if(fc_update == 1){
		
		var chartStackedDevicesUrl = "?column_name=device&range="+range+"&start_date="+start_date+"&end_date="+end_date+"&mediaId="+mediaId+"&country="+country+"&state="+state;
		chartStackedDevices(chartStackedDevicesUrl);

		var chartStackedBrowsersUrl = "?column_name=browser&range="+range+"&start_date="+start_date+"&end_date="+end_date+"&mediaId="+mediaId+"&country="+country+"&state="+state;
		chartStackedBrowsers(chartStackedBrowsersUrl);
		
		var chartPieGenderUrl = "?range="+range+"&start_date="+start_date+"&end_date="+end_date+"&mediaId="+mediaId+"&country="+country+"&state="+state;
		chartPieGenders(chartPieGenderUrl);
		
		var chartStackedEthnicitiesUrl = "?column_name=ethnic&range="+range+"&start_date="+start_date+"&end_date="+end_date+"&mediaId="+mediaId+"&country="+country+"&state="+state;
		chartStackedEthnicities(chartStackedEthnicitiesUrl);
	}
	
}




