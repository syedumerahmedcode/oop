package com.umer.oop.abstraction.usage;

import com.umer.oop.abstraction.Animal;
import com.umer.oop.abstraction.extension.Bird;

public class TestBird {

	public static void main(String[] args) {
		Animal myBird = new Bird();
		myBird.label();
		myBird.move();
		myBird.eat();
	}
}
