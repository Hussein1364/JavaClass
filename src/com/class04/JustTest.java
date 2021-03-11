package com.class04;

import java.util.Scanner;

public class JustTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		Scanner user=new Scanner(System.in);
		System.out.println("Please enter the length");
		int len=user.nextInt();
		System.out.println("Please enter the width");
		int wid=user.nextInt();
		if (len!=wid){
		  System.out.println("The shape of your object is rectangle");
		} else {
		  System.out.println("The shape of your object is square");
		}
			     
        
	}
}