package com.class06;

import java.util.Scanner;

public class HomeWork22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String country, language;
		Scanner user=new Scanner(System.in);
		System.out.println("please enter your country");
		country=user.nextLine();
		switch (country) {
		case "united state" :
			language="english";
			break;
		case "mexico" :
			language= "spanish";
			break;
		case "italy" :
			language= "italian";
			break;
		case "lebanon" :
			language= "arabic";
			break;
		case "turkish" :
			language="turki";
			break;
		case "germani" :
			language= "german";
			break;
		case "india" :
			language="hindi";
			default :
				language="unknown";
		} if (!language.equals("unknown")) {
		System.out.println("people in "+country+" speak in "+language+".");
		}
		
		
	}

}
