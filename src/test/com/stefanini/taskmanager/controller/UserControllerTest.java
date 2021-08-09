package com.stefanini.taskmanager.controller;

import static org.junit.Assert.assertEquals; 
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks; 
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import com.stefanini.taskmanager.dto.UserDTO;
import com.stefanini.taskmanager.exception.CreateUserException;
import com.stefanini.taskmanager.service.UserService;
import com.stefanini.web.controller.UserController;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
	@InjectMocks
	UserController userController;
	
	@Mock
	UserService userService;
	private Model model;
	
	@Before
	public void initTest() {
		model = new ExtendedModelMap();
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testUserController_CreateUser_Sucess() {
		UserDTO userDTO = new UserDTO();
		model.addAttribute("user", userDTO);
		assertEquals(userDTO, model.getAttribute("user"));
		
	}
	
	@Test
	public void testUserController_ShowAllUsers_Success() {
		List<UserDTO> userListDTO = new ArrayList<UserDTO>();
		userListDTO.add(new UserDTO("FirstName", "LastName", "username"));
		Mockito.when(userService.getUserList()).thenReturn(userListDTO);
		model.addAttribute("userList", userListDTO);
		userController.showAllUsers(model);
		verify(userService).getUserList();
		assertEquals(userListDTO, model.getAttribute("userList"));
		assertEquals("user-list", userController.showAllUsers(model));
	}
	
	@Test
	public void testUserController_SaveUser_Success() throws CreateUserException {
		UserDTO userDTO = new UserDTO();
		Mockito.when(userService.createUser(userDTO)).thenReturn(userDTO);
		userController.saveUser(userDTO);
		verify(userService).createUser(userDTO);
	}
}
