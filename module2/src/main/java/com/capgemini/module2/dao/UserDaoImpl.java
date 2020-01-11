package com.capgemini.module2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.module2.dto.UserBean;
import com.capgemini.module2.exception.UserException;
@Repository
public class UserDaoImpl implements UserDao{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean insertUser(UserBean user) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public UserBean login(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from userinfo where email=:email ";
		TypedQuery<UserBean> query = manager.createQuery(jpql, UserBean.class);
		query.setParameter("email", email);
		//query.setParameter("password", password);
		try {
			UserBean bean = query.getSingleResult();
		//BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if(bean.getPassword().equals( bean.getPassword())) {
			return bean;	
		}else {
			throw new UserException("Password Invalid");
		}
		
		}catch(Exception e) {
		throw new UserException("email invalid");
		}
	}
	

	@Override
	public boolean updatePassword(int userId, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		UserBean bean =manager.find(UserBean.class, userId);
		bean.setPassword(password);
		transaction.commit();
		return true;
		
	}

}
