//Fichier Character.java
package com.myschool.game.core;

public class Character {

	private String name;
	private int lifePoints;

	public Character() { // CONSTRUCTOR
		System.out.println("Création d'un nouveau personnage");
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
	public void setLiveScore(int liveScore) { // OBSOLETE: utiliser setLifePoints() à la place
		this.setLifePoints(liveScore);
	}
	public int getLiveScore() { // OBSOLETE: utiliser getLifePoints() à la place
		return this.getLifePoints();
	}

	void disBonjour(Character character) {
		System.out.println(this.name + ": Bonjour " + character.name + "!");
	}

	void disBonjour() {
		System.out.println(this.name + ": Bonjour tout le monde!");
	}
}
