package com.umer.oop.abstraction.extension;

import com.umer.oop.abstraction.Animal;

public class Bird extends Animal{

	@Override
	public void move() {
		System.out.println("Moves by flying");
		
	}

	@Override
	public void eat() {
		System.out.println("Eats birdfood.");
	}
	
	

}
