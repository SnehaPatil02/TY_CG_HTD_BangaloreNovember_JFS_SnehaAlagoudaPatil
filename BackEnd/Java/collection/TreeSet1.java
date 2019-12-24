package com.capgemini.collection.collectioninterface;

import java.util.TreeSet;

public class TreeSet1 {
public static void main(String[] args) {
	TreeSet t1 = new TreeSet();
	t1.add(23);
	t1.add(89);
	t1.add(65);
	t1.add(23);
	
	for(Object o : t1) {
		System.out.println(o);
	}
}
}
