package com.stefanini.taskmanager.dto;

public class UserDTO {
	private String firstName;
	private String lastName;
	private String username;
	
	public UserDTO() {}

	public UserDTO(String firstName, String lastName, String username) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User {" + 
				"username = ' " + username + '\'' +
				",firstName = " + firstName + 
				",lastName=' " + lastName+ '\'' +
				'}';
	}
}
