package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Operations {
	
	@Autowired
	Result result;
	
	
	//@RequestMapping(value = "/rest/resttosoap", method = RequestMethod.POST,consumes = MediaType.APPLICATION_XML_VALUE)
	
	
	//method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE
	@PostMapping(value="/rest/resttosoap" ,consumes = MediaType.APPLICATION_XML_VALUE)
	public Result resttosoap( Properties p) {
		
		result.setAddress("Chennai");
		result.setStatus("Registration Successful");
		
		
	    return result;

	
	
	
}}