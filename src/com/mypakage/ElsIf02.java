package com.mypakage;

import java.util.Scanner;

public class ElsIf02 {

	public static void main(String[] args) {
		
		Scanner user=new Scanner(System.in);
		System.out.println("Please enter a number");
		int month=user.nextInt();
		
		if(month==1) {
			System.out.println("January");
		}else if(month==2) {
			System.out.println("Frbruary");
		}else if(month==3) {
			System.out.println("March");
		}else if(month==4) {
			System.out.println("April");
		}else if(month==5) {
			System.out.println("May");
		}else if(month==6) {
			System.out.println("June");
		}else if(month==7) {
			System.out.println("July");
		}else if(month==8) {
			System.out.println("August");
		}else if(month==9) {
			System.out.println("September");
		}else if(month==10) {
			System.out.println("October");
		}else if(month==11) {
			System.out.println("November");
		}else if(month==12) {
			System.out.println("December");
		}else {
			System.out.println("Invalid Input");
		}
		
		switch (month) {
		
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
			
			default:
			System.out.println("Invalid Input!!");
		}
		
	int a=0;
	if(a%2==0) {
		System.out.println("the number is even");
	}else if (a%2 !=0) {
		System.out.println("the number is odd");
	}else {
		System.out.println("the number is equal to 0");
	}
	
	
	
	}
}
