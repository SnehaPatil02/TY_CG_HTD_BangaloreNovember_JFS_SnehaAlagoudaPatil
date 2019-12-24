package com.capgemini.collection.collectioninterface;

import java.util.ArrayList;

public class ArrayList2 {
public static void main(String[] args) {
	ArrayList<String> a1 = new ArrayList();
	a1.add("john");
	a1.add("anu");
	a1.add("robert");
	a1.add("manu");
	System.out.println(a1);
	System.out.println(a1.size());
	
	ArrayList a2 = new ArrayList();
	a2.add("ramu");
	a2.add("tom");
	a2.add("manu");
	a2.add("jerry");
	
	a1.addAll(a2);
	System.out.println(a1);
	
	a1.remove(1);
	System.out.println(a1);
	
	a1.contains(a2);
	System.out.println(a1);
	
	a1.removeAll(a2);
	System.out.println(a1);
	
	a1.containsAll(a2);
	System.out.println(a1);
	
	a1.retainAll(a2);
	System.out.println(a1);
	
	a1.isEmpty();
	System.out.println(a1);
	
	a1.clear();
	System.out.println(a1);
	
	
	
}
}
