package com.umer.oop.interfaces.implementation;

import com.umer.oop.interfaces.Animal;
import com.umer.oop.interfaces.Bird;

public class Eagle implements Animal, Bird{

	@Override
	public void fly() {
		System.out.println("Flies upto 10,000 feet.");
	}

	@Override
	public void eat() {
		System.out.println("Eats reptiles and amphibians.");
	}

	@Override
	public void sound() {
		System.out.println("Has a high-pitched whistling sound.");		
	}

}
