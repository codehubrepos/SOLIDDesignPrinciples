package com.solid.ocp;

public class Ostrich extends Bird {

	@Override
	public void fly() {
		try {
			throw new Exception("Ostrich can't fly");
		}catch(Exception e) {
			//TODO trace for exception
		}
	}

	@Override
	public void makeSound() {
		System.out.println("Ostrich makes sound");

	}

	@Override
	public void dance() {
		try {
			throw new Exception("Ostrich can't dance");
		}catch(Exception e) {
			//TODO trace for exception
		}
	}

}
