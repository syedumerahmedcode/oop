package com.umer.oop.abstraction;

public class Fish extends Animal{

	@Override
	void move() {
		System.out.println("Moves by swimming.");
	}

	@Override
	void eat() {
		System.out.println("Eats sea food.");
	}

}
