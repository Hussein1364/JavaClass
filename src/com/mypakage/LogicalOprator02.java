package com.mypakage;

import java.util.Scanner;

public class LogicalOprator02 {

	public static void main(String[] args) {


		Scanner user=new Scanner(System.in);
		System.out.println("please enter your hright");
		
		double h=user.nextDouble();
		String definition = null;
		
		if(h>0 && h<60) {
		definition="short";
		}else if (h>=60 && h<=72) {
			definition="medium";
		}else if(h>72){
			definition="tall";
		}else {
			definition="Invalid";		}
	
		System.out.println("the height of the person is "+definition);
	}

}
