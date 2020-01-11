package com.capgemini.module2.dao;

import com.capgemini.module2.dto.UserBean;

public interface UserDao {
	public boolean insertUser(UserBean user);
	public UserBean login(String email, String password);
	public boolean updatePassword(int userId, String password);
}
