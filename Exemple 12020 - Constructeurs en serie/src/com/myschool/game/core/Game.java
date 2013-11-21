// Fichier Game.java
package com.myschool.game.core;
public class Game {
	public static void main(String[] args) {
		int CharacterCount = 0;
        Character character1   = new Character();
        character1.setName("Maxime");
        CharacterCount++;
        Character character2 = new Warrior();
        character2.setName("Alpha");
        CharacterCount++;
        System.out.println("Nombre de personnages : " + CharacterCount);
        character2.disBonjour();
        character1.disBonjour(character2);
        System.out.println(character2.getName() + " : j'ai " + character2.getLiveScore() + " points de vie!");
	}
}