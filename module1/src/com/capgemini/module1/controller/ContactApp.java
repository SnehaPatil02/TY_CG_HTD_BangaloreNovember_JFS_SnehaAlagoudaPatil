package com.capgemini.module1.controller;


import java.util.List;
import java.util.Scanner;

import com.capgemini.module1.bean.ContactBean;
import com.capgemini.module1.dao.ContactDAO;
import com.capgemini.module1.factory.ContactFactory;
import com.capgemini.module1.services.ContactServices;

public class ContactApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		ContactServices services =ContactFactory.instanceOfContactServices();
		ContactBean bean = new ContactBean();


		ContactDAO dao = ContactFactory.instanceOfContactDAOImpl();
		while(true) {

			System.out.println("Enter your choice");
			System.out.println(" 1: List all contacts ");
			System.out.println(" 2: search contact");
			System.out.println(" 3: Operations");


			int choice = sc.nextInt();
			switch(choice) {
			case 1: List<ContactBean> list =dao.getAllContacts();
			{ 
				System.out.println(list);
			}
			case 2:System.out.println("Enter the name");
			String name=sc.next();
			ContactBean bean1= new ContactBean();
			bean.setName(name);
			ContactBean bean2 = dao.searchContact(name);
			if(bean2 != null) {
				System.out.println(bean.getName());
				System.out.println(bean.getNumber());
				System.out.println(bean.getGroup());
			}else {
				System.out.println("such name is not found");
			}
			break;
			case 3: System.out.println("operations");
			MainClass.main();



			}
		}
	}
}
