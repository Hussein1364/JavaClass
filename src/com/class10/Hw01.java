package com.class10;

public class Hw01 {

	public static void main(String[] args) {

		String[]  car=new String[6];
		car[0]="Mazda";
		car[1]="Nissan";
		car[2]="Toyota";
		car[3]="Honda";
		car[4]="Ford";
		car[5]="Tesla";
		
		for(String x:car) {
			System.out.print(x+"  ");
		}
		System.out.println();
	System.out.println("-------the second way------" );
	
	for(int i=0; i<car.length; i++) {
		System.out.print(car[i]+"  ");
	}
	
	
	}

}
