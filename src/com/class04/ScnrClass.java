package com.class04;

import java.util.Scanner;

public class ScnrClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader=new Scanner(System.in);
//		System.out.println("enter a text");
//		String name=scan.nextLine();
//		System.out.println(name);
//		
		System.out.println("please enter a number");
		
		int num1=reader.nextInt();
		System.out.println("the first number is "+ num1);
		System.out.println("Enter second number");
		int num2=reader.nextInt();
		System.out.println("the second number is "+num2);
//		double res=num1/num2;
//		System.out.println("the result is "+res);
		if (num1>num2) {
			System.out.println(num1+" is bigger than "+num2);
		} else if (num1<num2) {
			System.out.println(num1+" is smaller than "+num2);
		} else {
			System.out.println("the numbers are qual");
		}
	
		
		
		
		
		
		
	}

}
