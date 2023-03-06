package com.solid.dip;

public class Piegon extends Bird implements Flyable {

	/**
	 * 
	 * Either implement the eat() method or take the behavior of Bird class
	 * 
	 * */
	public void eat() {
		//TODO - Implement as per need
	}
	
	@Override
	public void fly() {
		FlyType f = new FlyMedium();
		f.makeFlyByType();
	}

}
