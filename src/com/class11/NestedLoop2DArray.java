package com.class11;

public class NestedLoop2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] numbers= {
				{10,20,30,40,},
				{90,80},
				{1,2,3,4,5,6,7},
		};
		System.out.println(numbers.length);// total number of single array or row
		System.out.println(numbers[1].length);// total element in [1] array
		
		for(int row=0; row<numbers.length; row++) {
			for(int col=0; col<numbers[row].length; col++) {
				System.out.print(numbers[row][col]+"  ");
			}System.out.println();
		}
		
		System.out.println("-----now using enhanced loop");
		
		for(int []  array:numbers) {  //number is actully whole arrays complex 
			for(int a:array) {// array is a single array or a single row
				System.out.println(a+"  ");// a is a singl element
			}/// technically we break down our 2D array in each row
		}
	}

}
