/*
 Sticky-kit v1.1.2 | WTFPL | Leaf Corcoran 2015 | http://leafo.net
*/
(function(){var b,f;b=this.jQuery||window.jQuery;f=b(window);b.fn.stick_in_parent=function(d){var A,w,J,n,B,K,p,q,k,E,t;null==d&&(d={});t=d.sticky_class;B=d.inner_scrolling;E=d.recalc_every;k=d.parent;q=d.offset_top;p=d.spacer;w=d.bottoming;null==q&&(q=0);null==k&&(k=void 0);null==B&&(B=!0);null==t&&(t="is_stuck");A=b(document);null==w&&(w=!0);J=function(a,d,n,C,F,u,r,G){var v,H,m,D,I,c,g,x,y,z,h,l;if(!a.data("sticky_kit")){a.data("sticky_kit",!0);I=A.height();g=a.parent();null!=k&&(g=g.closest(k));
if(!g.length)throw"failed to find stick parent";v=m=!1;(h=null!=p?p&&a.closest(p):b("<div />"))&&h.css("position",a.css("position"));x=function(){var c,f,e;if(!G&&(I=A.height(),c=parseInt(g.css("border-top-width"),10),f=parseInt(g.css("padding-top"),10),d=parseInt(g.css("padding-bottom"),10),n=g.offset().top+c+f,C=g.height(),m&&(v=m=!1,null==p&&(a.insertAfter(h),h.detach()),a.css({position:"",top:"",width:"",bottom:""}).removeClass(t),e=!0),F=a.offset().top-(parseInt(a.css("margin-top"),10)||0)-q,
u=a.outerHeight(!0),r=a.css("float"),h&&h.css({width:a.outerWidth(!0),height:u,display:a.css("display"),"vertical-align":a.css("vertical-align"),"float":r}),e))return l()};x();if(u!==C)return D=void 0,c=q,z=E,l=function(){var b,l,e,k;if(!G&&(e=!1,null!=z&&(--z,0>=z&&(z=E,x(),e=!0)),e||A.height()===I||x(),e=f.scrollTop(),null!=D&&(l=e-D),D=e,m?(w&&(k=e+u+c>C+n,v&&!k&&(v=!1,a.css({position:"fixed",bottom:"",top:c}).trigger("sticky_kit:unbottom"))),e<F&&(m=!1,c=q,null==p&&("left"!==r&&"right"!==r||a.insertAfter(h),
h.detach()),b={position:"",width:"",top:""},a.css(b).removeClass(t).trigger("sticky_kit:unstick")),B&&(b=f.height(),u+q>b&&!v&&(c-=l,c=Math.max(b-u,c),c=Math.min(q,c),m&&a.css({top:c+"px"})))):e>F&&(m=!0,b={position:"fixed",top:c},b.width="border-box"===a.css("box-sizing")?a.outerWidth()+"px":a.width()+"px",a.css(b).addClass(t),null==p&&(a.after(h),"left"!==r&&"right"!==r||h.append(a)),a.trigger("sticky_kit:stick")),m&&w&&(null==k&&(k=e+u+c>C+n),!v&&k)))return v=!0,"static"===g.css("position")&&g.css({position:"relative"}),
a.css({position:"absolute",bottom:d,top:"auto"}).trigger("sticky_kit:bottom")},y=function(){x();return l()},H=function(){G=!0;f.off("touchmove",l);f.off("scroll",l);f.off("resize",y);b(document.body).off("sticky_kit:recalc",y);a.off("sticky_kit:detach",H);a.removeData("sticky_kit");a.css({position:"",bottom:"",top:"",width:""});g.position("position","");if(m)return null==p&&("left"!==r&&"right"!==r||a.insertAfter(h),h.remove()),a.removeClass(t)},f.on("touchmove",l),f.on("scroll",l),f.on("resize",
y),b(document.body).on("sticky_kit:recalc",y),a.on("sticky_kit:detach",H),setTimeout(l,0)}};n=0;for(K=this.length;n<K;n++)d=this[n],J(b(d));return this}}).call(this);

(function () {
    var v = 3,
        div = document.createElement('div'),
        all = div.getElementsByTagName('i'),
        browser,
        isIE;

    while ( div.innerHTML = '<!--[if gt IE ' + (++v) + ']><i></i><![endif]-->', all[0]);
    v = v > 4 ? v : document.documentMode;
    if (v) {
        browser = " ie"
        for(var i = 5; i<12; i++){
            if(v < i) {
                browser += ' lte-ie' + i;
            }else if (v > i) {
                browser += ' gte-ie' + i;
            }else if (v == i) {
                browser += ' ie' + i;
            }
        }

        isIE = {
            "version" : v
        }

    } else {
        browser = ' not-ie';
        isIE = false;
    }
    document.documentElement.className += browser;
    window.ie = isIE;
}());

// Equal height plugin for Button Groups
$(function() {
	$('.matchHeight').matchHeight();
});

// Scrool to Top for button clicks
/*
$(document).on( "click", ".ui-wizard-nav-next, .ui-wizard-nav-back", function() {
	$('html, body').animate({
      scrollTop: $('body').offset().top
    }, 500, function(){});
});
*/

// Listener for .content changing height
(function(){
  var attachEvent = document.attachEvent;
  var isIE = navigator.userAgent.match(/Trident/);
  console.log(isIE);
  var requestFrame = (function(){
    var raf = window.requestAnimationFrame || window.mozRequestAnimationFrame || window.webkitRequestAnimationFrame ||
        function(fn){ return window.setTimeout(fn, 20); };
    return function(fn){ return raf(fn); };
  })();
  
  var cancelFrame = (function(){
    var cancel = window.cancelAnimationFrame || window.mozCancelAnimationFrame || window.webkitCancelAnimationFrame ||
           window.clearTimeout;
    return function(id){ return cancel(id); };
  })();
  
  function resizeListener(e){
    var win = e.target || e.srcElement;
    if (win.__resizeRAF__) cancelFrame(win.__resizeRAF__);
    win.__resizeRAF__ = requestFrame(function(){
      var trigger = win.__resizeTrigger__;
      trigger.__resizeListeners__.forEach(function(fn){
        fn.call(trigger, e);
      });
    });
  }
  
  function objectLoad(e){
    this.contentDocument.defaultView.__resizeTrigger__ = this.__resizeElement__;
    this.contentDocument.defaultView.addEventListener('resize', resizeListener);
  }
  
  window.addResizeListener = function(element, fn){
    if (!element.__resizeListeners__) {
      element.__resizeListeners__ = [];
      if (attachEvent) {
        element.__resizeTrigger__ = element;
        element.attachEvent('onresize', resizeListener);
      }
      else {
        if (getComputedStyle(element).position == 'static') element.style.position = 'relative';
        var obj = element.__resizeTrigger__ = document.createElement('object'); 
        obj.setAttribute('style', 'display: block; position: absolute; top: 0; left: 0; height: 100%; width: 100%; overflow: hidden; pointer-events: none; z-index: -1;');
        obj.__resizeElement__ = element;
        obj.onload = objectLoad;
        obj.type = 'text/html';
        if (isIE) element.appendChild(obj);
        obj.data = 'about:blank';
        if (!isIE) element.appendChild(obj);
      }
    }
    element.__resizeListeners__.push(fn);
  };
  
  window.removeResizeListener = function(element, fn){
    element.__resizeListeners__.splice(element.__resizeListeners__.indexOf(fn), 1);
    if (!element.__resizeListeners__.length) {
      if (attachEvent) element.detachEvent('onresize', resizeListener);
      else {
        element.__resizeTrigger__.contentDocument.defaultView.removeEventListener('resize', resizeListener);
        element.__resizeTrigger__ = !element.removeChild(element.__resizeTrigger__);
      }
    }
  }
})();
		
		
// One Page Anchor Nav
$(document).ready(function() {

	$(document).on( "click", ".menu-trigger", function() {
		$("#overlay-menu").addClass("is-open");
		$(".js-off-canvas-overlay").addClass("is-visible").addClass("is-closable");
	});
	$(document).on( "click", ".close-button", function() {
		$("#overlay-menu").removeClass("is-open");
		$(".js-off-canvas-overlay").removeClass("is-visible").removeClass("is-closable");
	});
	$(document).on( "click", ".js-off-canvas-overlay.is-closable", function() {
		$("#overlay-menu").removeClass("is-open");
		$(".js-off-canvas-overlay").removeClass("is-visible").removeClass("is-closable");
	});

	if($("body").hasClass("template-page") && $(".sticky-sidebar").length > 0){
		$("#nav").onePageNav();
		$(".sticky-sidebar").stick_in_parent({
			offset_top: 120,
			recalc_every: 1
		});

		// Trigger redoing sticky if height changes
		var myElement = document.getElementsByClassName("content")[0];
		var myResizeFn = function(){
			$(document.body).trigger("sticky_kit:recalc");
		};
		addResizeListener(myElement, myResizeFn);					

	}
	
	$(document).on( "click", ".search-jobs", function() {
		var location = $("#jobSearchForm\\:location").val();
		var category = $("#jobSearchForm\\:jobCategory").val();
		var keyword = $("#jobSearchForm\\:keyword").val();
		var scroll = 0;

		$("#jobSearchForm\\:location").val("").removeClass("ui-state-filled");
		$("#jobSearchForm\\:jobCategory").val("").removeClass("ui-state-filled");
		$("#jobSearchForm\\:keyword").val("").removeClass("ui-state-filled");
		$("#jobSearchForm\\:addKeyword").val("").removeClass("ui-state-filled");
		$(".tags").html("");
		
		if(location !== ""){
			$(".tags").append("<li><a data-id=\""+location+"\">"+location+"</a></li>");
			scroll = 1;
		}		
		if(category !== ""){
			$(".tags").append("<li><a data-id=\""+category+"\">"+category+"</a></li>");
			scroll = 1;
		}	
		if(keyword !== ""){
			$(".tags").append("<li><a data-id=\""+keyword+"\">"+keyword+"</a></li>");
			scroll = 1;
		}	
		
		if(scroll === 1){
			smoothScroll("#searchArea");
		}
	});
	
	$(document).on( "click", ".tags a", function() {
		$(this).parent("li").fadeOut("fast").promise().done(function () {
			$(this).parent("li").remove();
		});
	});
	
	$(document).on( "click", "#jobSearchForm\\:searchAddKeyword", function() {
		var keyword = $("#jobSearchForm\\:addKeyword").val();
		if(keyword !== ""){
			$(".tags").append("<li><a data-id=\""+keyword+"\">"+keyword+"</a></li>");
			$("#jobSearchForm\\:addKeyword").val("").removeClass("ui-state-filled");
		}	
	});
	
	$(document).on( "change", "#jobSearchForm\\:country_input, #jobSearchForm\\:state_input, #jobSearchForm\\:filterJobCategory_input, #jobSearchForm\\:employmentType_input", function() {
		var val = $(this).val();
		if(val !== ""){
			$(this).closest(".filter-select").addClass("active");
		} else {
			$(this).closest(".filter-select").removeClass("active");
		}	
	});
	
	$(document).on( "keyup", "#jobSearchForm\\:filterCity, #jobSearchForm\\:filterZip", function() {
		var val = $(this).val();
		if(val !== ""){
			$(this).closest(".filter-text").addClass("active");
		} else {
			$(this).closest(".filter-text").removeClass("active");
		}	
	});
	
	$(document).on( "click", ".filter-select.active a", function() {
		var id = $(this).attr("data-id");
		PF('select-'+id).selectValue("");
		$(this).closest(".filter-input").removeClass("active");
	});
	
	$(document).on( "click", ".filter-text.active a", function() {
		var id = $(this).attr("data-id");
		$("#jobSearchForm\\:"+id).val("").removeClass("ui-state-filled");
		$(this).closest(".filter-text").removeClass("active");
	});
	
	$(document).on( "click", "#jobSearchForm\\:reset", function() {
		var id = $(this).attr("data-id");
		$("#jobSearchForm\\:"+id).val("").removeClass("ui-state-filled");
		$(this).closest(".filter-text").removeClass("active");
	});
	
	$(document).on( "click", ".filter-jobs", function() {
		$('.page--search aside').toggleClass('active');
	});
	
	$(document).on( "click", ".refine-search-results, .close-filter", function() {
		$('.page--search aside').removeClass('active');
	});
		
	// CAER DASHBOARD
	$(document).on("click",".button-filter", function(){
		var id = $(this).attr("id");
		console.log(id);
	});	
		
});

function smoothScroll(element){
	$("html, body").animate({
	  	scrollTop: $(element).offset().top - 130
	}, 500, function(){});
}

(function() {

    "use strict";

    var toggles = document.querySelectorAll(".c-hamburger");

    for (var i = toggles.length - 1; i >= 0; i--) {
        var toggle = toggles[i];
        toggleHandler(toggle);
    }

    function toggleHandler(toggle) {
        toggle.addEventListener( "click", function(e) {
            e.preventDefault();
            (this.classList.contains("is-active") === true) ? this.classList.remove("is-active") : this.classList.add("is-active");
            $('.topbar-menu').toggleClass('is-active');
            $('body').toggleClass('nav--mobile__open');
        });
    }

})();