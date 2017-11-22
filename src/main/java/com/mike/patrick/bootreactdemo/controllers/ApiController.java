package com.mike.patrick.bootreactdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@RequestMapping(path="/api/greeting") 
	public String greeting() {
		return "Hello, user";
		
	}
}
