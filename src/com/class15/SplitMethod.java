package com.class15;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String var1="Today is Wednesday";
		System.out.println(var1.length());;
		String[] strArr=var1.split(" ");
		for(String word:strArr) {
			System.out.println(word);
		}
		
		String var2="Syntax is best. Batc 9 is great.";
		
		String[] var2Arr=var2.split("[.]");
		
		for(int i=0; i<var2Arr.length; i++) {
			System.out.println(var2Arr[i]);
		
		}
		
	//using 2 method together // combining them
		
		String var3="    Syntax    ";
		System.out.println(var3.trim().toUpperCase());
		
		////////////////////////////////////////
		
		String var4="hi what are you doin";
		System.out.println(convert(var4));
		
		
		
		
	}

	private static char[] convert(String var4) {
		// TODO Auto-generated method stub
		return null;
	}

}
