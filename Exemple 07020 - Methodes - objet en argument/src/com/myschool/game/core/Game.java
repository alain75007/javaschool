// Fichier Game.java
package com.myschool.game.core;
public class Game {

	public static void main(String[] args) {
		int CharacterCount = 0;
        Character character1   = new Character();
        CharacterCount++;
        character1.name = "Maxime";
        Character character2 = new Character();
        CharacterCount++;
        character2.name = "Alpha";
        System.out.println("Nombre de personnages : " + CharacterCount);
        character1.disBonjour();
        character1.setLiveScore(10);
	}
}

