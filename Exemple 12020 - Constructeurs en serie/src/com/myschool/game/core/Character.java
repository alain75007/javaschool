//Fichier Character.java
package com.myschool.game.core;
public class Character {
	private String name;
	private int liveScore;
	public Character() {
		System.out.println("Cr�ation d'un personnage");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLiveScore() {
		return liveScore;
	}
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
