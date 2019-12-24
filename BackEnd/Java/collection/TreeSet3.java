package com.capgemini.collection.collectioninterface;

import java.util.TreeSet;

public class TreeSet3 {
public static void main(String[] args) {
	TreeSet<Employee1> t1 = new TreeSet<Employee1>();
	t1.add(new Employee1(22,387,"ramu"));
	t1.add(new Employee1(23,365,"somu"));
	t1.add(new Employee1(21,396,"anu"));
	
	for(Employee1 e1 : t1) {
		System.out.println(e1);
	}
}
}
