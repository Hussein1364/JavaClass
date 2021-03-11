package com.class06;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner user=new Scanner(System.in);
//		System.out.println("Please enter 3 distinct numbers");
//		int a, b, c;
//		a=user.nextInt();
//		b=user.nextInt();
//		c=user.nextInt();
//
//			if (a>b && a>c) {
//				System.out.println(a+ " is the greatest number");
//			} else if(b>c) {
//					System.out.println(b+ " is the greatest number");
//
//				
//			} else {
//				System.out.println(c+ " is the greatest number");
//
//			}
//
//		   }
//
//	}
/////////////////////////////////////////////////

//		int x, y, z;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the first number:");
//        x = s.nextInt();
//        System.out.print("Enter the second number:");
//        y = s.nextInt();
//        System.out.print("Enter the third number:");
//        z = s.nextInt();
//        if(x > y && x > z)
//        {
//            System.out.println("Largest number is:"+x);
//        }
//        else if(y > z)
//        {
//            System.out.println("Largest number is:"+y);
//        }
//        else
//        {
//            System.out.println("Largest number is:"+z);
//        }
// 
//    }
//}

		boolean loan = true;
		int score = 0;
		String elg = null;
		Scanner user = new Scanner(System.in);
		System.out.println("do you need a loan?");
		loan = user.nextBoolean();
		if (loan) {
			System.out.println("what is your credit score?");
			score = user.nextInt();
			if (score < 600) {
				elg = "Not eligible";
			} else if (score >= 600 && score <= 700) {
				elg = "Maybe eligible";
			} else if (score >= 701 && score <= 800) {
				elg = "Eligible";
			} else if (score > 800) {
				elg = "Definitely eligible";
			}
			System.out.println("The eligibility is " + elg);
		} else {
			System.out.println("Unknown");
		}

	}
}

