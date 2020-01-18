package com.capgemini.module2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.module2.dto.UserBean;
import com.capgemini.module2.dto.UserResponse;
import com.capgemini.module2.service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class UserController {
	
	@Autowired
	UserService service;

	@PostMapping(path = "/insert-user", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse insertUser(@RequestBody UserBean user) {
		UserResponse response = new UserResponse();
		if (service.insertUser(user)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User with same name already exists");
		}
		return response;
	}
	
	@PostMapping(path= "/login" , produces = MediaType.APPLICATION_JSON_VALUE,consumes =  MediaType.APPLICATION_JSON_VALUE)
	public  UserResponse login(@RequestBody UserBean bean ) {
		UserBean userBean = service.login(bean.getEmail(), bean.getPassword());
		
		UserResponse response = new UserResponse();
		if(userBean!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User found for the credentials");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Credentials Invalid");
		}
		return response;
	}
	
	
	
	
	@PutMapping(path="/update-password" ,produces =  MediaType.APPLICATION_JSON_VALUE,consumes =  MediaType.APPLICATION_JSON_VALUE)
	public UserResponse updatePassword(@RequestBody UserBean bean) {
		
		UserResponse response = new UserResponse();
		if(service.updatePassword(bean.getUserId(), bean.getPassword())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Password changed");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Password not changed");
		}
		return response;
		
		}
	
}
