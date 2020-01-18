package com.capgemini.module2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.module2.dao.OrderDao;
import com.capgemini.module2.dto.OrderBean;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao dao;

	@Override
	public boolean addOrder(OrderBean order) {
		return dao.addOrder(order);
	}

	@Override
	public List<OrderBean> getAllOrders() {
		// TODO Auto-generated method stub
		return dao.getAllOrders();
	}

}
