package com.capgemini.collection.collectioninterface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet3 {
public static void main(String[] args) {
	LinkedHashSet<Employee> l1= new LinkedHashSet<Employee>();
	l1.add(new Employee(22,"Ramu"));
	l1.add(new Employee(23,"Anu"));
	l1.add(new Employee(22,"Ramu"));
	
	Iterator<Employee> itr = l1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
