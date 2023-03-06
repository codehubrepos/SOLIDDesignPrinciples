package com.solid.allinone;

public class Peacock extends Bird implements Danceable, Soundable {

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
		System.out.println("Peacock makes sound");
	}

	@Override
	public void dance() {
		System.out.println("Peacock can dance");
	}

}
