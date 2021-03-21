package com.class17;

public class StringBuilderVSString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String var1="Ali";
		String var2="Hassan";
		String var3="Hussein";
		String var4="Reza";
		
		//String Builder class is faster and wont scan whole memory when wants to create new object.
		// If we already know that lost of our variable contain same value and memory utilization(consumption) os important  then we 
		//should use String class .. it will save a lot of memory but can be slow bcz every time we create a 
		//variable all of the existing string object will be scanned \
		//If speed is important and memory is not and String objects contain different values 
		StringBuilder sb1=new StringBuilder("Ali");
		StringBuilder sb2=new StringBuilder("Hassan");
		StringBuilder sb3=new StringBuilder("Hussein");
		StringBuilder sb4=new StringBuilder("Reza");
		System.out.println(sb1.reverse());
		
		// this method will convert String to StringBilder data type((data casting))
		sb2.reverse();
		var2=sb2.toString();
		
		System.out.println(var2);
		
		
		
		
	}

}
