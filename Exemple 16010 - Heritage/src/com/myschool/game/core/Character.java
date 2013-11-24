//Fichier Character.java
package com.myschool.game.core;

public class Character {
	private String name;
	private int lifePoints;
	public int getLifePoints() {
		return lifePoints;
	}
	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}
	public void setLiveScore(int liveScore) {  // OBSOLETE
		this.setLifePoints(liveScore);
    }
	public int getLiveScore() { // OBSOLETE
		return this.getLifePoints();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void disBonjour(Character character) {
		System.out.println(this.name + ": Bonjour " + character.name + "!");
   }
	void disBonjour() {
		System.out.println(this.name + ": Bonjour tout le monde!");
	}
}
