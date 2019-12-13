package com.capgemini.module1.services;

import java.util.List;

import com.capgemini.module1.bean.ContactBean;
import com.capgemini.module1.dao.ContactDAO;
import com.capgemini.module1.factory.ContactFactory;

public class ContactServicesImpl implements ContactServices {
	ContactDAO dao =ContactFactory.instanceOfContactDAOImpl();
	@Override
	public List<ContactBean> getAllContacts() {
	
		return  dao.getAllContacts() ;
	}

	@Override
	public ContactBean searchContact(String name) {
		
		return dao.searchContact(name);
	}

	@Override
	public boolean editContact(String name,int number) {
		
		return dao.editContact(name,number);
	}

	@Override
	public boolean insertContact(ContactBean bean) {
		
		return dao.insertContact(bean);
	}

	@Override
	public boolean deleteContact(String name) {
		
		return dao.deleteContact(name);
	}

	
	
}
