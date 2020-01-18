package com.capgemini.module2.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.module2.dto.OrderResponse;
import com.capgemini.module2.dto.ProductResponse;
import com.capgemini.module2.dto.UserResponse;
import com.capgemini.module2.exception.OrderException;
import com.capgemini.module2.exception.ProductException;
import com.capgemini.module2.exception.UserException;

@RestController
public class MainControllerAdvice {
	@ExceptionHandler(UserException.class)
	public UserResponse userException(UserException e) {
		UserResponse response = new UserResponse();
		response.setStatusCode(501);
		response.setDescription("Exception");
		response.setMessage(e.getMessage());
		return response;
	}
	
	@ExceptionHandler(ProductException.class)
	public ProductResponse productException(ProductResponse e) {
		ProductResponse response = new ProductResponse();
		response.setStatusCode(501);
		response.setDescription("Exception");
		response.setMessage(e.getMessage());
		return response;
	}
	
	@ExceptionHandler(OrderException.class)
	public OrderResponse orderException(OrderException e) {
		OrderResponse response = new OrderResponse();
		response.setStatusCode(501);
		response.setDescription("Exception");
		response.setMessage(e.getMessage());
		return response;
	}
}
