package com.class05;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner user=new Scanner(System.in);
		System.out.println("enter yor height");
		double h=user.nextDouble();
		
		if (h<60) {
			System.out.println("You are short");
		}else if (h>=60 && h<=72) {
			System.out.println("you are average");
		} else if (h>72) {
			System.out.println("you are tall");
		}else {
			System.out.println("invalid input");
		}
		
		System.out.println("******Exercise 2*******");
		
		System.out.println("enter the day");
		int day=user.nextInt();
				if (day>=1 && day<=5) {
					System.out.println("its weekday");
				}else if (day>=6 && day<=7) {
					System.out.println("its weekend");
				}else {
					System.out.println("invalid day");
				}
		
		
		
		
		
		
		
	}

}
