package com.umer.oop.ploymorphism.statically.usage;

import com.umer.oop.ploymorphism.statically.Bird;

public class TestBird {
	public static void main(String[] args) {
		Bird testBird = new Bird();
		testBird.fly();
		testBird.fly(3);
		testBird.fly(3, "Eagle");
	}

}
