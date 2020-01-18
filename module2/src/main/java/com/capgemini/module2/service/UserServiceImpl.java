package com.capgemini.module2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.module2.dao.UserDao;
import com.capgemini.module2.dto.UserBean;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;

	@Override
	public boolean insertUser(UserBean user) {
		return dao.insertUser(user);
	}

	@Override
	public UserBean login(String email, String password) {
		return dao.login(email, password);
	}

	@Override
	public boolean updatePassword(int userId, String password) {
		return dao.updatePassword(userId, password);
	}

}
