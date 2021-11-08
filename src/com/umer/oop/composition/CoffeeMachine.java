package com.umer.oop.composition;

public class CoffeeMachine {
	
	private Grinder grinder;
	private Brewer brewer;
	
	public CoffeeMachine() {
		this.grinder=new Grinder();
		this.brewer=new Brewer();
	}


	public void prepareCoffee() {
		System.out.println("Initializing steps for preparing coffee:");
		this.grinder.grind();
		this.brewer.brew();
	}

}
