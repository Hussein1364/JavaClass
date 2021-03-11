package com.mypakage;

import java.util.Scanner;

public class NestedIf09 {

	public static void main(String[] args) {


		String credit;
		int balance;
	Scanner user=new Scanner(System.in);
	System.out.println("do you have a credit card?");
	credit=user.nextLine();
	if(credit.equalsIgnoreCase("yes")) {
		System.out.println("what is the balance on your account?");
	balance=user.nextInt();
	if(balance>1000) {
		System.out.println("You need to payoff immediatly");
	}else {
		System.out.println("you can spend more");
	}
	
	}if (credit.equalsIgnoreCase("no")) {
		System.out.println("you can open a credit card here");
	}
		
	}

}
