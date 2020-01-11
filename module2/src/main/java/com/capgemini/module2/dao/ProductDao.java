package com.capgemini.module2.dao;

import com.capgemini.module2.dto.ProductBean;

public interface ProductDao {

	public boolean addProduct(ProductBean product);
	
	public ProductBean getProduct(int id);
}
