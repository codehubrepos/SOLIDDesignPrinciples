package com.solid.lsp;

public class Crow extends Bird {

	@Override
	public void fly() {
		System.out.println("Crow can fly");
	}

	@Override
	public void makeSound() {
		System.out.println("Crow makes sound");
	}
	
}
