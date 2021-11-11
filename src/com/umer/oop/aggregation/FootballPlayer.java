package com.umer.oop.aggregation;

public class FootballPlayer {

	private String name;
	private Football football;
	
	public FootballPlayer(String name, Football football) {
		super();
		this.name = name;
		this.football = football;
	}

	public String getName() {
		return this.name;
	}

	public Football getFootball() {
		return this.football;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFootball(Football football) {
		this.football = football;
	}
	
	
	
	
}
