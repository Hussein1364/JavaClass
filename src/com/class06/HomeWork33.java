package com.class06;

import java.util.Scanner;

public class HomeWork33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char grade;
		String evaluation;
		Scanner user=new Scanner(System.in);
		System.out.println("please enter your grade");
		grade=user.next().charAt(0);
		switch (grade) {
		case 'A' :
			evaluation="Excelent";
			break;
		case 'B':
			evaluation="Good";
			break;
		case 'C' :
			evaluation="Average";
			break;
		case 'D' :
			evaluation="Bad";
			break;
			default :
				evaluation="Not Acceptable";
				break;
		}
		System.out.println("if your grade is "+grade+" then your result is "+evaluation+".");
		
		

		
		
	}

}
