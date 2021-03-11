package com.tasks;

public class FibonacciOtherWay {

	public static void main(String[] args) {
		// TODO fibonacci first 10

		int n=10;
		int a=0;
		int b=1;
		int sum;
		
		for(int i=1; i<=n; i++) {
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
		}
		
		
		
	}

}
