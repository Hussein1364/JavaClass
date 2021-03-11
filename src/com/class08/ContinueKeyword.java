package com.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////print number from 1 to 40 exept those are divisible by 4

		for (int i = 1; i <= 40; i++) {

			if (i % 4 == 0) {
				continue;
			}

			System.out.print(i + " ");

		}
	}

}
