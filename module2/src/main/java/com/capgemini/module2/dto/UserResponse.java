package com.capgemini.module2.dto;

import java.util.List;

public class UserResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<UserBean> user;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<UserBean> getUser() {
		return user;
	}
	public void setUser(List<UserBean> user) {
		this.user = user;
	}
	
	
}
