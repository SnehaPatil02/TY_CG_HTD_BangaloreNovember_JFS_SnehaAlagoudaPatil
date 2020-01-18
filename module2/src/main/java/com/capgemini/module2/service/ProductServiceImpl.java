package com.capgemini.module2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.module2.dao.ProductDao;
import com.capgemini.module2.dto.ProductBean;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao dao;

	@Override
	public boolean addProduct(ProductBean product) {
		return dao.addProduct(product);
	}

	@Override
	public ProductBean getProduct(int id) {
		return dao.getProduct(id);
	}

}
