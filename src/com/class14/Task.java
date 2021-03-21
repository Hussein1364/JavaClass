package com.class14;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner user=new Scanner(System.in);
		String userName, password, confirmation;
		System.out.println("please enter the user name");
		userName= user.nextLine();
		System.out.println("please enter the password");
		password= user.nextLine();
		System.out.println("please enter the password again");
		confirmation= user.nextLine();
		
		if(userName.isEmpty()||password.isEmpty()) {
			System.out.println("!!User name or password can not be empty!!");
		}else if(password.length()<8) {
			System.out.println("the password is too short");
		}else if(password.contains(userName)) {
			System.out.println("password can not contain the username");
		}else if (!password.equals(confirmation)) {
			System.out.println("password is not match");
		}else {
			System.out.println("username and password are created");
		}
		
		
		
	}

}
