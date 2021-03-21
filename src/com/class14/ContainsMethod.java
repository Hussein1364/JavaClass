package com.class14;

public class ContainsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// used to say the user that there is some invalid type of character. like $ @#* in user name
		
		String var=" this is a demo of contain $&%#";
		
				System.out.println(var.contains("#"));
		
		if(var.contains("$") || var.contains("#")) {
			System.out.println("# is not allowed");
		}
		
		System.out.println(var.contains("demo"));// you can put any character or word
		
		
		
		System.out.println(var.startsWith("contain"));
		System.out.println(var.endsWith("#"));
		
		
		
	}

}
