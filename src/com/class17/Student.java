package com.class17;

public class Student {
 
	static String studetName;
	static String studentID;
	static int numberOfStudent;
	
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std1=new Student();
		std1.studetName="Hussein";
		std1.studentID="Hus123";
		
		Student std2=new Student();
		std2.studetName="Hassan";
		std2.studentID="Has123";
		
		Student std3=new Student();
		std3.studetName="Majeed";
		std3.studentID="Maj123";
		
		Student[] students=new Student[3];
//		students[0]=stu1;
//		students[1]=stu2;
//		students[2]=stu3;
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].studetName+" is our student with ID: "+students[i].studentID);
			
		}
		System.out.println("there is "+students.length+" in our class");
	}

}
