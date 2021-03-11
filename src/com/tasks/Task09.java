package com.tasks;

import java.util.Arrays;

public class Task09 {

	public static void main(String[] args) {
		// TODO Write a java program to find the second largest number in the array?

		int[]  numbers= {10,20,30,666,40,323,50,60,666,70,80,90,100,166,254};
		
		int n=numbers.length;
	Arrays.sort(numbers);	
System.out.println(numbers[n-2]);

/////////////////////////////////////////////
int largest=0;
int secondLargest=0;
for(int i=0; i<numbers.length; i++) {
	if(numbers[i]>largest) {
		secondLargest=largest;
		largest=numbers[i];
	}
}
System.out.println(secondLargest);

	}

}
