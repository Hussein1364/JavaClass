package com.tasks;

public class Yyyyyy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int value = 10, num1 = 0, num2 = 1;
	    System.out.print(?Fibonacci Series of ?+value+? numbers:?);
	    for (int i = 1; i <= value; ++i)
	    {
	      System.out.print(num1+? ?);
	      int sumOfPreviousTwo = num1 + num2;
	      num1 = num2;
	      num2 = sumOfPreviousTwo;
	    }
	}

}
