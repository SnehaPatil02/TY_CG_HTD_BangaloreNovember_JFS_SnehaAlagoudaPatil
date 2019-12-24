package com.capgemini.collection.collectioninterface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2  {
public static void main(String[] args) {
TreeSet<TSStudent> t1=new TreeSet<TSStudent>();
t1.add(new TSStudent(22,"Ramu"));
t1.add(new TSStudent(23,"Somu"));
t1.add(new TSStudent(22,"Ramu"));

for(TSStudent ts : t1) {
	System.out.println(ts);
	
	
}
}
}
