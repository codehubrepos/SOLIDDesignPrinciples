package com.solid.lsp;

import com.solid.lsp.exception.FlyException;

public class Peacock extends Bird {

	@Override
	public void fly() {
		throw new FlyException("Peacock can't fly"); 
	}

	@Override
	public void makeSound() {
		System.out.println("Peacock makes sound");
	}

}
