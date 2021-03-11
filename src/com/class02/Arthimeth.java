package com.class02;

public class Arthimeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1=15.88;
		double num2=50.55;
		 
		double sumOfDecimal=num1+num2;
		double subOfDecimal=num1-num2;
		double devOfDecimal=num1/num2;
		double mulOfDecimal=num1*num2;
		System.out.println("the addition of "+num1+" and "+num2+" is :"+sumOfDecimal);
		
		System.out.println("the subtraction of "+num1+" and "+num2+" is :"+subOfDecimal);
		
		System.out.println("the Multiple of "+ num1+" and "+num2+ " is :" +mulOfDecimal);
		
		System.out.println("the devision of "+num1+" and "+num2+ " is :"+devOfDecimal);
		int m=8;
		int w=5;
		int h=10;
		int per=w*h;
		int era= w+h;
		System.out.println("the perimeter of a rectangle with width of "+w+" and hight of "+h+" is equal with "+per+" and area is equal with "+era);
		String str="hi";
		String str2="hello";
		System.out.println(str+str2+(m+w+h));
	}

}
