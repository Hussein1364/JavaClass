package com.class11;

import java.util.Scanner;

public class ArrayFromUser {

	public static void main(String[] args) {
			/*creat an array on double value using scanner
			 * calculate the sumof all stored elements in that array./
			 */
				double[] array;
				int size;
				double sum = 0;
		Scanner user=new Scanner(System.in);
		System.out.println("how many student you have?");	
		size=user.nextInt();
		array=new double[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("please enter the score of student");
			array[i]=user.nextDouble();
			 sum+=array[i];
		}
System.out.println("the sum of "+size+"student avarage is equal with "+sum);

		
		System.out.println("----using enhanced loop to calculate the sum---");
		sum=0;
		for(double num:array) {
			sum+=num;
		}
		System.out.println("the sum of "+size+"student avarage is equal with "+sum);
		
		
	}

}
