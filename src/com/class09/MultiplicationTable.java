package com.class09;

public class MultiplicationTable {

	public static void main(String[] args) {

		/////multiplication table
		
		for (int a=1; a<10; a++) {
			for ( int b=1; b<10; b++) {
			int res=a*b;
				System.out.println(a+ " x "+b+" = "+res);
			}
			System.out.println("******************************");
		}
		
		
		
		
	}

}
