package com.umer.oop.encapsulation.usage;

import com.umer.oop.encapsulation.Animal;

public class TestAnimal {

	public static void main(String[] args) {
		Animal testAnimal = new Animal();
		
		testAnimal.setAverageWeight(1.5);
		testAnimal.setName("Eagle");
		testAnimal.setNumberOfLegs(2);

		System.out.println("The name of the animal is: " + testAnimal.getName());
		System.out.println("The number of legs are: " + testAnimal.getNumberOfLegs());
		System.out.println("The average weight is: " + testAnimal.getAverageWeight());
	}

}
