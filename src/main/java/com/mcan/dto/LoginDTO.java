package com.mcan.dto;

/**
 * The DTO class for the Login DTO.
 * 
 */
public class LoginDTO {
	
	private int age;

	private String password;

	private String role;

	private String username;

	public LoginDTO() {
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}