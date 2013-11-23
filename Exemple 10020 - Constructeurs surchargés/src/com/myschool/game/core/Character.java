//Fichier Character.java
package com.myschool.game.core;

public class Character {

	private String name;
	private int lifePoints;

	public Character() { // CONSTRUCTOR
		System.out.println("Création d'un nouveau personnage");
	}
	public Character(String string) {
		this();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLifePoints() {
		return lifePoints;
	}
	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}
	public void setLiveScore(int liveScore) { // OBSOLETE use setLifePoints instead
		this.setLifePoints(liveScore);
	}
	public int getLiveScore() { // OBSOLETE use getLifePoints instead
		return this.getLifePoints();
	}

	void disBonjour(Character character) {
		System.out.println(this.name + ": Bonjour " + character.name + "!");
	}

	void disBonjour() {
		System.out.println(this.name + ": Bonjour tout le monde!");
	}
}
