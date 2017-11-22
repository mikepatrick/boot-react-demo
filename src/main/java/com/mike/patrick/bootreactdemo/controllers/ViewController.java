package com.mike.patrick.bootreactdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
	
	@RequestMapping(path="/")
	public ModelAndView getHome() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(path="/*")
	public ModelAndView redirectHome() {
		return new ModelAndView("redirect:/");
	}
}
