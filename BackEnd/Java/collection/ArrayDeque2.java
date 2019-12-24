package com.capgemini.collection.collectioninterface;

import java.util.ArrayDeque;

public class ArrayDeque2 {
public static void main(String[] args) {
	ArrayDeque a1 = new ArrayDeque();
	
	a1.add("Shree");
	a1.add("ramu");
	a1.add("gouri");
	a1.add("sneha");
	a1.add("deepa");
	a1.addFirst("vinni");
	a1.addLast("patil");
	System.out.println(a1);
	
	a1.remove();
	System.out.println(a1);
	
	a1.removeFirst();
	System.out.println(a1);
	
	a1.removeLast();
	System.out.println(a1);
	
	a1.removeFirstOccurrence(a1);
	System.out.println(a1);
	
	a1.removeLastOccurrence(a1);
	System.out.println(a1);
	
	a1.getFirst();
	System.out.println(a1);
	
	a1.getLast();
	System.out.println(a1);
	
	a1.peek();
	System.out.println(a1);
	
	a1.peekFirst();
	System.out.println(a1);
	
	a1.peekLast();
	System.out.println(a1);
	
	a1.poll();
	System.out.println(a1);
	
	a1.pollFirst();
	System.out.println(a1);
	
	a1.pollLast();
	System.out.println(a1);
	
	
	System.out.println(a1.offer(a1));
	
	
	System.out.println(a1.offerFirst(a1));
	
	
	System.out.println(a1.offerLast(a1));
}
}
