package com.vignesh.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author BytesTree
 *
 */

@RestController
@RequestMapping("/employee")
public class EmployeeController{

	final static Logger logger = Logger.getLogger(EmployeeController.class);

	

	@RequestMapping(value="/home" , method=RequestMethod.GET)
	public String home(){
		System.out.println("Innnnnnnnnnn");
		return "EmployeeCrudd.html";
	}
	
	

}
