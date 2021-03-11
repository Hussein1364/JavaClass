package com.tasks;

public class Task07 {

	public static void main(String[] args) {
		// TODO Write a Java Program to print the first 10 numbers of Fibonacci series


			int n=10;
			int first=0;
			int second=1;
			
			for(int i=0; i<n; i++) {
				if(i==0) {
					System.out.print("0 ");
				}else if(i==1) {
					System.out.print("1 ");
				}else {
					int sum=first+second;
					System.out.print(sum+" ");
					first = second;
					second = sum;
				}
			}
	
	
	
	}
}
