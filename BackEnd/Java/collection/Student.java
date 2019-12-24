package com.capgemini.collection.collectioninterface;

import java.util.Objects;

public class Student {
int studAge;
String studName;
Student (int studAge,String studName)
{
	this.studAge=studAge;
	this.studName=studName;
}
@Override
public int hashCode() {
	return Objects.hash(studAge, studName);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return studAge == other.studAge && Objects.equals(studName, other.studName);
}


}
