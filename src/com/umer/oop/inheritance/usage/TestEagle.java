package com.umer.oop.inheritance.usage;

import com.umer.oop.inheritance.extension.Eagle;

public class TestEagle {

	public static void main(String[] args) {
		Eagle testEagle = new Eagle();
		System.out.println("Name: " + testEagle.name);
		System.out.println("Reproduction: " + testEagle.reproduction);
		System.out.println("Outer covering: " + testEagle.outerCovering);
		System.out.println("Lifespan: " + testEagle.lifespan);

		testEagle.flyingUp();
		testEagle.flyingDown();
	}

}
