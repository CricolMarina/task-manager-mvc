package com.stefanini.taskmanager.utils;

import com.stefanini.taskmanager.domain.Task;
import com.stefanini.taskmanager.domain.User;
import com.stefanini.taskmanager.dto.TaskDTO;
import com.stefanini.taskmanager.dto.UserDTO;

public class MapperEntityToDTO {
	
	public static TaskDTO mapEntityToDTO(Task task) {
		String username = task.getUser().getUsername();
		String title = task.getTitle();
		String description = task.getDescription();
		TaskDTO taskDTO = new TaskDTO(username, title, description);
		return taskDTO;
	}
	
	public static Task mapDtoToEntity(TaskDTO taskDTO) {
		String username = taskDTO.getUsername();
		String title = taskDTO.getTitle();
		String description = taskDTO.getDescription();
		Task task  = new Task(username, title, description);
		return task;
	}
	
	public static User mapDtoToEntity(UserDTO userDTO) {
		String firstName = userDTO.getFirstName();
		String lastName = userDTO.getLastName();
		String username = userDTO.getUsername();
		User user = new User(firstName, lastName, username);
		return user;
	}
	
	public static UserDTO mapEntityToDto(User user) {
		String firstName = user.getFirstName();
		String lastName = user.getLastName();
		String username = user.getUsername();
		UserDTO userDTO = new UserDTO(firstName, lastName, username);
		return userDTO;
	}
}
