package com.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner user=new Scanner(System.in);
		System.out.println("enter your quiz");
		int quiz=user.nextInt();
		System.out.println("enter your midterm");
		int mid=user.nextInt();
		System.out.println("enter your final");
		int fin=user.nextInt();
		double score=(quiz+mid+fin)/3;
	char grade;
		if (score<90) {
			grade='A';
		}else if (score>=70 && score<90) {
		grade='B';	
		} else if (score>=50 && score<70) {
			grade='C';
		} else if (score<50); 
			grade='F';
		
		System.out.println("your score is "+ grade);
		
		
		
		
		
		
	}

}
