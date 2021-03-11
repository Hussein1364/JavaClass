package com.mypakage;

import java.util.Scanner;

public class LogicalOprator04 {

	public static void main(String[] args) {

		/* we have to calculate commission based on sales
		 * ask user to enter the sale
		 * if sale  10 to 100 ----->> commission 10%
		 * if sale  101 to 500 ----->> commission 20%
		 * if sale 501  to 1000 ------>> commission 30%
		 * if sale more than 1000  ----->> commission 50%
		 *
		 */
		
		Scanner user=new Scanner(System.in);
		double saleAmount, commission = 0;
		System.out.println("how much is your sale?");
		saleAmount=user.nextDouble();
		
		if (saleAmount<10) {
			commission=0;
		}else if (saleAmount>=10 && saleAmount<=100) {
			commission=0.10*saleAmount;
		}else if (saleAmount>=101  && saleAmount<=500) {
			commission=0.20*saleAmount;
		}else if (saleAmount>=501 &&  saleAmount<=1000) {
			commission=0.30*saleAmount;
		}else if(saleAmount>1000) {
			commission=0.50*saleAmount;
		}else {
			System.out.println("invalid input");
		}
		
		System.out.println("today you made $"+commission+" as your sale commission");
		
		
		
	}

}
