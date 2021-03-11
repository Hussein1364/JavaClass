package com.mypakage;

public class NestedIf06 {

	public static void main(String[] args) {

		int age = 13;
		int weight = 666;

		if (age >= 18) {
			if (weight > 110) {
				System.out.println("you have all condition and you can donate");
			} else {
				System.out.println("sorry your weight is too low you cannt donate");
			}

		} else {
			System.out.println("sorry you cannt donate.");
		}

	}

}
