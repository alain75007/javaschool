//Fichier Character.java
package com.myschool.game.core;

public class Character {
	private String name;
	private int lifePoints;
	public void setLiveScore(int liveScore) {
		this.lifePoints = liveScore;
    }
	public int getLiveScore() {
		return this.lifePoints;
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
