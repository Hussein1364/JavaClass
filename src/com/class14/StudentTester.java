package com.class14;

public class StudentTester {

	public static void main(String[] args) {
		
		Student husseinObj=new Student();// creating an objecct.
		husseinObj.name="Hussein";
		husseinObj.age=35;
		husseinObj.StudentId="CS123";
		husseinObj.schoolName="Syntax";
		husseinObj.study();
		husseinObj.payTuition();
		
		
		Student ramObj=new Student();
		ramObj.name="Ram";
		ramObj.age=24;
		ramObj.StudentId="CS456";
		ramObj.schoolName="Syntax";
		ramObj.study();
		ramObj.payTuition();

	}

}
