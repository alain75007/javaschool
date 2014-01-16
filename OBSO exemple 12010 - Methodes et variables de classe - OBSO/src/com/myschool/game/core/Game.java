// Fichier Game.java
package com.myschool.game.core;
public class Game {
	public static void main(String[] args) {
		int characterCount = 0;
        Character character1   = new Character("Maxime");
        characterCount++;
        Character character2 = new Warrior("Alpha");
        characterCount++;
        Character character3 = new Warrior("Guilhem", "Le terrible");
        characterCount++;
        System.out.println("Nombre de personnages : " + characterCount);
        character2.disBonjour();
        character1.disBonjour(character2);
        System.out.println(character2.getName() + " : j'ai " + character2.getLiveScore() + " points de vie!");
	}
}