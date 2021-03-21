package com.class15;

public class Tassk01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create a String that will hold a sentence. Write a program to get a new 
		//String without any spaces.
		String var="Its rainy today.";
		System.out.println(var.replace(" ", ""));
		
		/////////////////////////////////////
	//Create a String that should be combination of letters,
		//numbers and special characters. Find out how many alpha characters 
		//are there in the String.
		String var1="kdjvjfij  xjj99  585949()*^$@!$&_+";
		var1=var1.replaceAll("[^a-zA-Z]", "").replaceAll(" ", "");
		int sum=var1.length();
		System.out.println(sum);
		
		////////////////////////////
	//You have a String a="Is it saturday? Is it raining? Do we have a Java Class today?" How would you find out how many sentences are in that String?
		String a="Is it saturday?Is it raining?Do we have a java class today?";
		String[] a1=a.split("[?]");
		System.out.println(a1.length);
	}

}
