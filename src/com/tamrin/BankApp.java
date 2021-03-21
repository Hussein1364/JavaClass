package com.tamrin;

public class BankApp {

	public static void main(String[] args) {

		
		AccountBank husseinAcc=new AccountBank();
		husseinAcc.accountNumber="655676";
		husseinAcc.userName="hussein1364";
		husseinAcc.password="1234567";
		husseinAcc.balance=1000;
		husseinAcc.login("hussein1364", "1234567");
		husseinAcc.isLoggedIn=true;
		husseinAcc.printInfo();
		
		
	}

}
  