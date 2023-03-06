package com.solid.lsp;


/**
 * 
 * Liskov's Substitution Principle - LSP is not being followed here
 * The Child class Object can not be directly substituted with a reference of Parent class type for invocation of all methods.
 * In order to call some treatment needs to be given, loke exception handling in below example
 * 
 * This implementation needs refinement, since it voilates LSP i.e. Liskov's Substitution Principle
 * 
 * */

public class BirdDemo {

	public static void main(String[] args) throws Exception {
		
		Bird b1 = new Crow();
		b1.fly();
		
		// Child class object(Penguin) can not be directly substituted with a Parent(Bird) type 
		// Penguin is not truly a Bird which can fly
		Bird b2 = new Penguin();
		try {
			b2.fly();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Child class object(Peacock) can not be directly substituted with a Parent(Bird) type 
		// Peacock is not truly a Bird which can fly
		Bird b3 = new Peacock();
		try {
			b3.fly();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
