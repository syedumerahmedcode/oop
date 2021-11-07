package com.umer.oop.ploymorphism.dynamically.usage;

import com.umer.oop.ploymorphism.dynamically.Animal;
import com.umer.oop.ploymorphism.dynamically.extension.Bird;

public class TestBird {
	public static void main(String[] args) {
		Animal testAnimal=new Animal();
		testAnimal.eat();
		
		Bird testBird=new Bird();
		testBird.eat();
	}
}
