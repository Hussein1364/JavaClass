package com.class15;

public class ReplaceAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var1="Syntax is best2525.batch nine is great.";
		
		System.out.println(var1.replaceAll("[0-9]", ""));
		// since we dont know what exat number is in my string then we say 
		// an general state that all number from 0 t0 9 repkace with ...
		
		String var2="98739985849jgjdvjfSSAAklvjvjf";
		System.out.println(var2.replaceAll("[a-zA-Z]", ""));
		
		
		
		String var3="854838FHJGFF75838847dssugufshkhiu#@$%&*(";
		
		System.out.println(var3.replaceAll("[^a-zA-Z]", ""));
		System.out.println(var3.replaceAll("[^a-zA-Z0-9]", ""));
		
		
	}

}
