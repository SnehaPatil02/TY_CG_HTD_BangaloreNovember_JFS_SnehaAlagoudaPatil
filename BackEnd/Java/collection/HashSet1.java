package com.capgemini.collection.collectioninterface;

import java.util.HashSet;

public class HashSet1 {
public static void main(String[] args) {
	HashSet hs = new HashSet();
	hs.add(null);
	hs.add(23);
	hs.add(45);
	hs.add(56);
	hs.add(23);
	for (Object o : hs) {
		System.out.println(o);
	}
	
	HashSet<String> hs1 = new HashSet<String>();
	hs1.add("Sneha");
	hs1.add("Swapna");
	hs1.add("Pooja");
	hs1.add(null);
	for (String s1 : hs1) {
		System.out.println(s1);
	}
}
}
