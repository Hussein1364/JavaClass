package com.class05;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner user=new Scanner(System.in);
		System.out.println("enter yor height");
		double h=user.nextDouble();
		String def;
		if (h<60) {
			def="short";
		}else if (h>=60 && h<=72) {
			def="average";
		} else if (h>72) {
			def="tall";
		}else {
			System.out.println("invalid input");
		}
		System.out.println("you are the person who is"+ def);
	}

}
