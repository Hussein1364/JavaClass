package com.class07;

import java.util.Scanner;

public class WhileLoopReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we need user pay for soda
		//keep asking user to pay you until it enters 3
		//if user gives more >3  ....please give less money
		// if user give less than <3.... please give more money
		//till he pays exact 3 dollar
		// we dont know how many time it would be so we go with while
		Scanner user=new Scanner(System.in);
		int price=3;
		int money;
		System.out.println("please pay for your soda");
		
		do {
			money=user.nextInt();
			if(money>price) {
				System.out.println("please pay less");
			} else if (money<price) {
				System.out.println("please pay more");
			}
			
		}while(money!=price);
		System.out.println("thanks for the payment");
	
		
		
		////////with wile///////
		System.out.println("please pay for your soda!");
		money=user.nextInt();
		while (money!=price) {
			if( money <price) {
				System.out.println("please pay more");
			}else if (money>price) {
				System.out.println("please pay less");
			}
			money=user.nextInt();
		}
		
		System.out.println("thanks for the payment!");
		
	}

}
