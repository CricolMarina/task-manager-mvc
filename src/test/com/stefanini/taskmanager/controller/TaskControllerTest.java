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

import com.stefanini.taskmanager.dto.TaskDTO;
import com.stefanini.taskmanager.exception.AddTaskException;
import com.stefanini.taskmanager.service.TasksService;
import com.stefanini.taskmanager.service.UserService;
import com.stefanini.web.controller.TaskController;

@RunWith(MockitoJUnitRunner.class)
public class TaskControllerTest {
	@InjectMocks
	TaskController taskController;
	
	@Mock
	TasksService taskService;
	@Mock
	UserService userSrvice;
	private Model model;
	
	@Before
	public void initTest() {
		model = new ExtendedModelMap();
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testTaskController_ShowAllTasks_Success() {
		List<TaskDTO> taskListDTO = new ArrayList<TaskDTO>();
		Mockito.when(taskService.getTaskList()).thenReturn(taskListDTO);
		model.addAttribute("taskList", taskListDTO);
		taskController.showAllTasks(model);
		verify(taskService).getTaskList();
		assertEquals(taskListDTO, model.getAttribute("taskList"));
		assertEquals("task-list", taskController.showAllTasks(model));
	}
	
	@Test
	public void testTaskController_AddTask_Success() {
		TaskDTO taskDTO = new TaskDTO("username", "task_title", "task_description");
		model.addAttribute("task", taskDTO);
		assertEquals(taskDTO, model.getAttribute("task"));
	}
	
	@Test
	public void testTaskController_SaveTask_Success() throws AddTaskException {
		TaskDTO taskDTO = new TaskDTO();
		Mockito.when(taskService.addTask(taskDTO)).thenReturn(taskDTO);
		taskController.saveTask(taskDTO);
		verify(taskService).addTask(taskDTO);
	}
}
