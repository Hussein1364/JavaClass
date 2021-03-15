package com.class12;

public class ObjectsInJava {

	
	 public String model;
	 public int price;
	 public double size;
	 public String make;
	 public String color;
	public static void main(String[] args) {
	
		ObjectsInJava iphone=new ObjectsInJava();
		iphone.model="Iphone 12";
		iphone.price= 999;
		iphone.size=6.4;
		iphone.make="Apple";
		iphone.color="Black";
		
		
		Mobilephone samsungS21 = new Mobilephone();
		samsungS21.model="S21";
		samsungS21.price= 800;
		samsungS21.size=6.8;
		samsungS21.make="Samsung";
		samsungS21.color="Phatom Black";
	
		
	}

}
