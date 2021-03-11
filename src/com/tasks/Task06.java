package com.tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// TODO Write a java program to check whether a given number is prime or not?

		Scanner user=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=user.nextInt();
		boolean prime=true;
if(num>1) {
for( int i=2; i<num; i++) {
	if (num%i==0) {
		prime=false;
		break;
	}}
}else {
	prime=false;
}
if(prime) {
System.out.println(num+" is a prime number");
	}else {
		System.out.println(num+" is not prime number");
	}
	}
}
