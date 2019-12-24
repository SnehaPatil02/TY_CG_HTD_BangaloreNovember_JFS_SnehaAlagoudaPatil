package com.capgemini.collection.collectioninterface;

import java.util.Objects;

public class Employee1 implements Comparable <Employee1> {
int age;
int sal;
String name;

Employee1(int age,int sal,String name){
	this.age=age;
	this.sal=sal;
	this.name=name;
	
}

//@Override
//public int compareTo(Employee1 o) {
//	if(this.sal > o.sal) {
//	return 1;
//}
//	else if(this.sal < o.sal) {
//		return -1;
//	}else {
//		return 0;
//	}
//}

//@Override
//public int compareTo(Employee1 o) {
//	if(this.age > o.age) {
//	return 1;
//}
//	else if(this.age < o.age) {
//		return -1;
//	}else {
//		return 0;
//	}
//}

//@Override
//public int compareTo(Employee1 o) {
//	return this.name.compareTo(o.name);
//}

@Override
public int compareTo(Employee1 o) {
	return o.name.compareTo(this.name);//sorting in descending order
}


@Override
public String toString() {
	return "Employee1 [age=" + age + ", sal=" + sal + ", name=" + name + "]";
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
	Employee1 other = (Employee1) obj;
	return age == other.age && Objects.equals(name, other.name) && sal == other.sal;
}

}
