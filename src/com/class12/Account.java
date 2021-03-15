package com.class12;

public class Account {

	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	public void login() {
		if(userName.equals("yulia") && password.equals("pass123")) {
			System.out.println("welcome to bank of america your balance is: "+balance);
		}
	}
	public void printInfo() {
		if(isLoggedIn) {
			System.out.println("your account number is: "+accountNumber+" your balance is: "+balance);
		}
	}
	
	
	
	
	
}
