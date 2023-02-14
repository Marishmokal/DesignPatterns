package com.prowings.builder;

public class Student {
String firstName;
String lastName;
int rollNo;
long mobileNo;
int marks;

public Student(StudentBuilder studentBuilder) {
	super();
	this.firstName = studentBuilder.firstName;
	this.lastName = studentBuilder.lastName;
	this.rollNo =studentBuilder. rollNo;
	this.mobileNo =studentBuilder. mobileNo;
	this.marks = studentBuilder.marks;
}

public static class StudentBuilder
{
	String firstName;
	String lastName;
	int rollNo;
	long mobileNo;
	int marks;
	
	public StudentBuilder(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public StudentBuilder roll(int rollNo)
	{
		this.rollNo=rollNo;
		return this;
	}
	public StudentBuilder mobileNo(long mobileNo)
	{
		this.mobileNo=mobileNo;
		return this;
	}
	public StudentBuilder marks(int marks)
	{
		this.marks=marks;
		return this;
	}
	public Student build()
	{
		Student st=new Student(this);
		return st;
	}
}

@Override
public String toString() {
	return "Student [firstName=" + firstName + ", lastName=" + lastName + ", rollNo=" + rollNo + ", mobileNo="
			+ mobileNo + ", marks=" + marks + "]";
}


}
