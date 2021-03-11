package com.tasks;

public class Task02 {

	public static void main(String[] args) {
		// TODO Create a 2D array or integer type where you will store odd and even
		// numbers in
		// 3 rows and 4 columns.Develop a program which will identify print the even
		// numbers only.

		int[][] numbers = { { 22, 43, 75, 68 }, { 55, 78, 60, 29 }, { 11, 73, 25, 64 } };

		for (int[] row : numbers) {
			
			for (int a : row) {
				
				if (a % 2 == 0) {
					System.out.print(a + "  ");
				}
			}
		}
	}

}
