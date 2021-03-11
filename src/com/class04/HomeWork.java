package com.class04;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		///////////// EXERCISE 1 /////////////////////////
		int loanAmount = 480000;
		if (loanAmount <= 200000) {
			System.out.println("Your loan is approved.");
		} else {
			System.out.println("Your loan is not approved.");
		}
		//////////////   EXERCISE 2     /////////////////////////

		int age=17;
		if (age>=18) {
			System.out.println("Your driver's licens will be issued.");
		} else {
			System.out.println("You need to obtain a learnig permit.");
		}
		////////////   EXERCISE 3     //////////////////////////
		
		Scanner reader = new Scanner(System.in);
		System.out.println("enter your city");
		String city=reader.nextLine();
		System.out.println("put the temperture");
		 double temp=reader.nextDouble();
		 double celsius=(temp-32)/1.8;
		 System.out.println("The temperuture of "+city+" city is "+celsius);

		//////////// EXERCISE 4 ///////////////////////////

		System.out.println("Enter true if you have Credit card-----Enter false if you dont");
		//boolean creditCard=reader.nextBoolean();
		String creditCard=reader.next();
		if (creditCard.equals("yes")) {
			System.out.println("What is the balance in your account?");
			int balance=reader.nextInt();
		 if (balance>1000) {
			
			 System.out.println("You need to pay off immediatly!");
		} else {
			System.out.println("You can spend more!");
		
		}

		} else {
			System.out.println("We can offer you a Credit Card.");
		}
               ////////////EXERCISE 5 ///////////////////////////

		System.out.println("How many years you are working for this company?");
		int year = reader.nextInt();
		

		if (year >= 5) {
			System.out.println("How much is your salary ");
			int salary = reader.nextInt();
			if (salary > 50000) {
				System.out.println("Your bonus will be $5000 ! ");
			} else {
				System.out.println(" Your bonus will be $3000 !");
			}
		} else {
			System.out.println("sorry you are not qualified for a bonus.");
		}

	}

}
