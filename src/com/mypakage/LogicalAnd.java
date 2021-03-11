package com.mypakage;

public class LogicalAnd {

	public static void main(String[] args) {
		// we have to identify if unmber is small,medium,large,extra large
		//if number between 1----10
		//if number between 11----100
		//if number between 101-----1000
		//if number between 1001-----10000
		
		int num=444;
		
		if (num>=1  &&  num<=10) {
			System.out.println(num+" is small");
		}else if (num>10  &&  num<=100) {
			System.out.println(num+ " is medium");
		}else if(num>100  &&  num<=1000) {
			System.out.println(num+" is large");
		}else if (num>1000  &&  num<=10000) {
			System.out.println(num+" is extra large");
		}else {
			System.out.println(num+" is very very large");
		}

	}

}
