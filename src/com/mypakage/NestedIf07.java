package com.mypakage;

import java.util.Scanner;

public class NestedIf07 {

	public static void main(String[] args) {

		///enter 2 number and then compare them////
		
		int num1;
		int num2;
		Scanner user=new Scanner(System.in);
		System.out.println("please enter first number");
		num1=user.nextInt();
		System.out.println("please enter second number");
		num2=user.nextInt();

		if(num1>num2) {
			System.out.println("first number is larger than seocond number");
			}else if (num2>num1) {
				System.out.println("second number is larger than first number");
		}else {
			System.out.println("both numbers are equal");
		}

		
		
		
		
	}
}
