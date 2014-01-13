// Fichier Game.java
package com.myschool.game.core;
public class Game {

	public static void main(String[] args) {
		int CharacterCount = 0;
        Character character1   = new Character();
        character1.name = "Maxime";
        character1.setLiveScore(10);
        CharacterCount++;
        Character character2 = new Character();
        character2.name = "Alpha";
        character2.setLiveScore(11);
        CharacterCount++;
        System.out.println("Nombre de personnages : " + CharacterCount);
        character1.disBonjour(character2);
	}
}

