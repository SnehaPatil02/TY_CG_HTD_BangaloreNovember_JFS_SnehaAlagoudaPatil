package com.capgemini.collection.collectioninterface;

import java.util.LinkedList;

public class LinkedList2 {
public static void main(String[] args) {
	LinkedList l1 =  new LinkedList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	l1.add(50);
	System.out.println(l1);
	System.out.println("------addFirst------");
	l1.addFirst(15);
	System.out.println(l1);
	System.out.println("------addLast-----");
	l1.addLast(55);
	System.out.println(l1);
	System.out.println("------remove()-----");
	l1.remove();
	System.out.println(l1);
	System.out.println("------removeFirst and removeLast------");
	l1.removeFirst();
	System.out.println(l1);
	l1.removeLast();
	System.out.println(l1);
	
	LinkedList l2 = new LinkedList();
	l2.add(21);
	l2.add(22);
	l2.add(23);
	l2.add(24);
	l2.add(22);
	
	System.out.println(l2);
	System.out.println("------removeFirstOccurance--------");
	System.out.println(l2);
	System.out.println("------removeFirstOccurance--------");
	System.out.println(l2);
	System.out.println("-----get first----------");
	
	System.out.println(l2.getFirst());
	System.out.println("-----get last----------");
	System.out.println(l2.getLast());
	
	}
}
