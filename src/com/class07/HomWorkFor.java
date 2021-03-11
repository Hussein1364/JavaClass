package com.class07;

public class HomWorkFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/////home work
			//calculate sum of odd and even from 1 to 50
			
			int sumEven=0;
			for (int i=0;  i<=50; i+=2) {
				sumEven+=i;
			}
			System.out.println("The sum of even numbers from 1 to 50 is equal with: " +sumEven);
			
			
			System.out.println("*********************");
			
			int sumOdd=0;
			for (int i=1; i<=50; i+=2) {
				sumOdd+=i;
			}
			System.out.println("The sum of odd numbers from 1 to 50 is equal with: " +sumOdd);
			System.out.println("*********************");
			System.out.println("The sum total of numbers from 1 to 50 is equal with: "+(sumEven+sumOdd));
			
	}

}
