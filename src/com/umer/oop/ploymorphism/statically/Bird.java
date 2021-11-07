package com.umer.oop.ploymorphism.statically;

public class Bird {

	public void fly() {
		System.out.println("The Bird is flying.");
	}

	public void fly(int height) {
		System.out.println("The Bird is flying at " + height + " kilometers high.");
	}

	public void fly(int height, String name) {
		System.out.println("The " + name + " is flying at " + height + " kilometers high.");
	}

}
