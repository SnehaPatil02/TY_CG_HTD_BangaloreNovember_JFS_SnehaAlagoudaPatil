package com.capgemini.collection.collectioninterface;

import java.util.Objects;

public class Employee {
int empAge;
String empName;

Employee (int empAge,String empName )
{
	this.empAge=empAge;
	this.empName=empName;
	
}

@Override
public String toString() {
	return "Employee [empAge=" + empAge + ", empName=" + empName + "]";
}

@Override
public int hashCode() {
	return Objects.hash(empAge, empName);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return empAge == other.empAge && Objects.equals(empName, other.empName);
}
}
