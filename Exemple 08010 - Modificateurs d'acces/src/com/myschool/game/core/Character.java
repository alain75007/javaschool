//Fichier Character.java
package com.myschool.game.core;

public class Character {
	String name;
	int lifePoints;
	public void setLiveScore(int liveScore) {
		this.lifePoints = liveScore;
    }
	public int getLiveScore() {
		return this.lifePoints;
	}
	void disBonjour(Character character) {
		System.out.println(this.name + ": Bonjour " + character.name + "!");
   }
	void disBonjour() {
		System.out.println(this.name + ": Bonjour tout le monde!");
	}
}
