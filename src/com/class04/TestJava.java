package com.class04;

import java.util.Scanner;

public class TestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Pick a season");
		String season=scan.nextLine();
		
		switch (season) {
		case "Spring":
			System.out.println("1-2-3");
			break;
		case "Summer":
			System.out.println("4-5-6");
			break;
		case "Fall":
			System.out.println("7-8-9");
			break;
		case "Winter":
			System.out.println("10-11-12");
			break;
			default :
				System.out.println("Eror");
		}
		
		System.out.println("Enter a number");
		int num=scan.nextInt();
		switch (num) {
		case 1:
			System.out.println("Ali");
			break;
		case 2:
			System.out.println("Hassan");
			break;
		case 3:
			System.out.println("Hussein");
			break;
		case 4:
			System.out.println("gulu");
			break;
			default :
				System.out.println("Not Available");
		}
		
		
		
		
	}

}
