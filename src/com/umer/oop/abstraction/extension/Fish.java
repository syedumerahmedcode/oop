package com.umer.oop.abstraction.extension;

import com.umer.oop.abstraction.Animal;

public class Fish extends Animal{

	@Override
	public void move() {
		System.out.println("Moves by swimming.");
	}

	@Override
	public void eat() {
		System.out.println("Eats sea food.");
	}

}
