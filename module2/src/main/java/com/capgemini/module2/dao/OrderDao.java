package com.capgemini.module2.dao;

import java.util.List;

import com.capgemini.module2.dto.OrderBean;


public interface OrderDao {
	public boolean addOrder(OrderBean order);
	public List<OrderBean> getAllOrders();
}
