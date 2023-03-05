package com.solid.srp;

public class BirdDemo {

	public static void main(String[] args) {
		
		Bird b1 = new Bird();
		b1.setName("Kauwa");
		b1.setColor("Black");
		b1.setType("Crow");
		b1.setNoOfWings(2);
		b1.setWeight(150);
		
		b1.makeSound();
		
		Bird b2 = new Bird();
		b2.setName("Koyal");
		b2.setColor("Black");
		b2.setType("Kuckoo");
		b2.setNoOfWings(2);
		b2.setWeight(100);
		
		b2.makeSound();
		
		Bird b3 = new Bird();
		b3.setName("Chdiya");
		b3.setColor("Brown");
		b3.setType("Sparrow");
		b3.setNoOfWings(2);
		b3.setWeight(50);
		
		b3.makeSound();
		
		Bird b4 = new Bird();
		b4.setName("Mor");
		b4.setColor("Colorfull");
		b4.setType("Peacock");
		b4.setNoOfWings(10);
		b4.setWeight(200);
		
		b4.dance();

	}

}
