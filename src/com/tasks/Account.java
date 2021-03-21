package com.tasks;

import java.util.Scanner;

public class Account {

	
	String userName;
	String password;
	double balance;
	
	void signUp() {
		System.out.println("Welcome to Bank of America.");
		System.out.println("chose your username");
		Scanner user=new Scanner(System.in);
		userName=user.next();
		System.out.println("please chose a password");
		password=user.next();
		System.out.println("How much money you want to deposit?");
		balance=user.nextDouble();
	}
	boolean signIn() {
		System.out.println("please enter your username");
		Scanner user=new Scanner(System.in);
		String enteredUsername=user.next();
		System.out.println("please enter a password");
		String enteredPassword=user.next();
		if(enteredUsername.equals(userName) && enteredPassword.equals(password)) {
			System.out.println("welcome to your account");
			return true;
		}else {
			System.out.println("Either username or password is not correct.");
			return false;
		}

	}
	
	void withDraw(double amountToWithDraw) {
		if(amountToWithDraw>balance) {
			System.out.println("Not enough balance");
		}else {
			balance=balance-amountToWithDraw;
			System.out.println("Transfer succseefull");
		}
	}
	
}
