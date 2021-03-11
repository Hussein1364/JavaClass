package com.mypakage;

public class NestedIf02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean anyAllergy=false;
		boolean pollenAllergy=false;
		
		if (anyAllergy) {
			System.out.println("lets check what kind of allergy you have?");
			
			if(pollenAllergy) {
				System.out.println("do not get close to trees!!");
			}else {
				System.out.println("dont worry about trees!!");
			}
			
		}else {
			System.out.println("you are lucky");
		}
		
		
		
		
		
		
	}

}
