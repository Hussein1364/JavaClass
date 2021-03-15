package com.class12;

public class DogClassExample {
	
	
	public void bark() {
		System.out.println("Hup Hup");
	}
	
	
	
	
	public static void main(String[] args) {
	
		DogClass bulldog=new DogClass();
		
		bulldog.breed= "Bulldog";
		bulldog.size= "Large";
		bulldog.colour="Light Gray";
		bulldog.age=5;
		bulldog.bark();
		bulldog.eat();
		bulldog.sleep();
		bulldog.look();
		
		
		
		DogClass beagle=new DogClass();
		beagle.breed="Beagle";
		beagle.size="Large";
		beagle.colour="Orange";
		beagle.age=6;
		
		DogClass german=new DogClass();
		german.breed="German Shepherd";
		german.size="Large";
		german.colour="White & Orange";
		german.age=6;
		
		
		DogClass husky=new DogClass();
		husky.age=8;
		husky.breed="Husky";
		husky.size="Large";
		husky.colour="Deep Black";
		husky.look();
		
		
		
		
		

	}

}
