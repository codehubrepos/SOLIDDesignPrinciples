package com.solid.isp;


/**
 * 
 * Interface Segregation Principle - ISP is being followed here
 * Instead of having a big fat interface there is a segregation on behaviour's
 * 
 * Only related behaviour's needs to be combined in an interface
 * Try to keep the interface as small as possible, only combine related behaviour
 * 
 * 
 * */
//This should be avoided instead of a big fat Interface should prefer segregated interfaces
//public class Sparrow extends Bird implements FlyDance {
public class Sparrow extends Bird implements Flyable, Danceable { 

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
		System.out.println("Sparrow can fly");
	}

	@Override
	public void dance() {
		System.out.println("Sparrow can dance");
	}

}
