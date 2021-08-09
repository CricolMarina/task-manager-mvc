package com.stefanini.taskmanager.dto;

public class TaskDTO {
	private String username;
	private String title;
	private String description;
	
	public TaskDTO() {}

	public TaskDTO(String username, String title, String description) {
		super();
		this.username = username;
		this.title = title;
		this.description = description;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "TaskDTO [username=" + username + ", title=" + title + ", description=" + description + "]";
	}
}
