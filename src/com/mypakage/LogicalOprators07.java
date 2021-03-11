package com.mypakage;

import java.util.Scanner;

public class LogicalOprators07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner user=new Scanner(System.in);
System.out.println("please enter 3 numbers");	
int a,b,c,largest = 0;
a=user.nextInt();
b=user.nextInt();
c=user.nextInt();
if (a>b) {
	if(a>c) {
		largest=a;
	}else {
		largest=c;
	}
}else {
	if(b>c) {
		largest=b;
	}else {
		largest=c;
	}
}

	System.out.println(largest+"is the largest number");	
		
		
		
	}

}
