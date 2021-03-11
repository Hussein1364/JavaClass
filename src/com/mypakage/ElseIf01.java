package com.mypakage;

import java.util.Scanner;

public class ElseIf01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner user=new Scanner(System.in);
		System.out.println("enter a number");
		int day=user.nextInt();
		if(day==1) {
			System.out.println("Monday");
		}else if(day==2) {
			System.out.println("Tuseday");
		}else if(day==3) {
			System.out.println("Wedensday");
		}else if(day==4) {
			System.out.println("Thersday");	
		}else if(day==5) {
			System.out.println("Friday");
		}else if(day==6) {
			System.out.println("Saturday");
		}else if(day==7) {
			System.out.println("Sunday");
		}else {
			System.out.println("Invalid Input");
		}


		
		

	}

}
