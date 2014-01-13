// Fichier Game.java
package com.myschool.game.core;

public class Game {

	public static void main(String[] args) {
		int CharacterCount = 0;
		Character character1 = new Character("Maxime");
		// character1.setLiveScore(10);
		CharacterCount++;
		Character character2 = new Character("Alpha", 11);
		// character2.setLiveScore(11);
		CharacterCount++;
		System.out.println("Nombre de personnages : " + CharacterCount);
		character1.disBonjour();
		character2.disBonjour(character1);
		System.out.println(character1.getName() + " : J'ai "
				+ character1.getLiveScore() + " points de vie!");
		System.out.println(character2.getName() + " : J'ai "
				+ character2.getLiveScore() + " points de vie!");
	}
}
