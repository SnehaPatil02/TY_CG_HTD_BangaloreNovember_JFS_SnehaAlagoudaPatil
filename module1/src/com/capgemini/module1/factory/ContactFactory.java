package com.capgemini.module1.factory;

import com.capgemini.module1.dao.ContactDAO;
import com.capgemini.module1.dao.ContactDAOImpl;
import com.capgemini.module1.services.ContactServices;
import com.capgemini.module1.services.ContactServicesImpl;

public class ContactFactory {
	private ContactFactory() {
		
	}
	public static ContactDAO instanceOfContactDAOImpl() {
		ContactDAO dao = new ContactDAOImpl();
		return dao;
	}
	
	public static ContactServices instanceOfContactServices() {
		ContactServices services = new ContactServicesImpl();
		return services;
	}
	

}
