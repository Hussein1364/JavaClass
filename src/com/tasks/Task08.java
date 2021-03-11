package com.tasks;

public class Task08 {
public static void main(String[] args) {
	//Maximum and minimum number in the array?
	
	int[]  numbers= {10,20,30,40,3,50,60,780,70,80,90,100};
	
	int max= numbers[0];
	int min= numbers[0];
	
	for (int i=0; i<numbers.length; i++) {
		if(numbers[i]>max) {
			max=numbers[i];
		}if (numbers[i]<min) {
			min=numbers[i];
		}
	}
	System.out.println("The maximum value in this array is: "+max);
	System.out.println("The minimum value in this array is: "+min);

	
	
	
	
	
	
}
}
