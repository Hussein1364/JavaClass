package com.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// creat a program keep asking to aplly for cc
		//as soon as you get yse from user program stops asking
		String answer;
		Scanner user=new Scanner(System.in);
		

		do{
			System.out.println("do yo have a credit card? yes or no ");
			answer= user.nextLine();
			
			
		}while(!answer.equalsIgnoreCase("yes")) {
			System.out.println("do yo have a credit card? yes or no ");
	
		}
	}

}
