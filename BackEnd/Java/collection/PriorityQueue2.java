package com.capgemini.collection.collectioninterface;

import java.util.PriorityQueue;

public class PriorityQueue2 {
public static void main(String[] args) {
	PriorityQueue<EmployeePQ> e1=new PriorityQueue<EmployeePQ>();
	
	e1.offer(new EmployeePQ(23,"divya"));
	e1.offer(new EmployeePQ(22,"Shree"));
	e1.offer(new EmployeePQ(22,"Shree"));
	
	for(Object o : e1) {
		System.out.println(o);
	}
}
}
