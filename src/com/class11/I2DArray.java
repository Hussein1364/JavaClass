package com.class11;

public class I2DArray {

	public static void main(String[] args) {
			
		///its  a commbination off row and coulumn
		int [][] num=new int [3][4];
		
		// 1 array or the first row
		
		num[0][0]=1;
		num[0][1]=2;
		num[0][2]=3;
		num[0][3]=4;
		//// 2 array or second row
		num[1][0]=10;
		num[1][1]=20;
		num[1][2]=30;
		num[1][3]=40;
		///3 array or third row
		num[2][0]=100;
		num[2][1]=200;
		num[2][2]=300;
		num[2][3]=400;
		
		System.out.println(num[1][3]);
		
		System.out.println("Another way to creat a 2D array");
		
		int[][] numbers= {
				{1,2,3,4,},
				{10,20,30,40},
				{100,200,300,400}
		
		};
		
		System.out.println(numbers[1][1]);//to print 20
		System.out.println(numbers[0][2]);// to print 3
		int sum=numbers[1][2]+numbers[0][3];
	
		System.out.println(sum);
		
		
		numbers[2][2]=500;//   how to reassign
		
		
		
		
		
		
		
		
	}

}
