package com.tasks;

import java.util.Scanner;

public class AccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account mandyAccount=new Account();
		mandyAccount.signUp();	
	
	boolean isSuccessful=mandyAccount.signIn();
		if(isSuccessful) {
			System.out.println("enter the amount you want to transfer?");
			Scanner user=new Scanner(System.in);
			mandyAccount.withDraw(user.nextDouble());
		}
		
	}

}
