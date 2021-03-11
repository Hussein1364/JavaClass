package com.class06;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user=new Scanner(System.in);
		String weekday;
		int day=user.nextInt();
		switch(day) {
		case 1:
			weekday="monday";
			break;
		case 2:
			weekday="tuseday";
			break;
		case 3:
			weekday="wedensday";
			break;
		case 4 :
			weekday="thursday";
			break;
		case 5:
			weekday="friday";
			break;
		case 6 :
			weekday="saturday";
			break;
		case 7:
			weekday="sunday";
			break;
		default:
			weekday="Invalid";
			break;
		}
		if(!weekday.equals("Invalid")) {
		System.out.println(weekday);}
	}

}
