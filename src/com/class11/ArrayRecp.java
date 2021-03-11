package com.class11;

import java.util.Scanner;

public class ArrayRecp {

	public static void main(String[] args) {
/*we want to creat an array and ask user to enter data
 * we cant use advanced loop bcz in that case we need all data in advanced
 */
		Scanner user =new Scanner(System.in);
		
		//String element;     no need for this one
		String[] array;
		System.out.println("how many string element would you like to store?");
		
		int size=user.nextInt();
		
		array=new String[size];
	
		for(int i=0; i<size; i++) {
			System.out.println("pleese enter a value");
			array[i]=user.next();

		}
	System.out.println("--------------lets print all data we collect");
		
		for(String str:array) {
			System.out.print(str+" ");
		}
		
		
		
	}

}
