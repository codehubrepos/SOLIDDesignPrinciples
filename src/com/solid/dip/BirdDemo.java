package com.solid.dip;

/**
 * 
 * Dependency Inversion Principle - DIP is being followed here
 * 2 Classes are not dependent on each other, rather they are dependent via an Interface like
 * Eagle and Vulture have high fly behaviour, 
 * Parrot and Piegon have medium fly behaviour,
 * Crow and Chicken have low fly behaviour
 * 
 * 
 * */

public class BirdDemo {

	public static void main(String[] args) {
		
		//Bird b = new Crow();
		//b.fly();
		
		Eagle b1 = new Eagle();
		b1.fly();
		Vulture b2 = new Vulture();
		b2.fly();

		Parrot b3 = new Parrot();
		b3.fly();
		Piegon b4 = new Piegon();
		b4.fly();
		
		Crow b5 = new Crow();
		b5.fly();
		Chicken b6 = new Chicken();
		b6.fly();
	}

}
