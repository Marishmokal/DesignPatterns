package com.prowings.builder;

public class TestStudentBuilder {
public static void main(String[] args) {
	
	Student st=new Student.StudentBuilder("Marish","Mokal").roll(11).mobileNo(8796331).marks(78).build();
	System.out.println(st);
}
}
