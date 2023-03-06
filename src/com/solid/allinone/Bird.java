package com.solid.allinone;

public abstract class Bird {
	
	private String name;
	private String type;
	private int noOfWings;
	private double weight;
	private String color;
	
	/**
	 * 
	 * This is a common behaviour across all the implementations of Bird
	 * All Birds can eat
	 * 
	 * */
	public void eat() {
		System.out.println("Can eat food");
	}
	
	/**
	 * 
	 * These are specific behaviours across different implementations of Birds
	 * Some Birds cannot fly, some can not dance
	 * 
	 * These behaviors should be defined as Interfaces
	 * 
	 * */
	//public abstract void fly();
	//public abstract void makeSound();
	//public abstract void dance();

}
