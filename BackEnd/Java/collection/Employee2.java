package com.capgemini.collection.collectioninterface;

import java.util.Comparator;
import java.util.Objects;

public class Employee2 implements Comparator<Employee2> {
int age;
String name;
int sal;

Employee2(int age,String name,int sal){
	this.age=age;
	this.name=name;
	this.sal=sal;
}

@Override
public int compare(Employee2 o1, Employee2 o2) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public String toString() {
	return "Employee2 [age=" + age + ", name=" + name + ", sal=" + sal + "]";
}

@Override
public int hashCode() {
	return Objects.hash(age, name, sal);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee2 other = (Employee2) obj;
	return age == other.age && Objects.equals(name, other.name) && sal == other.sal;
}


}
