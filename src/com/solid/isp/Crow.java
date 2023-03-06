package com.solid.isp;

public class Crow extends Bird implements Flyable {

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
		System.out.println("Crow can fly");
	}

}
