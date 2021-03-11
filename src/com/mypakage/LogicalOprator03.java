package com.mypakage;

import java.util.Scanner;

public class LogicalOprator03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner user=new Scanner(System.in);
		System.out.println("enter the number of day from 1 to 7");
		int day=user.nextInt();
		if(day>=1  &&  day<=5) {
			System.out.println("its a weekday");
		}else if (day==6  ||  day==7) {
			System.out.println("this is weekend");
		}else {
			System.out.println("wring input!! try again");
		}
		
		
		
	}

}
