package com.class17;

public class CastingStringToStrBuild {

	public static void main(String[] args) {

		//by this method we will convert String type of date to 
		//string Builder to use some of String Builder advantage.
		//for example we can use Reverse method in String type so 
		// we will convert it to string builder to be able use revers
		//method.
		
		String name="Nelson";
		
		StringBuilder sb1=new StringBuilder(name);
		
		sb1.reverse();
		name=sb1.toString();
		System.out.println(name);
	
		
		
		
		
	}

}
