package net.sathyan.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import net.sathyan.service.TestService;

@Component
public class Start {
	
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("net.sathyan");
        appContext.refresh();
 
        TestService customerService = (TestService) appContext.getBean("testService");
        customerService.test();
 
        appContext.close();

	}

	

}
