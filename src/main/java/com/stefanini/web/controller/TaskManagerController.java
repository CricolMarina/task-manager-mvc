package com.stefanini.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TaskManagerController {
	
	@RequestMapping("/user-list")
	public ModelAndView userView() {
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** User Table **********</div><br><br>";
	return new ModelAndView("welcome", "message", message);
	}
	
	@RequestMapping("/task-list")
	public ModelAndView taskView() {
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Task Table **********</div><br><br>";
	return new ModelAndView("welcome", "message", message);
	}
	
	@GetMapping("/home-page")
	public ModelAndView homePage() {
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>** "
				+ "Please select a command to execute **"
				+ "</div><br><br>";
		
		return new ModelAndView("home-page", "message", message);
	}
}
