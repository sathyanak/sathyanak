package net.sathyan.jsf.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
	@RequestScoped
	public class EditorView {
	     
	    private String text;
	     
	    private String text2;
	 
	    public String getText() {
	        return text;
	    }
	 
	    public void setText(String text) {
	        this.text = text;
	    }
	 
	    public String getText2() {
	        return text2;
	    }
	 
	    public void setText2(String text2) {
	        this.text2 = text2;
	    }
	}
	

