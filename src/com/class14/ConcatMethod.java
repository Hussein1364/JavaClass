package com.class14;

public class ConcatMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName="Steven";
		String lastName=" Janson";
		System.out.println(firstName+lastName);// used widely in industry
		
		String fullName=firstName+lastName;
		System.out.println(fullName);
		
		fullName=firstName.concat(lastName);// not common... can be used to concat only strings
		System.out.println(fullName);
		
		
		String var1="Hello ";
		int var2= 14;
		System.out.println(var1+var2);
		
		
		
		
		
		
		
	}

}
