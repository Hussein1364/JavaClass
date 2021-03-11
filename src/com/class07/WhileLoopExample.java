package com.class07;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {
//////// Capture the 5 different name and say 5 times hell0to those 5 names
		Scanner user=new Scanner(System.in);
		
		int q=5;
		String name;
		while(q>=1 && q<=5) {    ////or q>=1
			System.out.println("please enter your name");
			name=user.nextLine();
			System.out.println("Hello "+name);
			q--;
		}
		


		
}
}