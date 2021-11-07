package com.umer.oop.encapsulation;

public class Animal {
	
	private String name;
	private double averageWeight;
	private int numberOfLegs;
	
	// getters
	public String getName() {
		return this.name;
	}
	public double getAverageWeight() {
		return this.averageWeight;
	}
	public int getNumberOfLegs() {
		return this.numberOfLegs;
	}
	
	// setter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setAverageWeight(double averageWeight) {
		this.averageWeight = averageWeight;
	}
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	
	

}
