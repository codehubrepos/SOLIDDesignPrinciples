package com.solid.allinone;

public class Crow extends Bird implements Flyable, Soundable {

	/**
	 * 
	 * Either implement the eat() method or take the behavior of Bird class
	 * 
	 * */
	public void eat() {
		//TODO - Implement as per need
	}

	@Override
	public void makeSound() {
		System.out.println("Crow makes sound");
	}

	@Override
	public void fly() {
		System.out.println("Crow can fly");
	}

}
