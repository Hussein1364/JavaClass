package com.class07;

public class Forrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		///////////////////////////////
		
		int result=0;
		for (int i=2; i<10; i+=2) {
			result+=i;
			System.out.println(result);
		}
		
		/////home work
		//calculate sum of odd and even from 1 to 50
		
		int sumEven=0;
		for (int i=0;  i<=50; i+=2) {
			sumEven+=i;
		}
		System.out.println(sumEven);
	}

}
