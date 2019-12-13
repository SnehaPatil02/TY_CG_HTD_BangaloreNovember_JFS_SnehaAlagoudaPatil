package com.capgemini.module1.dao;

import java.util.List;

import com.capgemini.module1.bean.ContactBean;

public interface ContactDAO {
	public List<ContactBean> getAllContacts();
	public ContactBean searchContact(String name);
	public boolean editContact(String name,int number);
	public boolean insertContact(ContactBean bean);
	public boolean deleteContact(String name);
}
