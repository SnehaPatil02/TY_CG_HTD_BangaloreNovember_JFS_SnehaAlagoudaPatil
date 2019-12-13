package com.capgemini.module1.controller;

import java.util.Scanner;

import com.capgemini.module1.bean.ContactBean;
import com.capgemini.module1.dao.ContactDAO;
import com.capgemini.module1.dao.ContactDAOImpl;

public class MainClass {
	
	static void main() {
		ContactDAO dao = new ContactDAOImpl();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your choice for operation");
		System.out.println(" 1: insert");
		System.out.println(" 2: delete");
		System.out.println(" 3: edit");

		int choice = sc.nextInt();
		switch(choice) {
		case 1:System.out.println("enter the name");
		String name = sc.next();
		System.out.println("enter number");
		int number = sc.nextInt();
		System.out.println("enter group");
		String group = sc.next();

		ContactBean bean1 = new ContactBean();
		bean1.setName(name);
		bean1.setNumber(number);
		bean1.setGroup(group);


		boolean check1 = dao.insertContact(bean1);
		if(check1) {
			System.out.println("Contact is inserted successfully");

		}else {
			System.out.println("Contact number is already exist");
		}

		break;
		case 2:System.out.println("enter name");
		String name1=sc.next();

		ContactBean bean2 = new ContactBean();
		bean2.setName(name1);

		boolean check2 = dao.deleteContact(name1);
		if(check2) {
			System.out.println("Contact is deleted");
		}else {
			System.out.println("Could not delete");
		}
		break;
			
		case 3: System.out.println("enter name");
		String name2=sc.next();
		System.out.println("enter number");
		int number1=sc.nextInt();
		ContactBean bean3 = new ContactBean();
		bean3.setName(name2);
		bean3.setNumber(number1);
		boolean check3 = dao.editContact(name2, number1);
		if(check3) {
			System.out.println("Contact is edited");
		}else {
			System.out.println("Could not edit");
		}

		break;
	

	}
	}
}
