package com.mypakage;

public class NestedIf05 {

	public static void main(String[] args) {

		
		boolean diploma=false;
		double gpa=2;
		
		if (diploma) {
			System.out.println("congratulation");
			if(gpa>=3.5) {
				System.out.println("you are eligble for scholarship");
				
			}else {
				System.out.println("you should studdy harder");
			}
		}else {
			System.out.println("Join Syntax to get a degree");
		}
			/////////////////**************////////////////////
		
		double rate=2.4;
		double price=300000;
		
			if (rate>4.5) {
				System.out.println("the rate is high and I will not buy the house");
			}else {
				System.out.println("rate is fair and i will buy the house");
				if(price>200000) {
					System.out.println("with this price i might need a loan");
				}else {
					System.out.println("I will purchase in cash$$$$$");
				}
			}
		
	}

}
