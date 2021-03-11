package com.class05;

public class LogicalOprator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=100000;
		if (num>=1 && num<=10) {
		System.out.println("my number is small");
		} else if (num>=11 && num<=100) {
			System.out.println("meduem");
		}else if (num>=101 && num<=1000) {
			System.out.println("large");
		}else if (num>=1001 && num<=10000) {
			System.out.println("elarge");
		} else {
			System.out.println("its huge");
		}
		
		
		
		
	
	}
}
