package com.solid.ocp;

public class Peacock extends Bird {

	@Override
	public void fly() {
		try {
			throw new Exception("Peacock can't fly");
		}catch(Exception e) {
			//TODO trace for exception
		}
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
