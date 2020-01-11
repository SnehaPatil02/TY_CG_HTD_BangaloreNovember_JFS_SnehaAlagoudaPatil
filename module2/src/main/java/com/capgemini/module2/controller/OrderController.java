package com.capgemini.module2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.module2.dto.OrderBean;
import com.capgemini.module2.dto.OrderResponse;
import com.capgemini.module2.dto.ProductBean;
import com.capgemini.module2.dto.ProductResponse;
import com.capgemini.module2.service.OrderService;



@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class OrderController {
	@Autowired
	OrderService service;

	@PostMapping(path = "/add-order", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse addProduct(@RequestBody OrderBean order) {
		OrderResponse response = new OrderResponse();
		if (service.addOrder(order)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product with same name already exists");
		}
		return response;
	}
	@GetMapping(path = "/view-allorders", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse viewAllOrders() {
		OrderResponse response = new OrderResponse();
		List<OrderBean> list = service.getAllOrders();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Products found");
			response.setOrder(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;

	}
}
