package com.class08;

import java.util.Scanner;

public class Dffff {

		public static void main(String[] args)  {
			   
			Scanner user=new Scanner(System.in);
			double x, y, res = 0;
			char opr;
			System.out.println("please enter 2 number");
			x= user.nextDouble();
			y= user.nextDouble();
			System.out.println("please enter an oprator");
			opr=user.next().charAt(0);
			
			switch(opr) {
			case '+' :
				res=x+y;
				break;
			case '-' :
				res=x-y;
				break;
			case '/' :
				res=x/y;
				break;
			case '*' :
				res=x*y;
				break;
				default:
					System.out.println("enter valid input");
					break;
			}
			System.out.println("the result of your opration is "+ res);
			
			
			
			
			
		}}