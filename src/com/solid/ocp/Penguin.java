package com.solid.ocp;

public class Penguin extends Bird {

	@Override
	public void fly() {
		try {
			throw new Exception("Penguin can't fly");
		}catch(Exception e) {
			//TODO trace for exception
		}
	}

	@Override
	public void makeSound() {
		System.out.println("Penguin makes sound");
	}

	@Override
	public void dance(){
		try {
			throw new Exception("Penguin can't dance");
		}catch(Exception e) {
			//TODO trace for exception
		}
	}

}
