package com.class06;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//store gender using m  or   f
		//based on  gender specify if m---male    f---- famel    
		// otherwise --- not sure
		char gender='G';
		Scanner user = new Scanner(System.in);
		System.out.println("put your gender");
		//gender= user.next();
		String describtion;
		switch (gender) {
		case 'M' :
			describtion="Male";
			break;
		case 'F' :
			describtion="Famel";
			break;
			default:
				describtion="N/A";
		}
		System.out.println(describtion);
		
		
		
		
		
	}

}
