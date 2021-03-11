package com.mypakage;

public class NestedIf {

	public static void main(String[] args) {

		boolean morning=false;
		boolean classToday=true;
		
		
		
		if(morning) {
			System.out.println("Im going to work");
			
		}else {
			System.out.println("let me check if i have class today!");
			
			if(classToday) {
				System.out.println("I will attend in my class");
			}else {
				System.out.println("I will just relax");
			}
		}
		
		
		
		
		
		
	}

}
