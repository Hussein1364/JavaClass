package com.class14;

public class CharAtMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Hussein";
		System.out.println(name.charAt(3));
		int sum=0;
		for (int i=0; i<name.length(); i++) {
			
			if(name.charAt(i)=='e') {
				System.out.println("e found");
				sum++;
			}
				
		}
		
		System.out.println(sum+" es found");
		
		
		
	}

}
