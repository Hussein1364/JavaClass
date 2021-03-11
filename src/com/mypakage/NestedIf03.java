package com.mypakage;

public class NestedIf03 {

	public static void main(String[] args) {
		// 
		//if its friday-------->>>go to the movie
		//otherwise stay home and study
		//if its fridy and day is 13th then we will watch scary movie
		//if not will watch any movie
		
		boolean isFriday=false;
		int day=16;
		
		if(isFriday) {
						System.out.println("Its movie day");
			
			if(day==13) {
				System.out.println("we will watch scary movie");
			}else {
				System.out.println("we will watch any movie");
			}
			
		}else {
			System.out.println("we will stay home today");
		}
		
		
		
		
	}

}
