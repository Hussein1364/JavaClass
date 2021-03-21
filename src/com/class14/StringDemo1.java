package com.class14;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="Hussein";// mostly use this bcz its shorter syntax
		String name0=new String("Hussein");  //Both are the same
		
		// Length method ==> will show us the number of character in a string object
		
		System.out.println(name.length());
		
		// or we can do put that method in a variable
		
		//int len=name.length();
		
		name="    Mr.Heydari";
		int len=name.length();
		System.out.println(len);
		
		
	}

}
