package com.class09;

public class InnerLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for( int i=5; i<7; i++) {
			System.out.println("Outter Loop");
			for (int j=10; j<=12; j++) {
				System.out.println("Inner Loop");
			}
		}
		
		/// /////print 10 to 99 by nested loop
		
		for (int i=1; i<=9 ; i++ ) {
			
			for ( int j=0; j<=9; j++) {
				System.out.println(i+" "+j);
			}
		}
/////////////////////////car odometer		
		
		
		for (int a=0; a<10;  a++) {
			for (int b=0; b<10; b++) {
				for (int c=0; c<10; c++) {
					for (int d=0; d<10; d++) {
						System.out.println(a+" "+b+" "+c+" "+d);
		}
				}
			}
			
			//////////clock/////
			
			for (int h=0; h<24; h++ ) {
				for( int m=0; m<60; m++) {
					if(h<10 && m<10) {
						System.out.println("0"+h+":0"+m);
					}else if (h<10 && m>=10) {
						System.out.println("0"+h+":"+m);
					}else if (h>=10 && m<10) {
						System.out.println(h+":0"+m);
					}else {
					System.out.println(h+ ":"+m);
				}
			}
			
			
			
			}
		}
		/////////same with nested if
		
		for (int h=0; h<24; h++ ) {
			for( int m=0; m<60; m++) {
				if(h<10) {
					if(m<10) {
						System.out.println("0"+h+":0"+m);

					}else {
						System.out.println("0"+h+":"+m);

					}
				}else {
					if (m<10) {
						System.out.println(h+":0"+m);

					}else {
						System.out.println(h+ ":"+m);

					}
				
			
	
			
}}}}}
