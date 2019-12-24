package com.capgemini.collection.collectioninterface;

import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(null);
		System.out.println(l1);
		System.out.println("-------forEach loop---------");
		for(Object i1 : l1) {
			System.out.println(i1);
		}
		System.out.println("-------for loop---------");
		for(int i = 0; i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
	}
}
