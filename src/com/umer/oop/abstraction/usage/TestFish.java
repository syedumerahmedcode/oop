package com.umer.oop.abstraction.usage;

import com.umer.oop.abstraction.Animal;
import com.umer.oop.abstraction.extension.Fish;

public class TestFish {

	public static void main(String[] args) {
		Animal myFish = new Fish();
		myFish.label();
		myFish.eat();
		myFish.move();
	}
}
