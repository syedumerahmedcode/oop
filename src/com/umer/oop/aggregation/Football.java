package com.umer.oop.aggregation;

public class Football {
	
	private String type, size, weight;

	public Football(String type, String size, String weight) {
		super();
		this.type = type;
		this.size = size;
		this.weight = weight;
	}

	public String getType() {
		return this.type;
	}

	public String getSize() {
		return this.size;
	}

	public String getWeight() {
		return this.weight;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	

}
