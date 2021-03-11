package com.class10;

public class AllElementFromAnArray {

	public static void main(String[] args) {
		// to print all element in an array
		
		int[] number= {10,11,12,14,16,55,33,88,66,99};
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i]+",");
		}
		System.out.println("");
//////////////////////reverse/////////////////////////
		System.out.println("print element reverse");
		
		for(int i=number.length-1; i>=0; i--) {
			System.out.print(number[i]+",");
		}
		
		
		
		
		
	}
	

}
