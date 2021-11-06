package com.umer.oop.abstraction;

public abstract class Animal {
	
	// abstract methods
	public abstract void move();
	public abstract void eat();
	
	// concrete method
	public void label() {
		System.out.println("Animal's data: ");
	}

}
