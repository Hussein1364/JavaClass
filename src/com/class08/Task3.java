package com.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start, end, sumeven = 0, sumeodd = 0;
		Scanner user=new Scanner(System.in);
		System.out.println("Enter the first number");
		start=user.nextInt();
		
		System.out.println("Enter the second number");
		end=user.nextInt();
		
		
		
		
		
		
		if(start<end) {
		
		
		for(int i=start; i<=end; i++) {
			if(i%2==0) {
				 sumeven+=i;
				
			}else if(i%2!=0) {
				 sumeodd+=i;
				 
		}
		
		}
		 System.out.println("total of even"+ sumeven);
		 System.out.println("total of even"+ sumeodd);
		
		
	
		}else {
			System.out.println("put valid numbers");
		}
		}}
