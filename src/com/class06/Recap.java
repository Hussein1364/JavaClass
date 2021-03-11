package com.class06;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we need to get the time
		//if time is between 1 to 11 is mornong
		//if time is between 12 to 13 is noon
		// ''	''	'''	'	 14     17 is afternoon
		//					18 to 21    is evening
		//						22 to 24  is night
		
		
		
		Scanner user= new Scanner(System.in);
		int time;
		String timeOfDay = null;
		System.out.println("pleadse enter the time");
		time = user.nextInt();
		
		if(time>=1 && time<=11)
		{timeOfDay="Morning";}
		if (time>=12 && time<=13)
		{timeOfDay="Noon";}
		if (time>=14 && time<=17)
		{timeOfDay="afternoon";}
		if(time>=18 && time<=21)
		{timeOfDay="Evening";}
		if(time>=22 && time<=24)
		{timeOfDay="Night";}
		
		
		System.out.println("based on the time you entered time of day is "+ timeOfDay);
		
		// default value of int    0
		// default value of double 0.0
		// default value of boolean   true
		//default of string and all nonprimitive is  null
		
		
		
		
		
		
		
		
	}

}
