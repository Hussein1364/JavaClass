package com.tamrin;

import java.util.Scanner;

public class MyLoopTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner user=new Scanner(System.in);
		System.out.println("enter an number");
		int n=user.nextInt();
		
//		
//		int[][] number=new int[5][5];
//		for(int i=0; i<number.length; i++){
//			for(int j=0; j<number[i].length; j++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
//		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//		
//		
//		for (int i=0; i<=n; i++) {
//			for (int j=0; j<=n; j++) {
//				System.out.print(" * ");
//				
//			}System.out.println("");
//		}
//		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		for(int i=1; i<=n; i++) {
			if (i==1||i==n) {
				for(int j=1; j<=n; j++) { 
					System.out.print(" * ");
				}}
			else    {
				for(int j=1; j<=n; j++) { 
				if(j==1||j==n) { 
					System.out.print("  ");
				}else 
					System.out.println(" * ");
			
		
				}}}System.out.println();
		
	}

}
