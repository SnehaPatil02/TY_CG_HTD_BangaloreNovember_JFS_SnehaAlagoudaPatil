package com.capgemini.collection.collectioninterface;

import java.util.LinkedList;

public class LinkedList3 {
public static void main(String[] args) {
	LinkedList l1 = new LinkedList();
	l1.add(12);
	l1.add(13);
	l1.add(14);
	l1.add(15);
	l1.add(16);
	System.out.println(l1);
	System.out.println("-----peek and peekFirst and peekLast-------");
	System.out.println(l1.peek());
	System.out.println(l1.peekFirst());
	System.out.println(l1.peekLast());
	System.out.println(l1);
	
	System.out.println("-------poll and pollFirst and pollLast------");
	System.out.println(l1.poll());
	System.out.println(l1.pollFirst());
	System.out.println(l1.pollLast());
	System.out.println(l1);
	
	LinkedList l2 = new LinkedList();
	System.out.println("---------offer and offerFirst and offerLast------");
	System.out.println(l2.offer(12));
	System.out.println(l2.offerFirst(13));
	System.out.println(l2.offerLast(14));
	System.out.println(l2);
}
}
