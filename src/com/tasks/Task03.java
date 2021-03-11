package com.tasks;

public class Task03 {

	public static void main(String[] args) {
		// TODO Create a 2D array or integer type where you will store integer values 
		//in 3 rows and 4 columns. Develop a program which will calculate 
		//the sum of  even and odd numbers for that array.

		int[][] numbers = { { 22, 43, 75, 68 }, { 55, 78, 60, 29 }, { 11, 73, 25, 64 } };

		int sumEven = 0, sumOdd = 0;
		
		for(int[] row:numbers) {
			for(int a:row) {
				if(a%2==0) {
					sumEven+=a;
				}else {
					sumOdd+=a;
				}
			}
		}
		
		System.out.println("sum of the even numbers equals with: "+sumEven);
		System.out.println("sum of the even numbers equals with: "+sumOdd);

	}

}
