package com.class14;

public class Task3 {

	public static void main(String[] args) {

		/*Create a String and if the String is not empty perform the following: 
		if the String has an odd number of characters and has 3 or more characters,
	    print the character in the middle of the String.
	    Create a String and print it in reverse order (Sunday → yadnuS).*/
		
		String var="java with syntaxx";
		if(!var.isEmpty()) {
			if(var.length()%2!=0 && var.length()>=3) {
				int i=(var.length()-1)/2;
				System.out.println(var.charAt(i));
			}
		}
		
		
		
		
		
		
	}

}
