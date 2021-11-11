package com.umer.oop.aggregation.usage;

import com.umer.oop.aggregation.Football;
import com.umer.oop.aggregation.FootballPlayer;

public class Uasge {
	
	public static void main(String[] args) {
		
		Football football=new Football("Association football", "70 cm", "480 gm");
		FootballPlayer footballPlayer=new FootballPlayer("Bob", football);
		footballPlayer.plays();		
	}

}
