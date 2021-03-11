package com.class11;

public class AllvalueIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print all data in 2D array by using Nested loop
		
		String[][] usa= {
		{"Arlington","Oakton","virgina Beach","Fairfax"},
		{"Phily","Strassburg","Pittsburgh"},
		{"Bostob","Quincy","Springfield","Burlington"},
		{"Losangeles","Long Beach","San Fracisco ","santa barbara"},
		{"Miani","orlando","tampa","talahas"},
		};
		System.out.println(usa.length);//5 how many row or array
		System.out.println(usa[0].length);//4 how many element(column) in that specific array or row
		System.out.println(usa[1].length);//3
		
		for(int r=0; r<usa.length; r++) { // iterates over rows
			for(int  c=0; c<usa[r].length; c++) { //iterates over columns
				System.out.print(usa[r][c]);
			}
			System.out.println();
		}
		
		System.out.println("-----using nested for each loop");
		
		for(String[] array:usa) {
			for(String city:array) {
				System.out.print(city+"  ");
			}System.out.println();
		}
		
		
		
		
		
		
		
	}
}
