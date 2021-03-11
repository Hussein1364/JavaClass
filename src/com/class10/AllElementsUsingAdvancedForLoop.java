package com.class10;

public class AllElementsUsingAdvancedForLoop {

	public static void main(String[] args) {


		///*** For each,,,enhanced for loop,,,, advanced for loop***////
		///*** only used with arrays and collections////
		int[] numbers= {10,22,33,44,55};
		for(int num:numbers) {
			System.out.print(num+",");
		}
		//////////////////////////////////
		System.out.println();
		String[] names1= {"Ali","Sam","Hussein","jay","Asel","Diego","Ray","Gulam","Beth","Amber"};
		for(String n:names1) {
			System.out.print(n+"  ");
		}
		System.out.println();

		char[]  grades= {'A','B','C','D','E','F'};
		
		for(char grade:grades) {
			System.out.print(grade+"  ");
		}
		System.out.println();

		
		
		
		
	}

}
