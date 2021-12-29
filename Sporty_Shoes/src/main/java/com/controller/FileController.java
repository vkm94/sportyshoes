package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
@RequestMapping("/mainapp")
public class FileController {
	@GetMapping("/login")

	public ModelAndView login () {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("login");
	    return modelAndView;
	}
	@GetMapping("/register")
	public ModelAndView register () {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("register");
	    return modelAndView;
	}
//	@GetMapping("/ViewUsers")
//	public ModelAndView ViewUsers () {
//	    ModelAndView modelAndView = new ModelAndView();
//	    modelAndView.setViewName("users");
//	    return modelAndView;
//	}
	//@GetMapping("/ViewProducts")
//	public Object ViewProducts() {
//		return ViewProducts;
//		
//	}
//	public ModelAndView ViewProducts () {
//	    ModelAndView modelAndView = new ModelAndView();
//	    modelAndView.setViewName("ViewProducts");
//	    return modelAndView;
//	}
	@GetMapping("/EditProducts")
	public ModelAndView EditProducts () {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("EditProducts");
	    return modelAndView;
	}
	@GetMapping("/ViewOrders")
	public ModelAndView ViewOrders () {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("orders");
	    return modelAndView;
	}
	
}
