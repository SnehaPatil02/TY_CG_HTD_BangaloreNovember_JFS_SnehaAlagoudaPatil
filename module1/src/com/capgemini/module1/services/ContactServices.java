package com.capgemini.module1.services;

import java.util.List;

import com.capgemini.module1.bean.ContactBean;

public interface ContactServices {
	public List<ContactBean> getAllContacts();
	public ContactBean searchContact(String name);
	public boolean editContact(String name,int number);
	public boolean insertContact(ContactBean bean);
	public boolean deleteContact(String name);
}
