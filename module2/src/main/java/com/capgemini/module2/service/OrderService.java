package com.capgemini.module2.service;

import java.util.List;

import com.capgemini.module2.dto.OrderBean;

public interface OrderService {
	public boolean addOrder(OrderBean order);
	public List<OrderBean> getAllOrders();
}
