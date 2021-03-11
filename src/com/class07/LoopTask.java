package com.class07;

public class LoopTask {

	public static void main(String[] args) {

		int num1=1;
		while (num1<=100) {
			System.out.print(num1+ " ");
			num1++;
		}
		System.out.println("***************************************************");

		int num2=100;
		while (num2>=1) {
			System.out.print(num2+" ");
			num2--;
		}
		System.out.println("***************************************************");
		
		int num3=20;
		while(num3<=100) {
			System.out.print(num3+" ");
			num3+=2;
		}
		System.out.println("***************************************************");
		
		int c=20;
		while (c<=100) {
			if(c % 2==0) {
				System.out.print(c+" ");
			}
			c++;
		}
	}

}
