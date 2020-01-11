package com.capgemini.module2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;


import org.springframework.stereotype.Repository;

import com.capgemini.module2.dto.ProductBean;
@Repository
public class ProductDaoImpl implements ProductDao{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addProduct(ProductBean product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public ProductBean getProduct(int id) {
	
		EntityManager manager = factory.createEntityManager();
		ProductBean product = manager.find(ProductBean.class, id);
		return product;
	}

}
