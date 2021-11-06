package com.umer.oop.interfaces.usage;

import com.umer.oop.interfaces.Bird;
import com.umer.oop.interfaces.implementation.Eagle;

public class TestEagle {

	public static void main(String[] args) {
		Eagle eagle=new Eagle();
		eagle.eat();
		eagle.fly();
		eagle.sound();
		System.out.println("Number of legs: "+Bird.numberOfLegs);
		System.out.println("Outer Covering: "+ Bird.outerCovering);
	}

}
