package com.capgemini.collection.collectioninterface;

import java.util.Objects;

public class TSStudent implements Comparable<TSStudent>{
int age;
String name;

TSStudent(int age,String name)
{
	this.age=age;
	this.name=name;
}

@Override
public int compareTo(TSStudent o) {
	if(this.age > o.age) {
	return 1;
}else if(this.age < o.age){
	return -1;
}else{
	return 1;
}
	
}

@Override
public String toString() {
	return "TSStudent [age=" + age + ", name=" + name + "]";
}

@Override
public int hashCode() {
	return Objects.hash(age, name);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	TSStudent other = (TSStudent) obj;
	return age == other.age && Objects.equals(name, other.name);
}

}
