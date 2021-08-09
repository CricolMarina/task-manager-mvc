package com.stefanini.web.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.config.annotation.RedirectViewControllerRegistration;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;
import org.springframework.web.servlet.view.RedirectView;

import com.stefanini.taskmanager.dto.TaskDTO;
import com.stefanini.taskmanager.exception.AddTaskException;
import com.stefanini.taskmanager.service.TasksService;

@Controller
public class TaskController {
	private static final Logger logger = LogManager.getLogger(TaskController.class);

	@Autowired
	private TasksService taskService;
	
	@GetMapping("/tasksList")
	public String showAllTasks(Model model) {
		List<TaskDTO> taskList = taskService.getTaskList();
		model.addAttribute("tasks", taskList);
		model.addAttribute("Message", "Task List");
		return "task-list";
	}
	
	@RequestMapping("/addTaskForm")
	public String addTask(Model model) {
		TaskDTO taskDTO = new TaskDTO();
		model.addAttribute("task", taskDTO);
		return "add-task";
	}
	
	@GetMapping(value = "/save-task")
	public ModelAndView saveTask(@ModelAttribute("task") TaskDTO taskDTO) {
		String message ="";
		boolean wasAdded = false;
		try {
			if(taskService.addTask(taskDTO)!=null) {
				wasAdded = true;
				message = "New task added!";
			}
		} catch (AddTaskException e) {
			message = "Username was not found in DB!";
		}
		return new ModelAndView("save-task","message", message).addObject("wasAdded", wasAdded);
	}
}
