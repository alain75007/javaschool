// Fichier Game.java
package com.myschool.game.core;
public class Game {
	public static void main(String[] args) {
		int playerCount = 0;
        Character character1   = new Character();
        Character character2 = new Warrior();
        character1.setName("Maxime");
        playerCount++;
        character2.setName("Alpha");
        playerCount++;
        System.out.println("Nombre de personnages : " + playerCount);
        character2.disBonjour();
        character1.disBonjour(character2);
        System.out.println(character2.getName() + " : j'ai " + character2.getLiveScore() + " points de vie!");
	}
}