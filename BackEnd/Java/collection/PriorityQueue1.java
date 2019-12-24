package com.capgemini.collection.collectioninterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
public static void main(String[] args) {
	Queue p1 = new PriorityQueue();
	p1.offer(43);
	p1.offer(34);
	p1.offer(87);
	p1.offer(78);
	p1.offer(87);
	System.out.println(p1);
	p1.poll();
	p1.poll();
	System.out.println(p1);
	p1.remove();
	System.out.println(p1);
	
	System.out.println(p1.element());
	
	for(Object o1 : p1) {
		System.out.println(o1);
	}
}
}
