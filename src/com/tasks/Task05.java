package com.tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		// TODO Write a program to swap 2 numbers without a temporary variable?

		int x=10;
		int y=40;
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swap value of x = "+x);
		System.out.println("after swap value of y = "+y);
		
		
	}

}
