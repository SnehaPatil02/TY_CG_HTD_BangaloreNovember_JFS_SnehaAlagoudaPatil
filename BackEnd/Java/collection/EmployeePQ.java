package com.capgemini.collection.collectioninterface;

import java.util.Objects;

public class EmployeePQ implements Comparable<EmployeePQ> {
int age;
String name;

EmployeePQ(int age,String name ){
	this.age=age;
	this.name=name;
}

@Override
public String toString() {
	return "EmployeePQ [age=" + age + ", name=" + name + "]";
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
	EmployeePQ other = (EmployeePQ) obj;
	return age == other.age && Objects.equals(name, other.name);
}



@Override
public int compareTo(EmployeePQ o) {
	// TODO Auto-generated method stub
	return 0;
}

}
