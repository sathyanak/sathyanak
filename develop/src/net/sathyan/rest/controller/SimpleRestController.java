package net.sathyan.rest.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.sathyan.valueobjects.EmployeeVO;

@RestController
@RequestMapping("/sathyan")
public class SimpleRestController {


	@RequestMapping(value = "/getExample", method = RequestMethod.GET)
	public String getSomething(@RequestParam(value = "request") String request,	@RequestParam(value = "version", required = false, defaultValue = "1") int version) {
		
	
		String response = null;

	
			
				response = "Response from Spring RESTful Webservice : "+ request;

			
		return response;
	}
	
	
	@RequestMapping(value = "/getList", method = RequestMethod.GET)
	public ArrayList<EmployeeVO> getSomething() {
		 
		ArrayList<EmployeeVO> returnList = new ArrayList<EmployeeVO> ();
		
		EmployeeVO empVo = new EmployeeVO("Swapna", "Suresh", 35, "Mediator", new Float( 90.2));
		returnList.add(empVo);
		empVo = new EmployeeVO("Prakash", "Jadhav", 35, "Turner", new Float( 45.2));
		returnList.add(empVo);
		
		return returnList;
	}
	

	@RequestMapping(value = "/postExample", method = RequestMethod.POST)
	public String postSomething(@RequestBody EmployeeVO vo) {
		
		String response = null;

		return response;
	}

}
