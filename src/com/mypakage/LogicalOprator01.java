package com.mypakage;

import java.util.Scanner;

public class LogicalOprator01 {

	public static void main(String[] args) {

		/*ask user to enter the age
		 * if age is from 1 to 3---------->> you are a baby
		 * if age is from 3  to 5 -------->> you are a bigger baby
		 * if age is from 5 to 12 ------>> you are a kid
		 * if age is from 13 -19 ------->> you are teenager
		 * if age above 20 -------->>> you are an adult
		 */
				Scanner user = new Scanner(System.in);
				System.out.println("what is your name");
				String name=user.next();
				System.out.println("please enter your age");
				int age=user.nextInt();
				
				if (age>=1  &&  age<3) {
					System.out.println(name+" is a baby");
				}else if (age>=3  &&  age<5) {
					System.out.println(name+" is a bigger baby");
				}else if (age>=5  &&  age<=12) {
					System.out.println(name+" is a kid");
				}else if (age>=13  &&  age<=19) {
					System.out.println(name+ " is a teenager");
				}else if (age>=20){
					System.out.println(name+" is an adult");
				}else {
					System.out.println("you never born");
				}
	
	
	
	
	
	
	
	}

}
