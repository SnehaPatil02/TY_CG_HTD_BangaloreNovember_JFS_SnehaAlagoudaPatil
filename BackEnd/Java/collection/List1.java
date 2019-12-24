package com.capgemini.collection.collectioninterface;


import java.util.ArrayList;
import java.util.List;

public class List1 {
public static void main(String[] args) {
	List l1 = new ArrayList();
	
	//methods present in the list interface
	
	l1.add(0,12);
	l1.add(1,13);
	l1.add(2,14);
	l1.add(3,15);
	System.out.println(l1);
	
	l1.remove(2);
	System.out.println(l1);
	System.out.println(l1.indexOf(110));
	l1.add(110);
	System.out.println(l1);
	System.out.println(l1.lastIndexOf(110));
	System.out.println("-------------");
	for(int i=0; i<l1.size(); i++)
	{
		System.out.println(l1.get(i));
	}
	
	List l2=new ArrayList();
	l2.add(45);
	l2.add(55);
	l2.add(54);
	l2.add(57);
	System.out.println(l2);
	
	List l4=new ArrayList();
	l4.add(45);
	l4.add(55);
	l4.add(54);
	l4.add(57);
	System.out.println(l4);
	
	List l5 = new ArrayList();
	l5.add(45);
	l5.add(55);
	l5.add(54);
	
	List l6 = l5.subList(0,2);
	System.out.println(l6);
	
	
	
	
	
}
}
