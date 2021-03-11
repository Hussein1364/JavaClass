package com.class08;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner user=new Scanner(System.in);
		int price=10;
		int money, ret, left , sum = 0;
		System.out.println("please pay for your soda");
		
		do {
			money=user.nextInt();
			sum+=money;
			
			if(sum>price) {
				ret=sum-price;
				System.out.println("here is "+ret+" dollar your changes");
			} else if (sum<price) {
				
				left=price-sum;
				System.out.println("you need to pay"+left+" dollar more");
				
			}else {
				System.out.println("you paid exact amount");
			}
			
		}while(sum!=price);
		System.out.println("thanks for your shopping");
	
		
		
	}

}
