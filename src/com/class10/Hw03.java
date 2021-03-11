package com.class10;

public class Hw03 {

	public static void main(String[] args) {

		/*
		 * Create an array on integers and calculate
		 *  the sum of all elements in an array.
		 * 
		 */

		int[] num = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100 };
		
		int sum = 0;
		
			for (int x = 0; x < num.length; x++) {
				sum += num[x];
		}
			
		System.out.println("Total of all elements equals with : "+sum);
	}

}
