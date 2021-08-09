package com.stefanini.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.stefanini.taskmanager.dto.UserDTO;
import com.stefanini.taskmanager.exception.CreateUserException;
import com.stefanini.taskmanager.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/usersList")
	public String showAllUsers(Model model) {
		List<UserDTO> userList = userService.getUserList();
		model.addAttribute("users", userList);
		model.addAttribute("Message", "User list");
		return "user-list";
	}
	
	@RequestMapping("/createUserForm")
	public String createUser(Model model) {
		UserDTO userDTO = new UserDTO();
		model.addAttribute("user", userDTO);
		return "add-user";
	}
	
	@GetMapping(value = "/save-user")
	public ModelAndView saveUser(@ModelAttribute("user") UserDTO userDTO) {
		String message;
		boolean wasCreated = false;
		try {
			if(userService.createUser(userDTO)!=null) {
				wasCreated = true;
			}
			message = "New user was added!";
		} catch (CreateUserException e) {
			message = "Duplicate entry! Username already exists in DB! ";
		}
		return new ModelAndView("save-user", "message", message).addObject("wasCreated", wasCreated);
	}
}	
	
	
