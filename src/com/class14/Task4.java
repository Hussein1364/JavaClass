package com.class14;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {


		/*Create a String and print it in reverse order (Sunday → yadnuS).*/
		int sum=0;
		String var;
		Scanner user=new Scanner(System.in);
		System.out.println("enter any string ");
		var=user.nextLine();
		for(int i=var.length()-1; i>=0; i--) {
		 
			System.out.print(var.charAt(i));
		}
		
		
	}

}
