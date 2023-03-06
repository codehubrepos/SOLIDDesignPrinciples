package com.solid.lsp;

import com.solid.lsp.exception.FlyException;

public class Penguin extends Bird {

	@Override
	public void fly() {
		throw new FlyException("Penguin can't fly");
	}

	@Override
	public void makeSound() {
		System.out.println("Penguin makes sound");
	}

}
