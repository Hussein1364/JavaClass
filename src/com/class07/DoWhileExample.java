package com.class07;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//play lottety and win number id 17
		//keep asking to enter number
		//until corrnect number is entered
		
		Scanner user = new Scanner(System.in);
		int num;
		int winNumber=17;
		
//		do {
//		System.out.println("please enter a number from 1 to 100");
//		num=user.nextInt();
//		}while (num!=winNumber);
//		
//		System.out.println("you are the winner");
//		
		////////////////////////////////////////////
		
		System.out.println("*******with while******");
		
		
		int num1;
		int winNumber1=18;
		System.out.println("please enter a number from 1 to 100?");
		num1=user.nextInt();
	
		while (num1!=winNumber1) {
			System.out.println("please enter a number from 1 to 100?");
			num1=user.nextInt();
		}
		System.out.println("you are the winner");
	}

}
