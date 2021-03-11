package com.class03;

public class Castin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
	double ff=22.66+num;
		System.out.println(ff);
		
		
		
		
	}

}
System.out.println("Enter true if you have CC-----Enter false if you dont");
boolean creditCard=reader.nextBoolean();

int balance=reader.nextInt();

if (creditCard) {
	System.out.println("What is the balance in your account?");
 if (balance>1000) {
	System.out.println("You need to pay off immediatly!");
} else {
	System.out.println("You can spend more!");

}
	
} else {
	System.out.println("We can offer you a Credit Card.");
}

