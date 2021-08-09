package com.stefanini.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller
public class HomeController {
	
	@RequestMapping("/welcome")
	public ModelAndView weolcome() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC TEST!</h3>This message is coming from HomeController.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	
	@RequestMapping("/helloWorld")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC TEST!</h3>This message is coming from HomeController.java **********</div><br><br>";
		return new ModelAndView("hello", "message", message);
	}
	
	@RequestMapping("/test")
	public ModelAndView test() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC TEST!</h3>This message is coming from HomeController.java **********</div><br><br>";
		return new ModelAndView("hello", "message", message);
	}
	
	@RequestMapping("/userTable")
	public ModelAndView testUser() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC TEST!</h3>This message is coming from HomeController.java **********</div><br><br>";
		return new ModelAndView("userTable", "message", message);
	}
}
