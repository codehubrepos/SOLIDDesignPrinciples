package com.solid.ocp;

public class Crow extends Bird {

	@Override
	public void fly() {
		System.out.println("Crow can fly");
	}

	@Override
	public void makeSound() {
		System.out.println("Crow makes sound");
	}

	@Override
	public void dance() {
		try {
			throw new Exception("Crow can't Dance");
		}catch(Exception e) {
			//TODO trace for exception
		}
	}

}
