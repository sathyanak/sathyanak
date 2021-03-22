//<![CDATA[
/**
 * PrimeFaces OverlayPanel Widget
 */
PrimeFaces.widget.OverlayPanel.prototype.bindCommonEvents = function() {
    var $this = this;

    if(this.cfg.showCloseIcon) {
        this.closerIcon.on('mouseover.ui-overlaypanel', function() {
            $(this).addClass('ui-state-hover');
        })
        .on('mouseout.ui-overlaypanel', function() {
            $(this).removeClass('ui-state-hover');
        })
        .on('click.ui-overlaypanel', function(e) {
            $this.hide();
            e.preventDefault();
        })
        .on('focus.ui-overlaypanel', function() {
            $(this).addClass('ui-state-focus');
        })
        .on('blur.ui-overlaypanel', function() {
            $(this).removeClass('ui-state-focus');
        });
    }

    //hide overlay when mousedown is at outside of overlay
    if(this.cfg.dismissable && !this.cfg.modal) {
        var hideNS = 'mousedown.' + this.id;
        $(document.body).off(hideNS).on(hideNS, function (e) {
            if($this.jq.hasClass('ui-overlay-hidden')) {
                return;
            }

            //do nothing on target mousedown
            var target = $(e.target);
            if($this.target) {
                if($this.target.is(target)||$this.target.has(target).length > 0) {
                    return;
                }
            }

            var inputOverlay = target.closest('.ui-input-overlay');
            if(inputOverlay && inputOverlay.length) {
                var parentOverlay = inputOverlay.closest('.ui-overlaypanel');
                if(parentOverlay.is($this.jq)) {
                    return;
                }
            }

            //hide overlay if mousedown is on outside
            var offset = $this.jq.offset();
            if(e.pageX < offset.left ||
                e.pageX > offset.left + $this.jq.outerWidth() ||
                e.pageY < offset.top ||
                e.pageY > offset.top + $this.jq.outerHeight()) {

                $this.hide();
            }
        });
    }

    //Hide overlay on resize
    var resizeNS = 'resize.' + this.id;
    $(window).off(resizeNS).on(resizeNS, function() {
        if($this.jq.hasClass('ui-overlay-visible')) {
            $this.align();
        }
    });
};

//]]>
