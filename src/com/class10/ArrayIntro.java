package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] array = new int[5];
		array[0]=10;
		array[1]=12;
		array[2]=15;
		array[3]=9;
		array[4]=13;
		
		System.out.println(array[2]);
		
		double[] number = new double[2];
		number[0]=10.99;
		number[1]=19.01;
		
		System.out.println(number[0]);
		
		String[] name=new String[4];
		name[0]="jahsnzeeb";
		name[1]="Ozoda";
		name[2]="Allen";
		System.out.println(name[2]);
		
		boolean[] b=new boolean[4];
		b[0]=true;
		b[1]=true;
		b[2]=false;
		b[3]=false;
		System.out.println(b[2]);
		
		///////to figure out how many element we have in array
		
		int size=b.length;
		System.out.println("the length or size of my array is; "+size);
	
	char[]  grade=new char[6];
	grade[0]='A';
    grade[1]='B';
	grade[2]='C';			
	grade[3]='D';
	grade[4]='E';
	grade[5]='F';	
	
	System.out.println(grade[1]);
	
	
	}

}
