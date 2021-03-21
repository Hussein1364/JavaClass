package com.class18;

public class Task03 {

	private static String vowelsOnly(String input) {
		
		return input.replaceAll("[^a,e,i,o,u]", "");
		
	}
	public static void main(String [] args) {
		
		System.out.println(vowelsOnly("Hussein"));
		
		
		
	}
	
	
}
