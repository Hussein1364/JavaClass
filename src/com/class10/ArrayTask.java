package com.class10;

public class ArrayTask {

	public static void main(String[] args) {

		///Create an array of names and store all names of your group. Then print your name from that array.
		//(use 2 different ways of creating an array).
		String[] names=new String[10];
		names[0]="Ali";
		names[1]="Sam";
		names[2]="Hussein";
		names[3]="jay";
		names[4]="Asel";
		names[5]="Diego";
		names[6]="Ray";
		names[7]="Gulam";
		names[8]="Beth";
		names[9]="Amber";
		System.out.println(names[2]);
		

		String[] names1= {"Ali","Sam","Hussein","jay","Asel","Diego","Ray","Gulam","Beth","Amber"};
		System.out.println(names1[2]);
		
		
	}

}
