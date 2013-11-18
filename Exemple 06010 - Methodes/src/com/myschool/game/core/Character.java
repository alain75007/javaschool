//Fichier Character.java
package com.myschool.game.core;

public class Character {
	String name;
	int liveScore;
	public void setLiveScore(int liveScore) {
		this.liveScore = liveScore;
		this.name = "Maxime";
   }
	public void disBonjour(Character character) {
		System.out.println(this.name + ": Bonjour " + character.name + "!");
		this.name = "Maxime";
   }
}
