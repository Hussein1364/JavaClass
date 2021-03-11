package com.mypakage;

import java.util.Scanner;

public class LogicalOprator05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner user=new Scanner(System.in);
		double quiz, midterm, finalScore, average;
		char grade ;
		System.out.println("pleese enter the score of your quiz and midterm and final score");
		quiz=user.nextDouble();
		midterm=user.nextDouble();
		finalScore=user.nextDouble();
		average= (quiz+midterm+finalScore)/3;
		
		if ( average>=90) {
			grade='A';
		}else if (average>=70  &&  average<90) {
			grade='B';
		}else if (average>=50  &&  average<70) {
			grade='C';
		}else {
			grade='F';
		}
		System.out.println("the grade of your educational achivement is: "+grade);

		
		
		
		
	}

}
