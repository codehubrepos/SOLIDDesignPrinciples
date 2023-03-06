package com.solid.ocp;


/**
 * 
 * Open Closed Principle - OCP is being followed here
 * The Bird class can be considered as open for extension and closed for any modification.
 * Any requirement for new Bird Type coming in future can be taken care via new class extends the Bird class
 * 
 * 
 * 
 * However with this design we have to either do a blank implementation of fly/dance methods or throw exception
 * an exception for the Birds who don't inhibit fly or dance behaviour.
 * i.e. we are bound to inherit the behaviour like fly/dance which a particular bird does not performs
 * 
 * This implementation needs further refinement
 * 
 * */
public abstract class Bird {
	
	public abstract void fly();
	
	public abstract void makeSound();
	
	public abstract void dance();

}
