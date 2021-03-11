package com.class05;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner user= new Scanner(System.in);
		System.out.println("Enter your age");
		int age=user.nextInt();
		
		if(age>=1 && age<3) {
			System.out.println("you are a baby");
		}else if (age>=3 && age<5) {
			System.out.println("you are a bigger baby");
		}else if (age>=5 && age<=12) {
			System.out.println("you are a kid");
		}else if (age>=13 && age<=19) {
			System.out.println("you are a teenager");
		} else if (age>20) {
			System.out.println("you are an adult");

		}
		
		
		
		
		
		
		
		
		
	}

}
