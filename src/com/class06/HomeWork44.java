
package com.class06;

import java.util.Scanner;

public class HomeWork44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, result;
		char operator = 0;
		Scanner user= new Scanner(System.in);
		System.out.println("enter two number");
		num1=user.nextInt();
		num2=user.nextInt();
		System.out.println("enter an oprator: + or - or * or / .");
		operator=user.next().charAt(operator);
		switch (operator) {
		case '+' :
			result=num1+num2;
			break;
		case '-' :
			result=num1-num2;
			break;
		case '*' :
			result=num1*num2;
			break;
		case '/' :
			result=num1/num2;
			break;
			default :
				result=0;
				break;
		}
		
		System.out.println("the result of "+num1+ operator+ num2+" equals "+result);
		
		
	}

}
