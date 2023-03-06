package com.solid.dip;

public abstract class Bird {
	
	/**
	 * 
	 * This is a common behaviour across all the implementations of Bird
	 * All Birds can eat
	 * 
	 * */
	public void eat() {
		System.out.println("Can eat food");
	}

	//protected abstract void fly();
}
