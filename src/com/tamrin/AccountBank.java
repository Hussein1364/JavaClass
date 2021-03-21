package com.tamrin;

public class AccountBank {
	
	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	
	public void login(String enteredUserName,String enteredPassword) {
		if(userName.equals(enteredUserName)&&password.equals(enteredPassword)) {
			System.out.println("welcom to bank of america your balance is "+balance);
		}else {
			System.out.println("Username or password is not correct.");
		}
	}
	
	public void printInfo() {
		if(isLoggedIn) {
			System.out.println("your account number is: "+accountNumber+"your balancce is: "+balance);
		}
	}

}
