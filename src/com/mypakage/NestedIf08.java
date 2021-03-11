package com.mypakage;

import java.util.Scanner;

public class NestedIf08 {

	public static void main(String[] args) {

		int temp;
		String city;
		Scanner user=new Scanner(System.in);
	System.out.println("please enter the city name");
	city=user.next();
	System.out.println("what is temperature in "+city);
	temp=user.nextInt();
	double cels=(temp-32)/1.8;
			System.out.println("temperature in "+city+"is : "+cels);
		
	}

}
