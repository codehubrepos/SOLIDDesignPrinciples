package com.solid.srp;


/**
 * 
 * Single Responsibility Principle - SRP is being followed here
 * The Bird class is responsible for single operation i.e. make sound
 * There is only 1 reason to change this class, if there is a requirement of any new Bird Type
 * However this voilates the OCP - i.e the class is open for modification
 * 
 * */

public class BirdSRP {

	private String name;
	private String type;
	private int noOfWings;
	private double weight;
	private String color;
	
	public void makeSound() {
		if("Crow".equals(type)) {
			System.out.println("Kao Kao");
		}
		
		if("Kuckoo".equals(type)) {
			System.out.println("Ku ku");
		}
		
		if("Sparrow".equals(type)) {
			System.out.println("Chi Chi");
		}
	}
}
