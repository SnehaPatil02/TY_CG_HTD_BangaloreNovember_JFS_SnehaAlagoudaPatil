package com.capgemini.collection.collectioninterface;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
public static void main(String[] args) {
	Collection c1=new ArrayList();
	c1.add(21);
	System.out.println(c1);
	
	c1.remove(21);
	System.out.println(c1);
	
	c1.isEmpty();
	System.out.println(c1);
	
	c1.add(21);
	System.out.println(c1);
	
	System.out.println(c1.contains(21));
	System.out.println(c1.size());
}
}
