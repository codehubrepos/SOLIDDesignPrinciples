package com.solid.isp;

public class Peacock extends Bird implements Danceable {

	/**
	 * 
	 * Either implement the eat() method or take the behavior of Bird class
	 * 
	 * */
	public void eat() {
		//TODO - Implement as per need
	}

	@Override
	public void dance() {
		System.out.println("Peacock can dance");
	}

}
