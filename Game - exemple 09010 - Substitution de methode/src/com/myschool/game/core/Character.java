//Fichier Character.java
package com.myschool.game.core;

public class Character {
	String name;
	int liveScore;
	public void setLiveScore(int liveScore) {
		this.liveScore = liveScore;
   }
	public void disBonjour(Character character) {
		System.out.println(this.name + ": Bonjour " + character.name + "!");
   }
	public void disBonjour() {
		System.out.println(this.name + ": Bonjour tout le monde!");
   }
}
