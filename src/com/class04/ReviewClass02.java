package com.class04;

import java.util.Scanner;

public class ReviewClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("enter username");
		String name = scan.nextLine();
		System.out.println("enter pass");
		String pass = scan.nextLine();

		if (name.equals("salma")) {

			if (pass.equals("salma123")) {
				System.out.println("welcome to syntax bank");
				System.out.println("enter your balance");
				double accBalance = scan.nextInt();
				System.out.println("enter smount you want to transfer");
				double transfer = scan.nextInt();

				if (accBalance > transfer) {
					System.out.println("you are able to tansfer selected amount");

				} else {
					System.out.println("not suficient balance");
				}
			} else {
				System.out.println("not valid username or password");
			}
		} else {
			System.out.println("not valid username or password");
		}

	}

}
