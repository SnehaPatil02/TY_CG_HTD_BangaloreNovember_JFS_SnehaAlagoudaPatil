package com.capgemini.collection.collectioninterface;

import java.util.TreeSet;

public class TreeSet4 {
public static void main(String[] args) {
	EmployeeAge e1 = new EmployeeAge();
	TreeSet<Employee2> t2=new TreeSet<Employee2>(e1);
	t2.add(new Employee2(22,"ramu",543));
	t2.add(new Employee2(32,"somu",976));
	
	for(Employee2 e2 : t2) {
		System.out.println(e2);
	}
}
}
