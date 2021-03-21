package com.class14;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*Write a program that reads two people's first
names and if they expecting boy or girl? 
Based on the input suggests a name for a baby:
Example Output:
Mom's first name? Mary
Dad's first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY
Example Output:E
Mom's first name? Mary
Dad's first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL*/
		
		String momName, dadName, babyName, gender, boyName, girlName;
		Scanner user=new Scanner(System.in);
		System.out.println("Enter mom's name");
		momName=user.nextLine();
		System.out.println("Enter dad's name");
		dadName=user.nextLine();
		System.out.println("Is baby a girl or a boy?");
		gender=user.nextLine();
		int var=2;
		if(gender.equalsIgnoreCase("boy")) {
			boyName=dadName.substring(0,3)+momName.substring(2);
			System.out.println(boyName.toUpperCase());
			
		}else if(gender.equalsIgnoreCase("girl")) {
			girlName=momName.substring(0, 2)+dadName.substring(3);
		System.out.println(girlName.toUpperCase());
		}
		
		
		
		

		
		
		
		

	}

}
