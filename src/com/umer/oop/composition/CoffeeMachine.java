package com.umer.oop.composition;

public class CoffeeMachine {
	
	private Grinder grinder;
	private Brewer brewer;
	
	public CoffeeMachine() {
		this.grinder=new Grinder();
		this.brewer=new Brewer();
	}

}
