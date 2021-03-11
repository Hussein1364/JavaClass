package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean morning = false;
		boolean classToday = true;
               ////is it mornig?
		if (morning) {
			System.out.println("Let me check if I have a class today? ");
		
		if (classToday) {
			System.out.println("Hello class mate.");
		} else {
			System.out.println("hello family");
		}}
		System.out.println("ned of code");
		////////////////////////////////////////////////

		boolean anyAlargy = true;
		boolean pollen = false;

		if (anyAlargy) {
			System.out.println("lets chek it");
			if (pollen) {
				System.out.println("stay away from trees");
			} else {
				System.out.println(" so you dot have pollen alergy");
			}
		} else {
			System.out.println("good no alergy");
		}

		////////////////////////////////////

		boolean isFriday=false;
		int day = 15;
		if (isFriday) {
			System.out.println("It is movie day!!!");
			if (day==13) {
				System.out.println("we will watch scary movie");
			}else {
				System.out.println("we will watch your movie");
			}
		}
		else {
			System.out.println("we will stay home ");
		}
			}
		}


