// Fichier Game.java
package com.myschool.game.core;
public class Game {
	public static void main(String[] args) {
		int CharacterCount = 0;
        Character character1   = new Character();
        character1.name = "Maxime";
        CharacterCount++;
        Character character2 = new Warrior();
        character2.name = "Alpha";
        CharacterCount++;
        System.out.println("Nombre de personnages : " + CharacterCount);
        character2.disBonjour();
        character1.disBonjour(character2);
        System.out.println("Moi, " + character2.name + "!, j'ai " + character2.liveScore + " points de vie!");
	}
}