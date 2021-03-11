package com.mypakage;

public class NestedIf04 {

	public static void main(String[] args) {

		//first check assignment and based on the score we display
		//a message
		
		boolean completed=true;
		int score=80;
		
		
		
		if(completed) {
			if(score>90) {
				System.out.println("great job");
			} if(score>80){
				System.out.println("good job");
			} if(score>70) {
				System.out.println("could be better");
			}if(score<=70) {
				System.out.println("try more");
			}
			
		}else
			System.out.println("please make sure you complete your assignment");
		
		
		
		
	}

}
