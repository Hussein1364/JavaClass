package com.mypakage;

import java.util.Scanner;

public class LogicalOprator06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner user=new Scanner(System.in);
System.out.println("enter your birth month");
	String month= user.next();
	String season = null;
	if(month.equalsIgnoreCase("january") ||month.equalsIgnoreCase("february") ||month.equalsIgnoreCase("march") ) {
		season="Winter";
	}else if(month.equalsIgnoreCase("april") || month.equalsIgnoreCase("may")||month.equalsIgnoreCase("june")) {
		season="Spring";
	}else if(month.equalsIgnoreCase("july")||month.equalsIgnoreCase("august")||month.equalsIgnoreCase("september")) {
		season="Summer";
	}else if (month.equalsIgnoreCase("october")||month.equalsIgnoreCase("november")||month.equalsIgnoreCase("december")) {
		season="Fall";
	}else {
		System.out.println("input is invalid");
	}
		
System.out.println("You were born in "+season);
		
		
		
		
	}

}
