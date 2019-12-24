package com.capgemini.collection.collectioninterface;

import java.util.LinkedList;

public class LinkedList4 {
public static void main(String[] args) {
	LinkedList l1 = new LinkedList();
	l1.add(11);
	l1.add(12);
	l1.add(13);
	l1.add(14);
	System.out.println(l1);
	System.out.println("----push----");
	l1.push(15);
	System.out.println(l1);
	System.out.println("------pop--------");
	l1.pop();
	System.out.println(l1);
	System.out.println("-----element-------");
	System.out.println(l1.element());
}
}
