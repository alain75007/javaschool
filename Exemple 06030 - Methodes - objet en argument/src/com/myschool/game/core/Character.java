//Fichier Character.java
package com.myschool.game.core;

public class Character {
	String name;
	int liveScore;
	public void setLiveScore(int liveScore) {
		this.liveScore = liveScore;
   }
	public void disBonjour(Character character2) {
		System.out.println(name + ": Bonjour " + character2.name);	
	}
}
