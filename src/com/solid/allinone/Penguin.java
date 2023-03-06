package com.solid.allinone;

public class Penguin extends Bird implements Soundable {

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
		System.out.println("Penguin makes sound");
	}

}
