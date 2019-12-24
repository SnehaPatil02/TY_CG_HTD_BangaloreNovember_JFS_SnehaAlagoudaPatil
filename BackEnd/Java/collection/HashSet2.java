package com.capgemini.collection.collectioninterface;

import java.util.HashSet;

public class HashSet2 {
public static void main(String[] args) {
	HashSet<Student> h1 = new HashSet<Student>();
	h1.add(new Student(22,"Divya"));
	h1.add(new Student(22,"Divya"));
	h1.add(new Student(23,"Ramesh"));
	h1.add(new Student(24,"Anu"));
	h1.add(new Student(21,"Shree"));
	
	System.out.println();
	
	for (Student s1 : h1) {
		System.out.println(s1.studName +" and Age is "+s1.studAge);
	}
}
}

