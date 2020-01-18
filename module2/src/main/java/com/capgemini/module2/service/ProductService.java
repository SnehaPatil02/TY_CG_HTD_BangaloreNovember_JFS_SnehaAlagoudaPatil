package com.capgemini.module2.service;

import com.capgemini.module2.dto.ProductBean;

public interface ProductService {
public boolean addProduct(ProductBean product);
	
	public ProductBean getProduct(int id);
}
