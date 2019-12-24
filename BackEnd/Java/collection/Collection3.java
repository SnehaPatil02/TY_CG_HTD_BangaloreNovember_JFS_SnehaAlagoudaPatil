package com.capgemini.collection.collectioninterface;

import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {
public static void main(String[] args) {
	Collection c1 = new ArrayList();

	c1.add(11);
	c1.add(12);
	c1.add(13);
	c1.add(14);
	System.out.println(c1);
	
	Collection c2 = new ArrayList();
	c2.add(11);
	c2.add(12);
	c2.add(15);
	c2.add(16);
	System.out.println(c2);
	System.out.println("-----------addAll---------");
	c1.addAll(c2);
	System.out.println(c1);
	System.out.println("-----------retainsAll---------");
	c1.retainAll(c2);
	System.out.println(c1);
	c1.removeAll(c2);
	System.out.println("-----------removeAll---------");
	System.out.println(c1);
	System.out.println("---------contaisAll------------");
	
	System.out.println(c1.containsAll(c2));
	
	System.out.println(c1);
	c1.clear();
	
	System.out.println(c1);
	c1.add(c2);
	System.out.println(c1);
	Object a[] = c2.toArray();
	
	for(int i=0; i<a.length; i++) {
		System.out.println(a[i]);
	}
	
}
}
