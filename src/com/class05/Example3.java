package com.class05;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner user=new Scanner(System.in);
		System.out.println("enter amount of your sale");
		double sale=user.nextDouble();
		double comm;
		if(sale<=10) {
			comm=0;
		} else if (sale>10 && sale<=100) {
			comm=sale*0.1;
		}else if (sale>100 && sale<=500) {
			comm=sale*0.1;
		}else if (sale>500 && sale<=1000) {
			comm=sale*0.3;
		
		}
		System.out.println("your daily commission is"+ comm);
		
		
		
		
		
	}

}
