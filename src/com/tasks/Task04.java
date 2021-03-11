package com.tasks;

public class Task04 {

	public static void main(String[] args) {
		// TODO Create 2D array of countries: north america countries,
		//south america countries, europe countries, asian countries, 
		//african countries. Then print all values from that array using 2 
		//different loops and calculate how many total countries have been stored.

		String [][] country= {{"California","Texas","Michigan","Virginia","Washington"},
							 {"Havana","Sao Paulo","Buenos Airos","Mexico City","Bogota"},
							 {"Warsaw","London","Berlin","Valencia","Paris"},
							 {"New Delhi","Jakarta","Tehran","Shanghai","Istanbul"},
							 {"Cairo","Pretoria","Durban","Harare","Rabat"}};
		int count;
		for(String[] row:country) {
			for(String a:row) {
				System.out.print(a+" * ");
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("-----printing all value second way----");
		System.out.println();

		for(int r=0; r<country.length; r++) {
			for(int  c=0; c<country[r].length; c++) {
				System.out.print(country[r][c]+" * ");
			}
			System.out.println();
		}
	
				
		
		
		
		
		
	}

}
