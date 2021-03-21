package com.class18;

public class Task02 {
	public static String reverseString(String input) {
		
		String str1="";
		for(int i=str1.length()-1; i>=0; i--) {
			str1+=str1.charAt(i);
		}
		return str1;
	}

}
 