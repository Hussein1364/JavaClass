package com.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calculate the final price after discount
		// we check if ther is any sale
		//if not im nit going for shopping
		// if yes we will ask item///  then ask for price
		
		//if price is less than 10 --- apply 5% discount
		//if price is between 10 to 100 --- apply 10% discount
		// between 100 to 500-------- 20%
		// more than 500 -----mapply 30%
		
		
		double price=0, discount=0;
		boolean sale;
		String item = null;
		Scanner user= new Scanner(System.in);
		
		System.out.println("are you runing a sale?");
		sale=user.nextBoolean();
		
		if (!sale) {
			System.out.println("Im not going for shopping");
					}else {
					System.out.println("what you want to buy?");
					item=user.next();
					System.out.println("what is the price for ");
					price=user.nextInt();
					
							if (price<10) { 
								discount= price*0.05;
							} if (price>10 && price<100) {
								discount= price*0.1;
							} if (price>100 && price <500) {
								discount= price*0.2;
							} if (price>500) {
								discount= price*0.3;
					}
		double finalPrice=price-discount;
		System.out.println("the final price for "+item+ " is "+ finalPrice);
	}
	}
}
