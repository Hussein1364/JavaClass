package com.class05;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user=new Scanner(System.in);
		String season=null;
		String month;
		System.out.println("Enter the month of your birth");
		 month=user.nextLine();
		
		if(month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("March")) {
			season="Winter";
		} else if (month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May") || month.equalsIgnoreCase("June")) {
			season="Spring";
		} else if (month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") || month.equalsIgnoreCase("September")) {
			season="Summer";
		} else if (month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November") || month.equalsIgnoreCase("December")) {
			season="Fall";
		} else {
			season="Not valid";
		}
		
		System.out.println("Your birth season is "+ season+".");
		

		
	}

}
