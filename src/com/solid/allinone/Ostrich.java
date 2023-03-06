package com.solid.allinone;

public class Ostrich extends Bird implements Soundable {

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
		System.out.println("Ostrich makes sound");
	}

}
