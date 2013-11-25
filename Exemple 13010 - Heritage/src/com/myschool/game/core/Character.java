//Fichier Character.java
package com.myschool.game.core;

public class Character {
	static private int characterCount = 0;
	static final String femaleImg = "female.png";
	static final String male = "male.png"

	private String image = "personnage.png";
	private String image = ""
	private String name;
	private int lifePoints = 10;

	public Character(String name) { // CONSTRUCTOR
		System.out.println("Création d'un nouveau " + getClass().getName());
		characterCount++;
		this.name = name;
	}
	public Character(String name, int lifePoints) { // CONSTRUCTOR
		this(name);
		this.lifePoints = lifePoints;
	}

	public static int getCharacterCount() { // GETTER STATIQUE
		return characterCount;
	}	
	public String getName() {
		return name;
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
