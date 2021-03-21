package com.class14;

public class Student {
	String name;
	int age;
	String StudentId;
	String schoolName;
	
	
	void study() {
		System.out.println(name+" studies in "+schoolName);
	}
	void payTuition() {
		System.out.println(name+"pays the tuition");
	}
	
	int getStudentAge() {
		return age;
		
	}
	
	
}
