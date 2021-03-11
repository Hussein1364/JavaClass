package com.mypakage;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
			//variable day
		//if day is Tuseday or wedensday------->>manual calss
		//if day is monday or friday --------->> no class
		//if day is saturday or sunday -------->> java class
		
		String day;
		Scanner user=new Scanner(System.in);
		System.out.println("what day is today?");
		day=user.next();
		
		if(day.equalsIgnoreCase("Tuseday") || day.equalsIgnoreCase("wedensday")){
			System.out.println("Ihave manual testing class");
		}else if(day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("friday")) {
			System.out.println("I have no class");
		}else if(day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
			System.out.println("I have java class");
		}else if (day.equalsIgnoreCase("thursday")) {
			System.out.println("I have review class");
		}else
			System.out.println(day+" is an invalid input");
		
		
		
		
		
		
	}

}
