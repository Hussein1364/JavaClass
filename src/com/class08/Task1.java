package com.class08;

public class Task1 {

	public static void main(String[] args) {
		/// print number from 1--50 but %3
		
		for ( int i=1;  i<=50; i++) {
			
			if (i % 3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}

}
