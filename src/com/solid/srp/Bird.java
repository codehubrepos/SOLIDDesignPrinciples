package com.solid.srp;

/**
 * 
 * Single Responsibility Principle - SRP is being violated here
 * The Bird class is responsible for various operations
 * There are multiple reasons to change this class 
 * 
 * */

public class Bird {

	private String name;
	private String type;
	private int noOfWings;
	private double weight;
	private String color;
	
		public void fly() {
			// Implementation of fly
		}
	
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
	
	public boolean dance() {
		
		boolean isDance=false;
		
		if("Peacock".equals(type)) {
			isDance = true;
		}
		if("Crow".equals(type)) {
			isDance = false;
		}
		
		if("Kuckoo".equals(type)) {
			isDance = false;
		}
		
		if("Sparrow".equals(type)) {
			isDance = false;
		}
		return isDance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfWings() {
		return noOfWings;
	}

	public void setNoOfWings(int noOfWings) {
		this.noOfWings = noOfWings;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}

