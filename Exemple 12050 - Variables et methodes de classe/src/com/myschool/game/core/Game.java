// Fichier Game.java
package com.myschool.game.core;

public class Game {
	protected static final String gameName = "Victoria game";

	public static void main(String[] args) {
		System.out.println(gameName + " démarre...");
		Character character1 = new Character("Maxime");
		Character character2 = new Character("Alpha", 11);
		System.out.println("Nombre de personnages : " + Character.getCharacterCount());
		character1.disBonjour();
		character2.disBonjour(character1);
		System.out.println(character1.getName() + " : J'ai "
				+ character1.getLiveScore() + " points de vie!");
		System.out.println(character2.getName() + " : J'ai "
				+ character2.getLiveScore() + " points de vie!");
	}
}
