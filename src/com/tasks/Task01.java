package com.tasks;

public class Task01 {

	public static void main(String[] args) {
		// TODO Create a 2D array or integer type and store numbers in 3 rows and 3
				// columns.
				// Print the sum of all numbers.

				int[][] numbers = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };
				int sum = 0;

				for (int[] row : numbers) {
					for (int a : row) {
						sum += a;
					}
				}

				System.out.println(sum);
	}

}
