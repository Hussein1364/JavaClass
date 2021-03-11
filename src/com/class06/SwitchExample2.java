package com.class06;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner user=new Scanner(System.in);
		String country, food;
		System.out.println("please enter your country");
		country=user.nextLine();
		
		switch (country) {
		
		
		case "usa":
			food="burger";
			break;
		case "afghanistan" :
			food="kabab";
			break;
		case "vietnam":
			food="pho";
			break;
		case "kazakistan":
			food="horse";
			break;
		case "tajikistan":
			food="pov";
			break;
		case "mexico":
			food="taco";
			break;
			default :
				food="unknoen";
			
		
		}
	System.out.println("your favarit food is "+ food);
		
		
		
		
		
		
	}

}
